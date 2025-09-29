public class CashDispenser {
    private INoteDispenserStrategy strategy;

    public CashDispenser(INoteDispenserStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(INoteDispenserStrategy s) {
        this.strategy = s;
    }

    public void dispense(int amount) {
        System.out.println("Dispensing cash: " + amount + " using " + strategy.getClass().getSimpleName());
    }
}