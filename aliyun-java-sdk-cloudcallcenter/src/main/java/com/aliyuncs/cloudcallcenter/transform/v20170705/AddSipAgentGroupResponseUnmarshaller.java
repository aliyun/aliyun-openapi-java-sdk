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

import com.aliyuncs.cloudcallcenter.model.v20170705.AddSipAgentGroupResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.AddSipAgentGroupResponse.SipAgent;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddSipAgentGroupResponseUnmarshaller {

	public static AddSipAgentGroupResponse unmarshall(AddSipAgentGroupResponse addSipAgentGroupResponse, UnmarshallerContext context) {
		
		addSipAgentGroupResponse.setRequestId(context.stringValue("AddSipAgentGroupResponse.RequestId"));
		addSipAgentGroupResponse.setSuccess(context.booleanValue("AddSipAgentGroupResponse.Success"));
		addSipAgentGroupResponse.setCode(context.stringValue("AddSipAgentGroupResponse.Code"));
		addSipAgentGroupResponse.setMessage(context.stringValue("AddSipAgentGroupResponse.Message"));
		addSipAgentGroupResponse.setHttpStatusCode(context.integerValue("AddSipAgentGroupResponse.HttpStatusCode"));
		addSipAgentGroupResponse.setProvider(context.stringValue("AddSipAgentGroupResponse.Provider"));

		List<SipAgent> sipAgents = new ArrayList<SipAgent>();
		for (int i = 0; i < context.lengthValue("AddSipAgentGroupResponse.SipAgents.Length"); i++) {
			SipAgent sipAgent = new SipAgent();
			sipAgent.setId(context.longValue("AddSipAgentGroupResponse.SipAgents["+ i +"].Id"));
			sipAgent.setName(context.stringValue("AddSipAgentGroupResponse.SipAgents["+ i +"].Name"));
			sipAgent.setIp(context.stringValue("AddSipAgentGroupResponse.SipAgents["+ i +"].Ip"));
			sipAgent.setPort(context.stringValue("AddSipAgentGroupResponse.SipAgents["+ i +"].Port"));
			sipAgent.setSendInterface(context.integerValue("AddSipAgentGroupResponse.SipAgents["+ i +"].SendInterface"));
			sipAgent.setStatus(context.booleanValue("AddSipAgentGroupResponse.SipAgents["+ i +"].Status"));

			sipAgents.add(sipAgent);
		}
		addSipAgentGroupResponse.setSipAgents(sipAgents);
	 
	 	return addSipAgentGroupResponse;
	}
}