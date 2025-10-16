package third_type_conversion;
public class Demo {
    public static void main(String[] args) {
        int num1 = 10;
        double num2 = num1;// type conversion
        System.out.println("Original value:"+num1);
        System.out.println("Converted value:"+num2);

        double num3 = 3.14;
        int num4 =  (int) num3 ; //type mismatch cannot convert from double to int 
       // you need to do manual conversion
       System.out.println("Original value:"+num3);
       System.out.println("Converted value:"+num4);

       // incompatible conversion
       int zip = 500081;
      // String num_five = zip; // cannot cast from int to string
      String str_zip = String.valueOf(zip);
      System.out.println("Original value:"+zip);
      System.out.println("Converted value:"+str_zip); 
      System.out.println(str_zip+5); //concatinate //string and int you cannot concatinate

      String str_zip_new = "500081";
      int zip_new = Integer.parseInt(str_zip_new);
      System.out.println("Original value:"+str_zip);
      System.out.println("Converted value:"+zip_new);
      System.out.println(zip_new+5);

      // might not be possible
      int num6 = 100;
      // boolean boolvalue = (boolean)num6;

    }

}
