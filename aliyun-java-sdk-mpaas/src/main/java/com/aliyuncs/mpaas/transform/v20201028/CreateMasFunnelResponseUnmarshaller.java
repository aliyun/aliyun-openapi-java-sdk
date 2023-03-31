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

import com.aliyuncs.mpaas.model.v20201028.CreateMasFunnelResponse;
import com.aliyuncs.mpaas.model.v20201028.CreateMasFunnelResponse.ResultContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMasFunnelResponseUnmarshaller {

	public static CreateMasFunnelResponse unmarshall(CreateMasFunnelResponse createMasFunnelResponse, UnmarshallerContext _ctx) {
		
		createMasFunnelResponse.setRequestId(_ctx.stringValue("CreateMasFunnelResponse.RequestId"));
		createMasFunnelResponse.setResultMessage(_ctx.stringValue("CreateMasFunnelResponse.ResultMessage"));
		createMasFunnelResponse.setResultCode(_ctx.stringValue("CreateMasFunnelResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setCode(_ctx.stringValue("CreateMasFunnelResponse.ResultContent.Code"));
		resultContent.setMessage(_ctx.stringValue("CreateMasFunnelResponse.ResultContent.Message"));
		resultContent.setData(_ctx.stringValue("CreateMasFunnelResponse.ResultContent.Data"));
		resultContent.setSuccess(_ctx.booleanValue("CreateMasFunnelResponse.ResultContent.Success"));
		createMasFunnelResponse.setResultContent(resultContent);
	 
	 	return createMasFunnelResponse;
	}
}