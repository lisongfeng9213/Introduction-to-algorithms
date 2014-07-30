/*
 * 插入排序的递归过程 
 */
public class _2_3_4 {
	public static void main(String[] args)
	{
		int []A = new int[] {6,4 , 2, 11, 22, 67, 54,32, 21, 11,  1,  2,  5,  9};
		recurrenceInsertSorting(A, 0, A.length-1);
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
	}
	public static void recurrenceInsertSorting(int A[], int p, int q) {
		if (q - p == 0) {
			return;
		} else {
			recurrenceInsertSorting(A, p, q - 1);
			sortArray(A, p, q - 1,q);
		}
	}

	private static void sortArray(int[] a, int p, int i, int q) {
		int temp = a[q];
		int k = i;// k是个数组的下表，用来表示停到哪一位
		for (; k >= 0 && a[k] > temp; k--) {
			a[k + 1] = a[k];
		}
		a[k+1] = temp;

	}
}
