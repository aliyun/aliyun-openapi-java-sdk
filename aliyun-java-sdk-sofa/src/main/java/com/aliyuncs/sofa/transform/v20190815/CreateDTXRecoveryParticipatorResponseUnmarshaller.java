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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.CreateDTXRecoveryParticipatorResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDTXRecoveryParticipatorResponseUnmarshaller {

	public static CreateDTXRecoveryParticipatorResponse unmarshall(CreateDTXRecoveryParticipatorResponse createDTXRecoveryParticipatorResponse, UnmarshallerContext _ctx) {
		
		createDTXRecoveryParticipatorResponse.setRequestId(_ctx.stringValue("CreateDTXRecoveryParticipatorResponse.RequestId"));
		createDTXRecoveryParticipatorResponse.setResultCode(_ctx.stringValue("CreateDTXRecoveryParticipatorResponse.ResultCode"));
		createDTXRecoveryParticipatorResponse.setResultMessage(_ctx.stringValue("CreateDTXRecoveryParticipatorResponse.ResultMessage"));
		createDTXRecoveryParticipatorResponse.setMsg(_ctx.stringValue("CreateDTXRecoveryParticipatorResponse.Msg"));
		createDTXRecoveryParticipatorResponse.setSuccess(_ctx.booleanValue("CreateDTXRecoveryParticipatorResponse.Success"));
	 
	 	return createDTXRecoveryParticipatorResponse;
	}
}