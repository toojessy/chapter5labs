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
