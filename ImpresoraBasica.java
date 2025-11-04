interface DispositivoMultifuncion {
    void imprimir(String doc);
    void escanear(String destino);
    void enviarFax(String numero);
}

class ImpresoraBasica implements DispositivoMultifuncion {
    public void imprimir(String doc) {
        System.out.println("Imprimiendo " + doc);
    }
    public void escanear(String destino) {
        throw new UnsupportedOperationException("No escanea");
    }
    public void enviarFax(String numero) {
        throw new UnsupportedOperationException("No envía fax");
    }
}
