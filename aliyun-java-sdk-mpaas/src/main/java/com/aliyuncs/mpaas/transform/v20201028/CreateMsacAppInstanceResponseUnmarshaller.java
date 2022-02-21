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

import com.aliyuncs.mpaas.model.v20201028.CreateMsacAppInstanceResponse;
import com.aliyuncs.mpaas.model.v20201028.CreateMsacAppInstanceResponse.ResultContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMsacAppInstanceResponseUnmarshaller {

	public static CreateMsacAppInstanceResponse unmarshall(CreateMsacAppInstanceResponse createMsacAppInstanceResponse, UnmarshallerContext _ctx) {
		
		createMsacAppInstanceResponse.setRequestId(_ctx.stringValue("CreateMsacAppInstanceResponse.RequestId"));
		createMsacAppInstanceResponse.setResultMessage(_ctx.stringValue("CreateMsacAppInstanceResponse.ResultMessage"));
		createMsacAppInstanceResponse.setResultCode(_ctx.stringValue("CreateMsacAppInstanceResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setCode(_ctx.stringValue("CreateMsacAppInstanceResponse.ResultContent.Code"));
		resultContent.setMessage(_ctx.stringValue("CreateMsacAppInstanceResponse.ResultContent.Message"));
		resultContent.setData(_ctx.stringValue("CreateMsacAppInstanceResponse.ResultContent.Data"));
		resultContent.setSuccess(_ctx.booleanValue("CreateMsacAppInstanceResponse.ResultContent.Success"));
		createMsacAppInstanceResponse.setResultContent(resultContent);
	 
	 	return createMsacAppInstanceResponse;
	}
}