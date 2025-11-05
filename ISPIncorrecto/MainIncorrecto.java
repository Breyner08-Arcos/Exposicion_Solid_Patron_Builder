package ISPIncorrecto;

public class MainIncorrecto {
    public static void main(String[] args) {
        System.out.println("=== Ejemplo INCORRECTO (Violación del ISP) ===");

        Empleado empleado = new Empleado();
        empleado.trabajar();
        empleado.comer();

        Robot robot = new Robot();
        robot.trabajar();

        try {
            robot.comer();
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
