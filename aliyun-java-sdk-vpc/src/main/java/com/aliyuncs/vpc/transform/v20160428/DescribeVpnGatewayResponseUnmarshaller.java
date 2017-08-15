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

import com.aliyuncs.vpc.model.v20160428.DescribeVpnGatewayResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVpnGatewayResponseUnmarshaller {

	public static DescribeVpnGatewayResponse unmarshall(DescribeVpnGatewayResponse describeVpnGatewayResponse, UnmarshallerContext context) {
		
		describeVpnGatewayResponse.setRequestId(context.stringValue("DescribeVpnGatewayResponse.RequestId"));
		describeVpnGatewayResponse.setVpnGatewayId(context.stringValue("DescribeVpnGatewayResponse.VpnGatewayId"));
		describeVpnGatewayResponse.setVpcId(context.stringValue("DescribeVpnGatewayResponse.VpcId"));
		describeVpnGatewayResponse.setVSwitchId(context.stringValue("DescribeVpnGatewayResponse.VSwitchId"));
		describeVpnGatewayResponse.setInternetIp(context.stringValue("DescribeVpnGatewayResponse.InternetIp"));
		describeVpnGatewayResponse.setCreateTime(context.longValue("DescribeVpnGatewayResponse.CreateTime"));
		describeVpnGatewayResponse.setEndTime(context.longValue("DescribeVpnGatewayResponse.EndTime"));
		describeVpnGatewayResponse.setSpec(context.stringValue("DescribeVpnGatewayResponse.Spec"));
		describeVpnGatewayResponse.setName(context.stringValue("DescribeVpnGatewayResponse.Name"));
		describeVpnGatewayResponse.setDescription(context.stringValue("DescribeVpnGatewayResponse.Description"));
		describeVpnGatewayResponse.setStatus(context.stringValue("DescribeVpnGatewayResponse.Status"));
		describeVpnGatewayResponse.setBusinessStatus(context.stringValue("DescribeVpnGatewayResponse.BusinessStatus"));
	 
	 	return describeVpnGatewayResponse;
	}
}