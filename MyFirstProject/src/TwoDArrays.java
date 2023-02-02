import java.util.Arrays;

public class TwoDArrays {
    public void twoDarrays(){
        // 2D arrays = an array of arrays
        // String[][] letters = new String[3][3];

        // letters[0][0] = "A";
        // letters[0][1] = "B";
        // letters[0][2] = "C";

        // letters[1][0] = "D";
        // letters[1][1] = "E";
        // letters[1][2] = "F";

        // letters[2][0] = "G";
        // letters[2][1] = "H";
        // letters[2][2] = "I";

        String[][] letters = {  
                                {"A","B","C"},
                                {"D","E","F"},
                                {"G","H","I"}
                            };
        System.out.println(Arrays.deepToString(letters));

        for(int i=0; i<letters.length; i++){
            System.out.println();
            for(int j=0; j<letters[i].length; j++){
                System.out.println(letters[i][j]+ " ");
            }

        }
        

    }
    

    



}
