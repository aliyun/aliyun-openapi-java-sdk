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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.GetDBInstanceTopologyResponse;
import com.aliyuncs.rds.model.v20140815.GetDBInstanceTopologyResponse.Data;
import com.aliyuncs.rds.model.v20140815.GetDBInstanceTopologyResponse.Data.Connection;
import com.aliyuncs.rds.model.v20140815.GetDBInstanceTopologyResponse.Data.Node;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDBInstanceTopologyResponseUnmarshaller {

	public static GetDBInstanceTopologyResponse unmarshall(GetDBInstanceTopologyResponse getDBInstanceTopologyResponse, UnmarshallerContext _ctx) {
		
		getDBInstanceTopologyResponse.setRequestId(_ctx.stringValue("GetDBInstanceTopologyResponse.RequestId"));
		getDBInstanceTopologyResponse.setCode(_ctx.stringValue("GetDBInstanceTopologyResponse.Code"));
		getDBInstanceTopologyResponse.setMessage(_ctx.stringValue("GetDBInstanceTopologyResponse.Message"));

		Data data = new Data();
		data.setDBInstanceName(_ctx.stringValue("GetDBInstanceTopologyResponse.Data.DBInstanceName"));

		List<Connection> connections = new ArrayList<Connection>();
		for (int i = 0; i < _ctx.lengthValue("GetDBInstanceTopologyResponse.Data.Connections.Length"); i++) {
			Connection connection = new Connection();
			connection.setConnectionString(_ctx.stringValue("GetDBInstanceTopologyResponse.Data.Connections["+ i +"].ConnectionString"));
			connection.setNetType(_ctx.stringValue("GetDBInstanceTopologyResponse.Data.Connections["+ i +"].NetType"));
			connection.setZoneId(_ctx.stringValue("GetDBInstanceTopologyResponse.Data.Connections["+ i +"].ZoneId"));

			connections.add(connection);
		}
		data.setConnections(connections);

		List<Node> nodes = new ArrayList<Node>();
		for (int i = 0; i < _ctx.lengthValue("GetDBInstanceTopologyResponse.Data.Nodes.Length"); i++) {
			Node node = new Node();
			node.setDedicatedHostGroupId(_ctx.stringValue("GetDBInstanceTopologyResponse.Data.Nodes["+ i +"].DedicatedHostGroupId"));
			node.setDedicatedHostId(_ctx.stringValue("GetDBInstanceTopologyResponse.Data.Nodes["+ i +"].DedicatedHostId"));
			node.setRole(_ctx.stringValue("GetDBInstanceTopologyResponse.Data.Nodes["+ i +"].Role"));
			node.setZoneId(_ctx.stringValue("GetDBInstanceTopologyResponse.Data.Nodes["+ i +"].ZoneId"));

			nodes.add(node);
		}
		data.setNodes(nodes);
		getDBInstanceTopologyResponse.setData(data);
	 
	 	return getDBInstanceTopologyResponse;
	}
}