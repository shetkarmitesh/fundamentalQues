public class FactorialNo {
    
    public static void main(String[] args) {
        // 17. Write a program to find the factorial value of any number entered through the keyboard. (Using for and while) 
                int number=5;
                int n1=0,n2=1;
                int fact=1;
                int i = 1;
                for (; i <=number; i++) {
                    fact=fact*i;
                }

                System.out.println(fact);
                i = 1;
                fact=1;    
                while(i<=number){
                    fact=fact*i;
                    i++;
                }
                
                System.out.println(fact);


                // recursion
                long factorial = calculateFactorial(5);
                System.out.println("The factorial of " + 5 + " is " + factorial);

    }
    public static long calculateFactorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * calculateFactorial(num - 1);
        }
    }
}
