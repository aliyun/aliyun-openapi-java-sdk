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

package com.aliyuncs.pairecservice.transform.v20221213;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pairecservice.model.v20221213.GetResourceRuleResponse;
import com.aliyuncs.pairecservice.model.v20221213.GetResourceRuleResponse.RuleItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetResourceRuleResponseUnmarshaller {

	public static GetResourceRuleResponse unmarshall(GetResourceRuleResponse getResourceRuleResponse, UnmarshallerContext _ctx) {
		
		getResourceRuleResponse.setRequestId(_ctx.stringValue("GetResourceRuleResponse.RequestId"));
		getResourceRuleResponse.setResourceRuleId(_ctx.stringValue("GetResourceRuleResponse.ResourceRuleId"));
		getResourceRuleResponse.setName(_ctx.stringValue("GetResourceRuleResponse.Name"));
		getResourceRuleResponse.setDescription(_ctx.stringValue("GetResourceRuleResponse.Description"));
		getResourceRuleResponse.setMetricOperationType(_ctx.stringValue("GetResourceRuleResponse.MetricOperationType"));
		getResourceRuleResponse.setMetricPullInfo(_ctx.stringValue("GetResourceRuleResponse.MetricPullInfo"));
		getResourceRuleResponse.setMetricPullPeriod(_ctx.stringValue("GetResourceRuleResponse.MetricPullPeriod"));
		getResourceRuleResponse.setRuleComputingDefinition(_ctx.stringValue("GetResourceRuleResponse.RuleComputingDefinition"));

		List<RuleItemsItem> ruleItems = new ArrayList<RuleItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetResourceRuleResponse.RuleItems.Length"); i++) {
			RuleItemsItem ruleItemsItem = new RuleItemsItem();
			ruleItemsItem.setName(_ctx.stringValue("GetResourceRuleResponse.RuleItems["+ i +"].Name"));
			ruleItemsItem.setDescription(_ctx.stringValue("GetResourceRuleResponse.RuleItems["+ i +"].Description"));
			ruleItemsItem.setMinValue(_ctx.stringValue("GetResourceRuleResponse.RuleItems["+ i +"].MinValue"));
			ruleItemsItem.setValue(_ctx.stringValue("GetResourceRuleResponse.RuleItems["+ i +"].Value"));
			ruleItemsItem.setMaxValue(_ctx.stringValue("GetResourceRuleResponse.RuleItems["+ i +"].MaxValue"));

			ruleItems.add(ruleItemsItem);
		}
		getResourceRuleResponse.setRuleItems(ruleItems);
	 
	 	return getResourceRuleResponse;
	}
}