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

import com.aliyuncs.itag.model.v20210517.AddUserResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddUserResponseUnmarshaller {

	public static AddUserResponse unmarshall(AddUserResponse addUserResponse, UnmarshallerContext _ctx) {
		
		addUserResponse.setRequestId(_ctx.stringValue("AddUserResponse.RequestId"));
		addUserResponse.setCode(_ctx.stringValue("AddUserResponse.Code"));
		addUserResponse.setErrInfo(_ctx.stringValue("AddUserResponse.ErrInfo"));
		addUserResponse.setMsg(_ctx.stringValue("AddUserResponse.Msg"));
		addUserResponse.setSucc(_ctx.booleanValue("AddUserResponse.Succ"));
		addUserResponse.setResult(_ctx.longValue("AddUserResponse.Result"));
		addUserResponse.setErrorCode(_ctx.stringValue("AddUserResponse.ErrorCode"));
	 
	 	return addUserResponse;
	}
}