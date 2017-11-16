/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.DescribeVpcAttributeResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeVpcAttributeResponse.CloudResourceSetType;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVpcAttributeResponseUnmarshaller {

	public static DescribeVpcAttributeResponse unmarshall(DescribeVpcAttributeResponse describeVpcAttributeResponse, UnmarshallerContext context) {
		
		describeVpcAttributeResponse.setRequestId(context.stringValue("DescribeVpcAttributeResponse.RequestId"));
		describeVpcAttributeResponse.setVpcId(context.stringValue("DescribeVpcAttributeResponse.VpcId"));
		describeVpcAttributeResponse.setRegionId(context.stringValue("DescribeVpcAttributeResponse.RegionId"));
		describeVpcAttributeResponse.setStatus(context.stringValue("DescribeVpcAttributeResponse.Status"));
		describeVpcAttributeResponse.setVpcName(context.stringValue("DescribeVpcAttributeResponse.VpcName"));
		describeVpcAttributeResponse.setCreationTime(context.stringValue("DescribeVpcAttributeResponse.CreationTime"));
		describeVpcAttributeResponse.setCidrBlock(context.stringValue("DescribeVpcAttributeResponse.CidrBlock"));
		describeVpcAttributeResponse.setVRouterId(context.stringValue("DescribeVpcAttributeResponse.VRouterId"));
		describeVpcAttributeResponse.setDescription(context.stringValue("DescribeVpcAttributeResponse.Description"));
		describeVpcAttributeResponse.setIsDefault(context.booleanValue("DescribeVpcAttributeResponse.IsDefault"));
		describeVpcAttributeResponse.setClassicLinkEnabled(context.booleanValue("DescribeVpcAttributeResponse.ClassicLinkEnabled"));

		List<String> vSwitchIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeVpcAttributeResponse.VSwitchIds.Length"); i++) {
			vSwitchIds.add(context.stringValue("DescribeVpcAttributeResponse.VSwitchIds["+ i +"]"));
		}
		describeVpcAttributeResponse.setVSwitchIds(vSwitchIds);

		List<String> userCidrs = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeVpcAttributeResponse.UserCidrs.Length"); i++) {
			userCidrs.add(context.stringValue("DescribeVpcAttributeResponse.UserCidrs["+ i +"]"));
		}
		describeVpcAttributeResponse.setUserCidrs(userCidrs);

		List<CloudResourceSetType> cloudResources = new ArrayList<CloudResourceSetType>();
		for (int i = 0; i < context.lengthValue("DescribeVpcAttributeResponse.CloudResources.Length"); i++) {
			CloudResourceSetType cloudResourceSetType = new CloudResourceSetType();
			cloudResourceSetType.setResourceType(context.stringValue("DescribeVpcAttributeResponse.CloudResources["+ i +"].ResourceType"));
			cloudResourceSetType.setResourceCount(context.integerValue("DescribeVpcAttributeResponse.CloudResources["+ i +"].ResourceCount"));

			cloudResources.add(cloudResourceSetType);
		}
		describeVpcAttributeResponse.setCloudResources(cloudResources);
	 
	 	return describeVpcAttributeResponse;
	}
}