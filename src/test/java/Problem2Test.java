import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem2Test {

    @Test
    public void testBubbleSort() {
        int[][] inputs = {
                //{3, 2, 1},
                //{3, 2, 1, 17, 22, 14},
                //{3, 2, 1, 0, 7, 5, 100, 12 , 4},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                //{1}
                // TODO: add more test case inputs
        };
        int[][] expects = {
                //{1, 2, 3},
                //{1, 2, 3, 14, 17, 22},
                //{0, 1, 2, 3, 4, 5, 7, 12, 100},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                //{1}
                // TODO: add more test case expected sorted results
        };

        // TODO: add a check to verify inputs and expects have the same amount of arrays
        assertEquals(inputs.length , expects.length);

        for (int i = 0; i < inputs.length; i++) {
            assertEquals(inputs[i].length , expects[i].length);
        }

            for (int i = 0; i < inputs.length; i++) {
            // TODO: add a call to your bubble sort function here
            Problem2.bubbleSort(inputs[i]);

            //for (int j = 0; j < inputs[i].length; j++) {

                // this checks whether the actual result matches the expects result
                // note the use of assertArrayEquals instead of assertEquals here
                // less code == less chance of mistake
                assertArrayEquals(expects[i], inputs[i]);
            //
                // }
        }
    }
}
