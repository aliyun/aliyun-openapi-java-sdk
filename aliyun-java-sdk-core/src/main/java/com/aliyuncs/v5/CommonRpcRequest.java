package com.aliyuncs.v5;

import com.aliyuncs.v5.http.FormatType;

public class CommonRpcRequest extends RpcAcsRequest<CommonResponse> {

    public CommonRpcRequest(String product) {
        super(product);
        setAcceptFormat(FormatType.JSON);
    }

    public CommonRpcRequest(String product, String version, String action) {
        super(product, version, action);
        setAcceptFormat(FormatType.JSON);
    }

    public CommonRpcRequest(String product, String version, String action, String locationProduct) {
        super(product, version, action, locationProduct);
        setAcceptFormat(FormatType.JSON);
    }

    public CommonRpcRequest(String product, String version, String action, String locationProduct,
                            String endpointType) {
        super(product, version, action, locationProduct, endpointType);
        setAcceptFormat(FormatType.JSON);
    }

    @Override
    public Class<CommonResponse> getResponseClass() {
        return CommonResponse.class;
    }

}
