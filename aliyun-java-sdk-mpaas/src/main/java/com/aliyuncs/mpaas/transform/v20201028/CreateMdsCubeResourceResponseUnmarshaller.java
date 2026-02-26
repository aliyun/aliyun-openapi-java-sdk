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

import com.aliyuncs.mpaas.model.v20201028.CreateMdsCubeResourceResponse;
import com.aliyuncs.mpaas.model.v20201028.CreateMdsCubeResourceResponse.ResultContent;
import com.aliyuncs.mpaas.model.v20201028.CreateMdsCubeResourceResponse.ResultContent.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMdsCubeResourceResponseUnmarshaller {

	public static CreateMdsCubeResourceResponse unmarshall(CreateMdsCubeResourceResponse createMdsCubeResourceResponse, UnmarshallerContext _ctx) {
		
		createMdsCubeResourceResponse.setRequestId(_ctx.stringValue("CreateMdsCubeResourceResponse.RequestId"));
		createMdsCubeResourceResponse.setResultMessage(_ctx.stringValue("CreateMdsCubeResourceResponse.ResultMessage"));
		createMdsCubeResourceResponse.setResultCode(_ctx.stringValue("CreateMdsCubeResourceResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setRequestId(_ctx.stringValue("CreateMdsCubeResourceResponse.ResultContent.RequestId"));

		Data data = new Data();
		data.setRequestId(_ctx.stringValue("CreateMdsCubeResourceResponse.ResultContent.Data.RequestId"));
		data.setSuccess(_ctx.booleanValue("CreateMdsCubeResourceResponse.ResultContent.Data.Success"));
		data.setContent(_ctx.stringValue("CreateMdsCubeResourceResponse.ResultContent.Data.Content"));
		data.setErrorCode(_ctx.stringValue("CreateMdsCubeResourceResponse.ResultContent.Data.ErrorCode"));
		data.setResultMsg(_ctx.stringValue("CreateMdsCubeResourceResponse.ResultContent.Data.ResultMsg"));
		resultContent.setData(data);
		createMdsCubeResourceResponse.setResultContent(resultContent);
	 
	 	return createMdsCubeResourceResponse;
	}
}