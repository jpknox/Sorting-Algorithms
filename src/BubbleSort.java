import static java.lang.System.out;

/**
 * Created by jpknox on 23/03/17.
 */
public class BubbleSort {

	Gui gui;

	public BubbleSort() {
		this.gui = new Gui();
	}

	public int[] sort(int[] unsorted) {
		int[] toSort = copyArray(unsorted);
		int length = toSort.length;

		int outer, inner, next;

		for (outer = length-1; outer > 0; outer--) {
			for (inner = 0; inner < outer; inner++) {
				next = inner+1;
				if (toSort[inner] > toSort[next])
					swap(toSort, inner, next);
			}
		}
		return toSort;
	}

	private void swap(int[] toSort, int first, int second) {
		int temp = toSort[first];
		toSort[first] = toSort[second];
		toSort[second] = temp;
	}

	private int[] copyArray(int[] unsorted) {
		int length = unsorted.length;
		int[] copy = new int[length];
		for(int i = 0; i < length; i++) {
			copy[i] = unsorted[i];
		}
		return copy;
	}


}
