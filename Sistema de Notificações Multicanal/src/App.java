
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(" Abstract Factory – Sistema de Notificações Multicanal:");

        NotificationFactory factory;

        String Tipo = "email"; // poderia vir de arquivo, args, etc.

        if ("email".equalsIgnoreCase(Tipo)) {
            factory = new EmailNotificationFactory();
        } else if ("sms".equalsIgnoreCase(Tipo)) {
            factory = new SMSNotificationFactory();
        } else {
            throw new IllegalArgumentException("Tipo de canal desconhecido: " + Tipo);
        }

        Notification notificacao = factory.criarNotificacao();
        notificacao.enviar("Olá! Esta é uma mensagem.");

        factory = new SMSNotificationFactory();
        notificacao = factory.criarNotificacao();
        notificacao.enviar("Teste via SMS agora.");
    }
}
