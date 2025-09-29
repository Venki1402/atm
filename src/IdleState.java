public class IdleState implements ATMState {
    private final ATM atm;

    public IdleState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard(Card card) {
        System.out.println("Card inserted: " + card.getCardNumber());
        atm.setCurrentCard(card);
        atm.setState(new CardInsertedState(atm));
    }

    @Override
    public void enterPin(String pin) {
        System.out.println("Insert card first.");
    }

    @Override
    public void selectTransaction(String t, Object p) {
        System.out.println("Insert card first.");
    }

    @Override
    public void performTransaction(String t, Object p) {
        System.out.println("Insert card first.");
    }

    @Override
    public void dispenseCash(int amt) {
        System.out.println("Insert card first.");
    }

    @Override
    public void ejectCard() {
        System.out.println("No card to eject.");
    }
}