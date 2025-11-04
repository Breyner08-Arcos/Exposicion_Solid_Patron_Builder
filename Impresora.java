interface Impresora {
    void imprimir(String doc);
}
interface Escaner {
    void escanear(String destino);
}
interface Fax {
    void enviarFax(String numero);
}

class ImpresoraBasica implements Impresora {
    public void imprimir(String doc) {
        System.out.println("Imprimiendo " + doc);
    }
}
class CentroDeCopias implements Impresora, Escaner, Fax {
    public void imprimir(String doc) { /* ... */ }
    public void escanear(String destino) { /* ... */ }
    public void enviarFax(String num) { /* ... */ }
}

