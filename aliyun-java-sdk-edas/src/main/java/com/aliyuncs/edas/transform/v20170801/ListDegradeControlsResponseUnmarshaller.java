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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.ListDegradeControlsResponse;
import com.aliyuncs.edas.model.v20170801.ListDegradeControlsResponse.FlowControlsMap;
import com.aliyuncs.edas.model.v20170801.ListDegradeControlsResponse.FlowControlsMap.InterfaceMethod;
import com.aliyuncs.edas.model.v20170801.ListDegradeControlsResponse.FlowControlsMap.RuleList;
import com.aliyuncs.edas.model.v20170801.ListDegradeControlsResponse.FlowControlsMap.RuleList.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDegradeControlsResponseUnmarshaller {

	public static ListDegradeControlsResponse unmarshall(ListDegradeControlsResponse listDegradeControlsResponse, UnmarshallerContext context) {
		
		listDegradeControlsResponse.setRequestId(context.stringValue("ListDegradeControlsResponse.RequestId"));
		listDegradeControlsResponse.setCode(context.integerValue("ListDegradeControlsResponse.Code"));
		listDegradeControlsResponse.setMessage(context.stringValue("ListDegradeControlsResponse.Message"));

		FlowControlsMap flowControlsMap = new FlowControlsMap();
		flowControlsMap.setAppId(context.stringValue("ListDegradeControlsResponse.FlowControlsMap.AppId"));
		flowControlsMap.setAppName(context.stringValue("ListDegradeControlsResponse.FlowControlsMap.AppName"));

		RuleList ruleList = new RuleList();
		ruleList.setCurrentPage(context.integerValue("ListDegradeControlsResponse.FlowControlsMap.RuleList.CurrentPage"));
		ruleList.setPageSize(context.integerValue("ListDegradeControlsResponse.FlowControlsMap.RuleList.pageSize"));
		ruleList.setTotalSize(context.integerValue("ListDegradeControlsResponse.FlowControlsMap.RuleList.TotalSize"));

		List<Rule> ruleResultList = new ArrayList<Rule>();
		for (int i = 0; i < context.lengthValue("ListDegradeControlsResponse.FlowControlsMap.RuleList.RuleResultList.Length"); i++) {
			Rule rule = new Rule();
			rule.setAppId(context.stringValue("ListDegradeControlsResponse.FlowControlsMap.RuleList.RuleResultList["+ i +"].AppId"));
			rule.setRuleId(context.stringValue("ListDegradeControlsResponse.FlowControlsMap.RuleList.RuleResultList["+ i +"].RuleId"));
			rule.setCreateTime(context.longValue("ListDegradeControlsResponse.FlowControlsMap.RuleList.RuleResultList["+ i +"].CreateTime"));
			rule.setUpdateTime(context.longValue("ListDegradeControlsResponse.FlowControlsMap.RuleList.RuleResultList["+ i +"].UpdateTime"));
			rule.setResource(context.stringValue("ListDegradeControlsResponse.FlowControlsMap.RuleList.RuleResultList["+ i +"].Resource"));
			rule.setRtThreshold(context.integerValue("ListDegradeControlsResponse.FlowControlsMap.RuleList.RuleResultList["+ i +"].RtThreshold"));
			rule.setDuration(context.integerValue("ListDegradeControlsResponse.FlowControlsMap.RuleList.RuleResultList["+ i +"].Duration"));
			rule.setState(context.integerValue("ListDegradeControlsResponse.FlowControlsMap.RuleList.RuleResultList["+ i +"].State"));
			rule.setRuleType(context.stringValue("ListDegradeControlsResponse.FlowControlsMap.RuleList.RuleResultList["+ i +"].RuleType"));

			ruleResultList.add(rule);
		}
		ruleList.setRuleResultList(ruleResultList);
		flowControlsMap.setRuleList(ruleList);

		List<InterfaceMethod> interfaceMethods = new ArrayList<InterfaceMethod>();
		for (int i = 0; i < context.lengthValue("ListDegradeControlsResponse.FlowControlsMap.InterfaceMethods.Length"); i++) {
			InterfaceMethod interfaceMethod = new InterfaceMethod();
			interfaceMethod.setName(context.stringValue("ListDegradeControlsResponse.FlowControlsMap.InterfaceMethods["+ i +"].name"));
			interfaceMethod.setVersion(context.stringValue("ListDegradeControlsResponse.FlowControlsMap.InterfaceMethods["+ i +"].Version"));

			List<String> methods = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ListDegradeControlsResponse.FlowControlsMap.InterfaceMethods["+ i +"].Methods.Length"); j++) {
				methods.add(context.stringValue("ListDegradeControlsResponse.FlowControlsMap.InterfaceMethods["+ i +"].Methods["+ j +"]"));
			}
			interfaceMethod.setMethods(methods);

			interfaceMethods.add(interfaceMethod);
		}
		flowControlsMap.setInterfaceMethods(interfaceMethods);
		listDegradeControlsResponse.setFlowControlsMap(flowControlsMap);
	 
	 	return listDegradeControlsResponse;
	}
}