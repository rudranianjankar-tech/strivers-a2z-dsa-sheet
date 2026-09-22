public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(palindrome(121));
    }
    static boolean palindrome(int x){
        if(x<0){
            return false;
        }

        int original = x;
        int reverse =0;

        while(x!=0){
            int digit = x%10;
            reverse = reverse*10+digit;
            x=x/10;
        }
        return original == reverse;
    }
}
