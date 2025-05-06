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

package com.aliyuncs.itag.transform.v20210517;

import com.aliyuncs.itag.model.v20210517.UpdateTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateTaskResponseUnmarshaller {

	public static UpdateTaskResponse unmarshall(UpdateTaskResponse updateTaskResponse, UnmarshallerContext _ctx) {
		
		updateTaskResponse.setRequestId(_ctx.stringValue("UpdateTaskResponse.RequestId"));
		updateTaskResponse.setCode(_ctx.stringValue("UpdateTaskResponse.Code"));
		updateTaskResponse.setErrInfo(_ctx.stringValue("UpdateTaskResponse.ErrInfo"));
		updateTaskResponse.setMsg(_ctx.stringValue("UpdateTaskResponse.Msg"));
		updateTaskResponse.setSucc(_ctx.booleanValue("UpdateTaskResponse.Succ"));
		updateTaskResponse.setResult(_ctx.booleanValue("UpdateTaskResponse.Result"));
		updateTaskResponse.setErrorCode(_ctx.stringValue("UpdateTaskResponse.ErrorCode"));
	 
	 	return updateTaskResponse;
	}
}