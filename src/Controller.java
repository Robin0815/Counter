public class Controller {

    
    public void initCounter(String counterName, int counterStart) throws InterruptedException {
        Counter counter = new Counter(counterName, counterStart);
        counter.startCounter();
    }

}
