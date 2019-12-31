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

package com.aliyuncs.mpserverless.transform.v20190930;

import com.aliyuncs.mpserverless.model.v20190930.EnableExtensionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class EnableExtensionResponseUnmarshaller {

	public static EnableExtensionResponse unmarshall(EnableExtensionResponse enableExtensionResponse, UnmarshallerContext _ctx) {
		
		enableExtensionResponse.setRequestId(_ctx.stringValue("EnableExtensionResponse.RequestId"));
		enableExtensionResponse.setHttpStatusCode(_ctx.stringValue("EnableExtensionResponse.HttpStatusCode"));
		enableExtensionResponse.setSuccess(_ctx.booleanValue("EnableExtensionResponse.Success"));
		enableExtensionResponse.setCode(_ctx.stringValue("EnableExtensionResponse.Code"));
		enableExtensionResponse.setMessage(_ctx.stringValue("EnableExtensionResponse.Message"));
	 
	 	return enableExtensionResponse;
	}
}