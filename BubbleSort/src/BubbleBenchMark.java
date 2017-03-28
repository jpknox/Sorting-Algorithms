import java.util.Arrays;

/**
 * Created by joaok on 28/03/2017.
 */
public class BubbleBenchMark {

    private BubbleSort bubbleSort;

    public String benchAscending(int numRuns, int[] dataToSort) {
        bubbleSort = new BubbleSort();
        int[] array;
        int howManyRuns = numRuns;
        long sumOfRunTimes = 0;
        long startTime;
        long endTime;
        int sumOfSwaps = 0;
        while (howManyRuns > 0) {
            array = Arrays.copyOf(dataToSort, dataToSort.length);
            startTime = System.nanoTime();
            sumOfSwaps += bubbleSort.sortAscendingV2(array);
            endTime = System.nanoTime();
            sumOfRunTimes += (endTime - startTime);
            howManyRuns--;
        }
        long seconds = ((sumOfRunTimes / numRuns) / 1000000000) % 60;
        double minutes = ((sumOfRunTimes / numRuns) / 1000000000) / 60;
        sumOfSwaps = sumOfSwaps / numRuns;
        return new StringBuilder()
                .append(minutes)
                .append(':')
                .append(seconds)
                .append(", ")
                .append(String.format("Average number of swaps: %d", sumOfSwaps))
                .toString();

    }

}
