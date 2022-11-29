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

package com.aliyuncs.mpaas.transform.v20201028;

import com.aliyuncs.mpaas.model.v20201028.OpenApiDecodeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpenApiDecodeResponseUnmarshaller {

	public static OpenApiDecodeResponse unmarshall(OpenApiDecodeResponse openApiDecodeResponse, UnmarshallerContext _ctx) {
		
		openApiDecodeResponse.setRequestId(_ctx.stringValue("OpenApiDecodeResponse.RequestId"));
		openApiDecodeResponse.setResultContent(_ctx.stringValue("OpenApiDecodeResponse.ResultContent"));
		openApiDecodeResponse.setResultCode(_ctx.stringValue("OpenApiDecodeResponse.ResultCode"));
	 
	 	return openApiDecodeResponse;
	}
}