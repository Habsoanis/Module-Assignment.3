import java.util.ArrayList;
import java.util.List;


public class FragranceController {
   private final FragranceModel m_Model ;


   public FragranceController(FragranceModel model) {
       this.m_Model = model ;
   }
//This method will get the names of all the fragrances from the Fragrance class.
   public List<String> getAllFragranceNames() {
       List<String> fragranceNames = new ArrayList<>();
       List<Fragrance> fragrances = m_Model.getAllFragrance();


       for ( int i = 0; i < fragrances.size(); ++i ) {
           Fragrance currentFragrance = fragrances.get(i);
           fragranceNames.add(currentFragrance.getName()) ;
       }
       return fragranceNames;
   }


   public List<Fragrance> getAllFragrancesInstances () {
       return m_Model.getAllFragrance();


   }


// this method after receiving the input as an argument from CLI
//it will call the findFragranceByIngredient method and returns the names
//of the fragrances that contain that ingredeint.
   public List <String> searchByIngredient(String input){
       List<String> fragranceNames = new ArrayList<>();


       List<Fragrance> results = m_Model.findFragranceByIngredient(input);
      
       for (int i = 0; i < results.size(); ++i) {
           fragranceNames.add(results.get(i).getName() + " by" + results.get(i).getBrandName());
      
       }
     
     
       return fragranceNames;
        }
//This method will return the names of fragrances from the fragrance class.
        public List <Fragrance> searchByIngredientInstance (String input) {
           return m_Model.findFragranceByIngredient(input) ;




        }






}

