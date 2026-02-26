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

import com.aliyuncs.mpaas.model.v20201028.UpdateMdsCubeResourceResponse;
import com.aliyuncs.mpaas.model.v20201028.UpdateMdsCubeResourceResponse.ResultContent;
import com.aliyuncs.mpaas.model.v20201028.UpdateMdsCubeResourceResponse.ResultContent.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateMdsCubeResourceResponseUnmarshaller {

	public static UpdateMdsCubeResourceResponse unmarshall(UpdateMdsCubeResourceResponse updateMdsCubeResourceResponse, UnmarshallerContext _ctx) {
		
		updateMdsCubeResourceResponse.setRequestId(_ctx.stringValue("UpdateMdsCubeResourceResponse.RequestId"));
		updateMdsCubeResourceResponse.setResultMessage(_ctx.stringValue("UpdateMdsCubeResourceResponse.ResultMessage"));
		updateMdsCubeResourceResponse.setResultCode(_ctx.stringValue("UpdateMdsCubeResourceResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setRequestId(_ctx.stringValue("UpdateMdsCubeResourceResponse.ResultContent.RequestId"));

		Data data = new Data();
		data.setRequestId(_ctx.stringValue("UpdateMdsCubeResourceResponse.ResultContent.Data.RequestId"));
		data.setSuccess(_ctx.booleanValue("UpdateMdsCubeResourceResponse.ResultContent.Data.Success"));
		data.setErrorCode(_ctx.stringValue("UpdateMdsCubeResourceResponse.ResultContent.Data.ErrorCode"));
		data.setContent(_ctx.stringValue("UpdateMdsCubeResourceResponse.ResultContent.Data.Content"));
		data.setResultMsg(_ctx.stringValue("UpdateMdsCubeResourceResponse.ResultContent.Data.ResultMsg"));
		resultContent.setData(data);
		updateMdsCubeResourceResponse.setResultContent(resultContent);
	 
	 	return updateMdsCubeResourceResponse;
	}
}