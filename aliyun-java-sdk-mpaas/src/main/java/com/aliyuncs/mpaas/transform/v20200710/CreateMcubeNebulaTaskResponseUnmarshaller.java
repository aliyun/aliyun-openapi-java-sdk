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

import com.aliyuncs.mpaas.model.v20200710.CreateMcubeNebulaTaskResponse;
import com.aliyuncs.mpaas.model.v20200710.CreateMcubeNebulaTaskResponse.CreateMcubeNebulaTaskResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMcubeNebulaTaskResponseUnmarshaller {

	public static CreateMcubeNebulaTaskResponse unmarshall(CreateMcubeNebulaTaskResponse createMcubeNebulaTaskResponse, UnmarshallerContext _ctx) {
		
		createMcubeNebulaTaskResponse.setRequestId(_ctx.stringValue("CreateMcubeNebulaTaskResponse.RequestId"));
		createMcubeNebulaTaskResponse.setResultCode(_ctx.stringValue("CreateMcubeNebulaTaskResponse.ResultCode"));
		createMcubeNebulaTaskResponse.setResultMessage(_ctx.stringValue("CreateMcubeNebulaTaskResponse.ResultMessage"));

		CreateMcubeNebulaTaskResult createMcubeNebulaTaskResult = new CreateMcubeNebulaTaskResult();
		createMcubeNebulaTaskResult.setErrorCode(_ctx.stringValue("CreateMcubeNebulaTaskResponse.CreateMcubeNebulaTaskResult.ErrorCode"));
		createMcubeNebulaTaskResult.setResultMsg(_ctx.stringValue("CreateMcubeNebulaTaskResponse.CreateMcubeNebulaTaskResult.ResultMsg"));
		createMcubeNebulaTaskResult.setNebulaTaskId(_ctx.stringValue("CreateMcubeNebulaTaskResponse.CreateMcubeNebulaTaskResult.NebulaTaskId"));
		createMcubeNebulaTaskResult.setSuccess(_ctx.booleanValue("CreateMcubeNebulaTaskResponse.CreateMcubeNebulaTaskResult.Success"));
		createMcubeNebulaTaskResult.setRequestId(_ctx.stringValue("CreateMcubeNebulaTaskResponse.CreateMcubeNebulaTaskResult.RequestId"));
		createMcubeNebulaTaskResponse.setCreateMcubeNebulaTaskResult(createMcubeNebulaTaskResult);
	 
	 	return createMcubeNebulaTaskResponse;
	}
}