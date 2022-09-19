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

import com.aliyuncs.dms_enterprise.model.v20181101.GetTaskResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetTaskResponse.Task;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTaskResponseUnmarshaller {

	public static GetTaskResponse unmarshall(GetTaskResponse getTaskResponse, UnmarshallerContext _ctx) {
		
		getTaskResponse.setRequestId(_ctx.stringValue("GetTaskResponse.RequestId"));
		getTaskResponse.setErrorCode(_ctx.stringValue("GetTaskResponse.ErrorCode"));
		getTaskResponse.setErrorMessage(_ctx.stringValue("GetTaskResponse.ErrorMessage"));
		getTaskResponse.setSuccess(_ctx.booleanValue("GetTaskResponse.Success"));

		Task task = new Task();
		task.setDagId(_ctx.longValue("GetTaskResponse.Task.DagId"));
		task.setNodeName(_ctx.stringValue("GetTaskResponse.Task.NodeName"));
		task.setNodeType(_ctx.stringValue("GetTaskResponse.Task.NodeType"));
		task.setNodeContent(_ctx.stringValue("GetTaskResponse.Task.NodeContent"));
		task.setTimeVariables(_ctx.stringValue("GetTaskResponse.Task.TimeVariables"));
		task.setNodeConfig(_ctx.stringValue("GetTaskResponse.Task.NodeConfig"));
		task.setNodeOutput(_ctx.stringValue("GetTaskResponse.Task.NodeOutput"));
		task.setGraphParam(_ctx.stringValue("GetTaskResponse.Task.GraphParam"));
		getTaskResponse.setTask(task);
	 
	 	return getTaskResponse;
	}
}