public class BankMain {
    public static void main(String[] args) {
        //Deposit
        BankAccount accountOne = new BankAccount("Winry", 500);
        accountOne.deposit(100);
        System.out.println(accountOne.accountTotal());
        //Transfer
        BankAccount accountTwo = new BankAccount("Alphonse", 5000);
        BankAccount accountThree = new BankAccount("Edward", 300);

        accountTwo.withdrawal(100);
        accountThree.deposit(100);

        System.out.println(accountTwo.accountTotal());
        System.out.println(accountThree.accountTotal());

    }
}