public class DepositTxn extends Transaction {
    public DepositTxn(String accountId, int amount) {
        super(accountId, amount);
    }

    @Override
    public void execute(IBankConnector bank) {
        bank.deposit(accountId, amount);
    }
}