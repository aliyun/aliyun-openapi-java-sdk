package com.aliyuncs.unmarshaller;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.exceptions.ClientException;

public interface Unmarshaller {

    <T extends AcsResponse> T unmarshal(Class<T> clazz, String content) throws ClientException;
}
