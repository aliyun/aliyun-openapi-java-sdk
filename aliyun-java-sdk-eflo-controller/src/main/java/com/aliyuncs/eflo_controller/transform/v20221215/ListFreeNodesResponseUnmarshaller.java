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

import com.aliyuncs.eflo_controller.model.v20221215.ListFreeNodesResponse;
import com.aliyuncs.eflo_controller.model.v20221215.ListFreeNodesResponse.NodesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFreeNodesResponseUnmarshaller {

	public static ListFreeNodesResponse unmarshall(ListFreeNodesResponse listFreeNodesResponse, UnmarshallerContext _ctx) {
		
		listFreeNodesResponse.setRequestId(_ctx.stringValue("ListFreeNodesResponse.RequestId"));
		listFreeNodesResponse.setNextToken(_ctx.stringValue("ListFreeNodesResponse.NextToken"));

		List<NodesItem> nodes = new ArrayList<NodesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListFreeNodesResponse.Nodes.Length"); i++) {
			NodesItem nodesItem = new NodesItem();
			nodesItem.setZoneId(_ctx.stringValue("ListFreeNodesResponse.Nodes["+ i +"].ZoneId"));
			nodesItem.setCreateTime(_ctx.stringValue("ListFreeNodesResponse.Nodes["+ i +"].CreateTime"));
			nodesItem.setNodeId(_ctx.stringValue("ListFreeNodesResponse.Nodes["+ i +"].NodeId"));
			nodesItem.setMachineType(_ctx.stringValue("ListFreeNodesResponse.Nodes["+ i +"].MachineType"));
			nodesItem.setSn(_ctx.stringValue("ListFreeNodesResponse.Nodes["+ i +"].Sn"));
			nodesItem.setExpiredTime(_ctx.stringValue("ListFreeNodesResponse.Nodes["+ i +"].ExpiredTime"));

			nodes.add(nodesItem);
		}
		listFreeNodesResponse.setNodes(nodes);
	 
	 	return listFreeNodesResponse;
	}
}