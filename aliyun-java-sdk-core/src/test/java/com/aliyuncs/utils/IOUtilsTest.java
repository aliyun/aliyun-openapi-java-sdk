package com.aliyuncs.utils;

import org.junit.Test;

import java.io.Closeable;
import java.io.IOException;
import java.io.StringReader;

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