import java.util.Scanner;

class SquareOfNo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 8. Write a Java program to print square of a number. 
        int num=sc.nextInt();
        int sq=num*num;
        System.out.println(sq);
        double square = Math.pow(num,2);  // pow methods return only double number
        System.out.println(square);

    }
}