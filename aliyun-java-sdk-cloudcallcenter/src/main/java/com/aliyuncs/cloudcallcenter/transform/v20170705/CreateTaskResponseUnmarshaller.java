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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import com.aliyuncs.cloudcallcenter.model.v20170705.CreateTaskResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.CreateTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTaskResponseUnmarshaller {

	public static CreateTaskResponse unmarshall(CreateTaskResponse createTaskResponse, UnmarshallerContext context) {
		
		createTaskResponse.setRequestId(context.stringValue("CreateTaskResponse.RequestId"));
		createTaskResponse.setSuccess(context.booleanValue("CreateTaskResponse.Success"));
		createTaskResponse.setCode(context.stringValue("CreateTaskResponse.Code"));
		createTaskResponse.setMessage(context.stringValue("CreateTaskResponse.Message"));
		createTaskResponse.setHttpStatusCode(context.integerValue("CreateTaskResponse.HttpStatusCode"));

		Data data = new Data();
		data.setTaskId(context.longValue("CreateTaskResponse.Data.TaskId"));
		createTaskResponse.setData(data);
	 
	 	return createTaskResponse;
	}
}