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

import com.aliyuncs.retailir.model.v20190906.GetTaskResponse;
import com.aliyuncs.retailir.model.v20190906.GetTaskResponse.Task;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTaskResponseUnmarshaller {

	public static GetTaskResponse unmarshall(GetTaskResponse getTaskResponse, UnmarshallerContext _ctx) {
		
		getTaskResponse.setRequestId(_ctx.stringValue("GetTaskResponse.RequestId"));
		getTaskResponse.setResultCode(_ctx.stringValue("GetTaskResponse.ResultCode"));
		getTaskResponse.setResultMessage(_ctx.stringValue("GetTaskResponse.ResultMessage"));

		Task task = new Task();
		task.setJobId(_ctx.stringValue("GetTaskResponse.Task.JobId"));
		task.setStatus(_ctx.stringValue("GetTaskResponse.Task.Status"));
		task.setStatusCode(_ctx.stringValue("GetTaskResponse.Task.StatusCode"));
		task.setStatusMessage(_ctx.stringValue("GetTaskResponse.Task.StatusMessage"));
		task.setRequest(_ctx.stringValue("GetTaskResponse.Task.Request"));
		task.setResponse(_ctx.stringValue("GetTaskResponse.Task.Response"));
		task.setProgress(_ctx.integerValue("GetTaskResponse.Task.Progress"));
		task.setNamespace(_ctx.stringValue("GetTaskResponse.Task.Namespace"));
		task.setCreateTime(_ctx.longValue("GetTaskResponse.Task.CreateTime"));
		task.setLastUpdateTime(_ctx.longValue("GetTaskResponse.Task.LastUpdateTime"));
		task.setVersion(_ctx.integerValue("GetTaskResponse.Task.Version"));
		task.setAppkey(_ctx.stringValue("GetTaskResponse.Task.Appkey"));
		task.setUserId(_ctx.stringValue("GetTaskResponse.Task.UserId"));
		getTaskResponse.setTask(task);
	 
	 	return getTaskResponse;
	}
}