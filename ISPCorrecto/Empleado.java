package ISPCorrecto;

class Empleado implements Trabajador, Comedor {
    @Override
    public void trabajar() {
        System.out.println("Empleado trabajando en la oficina...");
    }

    @Override
    public void comer() {
        System.out.println("Empleado comiendo en la cafetería.");
    }
}

