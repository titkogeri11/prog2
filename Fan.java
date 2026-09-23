
import java.lang.constant.Constable;


public class Fan{

    Constable SLOW = 1;
    Constable MEDIUM = 2;
    Constable FAST = 3;

    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";


    Fan(){      //konstruktor
        this.speed = 1;
        this.on = true;
        this.radius = 5;
        this.color = "black";
    }

    public boolean equals(String c1, String c2, int r1, int r2){
        return (c1.equals(c2) && r1 == r2);
    }


}