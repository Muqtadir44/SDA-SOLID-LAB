class Notification {
 private MessageSender sender;
 public Notification(MessageSender sender) {
 this.sender = sender;
 }
 public void notifyUser() {
 sender.send();
 }
}