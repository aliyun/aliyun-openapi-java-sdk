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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeGlobalDatabaseNetworkResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeGlobalDatabaseNetworkResponse.Connection;
import com.aliyuncs.polardb.model.v20170801.DescribeGlobalDatabaseNetworkResponse.DBCluster;
import com.aliyuncs.polardb.model.v20170801.DescribeGlobalDatabaseNetworkResponse.DBCluster.DBNode;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGlobalDatabaseNetworkResponseUnmarshaller {

	public static DescribeGlobalDatabaseNetworkResponse unmarshall(DescribeGlobalDatabaseNetworkResponse describeGlobalDatabaseNetworkResponse, UnmarshallerContext _ctx) {
		
		describeGlobalDatabaseNetworkResponse.setRequestId(_ctx.stringValue("DescribeGlobalDatabaseNetworkResponse.RequestId"));
		describeGlobalDatabaseNetworkResponse.setGDNStatus(_ctx.stringValue("DescribeGlobalDatabaseNetworkResponse.GDNStatus"));
		describeGlobalDatabaseNetworkResponse.setDBVersion(_ctx.stringValue("DescribeGlobalDatabaseNetworkResponse.DBVersion"));
		describeGlobalDatabaseNetworkResponse.setGDNId(_ctx.stringValue("DescribeGlobalDatabaseNetworkResponse.GDNId"));
		describeGlobalDatabaseNetworkResponse.setCreateTime(_ctx.stringValue("DescribeGlobalDatabaseNetworkResponse.CreateTime"));
		describeGlobalDatabaseNetworkResponse.setDBType(_ctx.stringValue("DescribeGlobalDatabaseNetworkResponse.DBType"));
		describeGlobalDatabaseNetworkResponse.setGDNDescription(_ctx.stringValue("DescribeGlobalDatabaseNetworkResponse.GDNDescription"));

		List<Connection> connections = new ArrayList<Connection>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGlobalDatabaseNetworkResponse.Connections.Length"); i++) {
			Connection connection = new Connection();
			connection.setConnectionString(_ctx.stringValue("DescribeGlobalDatabaseNetworkResponse.Connections["+ i +"].ConnectionString"));
			connection.setNetType(_ctx.stringValue("DescribeGlobalDatabaseNetworkResponse.Connections["+ i +"].NetType"));
			connection.setPort(_ctx.stringValue("DescribeGlobalDatabaseNetworkResponse.Connections["+ i +"].Port"));

			connections.add(connection);
		}
		describeGlobalDatabaseNetworkResponse.setConnections(connections);

		List<DBCluster> dBClusters = new ArrayList<DBCluster>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGlobalDatabaseNetworkResponse.DBClusters.Length"); i++) {
			DBCluster dBCluster = new DBCluster();
			dBCluster.setReplicaLag(_ctx.stringValue("DescribeGlobalDatabaseNetworkResponse.DBClusters["+ i +"].ReplicaLag"));
			dBCluster.setExpireTime(_ctx.stringValue("DescribeGlobalDatabaseNetworkResponse.DBClusters["+ i +"].ExpireTime"));
			dBCluster.setExpired(_ctx.stringValue("DescribeGlobalDatabaseNetworkResponse.DBClusters["+ i +"].Expired"));
			dBCluster.setDBNodeClass(_ctx.stringValue("DescribeGlobalDatabaseNetworkResponse.DBClusters["+ i +"].DBNodeClass"));
			dBCluster.setPayType(_ctx.stringValue("DescribeGlobalDatabaseNetworkResponse.DBClusters["+ i +"].PayType"));
			dBCluster.setDBType(_ctx.stringValue("DescribeGlobalDatabaseNetworkResponse.DBClusters["+ i +"].DBType"));
			dBCluster.setRegionId(_ctx.stringValue("DescribeGlobalDatabaseNetworkResponse.DBClusters["+ i +"].RegionId"));
			dBCluster.setDBVersion(_ctx.stringValue("DescribeGlobalDatabaseNetworkResponse.DBClusters["+ i +"].DBVersion"));
			dBCluster.setDBClusterId(_ctx.stringValue("DescribeGlobalDatabaseNetworkResponse.DBClusters["+ i +"].DBClusterId"));
			dBCluster.setDBClusterStatus(_ctx.stringValue("DescribeGlobalDatabaseNetworkResponse.DBClusters["+ i +"].DBClusterStatus"));
			dBCluster.setStorageUsed(_ctx.stringValue("DescribeGlobalDatabaseNetworkResponse.DBClusters["+ i +"].StorageUsed"));
			dBCluster.setDBClusterDescription(_ctx.stringValue("DescribeGlobalDatabaseNetworkResponse.DBClusters["+ i +"].DBClusterDescription"));
			dBCluster.setRole(_ctx.stringValue("DescribeGlobalDatabaseNetworkResponse.DBClusters["+ i +"].Role"));

			List<DBNode> dBNodes = new ArrayList<DBNode>();
			for (int j = 0; j < _ctx.lengthValue("DescribeGlobalDatabaseNetworkResponse.DBClusters["+ i +"].DBNodes.Length"); j++) {
				DBNode dBNode = new DBNode();
				dBNode.setDBNodeClass(_ctx.stringValue("DescribeGlobalDatabaseNetworkResponse.DBClusters["+ i +"].DBNodes["+ j +"].DBNodeClass"));
				dBNode.setZoneId(_ctx.stringValue("DescribeGlobalDatabaseNetworkResponse.DBClusters["+ i +"].DBNodes["+ j +"].ZoneId"));
				dBNode.setCreationTime(_ctx.stringValue("DescribeGlobalDatabaseNetworkResponse.DBClusters["+ i +"].DBNodes["+ j +"].CreationTime"));
				dBNode.setDBNodeRole(_ctx.stringValue("DescribeGlobalDatabaseNetworkResponse.DBClusters["+ i +"].DBNodes["+ j +"].DBNodeRole"));
				dBNode.setDBNodeStatus(_ctx.stringValue("DescribeGlobalDatabaseNetworkResponse.DBClusters["+ i +"].DBNodes["+ j +"].DBNodeStatus"));
				dBNode.setFailoverPriority(_ctx.integerValue("DescribeGlobalDatabaseNetworkResponse.DBClusters["+ i +"].DBNodes["+ j +"].FailoverPriority"));
				dBNode.setMaxConnections(_ctx.integerValue("DescribeGlobalDatabaseNetworkResponse.DBClusters["+ i +"].DBNodes["+ j +"].MaxConnections"));
				dBNode.setMaxIOPS(_ctx.integerValue("DescribeGlobalDatabaseNetworkResponse.DBClusters["+ i +"].DBNodes["+ j +"].MaxIOPS"));
				dBNode.setDBNodeId(_ctx.stringValue("DescribeGlobalDatabaseNetworkResponse.DBClusters["+ i +"].DBNodes["+ j +"].DBNodeId"));

				dBNodes.add(dBNode);
			}
			dBCluster.setDBNodes(dBNodes);

			dBClusters.add(dBCluster);
		}
		describeGlobalDatabaseNetworkResponse.setDBClusters(dBClusters);
	 
	 	return describeGlobalDatabaseNetworkResponse;
	}
}