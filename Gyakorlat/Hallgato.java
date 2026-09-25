//3. óra, kedd 14:00 prog2labor
public class Hallgato {
    private String nev;
    private String nkod; //attributumok
    private double atlag;
    private int evfolyam; 

    public void koszon(){
        System.out.println("Jó napot tanár úr!");
    }

    public void koszon(int n){      //metodusok

        for(int i = 0; i < n;i++){
            System.out.println("Csa-csumi csá");
        }
    }
    public Hallgato(String n, String nk, double a, int e){  //Konstruktor
        this.nev = n;
        this.nkod = nk; //objektum inicializalasa
        this.atlag = a;
        this.evfolyam = e;
    }


    public String getNev(){  //getter
        return this.nev;
    }

    public void setNev(String n){  //setter
        this.nev = n;
    }

    public String getNkod(){
        return this.nkod;
    }

    public void setnkod(String nk){
        this.nkod = nk;
    }

    public double getatlag(){
        return this.atlag;
    }

    public void setatlag(double a){
        this.atlag = a;
    }

    public int getevfolyam(){
        return this.evfolyam;
    }

    public void setevfolyam(int e){
        this.evfolyam = e;
    }

    public String toString(){
        return "Hallgato{" +
                "nev='" + nev + '\'' +
                ", nkod='" + nkod + '\'' +
                ", atlag=" + atlag +
                ", evfolyam=" + evfolyam +
                '}';
}
}