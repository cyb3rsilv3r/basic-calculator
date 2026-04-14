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

        if(hoursWorked>40){
            double  overTime = hoursWorked-40;
            double overtimePay = payRate*1.5;
            double totalOverpay = overtimePay * overTime;
            System.out.printf("Gross Pay including Overtime: $%.2f",totalOverpay);

        }






    }

}
