package jioBillCalculator;

/*
In recent news, JIO is supposedly increasing their IUC (Interconnect User Charges, i.e the amount of money paid to the service provider whose network is being used to connect the call to) to ₹6 paise/min.
Suppose, JIO comes up with a special plan that allows you to call a person on any other network at ₹0 p/min for the first 300 minutes and then ₹1.2 p/min for each additional minute, plus 18% GST.
Create a class named ‘MonthlyBillCalculator.java’ to calculate the monthly bill for you calling from a given number of minutes.

 */

public class BillCalculator {
    private int totalMinutes;
    private double bill = 0.0;

    public BillCalculator(int totalMinutes) {
        this.totalMinutes = totalMinutes;
    }

    public double calculate() {
        if (totalMinutes > 300) {
            return bill += (1.2 * (totalMinutes - 300) * 100) + ((1.2 * (totalMinutes - 300) * 100) * 18) / 100;
        }
        return 0.0;
    }

}
