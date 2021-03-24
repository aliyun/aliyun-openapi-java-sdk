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

import com.aliyuncs.mpaas.model.v20201028.AddMdsMiniConfigResponse;
import com.aliyuncs.mpaas.model.v20201028.AddMdsMiniConfigResponse.ResultContent;
import com.aliyuncs.mpaas.model.v20201028.AddMdsMiniConfigResponse.ResultContent.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddMdsMiniConfigResponseUnmarshaller {

	public static AddMdsMiniConfigResponse unmarshall(AddMdsMiniConfigResponse addMdsMiniConfigResponse, UnmarshallerContext _ctx) {
		
		addMdsMiniConfigResponse.setRequestId(_ctx.stringValue("AddMdsMiniConfigResponse.RequestId"));
		addMdsMiniConfigResponse.setResultCode(_ctx.stringValue("AddMdsMiniConfigResponse.ResultCode"));
		addMdsMiniConfigResponse.setResultMessage(_ctx.stringValue("AddMdsMiniConfigResponse.ResultMessage"));

		ResultContent resultContent = new ResultContent();
		resultContent.setRequestId(_ctx.stringValue("AddMdsMiniConfigResponse.ResultContent.RequestId"));

		Data data = new Data();
		data.setContent(_ctx.stringValue("AddMdsMiniConfigResponse.ResultContent.Data.Content"));
		data.setErrorCode(_ctx.stringValue("AddMdsMiniConfigResponse.ResultContent.Data.ErrorCode"));
		data.setRequestId(_ctx.stringValue("AddMdsMiniConfigResponse.ResultContent.Data.RequestId"));
		data.setResultMsg(_ctx.stringValue("AddMdsMiniConfigResponse.ResultContent.Data.ResultMsg"));
		data.setSuccess(_ctx.booleanValue("AddMdsMiniConfigResponse.ResultContent.Data.Success"));
		resultContent.setData(data);
		addMdsMiniConfigResponse.setResultContent(resultContent);
	 
	 	return addMdsMiniConfigResponse;
	}
}