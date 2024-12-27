//Method Overriing
//Different classes,Same method name,Same Parameters.

//Method Overloading
//Same Class,Same method,Different Parameters.


class Animal{
    public void sound(){
        System.out.println("Animal Sound");
    }

}


class Cat extends Animal{
    public void sound(){
        System.out.println("Cat sound");
    }
}













public class Pholymo1 {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.sound();
    }
}
