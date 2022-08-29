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

package com.aliyuncs.mpaas.transform.v20200415;

import com.aliyuncs.mpaas.model.v20200415.AddMcubeMiniprogramConfigResponse;
import com.aliyuncs.mpaas.model.v20200415.AddMcubeMiniprogramConfigResponse.AddMiniConfigResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddMcubeMiniprogramConfigResponseUnmarshaller {

	public static AddMcubeMiniprogramConfigResponse unmarshall(AddMcubeMiniprogramConfigResponse addMcubeMiniprogramConfigResponse, UnmarshallerContext _ctx) {
		
		addMcubeMiniprogramConfigResponse.setRequestId(_ctx.stringValue("AddMcubeMiniprogramConfigResponse.RequestId"));
		addMcubeMiniprogramConfigResponse.setResultMessage(_ctx.stringValue("AddMcubeMiniprogramConfigResponse.ResultMessage"));
		addMcubeMiniprogramConfigResponse.setResultCode(_ctx.stringValue("AddMcubeMiniprogramConfigResponse.ResultCode"));

		AddMiniConfigResult addMiniConfigResult = new AddMiniConfigResult();
		addMiniConfigResult.setSuccess(_ctx.booleanValue("AddMcubeMiniprogramConfigResponse.AddMiniConfigResult.Success"));
		addMiniConfigResult.setResultMsg(_ctx.stringValue("AddMcubeMiniprogramConfigResponse.AddMiniConfigResult.ResultMsg"));
		addMcubeMiniprogramConfigResponse.setAddMiniConfigResult(addMiniConfigResult);
	 
	 	return addMcubeMiniprogramConfigResponse;
	}
}