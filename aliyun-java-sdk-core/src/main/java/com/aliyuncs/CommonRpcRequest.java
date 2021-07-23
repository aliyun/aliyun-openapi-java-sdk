package com.aliyuncs;

public class CommonRpcRequest extends RpcAcsRequest<CommonResponse> {

    public CommonRpcRequest(String product) {
        super(product);
    }

    public CommonRpcRequest(String product, String version, String action) {
        super(product, version, action);
    }

    public CommonRpcRequest(String product, String version, String action, String locationProduct) {
        super(product, version, action, locationProduct);
    }

    public CommonRpcRequest(String product, String version, String action, String locationProduct,
                            String endpointType) {
        super(product, version, action, locationProduct, endpointType);
    }

    @Override
    public Class<CommonResponse> getResponseClass() {
        return CommonResponse.class;
    }

}
