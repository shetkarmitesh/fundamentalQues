public class ArrayContains {
    
    public static void main(String[] args) {
        // 21. Write a Java program to test if an array contains a specific value.

                int arr[]={1,2,3,4,5};
                int specific_num=4;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i]==specific_num){
                        System.out.println("present");
                    }
                    else{
                        System.out.println("not present");
                    }
                }
        
                
    }
}
