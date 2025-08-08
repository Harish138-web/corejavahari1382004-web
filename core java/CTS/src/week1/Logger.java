package week1;
public class Logger {
    private static Logger inst;

    private Logger() {
        System.out.println("Logger Initialized.");
    }

    public static Logger getInst() {
        if (inst == null) {
            inst = new Logger();
        }
        return inst;
    }

    public void log(String msg) {
        System.out.println("Log: " + msg);
    }

    public static void main(String[] args) {
        Logger l1 = Logger.getInst();
        Logger l2 = Logger.getInst();

        l1.log("First message.");
        l2.log("Second message.");

        System.out.println("Same instance? " + (l1 == l2));
    }
}

