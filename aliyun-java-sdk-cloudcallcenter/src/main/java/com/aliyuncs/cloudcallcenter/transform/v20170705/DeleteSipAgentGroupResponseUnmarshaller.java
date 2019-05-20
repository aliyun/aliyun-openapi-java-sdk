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

import com.aliyuncs.cloudcallcenter.model.v20170705.DeleteSipAgentGroupResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.DeleteSipAgentGroupResponse.SipAgent;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteSipAgentGroupResponseUnmarshaller {

	public static DeleteSipAgentGroupResponse unmarshall(DeleteSipAgentGroupResponse deleteSipAgentGroupResponse, UnmarshallerContext context) {
		
		deleteSipAgentGroupResponse.setRequestId(context.stringValue("DeleteSipAgentGroupResponse.RequestId"));
		deleteSipAgentGroupResponse.setSuccess(context.booleanValue("DeleteSipAgentGroupResponse.Success"));
		deleteSipAgentGroupResponse.setCode(context.stringValue("DeleteSipAgentGroupResponse.Code"));
		deleteSipAgentGroupResponse.setMessage(context.stringValue("DeleteSipAgentGroupResponse.Message"));
		deleteSipAgentGroupResponse.setHttpStatusCode(context.integerValue("DeleteSipAgentGroupResponse.HttpStatusCode"));
		deleteSipAgentGroupResponse.setProvider(context.stringValue("DeleteSipAgentGroupResponse.Provider"));

		List<SipAgent> sipAgents = new ArrayList<SipAgent>();
		for (int i = 0; i < context.lengthValue("DeleteSipAgentGroupResponse.SipAgents.Length"); i++) {
			SipAgent sipAgent = new SipAgent();
			sipAgent.setId(context.longValue("DeleteSipAgentGroupResponse.SipAgents["+ i +"].Id"));
			sipAgent.setName(context.stringValue("DeleteSipAgentGroupResponse.SipAgents["+ i +"].Name"));
			sipAgent.setIp(context.stringValue("DeleteSipAgentGroupResponse.SipAgents["+ i +"].Ip"));
			sipAgent.setPort(context.stringValue("DeleteSipAgentGroupResponse.SipAgents["+ i +"].Port"));
			sipAgent.setSendInterface(context.integerValue("DeleteSipAgentGroupResponse.SipAgents["+ i +"].SendInterface"));
			sipAgent.setStatus(context.booleanValue("DeleteSipAgentGroupResponse.SipAgents["+ i +"].Status"));

			sipAgents.add(sipAgent);
		}
		deleteSipAgentGroupResponse.setSipAgents(sipAgents);
	 
	 	return deleteSipAgentGroupResponse;
	}
}