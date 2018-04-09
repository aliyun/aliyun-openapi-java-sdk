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

import com.aliyuncs.emr.model.v20160408.ListClusterNodeResponse;
import com.aliyuncs.emr.model.v20160408.ListClusterNodeResponse.ClusterNode;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterNodeResponseUnmarshaller {

	public static ListClusterNodeResponse unmarshall(ListClusterNodeResponse listClusterNodeResponse, UnmarshallerContext context) {
		
		listClusterNodeResponse.setRequestId(context.stringValue("ListClusterNodeResponse.RequestId"));

		List<ClusterNode> clusterNodeList = new ArrayList<ClusterNode>();
		for (int i = 0; i < context.lengthValue("ListClusterNodeResponse.ClusterNodeList.Length"); i++) {
			ClusterNode clusterNode = new ClusterNode();
			clusterNode.setNodeId(context.stringValue("ListClusterNodeResponse.ClusterNodeList["+ i +"].NodeId"));
			clusterNode.setNodeIp(context.stringValue("ListClusterNodeResponse.ClusterNodeList["+ i +"].NodeIp"));
			clusterNode.setStatus(context.stringValue("ListClusterNodeResponse.ClusterNodeList["+ i +"].Status"));

			clusterNodeList.add(clusterNode);
		}
		listClusterNodeResponse.setClusterNodeList(clusterNodeList);
	 
	 	return listClusterNodeResponse;
	}
}