package homeworkB;

public class NonReturnTypeWithParameter {

    public void doAddition(int a, int b, int c, int d, int e, int f, int g) {
        int subTotal = a + b + c + d + e + f + g;
        System.out.println("The grand total of these integer value is :" + subTotal);

    }

    private void doSubtraction(int o, int p) {
        System.out.println("The difference between this two integer value is :" + (o - p));

    }

    protected void doMultiplication(byte x, byte y, byte z, byte o) {
        System.out.println("The dynamic result is: " + x * y * z * o);

    }

    private void printInformation(String firstName, String lastName) {
        System.out.println("My full name is :" + (firstName + " " + lastName));

    }

    protected void justPrint(){

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    }

    private void doDivision(int g, int h){
        System.out.println("The result of division is :"+ g/h);
    }

    public static void main(String[] args) {
        NonReturnTypeWithParameter object = new NonReturnTypeWithParameter();
        object.doAddition(2, 2, 1, 9, 8, 6, 2);
        object.doSubtraction(60, 50);
        object.doMultiplication((byte) 1, (byte) 2, (byte) 1, (byte) 1);
        object.printInformation("Fouzia", "Chowdhury");
        object.justPrint();
        object.doDivision(575,25);


    }


}
