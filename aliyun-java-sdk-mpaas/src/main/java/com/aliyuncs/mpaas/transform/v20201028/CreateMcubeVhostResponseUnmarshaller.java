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

import com.aliyuncs.mpaas.model.v20201028.CreateMcubeVhostResponse;
import com.aliyuncs.mpaas.model.v20201028.CreateMcubeVhostResponse.CreateVhostResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMcubeVhostResponseUnmarshaller {

	public static CreateMcubeVhostResponse unmarshall(CreateMcubeVhostResponse createMcubeVhostResponse, UnmarshallerContext _ctx) {
		
		createMcubeVhostResponse.setRequestId(_ctx.stringValue("CreateMcubeVhostResponse.RequestId"));
		createMcubeVhostResponse.setResultCode(_ctx.stringValue("CreateMcubeVhostResponse.ResultCode"));
		createMcubeVhostResponse.setResultMessage(_ctx.stringValue("CreateMcubeVhostResponse.ResultMessage"));

		CreateVhostResult createVhostResult = new CreateVhostResult();
		createVhostResult.setData(_ctx.stringValue("CreateMcubeVhostResponse.CreateVhostResult.Data"));
		createVhostResult.setResultMsg(_ctx.stringValue("CreateMcubeVhostResponse.CreateVhostResult.ResultMsg"));
		createVhostResult.setSuccess(_ctx.booleanValue("CreateMcubeVhostResponse.CreateVhostResult.Success"));
		createMcubeVhostResponse.setCreateVhostResult(createVhostResult);
	 
	 	return createMcubeVhostResponse;
	}
}