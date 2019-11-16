package labPractice.question6;

public class Question6 implements Comparable<Question6> {  // Custom class;
    private String name;
    private int age;
    public Question6(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Question6 q6) {
        if (this.age < q6.age) {
            return this.age - q6.age;
        }
        return q6.age - this.age;
    }

    public String toString() {
        return String.format("%s %d", name, age);
    }
}
