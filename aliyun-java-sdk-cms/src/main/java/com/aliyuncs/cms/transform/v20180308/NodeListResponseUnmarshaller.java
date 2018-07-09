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

package com.aliyuncs.cms.transform.v20180308;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20180308.NodeListResponse;
import com.aliyuncs.cms.model.v20180308.NodeListResponse.Node;
import com.aliyuncs.transform.UnmarshallerContext;


public class NodeListResponseUnmarshaller {

	public static NodeListResponse unmarshall(NodeListResponse nodeListResponse, UnmarshallerContext context) {
		
		nodeListResponse.setRequestId(context.stringValue("NodeListResponse.RequestId"));
		nodeListResponse.setErrorCode(context.integerValue("NodeListResponse.ErrorCode"));
		nodeListResponse.setErrorMessage(context.stringValue("NodeListResponse.ErrorMessage"));
		nodeListResponse.setSuccess(context.booleanValue("NodeListResponse.Success"));
		nodeListResponse.setPageNumber(context.integerValue("NodeListResponse.PageNumber"));
		nodeListResponse.setPageSize(context.integerValue("NodeListResponse.PageSize"));
		nodeListResponse.setPageTotal(context.integerValue("NodeListResponse.PageTotal"));
		nodeListResponse.setTotal(context.integerValue("NodeListResponse.Total"));

		List<Node> nodes = new ArrayList<Node>();
		for (int i = 0; i < context.lengthValue("NodeListResponse.Nodes.Length"); i++) {
			Node node = new Node();
			node.setInstanceId(context.stringValue("NodeListResponse.Nodes["+ i +"].InstanceId"));
			node.setSerialNumber(context.stringValue("NodeListResponse.Nodes["+ i +"].SerialNumber"));
			node.setHostName(context.stringValue("NodeListResponse.Nodes["+ i +"].HostName"));
			node.setAliUid(context.longValue("NodeListResponse.Nodes["+ i +"].AliUid"));
			node.setOperatingSystem(context.stringValue("NodeListResponse.Nodes["+ i +"].OperatingSystem"));
			node.setIpGroup(context.stringValue("NodeListResponse.Nodes["+ i +"].IpGroup"));
			node.setRegion(context.stringValue("NodeListResponse.Nodes["+ i +"].Region"));
			node.setTianjimonVersion(context.stringValue("NodeListResponse.Nodes["+ i +"].TianjimonVersion"));
			node.setEipAddress(context.stringValue("NodeListResponse.Nodes["+ i +"].EipAddress"));
			node.setEipId(context.stringValue("NodeListResponse.Nodes["+ i +"].EipId"));
			node.setAliyunHost(context.booleanValue("NodeListResponse.Nodes["+ i +"].AliyunHost"));
			node.setNatIp(context.stringValue("NodeListResponse.Nodes["+ i +"].NatIp"));
			node.setNetworkType(context.stringValue("NodeListResponse.Nodes["+ i +"].NetworkType"));
			node.setInstanceTypeFamily(context.stringValue("NodeListResponse.Nodes["+ i +"].InstanceTypeFamily"));

			nodes.add(node);
		}
		nodeListResponse.setNodes(nodes);
	 
	 	return nodeListResponse;
	}
}