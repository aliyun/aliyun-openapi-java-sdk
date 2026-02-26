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

package com.aliyuncs.eflo_controller.transform.v20221215;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eflo_controller.model.v20221215.ListClusterNodesResponse;
import com.aliyuncs.eflo_controller.model.v20221215.ListClusterNodesResponse.NodesItem;
import com.aliyuncs.eflo_controller.model.v20221215.ListClusterNodesResponse.NodesItem.NetworksItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterNodesResponseUnmarshaller {

	public static ListClusterNodesResponse unmarshall(ListClusterNodesResponse listClusterNodesResponse, UnmarshallerContext _ctx) {
		
		listClusterNodesResponse.setRequestId(_ctx.stringValue("ListClusterNodesResponse.RequestId"));
		listClusterNodesResponse.setNextToken(_ctx.stringValue("ListClusterNodesResponse.NextToken"));

		List<NodesItem> nodes = new ArrayList<NodesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListClusterNodesResponse.Nodes.Length"); i++) {
			NodesItem nodesItem = new NodesItem();
			nodesItem.setCreateTime(_ctx.stringValue("ListClusterNodesResponse.Nodes["+ i +"].CreateTime"));
			nodesItem.setExpiredTime(_ctx.stringValue("ListClusterNodesResponse.Nodes["+ i +"].ExpiredTime"));
			nodesItem.setHostname(_ctx.stringValue("ListClusterNodesResponse.Nodes["+ i +"].Hostname"));
			nodesItem.setImageId(_ctx.stringValue("ListClusterNodesResponse.Nodes["+ i +"].ImageId"));
			nodesItem.setMachineType(_ctx.stringValue("ListClusterNodesResponse.Nodes["+ i +"].MachineType"));
			nodesItem.setNodeGroupId(_ctx.stringValue("ListClusterNodesResponse.Nodes["+ i +"].NodeGroupId"));
			nodesItem.setNodeGroupName(_ctx.stringValue("ListClusterNodesResponse.Nodes["+ i +"].NodeGroupName"));
			nodesItem.setNodeId(_ctx.stringValue("ListClusterNodesResponse.Nodes["+ i +"].NodeId"));
			nodesItem.setOperatingState(_ctx.stringValue("ListClusterNodesResponse.Nodes["+ i +"].OperatingState"));
			nodesItem.setSn(_ctx.stringValue("ListClusterNodesResponse.Nodes["+ i +"].Sn"));
			nodesItem.setZoneId(_ctx.stringValue("ListClusterNodesResponse.Nodes["+ i +"].ZoneId"));

			List<NetworksItem> networks = new ArrayList<NetworksItem>();
			for (int j = 0; j < _ctx.lengthValue("ListClusterNodesResponse.Nodes["+ i +"].Networks.Length"); j++) {
				NetworksItem networksItem = new NetworksItem();
				networksItem.setBondName(_ctx.stringValue("ListClusterNodesResponse.Nodes["+ i +"].Networks["+ j +"].BondName"));
				networksItem.setIp(_ctx.stringValue("ListClusterNodesResponse.Nodes["+ i +"].Networks["+ j +"].Ip"));
				networksItem.setSubnetId(_ctx.stringValue("ListClusterNodesResponse.Nodes["+ i +"].Networks["+ j +"].SubnetId"));
				networksItem.setVpdId(_ctx.stringValue("ListClusterNodesResponse.Nodes["+ i +"].Networks["+ j +"].VpdId"));

				networks.add(networksItem);
			}
			nodesItem.setNetworks(networks);

			nodes.add(nodesItem);
		}
		listClusterNodesResponse.setNodes(nodes);
	 
	 	return listClusterNodesResponse;
	}
}