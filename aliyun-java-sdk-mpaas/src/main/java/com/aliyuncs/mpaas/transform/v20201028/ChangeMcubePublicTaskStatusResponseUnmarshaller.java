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

import com.aliyuncs.mpaas.model.v20201028.ChangeMcubePublicTaskStatusResponse;
import com.aliyuncs.mpaas.model.v20201028.ChangeMcubePublicTaskStatusResponse.ResultContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class ChangeMcubePublicTaskStatusResponseUnmarshaller {

	public static ChangeMcubePublicTaskStatusResponse unmarshall(ChangeMcubePublicTaskStatusResponse changeMcubePublicTaskStatusResponse, UnmarshallerContext _ctx) {
		
		changeMcubePublicTaskStatusResponse.setRequestId(_ctx.stringValue("ChangeMcubePublicTaskStatusResponse.RequestId"));
		changeMcubePublicTaskStatusResponse.setResultCode(_ctx.stringValue("ChangeMcubePublicTaskStatusResponse.ResultCode"));
		changeMcubePublicTaskStatusResponse.setResultMessage(_ctx.stringValue("ChangeMcubePublicTaskStatusResponse.ResultMessage"));

		ResultContent resultContent = new ResultContent();
		resultContent.setErrorCode(_ctx.stringValue("ChangeMcubePublicTaskStatusResponse.ResultContent.ErrorCode"));
		resultContent.setResultMsg(_ctx.stringValue("ChangeMcubePublicTaskStatusResponse.ResultContent.ResultMsg"));
		resultContent.setData(_ctx.stringValue("ChangeMcubePublicTaskStatusResponse.ResultContent.Data"));
		resultContent.setSuccess(_ctx.booleanValue("ChangeMcubePublicTaskStatusResponse.ResultContent.Success"));
		resultContent.setRequestId(_ctx.stringValue("ChangeMcubePublicTaskStatusResponse.ResultContent.RequestId"));
		changeMcubePublicTaskStatusResponse.setResultContent(resultContent);
	 
	 	return changeMcubePublicTaskStatusResponse;
	}
}