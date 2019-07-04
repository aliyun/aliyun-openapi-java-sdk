package com.aliyuncs.utils;

public class StringUtils {

    public static boolean isEmpty(final CharSequence cs) {
        return cs == null || cs.length() == 0;
    }

    /**
     * Verifies that the string is in the array
     * @param str Must be not empty
     * @param array Must be not empty and no empty elements
     * @return
     */
    public static boolean validateStringInArray(String str, String[] array) {
        for (String parameter : array) {
            if (str.equals(parameter)) {
                return true;
            }
        }
        return false;
    }
}
