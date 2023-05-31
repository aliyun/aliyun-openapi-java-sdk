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

import com.aliyuncs.openitag.model.v20220616.UpdateTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateTaskResponseUnmarshaller {

	public static UpdateTaskResponse unmarshall(UpdateTaskResponse updateTaskResponse, UnmarshallerContext _ctx) {
		
		updateTaskResponse.setRequestId(_ctx.stringValue("UpdateTaskResponse.RequestId"));
		updateTaskResponse.setCode(_ctx.integerValue("UpdateTaskResponse.Code"));
		updateTaskResponse.setMessage(_ctx.stringValue("UpdateTaskResponse.Message"));
		updateTaskResponse.setDetails(_ctx.stringValue("UpdateTaskResponse.Details"));
		updateTaskResponse.setSuccess(_ctx.booleanValue("UpdateTaskResponse.Success"));
		updateTaskResponse.setErrorCode(_ctx.stringValue("UpdateTaskResponse.ErrorCode"));
	 
	 	return updateTaskResponse;
	}
}