package ISPIncorrecto;

class Robot implements Trabajador {
    @Override
    public void trabajar() {
        System.out.println("Robot ensamblando piezas...");
    }

    @Override
    public void comer() {
        throw new UnsupportedOperationException("Un robot no necesita comer.");
    }
}
