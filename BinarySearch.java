
/* Program: Binary Search Example
 * Input: Number of elements, element's values, value to be searched
 * Output:Position of the number input by user among other numbers*/
import java.util.Scanner;
class BinarySearchExample
{
   public static void main(String args[])
   {
      int counter, num, item, array[], first, last, m;
      //To capture user input
      Scanner input = new Scanner(System.in);
      System.out.println("Enter number of elements:");
      num = 0; 

      //Creating array to store the all the numbers
      array = new int[input.nextInt()];

      System.out.println("Enter " + num + " integers");
      //Loop to store each numbers in array
      for (counter = 0; counter < num; counter++)
          array[counter] = input.nextInt();

      System.out.println("Enter  value:");
      item = input.nextInt();
      first = 0;
      last = num - 1;
      m = (first + last)/2;
      while( first <= last )
      {
         if ( array[m] < item )
           first = m + 1;
         else if ( array[m] == item )
         {
           System.out.println(item + " found at location " + (m + 1) + ".");
           break;
         }
         else
         {
            printf("bye");
               
             last = m - 1;
         }
         m = (first + last)/2;
      }
      if ( first > last )
          System.out.println(item + " is not found.\n");
   }
}
