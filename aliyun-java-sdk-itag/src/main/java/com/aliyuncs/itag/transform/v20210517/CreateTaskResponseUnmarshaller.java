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

package com.aliyuncs.itag.transform.v20210517;

import com.aliyuncs.itag.model.v20210517.CreateTaskResponse;
import com.aliyuncs.itag.model.v20210517.CreateTaskResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTaskResponseUnmarshaller {

	public static CreateTaskResponse unmarshall(CreateTaskResponse createTaskResponse, UnmarshallerContext _ctx) {
		
		createTaskResponse.setRequestId(_ctx.stringValue("CreateTaskResponse.RequestId"));
		createTaskResponse.setCode(_ctx.integerValue("CreateTaskResponse.Code"));
		createTaskResponse.setMsg(_ctx.stringValue("CreateTaskResponse.Msg"));
		createTaskResponse.setErrInfo(_ctx.stringValue("CreateTaskResponse.ErrInfo"));
		createTaskResponse.setSucc(_ctx.booleanValue("CreateTaskResponse.Succ"));
		createTaskResponse.setErrorCode(_ctx.stringValue("CreateTaskResponse.ErrorCode"));

		Result result = new Result();
		result.setTaskId(_ctx.stringValue("CreateTaskResponse.Result.TaskId"));
		result.setFlowRunId(_ctx.stringValue("CreateTaskResponse.Result.FlowRunId"));
		result.setMsgId(_ctx.stringValue("CreateTaskResponse.Result.MsgId"));
		result.setSlaveMsgId(_ctx.stringValue("CreateTaskResponse.Result.SlaveMsgId"));
		result.setRefTaskId(_ctx.stringValue("CreateTaskResponse.Result.RefTaskId"));
		result.setWorkflowId(_ctx.stringValue("CreateTaskResponse.Result.WorkflowId"));
		createTaskResponse.setResult(result);
	 
	 	return createTaskResponse;
	}
}