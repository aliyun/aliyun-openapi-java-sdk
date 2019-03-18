/*
 * Copyright 2017 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;

public class DescribeVpcAccessesRequest extends RpcAcsRequest<DescribeVpcAccessesResponse> {
    
    public DescribeVpcAccessesRequest() {
        super("CloudAPI", "2016-07-14", "DescribeVpcAccesses", "apigateway");
    }

    @Override
    public Class<DescribeVpcAccessesResponse> getResponseClass() {
        return DescribeVpcAccessesResponse.class;
    }

}
