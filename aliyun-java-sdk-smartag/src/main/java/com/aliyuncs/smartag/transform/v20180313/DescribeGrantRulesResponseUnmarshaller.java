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

	public static DescribeGrantRulesResponse unmarshall(DescribeGrantRulesResponse describeGrantRulesResponse, UnmarshallerContext context) {
		
		describeGrantRulesResponse.setRequestId(context.stringValue("DescribeGrantRulesResponse.RequestId"));
		describeGrantRulesResponse.setTotalCount(context.integerValue("DescribeGrantRulesResponse.TotalCount"));
		describeGrantRulesResponse.setPageNumber(context.integerValue("DescribeGrantRulesResponse.PageNumber"));
		describeGrantRulesResponse.setPageSize(context.integerValue("DescribeGrantRulesResponse.PageSize"));

		List<GrantRule> grantRules = new ArrayList<GrantRule>();
		for (int i = 0; i < context.lengthValue("DescribeGrantRulesResponse.GrantRules.Length"); i++) {
			GrantRule grantRule = new GrantRule();
			grantRule.setGrantRuleId(context.stringValue("DescribeGrantRulesResponse.GrantRules["+ i +"].GrantRuleId"));
			grantRule.setCenUid(context.longValue("DescribeGrantRulesResponse.GrantRules["+ i +"].CenUid"));
			grantRule.setCcnId(context.longValue("DescribeGrantRulesResponse.GrantRules["+ i +"].CcnId"));
			grantRule.setCenInstanceId(context.stringValue("DescribeGrantRulesResponse.GrantRules["+ i +"].CenInstanceId"));
			grantRule.setCcnInstanceId(context.stringValue("DescribeGrantRulesResponse.GrantRules["+ i +"].CcnInstanceId"));
			grantRule.setGmtCreate(context.longValue("DescribeGrantRulesResponse.GrantRules["+ i +"].GmtCreate"));
			grantRule.setGmtModified(context.longValue("DescribeGrantRulesResponse.GrantRules["+ i +"].GmtModified"));
			grantRule.setRegionId(context.stringValue("DescribeGrantRulesResponse.GrantRules["+ i +"].RegionId"));

			grantRules.add(grantRule);
		}
		describeGrantRulesResponse.setGrantRules(grantRules);
	 
	 	return describeGrantRulesResponse;
	}
}