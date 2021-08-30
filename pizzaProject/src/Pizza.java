import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Pizza {
    public void pizza() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many pizzas would you like?");

        int pizzaAmount;
        int pizzaCount = 1;

        pizzaAmount = Integer.parseInt(scanner.nextLine());

        String pizzaSize = new String();
        int toppingAmount;
        int toppingCount = 1;


        ArrayList<String> pizzaOrder = new ArrayList<>();
        ArrayList<String> toppings = new ArrayList<>();

        while (pizzaCount <= pizzaAmount) {
            System.out.println("*** Info for pizza " + pizzaCount + " ***");
            System.out.println("Please enter a size (L)arge, (M)edium, (S)mall: ");
            pizzaSize = scanner.nextLine();

            System.out.println("Please enter number of toppings: ");
            toppingAmount = Integer.parseInt(scanner.nextLine());
            System.out.println("Are topping choices are: Mushroom , Pineapple, Pepperoni, Black Olives, Bacon, and Spinach");

            while (toppingCount <= toppingAmount){
                System.out.println("Choose topping " + toppingCount);
                String toppingChoice = scanner.nextLine();
                toppings.add(toppingChoice);
                toppingCount++;
            }
            pizzaCount++;
            String pizzaNumber = "Pizza number: " + pizzaCount;




        }

    }

}
