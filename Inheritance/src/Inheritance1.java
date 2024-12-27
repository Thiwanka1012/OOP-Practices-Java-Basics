import javax.swing.*;

class Calculator extends JFrame {   //Inherit


    private JButton yesButton;  //Attribute,Reference Variable
    private JButton noButton;

    private JButton enterButton;

    Calculator(){
        setSize(400,400);
        setTitle("Calculator");
        yesButton=new JButton("Yes");
        add("North",yesButton);

        enterButton=new JButton("Enter");
        add("Center",enterButton);

        noButton=new JButton("NO");
        add("South",noButton);



    }
}



















public class Inheritance1 {
    public static void main(String[] args) {

        Calculator c=new Calculator();
        c.setSize(400,500);
        c.setTitle("Cal");
        c.setVisible(true);
    }
}




