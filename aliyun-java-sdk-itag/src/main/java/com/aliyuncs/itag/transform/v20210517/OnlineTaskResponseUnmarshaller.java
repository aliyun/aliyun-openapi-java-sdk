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

import com.aliyuncs.itag.model.v20210517.OnlineTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnlineTaskResponseUnmarshaller {

	public static OnlineTaskResponse unmarshall(OnlineTaskResponse onlineTaskResponse, UnmarshallerContext _ctx) {
		
		onlineTaskResponse.setRequestId(_ctx.stringValue("OnlineTaskResponse.RequestId"));
		onlineTaskResponse.setCode(_ctx.stringValue("OnlineTaskResponse.Code"));
		onlineTaskResponse.setErrInfo(_ctx.stringValue("OnlineTaskResponse.ErrInfo"));
		onlineTaskResponse.setMsg(_ctx.stringValue("OnlineTaskResponse.Msg"));
		onlineTaskResponse.setSucc(_ctx.booleanValue("OnlineTaskResponse.Succ"));
		onlineTaskResponse.setResult(_ctx.booleanValue("OnlineTaskResponse.Result"));
		onlineTaskResponse.setErrorCode(_ctx.stringValue("OnlineTaskResponse.ErrorCode"));
	 
	 	return onlineTaskResponse;
	}
}