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

package com.aliyuncs.retailir.transform.v20190906;

import com.aliyuncs.retailir.model.v20190906.CreateTaskResponse;
import com.aliyuncs.retailir.model.v20190906.CreateTaskResponse.Task;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTaskResponseUnmarshaller {

	public static CreateTaskResponse unmarshall(CreateTaskResponse createTaskResponse, UnmarshallerContext _ctx) {
		
		createTaskResponse.setRequestId(_ctx.stringValue("CreateTaskResponse.RequestId"));
		createTaskResponse.setResultCode(_ctx.integerValue("CreateTaskResponse.ResultCode"));
		createTaskResponse.setResultMessage(_ctx.stringValue("CreateTaskResponse.ResultMessage"));

		Task task = new Task();
		task.setAppkey(_ctx.stringValue("CreateTaskResponse.Task.Appkey"));
		task.setUserId(_ctx.stringValue("CreateTaskResponse.Task.UserId"));
		task.setJobId(_ctx.stringValue("CreateTaskResponse.Task.JobId"));
		task.setStatus(_ctx.stringValue("CreateTaskResponse.Task.Status"));
		task.setRequest(_ctx.stringValue("CreateTaskResponse.Task.Request"));
		task.setProgress(_ctx.integerValue("CreateTaskResponse.Task.Progress"));
		task.setNamespace(_ctx.stringValue("CreateTaskResponse.Task.Namespace"));
		task.setVersion(_ctx.stringValue("CreateTaskResponse.Task.Version"));
		createTaskResponse.setTask(task);
	 
	 	return createTaskResponse;
	}
}