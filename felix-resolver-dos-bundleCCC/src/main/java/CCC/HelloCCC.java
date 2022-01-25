package CCC;

import AAA.HelloAAA;
import BBB.HelloBBB;

public class HelloCCC implements Runnable {

    private HelloAAA helloAAA = new HelloAAA();
    private AAA.sub01.HelloAAA helloAAASub1 = new AAA.sub01.HelloAAA();
    private HelloBBB helloBBB = new HelloBBB();

    public void run() {
        System.out.println("Hello from CCC; say hi AAA, AAA-sub01, and BBB");
        helloAAA.run();
        helloAAASub1.run();
        helloBBB.run();
    }
}
