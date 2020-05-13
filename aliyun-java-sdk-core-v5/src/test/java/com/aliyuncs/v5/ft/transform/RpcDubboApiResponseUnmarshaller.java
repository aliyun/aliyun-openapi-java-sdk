package com.aliyuncs.v5.ft.transform;

import com.aliyuncs.v5.ft.model.RpcDubboApiResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;

public class RpcDubboApiResponseUnmarshaller {

    public static RpcDubboApiResponse unmarshall(RpcDubboApiResponse rpcDubboApiResponse, UnmarshallerContext context) {

        //rpcDubboApiResponse.setRequestId(context.stringValue("GenerateSessionAccessKeyResponse.RequestId"));

        return rpcDubboApiResponse;
    }

}
