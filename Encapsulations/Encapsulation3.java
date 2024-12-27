public class Encapsulation3 {
    public static void main(String[] args) {

        Myclass1 m1=new Myclass1();
        System.out.println("------------------------");
        Myclass1 m2=new Myclass1();

    }
}


class Myclass1{

    int x=100;
    static int y=200;

    Myclass1(){
        System.out.println("Constructor");
    }

    static {
        System.out.println("Static Block");
    }

    {
        System.out.println("Instance Block");
    }

    public void instanceMethod(){
        System.out.println("Instance Method");
    }


}


