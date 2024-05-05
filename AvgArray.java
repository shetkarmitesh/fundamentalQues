import java.util.Arrays;

public class AvgArray {
    public static void main(String[] args) {
        // 20. Write a Java program to calculate the average value of array elements
                int arr[]={1,2,3,4,5};
                int avg=0;
                for (int i : arr) {
                    avg+=i;
                }
                avg=avg/arr.length;
                System.out.println(avg);

                // inbuilt method 
                double average = Arrays.stream(arr).average().orElse(0.0);

                // learned what is stream : it is used for collection of element explore Arrays inbuilt function 
                System.out.println(average);
        
    }
}
