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

import com.aliyuncs.itag.model.v20210517.UpdateUserNameResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateUserNameResponseUnmarshaller {

	public static UpdateUserNameResponse unmarshall(UpdateUserNameResponse updateUserNameResponse, UnmarshallerContext _ctx) {
		
		updateUserNameResponse.setRequestId(_ctx.stringValue("UpdateUserNameResponse.RequestId"));
		updateUserNameResponse.setCode(_ctx.integerValue("UpdateUserNameResponse.Code"));
		updateUserNameResponse.setMsg(_ctx.stringValue("UpdateUserNameResponse.Msg"));
		updateUserNameResponse.setErrInfo(_ctx.stringValue("UpdateUserNameResponse.ErrInfo"));
		updateUserNameResponse.setSucc(_ctx.booleanValue("UpdateUserNameResponse.Succ"));
		updateUserNameResponse.setResult(_ctx.booleanValue("UpdateUserNameResponse.Result"));
		updateUserNameResponse.setRt(_ctx.longValue("UpdateUserNameResponse.Rt"));
		updateUserNameResponse.setHost(_ctx.stringValue("UpdateUserNameResponse.Host"));
		updateUserNameResponse.setErrorCode(_ctx.stringValue("UpdateUserNameResponse.ErrorCode"));
	 
	 	return updateUserNameResponse;
	}
}