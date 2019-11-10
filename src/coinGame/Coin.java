package coinGame;

public class Coin {
    private String state;
    public void toss() {
        this.state = (Math.random() < 0.5) ? "Heads" : "Tails";
    }

    public int tossAndCount(int n, String State) {
        int freq = 0;
        for (int i = 0; i <= n - 1; i++) {
            toss();
            if (state.equals(State)) {
                freq++;
            }
        }
        return freq;
    }
}
