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

package com.aliyuncs.smartag.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.DescribeGrantSagRulesResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeGrantSagRulesResponse.GrantRule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGrantSagRulesResponseUnmarshaller {

	public static DescribeGrantSagRulesResponse unmarshall(DescribeGrantSagRulesResponse describeGrantSagRulesResponse, UnmarshallerContext _ctx) {
		
		describeGrantSagRulesResponse.setRequestId(_ctx.stringValue("DescribeGrantSagRulesResponse.RequestId"));
		describeGrantSagRulesResponse.setTotalCount(_ctx.integerValue("DescribeGrantSagRulesResponse.TotalCount"));
		describeGrantSagRulesResponse.setPageSize(_ctx.integerValue("DescribeGrantSagRulesResponse.PageSize"));
		describeGrantSagRulesResponse.setPageNumber(_ctx.integerValue("DescribeGrantSagRulesResponse.PageNumber"));

		List<GrantRule> grantRules = new ArrayList<GrantRule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGrantSagRulesResponse.GrantRules.Length"); i++) {
			GrantRule grantRule = new GrantRule();
			grantRule.setInstanceId(_ctx.stringValue("DescribeGrantSagRulesResponse.GrantRules["+ i +"].InstanceId"));
			grantRule.setGrantTrafficService(_ctx.booleanValue("DescribeGrantSagRulesResponse.GrantRules["+ i +"].GrantTrafficService"));
			grantRule.setCcnInstanceId(_ctx.stringValue("DescribeGrantSagRulesResponse.GrantRules["+ i +"].CcnInstanceId"));
			grantRule.setCreateTime(_ctx.longValue("DescribeGrantSagRulesResponse.GrantRules["+ i +"].CreateTime"));
			grantRule.setCcnUid(_ctx.longValue("DescribeGrantSagRulesResponse.GrantRules["+ i +"].CcnUid"));
			grantRule.setSmartAGId(_ctx.stringValue("DescribeGrantSagRulesResponse.GrantRules["+ i +"].SmartAGId"));

			grantRules.add(grantRule);
		}
		describeGrantSagRulesResponse.setGrantRules(grantRules);
	 
	 	return describeGrantSagRulesResponse;
	}
}