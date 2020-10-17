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

package com.aliyuncs.elasticsearch.transform.v20170613;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.elasticsearch.model.v20170613.ListEcsInstancesResponse;
import com.aliyuncs.elasticsearch.model.v20170613.ListEcsInstancesResponse.Headers;
import com.aliyuncs.elasticsearch.model.v20170613.ListEcsInstancesResponse.ResultItem;
import com.aliyuncs.elasticsearch.model.v20170613.ListEcsInstancesResponse.ResultItem.CollectorsItem;
import com.aliyuncs.elasticsearch.model.v20170613.ListEcsInstancesResponse.ResultItem.CollectorsItem.ConfigsItem;
import com.aliyuncs.elasticsearch.model.v20170613.ListEcsInstancesResponse.ResultItem.CollectorsItem.ExtendConfigsItem;
import com.aliyuncs.elasticsearch.model.v20170613.ListEcsInstancesResponse.ResultItem.CollectorsItem.ExtendConfigsItem.MachinesItem;
import com.aliyuncs.elasticsearch.model.v20170613.ListEcsInstancesResponse.ResultItem.IpAddressItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEcsInstancesResponseUnmarshaller {

	public static ListEcsInstancesResponse unmarshall(ListEcsInstancesResponse listEcsInstancesResponse, UnmarshallerContext _ctx) {
		
		listEcsInstancesResponse.setRequestId(_ctx.stringValue("ListEcsInstancesResponse.RequestId"));

		Headers headers = new Headers();
		headers.setXTotalCount(_ctx.integerValue("ListEcsInstancesResponse.Headers.X-Total-Count"));
		listEcsInstancesResponse.setHeaders(headers);

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListEcsInstancesResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setEcsInstanceId(_ctx.stringValue("ListEcsInstancesResponse.Result["+ i +"].ecsInstanceId"));
			resultItem.setEcsInstanceName(_ctx.stringValue("ListEcsInstancesResponse.Result["+ i +"].ecsInstanceName"));
			resultItem.setStatus(_ctx.stringValue("ListEcsInstancesResponse.Result["+ i +"].status"));
			resultItem.setTags(_ctx.stringValue("ListEcsInstancesResponse.Result["+ i +"].tags"));
			resultItem.setOsType(_ctx.stringValue("ListEcsInstancesResponse.Result["+ i +"].osType"));
			resultItem.setCloudAssistantStatus(_ctx.stringValue("ListEcsInstancesResponse.Result["+ i +"].cloudAssistantStatus"));

			List<IpAddressItem> ipAddress = new ArrayList<IpAddressItem>();
			for (int j = 0; j < _ctx.lengthValue("ListEcsInstancesResponse.Result["+ i +"].ipAddress.Length"); j++) {
				IpAddressItem ipAddressItem = new IpAddressItem();
				ipAddressItem.setHost(_ctx.stringValue("ListEcsInstancesResponse.Result["+ i +"].ipAddress["+ j +"].host"));
				ipAddressItem.setIpType(_ctx.stringValue("ListEcsInstancesResponse.Result["+ i +"].ipAddress["+ j +"].ipType"));

				ipAddress.add(ipAddressItem);
			}
			resultItem.setIpAddress(ipAddress);

			List<CollectorsItem> collectors = new ArrayList<CollectorsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListEcsInstancesResponse.Result["+ i +"].collectors.Length"); j++) {
				CollectorsItem collectorsItem = new CollectorsItem();
				collectorsItem.setGmtCreatedTime(_ctx.stringValue("ListEcsInstancesResponse.Result["+ i +"].collectors["+ j +"].gmtCreatedTime"));
				collectorsItem.setGmtUpdateTime(_ctx.stringValue("ListEcsInstancesResponse.Result["+ i +"].collectors["+ j +"].gmtUpdateTime"));
				collectorsItem.setName(_ctx.stringValue("ListEcsInstancesResponse.Result["+ i +"].collectors["+ j +"].name"));
				collectorsItem.setResId(_ctx.stringValue("ListEcsInstancesResponse.Result["+ i +"].collectors["+ j +"].resId"));
				collectorsItem.setResVersion(_ctx.stringValue("ListEcsInstancesResponse.Result["+ i +"].collectors["+ j +"].resVersion"));
				collectorsItem.setVpcId(_ctx.stringValue("ListEcsInstancesResponse.Result["+ i +"].collectors["+ j +"].vpcId"));
				collectorsItem.setResType(_ctx.stringValue("ListEcsInstancesResponse.Result["+ i +"].collectors["+ j +"].resType"));
				collectorsItem.setOwnerId(_ctx.stringValue("ListEcsInstancesResponse.Result["+ i +"].collectors["+ j +"].ownerId"));
				collectorsItem.setStatus(_ctx.stringValue("ListEcsInstancesResponse.Result["+ i +"].collectors["+ j +"].status"));
				collectorsItem.setDryRun(_ctx.booleanValue("ListEcsInstancesResponse.Result["+ i +"].collectors["+ j +"].dryRun"));

				List<String> collectorPaths = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListEcsInstancesResponse.Result["+ i +"].collectors["+ j +"].collectorPaths.Length"); k++) {
					collectorPaths.add(_ctx.stringValue("ListEcsInstancesResponse.Result["+ i +"].collectors["+ j +"].collectorPaths["+ k +"]"));
				}
				collectorsItem.setCollectorPaths(collectorPaths);

				List<ConfigsItem> configs = new ArrayList<ConfigsItem>();
				for (int k = 0; k < _ctx.lengthValue("ListEcsInstancesResponse.Result["+ i +"].collectors["+ j +"].configs.Length"); k++) {
					ConfigsItem configsItem = new ConfigsItem();
					configsItem.setFileName(_ctx.stringValue("ListEcsInstancesResponse.Result["+ i +"].collectors["+ j +"].configs["+ k +"].fileName"));
					configsItem.setContent(_ctx.stringValue("ListEcsInstancesResponse.Result["+ i +"].collectors["+ j +"].configs["+ k +"].content"));

					configs.add(configsItem);
				}
				collectorsItem.setConfigs(configs);

				List<ExtendConfigsItem> extendConfigs = new ArrayList<ExtendConfigsItem>();
				for (int k = 0; k < _ctx.lengthValue("ListEcsInstancesResponse.Result["+ i +"].collectors["+ j +"].extendConfigs.Length"); k++) {
					ExtendConfigsItem extendConfigsItem = new ExtendConfigsItem();
					extendConfigsItem.setConfigType(_ctx.stringValue("ListEcsInstancesResponse.Result["+ i +"].collectors["+ j +"].extendConfigs["+ k +"].configType"));
					extendConfigsItem.setInstanceId(_ctx.stringValue("ListEcsInstancesResponse.Result["+ i +"].collectors["+ j +"].extendConfigs["+ k +"].instanceId"));
					extendConfigsItem.setInstanceType(_ctx.stringValue("ListEcsInstancesResponse.Result["+ i +"].collectors["+ j +"].extendConfigs["+ k +"].instanceType"));
					extendConfigsItem.setBizProtocol(_ctx.stringValue("ListEcsInstancesResponse.Result["+ i +"].collectors["+ j +"].extendConfigs["+ k +"].protocol"));
					extendConfigsItem.setUserName(_ctx.stringValue("ListEcsInstancesResponse.Result["+ i +"].collectors["+ j +"].extendConfigs["+ k +"].userName"));
					extendConfigsItem.setEnableMonitoring(_ctx.booleanValue("ListEcsInstancesResponse.Result["+ i +"].collectors["+ j +"].extendConfigs["+ k +"].enableMonitoring"));
					extendConfigsItem.setType(_ctx.stringValue("ListEcsInstancesResponse.Result["+ i +"].collectors["+ j +"].extendConfigs["+ k +"].type"));
					extendConfigsItem.setGroupId(_ctx.stringValue("ListEcsInstancesResponse.Result["+ i +"].collectors["+ j +"].extendConfigs["+ k +"].groupId"));

					List<String> hosts = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("ListEcsInstancesResponse.Result["+ i +"].collectors["+ j +"].extendConfigs["+ k +"].hosts.Length"); l++) {
						hosts.add(_ctx.stringValue("ListEcsInstancesResponse.Result["+ i +"].collectors["+ j +"].extendConfigs["+ k +"].hosts["+ l +"]"));
					}
					extendConfigsItem.setHosts(hosts);

					List<MachinesItem> machines = new ArrayList<MachinesItem>();
					for (int l = 0; l < _ctx.lengthValue("ListEcsInstancesResponse.Result["+ i +"].collectors["+ j +"].extendConfigs["+ k +"].machines.Length"); l++) {
						MachinesItem machinesItem = new MachinesItem();
						machinesItem.setInstanceId(_ctx.stringValue("ListEcsInstancesResponse.Result["+ i +"].collectors["+ j +"].extendConfigs["+ k +"].machines["+ l +"].instanceId"));
						machinesItem.setAgentStatus(_ctx.stringValue("ListEcsInstancesResponse.Result["+ i +"].collectors["+ j +"].extendConfigs["+ k +"].machines["+ l +"].agentStatus"));

						machines.add(machinesItem);
					}
					extendConfigsItem.setMachines(machines);

					extendConfigs.add(extendConfigsItem);
				}
				collectorsItem.setExtendConfigs(extendConfigs);

				collectors.add(collectorsItem);
			}
			resultItem.setCollectors(collectors);

			result.add(resultItem);
		}
		listEcsInstancesResponse.setResult(result);
	 
	 	return listEcsInstancesResponse;
	}
}