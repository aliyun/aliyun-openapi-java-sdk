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

import com.aliyuncs.itag.model.v20210517.AddMemberOrGroupTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddMemberOrGroupTaskResponseUnmarshaller {

	public static AddMemberOrGroupTaskResponse unmarshall(AddMemberOrGroupTaskResponse addMemberOrGroupTaskResponse, UnmarshallerContext _ctx) {
		
		addMemberOrGroupTaskResponse.setRequestId(_ctx.stringValue("AddMemberOrGroupTaskResponse.RequestId"));
		addMemberOrGroupTaskResponse.setCode(_ctx.stringValue("AddMemberOrGroupTaskResponse.Code"));
		addMemberOrGroupTaskResponse.setErrInfo(_ctx.stringValue("AddMemberOrGroupTaskResponse.ErrInfo"));
		addMemberOrGroupTaskResponse.setMsg(_ctx.stringValue("AddMemberOrGroupTaskResponse.Msg"));
		addMemberOrGroupTaskResponse.setSucc(_ctx.booleanValue("AddMemberOrGroupTaskResponse.Succ"));
		addMemberOrGroupTaskResponse.setResult(_ctx.stringValue("AddMemberOrGroupTaskResponse.Result"));
		addMemberOrGroupTaskResponse.setErrorCode(_ctx.stringValue("AddMemberOrGroupTaskResponse.ErrorCode"));
	 
	 	return addMemberOrGroupTaskResponse;
	}
}