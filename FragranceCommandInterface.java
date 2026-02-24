import java.util.List;
import java.util.Scanner;


//This class will function as the command-line interface and will take user input.


public class FragranceCommandInterface {
   private final FragranceController mController;
   private final Scanner mScanner;


   public FragranceCommandInterface(FragranceController controller) {
       this.mController = controller ;
       this.mScanner = new Scanner(System.in);


   }
   // This method will take the user’s input and determine what action to take.


   public void start() {
       try (mScanner) {
           boolean running = true;
          
           while (running) {
               printOptions();
              
               String mChoice = mScanner.nextLine ();
              
               switch(mChoice) {
                   case "1" -> viewAllFragrances();
                   case "2" -> searchTheIngredient();
               }
              
           }
       }




   }
   public void printOptions () {
       System.out.println("Fragrance generator:");
       System.out.println("1. View All Fragrances");
       System.out.println("2. Search By Ingredient");


   }
   // This method communicates with the controller to
   //display all the fragrances to the user. 
   public void viewAllFragrances (){
       List<Fragrance> allPerfumes = mController.getAllFragrancesInstances();


       if (allPerfumes.isEmpty()) {
           System.out.println("There are no Fragrances available") ;
      
       }
       System.out.println("All of the Fragrances in the Database: ");
       for (int i = 0; i <allPerfumes.size(); i++) {
           Fragrance fragrance = allPerfumes.get(i);
           String name = fragrance.getName();
           String brandName = fragrance.getBrandName ();
          
           System.out.println("-" + name + " by" + brandName);
       }
     
   }


   // This method will get the input from the user.
  
    public void searchTheIngredient () {
       System.out.println("Enter an ingredient");
       String input = mScanner.nextLine();
       searchTheIngredient(input);
   }




// This method calls the method searchbyIngredient in the controller.
//It goes through the list of fragrances and outputs the results.


   public void searchTheIngredient(String input) {
       List<String> results = mController.searchByIngredient(input);


       if (results.isEmpty() ) {
           System.out.println("No fragrance containing "+ input + ":");


       }
       else {
           System.out.println("Fragrance containing " + input + ":");
           for (int i=0; i < results.size(); ++i) {
               System.out.println(results.get(i));
           }
       }




   }


}

