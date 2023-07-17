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

import com.aliyuncs.schedulerx2.model.v20190430.GetWorkflowInstanceResponse;
import com.aliyuncs.schedulerx2.model.v20190430.GetWorkflowInstanceResponse.Data;
import com.aliyuncs.schedulerx2.model.v20190430.GetWorkflowInstanceResponse.Data.WfInstanceDag;
import com.aliyuncs.schedulerx2.model.v20190430.GetWorkflowInstanceResponse.Data.WfInstanceDag.Edge;
import com.aliyuncs.schedulerx2.model.v20190430.GetWorkflowInstanceResponse.Data.WfInstanceDag.Node;
import com.aliyuncs.schedulerx2.model.v20190430.GetWorkflowInstanceResponse.Data.WfInstanceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetWorkflowInstanceResponseUnmarshaller {

	public static GetWorkflowInstanceResponse unmarshall(GetWorkflowInstanceResponse getWorkflowInstanceResponse, UnmarshallerContext _ctx) {
		
		getWorkflowInstanceResponse.setRequestId(_ctx.stringValue("GetWorkflowInstanceResponse.RequestId"));
		getWorkflowInstanceResponse.setCode(_ctx.integerValue("GetWorkflowInstanceResponse.Code"));
		getWorkflowInstanceResponse.setSuccess(_ctx.booleanValue("GetWorkflowInstanceResponse.Success"));
		getWorkflowInstanceResponse.setMessage(_ctx.stringValue("GetWorkflowInstanceResponse.Message"));

		Data data = new Data();

		WfInstanceInfo wfInstanceInfo = new WfInstanceInfo();
		wfInstanceInfo.setStatus(_ctx.integerValue("GetWorkflowInstanceResponse.Data.WfInstanceInfo.Status"));
		wfInstanceInfo.setStartTime(_ctx.stringValue("GetWorkflowInstanceResponse.Data.WfInstanceInfo.StartTime"));
		wfInstanceInfo.setEndTime(_ctx.stringValue("GetWorkflowInstanceResponse.Data.WfInstanceInfo.EndTime"));
		wfInstanceInfo.setScheduleTime(_ctx.stringValue("GetWorkflowInstanceResponse.Data.WfInstanceInfo.ScheduleTime"));
		wfInstanceInfo.setDataTime(_ctx.stringValue("GetWorkflowInstanceResponse.Data.WfInstanceInfo.DataTime"));
		data.setWfInstanceInfo(wfInstanceInfo);

		WfInstanceDag wfInstanceDag = new WfInstanceDag();

		List<Node> nodes = new ArrayList<Node>();
		for (int i = 0; i < _ctx.lengthValue("GetWorkflowInstanceResponse.Data.WfInstanceDag.Nodes.Length"); i++) {
			Node node = new Node();
			node.setJobInstanceId(_ctx.longValue("GetWorkflowInstanceResponse.Data.WfInstanceDag.Nodes["+ i +"].JobInstanceId"));
			node.setJobId(_ctx.longValue("GetWorkflowInstanceResponse.Data.WfInstanceDag.Nodes["+ i +"].JobId"));
			node.setStartTime(_ctx.stringValue("GetWorkflowInstanceResponse.Data.WfInstanceDag.Nodes["+ i +"].StartTime"));
			node.setEndTime(_ctx.stringValue("GetWorkflowInstanceResponse.Data.WfInstanceDag.Nodes["+ i +"].EndTime"));
			node.setScheduleTime(_ctx.stringValue("GetWorkflowInstanceResponse.Data.WfInstanceDag.Nodes["+ i +"].ScheduleTime"));
			node.setDataTime(_ctx.stringValue("GetWorkflowInstanceResponse.Data.WfInstanceDag.Nodes["+ i +"].DataTime"));
			node.setWorkAddr(_ctx.stringValue("GetWorkflowInstanceResponse.Data.WfInstanceDag.Nodes["+ i +"].WorkAddr"));
			node.setResult(_ctx.stringValue("GetWorkflowInstanceResponse.Data.WfInstanceDag.Nodes["+ i +"].Result"));
			node.setAttempt(_ctx.integerValue("GetWorkflowInstanceResponse.Data.WfInstanceDag.Nodes["+ i +"].Attempt"));
			node.setStatus(_ctx.integerValue("GetWorkflowInstanceResponse.Data.WfInstanceDag.Nodes["+ i +"].Status"));

			nodes.add(node);
		}
		wfInstanceDag.setNodes(nodes);

		List<Edge> edges = new ArrayList<Edge>();
		for (int i = 0; i < _ctx.lengthValue("GetWorkflowInstanceResponse.Data.WfInstanceDag.Edges.Length"); i++) {
			Edge edge = new Edge();
			edge.setSource(_ctx.longValue("GetWorkflowInstanceResponse.Data.WfInstanceDag.Edges["+ i +"].Source"));
			edge.setTarget(_ctx.longValue("GetWorkflowInstanceResponse.Data.WfInstanceDag.Edges["+ i +"].Target"));

			edges.add(edge);
		}
		wfInstanceDag.setEdges(edges);
		data.setWfInstanceDag(wfInstanceDag);
		getWorkflowInstanceResponse.setData(data);
	 
	 	return getWorkflowInstanceResponse;
	}
}