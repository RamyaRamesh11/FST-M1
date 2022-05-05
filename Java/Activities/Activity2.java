package activities;

import java.util.Arrays;

public class Activity2 {
    public static void main(String args[])
    {
        int[] a = {10,77,10,54,-11,10};
        System.out.println("Original Array: " + Arrays.toString(a));

        //Set constants
        int searchNum = 10;
        int fixedSum = 30;

        //Print result
        System.out.println("Result: " + result(a, searchNum, fixedSum));
    }

    public static boolean result(int[] numbers, int searchNum, int fixedSum) {
        int temp_sum = 0;

        for (int number : numbers) {

            if (number == searchNum) {

                temp_sum += searchNum;
            }


            if (temp_sum > fixedSum) {
                break;
            }
        }


        return temp_sum == fixedSum;
    }
    }

