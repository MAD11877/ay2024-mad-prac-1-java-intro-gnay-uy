import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);

    int length = in.nextInt();

    HashMap<Integer, Integer> freqMap = new HashMap<>();

    for (int i = 0; i < length; i++) {
      int input = in.nextInt();
      freqMap.put(input, freqMap.getOrDefault(input, 0) + 1);
    }

    int maxVal = Collections.max(freqMap.values());

    for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
      if (entry.getValue() == maxVal) {
        System.out.println(entry.getKey());
        break;
      }
    }
  }
}
