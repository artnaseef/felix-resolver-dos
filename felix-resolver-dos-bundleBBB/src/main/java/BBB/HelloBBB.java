package BBB;

import AAA.sub01.HelloAAA;

public class HelloBBB implements Runnable {

    private HelloAAA helloAAASub01 = new HelloAAA();
    private AAA.HelloAAA helloAAA = new AAA.HelloAAA();

    public void run() {
        System.out.println("Hello from BBB - and more");
        helloAAA.run();
        helloAAASub01.run();
    }
}
