//ArrayDuplicates.java
//Implements the Array Duplicates class which, given a user input, adds them to an array and eliminates duplicates
//Daniel Olsen
//4/15/2017

import java.util.Scanner;


public class ArrayDuplicates {

    //I assume the user never enters 0 for ease of end display
    public static void main(String[] args)
    {
        //initializes the needed variables
        Scanner userScanner = new Scanner(System.in);
        int count = 0;
        int[] inputArray = new int[10];
        int[] returnedArray;
        
        //reads in the users inputs and sends them to the eliminate duplicates method
        System.out.println("Enter 10 integers");
        for(int j = 0; j < inputArray.length; j++)
            inputArray[j] = userScanner.nextInt();
        returnedArray = eliminateDuplicates(inputArray);
        
        //goes through the returned array and when 0 is hit, breaks the loop and takes that as the number of distinct numbers
        for(int q:returnedArray)
        {
            if(q == 0)
                break;
            count++;
        }
        
        //required output
        System.out.println("The number of distinct integers is " + count);
        System.out.print("The distinct integer(s) are ");
        for(int i = 0; i < count; i++)
        {
            System.out.print(returnedArray[i] + " ");
        }
        System.out.println();
    }
    
    public static int[] eliminateDuplicates(int[] numbers)
    {
        //creates the needed values for the method
        int[] returnArray = new int[10];
        int counter = 0;
        
        //while there are number still in the inputted array
        for(int i = 0; i < numbers.length; i++)
        {
            boolean flag = true;
            //read the value into the comparsion variable
            int comparsionValue = numbers[i];
            for(int j: returnArray)
            {
                //if the value is in the return array already, break the loop
                if(j == comparsionValue)
                {
                    flag = false;
                    break;
                }
            }
            //if not, place it in the return array and increment the placement of the numbers
            if(flag == true)
            {
                returnArray[counter] = comparsionValue;
                counter++;
            }
            
        }
        
        //return the finished array
        return returnArray;
    } 
    
}
