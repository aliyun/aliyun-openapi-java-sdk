/*
 * Copyright 2015 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.aliyuncs.ubsms_inner;

import org.junit.Test;

import com.aliyuncs.ubsms_inner.model.v20150623.SetUserBusinessStatusesRequest;
import com.aliyuncs.ubsms_inner.model.v20150623.SetUserBusinessStatusesResponse;

/**
 * 类TestSetUserBusinessStatuses.java的实现描述：TODO 类实现描述 
 * @author chua 2015年7月23日 上午9:26:48
 */
public class TestSetUserBusinessStatuses extends TestBase {
    @Test
    public void test_SetUserBusinessStatuses() {
        try{
            SetUserBusinessStatusesRequest req = new SetUserBusinessStatusesRequest();
            req.setStatusKey1("enabled");
            req.setStatusValue1("false");
           
            req.setServiceCode("ecs");
            req.setUid("10000"); // service sub account
          
            SetUserBusinessStatusesResponse resp = client.getAcsResponse(req);
            System.out.println(resp.getSuccess());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
