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

import com.aliyuncs.elasticsearch.model.v20170613.ListCollectorsResponse;
import com.aliyuncs.elasticsearch.model.v20170613.ListCollectorsResponse.Headers;
import com.aliyuncs.elasticsearch.model.v20170613.ListCollectorsResponse.ResultItem;
import com.aliyuncs.elasticsearch.model.v20170613.ListCollectorsResponse.ResultItem.ConfigsItem;
import com.aliyuncs.elasticsearch.model.v20170613.ListCollectorsResponse.ResultItem.ExtendConfigsItem;
import com.aliyuncs.elasticsearch.model.v20170613.ListCollectorsResponse.ResultItem.ExtendConfigsItem.MachinesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCollectorsResponseUnmarshaller {

	public static ListCollectorsResponse unmarshall(ListCollectorsResponse listCollectorsResponse, UnmarshallerContext _ctx) {
		
		listCollectorsResponse.setRequestId(_ctx.stringValue("ListCollectorsResponse.RequestId"));

		Headers headers = new Headers();
		headers.setXTotalCount(_ctx.integerValue("ListCollectorsResponse.Headers.X-Total-Count"));
		listCollectorsResponse.setHeaders(headers);

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCollectorsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setResId(_ctx.stringValue("ListCollectorsResponse.Result["+ i +"].resId"));
			resultItem.setGmtUpdateTime(_ctx.stringValue("ListCollectorsResponse.Result["+ i +"].gmtUpdateTime"));
			resultItem.setDryRun(_ctx.booleanValue("ListCollectorsResponse.Result["+ i +"].dryRun"));
			resultItem.setOwnerId(_ctx.stringValue("ListCollectorsResponse.Result["+ i +"].ownerId"));
			resultItem.setVpcId(_ctx.stringValue("ListCollectorsResponse.Result["+ i +"].vpcId"));
			resultItem.setResType(_ctx.stringValue("ListCollectorsResponse.Result["+ i +"].resType"));
			resultItem.setResVersion(_ctx.stringValue("ListCollectorsResponse.Result["+ i +"].resVersion"));
			resultItem.setGmtCreatedTime(_ctx.stringValue("ListCollectorsResponse.Result["+ i +"].gmtCreatedTime"));
			resultItem.setStatus(_ctx.stringValue("ListCollectorsResponse.Result["+ i +"].status"));
			resultItem.setName(_ctx.stringValue("ListCollectorsResponse.Result["+ i +"].name"));

			List<String> collectorPaths = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListCollectorsResponse.Result["+ i +"].collectorPaths.Length"); j++) {
				collectorPaths.add(_ctx.stringValue("ListCollectorsResponse.Result["+ i +"].collectorPaths["+ j +"]"));
			}
			resultItem.setCollectorPaths(collectorPaths);

			List<ConfigsItem> configs = new ArrayList<ConfigsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListCollectorsResponse.Result["+ i +"].configs.Length"); j++) {
				ConfigsItem configsItem = new ConfigsItem();
				configsItem.setContent(_ctx.stringValue("ListCollectorsResponse.Result["+ i +"].configs["+ j +"].content"));
				configsItem.setFileName(_ctx.stringValue("ListCollectorsResponse.Result["+ i +"].configs["+ j +"].fileName"));

				configs.add(configsItem);
			}
			resultItem.setConfigs(configs);

			List<ExtendConfigsItem> extendConfigs = new ArrayList<ExtendConfigsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListCollectorsResponse.Result["+ i +"].extendConfigs.Length"); j++) {
				ExtendConfigsItem extendConfigsItem = new ExtendConfigsItem();
				extendConfigsItem.setSuccessPodsCount(_ctx.stringValue("ListCollectorsResponse.Result["+ i +"].extendConfigs["+ j +"].successPodsCount"));
				extendConfigsItem.setBizProtocol(_ctx.stringValue("ListCollectorsResponse.Result["+ i +"].extendConfigs["+ j +"].protocol"));
				extendConfigsItem.setUserName(_ctx.stringValue("ListCollectorsResponse.Result["+ i +"].extendConfigs["+ j +"].userName"));
				extendConfigsItem.setTotalPodsCount(_ctx.stringValue("ListCollectorsResponse.Result["+ i +"].extendConfigs["+ j +"].totalPodsCount"));
				extendConfigsItem.setType(_ctx.stringValue("ListCollectorsResponse.Result["+ i +"].extendConfigs["+ j +"].type"));
				extendConfigsItem.setKibanaHost(_ctx.stringValue("ListCollectorsResponse.Result["+ i +"].extendConfigs["+ j +"].kibanaHost"));
				extendConfigsItem.setEnableMonitoring(_ctx.booleanValue("ListCollectorsResponse.Result["+ i +"].extendConfigs["+ j +"].enableMonitoring"));
				extendConfigsItem.setConfigType(_ctx.stringValue("ListCollectorsResponse.Result["+ i +"].extendConfigs["+ j +"].configType"));
				extendConfigsItem.setInstanceType(_ctx.stringValue("ListCollectorsResponse.Result["+ i +"].extendConfigs["+ j +"].instanceType"));
				extendConfigsItem.setGroupId(_ctx.stringValue("ListCollectorsResponse.Result["+ i +"].extendConfigs["+ j +"].groupId"));
				extendConfigsItem.setHost(_ctx.stringValue("ListCollectorsResponse.Result["+ i +"].extendConfigs["+ j +"].host"));
				extendConfigsItem.setInstanceId(_ctx.stringValue("ListCollectorsResponse.Result["+ i +"].extendConfigs["+ j +"].instanceId"));

				List<String> hosts = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListCollectorsResponse.Result["+ i +"].extendConfigs["+ j +"].hosts.Length"); k++) {
					hosts.add(_ctx.stringValue("ListCollectorsResponse.Result["+ i +"].extendConfigs["+ j +"].hosts["+ k +"]"));
				}
				extendConfigsItem.setHosts(hosts);

				List<MachinesItem> machines = new ArrayList<MachinesItem>();
				for (int k = 0; k < _ctx.lengthValue("ListCollectorsResponse.Result["+ i +"].extendConfigs["+ j +"].machines.Length"); k++) {
					MachinesItem machinesItem = new MachinesItem();
					machinesItem.setAgentStatus(_ctx.stringValue("ListCollectorsResponse.Result["+ i +"].extendConfigs["+ j +"].machines["+ k +"].agentStatus"));
					machinesItem.setInstanceId(_ctx.stringValue("ListCollectorsResponse.Result["+ i +"].extendConfigs["+ j +"].machines["+ k +"].instanceId"));

					machines.add(machinesItem);
				}
				extendConfigsItem.setMachines(machines);

				extendConfigs.add(extendConfigsItem);
			}
			resultItem.setExtendConfigs(extendConfigs);

			result.add(resultItem);
		}
		listCollectorsResponse.setResult(result);
	 
	 	return listCollectorsResponse;
	}
}