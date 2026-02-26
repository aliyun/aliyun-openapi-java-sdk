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

import com.aliyuncs.itag.model.v20210517.RemoveMemberOrGroupTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveMemberOrGroupTaskResponseUnmarshaller {

	public static RemoveMemberOrGroupTaskResponse unmarshall(RemoveMemberOrGroupTaskResponse removeMemberOrGroupTaskResponse, UnmarshallerContext _ctx) {
		
		removeMemberOrGroupTaskResponse.setRequestId(_ctx.stringValue("RemoveMemberOrGroupTaskResponse.RequestId"));
		removeMemberOrGroupTaskResponse.setCode(_ctx.stringValue("RemoveMemberOrGroupTaskResponse.Code"));
		removeMemberOrGroupTaskResponse.setErrInfo(_ctx.stringValue("RemoveMemberOrGroupTaskResponse.ErrInfo"));
		removeMemberOrGroupTaskResponse.setMsg(_ctx.stringValue("RemoveMemberOrGroupTaskResponse.Msg"));
		removeMemberOrGroupTaskResponse.setSucc(_ctx.booleanValue("RemoveMemberOrGroupTaskResponse.Succ"));
		removeMemberOrGroupTaskResponse.setResult(_ctx.stringValue("RemoveMemberOrGroupTaskResponse.Result"));
		removeMemberOrGroupTaskResponse.setErrorCode(_ctx.stringValue("RemoveMemberOrGroupTaskResponse.ErrorCode"));
	 
	 	return removeMemberOrGroupTaskResponse;
	}
}