package singleton1;

public class Logger {
    // Instancia única del Singleton
    private static Logger instance;

    // Constructor privado para evitar instanciación directa
    private Logger() {
        System.out.println("Logger inicializado.");
    }

    // Método para obtener la instancia única
    public static Logger getInstance() {
        if (instance == null) {
            // Creación de la instancia única si no existe
            instance = new Logger();
        }
        return instance;
    }

    // Método para simular el registro de eventos
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
