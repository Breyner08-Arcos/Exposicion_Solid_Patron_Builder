package DIP;

public class GestorAlerta {
    private final Notificador notificador;

    public GestorAlerta(Notificador notificador) {
        this.notificador = notificador;
    }

    public void enviarAlerta(String mensaje) {
        notificador.enviarMensaje("[ALERTA] " + mensaje);
    }
}
