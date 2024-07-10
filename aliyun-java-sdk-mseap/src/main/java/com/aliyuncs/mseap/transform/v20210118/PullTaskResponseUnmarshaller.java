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

package com.aliyuncs.mseap.transform.v20210118;

import com.aliyuncs.mseap.model.v20210118.PullTaskResponse;
import com.aliyuncs.mseap.model.v20210118.PullTaskResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class PullTaskResponseUnmarshaller {

	public static PullTaskResponse unmarshall(PullTaskResponse pullTaskResponse, UnmarshallerContext _ctx) {
		
		pullTaskResponse.setRequestId(_ctx.stringValue("PullTaskResponse.RequestId"));
		pullTaskResponse.setAllowRetry(_ctx.booleanValue("PullTaskResponse.AllowRetry"));
		pullTaskResponse.setErrorMsg(_ctx.stringValue("PullTaskResponse.ErrorMsg"));
		pullTaskResponse.setHttpStatusCode(_ctx.integerValue("PullTaskResponse.HttpStatusCode"));
		pullTaskResponse.setDynamicCode(_ctx.stringValue("PullTaskResponse.DynamicCode"));
		pullTaskResponse.setErrorCode(_ctx.stringValue("PullTaskResponse.ErrorCode"));
		pullTaskResponse.setDynamicMessage(_ctx.stringValue("PullTaskResponse.DynamicMessage"));
		pullTaskResponse.setSuccess(_ctx.booleanValue("PullTaskResponse.Success"));
		pullTaskResponse.setAppName(_ctx.stringValue("PullTaskResponse.AppName"));

		Module module = new Module();
		module.setTaskId(_ctx.stringValue("PullTaskResponse.Module.TaskId"));
		module.setOutTaskId(_ctx.stringValue("PullTaskResponse.Module.OutTaskId"));
		module.setTaskType(_ctx.stringValue("PullTaskResponse.Module.TaskType"));
		module.setTaskData(_ctx.stringValue("PullTaskResponse.Module.TaskData"));
		module.setOrderId(_ctx.stringValue("PullTaskResponse.Module.OrderId"));
		module.setBizCode(_ctx.stringValue("PullTaskResponse.Module.BizCode"));
		module.setPrincipalKey(_ctx.stringValue("PullTaskResponse.Module.PrincipalKey"));
		pullTaskResponse.setModule(module);
	 
	 	return pullTaskResponse;
	}
}