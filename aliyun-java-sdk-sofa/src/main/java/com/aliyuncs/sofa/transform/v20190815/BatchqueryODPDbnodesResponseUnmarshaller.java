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

import com.aliyuncs.sofa.model.v20190815.BatchqueryODPDbnodesResponse;
import com.aliyuncs.sofa.model.v20190815.BatchqueryODPDbnodesResponse.DataItem;
import com.aliyuncs.sofa.model.v20190815.BatchqueryODPDbnodesResponse.DataItem.Topology;
import com.aliyuncs.sofa.model.v20190815.BatchqueryODPDbnodesResponse.DataItem.Topology.Master;
import com.aliyuncs.sofa.model.v20190815.BatchqueryODPDbnodesResponse.DataItem.Topology.SlavesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchqueryODPDbnodesResponseUnmarshaller {

	public static BatchqueryODPDbnodesResponse unmarshall(BatchqueryODPDbnodesResponse batchqueryODPDbnodesResponse, UnmarshallerContext _ctx) {
		
		batchqueryODPDbnodesResponse.setRequestId(_ctx.stringValue("BatchqueryODPDbnodesResponse.RequestId"));
		batchqueryODPDbnodesResponse.setResultCode(_ctx.stringValue("BatchqueryODPDbnodesResponse.ResultCode"));
		batchqueryODPDbnodesResponse.setResultMessage(_ctx.stringValue("BatchqueryODPDbnodesResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("BatchqueryODPDbnodesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAvailable(_ctx.stringValue("BatchqueryODPDbnodesResponse.Data["+ i +"].Available"));
			dataItem.setCheckDbStatus(_ctx.booleanValue("BatchqueryODPDbnodesResponse.Data["+ i +"].CheckDbStatus"));
			dataItem.setDbType(_ctx.stringValue("BatchqueryODPDbnodesResponse.Data["+ i +"].DbType"));
			dataItem.setDescription(_ctx.stringValue("BatchqueryODPDbnodesResponse.Data["+ i +"].Description"));
			dataItem.setEnvMode(_ctx.stringValue("BatchqueryODPDbnodesResponse.Data["+ i +"].EnvMode"));
			dataItem.setEnvTenant(_ctx.stringValue("BatchqueryODPDbnodesResponse.Data["+ i +"].EnvTenant"));
			dataItem.setGmtCreate(_ctx.stringValue("BatchqueryODPDbnodesResponse.Data["+ i +"].GmtCreate"));
			dataItem.setGmtModified(_ctx.stringValue("BatchqueryODPDbnodesResponse.Data["+ i +"].GmtModified"));
			dataItem.setId(_ctx.longValue("BatchqueryODPDbnodesResponse.Data["+ i +"].Id"));
			dataItem.setMasterId(_ctx.stringValue("BatchqueryODPDbnodesResponse.Data["+ i +"].MasterId"));
			dataItem.setNetMode(_ctx.stringValue("BatchqueryODPDbnodesResponse.Data["+ i +"].NetMode"));
			dataItem.setNodeId(_ctx.stringValue("BatchqueryODPDbnodesResponse.Data["+ i +"].NodeId"));
			dataItem.setPassword(_ctx.stringValue("BatchqueryODPDbnodesResponse.Data["+ i +"].Password"));
			dataItem.setReadOnly(_ctx.booleanValue("BatchqueryODPDbnodesResponse.Data["+ i +"].ReadOnly"));
			dataItem.setRegion(_ctx.stringValue("BatchqueryODPDbnodesResponse.Data["+ i +"].Region"));
			dataItem.setStatus(_ctx.stringValue("BatchqueryODPDbnodesResponse.Data["+ i +"].Status"));
			dataItem.setUrl(_ctx.stringValue("BatchqueryODPDbnodesResponse.Data["+ i +"].Url"));
			dataItem.setUsername(_ctx.stringValue("BatchqueryODPDbnodesResponse.Data["+ i +"].Username"));
			dataItem.setVpcId(_ctx.stringValue("BatchqueryODPDbnodesResponse.Data["+ i +"].VpcId"));
			dataItem.setWeight(_ctx.longValue("BatchqueryODPDbnodesResponse.Data["+ i +"].Weight"));

			Topology topology = new Topology();

			Master master = new Master();
			master.setNodeId(_ctx.stringValue("BatchqueryODPDbnodesResponse.Data["+ i +"].Topology.Master.NodeId"));
			master.setWeight(_ctx.longValue("BatchqueryODPDbnodesResponse.Data["+ i +"].Topology.Master.Weight"));
			topology.setMaster(master);

			List<SlavesItem> slaves = new ArrayList<SlavesItem>();
			for (int j = 0; j < _ctx.lengthValue("BatchqueryODPDbnodesResponse.Data["+ i +"].Topology.Slaves.Length"); j++) {
				SlavesItem slavesItem = new SlavesItem();
				slavesItem.setNodeId(_ctx.stringValue("BatchqueryODPDbnodesResponse.Data["+ i +"].Topology.Slaves["+ j +"].NodeId"));
				slavesItem.setWeight(_ctx.longValue("BatchqueryODPDbnodesResponse.Data["+ i +"].Topology.Slaves["+ j +"].Weight"));

				slaves.add(slavesItem);
			}
			topology.setSlaves(slaves);
			dataItem.setTopology(topology);

			data.add(dataItem);
		}
		batchqueryODPDbnodesResponse.setData(data);
	 
	 	return batchqueryODPDbnodesResponse;
	}
}