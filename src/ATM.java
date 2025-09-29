public class ATM {
    private ATMState currentState;
    private final CardReader cardReader;
    private final IPinEntry pinEntry;
    private final Display display;
    private final Printer printer;
    private final CashDispenser cashDispenser;
    private final DepositSlot depositSlot;
    private final IBankConnector bankConnector;
    private final TransactionFactory txnFactory;

    private Card currentCard;
    private Transaction pendingTransaction;

    public ATM(IBankConnector connector) {
        this.bankConnector = connector;
        this.cardReader = new CardReader();
        this.pinEntry = new PhysicalPinPad();
        this.display = new Display();
        this.printer = new Printer();
        this.cashDispenser = new CashDispenser(new GreedyNoteStrategy());
        this.depositSlot = new DepositSlot();
        this.txnFactory = new TransactionFactory();
        this.currentState = new IdleState(this);
    }

    // context helpers
    public void setState(ATMState s) {
        currentState = s;
    }

    public ATMState getState() {
        return currentState;
    }

    public CardReader getCardReader() {
        return cardReader;
    }

    public IPinEntry getPinEntry() {
        return pinEntry;
    }

    public Display getDisplay() {
        return display;
    }

    public Printer getPrinter() {
        return printer;
    }

    public CashDispenser getCashDispenser() {
        return cashDispenser;
    }

    public DepositSlot getDepositSlot() {
        return depositSlot;
    }

    public IBankConnector getBankConnector() {
        return bankConnector;
    }

    public TransactionFactory getTransactionFactory() {
        return txnFactory;
    }

    public void setCurrentCard(Card c) {
        currentCard = c;
    }

    public Card getCurrentCard() {
        return currentCard;
    }

    public void setPendingTransaction(Transaction t) {
        pendingTransaction = t;
    }

    public Transaction getPendingTransaction() {
        return pendingTransaction;
    }

    // API delegations
    public void insertCard(Card card) {
        currentState.insertCard(card);
    }

    public void enterPin(String pin) {
        currentState.enterPin(pin);
    }

    public void selectTransaction(String t, Object p) {
        currentState.selectTransaction(t, p);
    }

    public void performTransaction(String t, Object p) {
        currentState.performTransaction(t, p);
    }

    public void dispenseCash(int a) {
        currentState.dispenseCash(a);
    }

    public void ejectCard() {
        currentState.ejectCard();
    }
}