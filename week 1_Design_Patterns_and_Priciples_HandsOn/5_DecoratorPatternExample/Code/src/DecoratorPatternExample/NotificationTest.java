package DecoratorPatternExample;


public class NotificationTest {
 public static void main(String[] args) {
     Notifier basicNotifier = new EmailNotifier();

     
     Notifier sms = new SMSNotifierDecorator(basicNotifier);
     
     Notifier slack =new SlackNotifierDecorator(sms);
     
     slack.send("Hi, This is Amirthan");

    
 }
}

