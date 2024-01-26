public class Problem2 {

    // Do not change signature (function name, parameters, return type)
    public static void bubbleSort(int[] data) {
        // TODO: Add your solution
        int helper = 0;
        int khaled = 0;
        System.out.println("data length = " + data.length);
        for (int i = 0; i < data.length - 1; i++) {
            //System.out.println("i = " + i + " Upper Lap number "+ khaled);
            for (int j = 0; j < data.length - 1; j++) {
                khaled = khaled +1;
                System.out.println("j = " + j + " Lower Lap number "+ khaled);
                if (data[j] > data[j+1]){
                    helper = data[j+1];
                    data[j+1] = data [j];
                    data[j] = helper;
                }

            }

        }
        System.out.println("DONE >>>>>>>>>>>>>>>>>>>>>>>>"+ khaled);
    }
    // TODO: answers "how many times of comparison for an array of size n?"
}
