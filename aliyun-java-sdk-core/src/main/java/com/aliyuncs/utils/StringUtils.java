package com.aliyuncs.utils;

public class StringUtils {

    public static boolean isEmpty(final CharSequence cs) {
        return cs == null || cs.length() == 0;
    }

    public static String join(String delimiter, Iterable<? extends String> elements) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String value : elements) {
            stringBuilder.append(value);
            stringBuilder.append(delimiter);
        }
        if (stringBuilder.length() > 0) {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
        return stringBuilder.toString();
    }
}
