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

import com.aliyuncs.sofa.model.v20190815.QueryODPDbnodesResponse;
import com.aliyuncs.sofa.model.v20190815.QueryODPDbnodesResponse.Data;
import com.aliyuncs.sofa.model.v20190815.QueryODPDbnodesResponse.Data.Topology;
import com.aliyuncs.sofa.model.v20190815.QueryODPDbnodesResponse.Data.Topology.Master;
import com.aliyuncs.sofa.model.v20190815.QueryODPDbnodesResponse.Data.Topology.SlavesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryODPDbnodesResponseUnmarshaller {

	public static QueryODPDbnodesResponse unmarshall(QueryODPDbnodesResponse queryODPDbnodesResponse, UnmarshallerContext _ctx) {
		
		queryODPDbnodesResponse.setRequestId(_ctx.stringValue("QueryODPDbnodesResponse.RequestId"));
		queryODPDbnodesResponse.setResultCode(_ctx.stringValue("QueryODPDbnodesResponse.ResultCode"));
		queryODPDbnodesResponse.setResultMessage(_ctx.stringValue("QueryODPDbnodesResponse.ResultMessage"));

		Data data = new Data();
		data.setAvailable(_ctx.stringValue("QueryODPDbnodesResponse.Data.Available"));
		data.setCheckDbStatus(_ctx.booleanValue("QueryODPDbnodesResponse.Data.CheckDbStatus"));
		data.setDbType(_ctx.stringValue("QueryODPDbnodesResponse.Data.DbType"));
		data.setDescription(_ctx.stringValue("QueryODPDbnodesResponse.Data.Description"));
		data.setEnvMode(_ctx.stringValue("QueryODPDbnodesResponse.Data.EnvMode"));
		data.setEnvTenant(_ctx.stringValue("QueryODPDbnodesResponse.Data.EnvTenant"));
		data.setGmtCreate(_ctx.stringValue("QueryODPDbnodesResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.stringValue("QueryODPDbnodesResponse.Data.GmtModified"));
		data.setId(_ctx.longValue("QueryODPDbnodesResponse.Data.Id"));
		data.setMasterId(_ctx.stringValue("QueryODPDbnodesResponse.Data.MasterId"));
		data.setNetMode(_ctx.stringValue("QueryODPDbnodesResponse.Data.NetMode"));
		data.setNodeId(_ctx.stringValue("QueryODPDbnodesResponse.Data.NodeId"));
		data.setPassword(_ctx.stringValue("QueryODPDbnodesResponse.Data.Password"));
		data.setReadOnly(_ctx.booleanValue("QueryODPDbnodesResponse.Data.ReadOnly"));
		data.setRegion(_ctx.stringValue("QueryODPDbnodesResponse.Data.Region"));
		data.setStatus(_ctx.stringValue("QueryODPDbnodesResponse.Data.Status"));
		data.setUrl(_ctx.stringValue("QueryODPDbnodesResponse.Data.Url"));
		data.setUsername(_ctx.stringValue("QueryODPDbnodesResponse.Data.Username"));
		data.setVpcId(_ctx.stringValue("QueryODPDbnodesResponse.Data.VpcId"));
		data.setWeight(_ctx.longValue("QueryODPDbnodesResponse.Data.Weight"));

		Topology topology = new Topology();

		Master master = new Master();
		master.setNodeId(_ctx.stringValue("QueryODPDbnodesResponse.Data.Topology.Master.NodeId"));
		master.setWeight(_ctx.longValue("QueryODPDbnodesResponse.Data.Topology.Master.Weight"));
		topology.setMaster(master);

		List<SlavesItem> slaves = new ArrayList<SlavesItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryODPDbnodesResponse.Data.Topology.Slaves.Length"); i++) {
			SlavesItem slavesItem = new SlavesItem();
			slavesItem.setNodeId(_ctx.stringValue("QueryODPDbnodesResponse.Data.Topology.Slaves["+ i +"].NodeId"));
			slavesItem.setWeight(_ctx.longValue("QueryODPDbnodesResponse.Data.Topology.Slaves["+ i +"].Weight"));

			slaves.add(slavesItem);
		}
		topology.setSlaves(slaves);
		data.setTopology(topology);
		queryODPDbnodesResponse.setData(data);
	 
	 	return queryODPDbnodesResponse;
	}
}