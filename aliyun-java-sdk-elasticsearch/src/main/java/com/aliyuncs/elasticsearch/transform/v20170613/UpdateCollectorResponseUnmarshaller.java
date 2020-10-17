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

import com.aliyuncs.elasticsearch.model.v20170613.UpdateCollectorResponse;
import com.aliyuncs.elasticsearch.model.v20170613.UpdateCollectorResponse.Result;
import com.aliyuncs.elasticsearch.model.v20170613.UpdateCollectorResponse.Result.ConfigsItem;
import com.aliyuncs.elasticsearch.model.v20170613.UpdateCollectorResponse.Result.ExtendConfigsItem;
import com.aliyuncs.elasticsearch.model.v20170613.UpdateCollectorResponse.Result.ExtendConfigsItem.MachinesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateCollectorResponseUnmarshaller {

	public static UpdateCollectorResponse unmarshall(UpdateCollectorResponse updateCollectorResponse, UnmarshallerContext _ctx) {
		
		updateCollectorResponse.setRequestId(_ctx.stringValue("UpdateCollectorResponse.RequestId"));

		Result result = new Result();
		result.setGmtCreatedTime(_ctx.stringValue("UpdateCollectorResponse.Result.gmtCreatedTime"));
		result.setGmtUpdateTime(_ctx.stringValue("UpdateCollectorResponse.Result.gmtUpdateTime"));
		result.setName(_ctx.stringValue("UpdateCollectorResponse.Result.name"));
		result.setResId(_ctx.stringValue("UpdateCollectorResponse.Result.resId"));
		result.setResVersion(_ctx.stringValue("UpdateCollectorResponse.Result.resVersion"));
		result.setVpcId(_ctx.stringValue("UpdateCollectorResponse.Result.vpcId"));
		result.setResType(_ctx.stringValue("UpdateCollectorResponse.Result.resType"));
		result.setOwnerId(_ctx.stringValue("UpdateCollectorResponse.Result.ownerId"));
		result.setStatus(_ctx.stringValue("UpdateCollectorResponse.Result.status"));
		result.setDryRun(_ctx.booleanValue("UpdateCollectorResponse.Result.dryRun"));

		List<String> collectorPaths = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateCollectorResponse.Result.collectorPaths.Length"); i++) {
			collectorPaths.add(_ctx.stringValue("UpdateCollectorResponse.Result.collectorPaths["+ i +"]"));
		}
		result.setCollectorPaths(collectorPaths);

		List<ConfigsItem> configs = new ArrayList<ConfigsItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateCollectorResponse.Result.configs.Length"); i++) {
			ConfigsItem configsItem = new ConfigsItem();
			configsItem.setFileName(_ctx.stringValue("UpdateCollectorResponse.Result.configs["+ i +"].fileName"));
			configsItem.setContent(_ctx.stringValue("UpdateCollectorResponse.Result.configs["+ i +"].content"));

			configs.add(configsItem);
		}
		result.setConfigs(configs);

		List<ExtendConfigsItem> extendConfigs = new ArrayList<ExtendConfigsItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateCollectorResponse.Result.extendConfigs.Length"); i++) {
			ExtendConfigsItem extendConfigsItem = new ExtendConfigsItem();
			extendConfigsItem.setConfigType(_ctx.stringValue("UpdateCollectorResponse.Result.extendConfigs["+ i +"].configType"));
			extendConfigsItem.setInstanceId(_ctx.stringValue("UpdateCollectorResponse.Result.extendConfigs["+ i +"].instanceId"));
			extendConfigsItem.setInstanceType(_ctx.stringValue("UpdateCollectorResponse.Result.extendConfigs["+ i +"].instanceType"));
			extendConfigsItem.setBizProtocol(_ctx.stringValue("UpdateCollectorResponse.Result.extendConfigs["+ i +"].protocol"));
			extendConfigsItem.setUserName(_ctx.stringValue("UpdateCollectorResponse.Result.extendConfigs["+ i +"].userName"));
			extendConfigsItem.setEnableMonitoring(_ctx.booleanValue("UpdateCollectorResponse.Result.extendConfigs["+ i +"].enableMonitoring"));
			extendConfigsItem.setType(_ctx.stringValue("UpdateCollectorResponse.Result.extendConfigs["+ i +"].type"));
			extendConfigsItem.setGroupId(_ctx.stringValue("UpdateCollectorResponse.Result.extendConfigs["+ i +"].groupId"));

			List<String> hosts = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("UpdateCollectorResponse.Result.extendConfigs["+ i +"].hosts.Length"); j++) {
				hosts.add(_ctx.stringValue("UpdateCollectorResponse.Result.extendConfigs["+ i +"].hosts["+ j +"]"));
			}
			extendConfigsItem.setHosts(hosts);

			List<MachinesItem> machines = new ArrayList<MachinesItem>();
			for (int j = 0; j < _ctx.lengthValue("UpdateCollectorResponse.Result.extendConfigs["+ i +"].machines.Length"); j++) {
				MachinesItem machinesItem = new MachinesItem();
				machinesItem.setInstanceId(_ctx.stringValue("UpdateCollectorResponse.Result.extendConfigs["+ i +"].machines["+ j +"].instanceId"));
				machinesItem.setAgentStatus(_ctx.stringValue("UpdateCollectorResponse.Result.extendConfigs["+ i +"].machines["+ j +"].agentStatus"));

				machines.add(machinesItem);
			}
			extendConfigsItem.setMachines(machines);

			extendConfigs.add(extendConfigsItem);
		}
		result.setExtendConfigs(extendConfigs);
		updateCollectorResponse.setResult(result);
	 
	 	return updateCollectorResponse;
	}
}