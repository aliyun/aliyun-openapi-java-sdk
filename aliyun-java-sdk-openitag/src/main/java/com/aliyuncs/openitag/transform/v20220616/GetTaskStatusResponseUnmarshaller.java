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

package com.aliyuncs.openitag.transform.v20220616;

import com.aliyuncs.openitag.model.v20220616.GetTaskStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTaskStatusResponseUnmarshaller {

	public static GetTaskStatusResponse unmarshall(GetTaskStatusResponse getTaskStatusResponse, UnmarshallerContext _ctx) {
		
		getTaskStatusResponse.setRequestId(_ctx.stringValue("GetTaskStatusResponse.RequestId"));
		getTaskStatusResponse.setCode(_ctx.integerValue("GetTaskStatusResponse.Code"));
		getTaskStatusResponse.setMessage(_ctx.stringValue("GetTaskStatusResponse.Message"));
		getTaskStatusResponse.setDetails(_ctx.stringValue("GetTaskStatusResponse.Details"));
		getTaskStatusResponse.setSuccess(_ctx.booleanValue("GetTaskStatusResponse.Success"));
		getTaskStatusResponse.setTaskStatus(_ctx.stringValue("GetTaskStatusResponse.TaskStatus"));
		getTaskStatusResponse.setErrorCode(_ctx.stringValue("GetTaskStatusResponse.ErrorCode"));
	 
	 	return getTaskStatusResponse;
	}
}