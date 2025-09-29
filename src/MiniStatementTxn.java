public class MiniStatementTxn extends Transaction {
    public MiniStatementTxn(String accountId) {
        super(accountId, 0);
    }

    @Override
    public void execute(IBankConnector bank) {
        System.out.println(bank.getMiniStatement(accountId, 5));
    }
}