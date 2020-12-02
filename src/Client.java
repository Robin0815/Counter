public class Client {
    private static GUI gui = new GUI("Counter");
    @Start
    public static void main(String[] args) {
        Controller con = new Controller();
        con.initCounter("count", 0, gui);
    }

    @Stop
    public static void stop(){
        Counter.setRun(false);
        gui.close();
    }
}
