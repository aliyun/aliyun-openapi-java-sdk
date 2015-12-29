/*
 * Copyright 2015 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.aliyuncs.rds;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstancesRequest;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstancesResponse;

/**
 * 类TestMain.java的实现描述：TODO 类实现描述
 * 
 * @author junjun.zhang 2015-12-29 下午3:28:52
 */
public class TestMain {
    public static void main(String[] args) throws ClientException {
        DescribeDBInstancesRequest describe = new DescribeDBInstancesRequest();
        describe.setRegionId("cn-hangzhou");
        IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", "***", "***");
        // DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", "Rds", "rds-cn-hangzhou.aliyuncs.com");
        IAcsClient client = new DefaultAcsClient(profile);

        try {
            DescribeDBInstancesResponse response = client.getAcsResponse(describe);
            System.out.println(response.getRequestId());
            System.out.println(response.getItems().size());
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }
}
