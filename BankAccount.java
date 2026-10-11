class BankAccount {
    String account_holder_name;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.account_holder_name = "Ram";
        account.balance = 1000;

        System.out.println("Account Holder: " + account.account_holder_name);

        account.checkBalance();
        account.deposit(500);
        account.withdraw(300);
        account.checkBalance();
    }
}




/*
================ OUTPUT ================
Account Holder: Ram
Current Balance: 1000.0
Deposited: 500.0
Withdrawn: 300.0
Current Balance: 1200.0
========================================
*/