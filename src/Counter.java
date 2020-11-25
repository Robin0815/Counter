import java.util.concurrent.TimeUnit;

public class Counter {

    String counterName;
    int counterStart = 0;

    public Counter(String counterName, int counterStart) {
        this.counterName = counterName;
        this.counterStart = counterStart;
    }

    public void startCounter() throws InterruptedException {
        while (true){
            System.out.println(counterName + ": " + counterStart);
            counterStart++;
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
