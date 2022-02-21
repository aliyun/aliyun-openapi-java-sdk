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

import com.aliyuncs.mpaas.model.v20201028.GetMsacTinyAppInfoResponse;
import com.aliyuncs.mpaas.model.v20201028.GetMsacTinyAppInfoResponse.ResultContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMsacTinyAppInfoResponseUnmarshaller {

	public static GetMsacTinyAppInfoResponse unmarshall(GetMsacTinyAppInfoResponse getMsacTinyAppInfoResponse, UnmarshallerContext _ctx) {
		
		getMsacTinyAppInfoResponse.setRequestId(_ctx.stringValue("GetMsacTinyAppInfoResponse.RequestId"));
		getMsacTinyAppInfoResponse.setResultMessage(_ctx.stringValue("GetMsacTinyAppInfoResponse.ResultMessage"));
		getMsacTinyAppInfoResponse.setResultCode(_ctx.stringValue("GetMsacTinyAppInfoResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setCode(_ctx.stringValue("GetMsacTinyAppInfoResponse.ResultContent.Code"));
		resultContent.setMessage(_ctx.stringValue("GetMsacTinyAppInfoResponse.ResultContent.Message"));
		resultContent.setData(_ctx.stringValue("GetMsacTinyAppInfoResponse.ResultContent.Data"));
		resultContent.setSuccess(_ctx.booleanValue("GetMsacTinyAppInfoResponse.ResultContent.Success"));
		getMsacTinyAppInfoResponse.setResultContent(resultContent);
	 
	 	return getMsacTinyAppInfoResponse;
	}
}