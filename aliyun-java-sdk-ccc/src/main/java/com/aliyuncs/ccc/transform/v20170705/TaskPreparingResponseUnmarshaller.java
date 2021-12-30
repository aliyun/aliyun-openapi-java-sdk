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

package com.aliyuncs.ccc.transform.v20170705;

import com.aliyuncs.ccc.model.v20170705.TaskPreparingResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class TaskPreparingResponseUnmarshaller {

	public static TaskPreparingResponse unmarshall(TaskPreparingResponse taskPreparingResponse, UnmarshallerContext _ctx) {
		
		taskPreparingResponse.setRequestId(_ctx.stringValue("TaskPreparingResponse.RequestId"));
		taskPreparingResponse.setSuccess(_ctx.booleanValue("TaskPreparingResponse.Success"));
		taskPreparingResponse.setCode(_ctx.stringValue("TaskPreparingResponse.Code"));
		taskPreparingResponse.setMessage(_ctx.stringValue("TaskPreparingResponse.Message"));
		taskPreparingResponse.setHttpStatusCode(_ctx.integerValue("TaskPreparingResponse.HttpStatusCode"));
		taskPreparingResponse.setTaskId(_ctx.stringValue("TaskPreparingResponse.TaskId"));
	 
	 	return taskPreparingResponse;
	}
}