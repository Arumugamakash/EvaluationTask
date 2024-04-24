package EvaluationTask;

import java.util.Scanner;

public class QN1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input");
		char inp = sc.next().charAt(0);
		int len = (inp - 64);
		System.out.println(len);
		char start = 'A';
		for (int i = 0; i < (inp - 64); i++) {
			for (int j = 0; j < (inp - 64) * 2; j++) {
				if (j == len - i - 1) {
					System.out.print(start);
				} else if (j == (len + i - 1)) {
					System.out.print(start);
				} else {
					System.out.print(" ");
				}
			}
			start++;
			System.out.println();
		}
		start--;
		for (int i = 1; i < (inp - 64); i++) {
			start--;
			for (int j = 0; j < (inp - 64) * 2; j++) {
				if (j == i || j == (len * 2) - i - 2) {
					System.out.print(start);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
