package fourth_operators;
public class Demo {
    public static void main(String[] args) {
        // arthimetic operators
        int num1 = 10;
        int num2 = 5;
        int sum = num1+num2; //addition operator
        System.out.println("sum: " +sum);

        int diff = num1-num2;// subtraction operator
        System.out.println("Difference: "+diff);
        System.out.println("product: "+(num1*num2));
        System.out.println("Division: "+(num1/num2));
        System.out.println("Modulus: "+(num1%num2));

        // Increment / Decrement operatos ++ --
        int a = 10;
        System.out.println("A: "+a);
        System.out.println("++A: "+ ++a);  // pre Increment
        System.out.println("A++: "+ a++);  // post Increment
        System.out.println("A: "+a);

        System.out.println("++A: "+ --a);  // pre Drecement
        System.out.println("A++: "+ a--);  // post Drecrement
        System.out.println("A:"+a);

       
        // compound assignment operators
        int num = 10;
        num+= 5; // 10+5
        System.out.println("Number is: "+num);
        
        
        num*= 5; // 15*5
        System.out.println("Number is: "+num);


        // Relational operators (comparision)
        int x = 10;
        int y = 5;
         
        System.out.println("x is greater than y: "+(x>y));
        System.out.println("x is less than y: "+(x<y));
        System.out.println("x ix equal to y: "+(x==y));
        System.out.println("x is greater than equal to y: "+(x>=y));


        // Logical operators
        int l = 7;
        int m = 5;
        int n = 3;
        int o = 1;

        boolean resultAND = l > m && n>o; // T && T->T
        System.out.println(resultAND);

        int e = 7;
        int b = 5;
        int c = 3;
        int d = 7;

        boolean resultAnd = e > b && c>d; // T && F->F
        System.out.println(resultAnd);

        boolean resultOR = e > b || c>d; // T ||F->T
        System.out.println(resultOR);

        boolean resultNOT = e > b; // T
        System.out.println(!resultNOT); // T->F


        // Bitwise operators
        int valuea = 5; // 0000000000000101
        int valueb = 3; // 0000000000000011
        int resultand = valuea & valueb; // 000000000000000001-->1
        System.out.println(resultand);

        int resultor = valuea | valueb; // 0000000000000111-->7
        System.out.println(resultor);

        int resultxor = valuea ^ valueb; //000000000000110-->6
        System.out.println(resultxor);

        int result = ~valueb; // 111111111111100-->(-4)
        System.out.println(result);

        // Left shift
        // int valueb = 3; // 000000000000011
        System.out.println(valueb<<2); // 000000000001100-->12
        System.out.println(valueb<<1); // 000000000000110-->6
        System.out.println(valueb<<3); // 0000000000011000-->24


        // Right shift
        // int valueb =3; // 000000000000011
        System.out.println(valueb>>2); // 000000000000000-->0
        System.out.println(valueb>>1); // 000000000000001-->1
        System.out.println(valueb>>3); // 000000000000000-->0
        System.out.println(8>>2); // 000000000001000 --> 000000000000010
    
    }
}
