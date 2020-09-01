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

package com.aliyuncs.drds.transform.v20190123;

import com.aliyuncs.drds.model.v20190123.RemoveDataExportTaskResponse;
import com.aliyuncs.drds.model.v20190123.RemoveDataExportTaskResponse.TaskManageResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveDataExportTaskResponseUnmarshaller {

	public static RemoveDataExportTaskResponse unmarshall(RemoveDataExportTaskResponse removeDataExportTaskResponse, UnmarshallerContext _ctx) {
		
		removeDataExportTaskResponse.setRequestId(_ctx.stringValue("RemoveDataExportTaskResponse.RequestId"));
		removeDataExportTaskResponse.setSuccess(_ctx.booleanValue("RemoveDataExportTaskResponse.Success"));

		TaskManageResult taskManageResult = new TaskManageResult();
		taskManageResult.setSuccess(_ctx.booleanValue("RemoveDataExportTaskResponse.TaskManageResult.Success"));
		taskManageResult.setMessage(_ctx.stringValue("RemoveDataExportTaskResponse.TaskManageResult.Message"));
		removeDataExportTaskResponse.setTaskManageResult(taskManageResult);
	 
	 	return removeDataExportTaskResponse;
	}
}