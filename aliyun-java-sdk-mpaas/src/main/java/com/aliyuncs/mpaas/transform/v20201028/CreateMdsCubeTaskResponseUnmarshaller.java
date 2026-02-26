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

import com.aliyuncs.mpaas.model.v20201028.CreateMdsCubeTaskResponse;
import com.aliyuncs.mpaas.model.v20201028.CreateMdsCubeTaskResponse.ResultContent;
import com.aliyuncs.mpaas.model.v20201028.CreateMdsCubeTaskResponse.ResultContent.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMdsCubeTaskResponseUnmarshaller {

	public static CreateMdsCubeTaskResponse unmarshall(CreateMdsCubeTaskResponse createMdsCubeTaskResponse, UnmarshallerContext _ctx) {
		
		createMdsCubeTaskResponse.setRequestId(_ctx.stringValue("CreateMdsCubeTaskResponse.RequestId"));
		createMdsCubeTaskResponse.setResultMessage(_ctx.stringValue("CreateMdsCubeTaskResponse.ResultMessage"));
		createMdsCubeTaskResponse.setResultCode(_ctx.stringValue("CreateMdsCubeTaskResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setRequestId(_ctx.stringValue("CreateMdsCubeTaskResponse.ResultContent.RequestId"));

		Data data = new Data();
		data.setRequestId(_ctx.stringValue("CreateMdsCubeTaskResponse.ResultContent.Data.RequestId"));
		data.setSuccess(_ctx.booleanValue("CreateMdsCubeTaskResponse.ResultContent.Data.Success"));
		data.setContent(_ctx.stringValue("CreateMdsCubeTaskResponse.ResultContent.Data.Content"));
		data.setErrorCode(_ctx.stringValue("CreateMdsCubeTaskResponse.ResultContent.Data.ErrorCode"));
		data.setResultMsg(_ctx.stringValue("CreateMdsCubeTaskResponse.ResultContent.Data.ResultMsg"));
		resultContent.setData(data);
		createMdsCubeTaskResponse.setResultContent(resultContent);
	 
	 	return createMdsCubeTaskResponse;
	}
}