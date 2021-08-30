import java.util.Scanner;

public class Customer{
    public String customer() {

        String customerName = new String();
        String customerStreetAddress = new String();
        String customerCity = new String();
        String customerState = new String();
        String customerZip = new String();

        Scanner scanner = new Scanner(System.in);

        System.out.println("*** Welcome To the Pizza Ordering System ***");
        System.out.println("Please enter your name: ");
        customerName = scanner.nextLine();

        System.out.println("Please enter your street address: ");
        customerStreetAddress = scanner.nextLine();

        System.out.println("Please enter your city: ");
        customerCity = scanner.nextLine();

        System.out.println("Please enter your state: ");
        customerState = scanner.nextLine();

        System.out.println("Please enter your zip code: ");
        customerZip = scanner.nextLine();

        String customerInfo = customerName + " | " + customerStreetAddress + " " + customerCity + ", " + customerState + ", " + customerZip;



        return customerInfo;

    }

}