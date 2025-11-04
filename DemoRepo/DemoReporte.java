package DemoRepo;

public class DemoReporte {
    public static void main(String[] args) {
        Reporte reporte = new Reporte.Builder()
                .titulo("Informe de Ventas Q1 2025")
                .autor("Ana López")
                .fecha("04/11/2025")
                .contenido("Se registró un incremento del 15% respecto al trimestre anterior.")
                .build();

        System.out.println(reporte);
    }
}
