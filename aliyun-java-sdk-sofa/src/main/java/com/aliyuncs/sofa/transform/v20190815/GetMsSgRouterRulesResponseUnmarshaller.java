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

import com.aliyuncs.sofa.model.v20190815.GetMsSgRouterRulesResponse;
import com.aliyuncs.sofa.model.v20190815.GetMsSgRouterRulesResponse.RouterRuleGroupModel;
import com.aliyuncs.sofa.model.v20190815.GetMsSgRouterRulesResponse.RouterRuleGroupModel.RulesItem;
import com.aliyuncs.sofa.model.v20190815.GetMsSgRouterRulesResponse.RouterRuleGroupModel.RulesItem.ConditionsItem;
import com.aliyuncs.sofa.model.v20190815.GetMsSgRouterRulesResponse.RouterRuleGroupModel.RulesItem.DestinationsItem;
import com.aliyuncs.sofa.model.v20190815.GetMsSgRouterRulesResponse.RouterRuleGroupModel.RulesItem.DestinationsItem.DestinationItem;
import com.aliyuncs.sofa.model.v20190815.GetMsSgRouterRulesResponse.RouterRuleGroupModel.RulesItem.GraysItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMsSgRouterRulesResponseUnmarshaller {

	public static GetMsSgRouterRulesResponse unmarshall(GetMsSgRouterRulesResponse getMsSgRouterRulesResponse, UnmarshallerContext _ctx) {
		
		getMsSgRouterRulesResponse.setRequestId(_ctx.stringValue("GetMsSgRouterRulesResponse.RequestId"));
		getMsSgRouterRulesResponse.setResultCode(_ctx.stringValue("GetMsSgRouterRulesResponse.ResultCode"));
		getMsSgRouterRulesResponse.setResultMessage(_ctx.stringValue("GetMsSgRouterRulesResponse.ResultMessage"));

		RouterRuleGroupModel routerRuleGroupModel = new RouterRuleGroupModel();
		routerRuleGroupModel.setAppName(_ctx.stringValue("GetMsSgRouterRulesResponse.RouterRuleGroupModel.AppName"));
		routerRuleGroupModel.setDataId(_ctx.stringValue("GetMsSgRouterRulesResponse.RouterRuleGroupModel.DataId"));
		routerRuleGroupModel.setDispatchVersion(_ctx.longValue("GetMsSgRouterRulesResponse.RouterRuleGroupModel.DispatchVersion"));
		routerRuleGroupModel.setEnabled(_ctx.longValue("GetMsSgRouterRulesResponse.RouterRuleGroupModel.Enabled"));
		routerRuleGroupModel.setGmtModified(_ctx.stringValue("GetMsSgRouterRulesResponse.RouterRuleGroupModel.GmtModified"));
		routerRuleGroupModel.setId(_ctx.longValue("GetMsSgRouterRulesResponse.RouterRuleGroupModel.Id"));
		routerRuleGroupModel.setInstanceId(_ctx.stringValue("GetMsSgRouterRulesResponse.RouterRuleGroupModel.InstanceId"));
		routerRuleGroupModel.setOperator(_ctx.stringValue("GetMsSgRouterRulesResponse.RouterRuleGroupModel.Operator"));
		routerRuleGroupModel.setType(_ctx.stringValue("GetMsSgRouterRulesResponse.RouterRuleGroupModel.Type"));

		List<RulesItem> rules = new ArrayList<RulesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMsSgRouterRulesResponse.RouterRuleGroupModel.Rules.Length"); i++) {
			RulesItem rulesItem = new RulesItem();
			rulesItem.setEnabled(_ctx.longValue("GetMsSgRouterRulesResponse.RouterRuleGroupModel.Rules["+ i +"].Enabled"));
			rulesItem.setFallback(_ctx.longValue("GetMsSgRouterRulesResponse.RouterRuleGroupModel.Rules["+ i +"].Fallback"));
			rulesItem.setFaultProtection(_ctx.longValue("GetMsSgRouterRulesResponse.RouterRuleGroupModel.Rules["+ i +"].FaultProtection"));
			rulesItem.setGmtModified(_ctx.longValue("GetMsSgRouterRulesResponse.RouterRuleGroupModel.Rules["+ i +"].GmtModified"));
			rulesItem.setName(_ctx.stringValue("GetMsSgRouterRulesResponse.RouterRuleGroupModel.Rules["+ i +"].Name"));
			rulesItem.setOrderNum(_ctx.longValue("GetMsSgRouterRulesResponse.RouterRuleGroupModel.Rules["+ i +"].OrderNum"));

			List<ConditionsItem> conditions = new ArrayList<ConditionsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetMsSgRouterRulesResponse.RouterRuleGroupModel.Rules["+ i +"].Conditions.Length"); j++) {
				ConditionsItem conditionsItem = new ConditionsItem();
				conditionsItem.setField(_ctx.stringValue("GetMsSgRouterRulesResponse.RouterRuleGroupModel.Rules["+ i +"].Conditions["+ j +"].Field"));
				conditionsItem.setOperation(_ctx.stringValue("GetMsSgRouterRulesResponse.RouterRuleGroupModel.Rules["+ i +"].Conditions["+ j +"].Operation"));
				conditionsItem.setType(_ctx.stringValue("GetMsSgRouterRulesResponse.RouterRuleGroupModel.Rules["+ i +"].Conditions["+ j +"].Type"));

				List<String> value = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("GetMsSgRouterRulesResponse.RouterRuleGroupModel.Rules["+ i +"].Conditions["+ j +"].Value.Length"); k++) {
					value.add(_ctx.stringValue("GetMsSgRouterRulesResponse.RouterRuleGroupModel.Rules["+ i +"].Conditions["+ j +"].Value["+ k +"]"));
				}
				conditionsItem.setValue(value);

				conditions.add(conditionsItem);
			}
			rulesItem.setConditions(conditions);

			List<DestinationsItem> destinations = new ArrayList<DestinationsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetMsSgRouterRulesResponse.RouterRuleGroupModel.Rules["+ i +"].Destinations.Length"); j++) {
				DestinationsItem destinationsItem = new DestinationsItem();
				destinationsItem.setWeight(_ctx.longValue("GetMsSgRouterRulesResponse.RouterRuleGroupModel.Rules["+ i +"].Destinations["+ j +"].Weight"));

				List<DestinationItem> destination = new ArrayList<DestinationItem>();
				for (int k = 0; k < _ctx.lengthValue("GetMsSgRouterRulesResponse.RouterRuleGroupModel.Rules["+ i +"].Destinations["+ j +"].Destination.Length"); k++) {
					DestinationItem destinationItem = new DestinationItem();
					destinationItem.setField(_ctx.stringValue("GetMsSgRouterRulesResponse.RouterRuleGroupModel.Rules["+ i +"].Destinations["+ j +"].Destination["+ k +"].Field"));
					destinationItem.setOperation(_ctx.stringValue("GetMsSgRouterRulesResponse.RouterRuleGroupModel.Rules["+ i +"].Destinations["+ j +"].Destination["+ k +"].Operation"));
					destinationItem.setType(_ctx.stringValue("GetMsSgRouterRulesResponse.RouterRuleGroupModel.Rules["+ i +"].Destinations["+ j +"].Destination["+ k +"].Type"));

					List<String> value1 = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("GetMsSgRouterRulesResponse.RouterRuleGroupModel.Rules["+ i +"].Destinations["+ j +"].Destination["+ k +"].Value.Length"); l++) {
						value1.add(_ctx.stringValue("GetMsSgRouterRulesResponse.RouterRuleGroupModel.Rules["+ i +"].Destinations["+ j +"].Destination["+ k +"].Value["+ l +"]"));
					}
					destinationItem.setValue1(value1);

					destination.add(destinationItem);
				}
				destinationsItem.setDestination(destination);

				destinations.add(destinationsItem);
			}
			rulesItem.setDestinations(destinations);

			List<GraysItem> grays = new ArrayList<GraysItem>();
			for (int j = 0; j < _ctx.lengthValue("GetMsSgRouterRulesResponse.RouterRuleGroupModel.Rules["+ i +"].Grays.Length"); j++) {
				GraysItem graysItem = new GraysItem();
				graysItem.setField(_ctx.stringValue("GetMsSgRouterRulesResponse.RouterRuleGroupModel.Rules["+ i +"].Grays["+ j +"].Field"));
				graysItem.setOperation(_ctx.stringValue("GetMsSgRouterRulesResponse.RouterRuleGroupModel.Rules["+ i +"].Grays["+ j +"].Operation"));
				graysItem.setType(_ctx.stringValue("GetMsSgRouterRulesResponse.RouterRuleGroupModel.Rules["+ i +"].Grays["+ j +"].Type"));

				List<String> value2 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("GetMsSgRouterRulesResponse.RouterRuleGroupModel.Rules["+ i +"].Grays["+ j +"].Value.Length"); k++) {
					value2.add(_ctx.stringValue("GetMsSgRouterRulesResponse.RouterRuleGroupModel.Rules["+ i +"].Grays["+ j +"].Value["+ k +"]"));
				}
				graysItem.setValue2(value2);

				grays.add(graysItem);
			}
			rulesItem.setGrays(grays);

			rules.add(rulesItem);
		}
		routerRuleGroupModel.setRules(rules);
		getMsSgRouterRulesResponse.setRouterRuleGroupModel(routerRuleGroupModel);
	 
	 	return getMsSgRouterRulesResponse;
	}
}