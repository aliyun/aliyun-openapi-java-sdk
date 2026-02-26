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

import com.aliyuncs.rds.model.v20140815.DescribeRCClusterNodesResponse;
import com.aliyuncs.rds.model.v20140815.DescribeRCClusterNodesResponse.Node;
import com.aliyuncs.rds.model.v20140815.DescribeRCClusterNodesResponse.Page;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRCClusterNodesResponseUnmarshaller {

	public static DescribeRCClusterNodesResponse unmarshall(DescribeRCClusterNodesResponse describeRCClusterNodesResponse, UnmarshallerContext _ctx) {
		
		describeRCClusterNodesResponse.setRequestId(_ctx.stringValue("DescribeRCClusterNodesResponse.RequestId"));

		Page page = new Page();
		page.setPageNumber(_ctx.longValue("DescribeRCClusterNodesResponse.Page.PageNumber"));
		page.setPageSize(_ctx.longValue("DescribeRCClusterNodesResponse.Page.PageSize"));
		page.setTotalCount(_ctx.longValue("DescribeRCClusterNodesResponse.Page.TotalCount"));
		describeRCClusterNodesResponse.setPage(page);

		List<Node> nodes = new ArrayList<Node>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRCClusterNodesResponse.Nodes.Length"); i++) {
			Node node = new Node();
			node.setCreationTime(_ctx.stringValue("DescribeRCClusterNodesResponse.Nodes["+ i +"].CreationTime"));
			node.setDockerVersion(_ctx.stringValue("DescribeRCClusterNodesResponse.Nodes["+ i +"].DockerVersion"));
			node.setImageId(_ctx.stringValue("DescribeRCClusterNodesResponse.Nodes["+ i +"].ImageId"));
			node.setInstanceId(_ctx.stringValue("DescribeRCClusterNodesResponse.Nodes["+ i +"].InstanceId"));
			node.setInstanceRole(_ctx.stringValue("DescribeRCClusterNodesResponse.Nodes["+ i +"].InstanceRole"));
			node.setIsAliyunNode(_ctx.booleanValue("DescribeRCClusterNodesResponse.Nodes["+ i +"].IsAliyunNode"));
			node.setNodeName(_ctx.stringValue("DescribeRCClusterNodesResponse.Nodes["+ i +"].NodeName"));
			node.setNodeStatus(_ctx.stringValue("DescribeRCClusterNodesResponse.Nodes["+ i +"].NodeStatus"));
			node.setNodePoolId(_ctx.stringValue("DescribeRCClusterNodesResponse.Nodes["+ i +"].NodePoolId"));
			node.setRuntimeVersion(_ctx.stringValue("DescribeRCClusterNodesResponse.Nodes["+ i +"].RuntimeVersion"));
			node.setState(_ctx.stringValue("DescribeRCClusterNodesResponse.Nodes["+ i +"].State"));

			List<String> ipAddresses = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRCClusterNodesResponse.Nodes["+ i +"].IpAddresses.Length"); j++) {
				ipAddresses.add(_ctx.stringValue("DescribeRCClusterNodesResponse.Nodes["+ i +"].IpAddresses["+ j +"]"));
			}
			node.setIpAddresses(ipAddresses);

			nodes.add(node);
		}
		describeRCClusterNodesResponse.setNodes(nodes);
	 
	 	return describeRCClusterNodesResponse;
	}
}