package com.aliyuncs.reader;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.aliyuncs.http.FormatType;

public class ReaderFactoryTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @SuppressWarnings("deprecation")
    @Test
    public void testCreateInstance() {
        Assert.assertTrue(ReaderFactory.createInstance(FormatType.JSON) instanceof JsonReader);
        Assert.assertTrue(ReaderFactory.createInstance(FormatType.XML) instanceof XmlReader);
        thrown.expect(IllegalStateException.class);
        thrown.expectMessage("Server response has a bad format type: " + FormatType.RAW);
        ReaderFactory.createInstance(FormatType.RAW);
    }

    @Test
    public void testReaderFactory() {
        ReaderFactory readerFactory = new ReaderFactory();
        Assert.assertTrue(readerFactory instanceof ReaderFactory);
    }
}
