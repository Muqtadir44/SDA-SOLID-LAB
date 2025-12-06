public class DIPLab {
 public static void main(String[] args) {
     Notification n1 = new Notification(new SMS());
 Notification n2 = new Notification(new Email());
 n1.notifyUser();
 n2.notifyUser();
 }
}
