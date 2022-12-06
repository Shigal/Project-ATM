import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        int atmNumber = 1111;
        int atmPin = 123;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter ATM Number: ");
        int atmNo = input.nextInt();

        System.out.print("Enter PIN: ");
        int pin = input.nextInt();

        if((atmNo == atmNumber) && (pin == atmPin)) {
            System.out.println("Validation Completed!");
        } else{
            System.out.println("Invalid ATM number or PIN");
            System.exit(0);
        }
    }
}
