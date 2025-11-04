package DIP;

public class DemoDIP {
    public static void main(String[] args) {
        Notificador email = new EmailNotificador();
        Notificador sms = new SMSNotificador();

        GestorAlerta alertaEmail = new GestorAlerta(email);
        GestorAlerta alertaSMS = new GestorAlerta(sms);

        alertaEmail.enviarAlerta("Servidor sobrecargado");
        alertaSMS.enviarAlerta("Temperatura del CPU alta");
    }
}
