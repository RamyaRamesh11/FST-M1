package activities;

import java.util.Arrays;
public class Activity4 {
    public static void main(String args[])
    {

        int[] b= {5,3,45,30,23,1};
        System.out.println("The array before sorting is  "+ Arrays.toString(b));

        int first = b[0];
        System.out.println(first);
        for(int i=1;i<6;i++) {
            if (first >=b[i]) {
                 first = b[i];

            }
            System.out.println(first);


        }
    }
}
