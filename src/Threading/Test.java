package Threading;

public class Test extends Thread {//Inheritance

    public Test(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "is running");

        }
    }
}
