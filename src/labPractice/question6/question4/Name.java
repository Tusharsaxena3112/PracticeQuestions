package labPractice.question6.question4;

public class Name {
    private String firstName;
    private String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return String.format("%s %s", firstName, lastName);
    }

    public String fullName() {
        return firstName + lastName;
    }

//    public int compareTo(Name name) {
//        return this.compareTo(name);
//    }
}
