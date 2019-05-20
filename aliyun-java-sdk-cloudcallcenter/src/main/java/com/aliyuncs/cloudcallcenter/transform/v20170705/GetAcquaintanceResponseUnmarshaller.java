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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import com.aliyuncs.cloudcallcenter.model.v20170705.GetAcquaintanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAcquaintanceResponseUnmarshaller {

	public static GetAcquaintanceResponse unmarshall(GetAcquaintanceResponse getAcquaintanceResponse, UnmarshallerContext context) {
		
		getAcquaintanceResponse.setRequestId(context.stringValue("GetAcquaintanceResponse.RequestId"));
		getAcquaintanceResponse.setSuccess(context.booleanValue("GetAcquaintanceResponse.Success"));
		getAcquaintanceResponse.setCode(context.stringValue("GetAcquaintanceResponse.Code"));
		getAcquaintanceResponse.setMessage(context.stringValue("GetAcquaintanceResponse.Message"));
		getAcquaintanceResponse.setHttpStatusCode(context.integerValue("GetAcquaintanceResponse.HttpStatusCode"));
		getAcquaintanceResponse.setAgentNo(context.stringValue("GetAcquaintanceResponse.AgentNo"));
		getAcquaintanceResponse.setAgentStatus(context.integerValue("GetAcquaintanceResponse.AgentStatus"));
	 
	 	return getAcquaintanceResponse;
	}
}