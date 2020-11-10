public class PalindromicNumberFinder {
    private int num;

    // constructor
    public PalindromicNumberFinder(int num){
        this.num = num;
    }

    // accessor/getter method
    public int getNum(){
        return this.num;
    }

    // this method should find the next palindromic number
    public int searchForPalindromicNum(int num){
      int NP;
      for(int i = num + 1; i > num; i++){
        if(testPalindromicNum(i) == true){
          NP = i;
        }else{
          NP = i - 1;
        }
      }
      return NP;
    }

    // this is a helper method for searchForPalindromicNum. It's purpose is to test if a number is actually a palindrome
    public boolean testPalindromicNum(int num){
      String PD = Integer.toString(num);
      if(reverseNum(num).equals(PD)){
        return true;
      }else{
        return false;
      }
    
    }

    // this is a helper method for testPalindromicNum. It should reverse the number and return it.
    public String reverseNum(int num){
        String PR = Integer.toString(num);
        String RW = "";
      for( int i = PR.length() - 1; i >= 0; i--){
      RW += PR.charAt(i);
     }
     return RW;

    }


    @Override
    public String toString(){
        return "You'd have to drive " + searchForPalindromicNum(this.num) + " miles";
    }
}
