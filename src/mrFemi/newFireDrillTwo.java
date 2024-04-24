package mrFemi;

import java.util.ArrayList;

public class newFireDrillTwo {


    public static String reverseThis(String input) {

        String word = "";
        StringBuilder reverse = new StringBuilder();
        ArrayList<String> sentence = new ArrayList<>();

        for (int index = 0; index < input.length(); index++) {
            char currentChar = input.charAt(index);
            if (currentChar == ' ') sentence.add(word);
//            else reverse.append(words);

//            reverse.append(input.charAt(index));
        }

        for (int index = sentence.size(); index >= 0; index--) {
            reverse.append(sentence);

        }
        return reverse.toString();
    }


}
