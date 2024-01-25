public class Problem1 {

    // Do not change signature (function name, parameter variable type and return type)
    public static int binarySearch(int[] data, int target) {

        int midPosition = (data.length) / 2;
        int startPosition = 0;
        int endPosition = 0;

        for (int i = 0; i < data.length; i++) {

            midPosition = (startPosition + endPosition) / 2;

            if (target == data[midPosition])
                return midPosition;

            if (target > data[midPosition]) {
                startPosition = midPosition + 1;
                endPosition = data.length - 1;
            }

            if (target < data[midPosition]) {
                startPosition = 0;
                endPosition = midPosition - 1;
            }
        }

        return -1;

        // TODO: answers "how would you prove your code is correct?". "ChatGPT says so" doesn't count as a good answer.

        // TODO: remove all the comment of "TODOs" and "Placeholder" once the homework is done. In other files too.
    }
}
