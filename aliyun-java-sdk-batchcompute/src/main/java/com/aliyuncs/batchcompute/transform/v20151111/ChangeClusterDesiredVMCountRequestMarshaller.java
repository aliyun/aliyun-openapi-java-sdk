package com.aliyuncs.batchcompute.transform.v20151111;

import com.aliyuncs.batchcompute.model.v20151111.ChangeClusterDesiredVMCountRequest;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by guangchun.luo on 16/1/12.
 */
public class ChangeClusterDesiredVMCountRequestMarshaller {
    public static ChangeClusterDesiredVMCountRequest marshall(ChangeClusterDesiredVMCountRequest req) {

        ObjectMapper mapper = new ObjectMapper();

        //null或“”不序列化
        mapper.setSerializationInclusion(JsonSerialize.Inclusion.NON_EMPTY);

        String contentString=null;

        try {
            contentString = mapper.writeValueAsString(req.getClusterDescription());
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            req.setContent(contentString.getBytes(), req.getEncoding(), req.getAcceptFormat());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return req;
    }
}
