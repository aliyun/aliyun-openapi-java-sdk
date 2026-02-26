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

import com.aliyuncs.itag.model.v20210517.DeleteTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteTaskResponseUnmarshaller {

	public static DeleteTaskResponse unmarshall(DeleteTaskResponse deleteTaskResponse, UnmarshallerContext _ctx) {
		
		deleteTaskResponse.setRequestId(_ctx.stringValue("DeleteTaskResponse.RequestId"));
		deleteTaskResponse.setCode(_ctx.stringValue("DeleteTaskResponse.Code"));
		deleteTaskResponse.setErrInfo(_ctx.stringValue("DeleteTaskResponse.ErrInfo"));
		deleteTaskResponse.setMsg(_ctx.stringValue("DeleteTaskResponse.Msg"));
		deleteTaskResponse.setSucc(_ctx.booleanValue("DeleteTaskResponse.Succ"));
		deleteTaskResponse.setResult(_ctx.booleanValue("DeleteTaskResponse.Result"));
		deleteTaskResponse.setErrorCode(_ctx.stringValue("DeleteTaskResponse.ErrorCode"));
	 
	 	return deleteTaskResponse;
	}
}