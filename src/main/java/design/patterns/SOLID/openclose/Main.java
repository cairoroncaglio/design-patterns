package design.patterns.SOLID.openclose;

public class Main {

    public static void main(String[] args) {
        AccountSavings accountSavings = new AccountSavings(20.0);
        accountSavings.Debitar(1);
        System.out.println(accountSavings.getAmount());

        CurrentAccount currentAccount = new CurrentAccount(20.0);
        currentAccount.Debitar(21);
        System.out.println(currentAccount.getAmount());

        CurrentAccount currentAccount2 = new CurrentAccount(20.0,200.00);
        currentAccount2.Debitar(210);
        System.out.println(currentAccount2.getAmount());
    }
}
