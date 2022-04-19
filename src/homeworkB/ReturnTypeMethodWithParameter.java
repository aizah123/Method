package homeworkB;

public class ReturnTypeMethodWithParameter {


    public String getInformation(String name) {

        System.out.println("My name is :" + name);


        return name;
    }

    public int doAddition ( int a , int b,int c, int d, int e ){

        int total = a+b+c+d+e;
        System.out.println("My total addition is : "+ total);

        return total;

        }


    public int doSubtraction(int x, int y){
        int total1 = (x-y);

        System.out.println("My subtraction result is :"+ total1);
        return total1;


    }


    public int doDivision (int number1, int number2){
        int result = number1/number2;
        System.out.println("The division result is :" + number1/number2);
        return result;

    }

    public int doMultiplication( int u, int v, int w, int o, int p){
       int total = (u*v*w*o*p);
        System.out.println("The result from the multiplication would be :" + total);
        return total;


    }


    public static void main(String[] args) {

        ReturnTypeMethodWithParameter obj = new ReturnTypeMethodWithParameter();
        obj.getInformation("Fouzia");
        obj.doAddition(30, 80, 90,10,80);
        obj.doSubtraction(50,60);
        obj.doDivision(125,25);
        obj.doMultiplication(2,3,4,5,6);


    }
}
