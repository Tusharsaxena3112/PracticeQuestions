package coinGame;

public class Coin {
    private String state;

    public Coin() {
        this.toss();
    }

    public void toss() {
        this.state = (Math.random() < 0.5) ? "Head" : "Tails";
    }

    public int tossAndCount(int n, String state) {
        int freq = 1;
        for (int i = 0; i <= n - 1; i++) {
            if (state.equals(this.state)) {
                freq++;
            }
        }
        return freq;
    }
}
