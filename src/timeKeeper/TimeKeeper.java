package timeKeeper;

public class TimeKeeper {
    private double hour;
    private double minute;
    private double second;

    public TimeKeeper(double hour, double minute, double second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public double calculateSeconds(double hour, double minute, double second) {
        return (hour * 3600 + minute * 60 + second);
    }

    public double dayPercentage() {
        double percentage;
        percentage = calculateSeconds(getHour(), getMinute(), getSecond()) / (24 * 3600);
        return percentage * 100;
    }

    public double getHour() {
        return hour;
    }

    public double getMinute() {
        return minute;
    }

    public double getSecond() {
        return second;
    }
}
