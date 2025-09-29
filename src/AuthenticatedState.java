public class AuthenticatedState implements ATMState {
    private final ATM atm;

    public AuthenticatedState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard(Card c) {
        System.out.println("Card already inserted.");
    }

    @Override
    public void enterPin(String p) {
        System.out.println("Already authenticated.");
    }

    @Override
    public void selectTransaction(String type, Object params) {
        Transaction txn = atm.getTransactionFactory().create(type, params);
        atm.setPendingTransaction(txn);
        atm.setState(new ProcessingState(atm));
    }

    @Override
    public void performTransaction(String t, Object p) {
        System.out.println("Select transaction first.");
    }

    @Override
    public void dispenseCash(int a) {
        System.out.println("Select transaction first.");
    }

    @Override
    public void ejectCard() {
        atm.getCardReader().ejectCard();
        atm.setState(new IdleState(atm));
    }
}