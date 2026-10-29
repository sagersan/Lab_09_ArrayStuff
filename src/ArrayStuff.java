import java.util.Random;
import java.util.Scanner;

public class ArrayStuff
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int[] dataPoints = new int[100];

        Random rnd = new Random();

        // Fill array with random values from 1 to 100
        for(int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        // Display array values
        for(int i = 0; i < dataPoints.length; i++)
        {
            System.out.print(dataPoints[i] + " | ");
        }

        System.out.println();

        // Calculate sum
        int sum = 0;

        for(int i = 0; i < dataPoints.length; i++)
        {
            sum += dataPoints[i];
        }

        // Display sum
        System.out.println("\nThe sum of the values in dataPoints is: " + sum);

        // Display average using method
        System.out.println("The average of the values in dataPoints is: "
                + getAverage(dataPoints));

        // Search for occurrences
        int userValue = SafeInput.getRangedInt(
                in,
                "Enter a value to search for",
                1,
                100);

        int count = 0;

        for(int i = 0; i < dataPoints.length; i++)
        {
            if(dataPoints[i] == userValue)
            {
                count++;
            }
        }

        System.out.println("The value " + userValue +
                " was found " + count +
                " time(s) in the dataPoints array.");

        // Find first occurrence
        int searchValue = SafeInput.getRangedInt(
                in,
                "Enter another value to find its first position",
                1,
                100);

        int position = -1;

        for(int i = 0; i < dataPoints.length; i++)
        {
            if(dataPoints[i] == searchValue)
            {
                position = i;
                break;
            }
        }

        if(position != -1)
        {
            System.out.println("The value " + searchValue +
                    " was found at array index " + position + ".");
        }
        else
        {
            System.out.println("The value " + searchValue +
                    " was not found in the dataPoints array.");
        }

        // Find min and max
        int min = dataPoints[0];
        int max = dataPoints[0];

        for(int i = 1; i < dataPoints.length; i++)
        {
            if(dataPoints[i] < min)
            {
                min = dataPoints[i];
            }

            if(dataPoints[i] > max)
            {
                max = dataPoints[i];
            }
        }

        System.out.println("The minimum value in the dataPoints array is: " + min);
        System.out.println("The maximum value in the dataPoints array is: " + max);
    }

    public static double getAverage(int values[])
    {
        int sum = 0;

        for(int i = 0; i < values.length; i++)
        {
            sum += values[i];
        }

        return (double) sum / values.length;
    }
}