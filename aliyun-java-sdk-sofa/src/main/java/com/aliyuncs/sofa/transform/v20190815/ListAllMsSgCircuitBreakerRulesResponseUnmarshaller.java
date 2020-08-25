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

import com.aliyuncs.sofa.model.v20190815.ListAllMsSgCircuitBreakerRulesResponse;
import com.aliyuncs.sofa.model.v20190815.ListAllMsSgCircuitBreakerRulesResponse.RuleModelsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAllMsSgCircuitBreakerRulesResponseUnmarshaller {

	public static ListAllMsSgCircuitBreakerRulesResponse unmarshall(ListAllMsSgCircuitBreakerRulesResponse listAllMsSgCircuitBreakerRulesResponse, UnmarshallerContext _ctx) {
		
		listAllMsSgCircuitBreakerRulesResponse.setRequestId(_ctx.stringValue("ListAllMsSgCircuitBreakerRulesResponse.RequestId"));
		listAllMsSgCircuitBreakerRulesResponse.setResultCode(_ctx.stringValue("ListAllMsSgCircuitBreakerRulesResponse.ResultCode"));
		listAllMsSgCircuitBreakerRulesResponse.setResultMessage(_ctx.stringValue("ListAllMsSgCircuitBreakerRulesResponse.ResultMessage"));
		listAllMsSgCircuitBreakerRulesResponse.setCurrentPage(_ctx.longValue("ListAllMsSgCircuitBreakerRulesResponse.CurrentPage"));
		listAllMsSgCircuitBreakerRulesResponse.setPageSize(_ctx.longValue("ListAllMsSgCircuitBreakerRulesResponse.PageSize"));
		listAllMsSgCircuitBreakerRulesResponse.setStartIndex(_ctx.longValue("ListAllMsSgCircuitBreakerRulesResponse.StartIndex"));
		listAllMsSgCircuitBreakerRulesResponse.setTotalSize(_ctx.longValue("ListAllMsSgCircuitBreakerRulesResponse.TotalSize"));

		List<RuleModelsItem> ruleModels = new ArrayList<RuleModelsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAllMsSgCircuitBreakerRulesResponse.RuleModels.Length"); i++) {
			RuleModelsItem ruleModelsItem = new RuleModelsItem();
			ruleModelsItem.setAppName(_ctx.stringValue("ListAllMsSgCircuitBreakerRulesResponse.RuleModels["+ i +"].AppName"));
			ruleModelsItem.setRulesNum(_ctx.longValue("ListAllMsSgCircuitBreakerRulesResponse.RuleModels["+ i +"].RulesNum"));

			ruleModels.add(ruleModelsItem);
		}
		listAllMsSgCircuitBreakerRulesResponse.setRuleModels(ruleModels);
	 
	 	return listAllMsSgCircuitBreakerRulesResponse;
	}
}