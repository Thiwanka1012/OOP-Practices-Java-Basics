class Customer{
    private String name;
    private double salary;

public void setName(String name){
    this.name=name;

}

public void setSalary(double salary){
    if(salary>0){
        this.salary=salary;
    }else {
        this.salary=-salary;
    }
}

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }
}







public class Encapsulation1 {
    public static void main(String[] args) {

        Customer c1=new Customer();
        c1.setName("Thiwanka");
        c1.setSalary(-500000);


        System.out.println(c1.getName()+"---"+c1.getSalary());
        System.out.println(" ඉතිං කොහොමද කියන්නනකෝ\n");
    }
}
