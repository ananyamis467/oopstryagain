package org.example;
import java.util.Scanner; 

public class App {   //returns a reusable menu
  public static int getInput(int upperBound, int lowerBound, String prompt, String errorMessage) {
    //looking for minimum value here
    Scanner s = new Scanner(System.in);
    boolean isValid = false; 
    int userInput = 0;

    while(!isValid){
        System.out.println(prompt);
        userInput = s.nextInt();
        if(userInput == lowerBound){ //success
            System.out.print("The value chosen by the user is " + userInput);
            return userInput;
        }else if(userInput > lowerBound || userInput == upperBound){ //fail
            System.out.println(errorMessage);
            //System.out.println(prompt);
            //userInput = s.nextInt();
        }
    }
    s.close();
    return userInput;
  }

  public static void main(String[] args) {
    //tests here; comment out to try tests individually
    
    //getInput(10, 0, "Please enter a value here: ", "This value is not valid, please try again");
    //getInput(23, 1, "Please enter a value here: ", "This value is not valid, please try again");
    //getInput(36, 5, "Please enter a value here: ", "This value is not valid, please try again");
  }
}
