package com.aliyuncs.utils;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class IOUtils {

    public static void closeQuietly(Closeable closeable) {
        try {
            if (closeable != null) {
                closeable.close();
            }
        } catch (IOException ioe) {
            // ignore
        }
    }

    public static String readFiles(String fileName){
        ClassLoader classLoader = IOUtils.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream(fileName);
        Scanner scanner = new Scanner(is, "UTF-8");
        scanner.useDelimiter("\0");
        String fileContext = scanner.hasNext() ? scanner.next() : "";
        scanner.close();
        return fileContext;
    }
}
