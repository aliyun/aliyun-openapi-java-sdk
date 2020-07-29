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

package com.aliyuncs.dbs.transform.v20190306;

import com.aliyuncs.dbs.model.v20190306.CreateGetDBListFromAgentTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateGetDBListFromAgentTaskResponseUnmarshaller {

	public static CreateGetDBListFromAgentTaskResponse unmarshall(CreateGetDBListFromAgentTaskResponse createGetDBListFromAgentTaskResponse, UnmarshallerContext _ctx) {
		
		createGetDBListFromAgentTaskResponse.setRequestId(_ctx.stringValue("CreateGetDBListFromAgentTaskResponse.RequestId"));
		createGetDBListFromAgentTaskResponse.setSuccess(_ctx.booleanValue("CreateGetDBListFromAgentTaskResponse.Success"));
		createGetDBListFromAgentTaskResponse.setErrCode(_ctx.stringValue("CreateGetDBListFromAgentTaskResponse.ErrCode"));
		createGetDBListFromAgentTaskResponse.setErrMessage(_ctx.stringValue("CreateGetDBListFromAgentTaskResponse.ErrMessage"));
		createGetDBListFromAgentTaskResponse.setHttpStatusCode(_ctx.integerValue("CreateGetDBListFromAgentTaskResponse.HttpStatusCode"));
		createGetDBListFromAgentTaskResponse.setTaskId(_ctx.longValue("CreateGetDBListFromAgentTaskResponse.TaskId"));
	 
	 	return createGetDBListFromAgentTaskResponse;
	}
}