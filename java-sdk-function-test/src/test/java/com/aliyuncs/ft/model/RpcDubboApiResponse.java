package com.aliyuncs.ft.model;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.transform.UnmarshallerContext;

public class RpcDubboApiResponse extends AcsResponse {

    @Override
    public AcsResponse getInstance(UnmarshallerContext context) throws ClientException, ServerException {
        return null;
    }

}
