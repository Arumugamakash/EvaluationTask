package EvaluationTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QN3 {
	public static void main(String[] args) {
		int[] arr1 = { 9, 2, 8, 1, 3, 5, 6, 7, 3, 1, 1, 6 };
		int[] arr2 = { 7, 8, 4, 6, 2, 1, 9, 9, 7 };
		int carry = 0;
		int maxSize = Math.max(arr1.length, arr2.length);
		List<Integer> ans = new ArrayList();
		int[] result = new int[maxSize];
		for (int i = 0; i < maxSize; i++) {
			int value1 = 0;
			int value2 = 0;

			if (i < arr1.length) {// 0<13
				value1 = arr1[arr1.length - 1 - i];// 6
			}
			if (i < arr2.length) {
				value2 = arr2[arr2.length - 1 - i];// 7
			}
			int sum = value1 + value2 + carry;// 13+0
			ans.add(sum % 10);
			carry = sum / 10;
		}
		for (int i = ans.size() - 1, m = 0; i >= 0; i--) {
			result[m++] = ans.get(i);
		}
		System.out.println(Arrays.toString(result));
	}

}
