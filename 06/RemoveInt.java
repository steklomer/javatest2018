import java.util.*;

public class RemoveInt {
  
  public static void main(String args[]) {
    System.out.println("Введите тест:");
    Scanner in = new Scanner(System.in);
    String sWord = in.next();
	sWord = sWord.replaceAll("[0-9]", "");
    System.out.println("Результат: " + sWord);
  }
}
