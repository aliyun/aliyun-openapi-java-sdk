package com.aliyuncs.reader;

import org.junit.Assert;
import org.junit.Test;
import org.junit.function.ThrowingRunnable;

import com.aliyuncs.http.FormatType;

@SuppressWarnings("deprecation")
public class ReaderFactoryTest {

    @Test
    public void testCreateInstance() {
        Assert.assertTrue(ReaderFactory.createInstance(FormatType.JSON) instanceof JsonReader);
        Assert.assertTrue(ReaderFactory.createInstance(FormatType.XML) instanceof XmlReader);
        IllegalStateException ex = Assert.assertThrows(IllegalStateException.class, new ThrowingRunnable() {
            @Override
            public void run() throws Throwable {
                ReaderFactory.createInstance(FormatType.RAW);
            }
        });
        Assert.assertEquals("Server response has a bad format type: " + FormatType.RAW, ex.getLocalizedMessage());
    }

    @Test
    public void testReaderFactory() {
        ReaderFactory readerFactory = new ReaderFactory();
        Assert.assertTrue(readerFactory instanceof ReaderFactory);
    }
}
