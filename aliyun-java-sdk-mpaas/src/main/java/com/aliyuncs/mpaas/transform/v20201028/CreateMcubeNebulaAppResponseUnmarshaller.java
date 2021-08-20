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

import com.aliyuncs.mpaas.model.v20201028.CreateMcubeNebulaAppResponse;
import com.aliyuncs.mpaas.model.v20201028.CreateMcubeNebulaAppResponse.CreateNebulaAppResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMcubeNebulaAppResponseUnmarshaller {

	public static CreateMcubeNebulaAppResponse unmarshall(CreateMcubeNebulaAppResponse createMcubeNebulaAppResponse, UnmarshallerContext _ctx) {
		
		createMcubeNebulaAppResponse.setRequestId(_ctx.stringValue("CreateMcubeNebulaAppResponse.RequestId"));
		createMcubeNebulaAppResponse.setResultCode(_ctx.stringValue("CreateMcubeNebulaAppResponse.ResultCode"));
		createMcubeNebulaAppResponse.setResultMessage(_ctx.stringValue("CreateMcubeNebulaAppResponse.ResultMessage"));

		CreateNebulaAppResult createNebulaAppResult = new CreateNebulaAppResult();
		createNebulaAppResult.setErrorCode(_ctx.stringValue("CreateMcubeNebulaAppResponse.CreateNebulaAppResult.ErrorCode"));
		createNebulaAppResult.setResultMsg(_ctx.stringValue("CreateMcubeNebulaAppResponse.CreateNebulaAppResult.ResultMsg"));
		createNebulaAppResult.setSuccess(_ctx.booleanValue("CreateMcubeNebulaAppResponse.CreateNebulaAppResult.Success"));
		createNebulaAppResult.setRequestId(_ctx.stringValue("CreateMcubeNebulaAppResponse.CreateNebulaAppResult.RequestId"));
		createMcubeNebulaAppResponse.setCreateNebulaAppResult(createNebulaAppResult);
	 
	 	return createMcubeNebulaAppResponse;
	}
}