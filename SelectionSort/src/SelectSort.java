/**
 * Created by jpknox on 23/03/17.
 */
public class SelectSort {

	ArrayGenerator arrayGenerator;

	public SelectSort() {
		this.arrayGenerator = new ArrayGenerator();
	}

	public int[] sortAscending(int[] unsorted) {
		int length = unsorted.length;
		int outer, inner, min;
		int[] sorted = arrayGenerator.copyArray(unsorted);

		for (outer = 0; outer < length-1; outer ++) {
			min = outer;
			for (inner = outer+1; inner < length; inner++) {
				if (sorted[inner] < sorted[min]) min = inner;
			}
			swap(sorted, min, outer);
		}

		return sorted;
	}

	public int[] sortDescending(int[] unsorted) {
		int length = unsorted.length;
		int outer, inner, min;
		int[] sorted = arrayGenerator.copyArray(unsorted);

		for (outer = length-1; outer > 0; outer--) {
			min = 0;
			for (inner = 1; inner <= outer; inner++) {
				if (sorted[min] > sorted[inner]) min = inner;
			}
			if (min != outer) swap(sorted, min, outer);
		}

		return sorted;
	}

	private void swap(int[] toSort, int first, int second) {
		int temp = toSort[first];
		toSort[first] = toSort[second];
		toSort[second] = temp;
	}
}
