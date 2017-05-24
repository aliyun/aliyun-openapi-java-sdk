package com.aliyuncs;

import com.aliyuncs.http.FormatType;

public class CommonRequest extends RpcAcsRequest<CommonResponse> {
    
    public CommonRequest(String product, String version, String action) {
        super(product, version, action);
        this.setAcceptFormat(FormatType.JSON);
    }
    
    public CommonRequest(String product, String version, String action, String locationProduct) {
        super(product, version, action, locationProduct);
        this.setAcceptFormat(FormatType.JSON);
    }
    
    public void add(String key, Object value) {
        this.putQueryParameter(key, value);
    }

    @Override
    public Class<CommonResponse> getResponseClass() {
        return CommonResponse.class;
    }

}
