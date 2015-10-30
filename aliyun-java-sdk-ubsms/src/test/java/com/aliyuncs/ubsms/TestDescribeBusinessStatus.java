/*
 * Copyright 2015 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.aliyuncs.ubsms;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.ubsms.model.v20150623.DescribeBusinessStatusRequest;
import com.aliyuncs.ubsms.model.v20150623.DescribeBusinessStatusResponse;
import com.aliyuncs.ubsms.model.v20150623.DescribeBusinessStatusResponse.UserBusinessStatus;
import com.aliyuncs.ubsms.model.v20150623.DescribeBusinessStatusResponse.UserBusinessStatus.Status;
import org.junit.Test;

/**
 * @author boyang 15/9/6 下午6:04
 */
public class TestDescribeBusinessStatus extends TestBase {
    @Test
    public void test_DescribeUserBusinessStatus() {
        DescribeBusinessStatusRequest request = new DescribeBusinessStatusRequest();
        try {
            DescribeBusinessStatusResponse response = client.getAcsResponse(request);
            System.out.println(response.getUserBusinessStatusList().size() + " services in total :");
            for(UserBusinessStatus ubs : response.getUserBusinessStatusList()){
                System.out.println("uid : "+ ubs.getUid());
                System.out.println("service : "+ubs.getServiceCode());
                for(Status status : ubs.getStatuses()){
                    System.out.println(status.getStatusKey());
                    System.out.println(status.getStatusValue());
                }
                System.out.println("=================================");
            }
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }
}
