public class CardReader {
    public Card readCard() {
        return new Card("1234567890", "John Doe");
    }

    public void ejectCard() {
        System.out.println("Card ejected.");
    }

    public void retainCard() {
        System.out.println("Card retained.");
    }
}