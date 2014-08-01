public class _7_QuickSort {


	public static void main(String[] args) {

		int[] B = new int[] { 50, 38, 36, 35, 31, 30, 24, 23, 19, 18, 9, 4, 3 };
		
		for (int i : B) {
			System.out.print(i+"__");
		}
		System.out.println();
		quickSort(B, 0, B.length - 1);
		for (int i : B) {
			System.out.print(i+"__");
		}
	}

	public static void quickSort(int[] A, int p, int q) {
		if (p < q) {
			int r = partition(A, p, q);
			quickSort(A, p, r - 1);
			quickSort(A, r + 1, q);
		}
	}

	public static int partition(int[] A, int p, int q) {
		int i = p;
		for (int j = p; j <= q - 1; j++) {
			if (A[j] < A[q]) {
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
				i++;
			}
		}
		int temp = A[i];
		A[i] = A[q];
		A[q] = temp;
		System.out.println("i:"+i);
		return i;
		
	}

}
