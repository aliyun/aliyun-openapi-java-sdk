/*
 * Copyright 2015 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.aliyuncs.rds.demo;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.aliyuncs.rds.model.v20140815.DescribeBackupPolicyRequest;
import com.aliyuncs.rds.model.v20140815.DescribeBackupPolicyResponse;
import com.aliyuncs.rds.model.v20140815.RestartDBInstanceRequest;
import com.aliyuncs.rds.model.v20140815.RestartDBInstanceResponse;

// 获取备份策略
public class DescribeBackupPolicyTest {
    public static void main(String[] args) {
        try {
            DescribeBackupPolicyRequest request = new DescribeBackupPolicyRequest();
            // 必填项,如:rm-wz934c9ky80f90038
            request.setDBInstanceId("<your instance id>");
            // 资源在某个region内，必须指定region
            IClientProfile profile= DefaultProfile
                    .getProfile("cn-hangzhou", "<your access key id>", "<your access key secret>");
            IAcsClient client = new DefaultAcsClient(profile);

            DescribeBackupPolicyResponse response = client.getAcsResponse(request);

            System.out.println(response.getRequestId());
            System.out.println(response.getBackupRetentionPeriod());
            System.out.println(response.getBackupLog());
        }
        catch(ClientException e) {
            System.out.println(e.getErrCode());
            System.out.println(e.getMessage());
        }
    }
}
