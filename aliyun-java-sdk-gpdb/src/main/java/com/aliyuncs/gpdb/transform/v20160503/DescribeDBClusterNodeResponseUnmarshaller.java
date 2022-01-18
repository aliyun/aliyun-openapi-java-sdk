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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.DescribeDBClusterNodeResponse;
import com.aliyuncs.gpdb.model.v20160503.DescribeDBClusterNodeResponse.Node;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClusterNodeResponseUnmarshaller {

	public static DescribeDBClusterNodeResponse unmarshall(DescribeDBClusterNodeResponse describeDBClusterNodeResponse, UnmarshallerContext _ctx) {
		
		describeDBClusterNodeResponse.setRequestId(_ctx.stringValue("DescribeDBClusterNodeResponse.RequestId"));
		describeDBClusterNodeResponse.setDBClusterId(_ctx.stringValue("DescribeDBClusterNodeResponse.DBClusterId"));

		List<Node> nodes = new ArrayList<Node>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClusterNodeResponse.Nodes.Length"); i++) {
			Node node = new Node();
			node.setName(_ctx.stringValue("DescribeDBClusterNodeResponse.Nodes["+ i +"].Name"));

			nodes.add(node);
		}
		describeDBClusterNodeResponse.setNodes(nodes);
	 
	 	return describeDBClusterNodeResponse;
	}
}