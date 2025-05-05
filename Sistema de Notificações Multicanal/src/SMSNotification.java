
public class SMSNotification implements Notification {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando por SMS: " + mensagem);
    }
}