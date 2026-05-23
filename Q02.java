/* Bank Account System. Create a class BankAccount with attributes accountHolderName, accountNumber, and balance. 
Create a constructor to initialize them. Create methods deposit(amount) and withdraw(amount) 
which modify the balance. Show messages if withdrawal amount exceeds balance. */

class BankAccount{
    String accountHolderName;
    int accountNumber;
    double balance;

    BankAccount(String ah, int an, double b){
        this.accountHolderName = ah;
        this.accountNumber = an;
        this.balance = b;
    }

    public double deposit(double amount){
        balance += amount;
        return balance;
    }

    public double withdraw(double amount){
        balance -= amount;
        if(balance < amount){
            System.out.println("Not enough balance.");
        }
        return balance;
        
    }
}

public class Q02 {
    public static void main(String[] args){
        BankAccount account = new BankAccount("Sahil", 210609, 999.99);

        account.deposit(1000); // 1999.99

        account.withdraw(2000);
    }
}

