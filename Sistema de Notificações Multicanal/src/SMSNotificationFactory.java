

public class SMSNotificationFactory implements NotificationFactory {
    @Override
    public Notification criarNotificacao() {
        return new SMSNotification();
    }
}