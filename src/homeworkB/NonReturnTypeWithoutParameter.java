package homeworkB;

public class NonReturnTypeWithoutParameter {


    public void display() {


        System.out.println("This is a display method which is no return type !");


    }
    public void printing(){

        System.out.println("***********************************");
    }


    public void doAddition(){

        int age1 = 50;
        int age2 = 60;
        int totalAge = age1+age2;
        System.out.println("Total age addition is : "+ totalAge);


    }

    public void doSubtraction(){

        double salary1 = 500.96584;
        double salary2 = 600.36521;
        double difference = salary2-salary1;
        System.out.println("The difference between salaries is : "+difference);
        System.out.printf("The difference between salaries is : "+"$ %.2f\n",+difference);

    }
public void printing1(){
    System.out.println("!@#$%^&*!@#$%^!@#$!@#$!@#$");


}

    public static void main(String[] args) {

        NonReturnTypeWithoutParameter object = new NonReturnTypeWithoutParameter();
        object.display();
        object.printing();
        object.doAddition();
        object.doSubtraction();
        object.printing1();
    }
}
