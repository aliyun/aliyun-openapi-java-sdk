package com.aliyuncs.batchcompute.main.v20151111;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.RoaAcsRequest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by guangchun.luo on 15/12/7.
 */
public abstract class BatchComputeRequest<T extends AcsResponse> extends RoaAcsRequest<T> {

    public BatchComputeRequest(String product) {
        super(product);
        attachCommonHeaders();
    }
    public BatchComputeRequest(String product, String version) {
        super(product, version);
        attachCommonHeaders();
    }
    public BatchComputeRequest(String product, String version, String action) {
        super(product, version, action);
        attachCommonHeaders();
    }


    private void attachCommonHeaders(){
        Set<String> keys = commonHeaders.keySet();
        for(String key: keys){
            this.putHeaderParameter(key, commonHeaders.get(key));
        }
    }

    protected static Map<String,String> commonHeaders = new HashMap<String, String>();

    protected static void setCommonHeader(String key, String value){
        commonHeaders.put(key,value);
    }


}
