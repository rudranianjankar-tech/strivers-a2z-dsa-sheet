public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(perfectNumber(56));
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
}
