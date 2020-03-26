import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

import java.util.List;
import java.util.Set;

/**
 * ArrayUtil exercises.
 */
public class ArrayUtil {

    /**
     * Finds the common elements between two arrays (String values).
     *
     * @param array1 first array
     * @param array2 second array
     * @return String array with common elements
     */
    public static String[] findCommon(String[] array1, String[] array2) {

        Set sortingSet = new HashSet();
        List<String> comparingList = new ArrayList<String>();

        for (String i : array2) {
          sortingSet.add(i);
        }


        for (int i = 0; i < array1.length; i++) {


            if (!sortingSet.add(array1[i])) {
                comparingList.add(array1[i]);
            }
        }

        String[] result = new String[comparingList.size()];

        for (int i = 0; i < comparingList.size(); i++)
            result[i] = comparingList.get(i);

        return result;
    }
}