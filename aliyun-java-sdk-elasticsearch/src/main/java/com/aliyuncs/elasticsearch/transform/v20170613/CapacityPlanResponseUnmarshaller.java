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

import com.aliyuncs.elasticsearch.model.v20170613.CapacityPlanResponse;
import com.aliyuncs.elasticsearch.model.v20170613.CapacityPlanResponse.Result;
import com.aliyuncs.elasticsearch.model.v20170613.CapacityPlanResponse.Result.ExtendConfigsItem;
import com.aliyuncs.elasticsearch.model.v20170613.CapacityPlanResponse.Result.NodeConfigurationsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CapacityPlanResponseUnmarshaller {

	public static CapacityPlanResponse unmarshall(CapacityPlanResponse capacityPlanResponse, UnmarshallerContext _ctx) {
		
		capacityPlanResponse.setRequestId(_ctx.stringValue("CapacityPlanResponse.RequestId"));

		Result result = new Result();
		result.setInstanceCategory(_ctx.stringValue("CapacityPlanResponse.Result.InstanceCategory"));
		result.setOversizedCluster(_ctx.booleanValue("CapacityPlanResponse.Result.OversizedCluster"));

		List<ExtendConfigsItem> extendConfigs = new ArrayList<ExtendConfigsItem>();
		for (int i = 0; i < _ctx.lengthValue("CapacityPlanResponse.Result.ExtendConfigs.Length"); i++) {
			ExtendConfigsItem extendConfigsItem = new ExtendConfigsItem();
			extendConfigsItem.setConfigType(_ctx.stringValue("CapacityPlanResponse.Result.ExtendConfigs["+ i +"].ConfigType"));
			extendConfigsItem.setDisk(_ctx.longValue("CapacityPlanResponse.Result.ExtendConfigs["+ i +"].Disk"));
			extendConfigsItem.setDiskType(_ctx.stringValue("CapacityPlanResponse.Result.ExtendConfigs["+ i +"].DiskType"));

			extendConfigs.add(extendConfigsItem);
		}
		result.setExtendConfigs(extendConfigs);

		List<NodeConfigurationsItem> nodeConfigurations = new ArrayList<NodeConfigurationsItem>();
		for (int i = 0; i < _ctx.lengthValue("CapacityPlanResponse.Result.NodeConfigurations.Length"); i++) {
			NodeConfigurationsItem nodeConfigurationsItem = new NodeConfigurationsItem();
			nodeConfigurationsItem.setAmount(_ctx.longValue("CapacityPlanResponse.Result.NodeConfigurations["+ i +"].Amount"));
			nodeConfigurationsItem.setCpu(_ctx.longValue("CapacityPlanResponse.Result.NodeConfigurations["+ i +"].Cpu"));
			nodeConfigurationsItem.setDisk(_ctx.longValue("CapacityPlanResponse.Result.NodeConfigurations["+ i +"].Disk"));
			nodeConfigurationsItem.setDiskType(_ctx.stringValue("CapacityPlanResponse.Result.NodeConfigurations["+ i +"].DiskType"));
			nodeConfigurationsItem.setMemory(_ctx.longValue("CapacityPlanResponse.Result.NodeConfigurations["+ i +"].Memory"));
			nodeConfigurationsItem.setNodeType(_ctx.stringValue("CapacityPlanResponse.Result.NodeConfigurations["+ i +"].NodeType"));

			nodeConfigurations.add(nodeConfigurationsItem);
		}
		result.setNodeConfigurations(nodeConfigurations);
		capacityPlanResponse.setResult(result);
	 
	 	return capacityPlanResponse;
	}
}