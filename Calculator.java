import java.util.*;

public class practice1 {
    public static void main(String args []){ 
        Scanner operator = new Scanner(System.in);
            System.out.println("\n\nEnter the Airthmatic Calculation");
            System.out.println("1-Addition");
            System.out.println("2-Subtraction");
            System.out.println("3-Multiplication");
            System.out.println("4-Division");
            System.out.println("--------------------------------------------------");
            System.out.println("Enter the choice");
            int c = operator.nextInt();
            System.out.println("---------------------------------------------------");
            System.out.println("Enter the 2 values to perform Calculation");
            float a = operator.nextFloat();
            float b = operator.nextFloat();
            System.out.println("---------------------------------------------------");
            // Code for choosing menu. 
            switch (c) {
                case 1:
                    float k = add(a,b);
                    System.out.println(k);
                    break;
                case 2:
                    float d = subtract(a,b);
                    System.out.println(d);
                    break;
                case 3:
                    float e = multiply(a, b);
                    System.out.println(e);
                    break;
                case 4:
                    float f = divide(a, b);
                    System.out.println(f);
                    break;
                default :
                    break;
            }
            System.out.println("---------------------------------------------------");
        }
        // function to Calculate values of Airthmatic Operations. 
    static float add(float a, float b){
        float sum;
        sum = a+b;
        return sum;
    }
    static float multiply(float a, float b){
        float mul;
        mul = a*b;
        return mul;
    }
    static float divide (float a, float b){
        float div;
        div = a/b;
        return div;
    }
    static float subtract(float a, float b){
        float sub;
        sub = a-b;
        return sub;
    }
}
