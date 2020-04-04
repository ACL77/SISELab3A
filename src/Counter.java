import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    //atomic integer will not lock for reading values
    private AtomicInteger cnt;
    //private int cnt = 0;
    public Counter(int init) {

        //cnt = init;
        cnt = new AtomicInteger(init);
    }
    public synchronized void increment() {
        //cnt++;
        //first increments, then returns
        cnt.incrementAndGet();
    }
    public synchronized void decrement() {

        //cnt--
        //first decrements, then returns
        cnt.decrementAndGet();
    }
    public synchronized int value() {

        return cnt.get();
    }
}
