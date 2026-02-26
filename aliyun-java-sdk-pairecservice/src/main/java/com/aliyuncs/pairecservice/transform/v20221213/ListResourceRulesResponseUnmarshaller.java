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

import com.aliyuncs.pairecservice.model.v20221213.ListResourceRulesResponse;
import com.aliyuncs.pairecservice.model.v20221213.ListResourceRulesResponse.ResourceRulesItem;
import com.aliyuncs.pairecservice.model.v20221213.ListResourceRulesResponse.ResourceRulesItem.RuleItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListResourceRulesResponseUnmarshaller {

	public static ListResourceRulesResponse unmarshall(ListResourceRulesResponse listResourceRulesResponse, UnmarshallerContext _ctx) {
		
		listResourceRulesResponse.setRequestId(_ctx.stringValue("ListResourceRulesResponse.RequestId"));
		listResourceRulesResponse.setTotalCount(_ctx.longValue("ListResourceRulesResponse.TotalCount"));

		List<ResourceRulesItem> resourceRules = new ArrayList<ResourceRulesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListResourceRulesResponse.ResourceRules.Length"); i++) {
			ResourceRulesItem resourceRulesItem = new ResourceRulesItem();
			resourceRulesItem.setResourceRuleId(_ctx.stringValue("ListResourceRulesResponse.ResourceRules["+ i +"].ResourceRuleId"));
			resourceRulesItem.setName(_ctx.stringValue("ListResourceRulesResponse.ResourceRules["+ i +"].Name"));
			resourceRulesItem.setDescription(_ctx.stringValue("ListResourceRulesResponse.ResourceRules["+ i +"].Description"));
			resourceRulesItem.setMetricOperationType(_ctx.stringValue("ListResourceRulesResponse.ResourceRules["+ i +"].MetricOperationType"));
			resourceRulesItem.setMetricPullInfo(_ctx.stringValue("ListResourceRulesResponse.ResourceRules["+ i +"].MetricPullInfo"));
			resourceRulesItem.setMetricPullPeriod(_ctx.stringValue("ListResourceRulesResponse.ResourceRules["+ i +"].MetricPullPeriod"));
			resourceRulesItem.setRuleComputingDefinition(_ctx.stringValue("ListResourceRulesResponse.ResourceRules["+ i +"].RuleComputingDefinition"));

			List<RuleItemsItem> ruleItems = new ArrayList<RuleItemsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListResourceRulesResponse.ResourceRules["+ i +"].RuleItems.Length"); j++) {
				RuleItemsItem ruleItemsItem = new RuleItemsItem();
				ruleItemsItem.setName(_ctx.stringValue("ListResourceRulesResponse.ResourceRules["+ i +"].RuleItems["+ j +"].Name"));
				ruleItemsItem.setDescription(_ctx.stringValue("ListResourceRulesResponse.ResourceRules["+ i +"].RuleItems["+ j +"].Description"));
				ruleItemsItem.setMinValue(_ctx.stringValue("ListResourceRulesResponse.ResourceRules["+ i +"].RuleItems["+ j +"].MinValue"));
				ruleItemsItem.setValue(_ctx.stringValue("ListResourceRulesResponse.ResourceRules["+ i +"].RuleItems["+ j +"].Value"));
				ruleItemsItem.setMaxValue(_ctx.stringValue("ListResourceRulesResponse.ResourceRules["+ i +"].RuleItems["+ j +"].MaxValue"));

				ruleItems.add(ruleItemsItem);
			}
			resourceRulesItem.setRuleItems(ruleItems);

			resourceRules.add(resourceRulesItem);
		}
		listResourceRulesResponse.setResourceRules(resourceRules);
	 
	 	return listResourceRulesResponse;
	}
}