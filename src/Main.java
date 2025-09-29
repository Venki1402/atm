import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        ATM atm = new ATM(new HDFCConnector());
        Card card = new Card("1234567890", "John Doe");

        atm.insertCard(card);
        atm.enterPin("1234");

        Map<String, Object> params = new HashMap<>();
        params.put("accountId", "acc1");
        params.put("amount", 500);
        atm.selectTransaction("withdrawal", params);
        atm.performTransaction("withdrawal", params);

        atm.ejectCard();
    }
}