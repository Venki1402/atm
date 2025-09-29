public class ProcessingState implements ATMState {
    private final ATM atm;

    public ProcessingState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard(Card c) {
        System.out.println("Processing current transaction.");
    }

    @Override
    public void enterPin(String p) {
        System.out.println("Already authenticated.");
    }

    @Override
    public void selectTransaction(String t, Object p) {
        System.out.println("Transaction in progress.");
    }

    @Override
    public void performTransaction(String t, Object params) {
        Transaction txn = atm.getPendingTransaction();
        if (txn != null) {
            txn.execute(atm.getBankConnector());
            System.out.println("Transaction complete: " + txn.getClass().getSimpleName());
        }
        atm.setState(new AuthenticatedState(atm));
    }

    @Override
    public void dispenseCash(int amt) {
        System.out.println("Handled by transaction.");
    }

    @Override
    public void ejectCard() {
        System.out.println("Wait for transaction completion.");
    }
}