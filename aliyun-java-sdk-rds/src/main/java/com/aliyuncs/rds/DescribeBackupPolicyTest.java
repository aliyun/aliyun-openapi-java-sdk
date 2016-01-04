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
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.aliyuncs.rds.model.v20140815.DescribeBackupPolicyRequest;
import com.aliyuncs.rds.model.v20140815.DescribeBackupPolicyResponse;

public class DescribeBackupPolicyTest {
    public static void main(String[] args) throws ClientException {
        DescribeBackupPolicyRequest request = new DescribeBackupPolicyRequest();
        request.setDBInstanceId("rdsw95c6d095m9u6fk4w");
        IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", "***", "***");
        // 如果域名不正确，您也可以这样写
        // DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", "Rds", "rds-cn-hangzhou.aliyuncs.com");
        IAcsClient client = new DefaultAcsClient(profile);

        DescribeBackupPolicyResponse response = client.getAcsResponse(request);

        System.out.println(response.getRequestId());
        System.out.println(response.getBackupRetentionPeriod());
        System.out.println(response.getBackupLog());

    }
}
