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

import com.aliyuncs.mpaas.model.v20200710.CreateMcubeUpgradeTaskResponse;
import com.aliyuncs.mpaas.model.v20200710.CreateMcubeUpgradeTaskResponse.CreateTaskResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMcubeUpgradeTaskResponseUnmarshaller {

	public static CreateMcubeUpgradeTaskResponse unmarshall(CreateMcubeUpgradeTaskResponse createMcubeUpgradeTaskResponse, UnmarshallerContext _ctx) {
		
		createMcubeUpgradeTaskResponse.setRequestId(_ctx.stringValue("CreateMcubeUpgradeTaskResponse.RequestId"));
		createMcubeUpgradeTaskResponse.setResultCode(_ctx.stringValue("CreateMcubeUpgradeTaskResponse.ResultCode"));
		createMcubeUpgradeTaskResponse.setResultMessage(_ctx.stringValue("CreateMcubeUpgradeTaskResponse.ResultMessage"));

		CreateTaskResult createTaskResult = new CreateTaskResult();
		createTaskResult.setErrorCode(_ctx.stringValue("CreateMcubeUpgradeTaskResponse.CreateTaskResult.ErrorCode"));
		createTaskResult.setResultMsg(_ctx.stringValue("CreateMcubeUpgradeTaskResponse.CreateTaskResult.ResultMsg"));
		createTaskResult.setUpgradeTaskId(_ctx.stringValue("CreateMcubeUpgradeTaskResponse.CreateTaskResult.UpgradeTaskId"));
		createTaskResult.setSuccess(_ctx.booleanValue("CreateMcubeUpgradeTaskResponse.CreateTaskResult.Success"));
		createTaskResult.setRequestId(_ctx.stringValue("CreateMcubeUpgradeTaskResponse.CreateTaskResult.RequestId"));
		createMcubeUpgradeTaskResponse.setCreateTaskResult(createTaskResult);
	 
	 	return createMcubeUpgradeTaskResponse;
	}
}