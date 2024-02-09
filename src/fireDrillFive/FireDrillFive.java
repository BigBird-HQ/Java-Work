package fireDrillFive;

public class FireDrillFive {
    public int[] doubleThis(int[] inputArrays) {

        int[] outputArrays = doubleTheLength(inputArrays);


        for (int index = 0; index < inputArrays.length; index++) {
            outputArrays[index] = inputArrays[index];
            outputArrays[ index+ inputArrays.length] = inputArrays[index] * 2;

        }
        return outputArrays;

    }

    private int[] doubleTheLength(int[] inputArrays) {
        int[] expectedArray = new int[inputArrays.length*2];
        return expectedArray;
    }
}
