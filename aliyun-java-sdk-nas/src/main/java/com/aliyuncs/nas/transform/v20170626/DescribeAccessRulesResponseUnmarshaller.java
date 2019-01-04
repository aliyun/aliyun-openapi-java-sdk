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

package com.aliyuncs.nas.transform.v20170626;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nas.model.v20170626.DescribeAccessRulesResponse;
import com.aliyuncs.nas.model.v20170626.DescribeAccessRulesResponse.AccessRule;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAccessRulesResponseUnmarshaller {

	public static DescribeAccessRulesResponse unmarshall(DescribeAccessRulesResponse describeAccessRulesResponse, UnmarshallerContext context) {
		
		describeAccessRulesResponse.setRequestId(context.stringValue("DescribeAccessRulesResponse.RequestId"));
		describeAccessRulesResponse.setTotalCount(context.integerValue("DescribeAccessRulesResponse.TotalCount"));
		describeAccessRulesResponse.setPageSize(context.integerValue("DescribeAccessRulesResponse.PageSize"));
		describeAccessRulesResponse.setPageNumber(context.integerValue("DescribeAccessRulesResponse.PageNumber"));

		List<AccessRule> accessRules = new ArrayList<AccessRule>();
		for (int i = 0; i < context.lengthValue("DescribeAccessRulesResponse.AccessRules.Length"); i++) {
			AccessRule accessRule = new AccessRule();
			accessRule.setSourceCidrIp(context.stringValue("DescribeAccessRulesResponse.AccessRules["+ i +"].SourceCidrIp"));
			accessRule.setPriority(context.integerValue("DescribeAccessRulesResponse.AccessRules["+ i +"].Priority"));
			accessRule.setAccessRuleId(context.stringValue("DescribeAccessRulesResponse.AccessRules["+ i +"].AccessRuleId"));
			accessRule.setRWAccess(context.stringValue("DescribeAccessRulesResponse.AccessRules["+ i +"].RWAccess"));
			accessRule.setUserAccess(context.stringValue("DescribeAccessRulesResponse.AccessRules["+ i +"].UserAccess"));

			accessRules.add(accessRule);
		}
		describeAccessRulesResponse.setAccessRules(accessRules);
	 
	 	return describeAccessRulesResponse;
	}
}