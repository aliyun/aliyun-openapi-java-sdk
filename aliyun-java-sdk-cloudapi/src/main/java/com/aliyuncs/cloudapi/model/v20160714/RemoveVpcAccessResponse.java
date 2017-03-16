/*
 * Copyright 2017 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudapi.transform.v20160714.RemoveVpcAccessResponseUnmarshaller;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * 类VpcRevokeAccessResponse.java的实现描述：TODO 类实现描述 
 * @author zhangw 2017-3-8 下午8:19:09
 */
public class RemoveVpcAccessResponse extends AcsResponse {
    
    private String requestId;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public AcsResponse getInstance(UnmarshallerContext context) throws ClientException, ServerException {
        return  RemoveVpcAccessResponseUnmarshaller.unmarshall(this, context);
    }

}
