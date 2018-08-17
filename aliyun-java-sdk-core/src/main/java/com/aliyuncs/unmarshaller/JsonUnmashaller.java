package com.aliyuncs.unmarshaller;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.HttpResponse;
import com.google.gson.Gson;

/**
 * @author VK.Gao
 * @date 2018/04/11
 */
public class JsonUnmashaller implements Unmarshaller {

    @Override
    public <T extends AcsResponse> T unmarshal(Class<T> clazz, HttpResponse httpResponse) throws ClientException {
        String jsonContent = httpResponse.getHttpContentString();
        return (new Gson()).fromJson(jsonContent, clazz);
    }


}
