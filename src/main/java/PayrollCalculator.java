import java.util.Scanner;
public class PayrollCalculator {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Hours Worked: ");
        double hoursWorked = scanner.nextDouble();

        System.out.println("Enter Pay Rate per hour: ");
        double payRate= scanner.nextDouble();

        //Calculate gross pay
        double grossPay = hoursWorked*payRate;

        System.out.println("Name: "+ name);
        System.out.printf("Gross Pay: $%.2f",grossPay);






    }

}
