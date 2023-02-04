public class Main {
    public static void main(String[] args) {

        // inheritance = the process where one class acquires,
        //               the attributes and methods of another.
        Car car = new Car();

        car.go();

        Bicrycle bike = new Bicrycle();

        bike.stop();

        System.out.println(car.doors);
        System.out.println(bike.pedals);


        // static = modifier. A single copy of a variable/method is created and shared.
        //          The class "owns" the static member.
        // Friend friend1 = new Friend("Roberto");
        // Friend friend2 = new Friend("Lisa");
        
        // System.out.println(friend1.numberofFriends);
        // Friend.displayFriends();


        
        // Garage garage = new Garage();

        // Car car1 = new Car("BMW");
        // Car car2 = new Car("Tesla");
        // garage.park(car1);
        // garage.park(car2);

        // int[] numbers = new int[3];
        // char[] characters = new char[4];
        // String[] strings = new String[5];

        // Food[] refrigerator = new Food[3];

        // Food food1 = new Food("pizza");
        // Food food2 = new Food("hamburger");
        // Food food3 = new Food("hotdog");

        

        // refrigerator[0]=food1;
        // refrigerator[1]=food2;
        // refrigerator[2]=food3;

        // Food[] refrigerator = {food1,food2,food3};
        // System.out.println(refrigerator[0].name);
        // System.out.println(refrigerator[1].name);
        // System.out.println(refrigerator[2].name);
        // toString() = special method that all objects inherit,
        //              that returns a string that "textually represents" an object
        //              can be used both implicitly and explocitly

        // Car car = new Car();
        
        // System.out.println(car.toString());
        

        // overloaded constructors = multiple constructores within a class wiht the same name , 
        //                           but have different parameters
        //                           name + parameters = signature

        // Pizza veganpizza = new Pizza("thicc crust","tomato");
        // System.out.println("Here are the ingredients of your pizza ");
        // System.out.println(veganpizza.bread);
        // System.out.println(veganpizza.sauce);

        // Pizza pizza = new Pizza("thicc crust","tomato","mozzerella","pepperoni");
        // System.out.println("Here are the ingredients of your pizza ");
        // System.out.println(pizza.bread);
        // System.out.println(pizza.sauce);
        // System.out.println(pizza.cheese);
        // System.out.println(pizza.topping);
        
        
        // local = diclared inside a method visible only to that method
        // global = declared outside a method, but within a class visible to all parts of a class
        
        // DiceRoller diceRoller = new DiceRoller();
        
        // construntor = special method that is called when an object
        //                  is instantianted (created)

        // Human human1 = new Human("Lisa",21,165);
        // Human human2 = new Human("Heidi",20,155);
        
        // human1.eat();
        // human2.drink();

        // System.out.println(human1.name);
        // System.out.println(human2.name);



        // Car myCar1 = new Car();
        // Car myCar2 = new Car();

        // System.out.println(myCar1.color);
        // System.out.println(myCar1.model);
        // System.out.println();
        // System.out.println(myCar2.color);
        // System.out.println(myCar2.model);


        // myCar1.drive();
        // myCar1.brake();
        // System.out.println();
        // myCar2.drive();
        // myCar2.brake();
    }
}
