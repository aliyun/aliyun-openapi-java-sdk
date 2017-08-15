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

import com.aliyuncs.vpc.model.v20160428.DescribeVpnGatewaysResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeVpnGatewaysResponse.VpnGateway;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVpnGatewaysResponseUnmarshaller {

	public static DescribeVpnGatewaysResponse unmarshall(DescribeVpnGatewaysResponse describeVpnGatewaysResponse, UnmarshallerContext context) {
		
		describeVpnGatewaysResponse.setRequestId(context.stringValue("DescribeVpnGatewaysResponse.RequestId"));
		describeVpnGatewaysResponse.setTotalCount(context.integerValue("DescribeVpnGatewaysResponse.TotalCount"));
		describeVpnGatewaysResponse.setPageNumber(context.integerValue("DescribeVpnGatewaysResponse.PageNumber"));
		describeVpnGatewaysResponse.setPageSize(context.integerValue("DescribeVpnGatewaysResponse.PageSize"));

		List<VpnGateway> vpnGateways = new ArrayList<VpnGateway>();
		for (int i = 0; i < context.lengthValue("DescribeVpnGatewaysResponse.VpnGateways.Length"); i++) {
			VpnGateway vpnGateway = new VpnGateway();
			vpnGateway.setVpnGatewayId(context.stringValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].VpnGatewayId"));
			vpnGateway.setVpcId(context.stringValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].VpcId"));
			vpnGateway.setVSwitchId(context.stringValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].VSwitchId"));
			vpnGateway.setInternetIp(context.stringValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].InternetIp"));
			vpnGateway.setCreateTime(context.longValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].CreateTime"));
			vpnGateway.setEndTime(context.longValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].EndTime"));
			vpnGateway.setSpec(context.stringValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].Spec"));
			vpnGateway.setName(context.stringValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].Name"));
			vpnGateway.setDescription(context.stringValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].Description"));
			vpnGateway.setStatus(context.stringValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].Status"));
			vpnGateway.setBusinessStatus(context.stringValue("DescribeVpnGatewaysResponse.VpnGateways["+ i +"].BusinessStatus"));

			vpnGateways.add(vpnGateway);
		}
		describeVpnGatewaysResponse.setVpnGateways(vpnGateways);
	 
	 	return describeVpnGatewaysResponse;
	}
}