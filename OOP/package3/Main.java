package OOP.package3;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Chevrolet", "Camaro",2021);
        // Car car2 = new Car("Ford", "Mustang",2022);

        // car2.copy(car1);

        Car car2 = new Car(car1);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();

        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();

        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());

        // Encapsulation = attributes of a class will be hidden or private,
        //                  can be accessed only through methods (getters & setters)
        //                  You should make attributes private if you don't have a reason to make them public/protected
        
        // Car car = new Car("Chevrolet", "Camaro",2021);
        
        // System.out.println(car.getMake());
        // System.out.println(car.getModel());
        // System.out.println(car.getYear());
        


        
    }
    
}
