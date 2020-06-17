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

import com.aliyuncs.smartag.model.v20180313.DescribeGrantSagVbrRulesResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeGrantSagVbrRulesResponse.GrantRule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGrantSagVbrRulesResponseUnmarshaller {

	public static DescribeGrantSagVbrRulesResponse unmarshall(DescribeGrantSagVbrRulesResponse describeGrantSagVbrRulesResponse, UnmarshallerContext _ctx) {
		
		describeGrantSagVbrRulesResponse.setRequestId(_ctx.stringValue("DescribeGrantSagVbrRulesResponse.RequestId"));
		describeGrantSagVbrRulesResponse.setTotalCount(_ctx.integerValue("DescribeGrantSagVbrRulesResponse.TotalCount"));
		describeGrantSagVbrRulesResponse.setPageNumber(_ctx.integerValue("DescribeGrantSagVbrRulesResponse.PageNumber"));
		describeGrantSagVbrRulesResponse.setPageSize(_ctx.integerValue("DescribeGrantSagVbrRulesResponse.PageSize"));

		List<GrantRule> grantRules = new ArrayList<GrantRule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGrantSagVbrRulesResponse.GrantRules.Length"); i++) {
			GrantRule grantRule = new GrantRule();
			grantRule.setCreateTime(_ctx.longValue("DescribeGrantSagVbrRulesResponse.GrantRules["+ i +"].CreateTime"));
			grantRule.setInstanceId(_ctx.stringValue("DescribeGrantSagVbrRulesResponse.GrantRules["+ i +"].InstanceId"));
			grantRule.setVbrUid(_ctx.longValue("DescribeGrantSagVbrRulesResponse.GrantRules["+ i +"].VbrUid"));
			grantRule.setVbrInstanceId(_ctx.stringValue("DescribeGrantSagVbrRulesResponse.GrantRules["+ i +"].VbrInstanceId"));
			grantRule.setVbrRegionId(_ctx.stringValue("DescribeGrantSagVbrRulesResponse.GrantRules["+ i +"].VbrRegionId"));
			grantRule.setSmartAGUid(_ctx.longValue("DescribeGrantSagVbrRulesResponse.GrantRules["+ i +"].SmartAGUid"));
			grantRule.setSmartAGId(_ctx.stringValue("DescribeGrantSagVbrRulesResponse.GrantRules["+ i +"].SmartAGId"));
			grantRule.setBound(_ctx.booleanValue("DescribeGrantSagVbrRulesResponse.GrantRules["+ i +"].Bound"));

			grantRules.add(grantRule);
		}
		describeGrantSagVbrRulesResponse.setGrantRules(grantRules);
	 
	 	return describeGrantSagVbrRulesResponse;
	}
}