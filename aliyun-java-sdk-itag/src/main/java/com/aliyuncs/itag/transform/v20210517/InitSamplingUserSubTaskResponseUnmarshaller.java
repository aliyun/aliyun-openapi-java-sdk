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

import com.aliyuncs.itag.model.v20210517.InitSamplingUserSubTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class InitSamplingUserSubTaskResponseUnmarshaller {

	public static InitSamplingUserSubTaskResponse unmarshall(InitSamplingUserSubTaskResponse initSamplingUserSubTaskResponse, UnmarshallerContext _ctx) {
		
		initSamplingUserSubTaskResponse.setRequestId(_ctx.stringValue("InitSamplingUserSubTaskResponse.RequestId"));
		initSamplingUserSubTaskResponse.setCode(_ctx.stringValue("InitSamplingUserSubTaskResponse.Code"));
		initSamplingUserSubTaskResponse.setErrInfo(_ctx.stringValue("InitSamplingUserSubTaskResponse.ErrInfo"));
		initSamplingUserSubTaskResponse.setMsg(_ctx.stringValue("InitSamplingUserSubTaskResponse.Msg"));
		initSamplingUserSubTaskResponse.setSucc(_ctx.booleanValue("InitSamplingUserSubTaskResponse.Succ"));
		initSamplingUserSubTaskResponse.setResult(_ctx.longValue("InitSamplingUserSubTaskResponse.Result"));
		initSamplingUserSubTaskResponse.setErrorCode(_ctx.stringValue("InitSamplingUserSubTaskResponse.ErrorCode"));
	 
	 	return initSamplingUserSubTaskResponse;
	}
}