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

import com.aliyuncs.mpaas.model.v20201028.CreateMsaEnhanceResponse;
import com.aliyuncs.mpaas.model.v20201028.CreateMsaEnhanceResponse.ResultContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMsaEnhanceResponseUnmarshaller {

	public static CreateMsaEnhanceResponse unmarshall(CreateMsaEnhanceResponse createMsaEnhanceResponse, UnmarshallerContext _ctx) {
		
		createMsaEnhanceResponse.setRequestId(_ctx.stringValue("CreateMsaEnhanceResponse.RequestId"));
		createMsaEnhanceResponse.setResultCode(_ctx.stringValue("CreateMsaEnhanceResponse.ResultCode"));
		createMsaEnhanceResponse.setResultMessage(_ctx.stringValue("CreateMsaEnhanceResponse.ResultMessage"));

		ResultContent resultContent = new ResultContent();
		resultContent.setCode(_ctx.stringValue("CreateMsaEnhanceResponse.ResultContent.Code"));
		resultContent.setData(_ctx.stringValue("CreateMsaEnhanceResponse.ResultContent.Data"));
		resultContent.setMessage(_ctx.stringValue("CreateMsaEnhanceResponse.ResultContent.Message"));
		resultContent.setSuccess(_ctx.booleanValue("CreateMsaEnhanceResponse.ResultContent.Success"));
		createMsaEnhanceResponse.setResultContent(resultContent);
	 
	 	return createMsaEnhanceResponse;
	}
}