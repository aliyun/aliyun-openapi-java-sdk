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

import com.aliyuncs.arms.model.v20190808.ListAddonsResponse;
import com.aliyuncs.arms.model.v20190808.ListAddonsResponse.DataItem;
import com.aliyuncs.arms.model.v20190808.ListAddonsResponse.DataItem.DashboardsItem;
import com.aliyuncs.arms.model.v20190808.ListAddonsResponse.DataItem.EnvironmentsItem;
import com.aliyuncs.arms.model.v20190808.ListAddonsResponse.DataItem.EnvironmentsItem.Dependencies;
import com.aliyuncs.arms.model.v20190808.ListAddonsResponse.DataItem.EnvironmentsItem.Policies;
import com.aliyuncs.arms.model.v20190808.ListAddonsResponse.DataItem.EnvironmentsItem.Policies.MetricCheckRule;
import com.aliyuncs.arms.model.v20190808.ListAddonsResponse.DataItem.EnvironmentsItem.Policies.ProtocolsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAddonsResponseUnmarshaller {

	public static ListAddonsResponse unmarshall(ListAddonsResponse listAddonsResponse, UnmarshallerContext _ctx) {
		
		listAddonsResponse.setRequestId(_ctx.stringValue("ListAddonsResponse.RequestId"));
		listAddonsResponse.setCode(_ctx.integerValue("ListAddonsResponse.Code"));
		listAddonsResponse.setMessage(_ctx.stringValue("ListAddonsResponse.Message"));
		listAddonsResponse.setSuccess(_ctx.booleanValue("ListAddonsResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAddonsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAlias(_ctx.stringValue("ListAddonsResponse.Data["+ i +"].Alias"));
			dataItem.setDescription(_ctx.stringValue("ListAddonsResponse.Data["+ i +"].Description"));
			dataItem.setIcon(_ctx.stringValue("ListAddonsResponse.Data["+ i +"].Icon"));
			dataItem.setLanguage(_ctx.stringValue("ListAddonsResponse.Data["+ i +"].Language"));
			dataItem.setName(_ctx.stringValue("ListAddonsResponse.Data["+ i +"].Name"));
			dataItem.setOnce(_ctx.booleanValue("ListAddonsResponse.Data["+ i +"].Once"));
			dataItem.setScene(_ctx.stringValue("ListAddonsResponse.Data["+ i +"].Scene"));
			dataItem.setVersion(_ctx.stringValue("ListAddonsResponse.Data["+ i +"].Version"));
			dataItem.setWeight(_ctx.stringValue("ListAddonsResponse.Data["+ i +"].Weight"));
			dataItem.setLatestReleaseCreateTime(_ctx.stringValue("ListAddonsResponse.Data["+ i +"].LatestReleaseCreateTime"));

			List<String> categories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListAddonsResponse.Data["+ i +"].Categories.Length"); j++) {
				categories.add(_ctx.stringValue("ListAddonsResponse.Data["+ i +"].Categories["+ j +"]"));
			}
			dataItem.setCategories(categories);

			List<String> keywords = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListAddonsResponse.Data["+ i +"].Keywords.Length"); j++) {
				keywords.add(_ctx.stringValue("ListAddonsResponse.Data["+ i +"].Keywords["+ j +"]"));
			}
			dataItem.setKeywords(keywords);

			List<DashboardsItem> dashboards = new ArrayList<DashboardsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListAddonsResponse.Data["+ i +"].Dashboards.Length"); j++) {
				DashboardsItem dashboardsItem = new DashboardsItem();
				dashboardsItem.setDescription(_ctx.stringValue("ListAddonsResponse.Data["+ i +"].Dashboards["+ j +"].Description"));
				dashboardsItem.setName(_ctx.stringValue("ListAddonsResponse.Data["+ i +"].Dashboards["+ j +"].Name"));
				dashboardsItem.setUrl(_ctx.stringValue("ListAddonsResponse.Data["+ i +"].Dashboards["+ j +"].Url"));

				dashboards.add(dashboardsItem);
			}
			dataItem.setDashboards(dashboards);

			List<EnvironmentsItem> environments = new ArrayList<EnvironmentsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListAddonsResponse.Data["+ i +"].Environments.Length"); j++) {
				EnvironmentsItem environmentsItem = new EnvironmentsItem();
				environmentsItem.setDescription(_ctx.stringValue("ListAddonsResponse.Data["+ i +"].Environments["+ j +"].Description"));
				environmentsItem.setEnable(_ctx.booleanValue("ListAddonsResponse.Data["+ i +"].Environments["+ j +"].Enable"));
				environmentsItem.setLabel(_ctx.stringValue("ListAddonsResponse.Data["+ i +"].Environments["+ j +"].Label"));
				environmentsItem.setName(_ctx.stringValue("ListAddonsResponse.Data["+ i +"].Environments["+ j +"].Name"));

				Dependencies dependencies = new Dependencies();
				dependencies.setFeatures(_ctx.mapValue("ListAddonsResponse.Data["+ i +"].Environments["+ j +"].Dependencies.Features"));

				List<String> services = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListAddonsResponse.Data["+ i +"].Environments["+ j +"].Dependencies.Services.Length"); k++) {
					services.add(_ctx.stringValue("ListAddonsResponse.Data["+ i +"].Environments["+ j +"].Dependencies.Services["+ k +"]"));
				}
				dependencies.setServices(services);

				List<String> clusterTypes = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListAddonsResponse.Data["+ i +"].Environments["+ j +"].Dependencies.ClusterTypes.Length"); k++) {
					clusterTypes.add(_ctx.stringValue("ListAddonsResponse.Data["+ i +"].Environments["+ j +"].Dependencies.ClusterTypes["+ k +"]"));
				}
				dependencies.setClusterTypes(clusterTypes);
				environmentsItem.setDependencies(dependencies);

				Policies policies = new Policies();
				policies.setAlertDefaultStatus(_ctx.stringValue("ListAddonsResponse.Data["+ i +"].Environments["+ j +"].Policies.AlertDefaultStatus"));
				policies.setDefaultInstall(_ctx.booleanValue("ListAddonsResponse.Data["+ i +"].Environments["+ j +"].Policies.DefaultInstall"));
				policies.setTargetAddonName(_ctx.stringValue("ListAddonsResponse.Data["+ i +"].Environments["+ j +"].Policies.TargetAddonName"));
				policies.setEnableServiceAccount(_ctx.booleanValue("ListAddonsResponse.Data["+ i +"].Environments["+ j +"].Policies.EnableServiceAccount"));
				policies.setNeedRestartAfterIntegration(_ctx.booleanValue("ListAddonsResponse.Data["+ i +"].Environments["+ j +"].Policies.NeedRestartAfterIntegration"));

				MetricCheckRule metricCheckRule = new MetricCheckRule();

				List<String> promQL = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListAddonsResponse.Data["+ i +"].Environments["+ j +"].Policies.MetricCheckRule.PromQL.Length"); k++) {
					promQL.add(_ctx.stringValue("ListAddonsResponse.Data["+ i +"].Environments["+ j +"].Policies.MetricCheckRule.PromQL["+ k +"]"));
				}
				metricCheckRule.setPromQL(promQL);
				policies.setMetricCheckRule(metricCheckRule);

				List<ProtocolsItem> protocols = new ArrayList<ProtocolsItem>();
				for (int k = 0; k < _ctx.lengthValue("ListAddonsResponse.Data["+ i +"].Environments["+ j +"].Policies.Protocols.Length"); k++) {
					ProtocolsItem protocolsItem = new ProtocolsItem();
					protocolsItem.setName(_ctx.stringValue("ListAddonsResponse.Data["+ i +"].Environments["+ j +"].Policies.Protocols["+ k +"].Name"));
					protocolsItem.setLabel(_ctx.stringValue("ListAddonsResponse.Data["+ i +"].Environments["+ j +"].Policies.Protocols["+ k +"].Label"));
					protocolsItem.setIcon(_ctx.stringValue("ListAddonsResponse.Data["+ i +"].Environments["+ j +"].Policies.Protocols["+ k +"].Icon"));
					protocolsItem.setDescription(_ctx.stringValue("ListAddonsResponse.Data["+ i +"].Environments["+ j +"].Policies.Protocols["+ k +"].Description"));

					protocols.add(protocolsItem);
				}
				policies.setProtocols(protocols);
				environmentsItem.setPolicies(policies);

				environments.add(environmentsItem);
			}
			dataItem.setEnvironments(environments);

			data.add(dataItem);
		}
		listAddonsResponse.setData(data);
	 
	 	return listAddonsResponse;
	}
}