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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.ListDispatchRuleResponse;
import com.aliyuncs.arms.model.v20190808.ListDispatchRuleResponse.DispatchRule;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDispatchRuleResponseUnmarshaller {

	public static ListDispatchRuleResponse unmarshall(ListDispatchRuleResponse listDispatchRuleResponse, UnmarshallerContext _ctx) {
		
		listDispatchRuleResponse.setRequestId(_ctx.stringValue("ListDispatchRuleResponse.RequestId"));

		List<DispatchRule> dispatchRules = new ArrayList<DispatchRule>();
		for (int i = 0; i < _ctx.lengthValue("ListDispatchRuleResponse.DispatchRules.Length"); i++) {
			DispatchRule dispatchRule = new DispatchRule();
			dispatchRule.setRuleId(_ctx.longValue("ListDispatchRuleResponse.DispatchRules["+ i +"].RuleId"));
			dispatchRule.setName(_ctx.stringValue("ListDispatchRuleResponse.DispatchRules["+ i +"].Name"));
			dispatchRule.setState(_ctx.stringValue("ListDispatchRuleResponse.DispatchRules["+ i +"].State"));

			dispatchRules.add(dispatchRule);
		}
		listDispatchRuleResponse.setDispatchRules(dispatchRules);
	 
	 	return listDispatchRuleResponse;
	}
}