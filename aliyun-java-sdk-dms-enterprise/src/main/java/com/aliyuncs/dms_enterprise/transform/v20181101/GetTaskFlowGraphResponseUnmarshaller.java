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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.GetTaskFlowGraphResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetTaskFlowGraphResponse.TaskFlowGraph;
import com.aliyuncs.dms_enterprise.model.v20181101.GetTaskFlowGraphResponse.TaskFlowGraph.Edge;
import com.aliyuncs.dms_enterprise.model.v20181101.GetTaskFlowGraphResponse.TaskFlowGraph.Node;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTaskFlowGraphResponseUnmarshaller {

	public static GetTaskFlowGraphResponse unmarshall(GetTaskFlowGraphResponse getTaskFlowGraphResponse, UnmarshallerContext _ctx) {
		
		getTaskFlowGraphResponse.setRequestId(_ctx.stringValue("GetTaskFlowGraphResponse.RequestId"));
		getTaskFlowGraphResponse.setErrorCode(_ctx.stringValue("GetTaskFlowGraphResponse.ErrorCode"));
		getTaskFlowGraphResponse.setErrorMessage(_ctx.stringValue("GetTaskFlowGraphResponse.ErrorMessage"));
		getTaskFlowGraphResponse.setSuccess(_ctx.booleanValue("GetTaskFlowGraphResponse.Success"));

		TaskFlowGraph taskFlowGraph = new TaskFlowGraph();
		taskFlowGraph.setDagName(_ctx.stringValue("GetTaskFlowGraphResponse.TaskFlowGraph.DagName"));
		taskFlowGraph.setStatus(_ctx.longValue("GetTaskFlowGraphResponse.TaskFlowGraph.Status"));
		taskFlowGraph.setCanEdit(_ctx.booleanValue("GetTaskFlowGraphResponse.TaskFlowGraph.CanEdit"));

		List<Node> nodes = new ArrayList<Node>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskFlowGraphResponse.TaskFlowGraph.Nodes.Length"); i++) {
			Node node = new Node();
			node.setDagId(_ctx.longValue("GetTaskFlowGraphResponse.TaskFlowGraph.Nodes["+ i +"].DagId"));
			node.setNodeId(_ctx.longValue("GetTaskFlowGraphResponse.TaskFlowGraph.Nodes["+ i +"].NodeId"));
			node.setNodeName(_ctx.stringValue("GetTaskFlowGraphResponse.TaskFlowGraph.Nodes["+ i +"].NodeName"));
			node.setNodeType(_ctx.longValue("GetTaskFlowGraphResponse.TaskFlowGraph.Nodes["+ i +"].NodeType"));
			node.setNodeContent(_ctx.stringValue("GetTaskFlowGraphResponse.TaskFlowGraph.Nodes["+ i +"].NodeContent"));
			node.setTimeVariables(_ctx.stringValue("GetTaskFlowGraphResponse.TaskFlowGraph.Nodes["+ i +"].TimeVariables"));
			node.setNodeConfig(_ctx.stringValue("GetTaskFlowGraphResponse.TaskFlowGraph.Nodes["+ i +"].NodeConfig"));
			node.setGraphParam(_ctx.stringValue("GetTaskFlowGraphResponse.TaskFlowGraph.Nodes["+ i +"].GraphParam"));

			nodes.add(node);
		}
		taskFlowGraph.setNodes(nodes);

		List<Edge> edges = new ArrayList<Edge>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskFlowGraphResponse.TaskFlowGraph.Edges.Length"); i++) {
			Edge edge = new Edge();
			edge.setDagId(_ctx.longValue("GetTaskFlowGraphResponse.TaskFlowGraph.Edges["+ i +"].DagId"));
			edge.setId(_ctx.longValue("GetTaskFlowGraphResponse.TaskFlowGraph.Edges["+ i +"].Id"));
			edge.setNodeEnd(_ctx.longValue("GetTaskFlowGraphResponse.TaskFlowGraph.Edges["+ i +"].NodeEnd"));
			edge.setNodeFrom(_ctx.longValue("GetTaskFlowGraphResponse.TaskFlowGraph.Edges["+ i +"].NodeFrom"));

			edges.add(edge);
		}
		taskFlowGraph.setEdges(edges);
		getTaskFlowGraphResponse.setTaskFlowGraph(taskFlowGraph);
	 
	 	return getTaskFlowGraphResponse;
	}
}