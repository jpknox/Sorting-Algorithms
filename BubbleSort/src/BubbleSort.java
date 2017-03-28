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

		boolean alreadySorted = false;
		for (outer = length-1; outer > 0; outer--) {
			if (alreadySorted) {
				System.out.printf("Already sorted in ascending order.\n");
				break;
			}

			alreadySorted = true;
			for (inner = 0; inner < outer; inner++) {
				next = inner+1;
				if (toSort[inner] > toSort[next]) {
					swap(toSort, inner, next);
					alreadySorted = false;
				}

			}
		}
		return toSort;
	}

	public int[] sortDescending(int[] unsorted) {
		int[] toSort = arrayGenerator.copyArray(unsorted);
		int length = toSort.length;
		int outer, inner, next;

		boolean alreadySorted = false;
		for (outer = 0; outer < length-1; outer++) {
			if (alreadySorted) {
				System.out.printf("Already sorted in descending order.\n");
				break;
			}

			alreadySorted = true;
			for (inner = length-1; inner > outer; inner--) {
				next = inner-1;
				if (toSort[inner] > toSort[next]) {
					swap(toSort, inner, next);
					alreadySorted = false;
				}
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
