public interface IBankConnector {
    AuthorizationResult authorize(String cardNumber, String pin, int amount);

    void postTransaction(Transaction txn);

    String getMiniStatement(String accountId, int count);

    void changePin(String accountId, String oldPin, String newPin);

    void deposit(String accountId, int amount);
}