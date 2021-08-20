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

import com.aliyuncs.mpaas.model.v20201028.GetUserAppDonwloadUrlInMsaResponse;
import com.aliyuncs.mpaas.model.v20201028.GetUserAppDonwloadUrlInMsaResponse.ResultContent;
import com.aliyuncs.mpaas.model.v20201028.GetUserAppDonwloadUrlInMsaResponse.ResultContent.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserAppDonwloadUrlInMsaResponseUnmarshaller {

	public static GetUserAppDonwloadUrlInMsaResponse unmarshall(GetUserAppDonwloadUrlInMsaResponse getUserAppDonwloadUrlInMsaResponse, UnmarshallerContext _ctx) {
		
		getUserAppDonwloadUrlInMsaResponse.setRequestId(_ctx.stringValue("GetUserAppDonwloadUrlInMsaResponse.RequestId"));
		getUserAppDonwloadUrlInMsaResponse.setResultCode(_ctx.stringValue("GetUserAppDonwloadUrlInMsaResponse.ResultCode"));
		getUserAppDonwloadUrlInMsaResponse.setResultMessage(_ctx.stringValue("GetUserAppDonwloadUrlInMsaResponse.ResultMessage"));

		ResultContent resultContent = new ResultContent();
		resultContent.setCode(_ctx.stringValue("GetUserAppDonwloadUrlInMsaResponse.ResultContent.Code"));
		resultContent.setMessage(_ctx.stringValue("GetUserAppDonwloadUrlInMsaResponse.ResultContent.Message"));
		resultContent.setSuccess(_ctx.booleanValue("GetUserAppDonwloadUrlInMsaResponse.ResultContent.Success"));

		Data data = new Data();
		data.setUrl(_ctx.stringValue("GetUserAppDonwloadUrlInMsaResponse.ResultContent.Data.Url"));
		data.setFilename(_ctx.stringValue("GetUserAppDonwloadUrlInMsaResponse.ResultContent.Data.Filename"));
		resultContent.setData(data);
		getUserAppDonwloadUrlInMsaResponse.setResultContent(resultContent);
	 
	 	return getUserAppDonwloadUrlInMsaResponse;
	}
}