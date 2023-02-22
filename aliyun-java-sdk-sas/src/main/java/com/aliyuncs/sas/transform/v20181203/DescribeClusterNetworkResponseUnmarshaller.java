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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeClusterNetworkResponse;
import com.aliyuncs.sas.model.v20181203.DescribeClusterNetworkResponse.ClusterNetwork;
import com.aliyuncs.sas.model.v20181203.DescribeClusterNetworkResponse.ClusterNetwork.BasicEdge;
import com.aliyuncs.sas.model.v20181203.DescribeClusterNetworkResponse.ClusterNetwork.ClusterNode;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterNetworkResponseUnmarshaller {

	public static DescribeClusterNetworkResponse unmarshall(DescribeClusterNetworkResponse describeClusterNetworkResponse, UnmarshallerContext _ctx) {
		
		describeClusterNetworkResponse.setRequestId(_ctx.stringValue("DescribeClusterNetworkResponse.RequestId"));

		ClusterNetwork clusterNetwork = new ClusterNetwork();

		List<ClusterNode> node = new ArrayList<ClusterNode>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterNetworkResponse.ClusterNetwork.Node.Length"); i++) {
			ClusterNode clusterNode = new ClusterNode();
			clusterNode.setType(_ctx.stringValue("DescribeClusterNetworkResponse.ClusterNetwork.Node["+ i +"].Type"));
			clusterNode.setRiskLevel(_ctx.stringValue("DescribeClusterNetworkResponse.ClusterNetwork.Node["+ i +"].RiskLevel"));
			clusterNode.setNetTopoSwitch(_ctx.stringValue("DescribeClusterNetworkResponse.ClusterNetwork.Node["+ i +"].NetTopoSwitch"));
			clusterNode.setInterceptionType(_ctx.integerValue("DescribeClusterNetworkResponse.ClusterNetwork.Node["+ i +"].InterceptionType"));
			clusterNode.setCnnfSwitch(_ctx.integerValue("DescribeClusterNetworkResponse.ClusterNetwork.Node["+ i +"].CnnfSwitch"));
			clusterNode.setName(_ctx.stringValue("DescribeClusterNetworkResponse.ClusterNetwork.Node["+ i +"].Name"));
			clusterNode.setId(_ctx.stringValue("DescribeClusterNetworkResponse.ClusterNetwork.Node["+ i +"].Id"));

			node.add(clusterNode);
		}
		clusterNetwork.setNode(node);

		List<BasicEdge> edge = new ArrayList<BasicEdge>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterNetworkResponse.ClusterNetwork.Edge.Length"); i++) {
			BasicEdge basicEdge = new BasicEdge();
			basicEdge.setDstNodeId(_ctx.stringValue("DescribeClusterNetworkResponse.ClusterNetwork.Edge["+ i +"].DstNodeId"));
			basicEdge.setPort(_ctx.stringValue("DescribeClusterNetworkResponse.ClusterNetwork.Edge["+ i +"].Port"));
			basicEdge.setSrcNodeId(_ctx.stringValue("DescribeClusterNetworkResponse.ClusterNetwork.Edge["+ i +"].SrcNodeId"));
			basicEdge.setSrcNodeType(_ctx.stringValue("DescribeClusterNetworkResponse.ClusterNetwork.Edge["+ i +"].SrcNodeType"));
			basicEdge.setDstNodeType(_ctx.stringValue("DescribeClusterNetworkResponse.ClusterNetwork.Edge["+ i +"].DstNodeType"));
			basicEdge.setId(_ctx.stringValue("DescribeClusterNetworkResponse.ClusterNetwork.Edge["+ i +"].Id"));

			edge.add(basicEdge);
		}
		clusterNetwork.setEdge(edge);
		describeClusterNetworkResponse.setClusterNetwork(clusterNetwork);
	 
	 	return describeClusterNetworkResponse;
	}
}