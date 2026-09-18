    /**
     * Receipt3.java  
     *
     * @author - Your Name
     * @author - Class Period
     *
     */ 
    public class Receipt3
    {
    public static void main(String[] args)
    {
        String highSchoolName = "Trevor Packer HS";
        double drinkCost = 1.5;
        double candyCost = 1.25;
        double hotDogCost = 2.75;
        double hamburgerCost = 3.5;
        double taxRate = 0.05;
        
        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*              Welcome               *");
        System.out.println("*     " + highSchoolName + " Snack Bar     *");
        System.out.println("*                                    *");
        System.out.println("*     Drink ..............$ " + drinkCost + 
                            "      *");                      
        System.out.println("*     Candy ..............$ " + candyCost + 
                            "     *");    
        System.out.println("*     Hot Dog ............$ " + 
                            hotDogCost + "     *");     
        System.out.println("*     Hamburger ..........$ " + hamburgerCost +
                            "      *");       
        System.out.println("*                                    *");    
        System.out.println("**************************************");     
        
        int orderNumber = (int)(Math.random() * 100 + 1); 
        int numDrinks = (int)(Math.random() * 3);      
        int numCandy = (int)(Math.random() * 3);
        int numHotDogs = (int)(Math.random() * 3);
        int numHamburgers = (int)(Math.random() * 3);     
        
        double drinkTotal = numDrinks * drinkCost;      
        double candyTotal = numCandy * candyCost;
        double hotDogTotal = numHotDogs * hotDogCost;
        double hamburgerTotal = numHamburgers * hamburgerCost;
        
        double subtotal = drinkTotal + candyTotal + hotDogTotal + hamburgerTotal;
        double tax = subtotal * taxRate;
        double total = subtotal + tax;  
        
        //  changes the values of the variables so they contain 
        //        only 2 decimal places
        tax = (int)(tax * 100)/100.0;  
        subtotal = (int)(subtotal * 100)/100.0;
        total = (int)(total * 100)/100.0;  
                
        System.out.println("\n   Order Number    " +orderNumber);
        System.out.println();
        System.out.println("\tQTY\tITEM\t\tTOTAL");
        System.out.println("**************************************");
        System.out.println("\t" + numDrinks + "\tDrink\t\t" + drinkTotal);
        System.out.println("\t" + numCandy + "\tCandy\t\t" + candyTotal);
        System.out.println("\t" + numHotDogs + "\tHot Dog\t\t" + hotDogTotal);
        System.out.println("\t" + numHamburgers +"\tHamburger\t" + hamburgerTotal);
        System.out.println("**************************************");
        System.out.println("\tSubtotal\t " + subtotal);
        System.out.println("\tTax\t\t" + tax);
        System.out.println("\tTotal\t\t" + total);  
    }
    }