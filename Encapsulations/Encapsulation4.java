public class Encapsulation4 {
    public static void main(String[] args) {

    Customer1 c1=new Customer1(1,"Thiwanka");
    Customer1 c2=new Customer1();




c2.setCustomer(11,"Kamal");

c1.printCustomer();
c2.printCustomer();
        System.out.println("-----------------------------");

c2.setCustomer(c1);
c1.printCustomer();
c2.printCustomer();


    }
}


class Customer1{

    int id;
    String name;


    Customer1(){
    }

    Customer1(int id,String name){
        this.id=id;
        this.name=name;
    }

    public void printCustomer(){
        System.out.println(id+"-"+name);
    }

    public void setCustomer(int id,String name){
        this.id=id;
        this.name=name;

    }

    public void setCustomer(Customer1 c1){ //method overloading
        this.id=c1.id;
        this.name=c1.name;
    }


}