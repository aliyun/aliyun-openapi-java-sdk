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

import com.aliyuncs.pvtz.model.v20180101.DescribeResolverRulesResponse;
import com.aliyuncs.pvtz.model.v20180101.DescribeResolverRulesResponse.Rule;
import com.aliyuncs.pvtz.model.v20180101.DescribeResolverRulesResponse.Rule.ForwardIp;
import com.aliyuncs.pvtz.model.v20180101.DescribeResolverRulesResponse.Rule.Vpc;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeResolverRulesResponseUnmarshaller {

	public static DescribeResolverRulesResponse unmarshall(DescribeResolverRulesResponse describeResolverRulesResponse, UnmarshallerContext _ctx) {
		
		describeResolverRulesResponse.setRequestId(_ctx.stringValue("DescribeResolverRulesResponse.RequestId"));
		describeResolverRulesResponse.setPageSize(_ctx.integerValue("DescribeResolverRulesResponse.PageSize"));
		describeResolverRulesResponse.setPageNumber(_ctx.integerValue("DescribeResolverRulesResponse.PageNumber"));
		describeResolverRulesResponse.setTotalPages(_ctx.integerValue("DescribeResolverRulesResponse.TotalPages"));
		describeResolverRulesResponse.setTotalItems(_ctx.integerValue("DescribeResolverRulesResponse.TotalItems"));

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResolverRulesResponse.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setType(_ctx.stringValue("DescribeResolverRulesResponse.Rules["+ i +"].Type"));
			rule.setUpdateTime(_ctx.stringValue("DescribeResolverRulesResponse.Rules["+ i +"].UpdateTime"));
			rule.setEndpointName(_ctx.stringValue("DescribeResolverRulesResponse.Rules["+ i +"].EndpointName"));
			rule.setCreateTime(_ctx.stringValue("DescribeResolverRulesResponse.Rules["+ i +"].CreateTime"));
			rule.setZoneName(_ctx.stringValue("DescribeResolverRulesResponse.Rules["+ i +"].ZoneName"));
			rule.setUpdateTimestamp(_ctx.longValue("DescribeResolverRulesResponse.Rules["+ i +"].UpdateTimestamp"));
			rule.setEndpointId(_ctx.stringValue("DescribeResolverRulesResponse.Rules["+ i +"].EndpointId"));
			rule.setName(_ctx.stringValue("DescribeResolverRulesResponse.Rules["+ i +"].Name"));
			rule.setId(_ctx.stringValue("DescribeResolverRulesResponse.Rules["+ i +"].Id"));
			rule.setCreateTimestamp(_ctx.longValue("DescribeResolverRulesResponse.Rules["+ i +"].CreateTimestamp"));

			List<ForwardIp> forwardIps = new ArrayList<ForwardIp>();
			for (int j = 0; j < _ctx.lengthValue("DescribeResolverRulesResponse.Rules["+ i +"].ForwardIps.Length"); j++) {
				ForwardIp forwardIp = new ForwardIp();
				forwardIp.setIp(_ctx.stringValue("DescribeResolverRulesResponse.Rules["+ i +"].ForwardIps["+ j +"].Ip"));
				forwardIp.setPort(_ctx.integerValue("DescribeResolverRulesResponse.Rules["+ i +"].ForwardIps["+ j +"].Port"));

				forwardIps.add(forwardIp);
			}
			rule.setForwardIps(forwardIps);

			List<Vpc> bindVpcs = new ArrayList<Vpc>();
			for (int j = 0; j < _ctx.lengthValue("DescribeResolverRulesResponse.Rules["+ i +"].BindVpcs.Length"); j++) {
				Vpc vpc = new Vpc();
				vpc.setVpcName(_ctx.stringValue("DescribeResolverRulesResponse.Rules["+ i +"].BindVpcs["+ j +"].VpcName"));
				vpc.setVpcId(_ctx.stringValue("DescribeResolverRulesResponse.Rules["+ i +"].BindVpcs["+ j +"].VpcId"));
				vpc.setVpcType(_ctx.stringValue("DescribeResolverRulesResponse.Rules["+ i +"].BindVpcs["+ j +"].VpcType"));
				vpc.setRegionName(_ctx.stringValue("DescribeResolverRulesResponse.Rules["+ i +"].BindVpcs["+ j +"].RegionName"));
				vpc.setRegionId(_ctx.stringValue("DescribeResolverRulesResponse.Rules["+ i +"].BindVpcs["+ j +"].RegionId"));
				vpc.setVpcUserId(_ctx.stringValue("DescribeResolverRulesResponse.Rules["+ i +"].BindVpcs["+ j +"].VpcUserId"));

				bindVpcs.add(vpc);
			}
			rule.setBindVpcs(bindVpcs);

			rules.add(rule);
		}
		describeResolverRulesResponse.setRules(rules);
	 
	 	return describeResolverRulesResponse;
	}
}