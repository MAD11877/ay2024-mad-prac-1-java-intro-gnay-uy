import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);

    String fill = "*";
    System.out.print("Enter base of triangle: ");
    int base = in.nextInt();

    for (int i = base; i > 0; i--) {
      System.out.println(fill.repeat(i));
    }
  }
}
