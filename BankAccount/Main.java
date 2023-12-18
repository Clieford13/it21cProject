package BankAccount;
public class Main {
            public static void main(String[] args) {
        BankAccount  a=new BankAccount();
    a.setName("clieford rule");
    a.setAge(24);
    a.setAccountNumber(20221086);
    a.deposit(30000.0);
    a.deposit(90000.0);
    a.displaySummary();
    }
}
