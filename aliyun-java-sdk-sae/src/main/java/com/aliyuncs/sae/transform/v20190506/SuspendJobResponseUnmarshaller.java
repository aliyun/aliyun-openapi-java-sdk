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

package com.aliyuncs.sae.transform.v20190506;

import com.aliyuncs.sae.model.v20190506.SuspendJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SuspendJobResponseUnmarshaller {

	public static SuspendJobResponse unmarshall(SuspendJobResponse suspendJobResponse, UnmarshallerContext _ctx) {
		
		suspendJobResponse.setRequestId(_ctx.stringValue("SuspendJobResponse.RequestId"));
		suspendJobResponse.setMessage(_ctx.stringValue("SuspendJobResponse.Message"));
		suspendJobResponse.setTraceId(_ctx.stringValue("SuspendJobResponse.TraceId"));
		suspendJobResponse.setData(_ctx.stringValue("SuspendJobResponse.Data"));
		suspendJobResponse.setErrorCode(_ctx.stringValue("SuspendJobResponse.ErrorCode"));
		suspendJobResponse.setCode(_ctx.stringValue("SuspendJobResponse.Code"));
		suspendJobResponse.setSuccess(_ctx.booleanValue("SuspendJobResponse.Success"));
	 
	 	return suspendJobResponse;
	}
}