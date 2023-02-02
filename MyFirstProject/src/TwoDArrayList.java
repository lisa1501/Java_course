import java.util.*;

public class TwoDArrayList {
    public void twoDArrayList(){

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> drinkList = new ArrayList();
        drinkList.add("water");
        drinkList.add("soda");

        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinkList);

        System.out.println(groceryList);
        System.out.println(groceryList.get(1).get(1));
        
        


    }
}
