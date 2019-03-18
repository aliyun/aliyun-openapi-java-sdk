/*
 * Copyright 2017 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
package com.aliyuncs.cloudapi.transform.v20160714;

import com.aliyuncs.cloudapi.model.v20160714.DescribeVpcAccessesResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeVpcAccessesResponse.VpcAccessAttribute;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;

public class DescribeVpcAccessesResponseUnmarshaller {
    
    public static DescribeVpcAccessesResponse unmarshall(DescribeVpcAccessesResponse describeVpcAccessesResponseResponse, UnmarshallerContext context) {
        
        describeVpcAccessesResponseResponse.setRequestId(context.stringValue("DescribeVpcAccessesResponse.RequestId"));
        describeVpcAccessesResponseResponse.setTotalCount(context.integerValue("DescribeVpcAccessesResponse.TotalCount"));
        describeVpcAccessesResponseResponse.setPageSize(context.integerValue("DescribeVpcAccessesResponse.PageSize"));
        describeVpcAccessesResponseResponse.setPageNumber(context.integerValue("DescribeVpcAccessesResponse.PageNumber"));

        List<VpcAccessAttribute> vpcAccessAttributes = new ArrayList<VpcAccessAttribute>();
        for (int i = 0; i < context.lengthValue("DescribeVpcAccessesResponse.VpcAccessAttributes.Length"); i++) {
            VpcAccessAttribute vpcAccessAttribute = new VpcAccessAttribute();
            vpcAccessAttribute.setVpcId(context.stringValue("DescribeVpcAccessesResponse.VpcAccessAttributes["+ i +"].VpcId"));
            vpcAccessAttribute.setInstanceId(context.stringValue("DescribeVpcAccessesResponse.VpcAccessAttributes["+ i +"].InstanceId"));
            vpcAccessAttribute.setPort(context.integerValue("DescribeVpcAccessesResponse.VpcAccessAttributes["+ i +"].Port"));
            vpcAccessAttribute.setName(context.stringValue("DescribeVpcAccessesResponse.VpcAccessAttributes["+ i +"].Name"));
            vpcAccessAttribute.setCreatedTime(context.stringValue("DescribeVpcAccessesResponse.VpcAccessAttributes["+ i +"].CreatedTime"));

            vpcAccessAttributes.add(vpcAccessAttribute);
        }
        
        describeVpcAccessesResponseResponse.setVpcAccessAttributes(vpcAccessAttributes);
     
        return describeVpcAccessesResponseResponse;
    }

}
