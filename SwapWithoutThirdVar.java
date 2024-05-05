public class SwapWithoutThirdVar {
    
    public static void main(String[] args) {
        // 4. Change 2 strings without using third variable. 
        String str1="asd";
        String str2="cvb";

        //  //used concatenation and substring method to swap
        // str1=str1+str2;
        // str2=str1.substring(0, str1.length()-str2.length());
        // str1=str1.substring(str2.length(),  str1.length());
        // System.out.println(str1);
        // System.out.println(str2);  


        // using char arrays
         // Convert strings to char arrays 
         char[] charArrayA = str1.toCharArray(); 
         char[] charArrayB = str2.toCharArray(); 
           
         // XOR swap algorithm to swap characters without temporary variable 
         for(int i = 0; i < charArrayA.length && i < charArrayB.length; i++) { 
             charArrayA[i] ^= charArrayB[i]; 
             charArrayB[i] ^= charArrayA[i]; 
             charArrayA[i] ^= charArrayB[i]; 
         } 
        // Convert char arrays back to strings 
       String a = new String(charArrayA); 
       String b = new String(charArrayB); 

       System.out.println("After swap:"); 
        System.out.println("a = " + a); 
        System.out.println("b = " + b); 
        

        // If there is number to swap 
        int num1 = 10;
        int num2 = 20;
        System.out.println("After swaping");

        System.out.println("By using + operator");
        // num1 = num1+num2; //num1 = 10+20=30 
        // num2 = num1-num2; // num2 = 30-20=10
        // num1 =num1-num2; // num 1 = 30-10

        System.out.println("By using ^ xor operator");
        // ^ operator is bitwise xor it stores values by converting number to bit like 0 or 1 
        // if number want to store 1 xor 2 in bit it is 01 xor 10 so number will store 11 as 3 
        // xor  operator  return 1 if one of the bit is 1 and returns 0 if both bit are 0 or 1 
        // like 1 xor 1 or 0 xor 0 is 0 and 1 xor 0 or 0 xor 1 is 1

        int n1 = 10;
        int n2 = 20;
        n1 = n1^n2; //num1 = 10 ^ 20= 01010 ^ 10100 = 11110 = 30
        n2 = n1^n2; // num2 = 30^20= 11110 ^ 10100 = 01010 = 10
        n1 =n1^n2; // num 1 = 30-10 = 11110 ^ 01010 = 10100 =20

        System.out.println(n1);
        System.out.println(n2);


        

    }
}
