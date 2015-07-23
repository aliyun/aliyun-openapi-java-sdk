/*
 * Copyright 2015 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.aliyuncs.ubsms_inner;

import org.junit.Test;

import com.aliyuncs.ubsms_inner.model.v20150623.SetUserSecurityStatusRequest;
import com.aliyuncs.ubsms_inner.model.v20150623.SetUserSecurityStatusResponse;

/**
 * 类TestSetUserSecurityStatus.java的实现描述：TODO 类实现描述 
 * @author chua 2015年7月23日 上午9:29:41
 */
public class TestSetUserSecurityStatus extends TestBase{

    
    @Test
    public void test_SetUserSecurityStatus() {
        try{
          SetUserSecurityStatusRequest request = new SetUserSecurityStatusRequest();
          request.setUid("1837537388585180");
          request.setStatusKey1("prohibitedByRiskControl");
          request.setStatusValue1("false");
          SetUserSecurityStatusResponse resp = client.getAcsResponse(request);
          System.out.println(resp.getRequestId());
          System.out.println(resp.getSuccess());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
