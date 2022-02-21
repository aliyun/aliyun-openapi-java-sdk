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

import com.aliyuncs.mpaas.model.v20201028.CreateMcubeUpgradeTaskResponse;
import com.aliyuncs.mpaas.model.v20201028.CreateMcubeUpgradeTaskResponse.CreateTaskResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMcubeUpgradeTaskResponseUnmarshaller {

	public static CreateMcubeUpgradeTaskResponse unmarshall(CreateMcubeUpgradeTaskResponse createMcubeUpgradeTaskResponse, UnmarshallerContext _ctx) {
		
		createMcubeUpgradeTaskResponse.setRequestId(_ctx.stringValue("CreateMcubeUpgradeTaskResponse.RequestId"));
		createMcubeUpgradeTaskResponse.setResultMessage(_ctx.stringValue("CreateMcubeUpgradeTaskResponse.ResultMessage"));
		createMcubeUpgradeTaskResponse.setResultCode(_ctx.stringValue("CreateMcubeUpgradeTaskResponse.ResultCode"));

		CreateTaskResult createTaskResult = new CreateTaskResult();
		createTaskResult.setRequestId(_ctx.stringValue("CreateMcubeUpgradeTaskResponse.CreateTaskResult.RequestId"));
		createTaskResult.setSuccess(_ctx.booleanValue("CreateMcubeUpgradeTaskResponse.CreateTaskResult.Success"));
		createTaskResult.setErrorCode(_ctx.stringValue("CreateMcubeUpgradeTaskResponse.CreateTaskResult.ErrorCode"));
		createTaskResult.setUpgradeTaskId(_ctx.stringValue("CreateMcubeUpgradeTaskResponse.CreateTaskResult.upgradeTaskId"));
		createTaskResult.setResultMsg(_ctx.stringValue("CreateMcubeUpgradeTaskResponse.CreateTaskResult.ResultMsg"));
		createMcubeUpgradeTaskResponse.setCreateTaskResult(createTaskResult);
	 
	 	return createMcubeUpgradeTaskResponse;
	}
}