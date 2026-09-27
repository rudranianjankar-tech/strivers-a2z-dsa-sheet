//URL : https://www.geeksforgeeks.org/problems/number-of-factors1435/1

public class NumberOfFactors {
 public static void main(String[] args) {
    //System.out.println(bruteForce(12));
    System.out.println(optimal(12));
    System.out.println(optimal(167));
 }

 static int bruteForce(int num){
    int totalFactors = 0;

    for(int i=1;i<=num;i++){
        if(num%i==0){
           totalFactors++;
        }
    }
    return totalFactors;

 }
 static int optimal(int num){
    int totalFactors = 0;
    int sqrtNum = (int) Math.sqrt(num);

    for(int i=1;i<=sqrtNum;i++){
        if(num%i==0){
            totalFactors++;
            if(i!=num/i){
                totalFactors++;
            }
        }
    }
    return totalFactors;

 }
 int countFactors(int num){
    return optimal(num);
 }
    
}