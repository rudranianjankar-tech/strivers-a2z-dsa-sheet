//URL : https://leetcode.com/problems/count-primes/

public class CountPrimes {

public int countPrimes(int n) {

    if (n <= 2) {
        return 0;
    }

    boolean[] isComposite = new boolean[n];
    int count = 0;

    for (int i = 2; i < n; i++) {

    if (!isComposite[i]) {
        count++;


     if (i <= n / i) {
        for (int j = i * i; j < n; j += i) {
            isComposite[j] = true;
        }
}
}}

return count;
}
}


    
