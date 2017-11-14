
public class Die {
    private int numDots;

    public void roll() {
        this.numDots = (int)(6.0 * Math.random()) + 1;
    }

    public int getNumDots() {
        return this.numDots;
    }
}
