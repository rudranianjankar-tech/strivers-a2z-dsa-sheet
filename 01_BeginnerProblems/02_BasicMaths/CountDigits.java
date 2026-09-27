class CountDigits{
    public static void main (String args[]){
        System.out.println(Countdigits(3456));

    }
    static int Countdigits(int n){
      if(n==0){
        return 1;
      }

      int count =0;

      while(n>0){
        n=n/10;
        count++;
      }
      return count;
    
    }
}