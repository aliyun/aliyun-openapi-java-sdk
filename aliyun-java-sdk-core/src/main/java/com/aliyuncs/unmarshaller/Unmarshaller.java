package com.aliyuncs.unmarshaller;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.exceptions.ClientException;

/**
 * @author VK.Gao
 * @date 2018/04/11
 */
public interface Unmarshaller {

    <T extends AcsResponse> T unmarshal(Class<T> clasz, String content) throws ClientException;
}
