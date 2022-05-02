package course.demos.multithreading;

public class DeadLock {
    private final Object left = new Object();
    private final Object right = new Object();

    public void leftRight() {
        synchronized (left) {
            synchronized (right) {
                doSomething();
            }
        }
    }
    public void rightLeft() {
        synchronized (left) {
            synchronized (right) {
                doSomething();
            }
        }
    }
    private void doSomething() {
        System.out.println("Doing some processing ...");
    }

    public void test() {
        var t1 = new Thread(() -> {
            for(var i = 0; i < 10000; i++) {
                leftRight();
            }
        });
        var t2 = new Thread(() -> {
           for(var i = 0; i < 10000; i++) {
               rightLeft();
           }
        });
        t1.start();
        t2.start();
    }

    public static void main(String[] args) {
        DeadLock demo = new DeadLock();
        demo.test();
    }
}
