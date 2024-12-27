class Dog{
    String name;
    int age;


    Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Dog getCopy(){
        Dog d1=new Dog("Pinky",3);
        return d1;
    }
}







public class Example2 {
    public static void main(String[] args) {

        Dog d1=new Dog("Jack", 18);
        Dog d2=d1.getCopy();




        System.out.println(d1==d2);

    }
}
