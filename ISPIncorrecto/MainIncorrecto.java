package ISPIncorrecto;

public class MainIncorrecto {
    public static void main(String[] args) {
        System.out.println("=== Ejemplo INCORRECTO (Violación del ISP) ===");

        Empleado empleado = new Empleado();
        empleado.trabajar();
        empleado.comer();

        Robot robot = new Robot();
        robot.trabajar();

        // Este método no tiene sentido, pero la interfaz lo obliga
        try {
            robot.comer();
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
