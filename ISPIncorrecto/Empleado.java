package ISPIncorrecto;

class Empleado implements Trabajador {
    @Override
    public void trabajar() {
        System.out.println("Empleado trabajando en la oficina...");
    }

    @Override
    public void comer() {
        System.out.println("Empleado comiendo en la cafetería.");
    }
}
