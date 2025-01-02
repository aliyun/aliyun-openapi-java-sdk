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

import com.aliyuncs.dfs.model.v20180620.GetAccessRuleResponse;
import com.aliyuncs.dfs.model.v20180620.GetAccessRuleResponse.AccessRule;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAccessRuleResponseUnmarshaller {

	public static GetAccessRuleResponse unmarshall(GetAccessRuleResponse getAccessRuleResponse, UnmarshallerContext _ctx) {
		
		getAccessRuleResponse.setRequestId(_ctx.stringValue("GetAccessRuleResponse.RequestId"));

		AccessRule accessRule = new AccessRule();
		accessRule.setAccessRuleId(_ctx.stringValue("GetAccessRuleResponse.AccessRule.AccessRuleId"));
		accessRule.setNetworkSegment(_ctx.stringValue("GetAccessRuleResponse.AccessRule.NetworkSegment"));
		accessRule.setDescription(_ctx.stringValue("GetAccessRuleResponse.AccessRule.Description"));
		accessRule.setAccessGroupId(_ctx.stringValue("GetAccessRuleResponse.AccessRule.AccessGroupId"));
		accessRule.setCreateTime(_ctx.stringValue("GetAccessRuleResponse.AccessRule.CreateTime"));
		accessRule.setRWAccessType(_ctx.stringValue("GetAccessRuleResponse.AccessRule.RWAccessType"));
		accessRule.setPriority(_ctx.integerValue("GetAccessRuleResponse.AccessRule.Priority"));
		accessRule.setRegionId(_ctx.stringValue("GetAccessRuleResponse.AccessRule.RegionId"));
		getAccessRuleResponse.setAccessRule(accessRule);
	 
	 	return getAccessRuleResponse;
	}
}