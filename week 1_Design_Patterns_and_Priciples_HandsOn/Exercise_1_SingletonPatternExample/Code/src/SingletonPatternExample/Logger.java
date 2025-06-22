package SingletonPatternExample;
public class Logger {
    // Step 1: Private static instance
    private static Logger instance;

    // Step 2: Private constructor
    private Logger() {
        System.out.println("Logger initialized.");
    }

    // Step 3: Public static method to return instance (lazy initialization)
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Sample log method
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
