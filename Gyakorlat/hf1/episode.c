#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define STATE_FILE ".up_state"
#define MAX_EPISODE 10

static int read_episode(void)
{
    FILE *state = fopen(STATE_FILE, "r");
    int episode = 0;

    if (state != NULL) {
        if (fscanf(state, "%d", &episode) != 1) {
            episode = 0;
        }
        fclose(state);
    }

    return episode;
}

static int write_episode(int episode)
{
    FILE *state = fopen(STATE_FILE, "w");

    if (state == NULL) {
        perror(STATE_FILE);
        return 0;
    }

    fprintf(state, "%d\n", episode);
    fclose(state);
    return 1;
}

int main(int argc, char *argv[])
{
    int current_episode;
    int next_episode;
    char current_name[32];
    char next_name[32];

    if (argc > 2 || (argc == 2 && strcmp(argv[1], "up") != 0)) {
        fprintf(stderr, "Használat: %s [up]\n", argv[0]);
        return EXIT_FAILURE;
    }

    current_episode = read_episode();
    next_episode = current_episode + 1;

    if (next_episode > MAX_EPISODE) {
        fprintf(stderr, "Már létrejött a seen_10 fájl.\n");
        return EXIT_FAILURE;
    }

    snprintf(next_name, sizeof(next_name), "seen_%02d", next_episode);

    if (current_episode == 0) {
        FILE *file = fopen(next_name, "w");

        if (file == NULL) {
            perror(next_name);
            return EXIT_FAILURE;
        }
        fclose(file);
    } else {
        snprintf(current_name, sizeof(current_name), "seen_%02d", current_episode);
        if (rename(current_name, next_name) != 0) {
            perror("Átnevezés");
            return EXIT_FAILURE;
        }
    }

    if (!write_episode(next_episode)) {
        return EXIT_FAILURE;
    }

    printf("%s\n", next_name);
    return EXIT_SUCCESS;
}

