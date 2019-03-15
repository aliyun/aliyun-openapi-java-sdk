/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.vpc.transform.v20160428;

import com.aliyuncs.vpc.model.v20160428.DescribeIpv6GatewayAttributeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIpv6GatewayAttributeResponseUnmarshaller {

	public static DescribeIpv6GatewayAttributeResponse unmarshall(DescribeIpv6GatewayAttributeResponse describeIpv6GatewayAttributeResponse, UnmarshallerContext context) {
		
		describeIpv6GatewayAttributeResponse.setRequestId(context.stringValue("DescribeIpv6GatewayAttributeResponse.RequestId"));
		describeIpv6GatewayAttributeResponse.setRegionId(context.stringValue("DescribeIpv6GatewayAttributeResponse.RegionId"));
		describeIpv6GatewayAttributeResponse.setIpv6GatewayId(context.stringValue("DescribeIpv6GatewayAttributeResponse.Ipv6GatewayId"));
		describeIpv6GatewayAttributeResponse.setVpcId(context.stringValue("DescribeIpv6GatewayAttributeResponse.VpcId"));
		describeIpv6GatewayAttributeResponse.setStatus(context.stringValue("DescribeIpv6GatewayAttributeResponse.Status"));
		describeIpv6GatewayAttributeResponse.setBusinessStatus(context.stringValue("DescribeIpv6GatewayAttributeResponse.BusinessStatus"));
		describeIpv6GatewayAttributeResponse.setName(context.stringValue("DescribeIpv6GatewayAttributeResponse.Name"));
		describeIpv6GatewayAttributeResponse.setDescription(context.stringValue("DescribeIpv6GatewayAttributeResponse.Description"));
		describeIpv6GatewayAttributeResponse.setSpec(context.stringValue("DescribeIpv6GatewayAttributeResponse.Spec"));
		describeIpv6GatewayAttributeResponse.setInstanceChargeType(context.stringValue("DescribeIpv6GatewayAttributeResponse.InstanceChargeType"));
		describeIpv6GatewayAttributeResponse.setExpiredTime(context.stringValue("DescribeIpv6GatewayAttributeResponse.ExpiredTime"));
		describeIpv6GatewayAttributeResponse.setCreationTime(context.stringValue("DescribeIpv6GatewayAttributeResponse.CreationTime"));
	 
	 	return describeIpv6GatewayAttributeResponse;
	}
}