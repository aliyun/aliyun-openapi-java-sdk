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

import com.aliyuncs.mpaas.model.v20201028.UpdateMpaasAppInfoResponse;
import com.aliyuncs.mpaas.model.v20201028.UpdateMpaasAppInfoResponse.ResultContent;
import com.aliyuncs.mpaas.model.v20201028.UpdateMpaasAppInfoResponse.ResultContent.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateMpaasAppInfoResponseUnmarshaller {

	public static UpdateMpaasAppInfoResponse unmarshall(UpdateMpaasAppInfoResponse updateMpaasAppInfoResponse, UnmarshallerContext _ctx) {
		
		updateMpaasAppInfoResponse.setRequestId(_ctx.stringValue("UpdateMpaasAppInfoResponse.RequestId"));
		updateMpaasAppInfoResponse.setResultCode(_ctx.stringValue("UpdateMpaasAppInfoResponse.ResultCode"));
		updateMpaasAppInfoResponse.setResultMessage(_ctx.stringValue("UpdateMpaasAppInfoResponse.ResultMessage"));

		ResultContent resultContent = new ResultContent();
		resultContent.setRequestId(_ctx.stringValue("UpdateMpaasAppInfoResponse.ResultContent.RequestId"));

		Data data = new Data();
		data.setAppId(_ctx.stringValue("UpdateMpaasAppInfoResponse.ResultContent.Data.AppId"));
		data.setCode(_ctx.stringValue("UpdateMpaasAppInfoResponse.ResultContent.Data.Code"));
		data.setData(_ctx.stringValue("UpdateMpaasAppInfoResponse.ResultContent.Data.Data"));
		data.setMessage(_ctx.stringValue("UpdateMpaasAppInfoResponse.ResultContent.Data.Message"));
		data.setSuccess(_ctx.booleanValue("UpdateMpaasAppInfoResponse.ResultContent.Data.Success"));
		resultContent.setData(data);
		updateMpaasAppInfoResponse.setResultContent(resultContent);
	 
	 	return updateMpaasAppInfoResponse;
	}
}