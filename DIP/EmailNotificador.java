package DIP;

public class EmailNotificador implements Notificador {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando EMAIL: " + mensaje);
    }
}
