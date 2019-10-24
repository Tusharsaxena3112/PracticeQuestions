package naturalSum;

/*
Write a simple program in Java to print the sum of all the natural number up to n.
 The value of n would be given by the user.
The program should output something like the following:
Suppose the value of n was 5, then the output should have been,
	1 + 2 + 3 + 4 + 5 = 15
 */
public class SumNatural {
    private int number;

    public SumNatural(int n) {
        this.number = n;
        calculateSum();
    }

    public void calculateSum() {
        double sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
            if (i < number) {
                System.out.print(i + "+");
            }
            System.out.print("=" + sum);
        }
    }
}
