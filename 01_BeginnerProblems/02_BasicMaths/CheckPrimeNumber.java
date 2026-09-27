//URL : https://www.geeksforgeeks.org/problems/prime-number2314/1
public class CheckPrimeNumber {
public static void main(String[] args) {

System.out.println(isPrime(7));       
System.out.println(isPrime(25));      

System.out.println(isPrimeOptimized(7));   
System.out.println(isPrimeOptimized(25));  
}

    // Approach 1: from 2 to n-1
    static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }


    // Approach 2: Check only up to √n
    static boolean isPrimeOptimized(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / i; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
    
