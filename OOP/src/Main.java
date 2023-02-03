public class Main {
    public static void main(String[] args) {

        // overloaded constructors = multiple constructores within a class wiht the same name , 
        //                           but have different parameters
        //                           name + parameters = signature

        Pizza veganpizza = new Pizza("thicc crust","tomato");
        System.out.println("Here are the ingredients of your pizza ");
        System.out.println(veganpizza.bread);
        System.out.println(veganpizza.sauce);

        Pizza pizza = new Pizza("thicc crust","tomato","mozzerella","pepperoni");
        System.out.println("Here are the ingredients of your pizza ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);
        
        
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
