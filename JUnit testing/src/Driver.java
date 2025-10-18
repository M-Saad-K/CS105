import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        System.out.println("Enter your name");
        String name = in.nextLine();
        System.out.println("Enter the price of the product");
        int price = in.nextInt();
        System.out.println("Write your comment");
        String text = in.nextLine();
        System.out.println("Enter your rating of the product --- */10");
        int rating = in.nextInt();

        SalesItem review = new SalesItem(name, price, text, rating);

        review.showInfo();
        review.getNumberOfComments();


    }
}
