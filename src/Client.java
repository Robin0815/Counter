public class Client {
    private static int counter = 0;
    private static GUI gui;
    @Start
    public static void main(String[] args) {
        Controller con = new Controller();
        gui = new GUI("Counter"+counter);
        counter++;
        Counter.setRun(true);
        con.initCounter(0, gui);
    }

    @Stop
    public static void stop(){
        Counter.setRun(false);
        gui.close();
    }
}
