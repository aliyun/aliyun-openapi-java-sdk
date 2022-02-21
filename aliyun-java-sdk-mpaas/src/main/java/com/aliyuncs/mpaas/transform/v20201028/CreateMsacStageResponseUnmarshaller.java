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

import com.aliyuncs.mpaas.model.v20201028.CreateMsacStageResponse;
import com.aliyuncs.mpaas.model.v20201028.CreateMsacStageResponse.ResultContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMsacStageResponseUnmarshaller {

	public static CreateMsacStageResponse unmarshall(CreateMsacStageResponse createMsacStageResponse, UnmarshallerContext _ctx) {
		
		createMsacStageResponse.setRequestId(_ctx.stringValue("CreateMsacStageResponse.RequestId"));
		createMsacStageResponse.setResultMessage(_ctx.stringValue("CreateMsacStageResponse.ResultMessage"));
		createMsacStageResponse.setResultCode(_ctx.stringValue("CreateMsacStageResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setCode(_ctx.stringValue("CreateMsacStageResponse.ResultContent.Code"));
		resultContent.setMessage(_ctx.stringValue("CreateMsacStageResponse.ResultContent.Message"));
		resultContent.setData(_ctx.stringValue("CreateMsacStageResponse.ResultContent.Data"));
		resultContent.setSuccess(_ctx.booleanValue("CreateMsacStageResponse.ResultContent.Success"));
		createMsacStageResponse.setResultContent(resultContent);
	 
	 	return createMsacStageResponse;
	}
}