public class Pattern_Problems {
    static int n;

    public static void setN(int value) {
        n = value;
    }

    public static void patternA() {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patternB() {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patternC() {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }

    public static void patternD() {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void patternE() {
        int printVal;
        for (int row = 1; row <= n; row++) {
            printVal = row % 2 == 0 ? 0 : 1;
            for (int col = 1; col <= row; col++) {
                System.out.print(printVal + " ");
                printVal = 1 - printVal;
            }
            System.out.println();
        }
    }

    public static void patternF() {
        int printVal = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(printVal++ + " ");
            }
            System.out.println();
        }
    }

    public static void patternG() {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void patternH() {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print(n - row + 1 + " ");
            }
            System.out.println();
        }
    }

    public static void patternI() {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void patternJ() {
        for (int row = 1; row <= (n * 2) - 1; row++) {
            int colTimes = row > n ? (n * 2) - row : row;
            for (int col = 1; col <= colTimes; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patternK() {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patternL() {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - (n - row) + 1; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= (n - row) + 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patternM() {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= (row * 2) - 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patternN() {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= (2 * (n - row) + 1); col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patternO() {
        for (int row = 1; row <= n*2-1; row++) {
            int rowChange = row > n ? (n * 2) - row : row;
            for (int i = 1; i <= n - rowChange; i++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= rowChange * 2 - 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
