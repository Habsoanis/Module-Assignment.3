import java.util.ArrayList;
import java.util.List;
// This class is responsibe for storing information about the fragrances such as the brandname,
// ingredients it contains and the name of the fragrance.
public class Fragrance {
  // variables for holding the name, ingredients and brand of the frangrances.
  private final String m_Name;
  private final String m_BrandName ;
  private final List <Ingredient> m_Ingredients;




// The constructor initializes the variables. It is close to where the
//variables were first declared to minimize the scope.




  public Fragrance (String name, String BrandName, List<String> ingredients) {
      this.m_Name = name ;
      this.m_BrandName = BrandName ;
      this.m_Ingredients = new ArrayList<>();
      for (int i = 0; i < ingredients.size(); i++) {
          String ingredient = ingredients.get(i);




          Ingredient ingredient1 = new Ingredient(ingredient);
          m_Ingredients.add(ingredient1);




      }
  }




 //This method returns the name of a fragrance when called.
  public String getName (){
      return m_Name;
  }
// This method returns the brand name when called.  
  public String getBrandName (){
      return m_BrandName ;
  }
// This method adds ingredeints to the variable m_Ingredeints.
  public void addIngredient(Ingredient Ingredients) {
    
      m_Ingredients.add(Ingredients) ;








  }
// This method goes through the ingredients liss; stores the ingredients at the index in the
//variable ingredient. if that ingredients equals the users ingredient then it returns true.
  public boolean containsIngredient(String input) {
      for (int i = 0; i < m_Ingredients.size(); ++i) {
          Ingredient ingredient = m_Ingredients.get(i);
          if (ingredient.getName().equalsIgnoreCase(input)) {
              return true;
          }
      }
      return false;
  }




}

