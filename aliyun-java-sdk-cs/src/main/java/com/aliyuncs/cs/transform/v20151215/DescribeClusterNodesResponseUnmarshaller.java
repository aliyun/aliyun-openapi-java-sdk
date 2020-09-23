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

package com.aliyuncs.cs.transform.v20151215;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cs.model.v20151215.DescribeClusterNodesResponse;
import com.aliyuncs.cs.model.v20151215.DescribeClusterNodesResponse.Node;
import com.aliyuncs.cs.model.v20151215.DescribeClusterNodesResponse.Page;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterNodesResponseUnmarshaller {

	public static DescribeClusterNodesResponse unmarshall(DescribeClusterNodesResponse describeClusterNodesResponse, UnmarshallerContext _ctx) {
		

		Page page = new Page();
		page.setPage_number(_ctx.integerValue("DescribeClusterNodesResponse.page.page_number"));
		page.setTotal_count(_ctx.integerValue("DescribeClusterNodesResponse.page.total_count"));
		page.setPage_size(_ctx.integerValue("DescribeClusterNodesResponse.page.page_size"));
		describeClusterNodesResponse.setPage(page);

		List<Node> nodes = new ArrayList<Node>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterNodesResponse.nodes.Length"); i++) {
			Node node = new Node();
			node.setError_message(_ctx.stringValue("DescribeClusterNodesResponse.nodes["+ i +"].error_message"));
			node.setCreation_time(_ctx.stringValue("DescribeClusterNodesResponse.nodes["+ i +"].creation_time"));
			node.setNode_status(_ctx.stringValue("DescribeClusterNodesResponse.nodes["+ i +"].node_status"));
			node.setInstance_name(_ctx.stringValue("DescribeClusterNodesResponse.nodes["+ i +"].instance_name"));
			node.setIs_aliyun_node(_ctx.booleanValue("DescribeClusterNodesResponse.nodes["+ i +"].is_aliyun_node"));
			node.setNode_name(_ctx.stringValue("DescribeClusterNodesResponse.nodes["+ i +"].node_name"));
			node.setExpired_time(_ctx.stringValue("DescribeClusterNodesResponse.nodes["+ i +"].expired_time"));
			node.setSource(_ctx.stringValue("DescribeClusterNodesResponse.nodes["+ i +"].source"));
			node.setInstance_type_family(_ctx.stringValue("DescribeClusterNodesResponse.nodes["+ i +"].instance_type_family"));
			node.setInstance_id(_ctx.stringValue("DescribeClusterNodesResponse.nodes["+ i +"].instance_id"));
			node.setInstance_charge_type(_ctx.stringValue("DescribeClusterNodesResponse.nodes["+ i +"].instance_charge_type"));
			node.setInstance_role(_ctx.stringValue("DescribeClusterNodesResponse.nodes["+ i +"].instance_role"));
			node.setState(_ctx.stringValue("DescribeClusterNodesResponse.nodes["+ i +"].state"));
			node.setInstance_status(_ctx.stringValue("DescribeClusterNodesResponse.nodes["+ i +"].instance_status"));
			node.setImage_id(_ctx.stringValue("DescribeClusterNodesResponse.nodes["+ i +"].image_id"));
			node.setNodepool_id(_ctx.stringValue("DescribeClusterNodesResponse.nodes["+ i +"].nodepool_id"));
			node.setInstance_type(_ctx.stringValue("DescribeClusterNodesResponse.nodes["+ i +"].instance_type"));
			node.setHost_name(_ctx.stringValue("DescribeClusterNodesResponse.nodes["+ i +"].host_name"));

			List<String> ip_address = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeClusterNodesResponse.nodes["+ i +"].ip_address.Length"); j++) {
				ip_address.add(_ctx.stringValue("DescribeClusterNodesResponse.nodes["+ i +"].ip_address["+ j +"]"));
			}
			node.setIp_address(ip_address);

			nodes.add(node);
		}
		describeClusterNodesResponse.setNodes(nodes);
	 
	 	return describeClusterNodesResponse;
	}
}