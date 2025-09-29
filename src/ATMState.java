public interface ATMState {
    void insertCard(Card card);

    void enterPin(String pin);

    void selectTransaction(String type, Object params);

    void performTransaction(String txnType, Object params);

    void dispenseCash(int amount);

    void ejectCard();
}