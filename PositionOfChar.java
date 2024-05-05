public class PositionOfChar {
    public static void main(String[] args) {
        
//          12. Check what is the number of letter for "K" String: ABCDEFGHIJKLMNOPQRSTUVWXYZ 
//              Example: for D number should be 4 
            String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

            for(int i=0;i<str.length();i++){
                if (str.charAt(i)=='D'){
                    System.out.println(i+1);
                }
            }
            char letter = 'K';
            int count = 0;
                for (char c : str.toCharArray()) {
                    if (c=='K') {
                        System.out.println(c);
                        break;
                    }
                    else{
                    count++;
                    
                }
            }
            System.out.println(count);

            // String method indexOf return position
            System.out.println(str.indexOf("K"));

    
    }
}
