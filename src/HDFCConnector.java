public class HDFCConnector implements IBankConnector {
    @Override
    public AuthorizationResult authorize(String cardNumber, String pin, int amount) {
        return new AuthorizationResult(true);
    }

    @Override
    public void postTransaction(Transaction txn) {
        System.out.println("Posted txn to HDFC.");
    }

    @Override
    public String getMiniStatement(String accountId, int count) {
        return "Mini statement";
    }

    @Override
    public void changePin(String accountId, String oldPin, String newPin) {
        System.out.println("PIN changed.");
    }

    @Override
    public void deposit(String accountId, int amount) {
        System.out.println("Deposited " + amount);
    }
}