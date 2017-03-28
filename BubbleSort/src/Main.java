public class Main {

	private static Gui gui;
	private static BubbleSort bubbleSort;
	private static ArrayGenerator arrayGenerator;
	private static BubbleBenchMark bubbleBenchMark;

	public static void main(String[] args) {
		gui = new Gui();
		bubbleSort = new BubbleSort();
		arrayGenerator = new ArrayGenerator();
		bubbleBenchMark = new BubbleBenchMark();
//		int[] array = arrayGenerator.generateInt(350);
//		int[] array = new int[] { 98, 94, 93, 89, 77, 76, 68, 61, 53, 46, 39, 38, 31, 27, 27, 24, 21, 13, 12, 0 };7
//		int[] array = new int[] { 96, 96, 96, 93, 92, 88, 85, 85, 84, 83, 77, 74, 73, 72, 69, 69, 68, 67, 67, 65, 65, 64, 64, 60, 59, 57, 54, 53, 50, 41, 35, 34, 33, 30, 27, 27, 26, 19, 15, 12, 12, 11, 10, 10, 8, 7, 5, 5, 1, 0 };
//		int[] array;
//		int[] array = new int[] { 0, 12, 13, 21, 24, 27, 27, 31, 38, 39, 46, 53, 61, 68, 76, 77, 89, 93, 94, 98 };

/*
		int numberOfElements = 10;
		int max = numberOfElements;
		int counter = numberOfElements;
		int[] array = new int[numberOfElements];
		while (counter > 0) {
			array[(max + 0) - counter] = counter;
			counter--;
		}
*/



		gui.display(arrayGenerator.generateInt(128, 105));

//		int numRuns = 1;
//		System.out.printf("BenchScore of %d runs is %s\n", numRuns, bubbleBenchMark.benchAscending(numRuns, array));


//		bubbleSort.sortDescendingV2(array);
//		gui.display("Descending\t : {", array, " }");
	}


}
