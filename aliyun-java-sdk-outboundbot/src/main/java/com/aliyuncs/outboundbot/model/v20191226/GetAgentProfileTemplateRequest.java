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

package com.aliyuncs.outboundbot.model.v20191226;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.outboundbot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetAgentProfileTemplateRequest extends RpcAcsRequest<GetAgentProfileTemplateResponse> {
	   

	private String appIp;

	private String agentProfileTemplateId;
	public GetAgentProfileTemplateRequest() {
		super("OutboundBot", "2019-12-26", "GetAgentProfileTemplate", "outboundbot");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAppIp() {
		return this.appIp;
	}

	public void setAppIp(String appIp) {
		this.appIp = appIp;
		if(appIp != null){
			putBodyParameter("AppIp", appIp);
		}
	}

	public String getAgentProfileTemplateId() {
		return this.agentProfileTemplateId;
	}

	public void setAgentProfileTemplateId(String agentProfileTemplateId) {
		this.agentProfileTemplateId = agentProfileTemplateId;
		if(agentProfileTemplateId != null){
			putBodyParameter("AgentProfileTemplateId", agentProfileTemplateId);
		}
	}

	@Override
	public Class<GetAgentProfileTemplateResponse> getResponseClass() {
		return GetAgentProfileTemplateResponse.class;
	}

}
