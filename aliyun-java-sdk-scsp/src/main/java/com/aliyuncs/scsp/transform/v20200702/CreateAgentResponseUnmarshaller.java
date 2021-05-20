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

package com.aliyuncs.scsp.transform.v20200702;

import com.aliyuncs.scsp.model.v20200702.CreateAgentResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAgentResponseUnmarshaller {

	public static CreateAgentResponse unmarshall(CreateAgentResponse createAgentResponse, UnmarshallerContext _ctx) {
		
		createAgentResponse.setRequestId(_ctx.stringValue("CreateAgentResponse.RequestId"));
		createAgentResponse.setMessage(_ctx.stringValue("CreateAgentResponse.Message"));
		createAgentResponse.setData(_ctx.longValue("CreateAgentResponse.Data"));
		createAgentResponse.setCode(_ctx.stringValue("CreateAgentResponse.Code"));
		createAgentResponse.setSuccess(_ctx.booleanValue("CreateAgentResponse.Success"));
		createAgentResponse.setHttpStatusCode(_ctx.longValue("CreateAgentResponse.HttpStatusCode"));
	 
	 	return createAgentResponse;
	}
}