import java.util.Arrays;

public class AvgArrayExceptExtremes {
    public static void main(String[] args) {
        // 22. Write a Java program to compute the average value of an array of integers except the largest  and smallest values
                int arr[]={1,2,3,4,5};
                int avg=0;
                int max=Integer.MIN_VALUE;
                int min=Integer.MAX_VALUE;
                for (int i : arr) {
                    if (i>max){
                        max=i;
                    }
                    if (i<min){
                        min=i;
                    }
                    
                    avg+=i;
                }
                avg=(avg-max-min )/(arr.length-2);
                System.out.println(avg);



        // other way but not recommanded because complexity is high O(n2)
         Arrays.sort(arr); // Sort the array in ascending order

        int sum = 0;
        for (int i = 1; i < arr.length - 1; i++) { // Skip first and last elements
            sum += arr[i];
        }
        avg = sum/(arr.length-2);
        System.out.println(avg);

    }
}
