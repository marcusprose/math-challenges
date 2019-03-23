public class Collatz {

  public static void main(String[] args) {
 
    collatzSequence(100);

  }
 
  public static void collatzSequence(int n){
    System.out.print(n + " ");
    if (n == 1){
      return;
    }
    if (n % 2 == 0){
      collatzSequence(n/2);
    }
    else {
      collatzSequence(3*n+1);
    }
    
  }
}
