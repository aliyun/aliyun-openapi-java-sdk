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

import com.aliyuncs.sofa.model.v20190815.QueryODPInstancesResponse;
import com.aliyuncs.sofa.model.v20190815.QueryODPInstancesResponse.Data;
import com.aliyuncs.sofa.model.v20190815.QueryODPInstancesResponse.Data.NodesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryODPInstancesResponseUnmarshaller {

	public static QueryODPInstancesResponse unmarshall(QueryODPInstancesResponse queryODPInstancesResponse, UnmarshallerContext _ctx) {
		
		queryODPInstancesResponse.setRequestId(_ctx.stringValue("QueryODPInstancesResponse.RequestId"));
		queryODPInstancesResponse.setResultCode(_ctx.stringValue("QueryODPInstancesResponse.ResultCode"));
		queryODPInstancesResponse.setResultMessage(_ctx.stringValue("QueryODPInstancesResponse.ResultMessage"));

		Data data = new Data();
		data.setBizVpcId(_ctx.stringValue("QueryODPInstancesResponse.Data.BizVpcId"));
		data.setConfigSpecDesc(_ctx.stringValue("QueryODPInstancesResponse.Data.ConfigSpecDesc"));
		data.setEnvMode(_ctx.stringValue("QueryODPInstancesResponse.Data.EnvMode"));
		data.setEnvTenant(_ctx.stringValue("QueryODPInstancesResponse.Data.EnvTenant"));
		data.setGmtCreate(_ctx.stringValue("QueryODPInstancesResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.stringValue("QueryODPInstancesResponse.Data.GmtModified"));
		data.setId(_ctx.longValue("QueryODPInstancesResponse.Data.Id"));
		data.setInstanceId(_ctx.stringValue("QueryODPInstancesResponse.Data.InstanceId"));
		data.setInstanceLanAddress(_ctx.stringValue("QueryODPInstancesResponse.Data.InstanceLanAddress"));
		data.setInstanceName(_ctx.stringValue("QueryODPInstancesResponse.Data.InstanceName"));
		data.setInstancePort(_ctx.longValue("QueryODPInstancesResponse.Data.InstancePort"));
		data.setInstanceStatus(_ctx.stringValue("QueryODPInstancesResponse.Data.InstanceStatus"));
		data.setInstanceType(_ctx.stringValue("QueryODPInstancesResponse.Data.InstanceType"));
		data.setInstanceVip(_ctx.stringValue("QueryODPInstancesResponse.Data.InstanceVip"));
		data.setInstanceWanAddress(_ctx.stringValue("QueryODPInstancesResponse.Data.InstanceWanAddress"));
		data.setInstanceWanPort(_ctx.longValue("QueryODPInstancesResponse.Data.InstanceWanPort"));
		data.setInstanceZone(_ctx.stringValue("QueryODPInstancesResponse.Data.InstanceZone"));
		data.setLegacy(_ctx.booleanValue("QueryODPInstancesResponse.Data.Legacy"));
		data.setMachineCount(_ctx.longValue("QueryODPInstancesResponse.Data.MachineCount"));
		data.setPaymentType(_ctx.longValue("QueryODPInstancesResponse.Data.PaymentType"));
		data.setRegion(_ctx.stringValue("QueryODPInstancesResponse.Data.Region"));
		data.setSchemaCount(_ctx.longValue("QueryODPInstancesResponse.Data.SchemaCount"));
		data.setZoneCount(_ctx.longValue("QueryODPInstancesResponse.Data.ZoneCount"));

		List<NodesItem> nodes = new ArrayList<NodesItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryODPInstancesResponse.Data.Nodes.Length"); i++) {
			NodesItem nodesItem = new NodesItem();
			nodesItem.setAliyunInstanceId(_ctx.stringValue("QueryODPInstancesResponse.Data.Nodes["+ i +"].AliyunInstanceId"));
			nodesItem.setBizVpcId(_ctx.stringValue("QueryODPInstancesResponse.Data.Nodes["+ i +"].BizVpcId"));
			nodesItem.setBizVswtichId(_ctx.stringValue("QueryODPInstancesResponse.Data.Nodes["+ i +"].BizVswtichId"));
			nodesItem.setCellId(_ctx.stringValue("QueryODPInstancesResponse.Data.Nodes["+ i +"].CellId"));
			nodesItem.setCellName(_ctx.stringValue("QueryODPInstancesResponse.Data.Nodes["+ i +"].CellName"));
			nodesItem.setClusterId(_ctx.stringValue("QueryODPInstancesResponse.Data.Nodes["+ i +"].ClusterId"));
			nodesItem.setConfigSpecDesc(_ctx.stringValue("QueryODPInstancesResponse.Data.Nodes["+ i +"].ConfigSpecDesc"));
			nodesItem.setCpuCount(_ctx.longValue("QueryODPInstancesResponse.Data.Nodes["+ i +"].CpuCount"));
			nodesItem.setEnvId(_ctx.stringValue("QueryODPInstancesResponse.Data.Nodes["+ i +"].EnvId"));
			nodesItem.setEnvMode(_ctx.stringValue("QueryODPInstancesResponse.Data.Nodes["+ i +"].EnvMode"));
			nodesItem.setEnvName(_ctx.stringValue("QueryODPInstancesResponse.Data.Nodes["+ i +"].EnvName"));
			nodesItem.setEnvTenant(_ctx.stringValue("QueryODPInstancesResponse.Data.Nodes["+ i +"].EnvTenant"));
			nodesItem.setExecutionDetail(_ctx.stringValue("QueryODPInstancesResponse.Data.Nodes["+ i +"].ExecutionDetail"));
			nodesItem.setGmtCreate(_ctx.stringValue("QueryODPInstancesResponse.Data.Nodes["+ i +"].GmtCreate"));
			nodesItem.setGmtModified(_ctx.stringValue("QueryODPInstancesResponse.Data.Nodes["+ i +"].GmtModified"));
			nodesItem.setId(_ctx.longValue("QueryODPInstancesResponse.Data.Nodes["+ i +"].Id"));
			nodesItem.setMachineCount(_ctx.longValue("QueryODPInstancesResponse.Data.Nodes["+ i +"].MachineCount"));
			nodesItem.setMemoryCount(_ctx.longValue("QueryODPInstancesResponse.Data.Nodes["+ i +"].MemoryCount"));
			nodesItem.setNodeLanAddress(_ctx.stringValue("QueryODPInstancesResponse.Data.Nodes["+ i +"].NodeLanAddress"));
			nodesItem.setNodeStatus(_ctx.stringValue("QueryODPInstancesResponse.Data.Nodes["+ i +"].NodeStatus"));
			nodesItem.setNodeWanAddress(_ctx.stringValue("QueryODPInstancesResponse.Data.Nodes["+ i +"].NodeWanAddress"));
			nodesItem.setNodeWanPort(_ctx.longValue("QueryODPInstancesResponse.Data.Nodes["+ i +"].NodeWanPort"));
			nodesItem.setPort(_ctx.longValue("QueryODPInstancesResponse.Data.Nodes["+ i +"].Port"));
			nodesItem.setVip(_ctx.stringValue("QueryODPInstancesResponse.Data.Nodes["+ i +"].Vip"));
			nodesItem.setYunyouDeployUnitUrl(_ctx.stringValue("QueryODPInstancesResponse.Data.Nodes["+ i +"].YunyouDeployUnitUrl"));
			nodesItem.setYunyouOpsPlanUrl(_ctx.stringValue("QueryODPInstancesResponse.Data.Nodes["+ i +"].YunyouOpsPlanUrl"));
			nodesItem.setZdalproxyInstanceId(_ctx.stringValue("QueryODPInstancesResponse.Data.Nodes["+ i +"].ZdalproxyInstanceId"));
			nodesItem.setZdalproxyNodeId(_ctx.stringValue("QueryODPInstancesResponse.Data.Nodes["+ i +"].ZdalproxyNodeId"));
			nodesItem.setZone(_ctx.stringValue("QueryODPInstancesResponse.Data.Nodes["+ i +"].Zone"));
			nodesItem.setZoneDescription(_ctx.stringValue("QueryODPInstancesResponse.Data.Nodes["+ i +"].ZoneDescription"));

			nodes.add(nodesItem);
		}
		data.setNodes(nodes);
		queryODPInstancesResponse.setData(data);
	 
	 	return queryODPInstancesResponse;
	}
}