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

import com.aliyuncs.mpaas.model.v20201028.DeleteMdsCubeTemplateResponse;
import com.aliyuncs.mpaas.model.v20201028.DeleteMdsCubeTemplateResponse.ResultContent;
import com.aliyuncs.mpaas.model.v20201028.DeleteMdsCubeTemplateResponse.ResultContent.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteMdsCubeTemplateResponseUnmarshaller {

	public static DeleteMdsCubeTemplateResponse unmarshall(DeleteMdsCubeTemplateResponse deleteMdsCubeTemplateResponse, UnmarshallerContext _ctx) {
		
		deleteMdsCubeTemplateResponse.setRequestId(_ctx.stringValue("DeleteMdsCubeTemplateResponse.RequestId"));
		deleteMdsCubeTemplateResponse.setResultMessage(_ctx.stringValue("DeleteMdsCubeTemplateResponse.ResultMessage"));
		deleteMdsCubeTemplateResponse.setResultCode(_ctx.stringValue("DeleteMdsCubeTemplateResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setRequestId(_ctx.stringValue("DeleteMdsCubeTemplateResponse.ResultContent.RequestId"));

		Data data = new Data();
		data.setRequestId(_ctx.stringValue("DeleteMdsCubeTemplateResponse.ResultContent.Data.RequestId"));
		data.setSuccess(_ctx.booleanValue("DeleteMdsCubeTemplateResponse.ResultContent.Data.Success"));
		data.setContent(_ctx.stringValue("DeleteMdsCubeTemplateResponse.ResultContent.Data.Content"));
		data.setErrorCode(_ctx.stringValue("DeleteMdsCubeTemplateResponse.ResultContent.Data.ErrorCode"));
		data.setResultMsg(_ctx.stringValue("DeleteMdsCubeTemplateResponse.ResultContent.Data.ResultMsg"));
		resultContent.setData(data);
		deleteMdsCubeTemplateResponse.setResultContent(resultContent);
	 
	 	return deleteMdsCubeTemplateResponse;
	}
}