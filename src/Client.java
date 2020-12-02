public class Client {
    @Start
    public static void main(String[] args) {
        Controller con = new Controller();
        con.initCounter("count", 0);
    }

    @Stop
    public static void stop(){

    }
}
