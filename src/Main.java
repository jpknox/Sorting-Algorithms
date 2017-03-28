public class Main {

	private static Gui gui;
	private static BubbleSort bubbleSort;
	private static ArrayGenerator arrayGenerator;

	public static void main(String[] args) {
		gui = new Gui();
		bubbleSort = new BubbleSort();
		arrayGenerator = new ArrayGenerator();
		int[] unsorted = arrayGenerator.generateInt(6);
//		int[] unsorted = new int[] {0, 1, 2, 3, 4, 5};
//		int[] unsorted = new int[] {5, 4, 3, 2, 1, 0};

		gui.display("Unsorted\t : {", unsorted, " }");
		int[] sortedAscending = bubbleSort.sortAscending(unsorted);
		gui.display("Ascending\t : {", sortedAscending, " }");

		int[] sortedDescending = bubbleSort.sortDescending(unsorted);
		gui.display("Descending\t : {", sortedDescending, " }");
	}
}
