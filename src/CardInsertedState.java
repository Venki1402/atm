public class CardInsertedState implements ATMState {
    private final ATM atm;

    public CardInsertedState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard(Card card) {
        System.out.println("Card already inserted.");
    }

    @Override
    public void enterPin(String pin) {
        if (atm.getBankConnector().authorize(atm.getCurrentCard().getCardNumber(), pin, 0).isAuthorized()) {
            System.out.println("PIN correct.");
            atm.setState(new AuthenticatedState(atm));
        } else {
            System.out.println("Invalid PIN.");
        }
    }

    @Override
    public void selectTransaction(String t, Object p) {
        System.out.println("Enter PIN first.");
    }

    @Override
    public void performTransaction(String t, Object p) {
        System.out.println("Enter PIN first.");
    }

    @Override
    public void dispenseCash(int amt) {
        System.out.println("Enter PIN first.");
    }

    @Override
    public void ejectCard() {
        atm.getCardReader().ejectCard();
        atm.setState(new IdleState(atm));
    }
}