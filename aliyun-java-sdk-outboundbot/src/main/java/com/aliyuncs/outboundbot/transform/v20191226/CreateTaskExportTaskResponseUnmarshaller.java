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

import com.aliyuncs.outboundbot.model.v20191226.CreateTaskExportTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTaskExportTaskResponseUnmarshaller {

	public static CreateTaskExportTaskResponse unmarshall(CreateTaskExportTaskResponse createTaskExportTaskResponse, UnmarshallerContext _ctx) {
		
		createTaskExportTaskResponse.setRequestId(_ctx.stringValue("CreateTaskExportTaskResponse.RequestId"));
		createTaskExportTaskResponse.setHttpStatusCode(_ctx.integerValue("CreateTaskExportTaskResponse.HttpStatusCode"));
		createTaskExportTaskResponse.setSuccess(_ctx.booleanValue("CreateTaskExportTaskResponse.Success"));
		createTaskExportTaskResponse.setCode(_ctx.stringValue("CreateTaskExportTaskResponse.Code"));
		createTaskExportTaskResponse.setMessage(_ctx.stringValue("CreateTaskExportTaskResponse.Message"));
		createTaskExportTaskResponse.setTaskId(_ctx.stringValue("CreateTaskExportTaskResponse.TaskId"));
	 
	 	return createTaskExportTaskResponse;
	}
}