import java.util.ArrayList;
public class Arraylist {
    public void arraylist(){
        // ArrayList = a resizable array;
        //              Elements can be added and removed after compilation phase
        //              store reference data types

        ArrayList<String> food = new ArrayList<String>();
        food.add("Pizza");
        food.add("Hamburger");
        food.add("Hotdog");
        System.out.println(food);
        // food.set(0, "Pilav");
        // food.remove(1);
        // food.clear();

        for(int i=0; i<food.size(); i++){
            System.out.println(food.get(i));
        }
    }
}
