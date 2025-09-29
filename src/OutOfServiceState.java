public class OutOfServiceState implements ATMState {
    private final ATM atm;

    public OutOfServiceState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard(Card c) {
        System.out.println("ATM out of service.");
    }

    @Override
    public void enterPin(String p) {
        System.out.println("ATM out of service.");
    }

    @Override
    public void selectTransaction(String t, Object p) {
        System.out.println("ATM out of service.");
    }

    @Override
    public void performTransaction(String t, Object p) {
        System.out.println("ATM out of service.");
    }

    @Override
    public void dispenseCash(int amt) {
        System.out.println("ATM out of service.");
    }

    @Override
    public void ejectCard() {
        System.out.println("ATM out of service.");
    }
}
