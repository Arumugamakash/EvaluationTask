package EvaluationTask;

public class QN4 {
	public static void main(String[] args) {
//		int arr[] = { 2, 7, 5, -1, -3, 2, 9, 7 };
		int arr[] = { 3, -1, 6, 1, -5, 1, 3, -8 };
		findSubArray(arr);
	}

	private static void findSubArray(int[] arr) {
		int sum = 0;
		String s1="";
		String s2="";
		int maxSum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				sum += arr[i];
				s1+=arr[i]+" ";
			} else {
				sum = 0;
				s1="";
			}
			if(maxSum<sum) {
				maxSum=sum;
				s2=s1;
			}
		}
		System.out.println("Elements : "+s2);
		System.out.println("Sum : "+maxSum);
	}

}
