package org.launchcode.cheesemvc.util;

/**
 * Created by chris on 7/9/17.
 */
public class Util {

    public static boolean containsDigits(String str) {
        boolean containsDigits = false;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                containsDigits = true;
                break;
            }
        }
        return containsDigits;
    }
}
