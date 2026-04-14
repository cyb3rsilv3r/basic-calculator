import java.util.Scanner;

public class BasicCalculator {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = (int) scanner.nextDouble();

        System.out.println("Enter the second number:");
        int num2 = (int) scanner.nextDouble();
       // make sure to leave buffer for next line
        scanner.nextLine();

        System.out.println("Possible Calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply ");
        System.out.println("(D)ivide");
        System.out.println("Please select an option:");
        String operator = scanner.nextLine();

        System.out.println(num1 + "*" + num2 + "=" + num1*num2);


    }
}
