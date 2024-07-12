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

import com.aliyuncs.pairecservice.model.v20221213.PushResourceRuleResponse;
import com.aliyuncs.pairecservice.model.v20221213.PushResourceRuleResponse.RuleItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class PushResourceRuleResponseUnmarshaller {

	public static PushResourceRuleResponse unmarshall(PushResourceRuleResponse pushResourceRuleResponse, UnmarshallerContext _ctx) {
		
		pushResourceRuleResponse.setRequestId(_ctx.stringValue("PushResourceRuleResponse.RequestId"));
		pushResourceRuleResponse.setResourceRuleId(_ctx.stringValue("PushResourceRuleResponse.ResourceRuleId"));
		pushResourceRuleResponse.setName(_ctx.stringValue("PushResourceRuleResponse.Name"));
		pushResourceRuleResponse.setDescription(_ctx.stringValue("PushResourceRuleResponse.Description"));
		pushResourceRuleResponse.setMetricOperationType(_ctx.stringValue("PushResourceRuleResponse.MetricOperationType"));
		pushResourceRuleResponse.setMetricPullInfo(_ctx.stringValue("PushResourceRuleResponse.MetricPullInfo"));
		pushResourceRuleResponse.setMetricPullPeriod(_ctx.stringValue("PushResourceRuleResponse.MetricPullPeriod"));
		pushResourceRuleResponse.setRuleComputingDefinition(_ctx.stringValue("PushResourceRuleResponse.RuleComputingDefinition"));

		List<RuleItemsItem> ruleItems = new ArrayList<RuleItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("PushResourceRuleResponse.RuleItems.Length"); i++) {
			RuleItemsItem ruleItemsItem = new RuleItemsItem();
			ruleItemsItem.setName(_ctx.stringValue("PushResourceRuleResponse.RuleItems["+ i +"].Name"));
			ruleItemsItem.setDescription(_ctx.stringValue("PushResourceRuleResponse.RuleItems["+ i +"].Description"));
			ruleItemsItem.setMinValue(_ctx.stringValue("PushResourceRuleResponse.RuleItems["+ i +"].MinValue"));
			ruleItemsItem.setValue(_ctx.stringValue("PushResourceRuleResponse.RuleItems["+ i +"].Value"));
			ruleItemsItem.setMaxValue(_ctx.stringValue("PushResourceRuleResponse.RuleItems["+ i +"].MaxValue"));

			ruleItems.add(ruleItemsItem);
		}
		pushResourceRuleResponse.setRuleItems(ruleItems);
	 
	 	return pushResourceRuleResponse;
	}
}