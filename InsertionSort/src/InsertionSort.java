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
			int newValue = sorted[j];
			gui.display("Key is ", newValue);
			int holePosition = j;
			while ( (holePosition > 0) && ( sorted[holePosition-1] > newValue ) ) {
				out.printf("%d at %d is bigger than %d at %d.\n", sorted[holePosition-1], holePosition-1, newValue, holePosition);
				out.printf("Shifting %d in to %d. ", sorted[holePosition], sorted[holePosition-1]);
				sorted [holePosition] = sorted [holePosition-1];
				holePosition--;
			}
			sorted[holePosition] = newValue;
			out.printf("%s\n\n", gui.display(sorted));

		}
		return sorted;
	}

}
