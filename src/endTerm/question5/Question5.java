package endTerm.question5;

//Design an application in java that contains a class Student having properties name
// and percentage. Create a class Test that declares three instances of Student class.
// The values are passed through constructor at the time of its object creation.
// The output should
// be the name and percentage of the students who secured percentage less than 40%.
public class Question5 {
    private String name;
    private double percentage;

    public Question5(String name, double percentage) {
        this.name = name;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public String toString() {
        return String.format("%s  %f\n", getName(), getPercentage());
    }
}
