package fireDrillSix;

import java.util.ArrayList;
import java.util.List;

public class FireDrillSix {

    public ArrayList<Integer> returnEvenAndOdd(List<Integer> number) {
        ArrayList<Integer> element = new ArrayList<>();

        for (int index = 0; index < number.size(); index++) {
            if (number.get(index) % 2 == 0) {
                element.add(0);
            }
            else {
                element.add(1);
            }
        }
        return element;
    }
}
