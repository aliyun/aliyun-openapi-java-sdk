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

package com.aliyuncs.industry_brain.transform.v20190630;

import com.aliyuncs.industry_brain.model.v20190630.InvokeServiceAsyncResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class InvokeServiceAsyncResponseUnmarshaller {

	public static InvokeServiceAsyncResponse unmarshall(InvokeServiceAsyncResponse invokeServiceAsyncResponse, UnmarshallerContext _ctx) {
		
		invokeServiceAsyncResponse.setRequestId(_ctx.stringValue("InvokeServiceAsyncResponse.RequestId"));
		invokeServiceAsyncResponse.setData(_ctx.stringValue("InvokeServiceAsyncResponse.Data"));
		invokeServiceAsyncResponse.setCode(_ctx.stringValue("InvokeServiceAsyncResponse.Code"));
		invokeServiceAsyncResponse.setMessage(_ctx.stringValue("InvokeServiceAsyncResponse.Message"));
	 
	 	return invokeServiceAsyncResponse;
	}
}