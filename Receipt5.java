
import java.util.Random;
import java.util.Scanner;

public class Receipt5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        double drinkCost = 1.50;
        double candyCost = 1.25;
        double hotDogCost = 2.75;
        double hamburgerCost = 3.50;
        double friesCost = 2.00;
        double pizzaCost = 3.25;

        // input for school name
        System.out.print("Enter the full high school name: ");
        String fullName = input.nextLine();

        String[] words = fullName.split(" ");
        String highSchoolName = "";
        for (int i = 0; i < words.length; i++) {
            highSchoolName += words[i].substring(0, 1).toUpperCase();
        }

        // Coupon, random % off from 1-20%
        int couponPercent = random.nextInt(20) + 1;
        System.out.print("Available coupon: " + couponPercent + "% off. use it? (y/n): ");
        String couponChoice = input.nextLine();
        boolean couponUsed = couponChoice.equalsIgnoreCase("y");

        // Order Menu
        System.out.println("\nMenu:");
        System.out.println("1. Drink - $1.50");
        System.out.println("2. Candy - $1.25");
        System.out.println("3. Hot Dog - $2.75");
        System.out.println("4. Hamburger - $3.50");
        System.out.println("5. Fries - $2.00");
        System.out.println("6. Pizza Slice - $3.25");
        System.out.println("0. Finish order");

        int numDrinks = 0;
        int numCandy = 0;
        int numHotDogs = 0;
        int numHamburgers = 0;
        int numFries = 0;
        int numPizza = 0;

        // Pick food and quantity
        while (true)
        {
            System.out.print("Choose an item number: ");
            int choice = input.nextInt();

            if (choice == 0)
            {
                break;
            }

            System.out.print("How many? ");
            int quantity = input.nextInt();

            switch (choice)
            {
                case 1:
                    numDrinks += quantity;
                    break;

                case 2:
                    numCandy += quantity;
                    break;

                case 3:
                    numHotDogs += quantity;
                    break;

                case 4:
                    numHamburgers += quantity;
                    break;

                case 5:
                    numFries += quantity;
                    break;

                case 6:
                    numPizza += quantity;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        
        // Tip and taxes
        System.out.print("Enter tip amount: $");
        double tip = input.nextDouble();

        int taxPercent = random.nextInt(10) + 1;
        double taxRate = taxPercent / 100.0;

        int orderNumber = random.nextInt(900) + 100;



        double drinkTotal = numDrinks * drinkCost;
        double candyTotal = numCandy * candyCost;
        double hotDogTotal = numHotDogs * hotDogCost;
        double hamburgerTotal = numHamburgers * hamburgerCost;
        double friesTotal = numFries * friesCost;
        double pizzaTotal = numPizza * pizzaCost;

        double subtotal = drinkTotal + candyTotal + hotDogTotal + hamburgerTotal + friesTotal + pizzaTotal;
        double couponDiscount = 0;
        if (couponUsed)
        {
            couponDiscount = subtotal * (couponPercent / 100.0);
        }

        double discountedSubtotal = subtotal - couponDiscount;
        double tax = discountedSubtotal * taxRate;
        double total = discountedSubtotal + tax + tip;

        subtotal = (int)(subtotal * 100) / 100.0;
        couponDiscount = (int)(couponDiscount * 100) / 100.0;
        discountedSubtotal = (int)(discountedSubtotal * 100) / 100.0;
        tax = (int)(tax * 100) / 100.0;
        total = (int)(total * 100) / 100.0;

        System.out.println("\n**************************************");
        System.out.println("*                                    *");
        System.out.println("*              Welcome               *");
        System.out.println("*     " + highSchoolName + " Snack Bar     *");
        System.out.println("*                                    *");
        System.out.println("**************************************");
        System.out.println("\n   Order Number    " + orderNumber);
        System.out.println("   Coupon          " + couponPercent + "%");
        System.out.println("   Tax Rate        " + taxPercent + "%");
        System.out.println();
        System.out.println("\tQUANTITY\tITEM\t\tTOTAL");
        System.out.println("**************************************");

        if (numDrinks > 0)
        {
            System.out.println("\t" + numDrinks + "\tDrink\t\t" + drinkTotal);
        }
        if (numCandy > 0)
        {
            System.out.println("\t" + numCandy + "\tCandy\t\t" + candyTotal);
        }
        if (numHotDogs > 0)
        {
            System.out.println("\t" + numHotDogs + "\tHot Dog\t\t" + hotDogTotal);
        }
        if (numHamburgers > 0)
        {
            System.out.println("\t" + numHamburgers + "\tHamburger\t" + hamburgerTotal);
        }
        if (numFries > 0)
        {
            System.out.println("\t" + numFries + "\tFries\t\t" + friesTotal);
        }
        if (numPizza > 0)
        {
            System.out.println("\t" + numPizza + "\tPizza\t\t" + pizzaTotal);
        }

        System.out.println("**************************************");
        System.out.println("\tSubtotal\t " + subtotal);
        if (couponUsed)
        {
            System.out.println("\tCoupon\t\t-" + couponDiscount + " (" + couponPercent + "%)");
        }
        System.out.println("\tTip\t\t" + tip + "$");
        System.out.println("\tTax\t\t" + tax + "$");
        System.out.println("\tTotal\t\t" + total + "$");
    }
}