import java.util.Scanner;

public class PrimeNum {
  
  public static void main(String args[]) {
    System.out.println("Enter positive number:");
    Scanner in = new Scanner(System.in);
    int maxNum = in.nextInt();
    System.out.println("Result:");
    for (int i = 1; i <= maxNum; i++) {
      if (isPrime(i)) {          
        System.out.println(i);
      }
    }
  }

  public static boolean isPrime(int n) {  
    if (n == 1) 
      return false;
    for (int j=2; j < n; j++) {
      if (n % j == 0)
        return false;
    }
    return true;    
  }
}
