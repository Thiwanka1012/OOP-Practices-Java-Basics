class Value{
    int a;

    Value(int a) {
        this.a = a;
    }

}

class ChangeValue{
    public static void increment(Value v){
        v.a++;
    }

}
public class Example {
    public static void main(String[] args) {
        Value v1= new Value(100);
        System.out.println(v1.a); //100

        ChangeValue.increment(v1);
        System.out.println(v1.a);
    }
}
