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

import com.aliyuncs.mpaas.model.v20200710.ChangeMcubePublicTaskStatusResponse;
import com.aliyuncs.mpaas.model.v20200710.ChangeMcubePublicTaskStatusResponse.ChangeResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class ChangeMcubePublicTaskStatusResponseUnmarshaller {

	public static ChangeMcubePublicTaskStatusResponse unmarshall(ChangeMcubePublicTaskStatusResponse changeMcubePublicTaskStatusResponse, UnmarshallerContext _ctx) {
		
		changeMcubePublicTaskStatusResponse.setRequestId(_ctx.stringValue("ChangeMcubePublicTaskStatusResponse.RequestId"));
		changeMcubePublicTaskStatusResponse.setResultCode(_ctx.stringValue("ChangeMcubePublicTaskStatusResponse.ResultCode"));
		changeMcubePublicTaskStatusResponse.setResultMessage(_ctx.stringValue("ChangeMcubePublicTaskStatusResponse.ResultMessage"));

		ChangeResult changeResult = new ChangeResult();
		changeResult.setErrorCode(_ctx.stringValue("ChangeMcubePublicTaskStatusResponse.ChangeResult.ErrorCode"));
		changeResult.setResultMsg(_ctx.stringValue("ChangeMcubePublicTaskStatusResponse.ChangeResult.ResultMsg"));
		changeResult.setSuccess(_ctx.booleanValue("ChangeMcubePublicTaskStatusResponse.ChangeResult.Success"));
		changeResult.setRequestId(_ctx.stringValue("ChangeMcubePublicTaskStatusResponse.ChangeResult.RequestId"));
		changeMcubePublicTaskStatusResponse.setChangeResult(changeResult);
	 
	 	return changeMcubePublicTaskStatusResponse;
	}
}