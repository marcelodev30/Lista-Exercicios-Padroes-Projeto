

public class EmailNotificationFactory implements NotificationFactory {
    @Override
    public Notification criarNotificacao() {
        return new EmailNotification();
    }
}