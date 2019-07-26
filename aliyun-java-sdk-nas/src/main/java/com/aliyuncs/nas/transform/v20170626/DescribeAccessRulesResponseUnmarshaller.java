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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAccessRulesResponseUnmarshaller {

	public static DescribeAccessRulesResponse unmarshall(DescribeAccessRulesResponse describeAccessRulesResponse, UnmarshallerContext _ctx) {
		
		describeAccessRulesResponse.setRequestId(_ctx.stringValue("DescribeAccessRulesResponse.RequestId"));
		describeAccessRulesResponse.setTotalCount(_ctx.integerValue("DescribeAccessRulesResponse.TotalCount"));
		describeAccessRulesResponse.setPageSize(_ctx.integerValue("DescribeAccessRulesResponse.PageSize"));
		describeAccessRulesResponse.setPageNumber(_ctx.integerValue("DescribeAccessRulesResponse.PageNumber"));

		List<AccessRule> accessRules = new ArrayList<AccessRule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAccessRulesResponse.AccessRules.Length"); i++) {
			AccessRule accessRule = new AccessRule();
			accessRule.setSourceCidrIp(_ctx.stringValue("DescribeAccessRulesResponse.AccessRules["+ i +"].SourceCidrIp"));
			accessRule.setPriority(_ctx.integerValue("DescribeAccessRulesResponse.AccessRules["+ i +"].Priority"));
			accessRule.setAccessRuleId(_ctx.stringValue("DescribeAccessRulesResponse.AccessRules["+ i +"].AccessRuleId"));
			accessRule.setRWAccess(_ctx.stringValue("DescribeAccessRulesResponse.AccessRules["+ i +"].RWAccess"));
			accessRule.setUserAccess(_ctx.stringValue("DescribeAccessRulesResponse.AccessRules["+ i +"].UserAccess"));

			accessRules.add(accessRule);
		}
		describeAccessRulesResponse.setAccessRules(accessRules);
	 
	 	return describeAccessRulesResponse;
	}
}