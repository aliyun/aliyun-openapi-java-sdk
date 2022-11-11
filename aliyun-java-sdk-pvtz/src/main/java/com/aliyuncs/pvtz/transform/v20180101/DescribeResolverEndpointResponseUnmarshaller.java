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

package com.aliyuncs.pvtz.transform.v20180101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pvtz.model.v20180101.DescribeResolverEndpointResponse;
import com.aliyuncs.pvtz.model.v20180101.DescribeResolverEndpointResponse.IpConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeResolverEndpointResponseUnmarshaller {

	public static DescribeResolverEndpointResponse unmarshall(DescribeResolverEndpointResponse describeResolverEndpointResponse, UnmarshallerContext _ctx) {
		
		describeResolverEndpointResponse.setRequestId(_ctx.stringValue("DescribeResolverEndpointResponse.RequestId"));
		describeResolverEndpointResponse.setStatus(_ctx.stringValue("DescribeResolverEndpointResponse.Status"));
		describeResolverEndpointResponse.setSecurityGroupId(_ctx.stringValue("DescribeResolverEndpointResponse.SecurityGroupId"));
		describeResolverEndpointResponse.setCreateTime(_ctx.stringValue("DescribeResolverEndpointResponse.CreateTime"));
		describeResolverEndpointResponse.setName(_ctx.stringValue("DescribeResolverEndpointResponse.Name"));
		describeResolverEndpointResponse.setVpcRegionName(_ctx.stringValue("DescribeResolverEndpointResponse.VpcRegionName"));
		describeResolverEndpointResponse.setVpcId(_ctx.stringValue("DescribeResolverEndpointResponse.VpcId"));
		describeResolverEndpointResponse.setUpdateTime(_ctx.stringValue("DescribeResolverEndpointResponse.UpdateTime"));
		describeResolverEndpointResponse.setVpcRegionId(_ctx.stringValue("DescribeResolverEndpointResponse.VpcRegionId"));
		describeResolverEndpointResponse.setVpcName(_ctx.stringValue("DescribeResolverEndpointResponse.VpcName"));
		describeResolverEndpointResponse.setUpdateTimestamp(_ctx.longValue("DescribeResolverEndpointResponse.UpdateTimestamp"));
		describeResolverEndpointResponse.setId(_ctx.stringValue("DescribeResolverEndpointResponse.Id"));
		describeResolverEndpointResponse.setCreateTimestamp(_ctx.longValue("DescribeResolverEndpointResponse.CreateTimestamp"));

		List<IpConfig> ipConfigs = new ArrayList<IpConfig>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResolverEndpointResponse.IpConfigs.Length"); i++) {
			IpConfig ipConfig = new IpConfig();
			ipConfig.setVSwitchId(_ctx.stringValue("DescribeResolverEndpointResponse.IpConfigs["+ i +"].VSwitchId"));
			ipConfig.setCidrBlock(_ctx.stringValue("DescribeResolverEndpointResponse.IpConfigs["+ i +"].CidrBlock"));
			ipConfig.setIp(_ctx.stringValue("DescribeResolverEndpointResponse.IpConfigs["+ i +"].Ip"));
			ipConfig.setAzId(_ctx.stringValue("DescribeResolverEndpointResponse.IpConfigs["+ i +"].AzId"));

			ipConfigs.add(ipConfig);
		}
		describeResolverEndpointResponse.setIpConfigs(ipConfigs);
	 
	 	return describeResolverEndpointResponse;
	}
}