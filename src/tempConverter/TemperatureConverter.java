package tempConverter;

public class TemperatureConverter {
    private double temp;

    public TemperatureConverter(double temp) {
        this.temp = temp;
    }

    public double converter() {
        return (temp * 9 / 5) + 32;
    }

    public String toString() {
        return String.format("%.1f Fahrenheit", converter());
    }
}