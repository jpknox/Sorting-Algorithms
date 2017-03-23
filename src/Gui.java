/**
 * Created by jpknox on 23/03/17.
 */
public class Gui {


	public void display(String prefix, int[] unsorted, String suffix) {

		System.out.printf("%s ", prefix);
		displayArray(unsorted);
		System.out.printf("%s\n", suffix);
	}

	public void display(int[] unsorted) {
		displayArray(unsorted);
		System.out.printf("\n");
	}

	private void displayArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d", array[i]);

			if (i < (array.length - 1))
				System.out.printf(", ");
		}
	}
}
