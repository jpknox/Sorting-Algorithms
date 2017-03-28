public class Main {

	private static Gui gui;
	private static SelectSort selectSort;
	private static ArrayGenerator arrayGenerator;

	public static void main(String[] args) {
		selectSort = new SelectSort();
		gui = new Gui();
		arrayGenerator = new ArrayGenerator();
		int[] unsorted = arrayGenerator.generateInt(6);
		selectSort = new SelectSort();

		gui.display("Unsorted\t: {", unsorted, " }");
		int[] sortedAscending = selectSort.sortAscending(unsorted);
		gui.display("Ascending\t: {", sortedAscending, " }");
		int[] sortedDescending = selectSort.sortDescending(unsorted);
		gui.display("Descending\t: {", sortedDescending, " }");

	}
}
