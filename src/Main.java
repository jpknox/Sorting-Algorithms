public class Main {

	private static Gui gui;
	private static BubbleSort bubbleSort;

	public static void main(String[] args) {
		gui = new Gui();
		bubbleSort = new BubbleSort();
		int[] unsorted = new int[]{7, 5, 2, 4, 3, 9};

		gui.display("Unsorted : {", unsorted, " }");
		int[] sorted = bubbleSort.sort(unsorted);
		gui.display("Sorted\t : {", sorted, " }");
	}
}
