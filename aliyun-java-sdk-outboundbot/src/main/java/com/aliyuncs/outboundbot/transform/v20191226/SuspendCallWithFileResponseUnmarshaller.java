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

package com.aliyuncs.outboundbot.transform.v20191226;

import com.aliyuncs.outboundbot.model.v20191226.SuspendCallWithFileResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SuspendCallWithFileResponseUnmarshaller {

	public static SuspendCallWithFileResponse unmarshall(SuspendCallWithFileResponse suspendCallWithFileResponse, UnmarshallerContext _ctx) {
		
		suspendCallWithFileResponse.setRequestId(_ctx.stringValue("SuspendCallWithFileResponse.RequestId"));
		suspendCallWithFileResponse.setSuccess(_ctx.booleanValue("SuspendCallWithFileResponse.Success"));
		suspendCallWithFileResponse.setCode(_ctx.stringValue("SuspendCallWithFileResponse.Code"));
		suspendCallWithFileResponse.setMessage(_ctx.stringValue("SuspendCallWithFileResponse.Message"));
		suspendCallWithFileResponse.setHttpStatusCode(_ctx.integerValue("SuspendCallWithFileResponse.HttpStatusCode"));
	 
	 	return suspendCallWithFileResponse;
	}
}