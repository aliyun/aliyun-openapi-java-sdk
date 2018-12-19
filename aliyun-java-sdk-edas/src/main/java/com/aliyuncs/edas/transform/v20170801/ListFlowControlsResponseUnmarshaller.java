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

import com.aliyuncs.edas.model.v20170801.ListFlowControlsResponse;
import com.aliyuncs.edas.model.v20170801.ListFlowControlsResponse.FlowControlsMap;
import com.aliyuncs.edas.model.v20170801.ListFlowControlsResponse.FlowControlsMap.App;
import com.aliyuncs.edas.model.v20170801.ListFlowControlsResponse.FlowControlsMap.InterfaceMethod;
import com.aliyuncs.edas.model.v20170801.ListFlowControlsResponse.FlowControlsMap.RuleList;
import com.aliyuncs.edas.model.v20170801.ListFlowControlsResponse.FlowControlsMap.RuleList.Rule;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFlowControlsResponseUnmarshaller {

	public static ListFlowControlsResponse unmarshall(ListFlowControlsResponse listFlowControlsResponse, UnmarshallerContext context) {
		
		listFlowControlsResponse.setRequestId(context.stringValue("ListFlowControlsResponse.RequestId"));
		listFlowControlsResponse.setCode(context.integerValue("ListFlowControlsResponse.Code"));
		listFlowControlsResponse.setMessage(context.stringValue("ListFlowControlsResponse.Message"));

		FlowControlsMap flowControlsMap = new FlowControlsMap();
		flowControlsMap.setAppId(context.stringValue("ListFlowControlsResponse.FlowControlsMap.AppId"));
		flowControlsMap.setAppName(context.stringValue("ListFlowControlsResponse.FlowControlsMap.AppName"));

		RuleList ruleList = new RuleList();
		ruleList.setCurrentPage(context.integerValue("ListFlowControlsResponse.FlowControlsMap.RuleList.CurrentPage"));
		ruleList.setPageSize(context.integerValue("ListFlowControlsResponse.FlowControlsMap.RuleList.pageSize"));
		ruleList.setTotalSize(context.integerValue("ListFlowControlsResponse.FlowControlsMap.RuleList.TotalSize"));

		List<Rule> ruleResultList = new ArrayList<Rule>();
		for (int i = 0; i < context.lengthValue("ListFlowControlsResponse.FlowControlsMap.RuleList.RuleResultList.Length"); i++) {
			Rule rule = new Rule();
			rule.setAppId(context.stringValue("ListFlowControlsResponse.FlowControlsMap.RuleList.RuleResultList["+ i +"].AppId"));
			rule.setConsumerAppId(context.stringValue("ListFlowControlsResponse.FlowControlsMap.RuleList.RuleResultList["+ i +"].ConsumerAppId"));
			rule.setCreateTime(context.longValue("ListFlowControlsResponse.FlowControlsMap.RuleList.RuleResultList["+ i +"].CreateTime"));
			rule.setGranularity(context.stringValue("ListFlowControlsResponse.FlowControlsMap.RuleList.RuleResultList["+ i +"].Granularity"));
			rule.setId(context.stringValue("ListFlowControlsResponse.FlowControlsMap.RuleList.RuleResultList["+ i +"].Id"));
			rule.setResource(context.stringValue("ListFlowControlsResponse.FlowControlsMap.RuleList.RuleResultList["+ i +"].Resource"));
			rule.setRuleId(context.stringValue("ListFlowControlsResponse.FlowControlsMap.RuleList.RuleResultList["+ i +"].RuleId"));
			rule.setRuleType(context.stringValue("ListFlowControlsResponse.FlowControlsMap.RuleList.RuleResultList["+ i +"].RuleType"));
			rule.setState(context.integerValue("ListFlowControlsResponse.FlowControlsMap.RuleList.RuleResultList["+ i +"].State"));
			rule.setStrategy(context.stringValue("ListFlowControlsResponse.FlowControlsMap.RuleList.RuleResultList["+ i +"].Strategy"));
			rule.setThreshold(context.integerValue("ListFlowControlsResponse.FlowControlsMap.RuleList.RuleResultList["+ i +"].Threshold"));
			rule.setUpdateTime(context.longValue("ListFlowControlsResponse.FlowControlsMap.RuleList.RuleResultList["+ i +"].UpdateTime"));

			ruleResultList.add(rule);
		}
		ruleList.setRuleResultList(ruleResultList);
		flowControlsMap.setRuleList(ruleList);

		List<InterfaceMethod> interfaceMethods = new ArrayList<InterfaceMethod>();
		for (int i = 0; i < context.lengthValue("ListFlowControlsResponse.FlowControlsMap.InterfaceMethods.Length"); i++) {
			InterfaceMethod interfaceMethod = new InterfaceMethod();
			interfaceMethod.setName(context.stringValue("ListFlowControlsResponse.FlowControlsMap.InterfaceMethods["+ i +"].name"));
			interfaceMethod.setVersion(context.stringValue("ListFlowControlsResponse.FlowControlsMap.InterfaceMethods["+ i +"].Version"));

			List<String> methods = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ListFlowControlsResponse.FlowControlsMap.InterfaceMethods["+ i +"].Methods.Length"); j++) {
				methods.add(context.stringValue("ListFlowControlsResponse.FlowControlsMap.InterfaceMethods["+ i +"].Methods["+ j +"]"));
			}
			interfaceMethod.setMethods(methods);

			interfaceMethods.add(interfaceMethod);
		}
		flowControlsMap.setInterfaceMethods(interfaceMethods);

		List<App> appList = new ArrayList<App>();
		for (int i = 0; i < context.lengthValue("ListFlowControlsResponse.FlowControlsMap.AppList.Length"); i++) {
			App app = new App();
			app.setAppId(context.stringValue("ListFlowControlsResponse.FlowControlsMap.AppList["+ i +"].AppId"));
			app.setName(context.stringValue("ListFlowControlsResponse.FlowControlsMap.AppList["+ i +"].Name"));
			app.setRegionId(context.stringValue("ListFlowControlsResponse.FlowControlsMap.AppList["+ i +"].RegionId"));
			app.setDescription(context.stringValue("ListFlowControlsResponse.FlowControlsMap.AppList["+ i +"].Description"));
			app.setOwner(context.stringValue("ListFlowControlsResponse.FlowControlsMap.AppList["+ i +"].Owner"));
			app.setInstanceCount(context.integerValue("ListFlowControlsResponse.FlowControlsMap.AppList["+ i +"].InstanceCount"));
			app.setRunningInstanceCount(context.integerValue("ListFlowControlsResponse.FlowControlsMap.AppList["+ i +"].RunningInstanceCount"));
			app.setPort(context.integerValue("ListFlowControlsResponse.FlowControlsMap.AppList["+ i +"].Port"));
			app.setUserId(context.stringValue("ListFlowControlsResponse.FlowControlsMap.AppList["+ i +"].UserId"));
			app.setSlbId(context.stringValue("ListFlowControlsResponse.FlowControlsMap.AppList["+ i +"].SlbId"));
			app.setSlbIp(context.stringValue("ListFlowControlsResponse.FlowControlsMap.AppList["+ i +"].SlbIp"));
			app.setSlbPort(context.integerValue("ListFlowControlsResponse.FlowControlsMap.AppList["+ i +"].SlbPort"));
			app.setExtSlbId(context.stringValue("ListFlowControlsResponse.FlowControlsMap.AppList["+ i +"].ExtSlbId"));
			app.setExtSlbIp(context.stringValue("ListFlowControlsResponse.FlowControlsMap.AppList["+ i +"].ExtSlbIp"));
			app.setApplicationType(context.stringValue("ListFlowControlsResponse.FlowControlsMap.AppList["+ i +"].ApplicationType"));
			app.setClusterType(context.integerValue("ListFlowControlsResponse.FlowControlsMap.AppList["+ i +"].ClusterType"));
			app.setClusterId(context.stringValue("ListFlowControlsResponse.FlowControlsMap.AppList["+ i +"].ClusterId"));
			app.setDockerize(context.booleanValue("ListFlowControlsResponse.FlowControlsMap.AppList["+ i +"].Dockerize"));
			app.setCpu(context.integerValue("ListFlowControlsResponse.FlowControlsMap.AppList["+ i +"].Cpu"));
			app.setMemory(context.integerValue("ListFlowControlsResponse.FlowControlsMap.AppList["+ i +"].Memory"));
			app.setHealthCheckUrl(context.stringValue("ListFlowControlsResponse.FlowControlsMap.AppList["+ i +"].HealthCheckUrl"));
			app.setBuildPackageId(context.longValue("ListFlowControlsResponse.FlowControlsMap.AppList["+ i +"].BuildPackageId"));
			app.setCreateTime(context.longValue("ListFlowControlsResponse.FlowControlsMap.AppList["+ i +"].CreateTime"));

			appList.add(app);
		}
		flowControlsMap.setAppList(appList);
		listFlowControlsResponse.setFlowControlsMap(flowControlsMap);
	 
	 	return listFlowControlsResponse;
	}
}