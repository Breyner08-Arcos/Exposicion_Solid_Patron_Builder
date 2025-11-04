package ISPCorrecto;

public class MainCorrecto {
    public static void main(String[] args) {
        System.out.println("=== Ejemplo CORRECTO (Aplicando el ISP) ===");

        Empleado empleado = new Empleado();
        empleado.trabajar();
        empleado.comer();

        Robot robot = new Robot();
        robot.trabajar();
    }
}

