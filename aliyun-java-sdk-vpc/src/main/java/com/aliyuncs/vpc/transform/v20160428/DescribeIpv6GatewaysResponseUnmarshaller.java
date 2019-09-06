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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.DescribeIpv6GatewaysResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeIpv6GatewaysResponse.Ipv6Gateway;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIpv6GatewaysResponseUnmarshaller {

	public static DescribeIpv6GatewaysResponse unmarshall(DescribeIpv6GatewaysResponse describeIpv6GatewaysResponse, UnmarshallerContext _ctx) {
		
		describeIpv6GatewaysResponse.setRequestId(_ctx.stringValue("DescribeIpv6GatewaysResponse.RequestId"));
		describeIpv6GatewaysResponse.setTotalCount(_ctx.integerValue("DescribeIpv6GatewaysResponse.TotalCount"));
		describeIpv6GatewaysResponse.setPageNumber(_ctx.integerValue("DescribeIpv6GatewaysResponse.PageNumber"));
		describeIpv6GatewaysResponse.setPageSize(_ctx.integerValue("DescribeIpv6GatewaysResponse.PageSize"));

		List<Ipv6Gateway> ipv6Gateways = new ArrayList<Ipv6Gateway>();
		for (int i = 0; i < _ctx.lengthValue("DescribeIpv6GatewaysResponse.Ipv6Gateways.Length"); i++) {
			Ipv6Gateway ipv6Gateway = new Ipv6Gateway();
			ipv6Gateway.setRegionId(_ctx.stringValue("DescribeIpv6GatewaysResponse.Ipv6Gateways["+ i +"].RegionId"));
			ipv6Gateway.setIpv6GatewayId(_ctx.stringValue("DescribeIpv6GatewaysResponse.Ipv6Gateways["+ i +"].Ipv6GatewayId"));
			ipv6Gateway.setVpcId(_ctx.stringValue("DescribeIpv6GatewaysResponse.Ipv6Gateways["+ i +"].VpcId"));
			ipv6Gateway.setStatus(_ctx.stringValue("DescribeIpv6GatewaysResponse.Ipv6Gateways["+ i +"].Status"));
			ipv6Gateway.setName(_ctx.stringValue("DescribeIpv6GatewaysResponse.Ipv6Gateways["+ i +"].Name"));
			ipv6Gateway.setDescription(_ctx.stringValue("DescribeIpv6GatewaysResponse.Ipv6Gateways["+ i +"].Description"));
			ipv6Gateway.setSpec(_ctx.stringValue("DescribeIpv6GatewaysResponse.Ipv6Gateways["+ i +"].Spec"));
			ipv6Gateway.setInstanceChargeType(_ctx.stringValue("DescribeIpv6GatewaysResponse.Ipv6Gateways["+ i +"].InstanceChargeType"));
			ipv6Gateway.setBusinessStatus(_ctx.stringValue("DescribeIpv6GatewaysResponse.Ipv6Gateways["+ i +"].BusinessStatus"));
			ipv6Gateway.setExpiredTime(_ctx.stringValue("DescribeIpv6GatewaysResponse.Ipv6Gateways["+ i +"].ExpiredTime"));
			ipv6Gateway.setCreationTime(_ctx.stringValue("DescribeIpv6GatewaysResponse.Ipv6Gateways["+ i +"].CreationTime"));

			ipv6Gateways.add(ipv6Gateway);
		}
		describeIpv6GatewaysResponse.setIpv6Gateways(ipv6Gateways);
	 
	 	return describeIpv6GatewaysResponse;
	}
}