//URL: https://www.naukri.com/code360/problems/armstrong-number_1462443

public class ArmstrongNumber02 {
   public static void main(String[] args) {
    System.out.println(isArmstrong(1546));
    System.out.println(isArmstrong(153));
   }
   
   static boolean isArmstrong(int num){
      int original = num;

      //count no. of digits
      int temp = num;
      int digits =0;

      while(temp>0){
        digits++;
        temp /=10;
      }

      //calculate the armstrong sum
    int sum = 0;
    temp =num;

    while(temp>0){
        int digit = temp%10;
        sum+= (int) Math.pow(digit,digits);
        temp /=10;
    }
    return sum == original;

   }
    
}