public class Main {
   public static void main(String[] args) {
       FragranceModel model = FragranceDatabase.creatFragranceModel();
       FragranceController controller = new FragranceController(model);
       FragranceCommandInterface commandInterface = new FragranceCommandInterface(controller);
// a call for the method searchTheIngredient that search the input and communicates with
// the other layers to process the input.
       commandInterface.searchTheIngredient("Rose");
       // calls the viewAllFragrance method that will display all the fragrances along with
       // the brand name to the user.
       commandInterface.viewAllFragrances();
       commandInterface.searchTheIngredient("musk");


   }
}





