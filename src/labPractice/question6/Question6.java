package labPractice.question6;

public class Question6 implements Comparable<Question6> {  // Custom class;
    private String name;
    private int age;

    public Question6(String name, int age) { // Constructor
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Question6 q6) { // need to add method compareTo() as TreeSet uses it for comparison or for sorting.
        if (this.age < q6.age) {
            return this.age - q6.age;
        }
        return q6.age - this.age;
    }

    public String toString() {
        return String.format("%s %d", name, age);
    }
}
