package com.zipcodewilmington;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        if (array.length == 0) {
            return null;
        } else {
            return array[array.length - 1];
        }
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        if (array.length < 2) {
            return null;
        } else {
            return array[array.length-2];
        }
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (String word : array) {
            if (word.equals(value)) return true;
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reversed = new String[array.length];
        int idx = array.length-1;
        int revIdx = 0;
        while (revIdx < array.length) {
            reversed[revIdx] = array[idx];
            idx--;
            revIdx++;
        }
        return reversed;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] reversed = reverse(array);
        for (int i = 0; i < array.length; i++) {
            if (!reversed[i].equals(array[i])) return false;
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String all = Arrays.toString(array).toLowerCase();
        for (char letter = 'a'; letter <= 'z'; letter++) {
            if (all.indexOf(letter) < 0) return false;
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int found = 0;
        for (String word: array) {
            if (word.equals(value)) found++;
        }
        return found;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int amountToRemove = getNumberOfOccurrences(array, valueToRemove);
        String[] removed = new String[array.length-amountToRemove];
        int removedCount = 0;
        int arrCount = 0;
        while ((removedCount < removed.length) && (arrCount < array.length)) {
            String word = array[arrCount];
            if (!word.equals(valueToRemove)) {
                removed[removedCount] = word;
                removedCount++;
            }
            arrCount++;
        }
        return removed;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> noConsecutiveDupes = new ArrayList<String>() ;
        noConsecutiveDupes.add(array[0]);
        for (int i = 1; i < array.length; i++) {
            if (!array[i].equals(array[i-1])) noConsecutiveDupes.add(array[i]);
        }
        String[] removed = new String[noConsecutiveDupes.size()];
        //removed = noConsecutiveDupes.toArray(removed);
        return noConsecutiveDupes.toArray(removed);

    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
