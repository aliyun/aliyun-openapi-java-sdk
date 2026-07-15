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

package com.aliyuncs.schedulerx2.transform.v20190430;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.schedulerx2.model.v20190430.GetWorkFlowResponse;
import com.aliyuncs.schedulerx2.model.v20190430.GetWorkFlowResponse.Data;
import com.aliyuncs.schedulerx2.model.v20190430.GetWorkFlowResponse.Data.WorkFlowInfo;
import com.aliyuncs.schedulerx2.model.v20190430.GetWorkFlowResponse.Data.WorkFlowNodeInfo;
import com.aliyuncs.schedulerx2.model.v20190430.GetWorkFlowResponse.Data.WorkFlowNodeInfo.Edge;
import com.aliyuncs.schedulerx2.model.v20190430.GetWorkFlowResponse.Data.WorkFlowNodeInfo.Node;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetWorkFlowResponseUnmarshaller {

	public static GetWorkFlowResponse unmarshall(GetWorkFlowResponse getWorkFlowResponse, UnmarshallerContext _ctx) {
		
		getWorkFlowResponse.setRequestId(_ctx.stringValue("GetWorkFlowResponse.RequestId"));
		getWorkFlowResponse.setMessage(_ctx.stringValue("GetWorkFlowResponse.Message"));
		getWorkFlowResponse.setCode(_ctx.integerValue("GetWorkFlowResponse.Code"));
		getWorkFlowResponse.setSuccess(_ctx.booleanValue("GetWorkFlowResponse.Success"));

		Data data = new Data();

		WorkFlowNodeInfo workFlowNodeInfo = new WorkFlowNodeInfo();

		List<Edge> edges = new ArrayList<Edge>();
		for (int i = 0; i < _ctx.lengthValue("GetWorkFlowResponse.Data.WorkFlowNodeInfo.Edges.Length"); i++) {
			Edge edge = new Edge();
			edge.setTarget(_ctx.longValue("GetWorkFlowResponse.Data.WorkFlowNodeInfo.Edges["+ i +"].Target"));
			edge.setSource(_ctx.longValue("GetWorkFlowResponse.Data.WorkFlowNodeInfo.Edges["+ i +"].Source"));

			edges.add(edge);
		}
		workFlowNodeInfo.setEdges(edges);

		List<Node> nodes = new ArrayList<Node>();
		for (int i = 0; i < _ctx.lengthValue("GetWorkFlowResponse.Data.WorkFlowNodeInfo.Nodes.Length"); i++) {
			Node node = new Node();
			node.setStatus(_ctx.integerValue("GetWorkFlowResponse.Data.WorkFlowNodeInfo.Nodes["+ i +"].Status"));
			node.setLabel(_ctx.stringValue("GetWorkFlowResponse.Data.WorkFlowNodeInfo.Nodes["+ i +"].Label"));
			node.setId(_ctx.longValue("GetWorkFlowResponse.Data.WorkFlowNodeInfo.Nodes["+ i +"].Id"));

			nodes.add(node);
		}
		workFlowNodeInfo.setNodes(nodes);
		data.setWorkFlowNodeInfo(workFlowNodeInfo);

		WorkFlowInfo workFlowInfo = new WorkFlowInfo();
		workFlowInfo.setStatus(_ctx.stringValue("GetWorkFlowResponse.Data.WorkFlowInfo.Status"));
		workFlowInfo.setDescription(_ctx.stringValue("GetWorkFlowResponse.Data.WorkFlowInfo.Description"));
		workFlowInfo.setMaxConcurrency(_ctx.stringValue("GetWorkFlowResponse.Data.WorkFlowInfo.MaxConcurrency"));
		workFlowInfo.setTimeExpression(_ctx.stringValue("GetWorkFlowResponse.Data.WorkFlowInfo.TimeExpression"));
		workFlowInfo.setWorkflowId(_ctx.longValue("GetWorkFlowResponse.Data.WorkFlowInfo.WorkflowId"));
		workFlowInfo.setNamespace(_ctx.stringValue("GetWorkFlowResponse.Data.WorkFlowInfo.Namespace"));
		workFlowInfo.setName(_ctx.stringValue("GetWorkFlowResponse.Data.WorkFlowInfo.Name"));
		workFlowInfo.setTimeType(_ctx.stringValue("GetWorkFlowResponse.Data.WorkFlowInfo.TimeType"));
		workFlowInfo.setGroupId(_ctx.stringValue("GetWorkFlowResponse.Data.WorkFlowInfo.GroupId"));
		data.setWorkFlowInfo(workFlowInfo);
		getWorkFlowResponse.setData(data);
	 
	 	return getWorkFlowResponse;
	}
}