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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.ModifySipAgentGroupResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ModifySipAgentGroupResponse.SipAgent;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifySipAgentGroupResponseUnmarshaller {

	public static ModifySipAgentGroupResponse unmarshall(ModifySipAgentGroupResponse modifySipAgentGroupResponse, UnmarshallerContext context) {
		
		modifySipAgentGroupResponse.setRequestId(context.stringValue("ModifySipAgentGroupResponse.RequestId"));
		modifySipAgentGroupResponse.setSuccess(context.booleanValue("ModifySipAgentGroupResponse.Success"));
		modifySipAgentGroupResponse.setCode(context.stringValue("ModifySipAgentGroupResponse.Code"));
		modifySipAgentGroupResponse.setMessage(context.stringValue("ModifySipAgentGroupResponse.Message"));
		modifySipAgentGroupResponse.setHttpStatusCode(context.integerValue("ModifySipAgentGroupResponse.HttpStatusCode"));
		modifySipAgentGroupResponse.setProvider(context.stringValue("ModifySipAgentGroupResponse.Provider"));

		List<SipAgent> sipAgents = new ArrayList<SipAgent>();
		for (int i = 0; i < context.lengthValue("ModifySipAgentGroupResponse.SipAgents.Length"); i++) {
			SipAgent sipAgent = new SipAgent();
			sipAgent.setId(context.longValue("ModifySipAgentGroupResponse.SipAgents["+ i +"].Id"));
			sipAgent.setName(context.stringValue("ModifySipAgentGroupResponse.SipAgents["+ i +"].Name"));
			sipAgent.setIp(context.stringValue("ModifySipAgentGroupResponse.SipAgents["+ i +"].Ip"));
			sipAgent.setPort(context.stringValue("ModifySipAgentGroupResponse.SipAgents["+ i +"].Port"));
			sipAgent.setSendInterface(context.integerValue("ModifySipAgentGroupResponse.SipAgents["+ i +"].SendInterface"));
			sipAgent.setStatus(context.booleanValue("ModifySipAgentGroupResponse.SipAgents["+ i +"].Status"));

			sipAgents.add(sipAgent);
		}
		modifySipAgentGroupResponse.setSipAgents(sipAgents);
	 
	 	return modifySipAgentGroupResponse;
	}
}