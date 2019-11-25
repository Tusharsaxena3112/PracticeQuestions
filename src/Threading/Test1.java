package Threading;

public class Test1 extends Thread {
    public Test1(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int o = 0; o < 10; o++) {
            System.out.println(getName() + "is running");
        }
    }
}
