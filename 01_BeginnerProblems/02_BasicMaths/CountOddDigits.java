public class CountOddDigits{
    static int countOddDigits(int n){

        int count =0;

        while(n>0){

            int digits = n%10;

            if(digits%2!=0){
                count ++;
            }
            n=n/10;

        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countOddDigits(56736));
    }
}