public class Main {

	private static Gui gui;
	private static BubbleSort bubbleSort;
	private static ArrayGenerator arrayGenerator;

	public static void main(String[] args) {
		gui = new Gui();
		bubbleSort = new BubbleSort();
		arrayGenerator = new ArrayGenerator();
		int[] unsorted = arrayGenerator.generateInt(6);

		gui.display("Unsorted\t : {", unsorted, " }");
		int[] sortedAscending = bubbleSort.sortAscending(unsorted);
		gui.display("Ascending\t : {", sortedAscending, " }");

		int[] sortedDescending = bubbleSort.sortDescending(unsorted);
		gui.display("Descending\t : {", sortedDescending, " }");
	}
}
