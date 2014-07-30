public class _2_3_5 {

	/**
	 * @param args
	 * @category binary search 已知A是有序的可能 存在，也可能不存在
	 */
	public static void main(String[] args) {
		int A[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(binarySearch(A, 0, A.length - 1, 11));

	}

	public static int binarySearch(int[] a, int aBegin, int aEnd, int value) {
		if (aBegin <= aEnd) {
			int middle = (aBegin + aEnd) / 2;
			if (a[middle] == value) {
				return middle;
			} else if (a[middle] < value) {
				return binarySearch(a, middle + 1, aEnd, value);
			} else {
				return binarySearch(a, aBegin, middle - 1, value);
			}
		}
		return -1;
	}

}
