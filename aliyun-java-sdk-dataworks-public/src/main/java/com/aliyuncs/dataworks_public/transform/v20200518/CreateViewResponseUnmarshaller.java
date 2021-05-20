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

import com.aliyuncs.dataworks_public.model.v20200518.CreateViewResponse;
import com.aliyuncs.dataworks_public.model.v20200518.CreateViewResponse.TaskInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateViewResponseUnmarshaller {

	public static CreateViewResponse unmarshall(CreateViewResponse createViewResponse, UnmarshallerContext _ctx) {
		
		createViewResponse.setRequestId(_ctx.stringValue("CreateViewResponse.RequestId"));

		TaskInfo taskInfo = new TaskInfo();
		taskInfo.setTaskId(_ctx.stringValue("CreateViewResponse.TaskInfo.TaskId"));
		taskInfo.setContent(_ctx.stringValue("CreateViewResponse.TaskInfo.Content"));
		taskInfo.setStatus(_ctx.stringValue("CreateViewResponse.TaskInfo.Status"));
		taskInfo.setNextTaskId(_ctx.stringValue("CreateViewResponse.TaskInfo.NextTaskId"));
		createViewResponse.setTaskInfo(taskInfo);
	 
	 	return createViewResponse;
	}
}