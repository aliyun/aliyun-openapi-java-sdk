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

package com.aliyuncs.brain_industrial.transform.v20200920;

import com.aliyuncs.brain_industrial.model.v20200920.OpenApiInvokeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpenApiInvokeResponseUnmarshaller {

	public static OpenApiInvokeResponse unmarshall(OpenApiInvokeResponse openApiInvokeResponse, UnmarshallerContext _ctx) {
		
		openApiInvokeResponse.setRequestId(_ctx.stringValue("OpenApiInvokeResponse.RequestId"));
		openApiInvokeResponse.setSuccess(_ctx.stringValue("OpenApiInvokeResponse.Success"));
		openApiInvokeResponse.setCode(_ctx.stringValue("OpenApiInvokeResponse.Code"));
		openApiInvokeResponse.setMessage(_ctx.stringValue("OpenApiInvokeResponse.Message"));
		openApiInvokeResponse.setData(_ctx.stringValue("OpenApiInvokeResponse.Data"));
	 
	 	return openApiInvokeResponse;
	}
}