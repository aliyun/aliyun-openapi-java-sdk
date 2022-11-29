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

import com.aliyuncs.mpaas.model.v20201028.CreateMcdpEventAttributeResponse;
import com.aliyuncs.mpaas.model.v20201028.CreateMcdpEventAttributeResponse.ResultContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMcdpEventAttributeResponseUnmarshaller {

	public static CreateMcdpEventAttributeResponse unmarshall(CreateMcdpEventAttributeResponse createMcdpEventAttributeResponse, UnmarshallerContext _ctx) {
		
		createMcdpEventAttributeResponse.setRequestId(_ctx.stringValue("CreateMcdpEventAttributeResponse.RequestId"));
		createMcdpEventAttributeResponse.setResultMessage(_ctx.stringValue("CreateMcdpEventAttributeResponse.ResultMessage"));
		createMcdpEventAttributeResponse.setResultCode(_ctx.stringValue("CreateMcdpEventAttributeResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setCode(_ctx.stringValue("CreateMcdpEventAttributeResponse.ResultContent.Code"));
		resultContent.setMessage(_ctx.stringValue("CreateMcdpEventAttributeResponse.ResultContent.Message"));
		resultContent.setData(_ctx.stringValue("CreateMcdpEventAttributeResponse.ResultContent.Data"));
		resultContent.setSuccess(_ctx.booleanValue("CreateMcdpEventAttributeResponse.ResultContent.Success"));
		createMcdpEventAttributeResponse.setResultContent(resultContent);
	 
	 	return createMcdpEventAttributeResponse;
	}
}