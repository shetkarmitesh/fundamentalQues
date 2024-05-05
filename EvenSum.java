public class EvenSum {
    public static void main(String[] args) {
        // 18. Print first 30 even numbers and the total of them.

                int num=30,sum=0,start =0;
                for (int i = 0; i <=num; i++) {
                    if (i%2==0){
                        sum=start+i;
                        System.out.println(i);
                        // if the number is even then incrementing i twice so it will jump to next even number
                        i++;
                    }
                } 
                System.out.println("Sum of even number is : "+sum);

               
                
    }
}
