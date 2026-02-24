import java.util.Arrays;


//This class will be responsible for holding all data for the fragrances
public class FragranceDatabase {


//This method calls the addfragrance method to add the data the to model variable. 
//Each Fragrance will contain the name of the fragrance, the brand and it's ingredients.
   public static FragranceModel creatFragranceModel(){
       // a variable to hold fragrance objects.
       FragranceModel model = new FragranceModel ();


       model.addFragrance(new Fragrance(
               "Musk Therapy",
               " Initio Parfums Prives",
               Arrays.asList("Musk", "White Musk", "Black Currant",
                       "Mandarin Orange", "Magnolia", "White Sandalwood")
       ));


       model.addFragrance(new Fragrance(
               "Bal d'Afrique",
               " Byredo",
               Arrays.asList("African Marigold", "Bergamot",
                       "Violet", "Cyclamen", "Vetiver", "Cedar")
       ));


       model.addFragrance(new Fragrance(
               "Yin Transformation",
               " The Harmonist",
               Arrays.asList("Orchid", "Bulgarian Rose",
                       "Mandarin Orange", "Ylang-Ylang",
                       "Almond Milk", "White Musk")
       ));


       return model;
     
      


   }
 
  
}

