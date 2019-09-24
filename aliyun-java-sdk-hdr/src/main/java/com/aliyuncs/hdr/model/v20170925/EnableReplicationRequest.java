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

package com.aliyuncs.hdr.model.v20170925;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hdr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class EnableReplicationRequest extends RpcAcsRequest<EnableReplicationResponse> {
	
	public EnableReplicationRequest() {
		super("hdr", "2017-09-25", "EnableReplication", "hdr");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Boolean replicationUseSsd;

	private Boolean replicationUseEssd;

	private String recoveryNetwork;

	private String serverId;

	private String appConsistentPointPolicy;

	private String securityToken;

	private String replicationNetwork;

	private String crashConsistentPointPolicy;

	public Boolean getReplicationUseSsd() {
		return this.replicationUseSsd;
	}

	public void setReplicationUseSsd(Boolean replicationUseSsd) {
		this.replicationUseSsd = replicationUseSsd;
		if(replicationUseSsd != null){
			putQueryParameter("ReplicationUseSsd", replicationUseSsd.toString());
		}
	}

	public Boolean getReplicationUseEssd() {
		return this.replicationUseEssd;
	}

	public void setReplicationUseEssd(Boolean replicationUseEssd) {
		this.replicationUseEssd = replicationUseEssd;
		if(replicationUseEssd != null){
			putQueryParameter("ReplicationUseEssd", replicationUseEssd.toString());
		}
	}

	public String getRecoveryNetwork() {
		return this.recoveryNetwork;
	}

	public void setRecoveryNetwork(String recoveryNetwork) {
		this.recoveryNetwork = recoveryNetwork;
		if(recoveryNetwork != null){
			putQueryParameter("RecoveryNetwork", recoveryNetwork);
		}
	}

	public String getServerId() {
		return this.serverId;
	}

	public void setServerId(String serverId) {
		this.serverId = serverId;
		if(serverId != null){
			putQueryParameter("ServerId", serverId);
		}
	}

	public String getAppConsistentPointPolicy() {
		return this.appConsistentPointPolicy;
	}

	public void setAppConsistentPointPolicy(String appConsistentPointPolicy) {
		this.appConsistentPointPolicy = appConsistentPointPolicy;
		if(appConsistentPointPolicy != null){
			putQueryParameter("AppConsistentPointPolicy", appConsistentPointPolicy);
		}
	}

	public String getBizSecurityToken() {
		return this.securityToken;
	}

	public void setBizSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	/**
	 * @deprecated use getBizSecurityToken instead of this.
	 */
	@Deprecated
	public String getSecurityToken() {
		return this.securityToken;
	}

	/**
	 * @deprecated use setBizSecurityToken instead of this.
	 */
	@Deprecated
	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public String getReplicationNetwork() {
		return this.replicationNetwork;
	}

	public void setReplicationNetwork(String replicationNetwork) {
		this.replicationNetwork = replicationNetwork;
		if(replicationNetwork != null){
			putQueryParameter("ReplicationNetwork", replicationNetwork);
		}
	}

	public String getCrashConsistentPointPolicy() {
		return this.crashConsistentPointPolicy;
	}

	public void setCrashConsistentPointPolicy(String crashConsistentPointPolicy) {
		this.crashConsistentPointPolicy = crashConsistentPointPolicy;
		if(crashConsistentPointPolicy != null){
			putQueryParameter("CrashConsistentPointPolicy", crashConsistentPointPolicy);
		}
	}

	@Override
	public Class<EnableReplicationResponse> getResponseClass() {
		return EnableReplicationResponse.class;
	}

}
