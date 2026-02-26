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

import com.aliyuncs.dms_enterprise.model.v20181101.ListTasksInTaskFlowResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListTasksInTaskFlowResponse.Task;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTasksInTaskFlowResponseUnmarshaller {

	public static ListTasksInTaskFlowResponse unmarshall(ListTasksInTaskFlowResponse listTasksInTaskFlowResponse, UnmarshallerContext _ctx) {
		
		listTasksInTaskFlowResponse.setRequestId(_ctx.stringValue("ListTasksInTaskFlowResponse.RequestId"));
		listTasksInTaskFlowResponse.setErrorCode(_ctx.stringValue("ListTasksInTaskFlowResponse.ErrorCode"));
		listTasksInTaskFlowResponse.setErrorMessage(_ctx.stringValue("ListTasksInTaskFlowResponse.ErrorMessage"));
		listTasksInTaskFlowResponse.setSuccess(_ctx.booleanValue("ListTasksInTaskFlowResponse.Success"));

		List<Task> tasks = new ArrayList<Task>();
		for (int i = 0; i < _ctx.lengthValue("ListTasksInTaskFlowResponse.Tasks.Length"); i++) {
			Task task = new Task();
			task.setNodeName(_ctx.stringValue("ListTasksInTaskFlowResponse.Tasks["+ i +"].NodeName"));
			task.setNodeType(_ctx.stringValue("ListTasksInTaskFlowResponse.Tasks["+ i +"].NodeType"));
			task.setNodeContent(_ctx.stringValue("ListTasksInTaskFlowResponse.Tasks["+ i +"].NodeContent"));
			task.setTimeVariables(_ctx.stringValue("ListTasksInTaskFlowResponse.Tasks["+ i +"].TimeVariables"));
			task.setNodeConfig(_ctx.stringValue("ListTasksInTaskFlowResponse.Tasks["+ i +"].NodeConfig"));
			task.setNodeOutput(_ctx.stringValue("ListTasksInTaskFlowResponse.Tasks["+ i +"].NodeOutput"));
			task.setGraphParam(_ctx.stringValue("ListTasksInTaskFlowResponse.Tasks["+ i +"].GraphParam"));
			task.setNodeId(_ctx.stringValue("ListTasksInTaskFlowResponse.Tasks["+ i +"].NodeId"));

			tasks.add(task);
		}
		listTasksInTaskFlowResponse.setTasks(tasks);
	 
	 	return listTasksInTaskFlowResponse;
	}
}