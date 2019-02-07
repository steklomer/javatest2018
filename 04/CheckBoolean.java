import java.util.*;

public class CheckBoolean {
  
  public static void main(String args[]) {
    int ElemCount = 4;
    int TrueCount = 2;
    boolean[] bArr = new boolean[ElemCount];
    System.out.println("Введите " + ElemCount + " логических значений");
    for (int i = 0; i < ElemCount; i++) {
      System.out.println(i+1 +":");
      Scanner in = new Scanner(System.in);
      bArr[i] = in.nextBoolean();
    }
    System.out.println("Массив:" + Arrays.toString(bArr));
    int cnt = 0;
    for (int i = 0; i < ElemCount; i++) {
      if (bArr[i])
        cnt++;
      if (cnt > TrueCount)
        break;
    }
    System.out.println("Результат:" + Boolean.toString(cnt == TrueCount));    
  
  }
}
