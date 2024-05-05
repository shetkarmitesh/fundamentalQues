import java.io.IOException;

public class main_daa {


  public static void main(String[] args) throws IOException {
    int arr[]={1,2,8,16,146,12};
    
    // reverse
    //  for (int i=arr.length-1;i>=0;i--){
      // If we want to print
      // System.out.println(arr[i]);
      //  }
      // if we want to store the array in reverse order we are using new_arr to store 
      // int new_arr[]=new int[arr.length];
     // for (int i = 0; i < new_arr.length; i++) {
     //   new_arr[i]=arr[arr.length-1-i];
     // }
     // for (int i : new_arr) {
     //   System.out.println(i);
     // }
    
     //  reverse array using 1 loop
     // int temp;
     //   for (int i = 0; i <( arr.length/2); i++) {
     //     temp = arr[i];
     //     arr[i] = arr[arr.length-1-i];
     //     arr[arr.length-1-i]=temp;
  
     //   }
     //   for (int i : arr) {
     //     System.out.println(i);
        
    //   }

    // find the second largest element in array

    //sort
    // for (int i=0;i<arr.length-1;i++){
    //   for (int j=i+1;j<arr.length;j++){
    //     if (arr[i]<arr[j]){
    //       // using third varible
    //       // int temp =arr[i];
    //       // arr[i]=arr[j];
    //       // arr[j]=temp;
    //       // using without third varible
    //       arr[i]=arr[i]+arr[j];          //a=a+b          
    //       arr[j]=arr[i]-arr[j];          //b=a-b
    //       arr[i]=arr[i]-arr[j];          //a=a-b
    //     }
    //   }
    // }

    
    // find second largest by traversing only 1 time through array
//     int firstLargest = Integer.MIN_VALUE;
//   int secondLargest = Integer.MIN_VALUE;
//   for (int i = 0; i < arr.length; i++) {
//       if (arr[i] > firstLargest) {
//           secondLargest = firstLargest;
//           firstLargest = arr[i];
//       } else if (arr[i] > secondLargest && arr[i] != firstLargest) {
//           secondLargest = arr[i];
//       }
// }
// System.out.println(secondLargest);



  var str1="asc";
  String str2="cvb";

  // // Change two strings with using third variable 
  // String temp=str1;
  // str2=str1;
  // str1=temp;

  // // Change two strings without using third variable 

  // str1=str1+str2;
  // str2=str1.substring(0, str1.length()-str2.length());
  // str1=str1.substring(str2.length(),  str1.length());
  // System.out.println(str1);
  // System.out.println(str2);
  

  //  str1 = str1 ^ str2;
  //  str2 = str1 ^ str2;
  //  str1 = (str1) ^ (str2);

  


  }
 
    
  
}
