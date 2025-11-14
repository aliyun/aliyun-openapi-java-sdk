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

import com.aliyuncs.mpaas.model.v20201028.CreateMdsCubeTemplateResponse;
import com.aliyuncs.mpaas.model.v20201028.CreateMdsCubeTemplateResponse.ResultContent;
import com.aliyuncs.mpaas.model.v20201028.CreateMdsCubeTemplateResponse.ResultContent.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMdsCubeTemplateResponseUnmarshaller {

	public static CreateMdsCubeTemplateResponse unmarshall(CreateMdsCubeTemplateResponse createMdsCubeTemplateResponse, UnmarshallerContext _ctx) {
		
		createMdsCubeTemplateResponse.setRequestId(_ctx.stringValue("CreateMdsCubeTemplateResponse.RequestId"));
		createMdsCubeTemplateResponse.setResultMessage(_ctx.stringValue("CreateMdsCubeTemplateResponse.ResultMessage"));
		createMdsCubeTemplateResponse.setResultCode(_ctx.stringValue("CreateMdsCubeTemplateResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setRequestId(_ctx.stringValue("CreateMdsCubeTemplateResponse.ResultContent.RequestId"));

		Data data = new Data();
		data.setRequestId(_ctx.stringValue("CreateMdsCubeTemplateResponse.ResultContent.Data.RequestId"));
		data.setSuccess(_ctx.booleanValue("CreateMdsCubeTemplateResponse.ResultContent.Data.Success"));
		data.setErrorCode(_ctx.stringValue("CreateMdsCubeTemplateResponse.ResultContent.Data.ErrorCode"));
		data.setResultMsg(_ctx.stringValue("CreateMdsCubeTemplateResponse.ResultContent.Data.ResultMsg"));
		data.setContent(_ctx.stringValue("CreateMdsCubeTemplateResponse.ResultContent.Data.Content"));
		resultContent.setData(data);
		createMdsCubeTemplateResponse.setResultContent(resultContent);
	 
	 	return createMdsCubeTemplateResponse;
	}
}