package gr.aueb.cf.helloapp;
/**
 * Find the Maximum Number in an Array.
 */

public class ArrayMaxNum {

    public static void main(String[] args) {
        int[] arr = {};

        try {
            int maxNum = printMaxNum(arr);
            System.out.println("Maximum number is:" + maxNum);
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    /**
     * @param arr The array we filter for the biggest number.
     * @return The biggest number in the array
     */
    public static int printMaxNum(int[] arr) throws Exception {
        if (arr.length == 0) {
            throw new Exception("Array is empty.");
        }
        int maxNum = 0;
        int maxValue = arr[maxNum];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {

                maxNum = i;
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}

