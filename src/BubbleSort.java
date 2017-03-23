/**
 * Created by jpknox on 23/03/17.
 */
public class BubbleSort {

	private Gui gui;
	private ArrayGenerator arrayGenerator;


	public BubbleSort() {
		this.gui = new Gui();
		this.arrayGenerator = new ArrayGenerator();
	}

	public int[] sortAscending(int[] unsorted) {
		int[] toSort = arrayGenerator.copyArray(unsorted);
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

	public int[] sortDescending(int[] unsorted) {
		int[] toSort = arrayGenerator.copyArray(unsorted);
		int length = toSort.length;

		int outer, inner, next;

		for (outer = 0; outer < length-1; outer++) {
			for (inner = length-1; inner > outer; inner--) {
				next = inner-1;
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


}
