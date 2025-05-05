

public class EmailNotification implements Notification {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando por Email: " + mensagem);
    }
}