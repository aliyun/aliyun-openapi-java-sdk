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
public class FailbackRequest extends RpcAcsRequest<FailbackResponse> {
	
	public FailbackRequest() {
		super("hdr", "2017-09-25", "Failback", "hdr");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String recoveryNetMask;

	private String recoveryComputeResource;

	private String recoveryPostScriptType;

	private Long recoveryMemory;

	private Integer recoveryCpu;

	private String recoveryIpAddress;

	private String securityToken;

	private String recoveryDns;

	private String recoveryLocation;

	private String recoveryInfrastructureId;

	private String recoveryInstanceName;

	private String recoveryGateway;

	private Boolean recoveryUseDhcp;

	private String recoveryNetwork;

	private String serverId;

	private String recoveryDatastore;

	private String recoveryPostScriptContent;

	private Boolean recoveryReserveIp;

	public String getRecoveryNetMask() {
		return this.recoveryNetMask;
	}

	public void setRecoveryNetMask(String recoveryNetMask) {
		this.recoveryNetMask = recoveryNetMask;
		if(recoveryNetMask != null){
			putQueryParameter("RecoveryNetMask", recoveryNetMask);
		}
	}

	public String getRecoveryComputeResource() {
		return this.recoveryComputeResource;
	}

	public void setRecoveryComputeResource(String recoveryComputeResource) {
		this.recoveryComputeResource = recoveryComputeResource;
		if(recoveryComputeResource != null){
			putQueryParameter("RecoveryComputeResource", recoveryComputeResource);
		}
	}

	public String getRecoveryPostScriptType() {
		return this.recoveryPostScriptType;
	}

	public void setRecoveryPostScriptType(String recoveryPostScriptType) {
		this.recoveryPostScriptType = recoveryPostScriptType;
		if(recoveryPostScriptType != null){
			putQueryParameter("RecoveryPostScriptType", recoveryPostScriptType);
		}
	}

	public Long getRecoveryMemory() {
		return this.recoveryMemory;
	}

	public void setRecoveryMemory(Long recoveryMemory) {
		this.recoveryMemory = recoveryMemory;
		if(recoveryMemory != null){
			putQueryParameter("RecoveryMemory", recoveryMemory.toString());
		}
	}

	public Integer getRecoveryCpu() {
		return this.recoveryCpu;
	}

	public void setRecoveryCpu(Integer recoveryCpu) {
		this.recoveryCpu = recoveryCpu;
		if(recoveryCpu != null){
			putQueryParameter("RecoveryCpu", recoveryCpu.toString());
		}
	}

	public String getRecoveryIpAddress() {
		return this.recoveryIpAddress;
	}

	public void setRecoveryIpAddress(String recoveryIpAddress) {
		this.recoveryIpAddress = recoveryIpAddress;
		if(recoveryIpAddress != null){
			putQueryParameter("RecoveryIpAddress", recoveryIpAddress);
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

	public String getRecoveryDns() {
		return this.recoveryDns;
	}

	public void setRecoveryDns(String recoveryDns) {
		this.recoveryDns = recoveryDns;
		if(recoveryDns != null){
			putQueryParameter("RecoveryDns", recoveryDns);
		}
	}

	public String getRecoveryLocation() {
		return this.recoveryLocation;
	}

	public void setRecoveryLocation(String recoveryLocation) {
		this.recoveryLocation = recoveryLocation;
		if(recoveryLocation != null){
			putQueryParameter("RecoveryLocation", recoveryLocation);
		}
	}

	public String getRecoveryInfrastructureId() {
		return this.recoveryInfrastructureId;
	}

	public void setRecoveryInfrastructureId(String recoveryInfrastructureId) {
		this.recoveryInfrastructureId = recoveryInfrastructureId;
		if(recoveryInfrastructureId != null){
			putQueryParameter("RecoveryInfrastructureId", recoveryInfrastructureId);
		}
	}

	public String getRecoveryInstanceName() {
		return this.recoveryInstanceName;
	}

	public void setRecoveryInstanceName(String recoveryInstanceName) {
		this.recoveryInstanceName = recoveryInstanceName;
		if(recoveryInstanceName != null){
			putQueryParameter("RecoveryInstanceName", recoveryInstanceName);
		}
	}

	public String getRecoveryGateway() {
		return this.recoveryGateway;
	}

	public void setRecoveryGateway(String recoveryGateway) {
		this.recoveryGateway = recoveryGateway;
		if(recoveryGateway != null){
			putQueryParameter("RecoveryGateway", recoveryGateway);
		}
	}

	public Boolean getRecoveryUseDhcp() {
		return this.recoveryUseDhcp;
	}

	public void setRecoveryUseDhcp(Boolean recoveryUseDhcp) {
		this.recoveryUseDhcp = recoveryUseDhcp;
		if(recoveryUseDhcp != null){
			putQueryParameter("RecoveryUseDhcp", recoveryUseDhcp.toString());
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

	public String getRecoveryDatastore() {
		return this.recoveryDatastore;
	}

	public void setRecoveryDatastore(String recoveryDatastore) {
		this.recoveryDatastore = recoveryDatastore;
		if(recoveryDatastore != null){
			putQueryParameter("RecoveryDatastore", recoveryDatastore);
		}
	}

	public String getRecoveryPostScriptContent() {
		return this.recoveryPostScriptContent;
	}

	public void setRecoveryPostScriptContent(String recoveryPostScriptContent) {
		this.recoveryPostScriptContent = recoveryPostScriptContent;
		if(recoveryPostScriptContent != null){
			putQueryParameter("RecoveryPostScriptContent", recoveryPostScriptContent);
		}
	}

	public Boolean getRecoveryReserveIp() {
		return this.recoveryReserveIp;
	}

	public void setRecoveryReserveIp(Boolean recoveryReserveIp) {
		this.recoveryReserveIp = recoveryReserveIp;
		if(recoveryReserveIp != null){
			putQueryParameter("RecoveryReserveIp", recoveryReserveIp.toString());
		}
	}

	@Override
	public Class<FailbackResponse> getResponseClass() {
		return FailbackResponse.class;
	}

}
