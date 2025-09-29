public class DepositSlot {
    public void acceptCashBundle(String bundle) {
        System.out.println("Accepted bundle: " + bundle);
    }

    public void acceptCheque(String cheque) {
        System.out.println("Accepted cheque: " + cheque);
    }

    public void validateBundle(String bundle) {
        System.out.println("Validated: " + bundle);
    }
}