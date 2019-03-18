/*
 * Copyright 2017 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.aliyuncs.cloudapi.transform.v20160714;

import com.aliyuncs.cloudapi.model.v20160714.SetVpcAccessResponse;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version
 */
public class SetVpcAccessResponseUnmarshaller {
    
    public static SetVpcAccessResponse unmarshall(SetVpcAccessResponse setVpcAccessResponse, UnmarshallerContext context) {
        
        setVpcAccessResponse.setRequestId(context.stringValue("SetVpcAccessResponse.RequestId"));
     
        return setVpcAccessResponse;
    }

}
