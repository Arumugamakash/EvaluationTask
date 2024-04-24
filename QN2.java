package EvaluationTask;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class QN2 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int arr[]= {4,1,2,3,1,2,5,2};
		int result[]=frequency(arr);
		System.out.println(Arrays.toString(result));
	}

	public static int[] frequency(int arr[]) {
		Map<Integer, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		System.out.println(map);
		int array2[][] = new int[map.size()][2];
		int i = 0;
		for (Map.Entry<Integer, Integer> o : map.entrySet()) {
			array2[i][0] = o.getKey();
			array2[i][1] = o.getValue();
			i++;
		}
		Arrays.sort(array2, (a1, b1) -> b1[1] - a1[1]);
		i = 0;
		for (int k = 0; i < array2.length; i++) {
			int j = 0;
			while (j++ < array2[i][1]) {
				arr[k++] = array2[i][0];
			}
		}
		return arr;
	}
}
