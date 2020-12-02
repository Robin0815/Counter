public class Controller {

    public void initCounter(String counterName, int counterStart){
        Counter counter = new Counter(counterName, counterStart);
        try {
            counter.startCounter();
        }catch(Exception e){
            System.out.println("Counter Fehler");
        }
    }

}
