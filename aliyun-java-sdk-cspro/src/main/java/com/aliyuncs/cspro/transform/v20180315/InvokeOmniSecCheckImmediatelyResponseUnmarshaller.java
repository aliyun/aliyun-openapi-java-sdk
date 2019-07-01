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

package com.aliyuncs.cspro.transform.v20180315;

import com.aliyuncs.cspro.model.v20180315.InvokeOmniSecCheckImmediatelyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class InvokeOmniSecCheckImmediatelyResponseUnmarshaller {

	public static InvokeOmniSecCheckImmediatelyResponse unmarshall(InvokeOmniSecCheckImmediatelyResponse invokeOmniSecCheckImmediatelyResponse, UnmarshallerContext _ctx) {
		
		invokeOmniSecCheckImmediatelyResponse.setRequestId(_ctx.stringValue("InvokeOmniSecCheckImmediatelyResponse.RequestId"));
		invokeOmniSecCheckImmediatelyResponse.setSuccess(_ctx.booleanValue("InvokeOmniSecCheckImmediatelyResponse.Success"));
		invokeOmniSecCheckImmediatelyResponse.setCode(_ctx.stringValue("InvokeOmniSecCheckImmediatelyResponse.Code"));
		invokeOmniSecCheckImmediatelyResponse.setMessage(_ctx.stringValue("InvokeOmniSecCheckImmediatelyResponse.Message"));
		invokeOmniSecCheckImmediatelyResponse.setData(_ctx.stringValue("InvokeOmniSecCheckImmediatelyResponse.Data"));
	 
	 	return invokeOmniSecCheckImmediatelyResponse;
	}
}