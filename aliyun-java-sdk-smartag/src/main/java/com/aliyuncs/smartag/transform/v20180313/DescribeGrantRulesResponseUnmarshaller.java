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

import com.aliyuncs.smartag.model.v20180313.DescribeGrantRulesResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeGrantRulesResponse.GrantRule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGrantRulesResponseUnmarshaller {

	public static DescribeGrantRulesResponse unmarshall(DescribeGrantRulesResponse describeGrantRulesResponse, UnmarshallerContext _ctx) {
		
		describeGrantRulesResponse.setRequestId(_ctx.stringValue("DescribeGrantRulesResponse.RequestId"));
		describeGrantRulesResponse.setTotalCount(_ctx.integerValue("DescribeGrantRulesResponse.TotalCount"));
		describeGrantRulesResponse.setPageSize(_ctx.integerValue("DescribeGrantRulesResponse.PageSize"));
		describeGrantRulesResponse.setPageNumber(_ctx.integerValue("DescribeGrantRulesResponse.PageNumber"));

		List<GrantRule> grantRules = new ArrayList<GrantRule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGrantRulesResponse.GrantRules.Length"); i++) {
			GrantRule grantRule = new GrantRule();
			grantRule.setGmtCreate(_ctx.longValue("DescribeGrantRulesResponse.GrantRules["+ i +"].GmtCreate"));
			grantRule.setCenUid(_ctx.longValue("DescribeGrantRulesResponse.GrantRules["+ i +"].CenUid"));
			grantRule.setGrantTrafficService(_ctx.booleanValue("DescribeGrantRulesResponse.GrantRules["+ i +"].GrantTrafficService"));
			grantRule.setCcnInstanceId(_ctx.stringValue("DescribeGrantRulesResponse.GrantRules["+ i +"].CcnInstanceId"));
			grantRule.setGrantRuleId(_ctx.stringValue("DescribeGrantRulesResponse.GrantRules["+ i +"].GrantRuleId"));
			grantRule.setCenInstanceId(_ctx.stringValue("DescribeGrantRulesResponse.GrantRules["+ i +"].CenInstanceId"));
			grantRule.setGmtModified(_ctx.longValue("DescribeGrantRulesResponse.GrantRules["+ i +"].GmtModified"));
			grantRule.setCcnUid(_ctx.longValue("DescribeGrantRulesResponse.GrantRules["+ i +"].CcnUid"));
			grantRule.setRegionId(_ctx.stringValue("DescribeGrantRulesResponse.GrantRules["+ i +"].RegionId"));

			grantRules.add(grantRule);
		}
		describeGrantRulesResponse.setGrantRules(grantRules);
	 
	 	return describeGrantRulesResponse;
	}
}