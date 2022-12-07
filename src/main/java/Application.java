import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        int atmNumber = 1111;
        int atmPin = 1234;

        ATMOperation operation = new ATMOperationImpl();

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.print("Enter ATM Number: ");
        int atmNo = input.nextInt();

        System.out.print("Enter PIN: ");
        int pin = input.nextInt();

        if((atmNo == atmNumber) && (pin == atmPin)) {
            while (true) {
                System.out.println("1. View available balance\n2. Withdraw the money\n" +
                        "3. Deposit the money\n4. View Finance statement\n5. Exit");
                System.out.print("Enter option: ");
                int option = input.nextInt();
                switch (option) {
                    case 1:
                        operation.viewBalance();
                        break;
                    case 2:
                        System.out.print("Enter the amount you want to withdraw: ");
                        double withdrawAmount = input.nextDouble();
                        operation.withdrawAmount(withdrawAmount);
                        break;
                    case 3:
                        System.out.print("Enter the amount you want to deposit: ");
                        double depoAmount = input.nextDouble();
                        operation.depositAmount(depoAmount);
                        break;
                    case 4:
                        operation.viewFinanceStatement();
                        break;
                    case 5:
                        System.out.println("Collect your ATM card, Thank you :)");
                        System.exit(0);
                    default:
                        System.out.println("Please choose valid option");
                        break;
                }
            }
        } else{
            System.out.println("Invalid ATM number or PIN");
            System.exit(0);
        }
    }
}
