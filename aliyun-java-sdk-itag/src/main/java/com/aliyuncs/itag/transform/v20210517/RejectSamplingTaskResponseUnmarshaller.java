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

import com.aliyuncs.itag.model.v20210517.RejectSamplingTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RejectSamplingTaskResponseUnmarshaller {

	public static RejectSamplingTaskResponse unmarshall(RejectSamplingTaskResponse rejectSamplingTaskResponse, UnmarshallerContext _ctx) {
		
		rejectSamplingTaskResponse.setRequestId(_ctx.stringValue("RejectSamplingTaskResponse.RequestId"));
		rejectSamplingTaskResponse.setCode(_ctx.stringValue("RejectSamplingTaskResponse.Code"));
		rejectSamplingTaskResponse.setErrInfo(_ctx.stringValue("RejectSamplingTaskResponse.ErrInfo"));
		rejectSamplingTaskResponse.setMsg(_ctx.stringValue("RejectSamplingTaskResponse.Msg"));
		rejectSamplingTaskResponse.setSucc(_ctx.booleanValue("RejectSamplingTaskResponse.Succ"));
		rejectSamplingTaskResponse.setResult(_ctx.booleanValue("RejectSamplingTaskResponse.Result"));
		rejectSamplingTaskResponse.setErrorCode(_ctx.stringValue("RejectSamplingTaskResponse.ErrorCode"));
	 
	 	return rejectSamplingTaskResponse;
	}
}