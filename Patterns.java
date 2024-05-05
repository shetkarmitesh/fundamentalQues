public class Patterns {
    public static void main(String[] args) {

        // * * * * * 
        // * * * * * 
        // * * * * *
        // * * * * *
        // * * * * *
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // *
        // * *
        // * * *
        // * * * *
        // * * * * *

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }





    //      *
    //     * *
    //    * * *
    //   * * * *
    //  * * * * *
        for (int i = 0; i < 5; i++) {
            // used to print white spaces
            for (int j = 0; j < 5-i-1; j++) {
                System.out.print(" ");
            }
            // used to print *
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            
        }



    //      *
    //     **
    //    ***
    //   ****
    //  *****
        for (int i = 0; i < 5; i++) {
            // used to print white spaces
            for (int j = 0; j < 5-i-1; j++) {
                System.out.print(" ");
            }
            // used to print *
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    //      1
    //     222
    //    33333
    //   4444444
    //  555555555

        for (int i = 1; i < 6; i++) {
            // used to print white spaces
            for (int j = 1; j < 6-i; j++) {
                System.out.print(" ");
            }
            // used to print 1 to 5
            for (int j = 1; j <i*2; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

    //      1
    //     212
    //    32123
    //   4321234
    //  543212345

    // incorrect code rewrite the code again with new logic
        for (int i = 1; i < 6; i++) {
            // used to print white spaces
            for (int j = 1; j < 6-i; j++) {
                System.out.print(" ");
            }
            // used to print 1 to 5
            for (int j = 1; j <i*2; j++) {
                System.out.print(i);
            }
            System.out.println();
        }


        




    }

}
