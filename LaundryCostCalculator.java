    package com.mycompany.danislaundry; // Program to handle and calculate the costs of user choices at a laundromat
    import java.util.Scanner; // Written By Samuel Parson ^-^

    public class DanisLaundry {
    public static int totalCost = 0; //Initalise the variables that will be used to store user choice
    public static int number = 0; //They are initalised outside of any Method to give them global scope
    public static int numberTwo = 0;
    public static String selection = "";
    public static String selectionTwo = "";
  
        public static void main(String[] args) { //Main Method that will determine which functions need to execute based on user input
        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Welcome to Dani's Laundry\nServices available and costs");
        System.out.println("Wash for 30 minutes - 1$\nWashing casules - 1$\nSoftener capsules - 1$\nDryer:\n30 minutes - 1$\n60 minutes - 2$\n90 minutes - 3$");
        System.out.println("*********************************************************************************************************************************");
        System.out.println("Please select from the options below to start\nOption 1 - Wash only\nOption 2 - Wash & Dry\nOption 3 - Dry only\nOption 4 - Exit");
        System.out.println("Enter your selection number:"); // Displays washing options, asks for input
        int number = scan.nextInt(); // Recieves input
        boolean continueLoop = true; // Boolean to manage looping
          while(continueLoop) {
            switch(number){ // Switch case to intepret user input
                case 1: 
                wash(scan); // Executes the wash() method only
                continueLoop = false; // Condition to break looping
                break;

                case 2: 
                wash(scan); // Executes the wash() then the dry()Method
                dry(scan);
                continueLoop = false; 
                break;

                case 3: 
                dry(scan); // Executes the dry() Method only  
                continueLoop = false;
                break;

                case 4: 
                System.out.println("\nYou have chosen to exit\nSee you next time!");
                System.exit(0); // Exits upon user choice  
                continueLoop = false;
                break;

                default: System.out.println("invalid input please try again"); //Default case causes switch to loop until valid input
                number = scan.nextInt(); 
            }}
          
        displaySummary(number,numberTwo,selection,selectionTwo); // After executing the selected Methods, displaySummary() executes to show user selections
        }
        
       public static void wash(Scanner scan){ // Method to handle wash input
       Scanner in = new Scanner(System.in); // Create a scanner object
       totalCost++; // Increment totalCost variable as washing costs 1$
       System.out.println("\n***Washing capsule and softener selection***"); // Display out options for washing
       System.out.println("\nWould you like to add a washing capsule for 1$");
       System.out.println("Enter 'Y' for yes and 'N' for no"); // Request User Input
       selection = scan.next(); // Recieves Input
       boolean continueLoop = true; // Boolean to manage looping
       while(continueLoop){
           switch(selection.toUpperCase()){ // Switch case to intepret user input
               case "Y":{
                   continueLoop = false; // Condition to break looping
                   totalCost++; //Increment totalCost variable as washing capsule costs 1$ 
                   break;}
               
               case "N":{
                   continueLoop = false;
                   break;}
               
               default:{
                   System.out.println("Invalid input please try again"); // Default case causes switch to loop until valid input
                   selection = scan.next();}
    }} // Closing bracers for while loop and switch statement
       
       System.out.println("Would you like to add softener for 1$"); // Display options
       System.out.println("Enter 'Y' for yes and 'N' for no"); // Request user input
       selectionTwo = scan.next(); // Recieve User Input
       boolean loopTwo = true; // Boolean to manage looping2
       while(loopTwo) { 
        switch(selectionTwo.toUpperCase()){ // Switch case to intepret user input
            case "Y":
                loopTwo = false; // Condition to break looping
                totalCost++; // Increment totalCost variable as softener costs 1$
                break;

            case "N":
                loopTwo = false;
                break;
            
            default:
                   System.out.println("Invalid input please try again");
                   selectionTwo = scan.next();
    }} // Closing bracers for while loop and switch case
    } // Closing bracers for Method
       
       public static void dry(Scanner scan){ // Method to handle dry input
       System.out.println("Please select the time for your drying.\nOption 1 - 30 minutes - 1$\nOption 2 - 60 minutes - 2$\nOption 3 - 90 minutes - 3$\nOption 4 - Skip drying"); // Display options & request input
       numberTwo = scan.nextInt(); // Recieves input
       boolean continueLoop = true; // Boolean to manage looping
        while(continueLoop){
         switch(numberTwo){ // Switch case to intepret user input
             case 1: 
                totalCost++; // Increment totalCost variable by cost of option selected
                continueLoop = false; // Condition to break looping
                System.out.println("You have selected 30 minutes drying - 1$"); // Display user selection
                break;

             case 2: 
                totalCost = (totalCost + 2);
                continueLoop = false;
                System.out.println("You have selected 60 minutes drying - 2$");
                break;

             case 3: 
                totalCost = (totalCost + 3);    
                continueLoop = false;
                System.out.println("You have selected 90 minutes drying - 3$");
                break;

             case 4: 
                continueLoop = false;
                System.out.println("You have elected to skip drying");
                break;

             default: System.out.println("Invalid input, please try again"); // Default case loops until valid input
               number = scan.nextInt(); 
    }} // Closing bracers for while loop and switch case
    } // Closing bracers for Method
       public static void displaySummary(int number, int numbertwo, String selection, String selectionTwo){ // Method to display user choices
       System.out.println("*********************************************************************************************************************************");
       System.out.println("Thanks for using Dani's Laundry service!");
       System.out.println("\nCost for services selected:");
       switch(number){ // Switch case to intepret previous user input
         case 1:
          System.out.println("\nWash - 1$"); // Display price of previous user slections
          break;
         
         case 2:
          System.out.println("\nWash - 1$");
          break;

         case 3: 
          System.out.println("\nWash - 0$");
          break;
    } // Closing bracer for first switch
       switch(selection.toUpperCase()){ // Switch case to intepret previous user input
         case "Y":
          System.out.println("Washing Capsule - 1$"); // Display price of previous user slections
          break; 
         
         default: 
          System.out.println("Washing Capsule - 0$");
          break;
          
    } // Closing bracer for second switch
       switch(selectionTwo.toUpperCase()){ // Switch case to intepret previous user input
          case "Y":
          System.out.println("Softener - 1$"); // Display price of previous user slections
          break;

          default:
          System.out.println("Softener - 0$");
          break;

    } // Closing bracer for third switch
          
       switch(numberTwo){ // Switch case to intepret user input
          case 1: 
           System.out.println("30 minutes drying - 1$"); //Display price of previous user selections
           break;

          case 2: 
           System.out.println("60 minutes drying - 2$");
           break;

          case 3: 
           System.out.println("90 minutes drying - 3$");
           break;

          default: 
          System.out.println("You have elected to skip drying - 0$"); 
          break;
                
    } // Closing bracer for final switch statement
       System.out.println("----------------------------------------");
       System.out.println("Total cost: " + totalCost + "$"); // Final statements print the total cost of the selected options stored in the totalCost variable
       System.out.println("Please finalise payment to run your selected operation");
    }} // Closing bracers for displaySummary Method and for the class Dani's Laundry
