package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class IntReverse {

    private static ArrayList<Character> reverseCharArray (char[] x) {

        ArrayList<Character> returnArray = new ArrayList<Character>();

        for(int i = 0; i < x.length; i++) {
            if(x[i] == '-') {
                continue;
            }
            returnArray.add(0,x[i]);
        }

        return returnArray;
    }

    private static String ArrayListToString (ArrayList<Character> digitsOfStringReversed) {
        StringBuilder stringBuilder = new StringBuilder();

        for(char x : digitsOfStringReversed) {
            stringBuilder.append(x);
        }

        return stringBuilder.toString();
    }

    public static int reverse(int x) {
        int positiveOrNegative = 1;

        if(x < 0) {
            positiveOrNegative = -1;
        }

        String intAsString= Integer.toString(x);
        char[] digitsOfString = intAsString.toCharArray();
        ArrayList<Character> digitsOfStringReversed = reverseCharArray(digitsOfString);
        String reversedString = ArrayListToString(digitsOfStringReversed);

        int returnVal;
        try {
            returnVal = Integer.parseInt(reversedString) * positiveOrNegative;
        } catch (NumberFormatException e) {
            return 0;
        }


        return returnVal;
    }

}
