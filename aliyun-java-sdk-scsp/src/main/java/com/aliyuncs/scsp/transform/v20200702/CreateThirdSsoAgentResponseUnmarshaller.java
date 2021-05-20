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

import com.aliyuncs.scsp.model.v20200702.CreateThirdSsoAgentResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateThirdSsoAgentResponseUnmarshaller {

	public static CreateThirdSsoAgentResponse unmarshall(CreateThirdSsoAgentResponse createThirdSsoAgentResponse, UnmarshallerContext _ctx) {
		
		createThirdSsoAgentResponse.setRequestId(_ctx.stringValue("CreateThirdSsoAgentResponse.RequestId"));
		createThirdSsoAgentResponse.setMessage(_ctx.stringValue("CreateThirdSsoAgentResponse.Message"));
		createThirdSsoAgentResponse.setHttpStatusCode(_ctx.longValue("CreateThirdSsoAgentResponse.HttpStatusCode"));
		createThirdSsoAgentResponse.setData(_ctx.longValue("CreateThirdSsoAgentResponse.Data"));
		createThirdSsoAgentResponse.setCode(_ctx.stringValue("CreateThirdSsoAgentResponse.Code"));
		createThirdSsoAgentResponse.setSuccess(_ctx.booleanValue("CreateThirdSsoAgentResponse.Success"));
	 
	 	return createThirdSsoAgentResponse;
	}
}