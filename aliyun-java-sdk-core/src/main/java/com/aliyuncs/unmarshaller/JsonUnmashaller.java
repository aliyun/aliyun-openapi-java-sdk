package com.aliyuncs.unmarshaller;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

public class JsonUnmashaller implements Unmarshaller {

    @Override
    public <T extends AcsResponse> T unmarshal(Class<T> clazz, String content) throws ClientException {
        try {
            return (new Gson()).fromJson(content, clazz);
        } catch (JsonSyntaxException e) {
            throw newUnmarshalException(clazz, content, e);
        }
    }

    private ClientException newUnmarshalException(Class<?> clazz, String content, Exception e) {
        return new ClientException("SDK.UnmarshalFailed",
            "unmarshal response from json content failed, clazz = " + clazz.getSimpleName() + ", origin response = " + content, e);
    }
}
