public class Patterns {
    static void main() {
        int n = 5;
        // // Solid Square
        // for(int row=1; row<=n ; row++){
        // // for each row -> n column
        // for(int col=1; col<=n; col++ ){
        // // print star
        // System.out.print("* " );
        // }
        // System.out.println();
        // }

        // // Solid Rectangle
        // for (int row = 1; row <= n; row++) {
        // // for each row -> n column
        // for (int col = 1; col <= 5; col++) {
        // // print star
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // // Right angle Triangle
        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= row; col++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // //Rhombus Pattern
        // for (int row = 1; row <= n; row++) {
        // // for each row -> Spaces, Star print

        // // Spaces
        // for (int col = 1; col <= n - row; col++) {
        // System.out.print(" ");
        // }
        // // Stars
        // for (int col = 1; col <= n; col++) {
        // System.out.print("* ");
        // }
        // // move to next line
        // System.out.println();
        // }

        // // Inverted Right angle Triangle
        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n - row + 1; col++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // // Solid Pyramid Pattern
        // for (int row = 1; row <= n; row++) {
        // // for each row -> Spaces, Star print

        // // Spaces
        // for (int col = 1; col <= n - row; col++) {
        // System.out.print(" ");
        // }
        // // Stars
        // for (int col = 1; col <= 2*row-1; col++) {
        // System.out.print("*");
        // }
        // // move to next line
        // System.out.println();
        // }

        // // // Inverted Solid Pyramid Pattern
        // for (int row = 1; row <= n; row++) {
        // // for each row -> Spaces, Star print

        // // Spaces
        // for (int spc = 1; spc <=row-1; spc++) {
        // System.out.print(" ");
        // }
        // // Stars
        // for (int col = 1; col <= 2*n-2*row+1; col++) {
        // System.out.print("*");
        // }
        // // move to next line
        // System.out.println();
        // }

        // // Hollow Square
        // for (int row = 1; row <= n; row++) {
        // // for each row -> 6 columns

        // // Stars
        // for (int col = 1; col <= 6; col++) {
        // if (row == 1 || row == n || col == 1 || col == 6) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // // move to next line
        // System.out.println();
        // }

        // // Hollow Right Angle Triangle
        // for (int row = 1; row <= n; row++) {
        // // for each row -> Variable

        // // Stars
        // if (row == 1 || row == 2 || row == n) {
        // for (int col = 1; col <= row; col++)
        // System.out.print("* ");
        // } else {
        // System.out.print("* ");

        // for (int col = 1; col <= (row - 2); col++) {
        // System.out.print(" ");

        // System.out.print("* ");
        // }
        // }
        // // move to next line
        // System.out.println();
        // }

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= 2 * (n - row); col++) {
                System.out.print(" ");
            }

            if (row == 1 || row == n) {
                for (int col = 1; col <= 2 * row - 1; col++) {
                    System.out.print("* ");
                }
            } else {
                System.out.print("* ");

                for (int col = 1; col <= 2 * row - 3; col++) {
                    System.out.print("  ");
                }

                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
