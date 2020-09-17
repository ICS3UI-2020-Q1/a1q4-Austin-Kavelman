import java.io.*;
import java.util.Scanner;
import java.lang.*;
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a scanner to use input
    Scanner input = new Scanner(System.in);
    
    //Print on screen
    System.out.println("Please enter coordinate of x1");
    
    // Allows user to print numbers on the screen
    int xOne = input.nextInt();

    //Print on screen
    System.out.println("Please enter coordinate of x2");

    // Allows user to print numbers on the screen
    int xTwo = input.nextInt();

    //Print on screen
    System.out.println("Please enter coordinate of y1");
    
    // Allows user to print numbers on the screen
    int yOne = input.nextInt();

    //Print on screen
    System.out.println("Please enter coordinate of y2");

    // Allows user to print numbers on the screen
    int yTwo = input.nextInt();
    
    //Create formula for calculating slope
    int slope = (yTwo-yOne/xTwo-xOne);
   
   //Print on screen slope = the calculation
    System.out.println("Slope = "+ slope);
   
    


  }
}
