import java.util.Random;

/**
 * Created by jpknox on 23/03/17.
 */
public class ArrayGenerator {

	public int[] generateInt(int size) {
		int[] array = new int[size];
		int pos = 0;
		Random rand = new Random();
		while (pos < (size-1)) {
			array[pos] = rand.nextInt(100);
			pos++;
		}
		return array;
	}

	int[] copyArray(int[] unsorted) {
		int length = unsorted.length;
		int[] copy = new int[length];
		for(int i = 0; i < length; i++) {
			copy[i] = unsorted[i];
		}
		return copy;
	}
}
