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

package com.aliyuncs.dfs.transform.v20180620;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dfs.model.v20180620.ListAccessRulesResponse;
import com.aliyuncs.dfs.model.v20180620.ListAccessRulesResponse.AccessRule;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAccessRulesResponseUnmarshaller {

	public static ListAccessRulesResponse unmarshall(ListAccessRulesResponse listAccessRulesResponse, UnmarshallerContext _ctx) {
		
		listAccessRulesResponse.setRequestId(_ctx.stringValue("ListAccessRulesResponse.RequestId"));
		listAccessRulesResponse.setTotalCount(_ctx.integerValue("ListAccessRulesResponse.TotalCount"));
		listAccessRulesResponse.setNextToken(_ctx.stringValue("ListAccessRulesResponse.NextToken"));

		List<AccessRule> accessRules = new ArrayList<AccessRule>();
		for (int i = 0; i < _ctx.lengthValue("ListAccessRulesResponse.AccessRules.Length"); i++) {
			AccessRule accessRule = new AccessRule();
			accessRule.setAccessRuleId(_ctx.stringValue("ListAccessRulesResponse.AccessRules["+ i +"].AccessRuleId"));
			accessRule.setNetworkSegment(_ctx.stringValue("ListAccessRulesResponse.AccessRules["+ i +"].NetworkSegment"));
			accessRule.setDescription(_ctx.stringValue("ListAccessRulesResponse.AccessRules["+ i +"].Description"));
			accessRule.setAccessGroupId(_ctx.stringValue("ListAccessRulesResponse.AccessRules["+ i +"].AccessGroupId"));
			accessRule.setCreateTime(_ctx.stringValue("ListAccessRulesResponse.AccessRules["+ i +"].CreateTime"));
			accessRule.setRWAccessType(_ctx.stringValue("ListAccessRulesResponse.AccessRules["+ i +"].RWAccessType"));
			accessRule.setPriority(_ctx.integerValue("ListAccessRulesResponse.AccessRules["+ i +"].Priority"));
			accessRule.setRegionId(_ctx.stringValue("ListAccessRulesResponse.AccessRules["+ i +"].RegionId"));

			accessRules.add(accessRule);
		}
		listAccessRulesResponse.setAccessRules(accessRules);
	 
	 	return listAccessRulesResponse;
	}
}