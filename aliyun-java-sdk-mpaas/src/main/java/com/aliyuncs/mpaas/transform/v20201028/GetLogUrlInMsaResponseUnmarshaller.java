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

import com.aliyuncs.mpaas.model.v20201028.GetLogUrlInMsaResponse;
import com.aliyuncs.mpaas.model.v20201028.GetLogUrlInMsaResponse.ResultContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLogUrlInMsaResponseUnmarshaller {

	public static GetLogUrlInMsaResponse unmarshall(GetLogUrlInMsaResponse getLogUrlInMsaResponse, UnmarshallerContext _ctx) {
		
		getLogUrlInMsaResponse.setRequestId(_ctx.stringValue("GetLogUrlInMsaResponse.RequestId"));
		getLogUrlInMsaResponse.setResultMessage(_ctx.stringValue("GetLogUrlInMsaResponse.ResultMessage"));
		getLogUrlInMsaResponse.setResultCode(_ctx.stringValue("GetLogUrlInMsaResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setCode(_ctx.stringValue("GetLogUrlInMsaResponse.ResultContent.Code"));
		resultContent.setMessage(_ctx.stringValue("GetLogUrlInMsaResponse.ResultContent.Message"));
		resultContent.setData(_ctx.stringValue("GetLogUrlInMsaResponse.ResultContent.Data"));
		resultContent.setSuccess(_ctx.booleanValue("GetLogUrlInMsaResponse.ResultContent.Success"));
		getLogUrlInMsaResponse.setResultContent(resultContent);
	 
	 	return getLogUrlInMsaResponse;
	}
}