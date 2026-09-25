class Teglalap{

    private int a;
    private int b;

    public Teglalap(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int terulet(){
        return a*b;
    }
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
}



public  class Pentek3 {
    static void main(String[] args) {
        Teglalap t1 = new Teglalap(3, 5);
        Teglalap t2 = new Teglalap(t1.getA()*2, t1.getB()*2);
        System.out.println(t2.terulet());


    }
}