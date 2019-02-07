import java.util.Scanner;

public class FibonacciNum {

  public static void main(String args[]) {
    System.out.println("Введите положительное число:");
    Scanner in = new Scanner(System.in);
    int maxNum = in.nextInt();
    System.out.println("Результат:");
    for (int i=0; i < maxNum; i++) {
      System.out.println(getFib(i));
    }
  }
  
  public static int getFib(int n) {
    if (n == 0 || n == 1) {
      return n;
    } else {
      return getFib(n - 1) + getFib(n - 2);
    }
  }
}
