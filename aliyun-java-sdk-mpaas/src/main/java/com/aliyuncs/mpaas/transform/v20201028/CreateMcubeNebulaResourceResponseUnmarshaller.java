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

import com.aliyuncs.mpaas.model.v20201028.CreateMcubeNebulaResourceResponse;
import com.aliyuncs.mpaas.model.v20201028.CreateMcubeNebulaResourceResponse.CreateMcubeNebulaResourceReslult;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMcubeNebulaResourceResponseUnmarshaller {

	public static CreateMcubeNebulaResourceResponse unmarshall(CreateMcubeNebulaResourceResponse createMcubeNebulaResourceResponse, UnmarshallerContext _ctx) {
		
		createMcubeNebulaResourceResponse.setRequestId(_ctx.stringValue("CreateMcubeNebulaResourceResponse.RequestId"));
		createMcubeNebulaResourceResponse.setResultMessage(_ctx.stringValue("CreateMcubeNebulaResourceResponse.ResultMessage"));
		createMcubeNebulaResourceResponse.setResultCode(_ctx.stringValue("CreateMcubeNebulaResourceResponse.ResultCode"));

		CreateMcubeNebulaResourceReslult createMcubeNebulaResourceReslult = new CreateMcubeNebulaResourceReslult();
		createMcubeNebulaResourceReslult.setNebulaResourceId(_ctx.stringValue("CreateMcubeNebulaResourceResponse.CreateMcubeNebulaResourceReslult.NebulaResourceId"));
		createMcubeNebulaResourceReslult.setRequestId(_ctx.stringValue("CreateMcubeNebulaResourceResponse.CreateMcubeNebulaResourceReslult.RequestId"));
		createMcubeNebulaResourceReslult.setSuccess(_ctx.booleanValue("CreateMcubeNebulaResourceResponse.CreateMcubeNebulaResourceReslult.Success"));
		createMcubeNebulaResourceReslult.setErrorCode(_ctx.stringValue("CreateMcubeNebulaResourceResponse.CreateMcubeNebulaResourceReslult.ErrorCode"));
		createMcubeNebulaResourceReslult.setResultMsg(_ctx.stringValue("CreateMcubeNebulaResourceResponse.CreateMcubeNebulaResourceReslult.ResultMsg"));
		createMcubeNebulaResourceResponse.setCreateMcubeNebulaResourceReslult(createMcubeNebulaResourceReslult);
	 
	 	return createMcubeNebulaResourceResponse;
	}
}