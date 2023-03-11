package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }
    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        return Arrays.asList(array).contains(value);
    }
    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        //String[] array2 = new String[];
        //int j = 0;
        //for (int i = array.length; i > 0; i--) {
           // array2 = array[j];
           // j++;
        //}
        Collections.reverse(Arrays.asList(array));
return array;

    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] array2 = Arrays.copyOf(array, array.length);
        Collections.reverse(Arrays.asList(array));
        return Arrays.equals(array,array2);
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean[] alphabet = new boolean[26];
        for (String str : array) {
            for (char letter : str.toCharArray()){
                letter = Character.toLowerCase(letter);

                if(Character.isLetter(letter)){
                    alphabet[letter - 'a'] = true;
                }
            }
            }
for (boolean used : alphabet){
    if (!used){
        return false;
    }
}
return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(value == array[i]){
                count += 1;
            }

        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        List<String> list = new ArrayList<>(Arrays.asList(array));
        list.remove(valueToRemove);
        array = list.toArray(new String[list.size()]);


        return array;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        List<String> list = new ArrayList<>(Arrays.asList(array));
        for(int i= 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))){
                list.remove(i);
                i--;
            }
        }
        return list.toArray(new String[list.size()]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        List<String> list = new ArrayList<>(Arrays.asList(array));
        List<String> result = new ArrayList<>();
        while(!list.isEmpty()){
            String current = list.remove(0);
            StringBuilder sb = new StringBuilder(current);
            while(!list.isEmpty() && list.get(0).equals(current)){
                sb.append(current);
                list.remove(0);
            }
            result.add(sb.toString());
        }
        return result.toArray(new String[0]);
    }
}

