package EvaluationTask;

import java.util.Scanner;

public class QN5 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Array Size : ");
		int size = scanner.nextInt();
		int matrix[][] = new int[size][size];
		int half = matrix.length / 2;// 2
		int first = 0;
		int last = matrix.length - 1;// 4
		while (first <= half) {// 0<=2
			if (first % 2 == 0) {
				for (int i = first; i <= last; i++) {
					matrix[first][i] = 1;

				}
				for (int i = first; i <= last; i++) {
					matrix[i][last] = 1;
					;
				}

				for (int i = last; i >= first; i--) {
					matrix[last][i] = 1;

				}

				for (int i = last; i >= first; i--) {
					matrix[i][first] = 1;

				}
			}
			first++;
			last--;
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

}
