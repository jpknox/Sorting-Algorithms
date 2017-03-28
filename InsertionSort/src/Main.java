import static java.lang.System.out;

public class Main {

	private static Gui gui;
	private static ArrayGenerator arrayGenerator;
	private static InsertionSort insertionSort;

	public static void main(String[] args) {

		gui = new Gui();
		arrayGenerator = new ArrayGenerator();
		insertionSort = new InsertionSort();

		int[] unsorted = arrayGenerator.generateInt(6);
		out.printf("Unsorted\t : %s\n", gui.display(unsorted));

		int[] sortedAscending = insertionSort.insertionSort(unsorted);
		out.printf("Sorted\t : %s\n", gui.display(sortedAscending));
	}
}
