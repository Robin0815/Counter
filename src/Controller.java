public class Controller {

    public void initCounter(String counterName, int counterStart, GUI gui){
        Counter counter = new Counter(counterName, counterStart, gui);
        try {
            counter.startCounter();
        }catch(Exception e){
            System.out.println("Counter Fehler");
        }
    }

}
