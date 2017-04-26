//GameAverage.java
//Implements the Game Average which, given a user input,takes the average of 10 inputted scores and tells the average and how many are above and below the average.
//Daniel Olsen
//4/15/2017

import java.util.Scanner;

public class GameAverage {


    public static void main(String[] args) 
    {
        //initilizing all the variables needed
        double sum = 0;
        double userInput = 0;
        double average = 0;
        int aboveAverage = 0;
        int belowAverage = 0;
        int count = 0;
        double[] inputArray = new double[10];
        Scanner scanner = new Scanner(System.in);
        boolean endInputFlag = false;
        
        //while the end flag is not triggered, read in the users score, ending when the entered value is negative
        while(endInputFlag != true)
        {
            System.out.println("Enter a new score: ");
            userInput = scanner.nextDouble();
            //using a java math function that returns -1.0 when the value is negative, when this happens set the end flag to be true
            if(Math.signum(userInput) == -1.0)
                endInputFlag = true;
            //else, adds the user input to the array, sum and increments the count, stopping at 10
            else
            {
                sum += userInput;
                inputArray[count] = userInput;
                count++; 
                if(count == 10)
                    endInputFlag = true;
            }
        }
        
        //caclulates the average, makes sure if the average is NaN(aka no values were entered or all 0) it prints 0 instead, and prepares the above and below average to be displayed.
        average = sum/count;
        if(Double.isNaN(average))
            average = 0;
        for(int i = 0; i < count; i++)
        {
            if(inputArray[i] >= average)
               aboveAverage++;
            else
               belowAverage++;
        }
        
        //prints the required block
        System.out.println();
        System.out.println("The count is: " + count);
        System.out.println("The average is: " + average);
        System.out.println("The amount of scores equal to or above average are: " + aboveAverage);
        System.out.println("The amount of scores below average are: " + belowAverage);
        
    }
}
