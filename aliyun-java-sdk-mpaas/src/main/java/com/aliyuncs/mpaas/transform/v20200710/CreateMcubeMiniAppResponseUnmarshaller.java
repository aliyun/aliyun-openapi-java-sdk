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

import com.aliyuncs.mpaas.model.v20200710.CreateMcubeMiniAppResponse;
import com.aliyuncs.mpaas.model.v20200710.CreateMcubeMiniAppResponse.CreateMiniResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMcubeMiniAppResponseUnmarshaller {

	public static CreateMcubeMiniAppResponse unmarshall(CreateMcubeMiniAppResponse createMcubeMiniAppResponse, UnmarshallerContext _ctx) {
		
		createMcubeMiniAppResponse.setRequestId(_ctx.stringValue("CreateMcubeMiniAppResponse.RequestId"));
		createMcubeMiniAppResponse.setResultMessage(_ctx.stringValue("CreateMcubeMiniAppResponse.ResultMessage"));
		createMcubeMiniAppResponse.setResultCode(_ctx.stringValue("CreateMcubeMiniAppResponse.ResultCode"));

		CreateMiniResult createMiniResult = new CreateMiniResult();
		createMiniResult.setData(_ctx.stringValue("CreateMcubeMiniAppResponse.CreateMiniResult.Data"));
		createMiniResult.setSuccess(_ctx.booleanValue("CreateMcubeMiniAppResponse.CreateMiniResult.Success"));
		createMiniResult.setResultMsg(_ctx.stringValue("CreateMcubeMiniAppResponse.CreateMiniResult.ResultMsg"));
		createMcubeMiniAppResponse.setCreateMiniResult(createMiniResult);
	 
	 	return createMcubeMiniAppResponse;
	}
}