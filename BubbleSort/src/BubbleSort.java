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


	public int sortAscendingV2(int[] array) {
		int outer, inner;
		int length = array.length;
		boolean swapped;
		int swaps = 0;

		for (outer = length-1; outer < length; outer--) {
			swapped = false;
			for (inner = 0; inner < outer; inner++) {
				if (array[inner] > array[inner+1]) {
					swap(array, inner, inner+1);
					swaps++;
					swapped = true;
				}
			}
			if (!swapped && outer == length-1) {
				System.out.printf("The array happens to already be sorted. Swaps %d\n", swaps);
				break;
			}
		}
		return swaps;
	}

	public int sortDescendingV2(int[] array) {
		int outer, inner;
		int length = array.length;
		boolean swapped;
		int swaps = 0;

		for (outer = length-1; outer < length; outer--) {
			swapped = false;
			for (inner = 0; inner < outer; inner++) {
				if (array[inner] < array[inner+1]) {
					swap(array, inner, inner+1);
					swaps++;
					swapped = true;
				}
			}
			if (!swapped && outer == length-1) {
				System.out.printf("The array happens to already be sorted. Swaps %d\n", swaps);
				break;
			}
		}
		return swaps;
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

	private void swap(int[] toSort, int a, int b) {
		int temp = toSort[a];
		toSort[a] = toSort[b];
		toSort[b] = temp;
	}


}
