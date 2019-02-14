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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.ListRuleActionsResponse;
import com.aliyuncs.iot.model.v20180120.ListRuleActionsResponse.RuleActionInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRuleActionsResponseUnmarshaller {

	public static ListRuleActionsResponse unmarshall(ListRuleActionsResponse listRuleActionsResponse, UnmarshallerContext context) {
		
		listRuleActionsResponse.setRequestId(context.stringValue("ListRuleActionsResponse.RequestId"));
		listRuleActionsResponse.setSuccess(context.booleanValue("ListRuleActionsResponse.Success"));
		listRuleActionsResponse.setCode(context.stringValue("ListRuleActionsResponse.Code"));
		listRuleActionsResponse.setErrorMessage(context.stringValue("ListRuleActionsResponse.ErrorMessage"));

		List<RuleActionInfo> ruleActionList = new ArrayList<RuleActionInfo>();
		for (int i = 0; i < context.lengthValue("ListRuleActionsResponse.RuleActionList.Length"); i++) {
			RuleActionInfo ruleActionInfo = new RuleActionInfo();
			ruleActionInfo.setId(context.longValue("ListRuleActionsResponse.RuleActionList["+ i +"].Id"));
			ruleActionInfo.setRuleId(context.longValue("ListRuleActionsResponse.RuleActionList["+ i +"].RuleId"));
			ruleActionInfo.setType(context.stringValue("ListRuleActionsResponse.RuleActionList["+ i +"].Type"));
			ruleActionInfo.setConfiguration(context.stringValue("ListRuleActionsResponse.RuleActionList["+ i +"].Configuration"));
			ruleActionInfo.setErrorActionFlag(context.booleanValue("ListRuleActionsResponse.RuleActionList["+ i +"].ErrorActionFlag"));

			ruleActionList.add(ruleActionInfo);
		}
		listRuleActionsResponse.setRuleActionList(ruleActionList);
	 
	 	return listRuleActionsResponse;
	}
}