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

import com.aliyuncs.mpaas.model.v20201028.GetMsacProductVersionResponse;
import com.aliyuncs.mpaas.model.v20201028.GetMsacProductVersionResponse.ResultContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMsacProductVersionResponseUnmarshaller {

	public static GetMsacProductVersionResponse unmarshall(GetMsacProductVersionResponse getMsacProductVersionResponse, UnmarshallerContext _ctx) {
		
		getMsacProductVersionResponse.setRequestId(_ctx.stringValue("GetMsacProductVersionResponse.RequestId"));
		getMsacProductVersionResponse.setResultMessage(_ctx.stringValue("GetMsacProductVersionResponse.ResultMessage"));
		getMsacProductVersionResponse.setResultCode(_ctx.stringValue("GetMsacProductVersionResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setCode(_ctx.stringValue("GetMsacProductVersionResponse.ResultContent.Code"));
		resultContent.setMessage(_ctx.stringValue("GetMsacProductVersionResponse.ResultContent.Message"));
		resultContent.setData(_ctx.stringValue("GetMsacProductVersionResponse.ResultContent.Data"));
		resultContent.setSuccess(_ctx.booleanValue("GetMsacProductVersionResponse.ResultContent.Success"));
		getMsacProductVersionResponse.setResultContent(resultContent);
	 
	 	return getMsacProductVersionResponse;
	}
}