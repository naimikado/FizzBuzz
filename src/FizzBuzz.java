package src;
import java.util.Scanner;
/* Create the project FizzBuzz
 * When number = divisible by 5 = Fizz
 * When number = divisible by 3 = Buzz
 * When number = divisible by 5 and 3 = Fizzbuzz
 */
public class FizzBuzz {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();

        if (number % 5 == 0 && number % 3 == 0) {           
            System.out.println("FizzBuzz"); 
        }
        else if (number % 5 == 0) {
            System.out.println("Fizz");
        }
        else if (number % 3 == 0) {
            System.out.println("Buzz");
        }
        else {
            System.out.print(number);
        }

/* Alternative Option: 
*  Nested approach, not a good presentation but works and has no repetition:
*
       if (number % 5 == 0) {                           
            if (number % 3 == 0)
                System.out.println("FizzBuzz");
            else 
                System.out.println("Fizz");
        }  
        else if (number % 3 == 0) {
            System.out.println("Buzz");
        }
        else {
            System.out.print(number);
        }
*/

    }
}