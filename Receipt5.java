    import java.util.Scanner;

    public class Receipt5
    {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        double drinkCost = 1.50;
        double candyCost = 1.25;
        double hotDogCost = 2.75;
        double hamburgerCost = 3.50;
        double taxRate = 0.05;
        
        System.out.print("Enter the full high school name: ");
        String fullName = input.nextLine();
        
        String[] words = fullName.split(" ");
        String highSchoolName = "";
        for (int i = 0; i < words.length; i++) {
            highSchoolName += words[i].substring(0, 1).toUpperCase();
        }
        
        System.out.print("Enter the number of drinks: ");
        int numDrinks = input.nextInt();
        
        System.out.print("Enter the number of candies: ");
        int numCandy = input.nextInt();
        
        System.out.print("Enter the number of hot dogs: ");
        int numHotDogs = input.nextInt();
        
        System.out.print("Enter the number of hamburgers: ");
        int numHamburgers = input.nextInt();
        
        int orderNumber = (int)(Math.random() * 100 + 1); 
        
        double drinkTotal = numDrinks * drinkCost;      
        double candyTotal = numCandy * candyCost;
        double hotDogTotal = numHotDogs * hotDogCost;
        double hamburgerTotal = numHamburgers * hamburgerCost;
        
        double subtotal = drinkTotal + candyTotal + hotDogTotal + hamburgerTotal;
        double tax = subtotal * taxRate;
        double total = subtotal + tax;  
        
        tax = (int)(tax * 100) / 100.0;  
        subtotal = (int)(subtotal * 100) / 100.0;
        total = (int)(total * 100) / 100.0;  
                
        System.out.println("\n**************************************");
        System.out.println("*                                    *");
        System.out.println("*              Welcome               *");
        System.out.println("*     " + highSchoolName + " Snack Bar     *");
        System.out.println("*                                    *");
        System.out.println("*     Drink ..............$ " + drinkCost + "      *");                      
        System.out.println("*     Candy ..............$ " + candyCost + "     *");    
        System.out.println("*     Hot Dog ............$ " + hotDogCost + "     *");     
        System.out.println("*     Hamburger ..........$ " + hamburgerCost + "      *");       
        System.out.println("*                                    *");    
        System.out.println("**************************************");     
        System.out.println("\n   Order Number    " + orderNumber);
        System.out.println();
        System.out.println("\tQTY\tITEM\t\tTOTAL");
        System.out.println("**************************************");
        System.out.println("\t" + numDrinks + "\tDrink\t\t" + drinkTotal);
        System.out.println("\t" + numCandy + "\tCandy\t\t" + candyTotal);
        System.out.println("\t" + numHotDogs + "\tHot Dog\t\t" + hotDogTotal);
        System.out.println("\t" + numHamburgers + "\tHamburger\t" + hamburgerTotal);
        System.out.println("**************************************");
        System.out.println("\tSubtotal\t " + subtotal);
        System.out.println("\tTax\t\t" + tax);
        System.out.println("\tTotal\t\t" + total);  
    }
    }