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

import com.aliyuncs.scsp.model.v20200702.DeleteAgentResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteAgentResponseUnmarshaller {

	public static DeleteAgentResponse unmarshall(DeleteAgentResponse deleteAgentResponse, UnmarshallerContext _ctx) {
		
		deleteAgentResponse.setRequestId(_ctx.stringValue("DeleteAgentResponse.RequestId"));
		deleteAgentResponse.setMessage(_ctx.stringValue("DeleteAgentResponse.Message"));
		deleteAgentResponse.setCode(_ctx.stringValue("DeleteAgentResponse.Code"));
		deleteAgentResponse.setSuccess(_ctx.booleanValue("DeleteAgentResponse.Success"));
	 
	 	return deleteAgentResponse;
	}
}