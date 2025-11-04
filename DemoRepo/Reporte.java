
package DemoRepo;

public class Reporte {
    private String titulo;
    private String contenido;
    private String autor;
    private String fecha;

    private Reporte(Builder builder) {
        this.titulo = builder.titulo;
        this.contenido = builder.contenido;
        this.autor = builder.autor;
        this.fecha = builder.fecha;
    }

    @Override
    public String toString() {
        return "Reporte generado:\n" +
                "Título: " + titulo + "\n" +
                "Autor: " + autor + "\n" +
                "Fecha: " + fecha + "\n" +
                "Contenido:\n" + contenido;
    }

    public static class Builder {
        private String titulo;
        private String contenido;
        private String autor;
        private String fecha;

        public Builder titulo(String titulo) {
            this.titulo = titulo;
            return this;
        }

        public Builder contenido(String contenido) {
            this.contenido = contenido;
            return this;
        }

        public Builder autor(String autor) {
            this.autor = autor;
            return this;
        }

        public Builder fecha(String fecha) {
            this.fecha = fecha;
            return this;
        }

        public Reporte build() {
            return new Reporte(this);
        }
    }
}

