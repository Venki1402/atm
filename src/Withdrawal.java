public class Withdrawal extends Transaction {
    public Withdrawal(String accountId, int amount) {
        super(accountId, amount);
    }

    @Override
    public void execute(IBankConnector bank) {
        System.out.println("Withdrawing " + amount);
        bank.postTransaction(this);
    }
}