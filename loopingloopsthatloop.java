// Jessica Kamienski

// Sentinel Sum Calculator
import java.util.Scanner;

public class SumCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value = 1;
        
        int sum = 0;
        while (value != 0) {
            System.out.println("Please enter an integer: ");
            value = input.nextInt();
            sum += value;
        }
        
        System.out.println("Your sum is... " + sum);
    }
}



// Number Stairs
public class NumStairs {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
          for (int j = 1; j < i + 1; j++) {
              System.out.print(j);
          }
          System.out.println();
      }
    
    }
}


// Right Aligned Stairs
import java.util.Scanner; 

public class NumStairsRIGHT {
    public static void main(String[] args) {
        System.out.println("Enter a character: ");
        Scanner input = new Scanner(System.in);
        String character = input.next();
        
        System.out.println("Enter number of levels: ");
        int levels = input.nextInt();
        
        for (int i = 1; i <= levels; i++) {
            for (int j = 1; j <= levels - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(character);
            }
            System.out.println();
        }
    }
}


// Menu Repetition
import java.util.Scanner;
import java.time.LocalDateTime;

public class Menu {
    public static void main(String[] args) {
       // System.out.println("Welcome to the menu program! Please select an option:  \n" + "1) Say hello! \n" + "2) Display current time \n" + "3) Exit \n");
        Scanner input = new Scanner(System.in);
        int character;;
        LocalDateTime currentDateTime = LocalDateTime.now();
        
        do {
             System.out.println("Welcome to the menu program! Please select an option:  \n" + "1) Say hello! \n" + "2) Display current time \n" + "3) Exit \n");
            character = input.nextInt();
            if (character == 1) {
                System.out.print("Hello! It's a nice day to chat isn't it? \n");
            }
            else if (character == 2) {
                System.out.println("The current date and time is " + currentDateTime + "\n");
            }
            else {
                System.out.println("Bye now!");
            }
        } while (character != 3);
    }
}
