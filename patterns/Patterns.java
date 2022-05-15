package patterns;

//All patterns questions
//https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md
public class Patterns {
    public static void main(String[] args) {
        pattern22(5);
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            //for every row,run col
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            //when one row is printed, add new a line
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            //for every row,run col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            //when one row is printed, add new a line
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            //for every row,run col
            for (int col = 1; col <= (n + 1) - row; col++) {
                System.out.print("* ");
            }
            //when one row is printed, add new a line
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            //for every row,run col
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            //when one row is printed, add new a line
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 1; row <= (2 * n - 1); row++) {
            //for every row,run col
            int totalColumnInRow = 1; //any dummy value
            if (row <= n) {
                totalColumnInRow = row; //for upper part when row <= n
            } else {
                totalColumnInRow = 2 * n - row; //for lower part when row > n
            }

            for (int col = 1; col <= totalColumnInRow; col++) {
                System.out.print("* ");
            }

            //when one row is printed, add new a line
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            //for every row,run col
            int totalColumnInRow = 1; //any dummy value
            int noOfSpace = 1;
            if (row <= n) {
                totalColumnInRow = row; //for upper part when row <= n
            } else {
                totalColumnInRow = 2 * n - row; //for lower part when row > n
            }

            noOfSpace = n - totalColumnInRow;

            for (int space = 1; space <= noOfSpace; space++) {
                System.out.print("  ");
            }

            for (int col = 1; col <= totalColumnInRow; col++) {
                System.out.print("* ");
            }

            //when one row is printed, add new a line
            System.out.println();
        }
    }

    static void pattern17(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int totalColInRow = 1;
            int totalSpaces = 1;

            if (row <= n) {
                totalColInRow = row;
            } else {
                totalColInRow = 2 * n - row;
            }

            totalSpaces = n - totalColInRow;

            for (int space = 1; space <= totalSpaces; space++) {
                System.out.print("  ");
            }

            for (int col = totalColInRow; col >= 1; col--) {
                System.out.print(col + " ");
            }

            for (int col = 2; col <= totalColInRow; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }

//            ****
//            *  *
//            *  *
//            *  *
//            ****
    static void pattern20(int n) {
        for (int row = 1; row <= n; row++) {
            //for every row,run col
            if (row == 1 || row == n) {
                for (int col = 1; col <= n - 1; col++) {
                    System.out.print("* ");
                }
            } else {
                for (int col = 1; col <= n - 1; col++) {
                    if (col == 1 || col == n - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            //when one row is printed, add new a line
            System.out.println();
        }
    }

//    1
//    0 1
//    1 0 1
//    0 1 0 1
//    1 0 1 0 1
    static void pattern22(int n){
        int start = 1;

        for(int row = 1; row <= n; row++){
            if(row % 2 != 0){
                start = 1;
            } else {
                start = 0;
            }

            for(int col = 1; col <= row; col++){
                if(start == 1){
                    if(col % 2 != 0) {
                        System.out.print("1 ");
                    } else {
                        System.out.print("0 ");
                    }
                } else {
                    if(col % 2 != 0) {
                        System.out.print("0 ");
                    } else {
                        System.out.print("1 ");
                    }
                }
            }
            System.out.println();
        }
    }

    static void pattern24(int n) {
        for (int row = 1; row <= n; row++) { //for upper left part
            //for every row,run col
            int totalColumnInRow = 1; //any dummy value
            int noOfSpaces = 1;       //any dummy value
            if (row <= n) {
                totalColumnInRow = row; //for upper part when row <= n
            } else {
                totalColumnInRow = 2 * n - row; //for lower part when row > n
            }

            noOfSpaces = n - totalColumnInRow;


            if (row == 1 || row == 2) {
                for (int col = 1; col <= totalColumnInRow; col++) {
                    System.out.print("* ");
                }

                for (int space = 1; space <= noOfSpaces; space++) {
                    System.out.print("  ");
                }

                for (int space = 1; space <= noOfSpaces; space++) {
                    System.out.print("  ");
                }

                for (int col = 1; col <= totalColumnInRow; col++) {
                    System.out.print("* ");
                }

            } else {
                for (int col = 1; col <= totalColumnInRow; col++) {
                    if (col == 1 || col == totalColumnInRow) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            //when one row is printed, add new a line
            System.out.println();
        }

        for (int row = n; row >= 1; row--) { //for down left part
            //for every row,run col
            if (row == 1 || row == 2) {
                for (int col = 1; col <= row; col++) {
                    System.out.print("* ");
                }
            } else {
                for (int col = 1; col <= row; col++) {
                    if (col == 1 || col == row) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            //when one row is printed, add new a line
            System.out.println();
        }
    }

    static void pattern28(int n) {
        for (int row = 1; row <= (2 * n - 1); row++) {
            int totalColumnInRow = 1; //any dummy value
            int noOfSpaces = 1;       //any dummy value
            if (row <= n) {
                totalColumnInRow = row; //for upper part when row <= n
            } else {
                totalColumnInRow = 2 * n - row; //for lower part when row > n
            }

            noOfSpaces = n - totalColumnInRow;

            for (int i = 1; i <= noOfSpaces; i++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= totalColumnInRow; col++) {
                System.out.print("* ");
            }

            //when one row is printed, add new a line
            System.out.println();
        }
    }

    static void pattern29(int n) { //pattern19 also same problem
        for (int row = 1; row <= (2 * n - 1); row++) {
            int totalColumnInRow = 1; //any dummy value
            int noOfSpaces = 1;       //any dummy value
            if (row <= n) {
                totalColumnInRow = row; //for upper part when row <= n
            } else {
                totalColumnInRow = 2 * n - row; //for lower part when row > n
            }

            noOfSpaces = n - totalColumnInRow;

            for (int col = 1; col <= totalColumnInRow; col++) {
                System.out.print("* ");
            }

            for (int space = 1; space <= noOfSpaces; space++) {
                System.out.print("  ");
            }

            for (int space = 1; space <= noOfSpaces; space++) {
                System.out.print("  ");
            }

            for (int col = 1; col <= totalColumnInRow; col++) {
                System.out.print("* ");
            }

            //when one row is printed, add new a line
            System.out.println();
        }
    }

    static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {

            for (int toltalSpaces = 1; toltalSpaces <= (n - row); toltalSpaces++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }

            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }

    static void pattern31(int n) {
        int originalN = n;
        n = 2 * n - 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row - 1, col - 1), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }

    static void pattern32(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = (n + 1) - row; col <= n; col++) {
                char ch = (char) ('A' + col - 1);
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    static void pattern33(int n) {
        int count = 1;
        char ch = 'a';

        for (int row = 1; row <= n; row++) {
            for (int col = row; col >= 1; col--) {

                if (count % 2 == 0) {
                    ch = (char) (ch - 32); //ch  - 32 => convert to upper case
                }

                System.out.print(ch + " ");
                ch = count % 2 == 0 ? (char) (ch + 32) : ch; //ternary operator => ? :
                //ch  + 32 => convert to lower case
                ch++;
                count++;
            }
            System.out.println();
        }
    }

    static void pattern34(int n) {
        for (int row = 1; row <= n; row++) {

            for (int col = (n + 1) - row; col >= 1; col--) {
                char ch = (char) ('A' + col - 1);
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    static void pattern35(int n) { //working upto n = 9
        for (int row = 1; row <= n; row++) {
            int totalColInRow = row;
            int totalSpace = n - totalColInRow;

            for (int col = 1; col <= totalColInRow; col++) {
                System.out.print(col + " ");
            }

            for (int space = 1; space <= 2 * totalSpace; space++) { //for first half & second half spaces
                System.out.print("  ");
            }

            for (int col = totalColInRow; col >= 1; col--) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
