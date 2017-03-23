import static java.lang.System.out;
/**
 * Created by jpknox on 23/03/17.
 */
public class InsertionSort {

	private ArrayGenerator arrayGenerator;
	private Gui gui;

	public InsertionSort() {
		this.arrayGenerator = new ArrayGenerator();
		this.gui = new Gui();
	}

	public int[] insertionSort(int array[]) {
		int[] sorted = arrayGenerator.copyArray(array);
		int n = sorted.length;
		for (int j = 1; j < n; j++) {
			int key = sorted[j];
			gui.display("Key is ", key);
			int i = j-1;
			while ( (i > -1) && ( sorted [i] > key ) ) {
				out.printf("%d at %d is bigger than key of %d at %d.\n", sorted[i], i, key, j);
				out.printf("Shifting %d in to %d. ", sorted[i], sorted[i+1]);
				sorted [i+1] = sorted [i];
				i--;
			}
			sorted[i+1] = key;
			out.printf("%s\n\n", gui.display(sorted));

		}
		return sorted;
	}

}
