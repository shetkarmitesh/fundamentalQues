import java.util.Scanner;

public class VoterEligibility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//      1. prepare a code to check the voters eligibility. Take a variable int age. if age is greater than 18  print. "eligible" else print " not eligible"
        int age =sc.nextInt();
        if (age>18){
            System.out.println("eligible");
        }
        else{
           System.out.println("not eligible");
        }

        sc.close();

    }
    
}
