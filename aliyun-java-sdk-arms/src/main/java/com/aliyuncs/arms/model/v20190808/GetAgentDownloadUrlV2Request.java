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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetAgentDownloadUrlV2Request extends RpcAcsRequest<GetAgentDownloadUrlV2Response> {
	   

	private String archType;

	private String osType;

	private String agentType;
	public GetAgentDownloadUrlV2Request() {
		super("ARMS", "2019-08-08", "GetAgentDownloadUrlV2", "arms");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getArchType() {
		return this.archType;
	}

	public void setArchType(String archType) {
		this.archType = archType;
		if(archType != null){
			putQueryParameter("ArchType", archType);
		}
	}

	public String getOsType() {
		return this.osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
		if(osType != null){
			putQueryParameter("OsType", osType);
		}
	}

	public String getAgentType() {
		return this.agentType;
	}

	public void setAgentType(String agentType) {
		this.agentType = agentType;
		if(agentType != null){
			putQueryParameter("AgentType", agentType);
		}
	}

	@Override
	public Class<GetAgentDownloadUrlV2Response> getResponseClass() {
		return GetAgentDownloadUrlV2Response.class;
	}

}
