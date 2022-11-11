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

import com.aliyuncs.pvtz.model.v20180101.DescribeResolverEndpointsResponse;
import com.aliyuncs.pvtz.model.v20180101.DescribeResolverEndpointsResponse.Endpoint;
import com.aliyuncs.pvtz.model.v20180101.DescribeResolverEndpointsResponse.Endpoint.IpConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeResolverEndpointsResponseUnmarshaller {

	public static DescribeResolverEndpointsResponse unmarshall(DescribeResolverEndpointsResponse describeResolverEndpointsResponse, UnmarshallerContext _ctx) {
		
		describeResolverEndpointsResponse.setRequestId(_ctx.stringValue("DescribeResolverEndpointsResponse.RequestId"));
		describeResolverEndpointsResponse.setPageSize(_ctx.integerValue("DescribeResolverEndpointsResponse.PageSize"));
		describeResolverEndpointsResponse.setPageNumber(_ctx.integerValue("DescribeResolverEndpointsResponse.PageNumber"));
		describeResolverEndpointsResponse.setTotalPages(_ctx.integerValue("DescribeResolverEndpointsResponse.TotalPages"));
		describeResolverEndpointsResponse.setTotalItems(_ctx.integerValue("DescribeResolverEndpointsResponse.TotalItems"));

		List<Endpoint> endpoints = new ArrayList<Endpoint>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResolverEndpointsResponse.Endpoints.Length"); i++) {
			Endpoint endpoint = new Endpoint();
			endpoint.setStatus(_ctx.stringValue("DescribeResolverEndpointsResponse.Endpoints["+ i +"].Status"));
			endpoint.setVpcId(_ctx.stringValue("DescribeResolverEndpointsResponse.Endpoints["+ i +"].VpcId"));
			endpoint.setUpdateTime(_ctx.stringValue("DescribeResolverEndpointsResponse.Endpoints["+ i +"].UpdateTime"));
			endpoint.setSecurityGroupId(_ctx.stringValue("DescribeResolverEndpointsResponse.Endpoints["+ i +"].SecurityGroupId"));
			endpoint.setCreateTime(_ctx.stringValue("DescribeResolverEndpointsResponse.Endpoints["+ i +"].CreateTime"));
			endpoint.setVpcRegionId(_ctx.stringValue("DescribeResolverEndpointsResponse.Endpoints["+ i +"].VpcRegionId"));
			endpoint.setVpcName(_ctx.stringValue("DescribeResolverEndpointsResponse.Endpoints["+ i +"].VpcName"));
			endpoint.setUpdateTimestamp(_ctx.longValue("DescribeResolverEndpointsResponse.Endpoints["+ i +"].UpdateTimestamp"));
			endpoint.setVpcRegionName(_ctx.stringValue("DescribeResolverEndpointsResponse.Endpoints["+ i +"].VpcRegionName"));
			endpoint.setName(_ctx.stringValue("DescribeResolverEndpointsResponse.Endpoints["+ i +"].Name"));
			endpoint.setId(_ctx.stringValue("DescribeResolverEndpointsResponse.Endpoints["+ i +"].Id"));
			endpoint.setCreateTimestamp(_ctx.longValue("DescribeResolverEndpointsResponse.Endpoints["+ i +"].CreateTimestamp"));

			List<IpConfig> ipConfigs = new ArrayList<IpConfig>();
			for (int j = 0; j < _ctx.lengthValue("DescribeResolverEndpointsResponse.Endpoints["+ i +"].IpConfigs.Length"); j++) {
				IpConfig ipConfig = new IpConfig();
				ipConfig.setVSwitchId(_ctx.stringValue("DescribeResolverEndpointsResponse.Endpoints["+ i +"].IpConfigs["+ j +"].VSwitchId"));
				ipConfig.setCidrBlock(_ctx.stringValue("DescribeResolverEndpointsResponse.Endpoints["+ i +"].IpConfigs["+ j +"].CidrBlock"));
				ipConfig.setIp(_ctx.stringValue("DescribeResolverEndpointsResponse.Endpoints["+ i +"].IpConfigs["+ j +"].Ip"));
				ipConfig.setAzId(_ctx.stringValue("DescribeResolverEndpointsResponse.Endpoints["+ i +"].IpConfigs["+ j +"].AzId"));

				ipConfigs.add(ipConfig);
			}
			endpoint.setIpConfigs(ipConfigs);

			endpoints.add(endpoint);
		}
		describeResolverEndpointsResponse.setEndpoints(endpoints);
	 
	 	return describeResolverEndpointsResponse;
	}
}