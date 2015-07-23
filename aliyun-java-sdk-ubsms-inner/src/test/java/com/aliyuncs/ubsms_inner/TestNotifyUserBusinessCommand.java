/*
 * Copyright 2015 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.aliyuncs.ubsms_inner;

import org.junit.Test;

import com.aliyuncs.ubsms_inner.model.v20150623.NotifyUserBusinessCommandRequest;
import com.aliyuncs.ubsms_inner.model.v20150623.NotifyUserBusinessCommandResponse;

/**
 * 类TestNotifyUserBusinessCommand.java的实现描述：TODO 类实现描述 
 * @author chua 2015年7月23日 上午9:28:27
 */
public class TestNotifyUserBusinessCommand extends TestBase {
    @Test
    public void test_NotifyUserBusinessCommand()  {
        try{
            NotifyUserBusinessCommandRequest req = new NotifyUserBusinessCommandRequest();
            req.setCmd("ceaseUserResourcesForDebt");//      ceaseUserResourcesForDebt, releaseUserResourcesForDebtOverDue;
            req.setUid("1250434591322550");
            req.setServiceCode("ecs");
            NotifyUserBusinessCommandResponse resp = client.getAcsResponse(req);
            System.out.println(resp.getSuccess());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
