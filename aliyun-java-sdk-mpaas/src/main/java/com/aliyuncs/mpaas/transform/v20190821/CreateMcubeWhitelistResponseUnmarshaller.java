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

package com.aliyuncs.mpaas.transform.v20190821;

import com.aliyuncs.mpaas.model.v20190821.CreateMcubeWhitelistResponse;
import com.aliyuncs.mpaas.model.v20190821.CreateMcubeWhitelistResponse.CreateWhitelistResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMcubeWhitelistResponseUnmarshaller {

	public static CreateMcubeWhitelistResponse unmarshall(CreateMcubeWhitelistResponse createMcubeWhitelistResponse, UnmarshallerContext _ctx) {
		
		createMcubeWhitelistResponse.setRequestId(_ctx.stringValue("CreateMcubeWhitelistResponse.RequestId"));
		createMcubeWhitelistResponse.setResultCode(_ctx.stringValue("CreateMcubeWhitelistResponse.ResultCode"));
		createMcubeWhitelistResponse.setResultMessage(_ctx.stringValue("CreateMcubeWhitelistResponse.ResultMessage"));

		CreateWhitelistResult createWhitelistResult = new CreateWhitelistResult();
		createWhitelistResult.setResultMsg(_ctx.stringValue("CreateMcubeWhitelistResponse.CreateWhitelistResult.ResultMsg"));
		createWhitelistResult.setSuccess(_ctx.booleanValue("CreateMcubeWhitelistResponse.CreateWhitelistResult.Success"));
		createWhitelistResult.setWhitelistId(_ctx.stringValue("CreateMcubeWhitelistResponse.CreateWhitelistResult.WhitelistId"));
		createMcubeWhitelistResponse.setCreateWhitelistResult(createWhitelistResult);
	 
	 	return createMcubeWhitelistResponse;
	}
}