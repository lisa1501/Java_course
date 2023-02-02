import java.util.Scanner;

public class Whileloop {
    public void whileloop(){
        // while loop = executes a block of code as long as a it's condition remains true
    
        Scanner scanner = new Scanner(System.in);
        String name = "";

        // while(name.isBlank()){
        //     System.out.print("Enter your name ");
        //     name = scanner.nextLine();

        // }

        //do loop
        do{
            System.out.print("Enter your name ");
            name = scanner.nextLine();

        }while(name.isBlank());
        
        System.out.println("Hello "+name);
    }
}
