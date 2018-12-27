package com.aliyuncs.utils;

import java.io.Closeable;
import java.io.IOException;
import java.io.StringReader;

import org.junit.Test;

public class IOUtilsTest {

    @Test
    public void testConstructor() {
        new IOUtils();
    }

    @Test
    public void testCloseQuietly() {
        IOUtils.closeQuietly(new StringReader(""));
        IOUtils.closeQuietly(null);
        IOUtils.closeQuietly(new MyCloseable());
    }

    private class MyCloseable implements Closeable {
        @Override
        public void close() throws IOException {
            throw new IOException("the message");
        }
    }
}