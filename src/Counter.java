import java.util.concurrent.TimeUnit;

public class Counter {

    String counterName;
    int counterStart = 0;
    GUI gui;
    private static boolean run = true;

    public static void setRun(boolean run1){run = run1;}

    public Counter(String counterName, int counterStart, GUI gui) {
        this.counterName = counterName;
        this.counterStart = counterStart;
        this.gui = gui;
    }

    public void startCounter() throws InterruptedException {
        while (run){//(counterStart < 30){
            //System.out.println(counterName + ": " + counterStart);
            gui.print(counterName + ": " + counterStart);
            counterStart++;
            TimeUnit.SECONDS.sleep(1);
        }
        gui.close();
    }
}
