package com.aliyuncs.v5.reader;

import com.aliyuncs.v5.http.FormatType;

@Deprecated
public class ReaderFactory {

    public static Reader createInstance(FormatType format) {
        if (FormatType.JSON == format) {
            return new JsonReader();
        }
        if (FormatType.XML == format) {
            return new XmlReader();
        }

        throw new IllegalStateException("Server response has a bad format type: " + format);
    }
}
