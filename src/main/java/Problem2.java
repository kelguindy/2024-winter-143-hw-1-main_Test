public class Problem2 {

    // Do not change signature (function name, parameters, return type)
    public static void bubbleSort(int[] data) {
        // TODO: Add your solution
        int helper = 0;
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1; j++) {

                if (data[j] > data[j+1]){
                    helper = data[j+1];
                    data[j+1] = data [j];
                    data[j] = helper;
                }
            }
        }
    }
    // TODO: answers "how many times of comparison for an array of size n?"
}
