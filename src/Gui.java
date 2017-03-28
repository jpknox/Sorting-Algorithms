import static java.lang.System.out;
/**
 * Created by jpknox on 23/03/17.
 */
public class Gui {


	public String display(String prefix, int[] array, String suffix) {
		return String.format("%s %s %s", prefix, display(array), suffix);
	}

	public String display(int[] array) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("{ ");
		for (int i = 0; i < array.length; i++) {
			stringBuilder.append(array[i]);

			if (i < (array.length - 1))
				stringBuilder.append(", ");
		}
		stringBuilder.append(" }");
		return stringBuilder.toString();
	}

	public void display(String text, int number) {
		System.out.printf("%s %d\n", text, number);
	}
}