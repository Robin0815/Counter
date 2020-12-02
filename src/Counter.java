import java.util.concurrent.TimeUnit;

public class Counter {

    String counterName;
    int counterStart = 0;
    GUI gui = new GUI("Counter");

    public Counter(String counterName, int counterStart) {
        this.counterName = counterName;
        this.counterStart = counterStart;
    }

    public void startCounter() throws InterruptedException {
        while (true){//(counterStart < 30){
            //System.out.println(counterName + ": " + counterStart);
            gui.print(counterName + ": " + counterStart);
            counterStart++;
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
