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

import com.aliyuncs.mpaas.model.v20200710.CreateMcubeWhitelistForIdeResponse;
import com.aliyuncs.mpaas.model.v20200710.CreateMcubeWhitelistForIdeResponse.CreateWhitelistForIdeResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMcubeWhitelistForIdeResponseUnmarshaller {

	public static CreateMcubeWhitelistForIdeResponse unmarshall(CreateMcubeWhitelistForIdeResponse createMcubeWhitelistForIdeResponse, UnmarshallerContext _ctx) {
		
		createMcubeWhitelistForIdeResponse.setRequestId(_ctx.stringValue("CreateMcubeWhitelistForIdeResponse.RequestId"));
		createMcubeWhitelistForIdeResponse.setResultCode(_ctx.stringValue("CreateMcubeWhitelistForIdeResponse.ResultCode"));
		createMcubeWhitelistForIdeResponse.setResultMessage(_ctx.stringValue("CreateMcubeWhitelistForIdeResponse.ResultMessage"));

		CreateWhitelistForIdeResult createWhitelistForIdeResult = new CreateWhitelistForIdeResult();
		createWhitelistForIdeResult.setResultMsg(_ctx.stringValue("CreateMcubeWhitelistForIdeResponse.CreateWhitelistForIdeResult.ResultMsg"));
		createWhitelistForIdeResult.setSuccess(_ctx.booleanValue("CreateMcubeWhitelistForIdeResponse.CreateWhitelistForIdeResult.Success"));
		createWhitelistForIdeResult.setWhitelistId(_ctx.stringValue("CreateMcubeWhitelistForIdeResponse.CreateWhitelistForIdeResult.WhitelistId"));
		createMcubeWhitelistForIdeResponse.setCreateWhitelistForIdeResult(createWhitelistForIdeResult);
	 
	 	return createMcubeWhitelistForIdeResponse;
	}
}