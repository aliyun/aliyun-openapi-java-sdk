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

import com.aliyuncs.mpaas.model.v20201028.CreateMsacAppResponse;
import com.aliyuncs.mpaas.model.v20201028.CreateMsacAppResponse.ResultContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMsacAppResponseUnmarshaller {

	public static CreateMsacAppResponse unmarshall(CreateMsacAppResponse createMsacAppResponse, UnmarshallerContext _ctx) {
		
		createMsacAppResponse.setRequestId(_ctx.stringValue("CreateMsacAppResponse.RequestId"));
		createMsacAppResponse.setResultMessage(_ctx.stringValue("CreateMsacAppResponse.ResultMessage"));
		createMsacAppResponse.setResultCode(_ctx.stringValue("CreateMsacAppResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setCode(_ctx.stringValue("CreateMsacAppResponse.ResultContent.Code"));
		resultContent.setMessage(_ctx.stringValue("CreateMsacAppResponse.ResultContent.Message"));
		resultContent.setData(_ctx.stringValue("CreateMsacAppResponse.ResultContent.Data"));
		resultContent.setSuccess(_ctx.booleanValue("CreateMsacAppResponse.ResultContent.Success"));
		createMsacAppResponse.setResultContent(resultContent);
	 
	 	return createMsacAppResponse;
	}
}