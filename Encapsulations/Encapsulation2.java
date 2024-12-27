class Myclass{

    int x; //imstance attribute
    int y;  //static variable,class Variable,template variable
}






public class Encapsulation2 {
    public static void main(String[] args) {

        Myclass c1=new Myclass();
        c1.x=1;
        c1.y= 2;

        Myclass c2=new Myclass();
        c2.x=5;
        c2.y=8;

        Myclass c3=new Myclass();
        c3.x=80;
        c3.y=900;


        System.out.println("C1"+"-"+c1.x+"--"+c1.y);
        System.out.println("C2"+"-"+c2.x+"--"+c2.y);
        System.out.println("C3"+"-"+c3.x+"--"+c3.y);


    }
}
