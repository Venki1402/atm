import java.util.Map;

public class TransactionFactory {
    public Transaction create(String type, Object params) {
        if (!(params instanceof Map))
            throw new IllegalArgumentException("params must be Map");
        @SuppressWarnings("unchecked")
        Map<String, Object> p = (Map<String, Object>) params;

        switch (type.toLowerCase()) {
            case "withdrawal":
                return new Withdrawal((String) p.get("accountId"), (Integer) p.get("amount"));
            case "deposit":
                return new DepositTxn((String) p.get("accountId"), (Integer) p.get("amount"));
            case "mini":
                return new MiniStatementTxn((String) p.get("accountId"));
            case "changepin":
                return new ChangePinTxn((String) p.get("accountId"),
                        (String) p.get("oldPin"),
                        (String) p.get("newPin"));
            default:
                throw new IllegalArgumentException("Unknown txn type");
        }
    }
}