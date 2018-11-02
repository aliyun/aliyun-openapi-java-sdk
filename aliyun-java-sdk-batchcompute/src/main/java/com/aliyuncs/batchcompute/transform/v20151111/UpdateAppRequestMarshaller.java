package com.aliyuncs.batchcompute.transform.v20151111;

import com.aliyuncs.batchcompute.model.v20151111.UpdateAppRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * Created by guangchun.luo on 17/10/12.
 */
public class UpdateAppRequestMarshaller {
    public static UpdateAppRequest marshall(UpdateAppRequest req) {

        ObjectMapper mapper = new ObjectMapper();

        //默认值不序列化
        mapper.setSerializationInclusion(JsonInclude.Include.NON_DEFAULT);

        String contentString = null;

        try {
            contentString = mapper.writeValueAsString(req.getAppDescription());
        } catch (IOException e) {
            e.printStackTrace();
        }

        req.setHttpContent(contentString.getBytes(), req.getEncoding(), req.getAcceptFormat());

        return req;
    }
}
