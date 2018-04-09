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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListClusterNodesResponse;
import com.aliyuncs.emr.model.v20160408.ListClusterNodesResponse.ClusterNode;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterNodesResponseUnmarshaller {

	public static ListClusterNodesResponse unmarshall(ListClusterNodesResponse listClusterNodesResponse, UnmarshallerContext context) {
		
		listClusterNodesResponse.setRequestId(context.stringValue("ListClusterNodesResponse.RequestId"));

		List<ClusterNode> clusterNodes = new ArrayList<ClusterNode>();
		for (int i = 0; i < context.lengthValue("ListClusterNodesResponse.ClusterNodes.Length"); i++) {
			ClusterNode clusterNode = new ClusterNode();
			clusterNode.setNodeId(context.stringValue("ListClusterNodesResponse.ClusterNodes["+ i +"].NodeId"));
			clusterNode.setNodeIp(context.stringValue("ListClusterNodesResponse.ClusterNodes["+ i +"].NodeIp"));
			clusterNode.setStatus(context.stringValue("ListClusterNodesResponse.ClusterNodes["+ i +"].Status"));

			clusterNodes.add(clusterNode);
		}
		listClusterNodesResponse.setClusterNodes(clusterNodes);
	 
	 	return listClusterNodesResponse;
	}
}