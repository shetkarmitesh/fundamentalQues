import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 9. Write a java program which initalizes a variable name and greets with "Hello , have a good day 
        String name=sc.next();
        System.out.println("Hello, " + name + "! Have a good day.");
    }
    
}
