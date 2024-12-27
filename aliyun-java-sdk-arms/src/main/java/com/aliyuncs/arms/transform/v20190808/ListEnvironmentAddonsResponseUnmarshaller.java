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

import com.aliyuncs.arms.model.v20190808.ListEnvironmentAddonsResponse;
import com.aliyuncs.arms.model.v20190808.ListEnvironmentAddonsResponse.Data;
import com.aliyuncs.arms.model.v20190808.ListEnvironmentAddonsResponse.Data.AddonsItem;
import com.aliyuncs.arms.model.v20190808.ListEnvironmentAddonsResponse.Data.AddonsItem.DashboardsItem;
import com.aliyuncs.arms.model.v20190808.ListEnvironmentAddonsResponse.Data.AddonsItem.EnvironmentsItem;
import com.aliyuncs.arms.model.v20190808.ListEnvironmentAddonsResponse.Data.AddonsItem.EnvironmentsItem.Dependencies;
import com.aliyuncs.arms.model.v20190808.ListEnvironmentAddonsResponse.Data.AddonsItem.EnvironmentsItem.Policies;
import com.aliyuncs.arms.model.v20190808.ListEnvironmentAddonsResponse.Data.AddonsItem.EnvironmentsItem.Policies.MetricCheckRule;
import com.aliyuncs.arms.model.v20190808.ListEnvironmentAddonsResponse.Data.AddonsItem.EnvironmentsItem.Policies.ProtocolsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEnvironmentAddonsResponseUnmarshaller {

	public static ListEnvironmentAddonsResponse unmarshall(ListEnvironmentAddonsResponse listEnvironmentAddonsResponse, UnmarshallerContext _ctx) {
		
		listEnvironmentAddonsResponse.setRequestId(_ctx.stringValue("ListEnvironmentAddonsResponse.RequestId"));
		listEnvironmentAddonsResponse.setCode(_ctx.integerValue("ListEnvironmentAddonsResponse.Code"));
		listEnvironmentAddonsResponse.setMessage(_ctx.stringValue("ListEnvironmentAddonsResponse.Message"));
		listEnvironmentAddonsResponse.setSuccess(_ctx.booleanValue("ListEnvironmentAddonsResponse.Success"));

		Data data = new Data();
		data.setTotal(_ctx.longValue("ListEnvironmentAddonsResponse.Data.Total"));

		List<AddonsItem> addons = new ArrayList<AddonsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListEnvironmentAddonsResponse.Data.Addons.Length"); i++) {
			AddonsItem addonsItem = new AddonsItem();
			addonsItem.setAlias(_ctx.stringValue("ListEnvironmentAddonsResponse.Data.Addons["+ i +"].Alias"));
			addonsItem.setDescription(_ctx.stringValue("ListEnvironmentAddonsResponse.Data.Addons["+ i +"].Description"));
			addonsItem.setIcon(_ctx.stringValue("ListEnvironmentAddonsResponse.Data.Addons["+ i +"].Icon"));
			addonsItem.setLanguage(_ctx.stringValue("ListEnvironmentAddonsResponse.Data.Addons["+ i +"].Language"));
			addonsItem.setName(_ctx.stringValue("ListEnvironmentAddonsResponse.Data.Addons["+ i +"].Name"));
			addonsItem.setOnce(_ctx.booleanValue("ListEnvironmentAddonsResponse.Data.Addons["+ i +"].Once"));
			addonsItem.setScene(_ctx.stringValue("ListEnvironmentAddonsResponse.Data.Addons["+ i +"].Scene"));
			addonsItem.setVersion(_ctx.stringValue("ListEnvironmentAddonsResponse.Data.Addons["+ i +"].Version"));
			addonsItem.setWeight(_ctx.stringValue("ListEnvironmentAddonsResponse.Data.Addons["+ i +"].Weight"));
			addonsItem.setLatestReleaseCreateTime(_ctx.stringValue("ListEnvironmentAddonsResponse.Data.Addons["+ i +"].LatestReleaseCreateTime"));

			List<String> categories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListEnvironmentAddonsResponse.Data.Addons["+ i +"].Categories.Length"); j++) {
				categories.add(_ctx.stringValue("ListEnvironmentAddonsResponse.Data.Addons["+ i +"].Categories["+ j +"]"));
			}
			addonsItem.setCategories(categories);

			List<String> keywords = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListEnvironmentAddonsResponse.Data.Addons["+ i +"].Keywords.Length"); j++) {
				keywords.add(_ctx.stringValue("ListEnvironmentAddonsResponse.Data.Addons["+ i +"].Keywords["+ j +"]"));
			}
			addonsItem.setKeywords(keywords);

			List<DashboardsItem> dashboards = new ArrayList<DashboardsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListEnvironmentAddonsResponse.Data.Addons["+ i +"].Dashboards.Length"); j++) {
				DashboardsItem dashboardsItem = new DashboardsItem();
				dashboardsItem.setDescription(_ctx.stringValue("ListEnvironmentAddonsResponse.Data.Addons["+ i +"].Dashboards["+ j +"].Description"));
				dashboardsItem.setName(_ctx.stringValue("ListEnvironmentAddonsResponse.Data.Addons["+ i +"].Dashboards["+ j +"].Name"));
				dashboardsItem.setUrl(_ctx.stringValue("ListEnvironmentAddonsResponse.Data.Addons["+ i +"].Dashboards["+ j +"].Url"));

				dashboards.add(dashboardsItem);
			}
			addonsItem.setDashboards(dashboards);

			List<EnvironmentsItem> environments = new ArrayList<EnvironmentsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListEnvironmentAddonsResponse.Data.Addons["+ i +"].Environments.Length"); j++) {
				EnvironmentsItem environmentsItem = new EnvironmentsItem();
				environmentsItem.setDescription(_ctx.stringValue("ListEnvironmentAddonsResponse.Data.Addons["+ i +"].Environments["+ j +"].Description"));
				environmentsItem.setEnable(_ctx.booleanValue("ListEnvironmentAddonsResponse.Data.Addons["+ i +"].Environments["+ j +"].Enable"));
				environmentsItem.setLabel(_ctx.stringValue("ListEnvironmentAddonsResponse.Data.Addons["+ i +"].Environments["+ j +"].Label"));
				environmentsItem.setName(_ctx.stringValue("ListEnvironmentAddonsResponse.Data.Addons["+ i +"].Environments["+ j +"].Name"));

				Dependencies dependencies = new Dependencies();
				dependencies.setFeatures(_ctx.mapValue("ListEnvironmentAddonsResponse.Data.Addons["+ i +"].Environments["+ j +"].Dependencies.Features"));

				List<String> services = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListEnvironmentAddonsResponse.Data.Addons["+ i +"].Environments["+ j +"].Dependencies.Services.Length"); k++) {
					services.add(_ctx.stringValue("ListEnvironmentAddonsResponse.Data.Addons["+ i +"].Environments["+ j +"].Dependencies.Services["+ k +"]"));
				}
				dependencies.setServices(services);

				List<String> clusterTypes = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListEnvironmentAddonsResponse.Data.Addons["+ i +"].Environments["+ j +"].Dependencies.ClusterTypes.Length"); k++) {
					clusterTypes.add(_ctx.stringValue("ListEnvironmentAddonsResponse.Data.Addons["+ i +"].Environments["+ j +"].Dependencies.ClusterTypes["+ k +"]"));
				}
				dependencies.setClusterTypes(clusterTypes);
				environmentsItem.setDependencies(dependencies);

				Policies policies = new Policies();
				policies.setAlertDefaultStatus(_ctx.stringValue("ListEnvironmentAddonsResponse.Data.Addons["+ i +"].Environments["+ j +"].Policies.AlertDefaultStatus"));
				policies.setDefaultInstall(_ctx.booleanValue("ListEnvironmentAddonsResponse.Data.Addons["+ i +"].Environments["+ j +"].Policies.DefaultInstall"));
				policies.setTargetAddonName(_ctx.stringValue("ListEnvironmentAddonsResponse.Data.Addons["+ i +"].Environments["+ j +"].Policies.TargetAddonName"));
				policies.setNeedRestartAfterIntegration(_ctx.booleanValue("ListEnvironmentAddonsResponse.Data.Addons["+ i +"].Environments["+ j +"].Policies.NeedRestartAfterIntegration"));
				policies.setEnableServiceAccount(_ctx.booleanValue("ListEnvironmentAddonsResponse.Data.Addons["+ i +"].Environments["+ j +"].Policies.EnableServiceAccount"));

				MetricCheckRule metricCheckRule = new MetricCheckRule();

				List<String> promQL = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListEnvironmentAddonsResponse.Data.Addons["+ i +"].Environments["+ j +"].Policies.MetricCheckRule.PromQL.Length"); k++) {
					promQL.add(_ctx.stringValue("ListEnvironmentAddonsResponse.Data.Addons["+ i +"].Environments["+ j +"].Policies.MetricCheckRule.PromQL["+ k +"]"));
				}
				metricCheckRule.setPromQL(promQL);
				policies.setMetricCheckRule(metricCheckRule);

				List<ProtocolsItem> protocols = new ArrayList<ProtocolsItem>();
				for (int k = 0; k < _ctx.lengthValue("ListEnvironmentAddonsResponse.Data.Addons["+ i +"].Environments["+ j +"].Policies.Protocols.Length"); k++) {
					ProtocolsItem protocolsItem = new ProtocolsItem();
					protocolsItem.setName(_ctx.stringValue("ListEnvironmentAddonsResponse.Data.Addons["+ i +"].Environments["+ j +"].Policies.Protocols["+ k +"].Name"));
					protocolsItem.setIcon(_ctx.stringValue("ListEnvironmentAddonsResponse.Data.Addons["+ i +"].Environments["+ j +"].Policies.Protocols["+ k +"].Icon"));
					protocolsItem.setLabel(_ctx.stringValue("ListEnvironmentAddonsResponse.Data.Addons["+ i +"].Environments["+ j +"].Policies.Protocols["+ k +"].Label"));
					protocolsItem.setDescription(_ctx.stringValue("ListEnvironmentAddonsResponse.Data.Addons["+ i +"].Environments["+ j +"].Policies.Protocols["+ k +"].Description"));

					protocols.add(protocolsItem);
				}
				policies.setProtocols(protocols);
				environmentsItem.setPolicies(policies);

				environments.add(environmentsItem);
			}
			addonsItem.setEnvironments(environments);

			addons.add(addonsItem);
		}
		data.setAddons(addons);
		listEnvironmentAddonsResponse.setData(data);
	 
	 	return listEnvironmentAddonsResponse;
	}
}