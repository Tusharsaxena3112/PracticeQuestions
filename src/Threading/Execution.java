package Threading;

public class Execution {
    public static void main(String[] args) {
        Test t = new Test("sdsd");
        Test1 t1 = new Test1("asas");
        t.start();
        t1.start();
        try {
            t.sleep(110L);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
