package generics;

public class Execution {
    public static void main(String[] args) {
        Print<String> p1 = new Print();
        Print<Integer> p2 = new Print<>();
        p1.printS("Divyanshi");
        p2.printS(1);
    }
}
