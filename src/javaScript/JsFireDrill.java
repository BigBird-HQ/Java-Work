package javaScript;

public class JsFireDrill {

    public static int[] addOneToLastIndexOf(int[] input) {

        StringBuilder stringBuilder = new StringBuilder();

        for (int index = 0; index < input.length; index++) {
            stringBuilder.append(input[index]);
        }
        int converted = Integer.parseInt(stringBuilder.toString());
        String convertedString = Integer.toString(converted + 1);
        int[] convertedArray = new int[convertedString.length()];
        for (int index = 0; index < convertedString.length(); index++) {
            convertedArray[index] = Integer.parseInt(String.valueOf(convertedString.charAt(index)));
        }

        return convertedArray;
    }
}
