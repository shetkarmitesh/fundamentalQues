public class PrintTable {
    public static void main(String[] args) {
        
                // 15. Print the mathmatical table for 5. 
                int num=5;
                for (int i = 1; i <=10; i++) {
                    System.out.println(i*num);
                    
                }


                System.out.println("calling by recursive function ");
                printTable(10,1);
                // multiplier iterate from 1 to 10 and return from function while 11 
    }

     static void printTable(int num,int multiplier){
        if (multiplier==11) {
            return;
        }
        System.out.println(multiplier*num);
        
        printTable(num,multiplier+1);
     }
}
