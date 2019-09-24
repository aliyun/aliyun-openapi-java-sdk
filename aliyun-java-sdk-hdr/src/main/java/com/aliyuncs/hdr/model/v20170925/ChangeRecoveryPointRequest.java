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
public class ChangeRecoveryPointRequest extends RpcAcsRequest<ChangeRecoveryPointResponse> {
	
	public ChangeRecoveryPointRequest() {
		super("hdr", "2017-09-25", "ChangeRecoveryPoint", "hdr");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String recoveryPostScriptType;

	private Long recoveryMemory;

	private Integer recoveryCpu;

	private String recoveryIpAddress;

	private String securityToken;

	private String recoveryInstanceName;

	private Boolean recoveryUseSsd;

	private String recoveryPointId;

	private String eipAddressId;

	private Boolean recoveryUseDhcp;

	private String recoveryNetwork;

	private String serverId;

	private String recoveryPostScriptContent;

	private Boolean recoveryUseEssd;

	private Boolean recoveryReserveIp;

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

	public String getRecoveryInstanceName() {
		return this.recoveryInstanceName;
	}

	public void setRecoveryInstanceName(String recoveryInstanceName) {
		this.recoveryInstanceName = recoveryInstanceName;
		if(recoveryInstanceName != null){
			putQueryParameter("RecoveryInstanceName", recoveryInstanceName);
		}
	}

	public Boolean getRecoveryUseSsd() {
		return this.recoveryUseSsd;
	}

	public void setRecoveryUseSsd(Boolean recoveryUseSsd) {
		this.recoveryUseSsd = recoveryUseSsd;
		if(recoveryUseSsd != null){
			putQueryParameter("RecoveryUseSsd", recoveryUseSsd.toString());
		}
	}

	public String getRecoveryPointId() {
		return this.recoveryPointId;
	}

	public void setRecoveryPointId(String recoveryPointId) {
		this.recoveryPointId = recoveryPointId;
		if(recoveryPointId != null){
			putQueryParameter("RecoveryPointId", recoveryPointId);
		}
	}

	public String getEipAddressId() {
		return this.eipAddressId;
	}

	public void setEipAddressId(String eipAddressId) {
		this.eipAddressId = eipAddressId;
		if(eipAddressId != null){
			putQueryParameter("EipAddressId", eipAddressId);
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

	public String getRecoveryPostScriptContent() {
		return this.recoveryPostScriptContent;
	}

	public void setRecoveryPostScriptContent(String recoveryPostScriptContent) {
		this.recoveryPostScriptContent = recoveryPostScriptContent;
		if(recoveryPostScriptContent != null){
			putQueryParameter("RecoveryPostScriptContent", recoveryPostScriptContent);
		}
	}

	public Boolean getRecoveryUseEssd() {
		return this.recoveryUseEssd;
	}

	public void setRecoveryUseEssd(Boolean recoveryUseEssd) {
		this.recoveryUseEssd = recoveryUseEssd;
		if(recoveryUseEssd != null){
			putQueryParameter("RecoveryUseEssd", recoveryUseEssd.toString());
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
	public Class<ChangeRecoveryPointResponse> getResponseClass() {
		return ChangeRecoveryPointResponse.class;
	}

}
