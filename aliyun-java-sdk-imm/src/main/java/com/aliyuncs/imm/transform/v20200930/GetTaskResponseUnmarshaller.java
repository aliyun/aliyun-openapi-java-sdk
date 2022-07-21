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

package com.aliyuncs.imm.transform.v20200930;

import com.aliyuncs.imm.model.v20200930.GetTaskResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTaskResponseUnmarshaller {

	public static GetTaskResponse unmarshall(GetTaskResponse getTaskResponse, UnmarshallerContext _ctx) {
		
		getTaskResponse.setRequestId(_ctx.stringValue("GetTaskResponse.RequestId"));
		getTaskResponse.setProjectName(_ctx.stringValue("GetTaskResponse.ProjectName"));
		getTaskResponse.setEventId(_ctx.stringValue("GetTaskResponse.EventId"));
		getTaskResponse.setStatus(_ctx.stringValue("GetTaskResponse.Status"));
		getTaskResponse.setCode(_ctx.stringValue("GetTaskResponse.Code"));
		getTaskResponse.setMessage(_ctx.stringValue("GetTaskResponse.Message"));
		getTaskResponse.setStartTime(_ctx.stringValue("GetTaskResponse.StartTime"));
		getTaskResponse.setEndTime(_ctx.stringValue("GetTaskResponse.EndTime"));
		getTaskResponse.setUserData(_ctx.stringValue("GetTaskResponse.UserData"));
		getTaskResponse.setTaskType(_ctx.stringValue("GetTaskResponse.TaskType"));
		getTaskResponse.setTaskId(_ctx.stringValue("GetTaskResponse.TaskId"));
		getTaskResponse.setTags(_ctx.mapValue("GetTaskResponse.Tags"));
	 
	 	return getTaskResponse;
	}
}