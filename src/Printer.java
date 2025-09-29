public class Printer {
    public void print(String text) {
        System.out.println("[Printer] " + text);
    }

    public void printReceipt(Transaction txn) {
        System.out.println("[Receipt] " + txn.getClass().getSimpleName());
    }
}