package com.aliyuncs.v5.unmarshaller;

import com.aliyuncs.v5.http.FormatType;

public class UnmarshallerFactory {

    public static Unmarshaller getUnmarshaller(FormatType format) throws IllegalStateException {
        switch (format) {
            case JSON:
                return new JsonUnmashaller();
            case XML:
                return new XmlUnmashaller();
            default:
                throw new IllegalStateException("Unsupported response format: " + format);
        }
    }
}
