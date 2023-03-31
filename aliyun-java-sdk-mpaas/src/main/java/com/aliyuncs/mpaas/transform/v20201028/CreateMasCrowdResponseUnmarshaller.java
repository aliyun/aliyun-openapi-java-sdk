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

import com.aliyuncs.mpaas.model.v20201028.CreateMasCrowdResponse;
import com.aliyuncs.mpaas.model.v20201028.CreateMasCrowdResponse.ResultContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMasCrowdResponseUnmarshaller {

	public static CreateMasCrowdResponse unmarshall(CreateMasCrowdResponse createMasCrowdResponse, UnmarshallerContext _ctx) {
		
		createMasCrowdResponse.setRequestId(_ctx.stringValue("CreateMasCrowdResponse.RequestId"));
		createMasCrowdResponse.setResultMessage(_ctx.stringValue("CreateMasCrowdResponse.ResultMessage"));
		createMasCrowdResponse.setResultCode(_ctx.stringValue("CreateMasCrowdResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setCode(_ctx.stringValue("CreateMasCrowdResponse.ResultContent.Code"));
		resultContent.setMessage(_ctx.stringValue("CreateMasCrowdResponse.ResultContent.Message"));
		resultContent.setData(_ctx.stringValue("CreateMasCrowdResponse.ResultContent.Data"));
		resultContent.setSuccess(_ctx.booleanValue("CreateMasCrowdResponse.ResultContent.Success"));
		createMasCrowdResponse.setResultContent(resultContent);
	 
	 	return createMasCrowdResponse;
	}
}