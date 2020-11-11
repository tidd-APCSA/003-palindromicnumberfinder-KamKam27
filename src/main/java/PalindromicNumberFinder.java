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
      int NP = 0;
      for(int i = num + 1; i > num; i++){
        if(testPalindromicNum(i) == true){
          NP = i;
          break;
        }else{
          NP = 1;
        }
      }
      return NP - num;
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
        String Pnum = Integer.toString(num);
        String Rnum = "";
      for( int i = Pnum.length() - 1; i >= 0; i--){
            Rnum += Pnum.charAt(i);
     }
     return Rnum;

    }


    @Override
    public String toString(){
        return "You'd have to drive " + searchForPalindromicNum(this.num) + " miles";
    }
}
