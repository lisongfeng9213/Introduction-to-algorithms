

public class _6_5_8 {

	static int maxHeapSize = 5;
	static Node[] nodeArr = new Node[5];

	static int[] A = new int[] { 47, 40, 39, 34, 21, 12 };
	static int[] B = new int[] { 50, 38, 36, 35, 31, 30, 24, 23, 19, 18, 9, 4,
			3 };
	static int[] C = new int[] { 49, 42, 37, 33, 32, 28, 26, 25, 20, 15, 14, 8 };
	static int[] D = new int[] { 44, 43, 27, 22, 17, 10, 7, 6, 2, 1 };
	static int[] E = new int[] { 48, 46, 45, 41, 29, 16, 13, 11, 5 };
	static LinkedLists linkList0 = new LinkedLists(A, 0);
	static LinkedLists linkList1 = new LinkedLists(B, 1);
	static LinkedLists linkList2 = new LinkedLists(C, 2);
	static LinkedLists linkList3 = new LinkedLists(D, 3);
	static LinkedLists linkList4 = new LinkedLists(E, 4);

	static Node iterator0 = linkList0.headNode;
	static Node iterator1 = linkList1.headNode;
	static Node iterator2 = linkList2.headNode;
	static Node iterator3 = linkList3.headNode;
	static Node iterator4 = linkList4.headNode;

	public static void main(String[] args) {
		new _6_5_8().buildMaxHeap();
		for (int i = 0; i < nodeArr.length; i++) {
			System.out.println(nodeArr[i].value);
		}
		while (maxHeapSize > 0) {
			int list = nodeArr[0].list;
			switch (list) {
			case 0:
				if (iterator0 != null) {
					System.out.print(nodeArr[0].value + "__>");
					nodeArr[0] = iterator0;
					maxHeapify(0);
					iterator0 = iterator0.next;
				} else if (iterator0 == null) {
					System.out.print(nodeArr[0].value + "__>");
					nodeArr[0] = nodeArr[maxHeapSize - 1];
					maxHeapSize--;
					maxHeapify(0);
				}
				break;
			case 1:
				if (iterator1 != null) {
					System.out.print(nodeArr[0].value + "__>");
					nodeArr[0] = iterator1;
					maxHeapify(0);
					iterator1 = iterator1.next;
				} else if (iterator1 == null) {
					System.out.print(nodeArr[0].value + "__>");
					nodeArr[0] = nodeArr[maxHeapSize - 1];
					maxHeapSize--;
					maxHeapify(0);
				}
				break;
			case 2:
				if (iterator2 != null) {
					System.out.print(nodeArr[0].value + "__>");
					nodeArr[0] = iterator2;
					maxHeapify(0);
					iterator2 = iterator2.next;
				} else if (iterator2 == null) {
					System.out.print(nodeArr[0].value + "__>");
					nodeArr[0] = nodeArr[maxHeapSize - 1];
					maxHeapSize--;
					maxHeapify(0);
				}
				break;
			case 3:
				if (iterator3 != null) {
					System.out.print(nodeArr[0].value + "__>");
					nodeArr[0] = iterator3;
					maxHeapify(0);
					iterator3 = iterator3.next;
				} else if (iterator3 == null) {
					System.out.print(nodeArr[0].value + "__>");
					nodeArr[0] = nodeArr[maxHeapSize - 1];
					maxHeapSize--;
					maxHeapify(0);
				}
				break;
			case 4:
				if (iterator4 != null) {
					System.out.print(nodeArr[0].value + "__>");
					nodeArr[0].value = iterator4.value;
					maxHeapify(0);
					iterator4 = iterator4.next;
				} else if (iterator4 == null) {
					System.out.print(nodeArr[0].value + "__>");
					nodeArr[0] = nodeArr[maxHeapSize - 1];
					maxHeapSize--;
					maxHeapify(0);
				}
				break;
			}
		}

	}

	public void buildMaxHeap() {
		nodeArr[0] = iterator0;
		nodeArr[1] = iterator1;
		nodeArr[2] = iterator2;
		nodeArr[3] = iterator3;
		nodeArr[4] = iterator4;

		for (int i = maxHeapSize / 2 - 1; i >= 0; i--) {
			maxHeapify(i);
		}

		iterator0 = iterator0.next;
		iterator1 = iterator1.next;
		iterator2 = iterator2.next;
		iterator3 = iterator3.next;
		iterator4 = iterator4.next;

	}

	public static void maxHeapify(int i) {
		int l = leftChild(i);
		int r = rightChild(i);
		int largest;
		if (l <= maxHeapSize - 1 && nodeArr[l].value > nodeArr[i].value) {
			largest = l;
		} else {
			largest = i;
		}
		if (r <= maxHeapSize - 1 && nodeArr[r].value > nodeArr[largest].value) {
			largest = r;
		}
		if (largest != i) {
			Node temp = new Node();
			temp = nodeArr[largest];
			nodeArr[largest] = nodeArr[i];
			nodeArr[i] = temp;
			maxHeapify(largest);
		}

	}

	public int parent(int i) {
		return (i + 1) / 2 - 1;
	}

	public static int leftChild(int i) {
		return i * 2 + 1;
	}

	public static int rightChild(int i) {
		return i * 2 + 2;
	}

}


//LinkedLists.java
public class LinkedLists {
	Node headNode = null;

	public LinkedLists() {
	}

	public LinkedLists(int[] A, int list) {
		Node no1 = new Node(list, A[0], null);
		headNode = no1;
		for (int i = 1; i < A.length; i++) {
			Node tempNode = new Node(list, A[i], null);
			no1.next = tempNode;
			no1 = tempNode;
		}
	}

}

//Node.java
public class Node {
	int list;
	int value;
	Node next;

	public Node(int list, int value, Node next) {
		this.list = list;
		this.value = value;
		this.next = next;
	}

	public Node() {
		// TODO Auto-generated constructor stub
	}


}


