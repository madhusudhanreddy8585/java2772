package second_variables;
public class Variablesdemo {
    // brand
    // description
    // ratings
    // price
    // datatype varname = value;
    // if we define variable in class we call them as instance variables 
    static int someData1; // declaration
    static double someData2; // declaration
    static char someData3; // declaration
    static boolean someData4; // declaration
    short price = 350;
    char textbrand = 'h';
    String brand = "HIGHERLANDER";
    String description = "Men Slim Fit Horizontal Stripes Cotton Casual Shirt";
    float rating = 4.2f;
    // textbrand = "HIGHERLANDER";
    // description = Men Slim Fit Horizontal Stripes Cotton Casual Shirt;
    // decimal ratings = 4.2
    public static void main(String[] args) {
        // if we define variables in method we call them as local variables
        int someDataNew1 = 10; // initialization
        int someDataNew2; // declaration
        System.out.println(someDataNew1);
        // System.out.println(someDataNew2);

        //work with instance variables
        System.out.println(someData1);
        System.out.println(someData2);
        System.out.println(someData3);
        System.out.println(someData4);
    }
}

