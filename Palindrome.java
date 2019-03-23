public class Palindrome {

  public static void main(String[] args) {
    System.out.println(isPalindrome("racecar"));
    System.out.println(isPalindrome("palindrome"));
    System.out.println(isPalindrome("dogeeseseegod"));

  }
  public static boolean isPalindrome(String palindrome){
    if (palindrome.length() < 2){
      return true;
    }
    String first = palindrome.substring(0, 1);
    String last = palindrome.substring(palindrome.length() - 1);
    if (first.equals(last)){
      return isPalindrome(palindrome.substring(1, palindrome.length() - 1));
    }
    else {
      return false;
    }
  }
}
