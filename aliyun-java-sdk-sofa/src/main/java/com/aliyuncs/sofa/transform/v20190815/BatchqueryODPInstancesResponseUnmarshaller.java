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

import com.aliyuncs.sofa.model.v20190815.BatchqueryODPInstancesResponse;
import com.aliyuncs.sofa.model.v20190815.BatchqueryODPInstancesResponse.DataItem;
import com.aliyuncs.sofa.model.v20190815.BatchqueryODPInstancesResponse.DataItem.NodesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchqueryODPInstancesResponseUnmarshaller {

	public static BatchqueryODPInstancesResponse unmarshall(BatchqueryODPInstancesResponse batchqueryODPInstancesResponse, UnmarshallerContext _ctx) {
		
		batchqueryODPInstancesResponse.setRequestId(_ctx.stringValue("BatchqueryODPInstancesResponse.RequestId"));
		batchqueryODPInstancesResponse.setResultCode(_ctx.stringValue("BatchqueryODPInstancesResponse.ResultCode"));
		batchqueryODPInstancesResponse.setResultMessage(_ctx.stringValue("BatchqueryODPInstancesResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("BatchqueryODPInstancesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setConfigSpecDesc(_ctx.stringValue("BatchqueryODPInstancesResponse.Data["+ i +"].ConfigSpecDesc"));
			dataItem.setEnvMode(_ctx.stringValue("BatchqueryODPInstancesResponse.Data["+ i +"].EnvMode"));
			dataItem.setEnvTenant(_ctx.stringValue("BatchqueryODPInstancesResponse.Data["+ i +"].EnvTenant"));
			dataItem.setGmtCreate(_ctx.stringValue("BatchqueryODPInstancesResponse.Data["+ i +"].GmtCreate"));
			dataItem.setGmtModified(_ctx.stringValue("BatchqueryODPInstancesResponse.Data["+ i +"].GmtModified"));
			dataItem.setId(_ctx.longValue("BatchqueryODPInstancesResponse.Data["+ i +"].Id"));
			dataItem.setInstanceId(_ctx.stringValue("BatchqueryODPInstancesResponse.Data["+ i +"].InstanceId"));
			dataItem.setInstanceName(_ctx.stringValue("BatchqueryODPInstancesResponse.Data["+ i +"].InstanceName"));
			dataItem.setInstancePort(_ctx.longValue("BatchqueryODPInstancesResponse.Data["+ i +"].InstancePort"));
			dataItem.setInstanceStatus(_ctx.stringValue("BatchqueryODPInstancesResponse.Data["+ i +"].InstanceStatus"));
			dataItem.setInstanceVip(_ctx.stringValue("BatchqueryODPInstancesResponse.Data["+ i +"].InstanceVip"));
			dataItem.setInstanceWanAddress(_ctx.stringValue("BatchqueryODPInstancesResponse.Data["+ i +"].InstanceWanAddress"));
			dataItem.setInstanceWanPort(_ctx.longValue("BatchqueryODPInstancesResponse.Data["+ i +"].InstanceWanPort"));
			dataItem.setInstanceZone(_ctx.stringValue("BatchqueryODPInstancesResponse.Data["+ i +"].InstanceZone"));
			dataItem.setMachineCount(_ctx.longValue("BatchqueryODPInstancesResponse.Data["+ i +"].MachineCount"));
			dataItem.setPaymentType(_ctx.longValue("BatchqueryODPInstancesResponse.Data["+ i +"].PaymentType"));
			dataItem.setRegion(_ctx.stringValue("BatchqueryODPInstancesResponse.Data["+ i +"].Region"));
			dataItem.setSchemaCount(_ctx.longValue("BatchqueryODPInstancesResponse.Data["+ i +"].SchemaCount"));
			dataItem.setZoneCount(_ctx.longValue("BatchqueryODPInstancesResponse.Data["+ i +"].ZoneCount"));

			List<NodesItem> nodes = new ArrayList<NodesItem>();
			for (int j = 0; j < _ctx.lengthValue("BatchqueryODPInstancesResponse.Data["+ i +"].Nodes.Length"); j++) {
				NodesItem nodesItem = new NodesItem();
				nodesItem.setConfigSpecDesc(_ctx.stringValue("BatchqueryODPInstancesResponse.Data["+ i +"].Nodes["+ j +"].ConfigSpecDesc"));
				nodesItem.setCpuCount(_ctx.longValue("BatchqueryODPInstancesResponse.Data["+ i +"].Nodes["+ j +"].CpuCount"));
				nodesItem.setEnvMode(_ctx.stringValue("BatchqueryODPInstancesResponse.Data["+ i +"].Nodes["+ j +"].EnvMode"));
				nodesItem.setEnvTenant(_ctx.stringValue("BatchqueryODPInstancesResponse.Data["+ i +"].Nodes["+ j +"].EnvTenant"));
				nodesItem.setGmtCreate(_ctx.stringValue("BatchqueryODPInstancesResponse.Data["+ i +"].Nodes["+ j +"].GmtCreate"));
				nodesItem.setGmtModified(_ctx.stringValue("BatchqueryODPInstancesResponse.Data["+ i +"].Nodes["+ j +"].GmtModified"));
				nodesItem.setId(_ctx.longValue("BatchqueryODPInstancesResponse.Data["+ i +"].Nodes["+ j +"].Id"));
				nodesItem.setMachineCount(_ctx.longValue("BatchqueryODPInstancesResponse.Data["+ i +"].Nodes["+ j +"].MachineCount"));
				nodesItem.setMemoryCount(_ctx.longValue("BatchqueryODPInstancesResponse.Data["+ i +"].Nodes["+ j +"].MemoryCount"));
				nodesItem.setPort(_ctx.longValue("BatchqueryODPInstancesResponse.Data["+ i +"].Nodes["+ j +"].Port"));
				nodesItem.setVip(_ctx.stringValue("BatchqueryODPInstancesResponse.Data["+ i +"].Nodes["+ j +"].Vip"));
				nodesItem.setZdalproxyInstanceId(_ctx.stringValue("BatchqueryODPInstancesResponse.Data["+ i +"].Nodes["+ j +"].ZdalproxyInstanceId"));
				nodesItem.setZdalproxyNodeId(_ctx.stringValue("BatchqueryODPInstancesResponse.Data["+ i +"].Nodes["+ j +"].ZdalproxyNodeId"));
				nodesItem.setZone(_ctx.stringValue("BatchqueryODPInstancesResponse.Data["+ i +"].Nodes["+ j +"].Zone"));

				nodes.add(nodesItem);
			}
			dataItem.setNodes(nodes);

			data.add(dataItem);
		}
		batchqueryODPInstancesResponse.setData(data);
	 
	 	return batchqueryODPInstancesResponse;
	}
}