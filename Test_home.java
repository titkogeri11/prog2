public class Test_home {
    
    public static void main(String[] args) {
        
        Fan f1 = new Fan();
        Fan f2 = new Fan();

        f1.setSpeed(3);
        f1.setRadius(10);
        f1.setColor("yellow");
        f1.setOn(true);

        f2.setSpeed(2);
        f2.setRadius(5);
        f2.setColor("blue");
        f2.setOn(false);

        f1.toString();
        f2.toString();

    

        
        
    }

}