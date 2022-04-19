package homeworkB;

public class ReturnTypeMethodWithoutParameter {


    public int doAddition() {
        int a = 50;
        int b = 60;
        int c = 30;
        int d = 20;
        int total = a + b + c + d;

        System.out.println("My total addition is : " + total);


        return total;
    }

    public String getFullName() {

        String firstName = "Fouzia";
        String lastName = "Chowdhury";

        System.out.println("My full name is : " + firstName + lastName);

        return firstName + lastName;

    }

    public int doSubtraction() {
        int a = 50;
        int b = 60;
        int c = 30;
        int d = 20;
        int total = c - b;

        System.out.println("My total subtraction is : " + total);

        return total;
    }

    public int doMultiplication() {
        int a = 50;
        int b = 60;
        int c = 30;
        int d = 20;
        int total = a * b * c * d;

        System.out.println("My total Multiplication is : " + total);

        return total;
    }

    public boolean getPrice() {

        boolean price = true;

        System.out.println("My dress price is reasonable :" + price);


        return price;
    }

    public int doDivision() {

        int a = 15;
        int b = 3;

        int total = a / b;

        System.out.println(total);
        return total;

    }


    public double paySalary() {

        double x = 500.369;
        double y = 652.365;
        double z = 90.5214;
        System.out.println("My weekly salary is :" + (x + y + z));

        return x + y + z;
    }

    public int doAverage(){
        int a= 50;
        int b = 25;
        int c = 60;
        System.out.println("Average number is :"+ (a+b+c)/3);
        return (a+b+c)/3;


    }


    public short doSummation(){

      short a = 30000;
      short b = 32000;

      short total = (short) (a+b);

        System.out.println("My summation is :"+ total);
        return total;

    }

    public static void main(String[] args) {


        ReturnTypeMethodWithoutParameter objective = new ReturnTypeMethodWithoutParameter();
        objective.doAddition();
        objective.getFullName();
        objective.doSubtraction();
        objective.doMultiplication();
        objective.getPrice();
        objective.paySalary();
        objective.doDivision();
        objective.doAverage();
        objective.doSummation();

    }


}
