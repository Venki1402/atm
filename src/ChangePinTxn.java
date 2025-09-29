public class ChangePinTxn extends Transaction {
    private final String oldPin, newPin;

    public ChangePinTxn(String accountId, String oldPin, String newPin) {
        super(accountId, 0);
        this.oldPin = oldPin;
        this.newPin = newPin;
    }

    @Override
    public void execute(IBankConnector bank) {
        bank.changePin(accountId, oldPin, newPin);
    }
}