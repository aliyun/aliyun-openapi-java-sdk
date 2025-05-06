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

import com.aliyuncs.itag.model.v20210517.UserSubTaskTimerResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UserSubTaskTimerResponseUnmarshaller {

	public static UserSubTaskTimerResponse unmarshall(UserSubTaskTimerResponse userSubTaskTimerResponse, UnmarshallerContext _ctx) {
		
		userSubTaskTimerResponse.setRequestId(_ctx.stringValue("UserSubTaskTimerResponse.RequestId"));
		userSubTaskTimerResponse.setCode(_ctx.stringValue("UserSubTaskTimerResponse.Code"));
		userSubTaskTimerResponse.setErrInfo(_ctx.stringValue("UserSubTaskTimerResponse.ErrInfo"));
		userSubTaskTimerResponse.setMsg(_ctx.stringValue("UserSubTaskTimerResponse.Msg"));
		userSubTaskTimerResponse.setSucc(_ctx.booleanValue("UserSubTaskTimerResponse.Succ"));
		userSubTaskTimerResponse.setResult(_ctx.longValue("UserSubTaskTimerResponse.Result"));
		userSubTaskTimerResponse.setErrorCode(_ctx.stringValue("UserSubTaskTimerResponse.ErrorCode"));
	 
	 	return userSubTaskTimerResponse;
	}
}