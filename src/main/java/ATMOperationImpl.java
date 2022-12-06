import java.util.HashMap;
import java.util.Map;

public class ATMOperationImpl implements ATMOperation{

    ATM atm = new ATM();
    Map<Double, String> statement = new HashMap<>();

    @Override
    public void viewBalance() {
        System.out.println("Available balance is : " + atm.getBalance());
    }

    @Override
    public void withdrawAmount(double amount) {
        if(amount % 500 == 0) {
            if(amount > atm.getBalance()) {
                System.out.println("You don't have enough balance in your account!");
            }else{
                statement.put(amount, " Withdrawn");
                atm.setBalance(atm.getBalance() - amount);
                System.out.println("Collect the amount " + amount);
            }
            viewBalance();
        }
        System.out.println("Please enter multiple of 500!");
    }

    @Override
    public void depositAmount(double amount) {
        statement.put(amount, " Deposited");
        atm.setBalance(atm.getBalance() + amount);
        System.out.println("Deposited amount is " + amount);
        viewBalance();
    }

    @Override
    public void viewFinanceStatement() {
        for(Map.Entry<Double, String> m: statement.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
