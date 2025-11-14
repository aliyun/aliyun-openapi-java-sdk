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

import com.aliyuncs.mpaas.model.v20201028.ChangeMdsCubeTaskStatusResponse;
import com.aliyuncs.mpaas.model.v20201028.ChangeMdsCubeTaskStatusResponse.ResultContent;
import com.aliyuncs.mpaas.model.v20201028.ChangeMdsCubeTaskStatusResponse.ResultContent.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ChangeMdsCubeTaskStatusResponseUnmarshaller {

	public static ChangeMdsCubeTaskStatusResponse unmarshall(ChangeMdsCubeTaskStatusResponse changeMdsCubeTaskStatusResponse, UnmarshallerContext _ctx) {
		
		changeMdsCubeTaskStatusResponse.setRequestId(_ctx.stringValue("ChangeMdsCubeTaskStatusResponse.RequestId"));
		changeMdsCubeTaskStatusResponse.setResultMessage(_ctx.stringValue("ChangeMdsCubeTaskStatusResponse.ResultMessage"));
		changeMdsCubeTaskStatusResponse.setResultCode(_ctx.stringValue("ChangeMdsCubeTaskStatusResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setRequestId(_ctx.stringValue("ChangeMdsCubeTaskStatusResponse.ResultContent.RequestId"));

		Data data = new Data();
		data.setRequestId(_ctx.stringValue("ChangeMdsCubeTaskStatusResponse.ResultContent.Data.RequestId"));
		data.setSuccess(_ctx.booleanValue("ChangeMdsCubeTaskStatusResponse.ResultContent.Data.Success"));
		data.setContent(_ctx.stringValue("ChangeMdsCubeTaskStatusResponse.ResultContent.Data.Content"));
		data.setErrorCode(_ctx.stringValue("ChangeMdsCubeTaskStatusResponse.ResultContent.Data.ErrorCode"));
		data.setResultMsg(_ctx.stringValue("ChangeMdsCubeTaskStatusResponse.ResultContent.Data.ResultMsg"));
		resultContent.setData(data);
		changeMdsCubeTaskStatusResponse.setResultContent(resultContent);
	 
	 	return changeMdsCubeTaskStatusResponse;
	}
}