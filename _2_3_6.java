public class _2_3_6 {


	public static void main(String[] args) {
		int A[] = new int[] { 0, 1, 3, 3, 4, 5, 6, 7, 16, 17,10};
		int temp = A[A.length-1];
		int pos = binarySearchLocation(A, 0, A.length - 2, A[A.length-1]);
		System.out.println("pos:"+pos);
		int i = A.length-2;//很经典的方法。
		for(;i>=pos;i--){
			A[i+1] = A[i];
		}
		A[i+1] = temp;
		for (int j = 0; j < A.length; j++) {
			System.out.println(A[j]);
		}

	}

	public static int binarySearchLocation(int[] a, int aBegin, int aEnd,
			double d) {
		if (aBegin < aEnd) {
			int middle = (aBegin + aEnd) / 2;
			if (a[middle] == d) {
				return middle;
			} else if (a[middle] < d) {
				return binarySearchLocation(a, middle + 1, aEnd, d);
			} else {
				return binarySearchLocation(a, aBegin, middle, d);//这里不是Middle-1，而是middle，
				//是为了防止出现有aBgin>aEnd情况
			}
		} else {
			if (a[aBegin] > d) {
				return aBegin;
			} else {
				return aBegin + 1;
			}
		}
	}

}
