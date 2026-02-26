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

package com.aliyuncs.ga.transform.v20191120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ga.model.v20191120.ListForwardingRulesResponse;
import com.aliyuncs.ga.model.v20191120.ListForwardingRulesResponse.ForwardingRulesItem;
import com.aliyuncs.ga.model.v20191120.ListForwardingRulesResponse.ForwardingRulesItem.RuleActionsItem;
import com.aliyuncs.ga.model.v20191120.ListForwardingRulesResponse.ForwardingRulesItem.RuleActionsItem.ForwardGroupConfig;
import com.aliyuncs.ga.model.v20191120.ListForwardingRulesResponse.ForwardingRulesItem.RuleActionsItem.ForwardGroupConfig.ServerGroupTuplesItem;
import com.aliyuncs.ga.model.v20191120.ListForwardingRulesResponse.ForwardingRulesItem.RuleConditionsItem;
import com.aliyuncs.ga.model.v20191120.ListForwardingRulesResponse.ForwardingRulesItem.RuleConditionsItem.HostConfig;
import com.aliyuncs.ga.model.v20191120.ListForwardingRulesResponse.ForwardingRulesItem.RuleConditionsItem.PathConfig;
import com.aliyuncs.ga.model.v20191120.ListForwardingRulesResponse.ForwardingRulesItem.ServiceManagedInfosItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListForwardingRulesResponseUnmarshaller {

	public static ListForwardingRulesResponse unmarshall(ListForwardingRulesResponse listForwardingRulesResponse, UnmarshallerContext _ctx) {
		
		listForwardingRulesResponse.setRequestId(_ctx.stringValue("ListForwardingRulesResponse.RequestId"));
		listForwardingRulesResponse.setTotalCount(_ctx.integerValue("ListForwardingRulesResponse.TotalCount"));
		listForwardingRulesResponse.setNextToken(_ctx.stringValue("ListForwardingRulesResponse.NextToken"));
		listForwardingRulesResponse.setMaxResults(_ctx.integerValue("ListForwardingRulesResponse.MaxResults"));

		List<ForwardingRulesItem> forwardingRules = new ArrayList<ForwardingRulesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListForwardingRulesResponse.ForwardingRules.Length"); i++) {
			ForwardingRulesItem forwardingRulesItem = new ForwardingRulesItem();
			forwardingRulesItem.setPriority(_ctx.integerValue("ListForwardingRulesResponse.ForwardingRules["+ i +"].Priority"));
			forwardingRulesItem.setForwardingRuleId(_ctx.stringValue("ListForwardingRulesResponse.ForwardingRules["+ i +"].ForwardingRuleId"));
			forwardingRulesItem.setForwardingRuleName(_ctx.stringValue("ListForwardingRulesResponse.ForwardingRules["+ i +"].ForwardingRuleName"));
			forwardingRulesItem.setForwardingRuleDirection(_ctx.stringValue("ListForwardingRulesResponse.ForwardingRules["+ i +"].ForwardingRuleDirection"));
			forwardingRulesItem.setForwardingRuleStatus(_ctx.stringValue("ListForwardingRulesResponse.ForwardingRules["+ i +"].ForwardingRuleStatus"));
			forwardingRulesItem.setListenerId(_ctx.stringValue("ListForwardingRulesResponse.ForwardingRules["+ i +"].ListenerId"));
			forwardingRulesItem.setServiceId(_ctx.stringValue("ListForwardingRulesResponse.ForwardingRules["+ i +"].ServiceId"));
			forwardingRulesItem.setServiceManaged(_ctx.booleanValue("ListForwardingRulesResponse.ForwardingRules["+ i +"].ServiceManaged"));

			List<RuleConditionsItem> ruleConditions = new ArrayList<RuleConditionsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListForwardingRulesResponse.ForwardingRules["+ i +"].RuleConditions.Length"); j++) {
				RuleConditionsItem ruleConditionsItem = new RuleConditionsItem();
				ruleConditionsItem.setRuleConditionType(_ctx.stringValue("ListForwardingRulesResponse.ForwardingRules["+ i +"].RuleConditions["+ j +"].RuleConditionType"));
				ruleConditionsItem.setRuleConditionValue(_ctx.stringValue("ListForwardingRulesResponse.ForwardingRules["+ i +"].RuleConditions["+ j +"].RuleConditionValue"));

				PathConfig pathConfig = new PathConfig();

				List<String> values = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListForwardingRulesResponse.ForwardingRules["+ i +"].RuleConditions["+ j +"].PathConfig.Values.Length"); k++) {
					values.add(_ctx.stringValue("ListForwardingRulesResponse.ForwardingRules["+ i +"].RuleConditions["+ j +"].PathConfig.Values["+ k +"]"));
				}
				pathConfig.setValues(values);
				ruleConditionsItem.setPathConfig(pathConfig);

				HostConfig hostConfig = new HostConfig();

				List<String> values1 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListForwardingRulesResponse.ForwardingRules["+ i +"].RuleConditions["+ j +"].HostConfig.Values.Length"); k++) {
					values1.add(_ctx.stringValue("ListForwardingRulesResponse.ForwardingRules["+ i +"].RuleConditions["+ j +"].HostConfig.Values["+ k +"]"));
				}
				hostConfig.setValues1(values1);
				ruleConditionsItem.setHostConfig(hostConfig);

				ruleConditions.add(ruleConditionsItem);
			}
			forwardingRulesItem.setRuleConditions(ruleConditions);

			List<RuleActionsItem> ruleActions = new ArrayList<RuleActionsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListForwardingRulesResponse.ForwardingRules["+ i +"].RuleActions.Length"); j++) {
				RuleActionsItem ruleActionsItem = new RuleActionsItem();
				ruleActionsItem.setOrder(_ctx.integerValue("ListForwardingRulesResponse.ForwardingRules["+ i +"].RuleActions["+ j +"].Order"));
				ruleActionsItem.setRuleActionType(_ctx.stringValue("ListForwardingRulesResponse.ForwardingRules["+ i +"].RuleActions["+ j +"].RuleActionType"));
				ruleActionsItem.setRuleActionValue(_ctx.stringValue("ListForwardingRulesResponse.ForwardingRules["+ i +"].RuleActions["+ j +"].RuleActionValue"));

				ForwardGroupConfig forwardGroupConfig = new ForwardGroupConfig();

				List<ServerGroupTuplesItem> serverGroupTuples = new ArrayList<ServerGroupTuplesItem>();
				for (int k = 0; k < _ctx.lengthValue("ListForwardingRulesResponse.ForwardingRules["+ i +"].RuleActions["+ j +"].ForwardGroupConfig.ServerGroupTuples.Length"); k++) {
					ServerGroupTuplesItem serverGroupTuplesItem = new ServerGroupTuplesItem();
					serverGroupTuplesItem.setEndpointGroupId(_ctx.stringValue("ListForwardingRulesResponse.ForwardingRules["+ i +"].RuleActions["+ j +"].ForwardGroupConfig.ServerGroupTuples["+ k +"].EndpointGroupId"));

					serverGroupTuples.add(serverGroupTuplesItem);
				}
				forwardGroupConfig.setServerGroupTuples(serverGroupTuples);
				ruleActionsItem.setForwardGroupConfig(forwardGroupConfig);

				ruleActions.add(ruleActionsItem);
			}
			forwardingRulesItem.setRuleActions(ruleActions);

			List<ServiceManagedInfosItem> serviceManagedInfos = new ArrayList<ServiceManagedInfosItem>();
			for (int j = 0; j < _ctx.lengthValue("ListForwardingRulesResponse.ForwardingRules["+ i +"].ServiceManagedInfos.Length"); j++) {
				ServiceManagedInfosItem serviceManagedInfosItem = new ServiceManagedInfosItem();
				serviceManagedInfosItem.setAction(_ctx.stringValue("ListForwardingRulesResponse.ForwardingRules["+ i +"].ServiceManagedInfos["+ j +"].Action"));
				serviceManagedInfosItem.setChildType(_ctx.stringValue("ListForwardingRulesResponse.ForwardingRules["+ i +"].ServiceManagedInfos["+ j +"].ChildType"));
				serviceManagedInfosItem.setIsManaged(_ctx.booleanValue("ListForwardingRulesResponse.ForwardingRules["+ i +"].ServiceManagedInfos["+ j +"].IsManaged"));

				serviceManagedInfos.add(serviceManagedInfosItem);
			}
			forwardingRulesItem.setServiceManagedInfos(serviceManagedInfos);

			forwardingRules.add(forwardingRulesItem);
		}
		listForwardingRulesResponse.setForwardingRules(forwardingRules);
	 
	 	return listForwardingRulesResponse;
	}
}