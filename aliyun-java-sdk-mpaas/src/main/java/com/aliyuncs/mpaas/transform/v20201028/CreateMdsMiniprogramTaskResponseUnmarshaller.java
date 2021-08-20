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

import com.aliyuncs.mpaas.model.v20201028.CreateMdsMiniprogramTaskResponse;
import com.aliyuncs.mpaas.model.v20201028.CreateMdsMiniprogramTaskResponse.ResultContent;
import com.aliyuncs.mpaas.model.v20201028.CreateMdsMiniprogramTaskResponse.ResultContent.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMdsMiniprogramTaskResponseUnmarshaller {

	public static CreateMdsMiniprogramTaskResponse unmarshall(CreateMdsMiniprogramTaskResponse createMdsMiniprogramTaskResponse, UnmarshallerContext _ctx) {
		
		createMdsMiniprogramTaskResponse.setRequestId(_ctx.stringValue("CreateMdsMiniprogramTaskResponse.RequestId"));
		createMdsMiniprogramTaskResponse.setResultCode(_ctx.stringValue("CreateMdsMiniprogramTaskResponse.ResultCode"));
		createMdsMiniprogramTaskResponse.setResultMessage(_ctx.stringValue("CreateMdsMiniprogramTaskResponse.ResultMessage"));

		ResultContent resultContent = new ResultContent();
		resultContent.setRequestId(_ctx.stringValue("CreateMdsMiniprogramTaskResponse.ResultContent.RequestId"));

		Data data = new Data();
		data.setContent(_ctx.stringValue("CreateMdsMiniprogramTaskResponse.ResultContent.Data.Content"));
		data.setErrorCode(_ctx.stringValue("CreateMdsMiniprogramTaskResponse.ResultContent.Data.ErrorCode"));
		data.setRequestId(_ctx.stringValue("CreateMdsMiniprogramTaskResponse.ResultContent.Data.RequestId"));
		data.setResultMsg(_ctx.stringValue("CreateMdsMiniprogramTaskResponse.ResultContent.Data.ResultMsg"));
		data.setSuccess(_ctx.booleanValue("CreateMdsMiniprogramTaskResponse.ResultContent.Data.Success"));
		resultContent.setData(data);
		createMdsMiniprogramTaskResponse.setResultContent(resultContent);
	 
	 	return createMdsMiniprogramTaskResponse;
	}
}