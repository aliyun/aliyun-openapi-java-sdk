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

package com.aliyuncs.mpaas.transform.v20200710;

import com.aliyuncs.mpaas.model.v20200710.CreateMcubeMiniTaskResponse;
import com.aliyuncs.mpaas.model.v20200710.CreateMcubeMiniTaskResponse.CreateMiniTaskResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMcubeMiniTaskResponseUnmarshaller {

	public static CreateMcubeMiniTaskResponse unmarshall(CreateMcubeMiniTaskResponse createMcubeMiniTaskResponse, UnmarshallerContext _ctx) {
		
		createMcubeMiniTaskResponse.setRequestId(_ctx.stringValue("CreateMcubeMiniTaskResponse.RequestId"));
		createMcubeMiniTaskResponse.setResultMessage(_ctx.stringValue("CreateMcubeMiniTaskResponse.ResultMessage"));
		createMcubeMiniTaskResponse.setResultCode(_ctx.stringValue("CreateMcubeMiniTaskResponse.ResultCode"));

		CreateMiniTaskResult createMiniTaskResult = new CreateMiniTaskResult();
		createMiniTaskResult.setMiniTaskId(_ctx.stringValue("CreateMcubeMiniTaskResponse.CreateMiniTaskResult.MiniTaskId"));
		createMiniTaskResult.setSuccess(_ctx.booleanValue("CreateMcubeMiniTaskResponse.CreateMiniTaskResult.Success"));
		createMiniTaskResult.setResultMsg(_ctx.stringValue("CreateMcubeMiniTaskResponse.CreateMiniTaskResult.ResultMsg"));
		createMcubeMiniTaskResponse.setCreateMiniTaskResult(createMiniTaskResult);
	 
	 	return createMcubeMiniTaskResponse;
	}
}