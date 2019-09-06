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

import com.aliyuncs.vpc.model.v20160428.DescribeIpv6EgressOnlyRulesResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeIpv6EgressOnlyRulesResponse.Ipv6EgressOnlyRule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIpv6EgressOnlyRulesResponseUnmarshaller {

	public static DescribeIpv6EgressOnlyRulesResponse unmarshall(DescribeIpv6EgressOnlyRulesResponse describeIpv6EgressOnlyRulesResponse, UnmarshallerContext _ctx) {
		
		describeIpv6EgressOnlyRulesResponse.setRequestId(_ctx.stringValue("DescribeIpv6EgressOnlyRulesResponse.RequestId"));
		describeIpv6EgressOnlyRulesResponse.setTotalCount(_ctx.integerValue("DescribeIpv6EgressOnlyRulesResponse.TotalCount"));
		describeIpv6EgressOnlyRulesResponse.setPageNumber(_ctx.integerValue("DescribeIpv6EgressOnlyRulesResponse.PageNumber"));
		describeIpv6EgressOnlyRulesResponse.setPageSize(_ctx.integerValue("DescribeIpv6EgressOnlyRulesResponse.PageSize"));

		List<Ipv6EgressOnlyRule> ipv6EgressOnlyRules = new ArrayList<Ipv6EgressOnlyRule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeIpv6EgressOnlyRulesResponse.Ipv6EgressOnlyRules.Length"); i++) {
			Ipv6EgressOnlyRule ipv6EgressOnlyRule = new Ipv6EgressOnlyRule();
			ipv6EgressOnlyRule.setIpv6EgressOnlyRuleId(_ctx.stringValue("DescribeIpv6EgressOnlyRulesResponse.Ipv6EgressOnlyRules["+ i +"].Ipv6EgressOnlyRuleId"));
			ipv6EgressOnlyRule.setInstanceType(_ctx.stringValue("DescribeIpv6EgressOnlyRulesResponse.Ipv6EgressOnlyRules["+ i +"].InstanceType"));
			ipv6EgressOnlyRule.setInstanceId(_ctx.stringValue("DescribeIpv6EgressOnlyRulesResponse.Ipv6EgressOnlyRules["+ i +"].InstanceId"));
			ipv6EgressOnlyRule.setStatus(_ctx.stringValue("DescribeIpv6EgressOnlyRulesResponse.Ipv6EgressOnlyRules["+ i +"].Status"));
			ipv6EgressOnlyRule.setName(_ctx.stringValue("DescribeIpv6EgressOnlyRulesResponse.Ipv6EgressOnlyRules["+ i +"].Name"));
			ipv6EgressOnlyRule.setDescription(_ctx.stringValue("DescribeIpv6EgressOnlyRulesResponse.Ipv6EgressOnlyRules["+ i +"].Description"));

			ipv6EgressOnlyRules.add(ipv6EgressOnlyRule);
		}
		describeIpv6EgressOnlyRulesResponse.setIpv6EgressOnlyRules(ipv6EgressOnlyRules);
	 
	 	return describeIpv6EgressOnlyRulesResponse;
	}
}