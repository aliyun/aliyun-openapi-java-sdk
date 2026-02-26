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

import com.aliyuncs.pvtz.model.v20180101.DescribeResolverRuleResponse;
import com.aliyuncs.pvtz.model.v20180101.DescribeResolverRuleResponse.ForwardIp;
import com.aliyuncs.pvtz.model.v20180101.DescribeResolverRuleResponse.Vpc;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeResolverRuleResponseUnmarshaller {

	public static DescribeResolverRuleResponse unmarshall(DescribeResolverRuleResponse describeResolverRuleResponse, UnmarshallerContext _ctx) {
		
		describeResolverRuleResponse.setRequestId(_ctx.stringValue("DescribeResolverRuleResponse.RequestId"));
		describeResolverRuleResponse.setCreateTime(_ctx.stringValue("DescribeResolverRuleResponse.CreateTime"));
		describeResolverRuleResponse.setName(_ctx.stringValue("DescribeResolverRuleResponse.Name"));
		describeResolverRuleResponse.setZoneName(_ctx.stringValue("DescribeResolverRuleResponse.ZoneName"));
		describeResolverRuleResponse.setType(_ctx.stringValue("DescribeResolverRuleResponse.Type"));
		describeResolverRuleResponse.setEndpointName(_ctx.stringValue("DescribeResolverRuleResponse.EndpointName"));
		describeResolverRuleResponse.setEndpointId(_ctx.stringValue("DescribeResolverRuleResponse.EndpointId"));
		describeResolverRuleResponse.setUpdateTime(_ctx.stringValue("DescribeResolverRuleResponse.UpdateTime"));
		describeResolverRuleResponse.setUpdateTimestamp(_ctx.longValue("DescribeResolverRuleResponse.UpdateTimestamp"));
		describeResolverRuleResponse.setId(_ctx.stringValue("DescribeResolverRuleResponse.Id"));
		describeResolverRuleResponse.setCreateTimestamp(_ctx.longValue("DescribeResolverRuleResponse.CreateTimestamp"));

		List<ForwardIp> forwardIps = new ArrayList<ForwardIp>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResolverRuleResponse.ForwardIps.Length"); i++) {
			ForwardIp forwardIp = new ForwardIp();
			forwardIp.setIp(_ctx.stringValue("DescribeResolverRuleResponse.ForwardIps["+ i +"].Ip"));
			forwardIp.setPort(_ctx.integerValue("DescribeResolverRuleResponse.ForwardIps["+ i +"].Port"));

			forwardIps.add(forwardIp);
		}
		describeResolverRuleResponse.setForwardIps(forwardIps);

		List<Vpc> bindVpcs = new ArrayList<Vpc>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResolverRuleResponse.BindVpcs.Length"); i++) {
			Vpc vpc = new Vpc();
			vpc.setVpcId(_ctx.stringValue("DescribeResolverRuleResponse.BindVpcs["+ i +"].VpcId"));
			vpc.setVpcName(_ctx.stringValue("DescribeResolverRuleResponse.BindVpcs["+ i +"].VpcName"));
			vpc.setVpcType(_ctx.stringValue("DescribeResolverRuleResponse.BindVpcs["+ i +"].VpcType"));
			vpc.setRegionName(_ctx.stringValue("DescribeResolverRuleResponse.BindVpcs["+ i +"].RegionName"));
			vpc.setRegionId(_ctx.stringValue("DescribeResolverRuleResponse.BindVpcs["+ i +"].RegionId"));
			vpc.setVpcUserId(_ctx.stringValue("DescribeResolverRuleResponse.BindVpcs["+ i +"].VpcUserId"));

			bindVpcs.add(vpc);
		}
		describeResolverRuleResponse.setBindVpcs(bindVpcs);
	 
	 	return describeResolverRuleResponse;
	}
}