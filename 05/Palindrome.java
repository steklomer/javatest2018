import java.util.*;

public class Palindrome {
  
  public static void main(String args[]) {
    System.out.println("Enter word:");
    Scanner in = new Scanner(System.in);
    String sWord = in.next();
    int len = sWord.length();
    char[] cArr = new char[len];
    char[] revArr = new char[len];
    for (int i = 0; i < len; i++) {
      cArr[i] = sWord.charAt(i);
      revArr[i] = sWord.charAt(len - 1 - i);
    }
    //System.out.println("Array: " + Arrays.toString(cArr));
    //System.out.println("Reversed array: " + Arrays.toString(revArr));
    System.out.println("Is palindrome? " + Boolean.toString(Arrays.equals(cArr, revArr)));
  }
  
  //public static char[] reverse(char[] inArr){
  //  int arrLen = inArr.length;
  //  for (int i = 0; i < arrLen / 2; i++) {
  //    char arrElem = inArr[i];
  //    inArr[i] = inArr[(arrLen-1)-i];
  //    inArr[(arrLen-1)-i] = arrElem;
  //  }
  //  return inArr;
  //}
}
