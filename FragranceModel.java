import java.util.ArrayList;
import java.util.List;
// this class will be responsible for finding the fragrances that contain the user's input
public class FragranceModel {
   private final List<Fragrance> mFragrance ;


   public FragranceModel() {
       this.mFragrance = new ArrayList<>();


   }


   public void addFragrance(Fragrance fragrance){
       mFragrance.add(fragrance);
   }
//This method will be responsible for finding the fragrance that contains the ingredient the user has entered.
//It goes through the list of the fragrances, and if the fragrance contains the ingredient,
//it will add the fragrance to the results list.


   public List<Fragrance> findFragranceByIngredient(String ingredient) {
       List<Fragrance> results = new ArrayList<>();
       for (int i = 0; i < mFragrance.size(); ++i ) {
           Fragrance fragrance = mFragrance.get(i);
           if (fragrance.containsIngredient(ingredient)) {
               results.add(fragrance);




           }
       }
       return results;
   }
// This method gets the list of all fragrances from the Fragrance class
   List<Fragrance> getAllFragrance() {
       return new ArrayList<>(mFragrance);
   }
}

