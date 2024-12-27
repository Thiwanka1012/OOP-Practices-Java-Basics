class C{
    int c;

    static {

        System.out.println("Static Block C");
    }

    C(){

        System.out.println("C()");
    }

    C(int i){

        System.out.println("C(int i)");
    }

    C(int i,int y){
        System.out.println("C(int i,int y)");
    }
}


class D extends C{
    int d;
    static {
        System.out.println("Stattic block D");
    }

    D(){
        super();
        System.out.println("D()");
    }

    D(int i){
        super(10);
        System.out.println("D(int i)");
    }

    D(int i,int y){
        super(10,20);
        System.out.println("D(int i,int y)");
    }

}



public class Inheritance4 {
    public static void main(String[] args) {
    new D();
        System.out.println("=====================================");
        new D(10);
        System.out.println("=====================================");
        new D(20,40);

    }
}
