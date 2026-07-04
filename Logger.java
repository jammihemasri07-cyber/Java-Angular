public class Logger {

    // Only one Logger object
    private static Logger instance;

    // Private constructor
    private Logger() {
        System.out.println("Logger Instance Created");
    }

    // Method to return the single object
    public static Logger getInstance() {

        if (instance == null) {
            instance = new Logger();
        }

        return instance;
    }

    // Logging method
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}