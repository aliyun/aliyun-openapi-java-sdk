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

import com.aliyuncs.mpaas.model.v20200710.ChangeMcubeNebulaTaskStatusResponse;
import com.aliyuncs.mpaas.model.v20200710.ChangeMcubeNebulaTaskStatusResponse.ChangeMcubeNebulaTaskStatusResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class ChangeMcubeNebulaTaskStatusResponseUnmarshaller {

	public static ChangeMcubeNebulaTaskStatusResponse unmarshall(ChangeMcubeNebulaTaskStatusResponse changeMcubeNebulaTaskStatusResponse, UnmarshallerContext _ctx) {
		
		changeMcubeNebulaTaskStatusResponse.setRequestId(_ctx.stringValue("ChangeMcubeNebulaTaskStatusResponse.RequestId"));
		changeMcubeNebulaTaskStatusResponse.setResultCode(_ctx.stringValue("ChangeMcubeNebulaTaskStatusResponse.ResultCode"));
		changeMcubeNebulaTaskStatusResponse.setResultMessage(_ctx.stringValue("ChangeMcubeNebulaTaskStatusResponse.ResultMessage"));

		ChangeMcubeNebulaTaskStatusResult changeMcubeNebulaTaskStatusResult = new ChangeMcubeNebulaTaskStatusResult();
		changeMcubeNebulaTaskStatusResult.setErrorCode(_ctx.stringValue("ChangeMcubeNebulaTaskStatusResponse.ChangeMcubeNebulaTaskStatusResult.ErrorCode"));
		changeMcubeNebulaTaskStatusResult.setResultMsg(_ctx.stringValue("ChangeMcubeNebulaTaskStatusResponse.ChangeMcubeNebulaTaskStatusResult.ResultMsg"));
		changeMcubeNebulaTaskStatusResult.setSuccess(_ctx.booleanValue("ChangeMcubeNebulaTaskStatusResponse.ChangeMcubeNebulaTaskStatusResult.Success"));
		changeMcubeNebulaTaskStatusResult.setRequestId(_ctx.stringValue("ChangeMcubeNebulaTaskStatusResponse.ChangeMcubeNebulaTaskStatusResult.RequestId"));
		changeMcubeNebulaTaskStatusResponse.setChangeMcubeNebulaTaskStatusResult(changeMcubeNebulaTaskStatusResult);
	 
	 	return changeMcubeNebulaTaskStatusResponse;
	}
}