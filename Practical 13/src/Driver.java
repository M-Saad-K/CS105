public class Driver {
    public static void main(String[] args) {

        MessagePost messagePost1 = new MessagePost("Saad", "I think Red Riding Hood is ok");
        System.out.println(messagePost1);
        System.out.println(messagePost1.getText());
        System.out.println(messagePost1.printShortSummary());
    }
}
