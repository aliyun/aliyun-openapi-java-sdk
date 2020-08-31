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

import com.aliyuncs.industry_brain.model.v20190630.InvokeServiceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class InvokeServiceResponseUnmarshaller {

	public static InvokeServiceResponse unmarshall(InvokeServiceResponse invokeServiceResponse, UnmarshallerContext _ctx) {
		
		invokeServiceResponse.setRequestId(_ctx.stringValue("InvokeServiceResponse.RequestId"));
		invokeServiceResponse.setData(_ctx.stringValue("InvokeServiceResponse.Data"));
		invokeServiceResponse.setCode(_ctx.stringValue("InvokeServiceResponse.Code"));
		invokeServiceResponse.setMessage(_ctx.stringValue("InvokeServiceResponse.Message"));
	 
	 	return invokeServiceResponse;
	}
}