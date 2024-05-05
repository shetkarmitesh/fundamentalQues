import java.util.Scanner;

import javax.swing.text.StyledEditorKit.BoldAction;
import javax.xml.crypto.Data;
import java.util.*;
public class java_assignment {


    public static void main(String[] args) {
        


         

                
                
                

                
                
               

                // 23. Write a Java program to convert minutes into a number of years and days. Test Data Input 
                // the number of minutes: 3456789 Expected Output : 3456789 minutes is approximately 6 
                // years and 210 days

                // 24. Write a Java program to break an integer into a sequence of individual digits. Test Data Input 
                // six non-negaƟve digits: 123456 Expected Output : 1 2 3 4 5 6

                // 25. Prepare a basic calculator mechanism using a switch in java. AddiƟon, subtracƟon, 
                // mulƟplicaƟon, division, squared.

                // 31. Write a java program to find the maximum number in an array.

                    // int arr[]={1,2,3,4,5};
                    // int max=Integer.MIN_VALUE;
                    // int min=Integer.MAX_VALUE;
                    // for (int i = 0; i < arr.length; i++) {
                    //     if (arr[i]>max){
                    //         max=arr[i];
                    //     }
                    //     if(arr[i]<min){
                    //         min=arr[i];
                    //     }

                        
                    // }
                    // System.out.println(max);
                    // System.out.println(min);

                    // 32. Write a java program to identfy if a string is palindrome. Palindrome is a type of string which 
                    // when reversed is also the same Example: Bob
    
                    // String word="boB";
                    // // char a[]=word.toCharArray();
                    // boolean palindrome=true;
                    // // for (char i = 0;i<word.length();i++) {
                    // //     if (a[i]!=a[a.length-1-i]){
                    // //         palindrome=false;

                    // //     }
                       
                    // // }
                    //     for (int i = 0; i < word.length(); i++) {
                    //         if (Character.toLowerCase(word.charAt(word.length()-i-1))!=Character.toLowerCase(word.charAt(i))){
                    //             palindrome=false;
                    //         }
                    //         // if (word.charAt(i)!=word.charAt(word.length()-1-i)){
                    //         //     palindrome=false;
                    //         // }
                    //     }
                    // if (palindrome){
                    //     System.out.println("Given string is palindrome");
                    // }else{
                    //     System.out.println("Given string is not palindrome");

                    // }

                    String strg1="Hello 3 world java , java from javapoint";
                    // System.out.println(strg1.indexOf(108));
                    // System.out.println(strg1.intern());
                    // String strg2="world";
                    // String c=strg1.concat(strg2);
                    // System.out.println(c);


                    // String str = new String("Welcome to geeksforgeeks");
                    // String str="hello java point";
                    // String [] ss=str.split("");
                    // for (String string : ss) {
                    //     System.out.println(string);
                    // }

                        // String c=str.replaceAll("a","p" );
                        // System.out.println(c);
                    // System.out.println(str.matches("(.*)javap(.*)"));
                    // String Str = new String("Welcome to geeksforgeeks");
                    // System.out.println(Str.matches("(.*)ge(.*)"));


                    // String s="fsdfsDLJFSJGIHEKHIPEINNNFIGHKkjgksfgjrotyotoyjtkjkLJOIOEHEKHKKDJGKFGJkfjhglfhjtrhkjfkhjnfglhkjflgjhtrljhfljhfgljhfgljhfgljhtrklyjhtrkjhfgkljhfgjhfljhtrljlfjhfgljhfglkjhflyjtljtrlyjhtryjtrtykhrktherktjhtrkyjhkujhtykhtryhrthHKLJHLHRLHTLRHLKHTRLKHLHRLHLKHLKHKLHLKHLHKLHKHJKHKJHKJHJKHKHJKHKHHLHLHLHKHKJHKJKKHKHKHKHKHHKHKHKHKHkhktryhtlhtklhtrkyhtrkyhtrkjyhtrkyhrekthtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkrtkyhtrklyhjrOEOHKDHFksdhfklHLHKHLHKKJHJHKGKLHLHJLJHLHLHLHLHHLHLHLHH";
                    // String smallest = "";
                    // String largest = "";
                    //     int k=100;
                    
                    // System.out.println(largest);





        //             String smallest = "";
        //             String largest = "";
        //             int k=100;
        //             String arr_str[]= new String[s.length()-k+1];
        
        // for(int i=0;i<s.length();i++){
        //    arr_str[i]=s.substring(i,i+k); 
        // }
      
        // for (int i=0;i<arr_str.length-1;i++){
        //     for(int j=i+1;j<arr_str.length;j++){
        //         if (arr_str[i].compareTo(arr_str[j])>0){  
        //             String temp=arr_str[i];
        //             arr_str[i]=arr_str[j];
        //             arr_str[j]=temp;
        //         }
        //     }
        // }
        // smallest=arr_str[0];
        // largest=arr_str[arr_str.length-1];
    //    System.out.println("yotoyjtkjkLJOIOEHEKHKKDJGKFGJkfjhglfhjtrhkjfkhjnfglhkjflgjhtrljhfljhfgljhfgljhfgljhtrklyjhtrkjhfgklj".equals(largest));

    // System.out.println("wel".compareTo(""));
    // String s="welcometojava";
    // String smallest = "";
    // String largest = "";
    // int k=3;
    // for (int i = 0; i < s.length()-k+1; i++) {
    //     if (s.substring(i, i+k).compareTo(largest)>0){
    //         largest=s.substring(i,i+k);
    //     }
    //     if (s.substring(i, i+k).compareTo(smallest)<0|| i == 0 ){
    //         smallest=s.substring(i, i+k);
    //     }
    //     System.out.println(smallest);
        // }
        // String A="madam";
        // if (A.charAt(0).equals(A.endsWith(A.ch)))
        // Boolean isPalindrome=true;
        
        // for (int i = 0; i < A.length(); i++) {
        //     if (A.charAt(i)!=A.charAt(A.length()-1-i)){
        //          isPalindrome=false;
        //          break;
        //     }
            
        // }
        // if (isPalindrome){
        //     System.out.println("yes");
        // }
        // else{
        //     System.out.println("no");
        // }

        // String a="anagram";
        // String b="margana";

        // Boolean bo;

        // if(a.length()!=b.length()){
        //     System.out.println("Not Anagrams");
        // }
        // else{
        //     for (int i = 0; i < a.length(); i++) {
        //         if (a.contains(b.charAt(i))){
        //             bo=true;
        //         }
        //         else{
        //             bo=false;
        //         }
                
        //     }
        // }


    //     String a="xyzw";
    //     String b="xyxy";
        
    //    int p=0,q=0;
       
    //     for (int i = 0; i < a.length(); i++) {
    //      p=(int) a.toLowerCase().charAt(i)+p;
    //      q=(int) b.toLowerCase().charAt(i)+q;
    //     }
    //     if (p==q){
    //         System.out.println("Anagrams");
    //     }
    //     else{
    //         System.out.println("Not Anagrams");
    //     }


        // String S="Thisisdemostring";
        // char ch='i';
        // int count=3;
        
        // if (count==S.lastIndexOf(ch)){
        //     int pos=S.lastIndexOf(ch);
        //     System.out.println(); S.substring(pos+1);
        // }
        // else{
        //     System.out.println( "Empty String");
        // }

    //     String new_name="";
    //     String [] ar=name.split(" ");
    //     // for (String i : ar) {
    //     //     new_name=i+" "+new_name;
    //     // }

    //     for (int i = ar.length-1; i >=0; i--) {
    //         new_name+=ar[i]+" ";
    //     }
    //    System.out.println(new_name);

        // String str[]=new String[10];
        // System.out.println(str[0]);
        // System.out.println(var);

        // int k=1;
        // for (int i = 1; i <= 5; i++) {
            
        //     if (i%2!=0){
        //         for (int j = 0; j < 5; j++) {
        //             System.out.print(k +" ");
        //             k++;
        //         }
        //     }
            
        //     else{
        //         k=k+4;
        //             for (int j = 0; j <5; j++) {
        //                     System.out.print(k+" ");
        //                     k--;
        //                 }
        //         k=k+6;
        //         }
            
        //         System.out.println();

                
        //     }
            // String s1="hello";
            // s1=s1.replace("hello", "vello");System.out.println(s1);

            // StringBuffer sb=new StringBuffer();  
            // System.out.println(sb.capacity());//default 16  
            // sb.append("Hello");  
            // System.out.println(sb.capacity());//now 16  
            // sb.append("java is the fava hvfg jjj hjjn jjuu nn");  
            // System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2 

            // java_assignment s1=new java_assignment(101,"Raj","lucknow");  
            // java_assignment s2=new java_assignment(102,"Vijay","ghaziabad");  
              
            // System.out.println(s1);//compiler writes here s1.toString()  
            // System.out.println(s2);//compiler writes here s2.toString()
            
            // String s="hello";
            // String s1=new String("hello");
            // System.out.println(s==s1);

            // double f1=3.3f  ;
            // float f2=3.2f;
            // System.out.println(f1);
            // System.out.println(f2);

            // byte a=18;
            // byte b=18;
            // //  a=a && b;
            // System.out.println();
            // System.out.println(b);
            // System.out.println(c);
            
            // System.out.println(" "+7+2+" ");
            


            // // patthern 
            // char a='a';
            // for (int i = 0; i < 5; i++) {

                
            //     for (int j = 0; j<=i ; j++) {
            //         System.out.print(a);
            //     }
            //     a++;


            //     System.out.println();
            // }


            // int arr[] = {1,2,3,5,4,3,6,2,4,5,6,4,5};
            // int n1=arr[0],n2=arr[1];

            // for (int i = 1; i < arr.length; i++) {
            //     if (arr[i]>n1){
            //         n2=n1;
            //         n1=arr[i];

            //     }
            //     else if(arr[i]>n2 && arr[i]!=n1){
            //         n2=arr[i];
            //     }

            // }
            // System.out.println(n1 +" "+n2);

            // int i=0,j=0;
            // int result=0;
            // for (; i < 5; i++) {
            //     System.out.println(i);
            //     for (; j < 5; j++) {
            //         System.out.print(j);
            //         result = i*j;
            //         System.out.println("j result : "+result);
            //     }
            //     System.out.println("i result : "+result);
            // }

            int res = java_assignment.rec(5);

            System.out.println(res);

    }
    static int rec(int num ){
        if (num == 0){
            return 1;
        }
        System.out.println("jii" + num);
        int rec = rec(--num)*num;
        return rec;
    }
    int rollno;  
    String name;  
    String city;  
     
    java_assignment(int rollno, String name, String city){  
        this.rollno=rollno;  
        this.name=name;  
        this.city=city; 
    }


    // int asd(){
    //     int i=0;
    //     for (; i<5;i++){
    //         continue;
    //         // System.out.println(i);
    //         // return 0;
    //     }
    // }
public String toString(){//overriding the toString() method  
    return rollno+" "+name+" "+city;  
   }  
}


    

