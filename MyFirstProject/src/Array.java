import java.util.Arrays;
public class Array {
    public void array(){
        // array = used to store multiple values in a single variable
    
        // String[] names = {"Halisa","Heidi","Hena"};
        // System.out.println(Arrays.toString(names));
        // names[0] = "Lisa";
        // System.out.println(names[0]);
        // System.out.println(names[1]);
        // System.out.println(names[3]);//java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
    
        String[] names = new String[3];

        names[0] = "Halisa";
        names[1] = "Heidi";
        names[2] = "Hena";

        System.out.println(Arrays.toString(names));
        for(int i=0; i<names.length; i++){
            System.out.println(names[i]);
        }
        
    }
}
