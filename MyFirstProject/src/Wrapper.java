public class Wrapper {
    public void wrapper(){
        // wrapper class = provides a way to use primitive data types as reference data types
        //                 refenrence data types contain useful methods
        //                  can be used with collections  (ex.ArrayList)

        //primitive  //wrapper
        //--------   //--------
        //boolean    Boolean
        //char       Character
        //int        integer
        // double    Double
    
        //autoboxing = the automatic conversion that the Java compiler makes between the primitive 
        //             types and their corresponding object wrapper classes
        //unboxing = the reverse of autoboxing, Automatic conversion of wrapper class to primitve
        

        //autoboxing
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Lisa";
        

        //unboxing
        if(a==true){
            System.out.println("This is true");
        }
    }
}
