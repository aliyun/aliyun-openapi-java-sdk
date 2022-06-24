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

import com.aliyuncs.mpaas.model.v20200710.CreateMcubeUpgradePackageResponse;
import com.aliyuncs.mpaas.model.v20200710.CreateMcubeUpgradePackageResponse.CreateUpgradePackageResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMcubeUpgradePackageResponseUnmarshaller {

	public static CreateMcubeUpgradePackageResponse unmarshall(CreateMcubeUpgradePackageResponse createMcubeUpgradePackageResponse, UnmarshallerContext _ctx) {
		
		createMcubeUpgradePackageResponse.setRequestId(_ctx.stringValue("CreateMcubeUpgradePackageResponse.RequestId"));
		createMcubeUpgradePackageResponse.setResultMessage(_ctx.stringValue("CreateMcubeUpgradePackageResponse.ResultMessage"));
		createMcubeUpgradePackageResponse.setResultCode(_ctx.stringValue("CreateMcubeUpgradePackageResponse.ResultCode"));

		CreateUpgradePackageResult createUpgradePackageResult = new CreateUpgradePackageResult();
		createUpgradePackageResult.setRequestId(_ctx.stringValue("CreateMcubeUpgradePackageResponse.CreateUpgradePackageResult.RequestId"));
		createUpgradePackageResult.setSuccess(_ctx.booleanValue("CreateMcubeUpgradePackageResponse.CreateUpgradePackageResult.Success"));
		createUpgradePackageResult.setErrorCode(_ctx.stringValue("CreateMcubeUpgradePackageResponse.CreateUpgradePackageResult.ErrorCode"));
		createUpgradePackageResult.setUpgradePackageId(_ctx.stringValue("CreateMcubeUpgradePackageResponse.CreateUpgradePackageResult.UpgradePackageId"));
		createUpgradePackageResult.setResultMsg(_ctx.stringValue("CreateMcubeUpgradePackageResponse.CreateUpgradePackageResult.ResultMsg"));
		createMcubeUpgradePackageResponse.setCreateUpgradePackageResult(createUpgradePackageResult);
	 
	 	return createMcubeUpgradePackageResponse;
	}
}