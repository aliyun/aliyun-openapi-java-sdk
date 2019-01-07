package com.aliyuncs;

import com.aliyuncs.http.FormatType;

public class CommonRoaRequest extends RoaAcsRequest<CommonResponse> {

    public CommonRoaRequest(String product) {
        super(product);
        setSysAcceptFormat(FormatType.JSON);
    }

    public CommonRoaRequest(String product, String version, String action) {
        super(product, version, action);
        setSysAcceptFormat(FormatType.JSON);
    }

    public CommonRoaRequest(String product, String version, String action, String locationProduct) {
        super(product, version, action, locationProduct);
        setSysAcceptFormat(FormatType.JSON);
    }

    public CommonRoaRequest(String product, String version, String action, String locationProduct,
                            String endpointType) {
        super(product, version, action, locationProduct, endpointType);
        setSysAcceptFormat(FormatType.JSON);
    }

    @Override
    public Class<CommonResponse> getResponseClass() {
        return CommonResponse.class;
    }
}
