//URL :https://leetcode.com/problems/perfect-number/

public class PerfectNumber {
    public static void main(String[] args) {
       // System.out.println(perfectNumber(56));
       System.out.println(isPerfect(28));
    }
    public static boolean perfectNumber(int num){
        int sum =0 ;

        for(int i =1;i<num;i++){
            if(num%i==0){
                sum = sum+i;
            }
        }
        return sum == num;

    }
    static boolean isPerfect(int num) {

        if (num <= 1) {
            return false;
        }

        int sum = 1;

        for (int i = 2; i <= num / i; i++) {

            if (num % i == 0) {
                sum += i;

                int pair = num / i;

                if (pair != i) {
                    sum += pair;
                }
            }
        }

        return sum == num;
    }}
    

