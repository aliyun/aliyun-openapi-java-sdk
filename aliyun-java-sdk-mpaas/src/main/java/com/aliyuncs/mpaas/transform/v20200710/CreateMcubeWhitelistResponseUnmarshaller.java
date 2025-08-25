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

import com.aliyuncs.mpaas.model.v20200710.CreateMcubeWhitelistResponse;
import com.aliyuncs.mpaas.model.v20200710.CreateMcubeWhitelistResponse.CreateWhitelistResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMcubeWhitelistResponseUnmarshaller {

	public static CreateMcubeWhitelistResponse unmarshall(CreateMcubeWhitelistResponse createMcubeWhitelistResponse, UnmarshallerContext _ctx) {
		
		createMcubeWhitelistResponse.setRequestId(_ctx.stringValue("CreateMcubeWhitelistResponse.RequestId"));
		createMcubeWhitelistResponse.setResultMessage(_ctx.stringValue("CreateMcubeWhitelistResponse.ResultMessage"));
		createMcubeWhitelistResponse.setResultCode(_ctx.stringValue("CreateMcubeWhitelistResponse.ResultCode"));

		CreateWhitelistResult createWhitelistResult = new CreateWhitelistResult();
		createWhitelistResult.setSuccess(_ctx.booleanValue("CreateMcubeWhitelistResponse.CreateWhitelistResult.Success"));
		createWhitelistResult.setResultMsg(_ctx.stringValue("CreateMcubeWhitelistResponse.CreateWhitelistResult.ResultMsg"));
		createWhitelistResult.setWhitelistId(_ctx.stringValue("CreateMcubeWhitelistResponse.CreateWhitelistResult.WhitelistId"));
		createMcubeWhitelistResponse.setCreateWhitelistResult(createWhitelistResult);
	 
	 	return createMcubeWhitelistResponse;
	}
}