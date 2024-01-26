/*
 * DO NOT MAKE ANY CHANGES UNLESS SPECIFIED OTHERWISE
 */

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem3Test {

    // Okay to change the content of this function
    // DO NOT REMOVE OR CHANGE the signature
    @Test
    public void testSumOfNonUnique() {
        //assertTrue(false); // TODO: Place-holder. Replace with your tests.

        int[][] inputs = {
               //{3, 2, 1},
               //{3, 2, 1, 3, 22, 14},
               //{3, 3, 3, 3, 3, 3, 3, 3},
               {1, 1, 4, 4, 5, 6, 4, 8, 4, 5},
               //{1}
        };
        // TODO: add more test case inputs
        int[] expects = {28}; //{0, 6, 24, 28, 0};

        assertEquals(inputs.length , expects.length);

        for (int i = 0; i < inputs.length; i++) {
            assertEquals(Problem3.SumOfNonUnique(inputs[i]), expects[i]);
        }



    }
    @Test

    public void largeArrayTest() {
        final int aLargeNumber = 100000;
        int[] input = new int[aLargeNumber];

        for (int i = 0; i < input.length; i++) {
            input[i] = i - aLargeNumber / 2;    // does this array have any non-unique number in it?
        }

        final int expect = 0;   // why 0?

        long startTime = System.nanoTime();

        long actual = Problem3.SumOfNonUnique(input);

        long endTime = System.nanoTime();
        long durationInNano = endTime - startTime;

        assertEquals(expect, actual);

        System.out.printf("time: %f seconds", (double) durationInNano / 1e9);

        // this test takes a bit of time to finish, ain't it?
        // try a better design in your code so this test finishes faster
        // TODO: how many seconds did your code improve between the first version and last version of your code?
    }

}