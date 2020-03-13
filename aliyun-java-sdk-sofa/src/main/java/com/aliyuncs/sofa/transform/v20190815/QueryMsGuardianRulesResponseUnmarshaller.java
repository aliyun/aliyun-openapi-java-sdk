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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryMsGuardianRulesResponse;
import com.aliyuncs.sofa.model.v20190815.QueryMsGuardianRulesResponse.GuardianRulesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMsGuardianRulesResponseUnmarshaller {

	public static QueryMsGuardianRulesResponse unmarshall(QueryMsGuardianRulesResponse queryMsGuardianRulesResponse, UnmarshallerContext _ctx) {
		
		queryMsGuardianRulesResponse.setRequestId(_ctx.stringValue("QueryMsGuardianRulesResponse.RequestId"));
		queryMsGuardianRulesResponse.setResultCode(_ctx.stringValue("QueryMsGuardianRulesResponse.ResultCode"));
		queryMsGuardianRulesResponse.setResultMessage(_ctx.stringValue("QueryMsGuardianRulesResponse.ResultMessage"));
		queryMsGuardianRulesResponse.setCurrentPage(_ctx.longValue("QueryMsGuardianRulesResponse.CurrentPage"));
		queryMsGuardianRulesResponse.setPageSize(_ctx.longValue("QueryMsGuardianRulesResponse.PageSize"));
		queryMsGuardianRulesResponse.setStartIndex(_ctx.longValue("QueryMsGuardianRulesResponse.StartIndex"));
		queryMsGuardianRulesResponse.setTotalSize(_ctx.longValue("QueryMsGuardianRulesResponse.TotalSize"));

		List<GuardianRulesItem> guardianRules = new ArrayList<GuardianRulesItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMsGuardianRulesResponse.GuardianRules.Length"); i++) {
			GuardianRulesItem guardianRulesItem = new GuardianRulesItem();
			guardianRulesItem.setAppName(_ctx.stringValue("QueryMsGuardianRulesResponse.GuardianRules["+ i +"].AppName"));
			guardianRulesItem.setEnable(_ctx.booleanValue("QueryMsGuardianRulesResponse.GuardianRules["+ i +"].Enable"));
			guardianRulesItem.setGmtCreate(_ctx.stringValue("QueryMsGuardianRulesResponse.GuardianRules["+ i +"].GmtCreate"));
			guardianRulesItem.setGmtModified(_ctx.stringValue("QueryMsGuardianRulesResponse.GuardianRules["+ i +"].GmtModified"));
			guardianRulesItem.setId(_ctx.longValue("QueryMsGuardianRulesResponse.GuardianRules["+ i +"].Id"));
			guardianRulesItem.setInstanceId(_ctx.stringValue("QueryMsGuardianRulesResponse.GuardianRules["+ i +"].InstanceId"));
			guardianRulesItem.setName(_ctx.stringValue("QueryMsGuardianRulesResponse.GuardianRules["+ i +"].Name"));
			guardianRulesItem.setOperator(_ctx.stringValue("QueryMsGuardianRulesResponse.GuardianRules["+ i +"].Operator"));
			guardianRulesItem.setResourceType(_ctx.stringValue("QueryMsGuardianRulesResponse.GuardianRules["+ i +"].ResourceType"));
			guardianRulesItem.setRuleConfig(_ctx.stringValue("QueryMsGuardianRulesResponse.GuardianRules["+ i +"].RuleConfig"));
			guardianRulesItem.setRunMode(_ctx.stringValue("QueryMsGuardianRulesResponse.GuardianRules["+ i +"].RunMode"));

			guardianRules.add(guardianRulesItem);
		}
		queryMsGuardianRulesResponse.setGuardianRules(guardianRules);
	 
	 	return queryMsGuardianRulesResponse;
	}
}