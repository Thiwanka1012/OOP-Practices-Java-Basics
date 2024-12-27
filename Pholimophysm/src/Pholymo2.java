class A{
    public void print(){
        System.out.println("Print A");

    }
}

class B extends A{
    public void print(){
        System.out.println("Print B");

    }

 public void callPrint(){
        print();  //from subclass
        super.print(); //from super
 }



}

class C{

}










public class Pholymo2 {
    public static void main(String[] args) {

        B b1=new B();
        // b1.super.print();  This one is Error
        b1.print();
    }
}
