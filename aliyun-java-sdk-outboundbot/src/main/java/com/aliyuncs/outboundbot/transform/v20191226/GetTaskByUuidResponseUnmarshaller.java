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

package com.aliyuncs.outboundbot.transform.v20191226;

import com.aliyuncs.outboundbot.model.v20191226.GetTaskByUuidResponse;
import com.aliyuncs.outboundbot.model.v20191226.GetTaskByUuidResponse.Task;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTaskByUuidResponseUnmarshaller {

	public static GetTaskByUuidResponse unmarshall(GetTaskByUuidResponse getTaskByUuidResponse, UnmarshallerContext _ctx) {
		
		getTaskByUuidResponse.setRequestId(_ctx.stringValue("GetTaskByUuidResponse.RequestId"));

		Task task = new Task();
		task.setId(_ctx.stringValue("GetTaskByUuidResponse.Task.Id"));
		task.setJobId(_ctx.stringValue("GetTaskByUuidResponse.Task.JobId"));
		task.setPlannedTime(_ctx.longValue("GetTaskByUuidResponse.Task.PlannedTime"));
		task.setActualTime(_ctx.longValue("GetTaskByUuidResponse.Task.ActualTime"));
		task.setEndTime(_ctx.longValue("GetTaskByUuidResponse.Task.EndTime"));
		task.setCallingNumber(_ctx.stringValue("GetTaskByUuidResponse.Task.CallingNumber"));
		task.setCalledNumber(_ctx.stringValue("GetTaskByUuidResponse.Task.CalledNumber"));
		task.setCallId(_ctx.stringValue("GetTaskByUuidResponse.Task.CallId"));
		task.setEndReason(_ctx.integerValue("GetTaskByUuidResponse.Task.EndReason"));
		task.setInstanceId(_ctx.stringValue("GetTaskByUuidResponse.Task.InstanceId"));
		task.setJobGroupId(_ctx.stringValue("GetTaskByUuidResponse.Task.JobGroupId"));
		getTaskByUuidResponse.setTask(task);
	 
	 	return getTaskByUuidResponse;
	}
}