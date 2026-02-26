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

package com.aliyuncs.outboundbot.transform.v20191226;

import com.aliyuncs.outboundbot.model.v20191226.DeleteAgentProfilesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteAgentProfilesResponseUnmarshaller {

	public static DeleteAgentProfilesResponse unmarshall(DeleteAgentProfilesResponse deleteAgentProfilesResponse, UnmarshallerContext _ctx) {
		
		deleteAgentProfilesResponse.setRequestId(_ctx.stringValue("DeleteAgentProfilesResponse.RequestId"));
		deleteAgentProfilesResponse.setSuccess(_ctx.booleanValue("DeleteAgentProfilesResponse.Success"));
		deleteAgentProfilesResponse.setCode(_ctx.stringValue("DeleteAgentProfilesResponse.Code"));
		deleteAgentProfilesResponse.setMessage(_ctx.stringValue("DeleteAgentProfilesResponse.Message"));
		deleteAgentProfilesResponse.setData(_ctx.stringValue("DeleteAgentProfilesResponse.Data"));
		deleteAgentProfilesResponse.setHttpStatusCode(_ctx.integerValue("DeleteAgentProfilesResponse.HttpStatusCode"));
	 
	 	return deleteAgentProfilesResponse;
	}
}