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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListHealthRuleResponse;
import com.aliyuncs.emr.model.v20160408.ListHealthRuleResponse.RuleItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListHealthRuleResponseUnmarshaller {

	public static ListHealthRuleResponse unmarshall(ListHealthRuleResponse listHealthRuleResponse, UnmarshallerContext context) {
		
		listHealthRuleResponse.setRequestId(context.stringValue("ListHealthRuleResponse.RequestId"));
		listHealthRuleResponse.setPageNumber(context.integerValue("ListHealthRuleResponse.PageNumber"));
		listHealthRuleResponse.setPageSize(context.integerValue("ListHealthRuleResponse.PageSize"));
		listHealthRuleResponse.setTotal(context.integerValue("ListHealthRuleResponse.Total"));

		List<RuleItem> rule = new ArrayList<RuleItem>();
		for (int i = 0; i < context.lengthValue("ListHealthRuleResponse.Rule.Length"); i++) {
			RuleItem ruleItem = new RuleItem();
			ruleItem.setId(context.longValue("ListHealthRuleResponse.Rule["+ i +"].Id"));
			ruleItem.setName(context.stringValue("ListHealthRuleResponse.Rule["+ i +"].Name"));
			ruleItem.setStatus(context.stringValue("ListHealthRuleResponse.Rule["+ i +"].Status"));
			ruleItem.setService(context.stringValue("ListHealthRuleResponse.Rule["+ i +"].Service"));
			ruleItem.setComponent(context.stringValue("ListHealthRuleResponse.Rule["+ i +"].Component"));
			ruleItem.setTitle(context.stringValue("ListHealthRuleResponse.Rule["+ i +"].Title"));
			ruleItem.setDescription(context.stringValue("ListHealthRuleResponse.Rule["+ i +"].Description"));
			ruleItem.setExplanation(context.stringValue("ListHealthRuleResponse.Rule["+ i +"].Explanation"));
			ruleItem.setSolution(context.stringValue("ListHealthRuleResponse.Rule["+ i +"].Solution"));

			rule.add(ruleItem);
		}
		listHealthRuleResponse.setRule(rule);
	 
	 	return listHealthRuleResponse;
	}
}