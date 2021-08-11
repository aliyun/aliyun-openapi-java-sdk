package com.aliyuncs;

public class CommonRoaRequest extends RoaAcsRequest<CommonResponse> {

    public CommonRoaRequest(String product) {
        super(product);
    }

    public CommonRoaRequest(String product, String version, String action) {
        super(product, version, action);
    }

    public CommonRoaRequest(String product, String version, String action, String locationProduct) {
        super(product, version, action, locationProduct);
    }

    public CommonRoaRequest(String product, String version, String action, String locationProduct,
                            String endpointType) {
        super(product, version, action, locationProduct, endpointType);
    }

    @Override
    public Class<CommonResponse> getResponseClass() {
        return CommonResponse.class;
    }
}
