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

package com.aliyuncs.scsp.transform.v20200702;

import com.aliyuncs.scsp.model.v20200702.SuspendHotlineServiceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SuspendHotlineServiceResponseUnmarshaller {

	public static SuspendHotlineServiceResponse unmarshall(SuspendHotlineServiceResponse suspendHotlineServiceResponse, UnmarshallerContext _ctx) {
		
		suspendHotlineServiceResponse.setRequestId(_ctx.stringValue("SuspendHotlineServiceResponse.RequestId"));
		suspendHotlineServiceResponse.setSuccess(_ctx.booleanValue("SuspendHotlineServiceResponse.Success"));
		suspendHotlineServiceResponse.setCode(_ctx.stringValue("SuspendHotlineServiceResponse.Code"));
		suspendHotlineServiceResponse.setMessage(_ctx.stringValue("SuspendHotlineServiceResponse.Message"));
	 
	 	return suspendHotlineServiceResponse;
	}
}