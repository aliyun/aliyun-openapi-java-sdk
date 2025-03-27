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
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.outboundbot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteAgentProfilesRequest extends RpcAcsRequest<DeleteAgentProfilesResponse> {
	   

	private String appIp;

	@SerializedName("agentProfileIds")
	private List<String> agentProfileIds;
	public DeleteAgentProfilesRequest() {
		super("OutboundBot", "2019-12-26", "DeleteAgentProfiles", "outboundbot");
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

	public List<String> getAgentProfileIds() {
		return this.agentProfileIds;
	}

	public void setAgentProfileIds(List<String> agentProfileIds) {
		this.agentProfileIds = agentProfileIds;	
		if (agentProfileIds != null) {
			putBodyParameter("AgentProfileIds" , new Gson().toJson(agentProfileIds));
		}	
	}

	@Override
	public Class<DeleteAgentProfilesResponse> getResponseClass() {
		return DeleteAgentProfilesResponse.class;
	}

}
