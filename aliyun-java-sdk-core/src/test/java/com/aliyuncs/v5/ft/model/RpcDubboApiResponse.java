package com.aliyuncs.v5.ft.model;

import com.aliyuncs.v5.AcsResponse;
import com.aliyuncs.v5.exceptions.ClientException;
import com.aliyuncs.v5.exceptions.ServerException;
import com.aliyuncs.v5.transform.UnmarshallerContext;

public class RpcDubboApiResponse extends AcsResponse {

    @Override
    public AcsResponse getInstance(UnmarshallerContext context) throws ClientException, ServerException {
        return null;
    }

}
