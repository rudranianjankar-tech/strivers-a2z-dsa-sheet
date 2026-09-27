//URL : https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1

public class ArmstrongNumber01 {
    static boolean isArmstrong(int num){
        int original = num;
        int sum = 0;

        while(num>0){
            int digit = num%10;
            sum+=digit*digit*digit;
            num /= 10;
        }
        return original == sum;
    }

    
    public static void main(String[] args) {
        System.out.println(isArmstrong(567));
        System.out.println(isArmstrong(153));
    }
}
