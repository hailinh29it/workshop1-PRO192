
import java.util.Scanner;

public class Part2 {

    public static void main(String[] args) {
        // call          
        operator();
    }

    public static void operator() {
        double num1 = 0, num2 = 0;
        double check = 0;
        String op;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number 1: ");
        num1 = Double.parseDouble(sc.nextLine());
        // use try catch to require user input num 2 is not 0
        do {
            try {
                System.out.println("Input number 2 with number 2 other than 0");
                System.out.print("Input the number 2: ");
                num2 = Double.parseDouble(sc.nextLine()); // clear the " Enter " 
                //sign in the Heap memory
                //Reassign the value to test by variable check.
                check = num2; 
            } catch (Exception e) {
                // output bug if user enter 0 in num 2.
                System.out.println(e);
                System.out.println("Please! Input number 2 other than 0");
            }
        } while (check == 0); // check and exit loop if user
        // right enter.

        System.out.println("Input the operator (+,-,*,/): ");
        op = sc.nextLine();
        if (op.equals("+")) {
            System.out.println("the result of num1 + num2 is: " + num1 + " + " + num2 + " = " + (num1 + num2));
        } else if (op.equals("-")) {
            System.out.println("the result of num1 - num2 is: " + num1 + " - " + num2 + " = " + (num1 - num2));
        } else if (op.equals("*")) {
            System.out.println("the result of num1 * num2 is: " + num1 + " * " + num2 + " = " + (num1 * num2));
        } else if (op.equals("/")) {
            System.out.println("the result of num1 / num2 is: " + num1 + " / " + num2 + " = " + (num1 / num2));
        }else
            // the user enters other operators that are in the case
            System.out.println("Don't have case for operator ");
    }
}
