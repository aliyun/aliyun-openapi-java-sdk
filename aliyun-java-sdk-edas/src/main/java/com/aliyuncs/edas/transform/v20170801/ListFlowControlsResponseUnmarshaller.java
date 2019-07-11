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
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFlowControlsResponseUnmarshaller {

	public static ListFlowControlsResponse unmarshall(ListFlowControlsResponse listFlowControlsResponse, UnmarshallerContext _ctx) {
		
		listFlowControlsResponse.setRequestId(_ctx.stringValue("ListFlowControlsResponse.RequestId"));
		listFlowControlsResponse.setCode(_ctx.integerValue("ListFlowControlsResponse.Code"));
		listFlowControlsResponse.setMessage(_ctx.stringValue("ListFlowControlsResponse.Message"));

		FlowControlsMap flowControlsMap = new FlowControlsMap();
		flowControlsMap.setAppId(_ctx.stringValue("ListFlowControlsResponse.FlowControlsMap.AppId"));
		flowControlsMap.setAppName(_ctx.stringValue("ListFlowControlsResponse.FlowControlsMap.AppName"));

		RuleList ruleList = new RuleList();
		ruleList.setCurrentPage(_ctx.integerValue("ListFlowControlsResponse.FlowControlsMap.RuleList.CurrentPage"));
		ruleList.setPageSize(_ctx.integerValue("ListFlowControlsResponse.FlowControlsMap.RuleList.pageSize"));
		ruleList.setTotalSize(_ctx.integerValue("ListFlowControlsResponse.FlowControlsMap.RuleList.TotalSize"));

		List<Rule> ruleResultList = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("ListFlowControlsResponse.FlowControlsMap.RuleList.RuleResultList.Length"); i++) {
			Rule rule = new Rule();
			rule.setAppId(_ctx.stringValue("ListFlowControlsResponse.FlowControlsMap.RuleList.RuleResultList["+ i +"].AppId"));
			rule.setConsumerAppId(_ctx.stringValue("ListFlowControlsResponse.FlowControlsMap.RuleList.RuleResultList["+ i +"].ConsumerAppId"));
			rule.setCreateTime(_ctx.longValue("ListFlowControlsResponse.FlowControlsMap.RuleList.RuleResultList["+ i +"].CreateTime"));
			rule.setGranularity(_ctx.stringValue("ListFlowControlsResponse.FlowControlsMap.RuleList.RuleResultList["+ i +"].Granularity"));
			rule.setId(_ctx.stringValue("ListFlowControlsResponse.FlowControlsMap.RuleList.RuleResultList["+ i +"].Id"));
			rule.setResource(_ctx.stringValue("ListFlowControlsResponse.FlowControlsMap.RuleList.RuleResultList["+ i +"].Resource"));
			rule.setRuleId(_ctx.stringValue("ListFlowControlsResponse.FlowControlsMap.RuleList.RuleResultList["+ i +"].RuleId"));
			rule.setRuleType(_ctx.stringValue("ListFlowControlsResponse.FlowControlsMap.RuleList.RuleResultList["+ i +"].RuleType"));
			rule.setState(_ctx.integerValue("ListFlowControlsResponse.FlowControlsMap.RuleList.RuleResultList["+ i +"].State"));
			rule.setStrategy(_ctx.stringValue("ListFlowControlsResponse.FlowControlsMap.RuleList.RuleResultList["+ i +"].Strategy"));
			rule.setThreshold(_ctx.integerValue("ListFlowControlsResponse.FlowControlsMap.RuleList.RuleResultList["+ i +"].Threshold"));
			rule.setUpdateTime(_ctx.longValue("ListFlowControlsResponse.FlowControlsMap.RuleList.RuleResultList["+ i +"].UpdateTime"));

			ruleResultList.add(rule);
		}
		ruleList.setRuleResultList(ruleResultList);
		flowControlsMap.setRuleList(ruleList);

		List<InterfaceMethod> interfaceMethods = new ArrayList<InterfaceMethod>();
		for (int i = 0; i < _ctx.lengthValue("ListFlowControlsResponse.FlowControlsMap.InterfaceMethods.Length"); i++) {
			InterfaceMethod interfaceMethod = new InterfaceMethod();
			interfaceMethod.setName(_ctx.stringValue("ListFlowControlsResponse.FlowControlsMap.InterfaceMethods["+ i +"].name"));
			interfaceMethod.setVersion(_ctx.stringValue("ListFlowControlsResponse.FlowControlsMap.InterfaceMethods["+ i +"].Version"));

			List<String> methods = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListFlowControlsResponse.FlowControlsMap.InterfaceMethods["+ i +"].Methods.Length"); j++) {
				methods.add(_ctx.stringValue("ListFlowControlsResponse.FlowControlsMap.InterfaceMethods["+ i +"].Methods["+ j +"]"));
			}
			interfaceMethod.setMethods(methods);

			interfaceMethods.add(interfaceMethod);
		}
		flowControlsMap.setInterfaceMethods(interfaceMethods);

		List<App> appList = new ArrayList<App>();
		for (int i = 0; i < _ctx.lengthValue("ListFlowControlsResponse.FlowControlsMap.AppList.Length"); i++) {
			App app = new App();
			app.setAppId(_ctx.stringValue("ListFlowControlsResponse.FlowControlsMap.AppList["+ i +"].AppId"));
			app.setName(_ctx.stringValue("ListFlowControlsResponse.FlowControlsMap.AppList["+ i +"].Name"));
			app.setRegionId(_ctx.stringValue("ListFlowControlsResponse.FlowControlsMap.AppList["+ i +"].RegionId"));
			app.setDescription(_ctx.stringValue("ListFlowControlsResponse.FlowControlsMap.AppList["+ i +"].Description"));
			app.setOwner(_ctx.stringValue("ListFlowControlsResponse.FlowControlsMap.AppList["+ i +"].Owner"));
			app.setInstanceCount(_ctx.integerValue("ListFlowControlsResponse.FlowControlsMap.AppList["+ i +"].InstanceCount"));
			app.setRunningInstanceCount(_ctx.integerValue("ListFlowControlsResponse.FlowControlsMap.AppList["+ i +"].RunningInstanceCount"));
			app.setPort(_ctx.integerValue("ListFlowControlsResponse.FlowControlsMap.AppList["+ i +"].Port"));
			app.setUserId(_ctx.stringValue("ListFlowControlsResponse.FlowControlsMap.AppList["+ i +"].UserId"));
			app.setSlbId(_ctx.stringValue("ListFlowControlsResponse.FlowControlsMap.AppList["+ i +"].SlbId"));
			app.setSlbIp(_ctx.stringValue("ListFlowControlsResponse.FlowControlsMap.AppList["+ i +"].SlbIp"));
			app.setSlbPort(_ctx.integerValue("ListFlowControlsResponse.FlowControlsMap.AppList["+ i +"].SlbPort"));
			app.setExtSlbId(_ctx.stringValue("ListFlowControlsResponse.FlowControlsMap.AppList["+ i +"].ExtSlbId"));
			app.setExtSlbIp(_ctx.stringValue("ListFlowControlsResponse.FlowControlsMap.AppList["+ i +"].ExtSlbIp"));
			app.setApplicationType(_ctx.stringValue("ListFlowControlsResponse.FlowControlsMap.AppList["+ i +"].ApplicationType"));
			app.setClusterType(_ctx.integerValue("ListFlowControlsResponse.FlowControlsMap.AppList["+ i +"].ClusterType"));
			app.setClusterId(_ctx.stringValue("ListFlowControlsResponse.FlowControlsMap.AppList["+ i +"].ClusterId"));
			app.setDockerize(_ctx.booleanValue("ListFlowControlsResponse.FlowControlsMap.AppList["+ i +"].Dockerize"));
			app.setCpu(_ctx.integerValue("ListFlowControlsResponse.FlowControlsMap.AppList["+ i +"].Cpu"));
			app.setMemory(_ctx.integerValue("ListFlowControlsResponse.FlowControlsMap.AppList["+ i +"].Memory"));
			app.setHealthCheckUrl(_ctx.stringValue("ListFlowControlsResponse.FlowControlsMap.AppList["+ i +"].HealthCheckUrl"));
			app.setBuildPackageId(_ctx.longValue("ListFlowControlsResponse.FlowControlsMap.AppList["+ i +"].BuildPackageId"));
			app.setCreateTime(_ctx.longValue("ListFlowControlsResponse.FlowControlsMap.AppList["+ i +"].CreateTime"));

			appList.add(app);
		}
		flowControlsMap.setAppList(appList);
		listFlowControlsResponse.setFlowControlsMap(flowControlsMap);
	 
	 	return listFlowControlsResponse;
	}
}