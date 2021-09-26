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

package com.aliyuncs.dataworks_public.transform.v20200518;

import com.aliyuncs.dataworks_public.model.v20200518.UpdateTableResponse;
import com.aliyuncs.dataworks_public.model.v20200518.UpdateTableResponse.TaskInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateTableResponseUnmarshaller {

	public static UpdateTableResponse unmarshall(UpdateTableResponse updateTableResponse, UnmarshallerContext _ctx) {
		
		updateTableResponse.setRequestId(_ctx.stringValue("UpdateTableResponse.RequestId"));

		TaskInfo taskInfo = new TaskInfo();
		taskInfo.setStatus(_ctx.stringValue("UpdateTableResponse.TaskInfo.Status"));
		taskInfo.setNextTaskId(_ctx.stringValue("UpdateTableResponse.TaskInfo.NextTaskId"));
		taskInfo.setTaskId(_ctx.stringValue("UpdateTableResponse.TaskInfo.TaskId"));
		taskInfo.setContent(_ctx.stringValue("UpdateTableResponse.TaskInfo.Content"));
		updateTableResponse.setTaskInfo(taskInfo);
	 
	 	return updateTableResponse;
	}
}