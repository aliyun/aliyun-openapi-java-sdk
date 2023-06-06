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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class InstallCloudMonitorRequest extends RpcAcsRequest<InstallCloudMonitorResponse> {
	   

	private String agentAccessKey;

	private String agentSecretKey;

	private List<String> uuidLists;

	private String argusVersion;

	private List<String> instanceIdLists;
	public InstallCloudMonitorRequest() {
		super("Sas", "2018-12-03", "InstallCloudMonitor");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAgentAccessKey() {
		return this.agentAccessKey;
	}

	public void setAgentAccessKey(String agentAccessKey) {
		this.agentAccessKey = agentAccessKey;
		if(agentAccessKey != null){
			putQueryParameter("AgentAccessKey", agentAccessKey);
		}
	}

	public String getAgentSecretKey() {
		return this.agentSecretKey;
	}

	public void setAgentSecretKey(String agentSecretKey) {
		this.agentSecretKey = agentSecretKey;
		if(agentSecretKey != null){
			putQueryParameter("AgentSecretKey", agentSecretKey);
		}
	}

	public List<String> getUuidLists() {
		return this.uuidLists;
	}

	public void setUuidLists(List<String> uuidLists) {
		this.uuidLists = uuidLists;	
		if (uuidLists != null) {
			for (int i = 0; i < uuidLists.size(); i++) {
				putQueryParameter("UuidList." + (i + 1) , uuidLists.get(i));
			}
		}	
	}

	public String getArgusVersion() {
		return this.argusVersion;
	}

	public void setArgusVersion(String argusVersion) {
		this.argusVersion = argusVersion;
		if(argusVersion != null){
			putQueryParameter("ArgusVersion", argusVersion);
		}
	}

	public List<String> getInstanceIdLists() {
		return this.instanceIdLists;
	}

	public void setInstanceIdLists(List<String> instanceIdLists) {
		this.instanceIdLists = instanceIdLists;	
		if (instanceIdLists != null) {
			for (int i = 0; i < instanceIdLists.size(); i++) {
				putQueryParameter("InstanceIdList." + (i + 1) , instanceIdLists.get(i));
			}
		}	
	}

	@Override
	public Class<InstallCloudMonitorResponse> getResponseClass() {
		return InstallCloudMonitorResponse.class;
	}

}
