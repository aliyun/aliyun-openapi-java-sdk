package com.aliyuncs.v5.unmarshaller;

import com.aliyuncs.v5.AcsResponse;
import com.aliyuncs.v5.exceptions.ClientException;

public interface Unmarshaller {

    <T extends AcsResponse> T unmarshal(Class<T> clasz, String content) throws ClientException;
}
