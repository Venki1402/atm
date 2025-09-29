public abstract class Transaction {
    protected String accountId;
    protected int amount;

    public Transaction(String accountId, int amount) {
        this.accountId = accountId;
        this.amount = amount;
    }

    public abstract void execute(IBankConnector bank);
}