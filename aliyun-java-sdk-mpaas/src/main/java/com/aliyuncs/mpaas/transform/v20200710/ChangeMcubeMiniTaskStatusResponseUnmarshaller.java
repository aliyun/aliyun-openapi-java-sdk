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

import com.aliyuncs.mpaas.model.v20200710.ChangeMcubeMiniTaskStatusResponse;
import com.aliyuncs.mpaas.model.v20200710.ChangeMcubeMiniTaskStatusResponse.ChangeMiniTaskStatusResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class ChangeMcubeMiniTaskStatusResponseUnmarshaller {

	public static ChangeMcubeMiniTaskStatusResponse unmarshall(ChangeMcubeMiniTaskStatusResponse changeMcubeMiniTaskStatusResponse, UnmarshallerContext _ctx) {
		
		changeMcubeMiniTaskStatusResponse.setRequestId(_ctx.stringValue("ChangeMcubeMiniTaskStatusResponse.RequestId"));
		changeMcubeMiniTaskStatusResponse.setResultCode(_ctx.stringValue("ChangeMcubeMiniTaskStatusResponse.ResultCode"));
		changeMcubeMiniTaskStatusResponse.setResultMessage(_ctx.stringValue("ChangeMcubeMiniTaskStatusResponse.ResultMessage"));

		ChangeMiniTaskStatusResult changeMiniTaskStatusResult = new ChangeMiniTaskStatusResult();
		changeMiniTaskStatusResult.setData(_ctx.stringValue("ChangeMcubeMiniTaskStatusResponse.ChangeMiniTaskStatusResult.Data"));
		changeMiniTaskStatusResult.setResultMsg(_ctx.stringValue("ChangeMcubeMiniTaskStatusResponse.ChangeMiniTaskStatusResult.ResultMsg"));
		changeMiniTaskStatusResult.setSuccess(_ctx.booleanValue("ChangeMcubeMiniTaskStatusResponse.ChangeMiniTaskStatusResult.Success"));
		changeMcubeMiniTaskStatusResponse.setChangeMiniTaskStatusResult(changeMiniTaskStatusResult);
	 
	 	return changeMcubeMiniTaskStatusResponse;
	}
}