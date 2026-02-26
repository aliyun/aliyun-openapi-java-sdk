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

import com.aliyuncs.itag.model.v20210517.AcceptSamplingTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AcceptSamplingTaskResponseUnmarshaller {

	public static AcceptSamplingTaskResponse unmarshall(AcceptSamplingTaskResponse acceptSamplingTaskResponse, UnmarshallerContext _ctx) {
		
		acceptSamplingTaskResponse.setRequestId(_ctx.stringValue("AcceptSamplingTaskResponse.RequestId"));
		acceptSamplingTaskResponse.setCode(_ctx.stringValue("AcceptSamplingTaskResponse.Code"));
		acceptSamplingTaskResponse.setErrInfo(_ctx.stringValue("AcceptSamplingTaskResponse.ErrInfo"));
		acceptSamplingTaskResponse.setMsg(_ctx.stringValue("AcceptSamplingTaskResponse.Msg"));
		acceptSamplingTaskResponse.setSucc(_ctx.booleanValue("AcceptSamplingTaskResponse.Succ"));
		acceptSamplingTaskResponse.setResult(_ctx.booleanValue("AcceptSamplingTaskResponse.Result"));
		acceptSamplingTaskResponse.setErrorCode(_ctx.stringValue("AcceptSamplingTaskResponse.ErrorCode"));
	 
	 	return acceptSamplingTaskResponse;
	}
}