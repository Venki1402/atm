public class GreedyNoteStrategy implements INoteDispenserStrategy {
    @Override
    public void computeNotes(int amount) {
        System.out.println("Greedy algorithm to minimize number of notes for " + amount);
    }
}