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

import com.aliyuncs.itag.model.v20210517.SkipUserSubTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SkipUserSubTaskResponseUnmarshaller {

	public static SkipUserSubTaskResponse unmarshall(SkipUserSubTaskResponse skipUserSubTaskResponse, UnmarshallerContext _ctx) {
		
		skipUserSubTaskResponse.setRequestId(_ctx.stringValue("SkipUserSubTaskResponse.RequestId"));
		skipUserSubTaskResponse.setCode(_ctx.stringValue("SkipUserSubTaskResponse.Code"));
		skipUserSubTaskResponse.setErrInfo(_ctx.stringValue("SkipUserSubTaskResponse.ErrInfo"));
		skipUserSubTaskResponse.setMsg(_ctx.stringValue("SkipUserSubTaskResponse.Msg"));
		skipUserSubTaskResponse.setSucc(_ctx.booleanValue("SkipUserSubTaskResponse.Succ"));
		skipUserSubTaskResponse.setResult(_ctx.booleanValue("SkipUserSubTaskResponse.Result"));
		skipUserSubTaskResponse.setErrorCode(_ctx.stringValue("SkipUserSubTaskResponse.ErrorCode"));
	 
	 	return skipUserSubTaskResponse;
	}
}