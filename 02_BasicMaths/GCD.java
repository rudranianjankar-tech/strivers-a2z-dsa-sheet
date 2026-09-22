public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(34,5));
    }
    public static int gcd(int a,int b){
        while(b!=0){
            int remainder = a%b;

            a=b;
            b = remainder;
        }
        return a;
    }

}
