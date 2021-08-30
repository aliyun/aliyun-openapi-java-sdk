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

import com.aliyuncs.mpaas.model.v20201028.CreateMcubeUpgradePackageResponse;
import com.aliyuncs.mpaas.model.v20201028.CreateMcubeUpgradePackageResponse.ResultContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMcubeUpgradePackageResponseUnmarshaller {

	public static CreateMcubeUpgradePackageResponse unmarshall(CreateMcubeUpgradePackageResponse createMcubeUpgradePackageResponse, UnmarshallerContext _ctx) {
		
		createMcubeUpgradePackageResponse.setRequestId(_ctx.stringValue("CreateMcubeUpgradePackageResponse.RequestId"));
		createMcubeUpgradePackageResponse.setResultCode(_ctx.stringValue("CreateMcubeUpgradePackageResponse.ResultCode"));
		createMcubeUpgradePackageResponse.setResultMessage(_ctx.stringValue("CreateMcubeUpgradePackageResponse.ResultMessage"));

		ResultContent resultContent = new ResultContent();
		resultContent.setErrorCode(_ctx.stringValue("CreateMcubeUpgradePackageResponse.ResultContent.ErrorCode"));
		resultContent.setResultMsg(_ctx.stringValue("CreateMcubeUpgradePackageResponse.ResultContent.ResultMsg"));
		resultContent.setData(_ctx.stringValue("CreateMcubeUpgradePackageResponse.ResultContent.Data"));
		resultContent.setSuccess(_ctx.booleanValue("CreateMcubeUpgradePackageResponse.ResultContent.Success"));
		resultContent.setRequestId(_ctx.stringValue("CreateMcubeUpgradePackageResponse.ResultContent.RequestId"));
		createMcubeUpgradePackageResponse.setResultContent(resultContent);
	 
	 	return createMcubeUpgradePackageResponse;
	}
}