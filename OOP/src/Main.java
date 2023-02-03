public class Main {
    public static void main(String[] args) {
        Car myCar1 = new Car();
        Car myCar2 = new Car();

        System.out.println(myCar1.color);
        System.out.println(myCar1.model);
        System.out.println();
        System.out.println(myCar2.color);
        System.out.println(myCar2.model);

        
        myCar1.drive();
        myCar1.brake();
        System.out.println();
        myCar2.drive();
        myCar2.brake();
    }
}
