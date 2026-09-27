public class Patterns {

    public static void main(String[] args) {

        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
        pattern6(5);
        pattern7(5);
        pattern8(5);
        pattern9(5);
        pattern10(5);
        pattern11(5);
        pattern12(5);
        pattern13(5);
        pattern14(5);
        pattern15(5);
        pattern16(5);
        pattern17(5);
        pattern18(5);
        pattern19(5);
        pattern20(5);
        pattern21(5);
        pattern22(5);
    }

    // Pattern 1
    static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Pattern 2
    static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Pattern 3
    static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Pattern 4
    static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // Pattern 5
    static void pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    // Pattern 6
    static void pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // Pattern 7
    static void pattern7(int n) {
        for (int i = 0; i < n; i++) {

            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // star
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    // Pattern 8
    static void pattern8(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    // Pattern 9
    static void pattern9(int n) {

        // Pattern 7
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Pattern 8
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    // Pattern 10
    static void pattern10(int n) {
        for (int i = 0; i <= 2 * n - 1; i++) {

            int stars = i;

            if (i > n)
                stars = 2 * n - i;

            for (int j = 0; j <= stars; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    // Pattern 11
    static void pattern11(int n) {
        for (int i = 0; i < n; i++) {

            int start = 1;

            if (i % 2 == 0)
                start = 1;
            else
                start = 0;

            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }

            System.out.println();
        }
    }

    // Pattern 12
    static void pattern12(int n) {

        int space = 2 * (n - 1);

        for (int i = 1; i <= n; i++) {

            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // space
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            // numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();

            space -= 2;
        }
    }

    // Pattern 13
    static void pattern13(int n) {

        int num = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = num + 1;
            }

            System.out.println();
        }
    }

    // Pattern 14
    static void pattern14(int n) {

        for (int i = 0; i < n; i++) {

            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch);
            }

            System.out.println();
        }
    }

    // Pattern 15
    static void pattern15(int n) {
        for (int i = 0; i < n; i++) {

            for (char ch = 'A'; ch <= 'A' + (n - i - 1); ch++) {
                System.out.print(ch);
            }

            System.out.println();
        }
    }

    // Pattern 16
    static void pattern16(int n) {
        for (int i = 0; i < n; i++) {

            char ch = (char) ('A' + i);

            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
            }

            System.out.println();
        }
    }

    // Pattern 17
    static void pattern17(int n) {

        for (int i = 0; i < n; i++) {

            // spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // increasing letters
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch);
            }

            // decreasing letters
            for (char ch = (char) ('A' + i - 1); ch >= 'A'; ch--) {
                System.out.print(ch);
            }

            System.out.println();
        }
    }

    // Pattern 18
    static void pattern18(int n) {

        for (int i = 0; i < n; i++) {

            char ch = (char) ('A' + n - i - 1);

            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }

            System.out.println();
        }
    }

    // Pattern 19
    static void pattern19(int n) {

        // Upper half
        for (int i = 0; i < n; i++) {

            // stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            // spaces
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int i = 0; i < n; i++) {

            // stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            // spaces
            for (int j = 0; j < 2 * (n - i - 1); j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    // Pattern 20
    static void pattern20(int n) {

        // Upper half
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < 2 * (n - i - 1); j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int i = n - 2; i >= 0; i--) {

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < 2 * (n - i - 1); j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    // Pattern 21
    static void pattern21(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    // Pattern 22
    static void pattern22(int n) {

        int size = 2 * n - 1;

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {

                int top = i;
                int left = j;
                int right = size - 1 - j;
                int bottom = size - 1 - i;

                int min = Math.min(Math.min(top, bottom),
                        Math.min(left, right));

                System.out.print(n - min);
            }

            System.out.println();
        }
    }
}