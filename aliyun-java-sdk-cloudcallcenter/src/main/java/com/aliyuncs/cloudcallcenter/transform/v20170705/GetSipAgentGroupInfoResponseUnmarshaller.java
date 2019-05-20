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

import com.aliyuncs.cloudcallcenter.model.v20170705.GetSipAgentGroupInfoResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetSipAgentGroupInfoResponse.SipAgent;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSipAgentGroupInfoResponseUnmarshaller {

	public static GetSipAgentGroupInfoResponse unmarshall(GetSipAgentGroupInfoResponse getSipAgentGroupInfoResponse, UnmarshallerContext context) {
		
		getSipAgentGroupInfoResponse.setRequestId(context.stringValue("GetSipAgentGroupInfoResponse.RequestId"));
		getSipAgentGroupInfoResponse.setSuccess(context.booleanValue("GetSipAgentGroupInfoResponse.Success"));
		getSipAgentGroupInfoResponse.setCode(context.stringValue("GetSipAgentGroupInfoResponse.Code"));
		getSipAgentGroupInfoResponse.setMessage(context.stringValue("GetSipAgentGroupInfoResponse.Message"));
		getSipAgentGroupInfoResponse.setHttpStatusCode(context.integerValue("GetSipAgentGroupInfoResponse.HttpStatusCode"));
		getSipAgentGroupInfoResponse.setProvider(context.stringValue("GetSipAgentGroupInfoResponse.Provider"));

		List<SipAgent> sipAgents = new ArrayList<SipAgent>();
		for (int i = 0; i < context.lengthValue("GetSipAgentGroupInfoResponse.SipAgents.Length"); i++) {
			SipAgent sipAgent = new SipAgent();
			sipAgent.setId(context.longValue("GetSipAgentGroupInfoResponse.SipAgents["+ i +"].Id"));
			sipAgent.setName(context.stringValue("GetSipAgentGroupInfoResponse.SipAgents["+ i +"].Name"));
			sipAgent.setIp(context.stringValue("GetSipAgentGroupInfoResponse.SipAgents["+ i +"].Ip"));
			sipAgent.setPort(context.stringValue("GetSipAgentGroupInfoResponse.SipAgents["+ i +"].Port"));
			sipAgent.setSendInterface(context.integerValue("GetSipAgentGroupInfoResponse.SipAgents["+ i +"].SendInterface"));
			sipAgent.setStatus(context.booleanValue("GetSipAgentGroupInfoResponse.SipAgents["+ i +"].Status"));

			sipAgents.add(sipAgent);
		}
		getSipAgentGroupInfoResponse.setSipAgents(sipAgents);
	 
	 	return getSipAgentGroupInfoResponse;
	}
}