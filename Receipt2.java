    /**
     * Receipt2.java  
     *
     * @author – Your name
     * @author – Class period
     */ 
    public class Receipt2
    {
    public static void main(String [] args)
    {
        // Variables for the school name and menu prices
        String schoolName = "Trevor Packer HS";
        
        double drinkPrice = 1.50;
        double candyPrice = 1.25;
        double hotDogPrice = 2.75;
        double hamburgerPrice = 3.50;

        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.printf("*     %-26s     *%n", schoolName + " Snack Bar");
        System.out.println("*                                    *");
        System.out.printf("*     Drink ..........$%.2f          *%n", drinkPrice);
        System.out.printf("*     Candy ..........$%.2f          *%n", candyPrice);
        System.out.printf("*     Hot Dog ........$%.2f          *%n", hotDogPrice);
        System.out.printf("*     Hamburger ......$%.2f          *%n", hamburgerPrice);
        
        System.out.println("*                                    *");    
        System.out.println("**************************************");
    }
    }