public class DecoratorPatternDemo {
    public static void main(String[] args) {
        System.out.println();
 
        Notifier emailNotifier = new EmailNotifier();

     
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);

      
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

        slackNotifier.send("Hello, this is a test notification!");
    }
}
