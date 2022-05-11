public class BankAccount {

    private String accountName;

    private double accountBalance;

    public BankAccount ( String accountName, double accountBalance) {
        this.accountName= accountName;
        this.accountBalance = accountBalance;
    }

    public double deposit (double depositAmount) {
        return accountBalance += depositAmount;
    }

    public double withdrawal (double withdrawalAmount){
        return accountBalance -= withdrawalAmount;
    }

    public String accountTotal () {
        return "Account: " + accountName +" | " + "Balance: " + accountBalance;
    }
}
