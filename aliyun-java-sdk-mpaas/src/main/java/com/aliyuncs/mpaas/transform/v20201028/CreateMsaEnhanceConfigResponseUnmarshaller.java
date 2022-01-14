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

import com.aliyuncs.mpaas.model.v20201028.CreateMsaEnhanceConfigResponse;
import com.aliyuncs.mpaas.model.v20201028.CreateMsaEnhanceConfigResponse.ResultContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMsaEnhanceConfigResponseUnmarshaller {

	public static CreateMsaEnhanceConfigResponse unmarshall(CreateMsaEnhanceConfigResponse createMsaEnhanceConfigResponse, UnmarshallerContext _ctx) {
		
		createMsaEnhanceConfigResponse.setRequestId(_ctx.stringValue("CreateMsaEnhanceConfigResponse.RequestId"));
		createMsaEnhanceConfigResponse.setResultMessage(_ctx.stringValue("CreateMsaEnhanceConfigResponse.ResultMessage"));
		createMsaEnhanceConfigResponse.setResultCode(_ctx.stringValue("CreateMsaEnhanceConfigResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setCode(_ctx.stringValue("CreateMsaEnhanceConfigResponse.ResultContent.Code"));
		resultContent.setMessage(_ctx.stringValue("CreateMsaEnhanceConfigResponse.ResultContent.Message"));
		resultContent.setData(_ctx.stringValue("CreateMsaEnhanceConfigResponse.ResultContent.Data"));
		resultContent.setSuccess(_ctx.booleanValue("CreateMsaEnhanceConfigResponse.ResultContent.Success"));
		createMsaEnhanceConfigResponse.setResultContent(resultContent);
	 
	 	return createMsaEnhanceConfigResponse;
	}
}