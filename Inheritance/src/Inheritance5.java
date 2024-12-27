class E{
    int e;
    public void printE(){
        System.out.println("e:"+e);
    }
}

class F extends E{
    int f;
    public void printF(){
        System.out.println("f:"+f);
    }

    public void callPrint(){
        printE();
        printF();
    }

    public void printEF(){
        System.out.println("e:"+e);
        System.out.println("f:"+f);
    }
}


public class Inheritance5 {
    E e1=null;
    e1.e=100;
    e1.f=200;

    e1.pr

}
