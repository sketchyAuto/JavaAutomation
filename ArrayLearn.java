package LearnzAndHomez;

import java.util.Arrays;

public class ArrayLearn {

    public static void main(String[] args){
        //Array setup
        int[] aryNums = new int[3];
        aryNums[0] = 35;
        aryNums[1] = 20;
        aryNums[2] = 30;

        //if you already know the numbers then you can set up like this
        int[] arryNum = {2,3,4,5,8,20};
        String[]aryStrings = {"Autumn","Spring","Summer","Winter"};

        System.out.println(aryNums[2]);
        System.out.println(arryNum[4]);
        System.out.println(aryStrings[2]);


        //Loop in Array to assign numbers
        //length is use to get the side of the array and if i is less than the size i increases
        int[] lottery = new int[49];
        int i;
        for(i=0; i<lottery.length; i++){
            lottery[i] = i+1;
            System.out.print(lottery[i]);
            System.out.print(", ");
        }
        //Exercise 1:
        /*(If you wanted, you could then write code to jumble up the numbers in the array.
        Once you have jumbled up the values, you could then take the first 6 and use them as the lottery numbers.
        Write another chunk of code that compares a user's 6 numbers with the winning numbers and you have a lottery programme!)
         */

        //Sorting Array in Ascending order
        System.out.println();
        Arrays.sort(aryNums);
       int j;
       for(j=0; j<aryNums.length; j++){
           System.out.println("num: "+ aryNums[j]);
       }

       /*Exercise G
        Set up an array to hold the following values, and in this order: 23, 6, 47, 35, 2, 14.
        Write a programme to get the average of all 6 numbers. (You can use integers for this exercise, which will round down your answer.)
        */

       /*Exercise H
        Using the above values, have your programme print out the highest number in the array.
        */

       /*
       Exercise I
        Using the same array above, have your programme print out only the odd numbers.
        Answers here: https://www.homeandlearn.co.uk/java/arrays_and_strings.html
        */
    }
}
