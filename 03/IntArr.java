import java.util.*;

public class IntArr {

  public static void main(String args[]) {
	Scanner in = new Scanner(System.in);
  System.out.println("Enter integer array separated with space (enter letter to stop):");
	ArrayList<Integer> list = new ArrayList<Integer>();
	while (in.hasNextInt()) {
	  list.add(in.nextInt());
	}
	int[] iArr = list.stream().mapToInt(i->i).toArray();
	Arrays.sort(iArr);
	int arrLen = iArr.length;
	// System.out.println(arrLen);
	for (int i = 0; i < arrLen / 2; i++) {
	  int arrElem = iArr[i];
	  iArr[i] = iArr[(arrLen-1)-i];
	  iArr[(arrLen-1)-i] = arrElem;
	}
	System.out.println("Result: " + Arrays.toString(iArr));
  }
}
