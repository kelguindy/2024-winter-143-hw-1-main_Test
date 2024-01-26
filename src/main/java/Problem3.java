public class Problem3 {

    // Do not change signature (function name, parameters, return type)
    public static long SumOfNonUnique(int[] data) {
        // TODO: Add your solution
        long sumOfNonUnique = 0;
        int counter = 0;
        int check= 0;
        int[] repeated = new int[data.length];;
        int[] nonUnique = new int[data.length];

        for (int i = 0; i < data.length - 1; i++) // get the first element
        {
            for (int t = 0; t < nonUnique.length; t++) {
                if (data[i] == nonUnique[t]) {
                    check = 1;
                }
            }
            if (check == 0) {
                repeated[counter] = 0;
                for (int j = i + 1; j < data.length; j++) // get the following elements to compare
                {
                    if (data[i] == data[j]) {
                        nonUnique[counter] = data[i];
                        repeated[counter] = repeated[counter] + 1;
                    }

                }
                counter = counter + 1;
            }
        }

        for (int t = 0; t < nonUnique.length; t++) {
            sumOfNonUnique = sumOfNonUnique + nonUnique[t] * (repeated[t]+1);
        }

        return sumOfNonUnique; // Placeholder. TODO: Replace this line with your own code.


    /*
    TODO: Bonus Points. Add your answer here.
     */
    }
}
