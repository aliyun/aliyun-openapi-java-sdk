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
import com.aliyuncs.hdr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ForcedFailoverRequest extends RpcAcsRequest<ForcedFailoverResponse> {
	
	public ForcedFailoverRequest() {
		super("hdr", "2017-09-25", "ForcedFailover", "hdr");
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String recoveryPointId;

	private String eipAddressId;

	private String recoveryPostScriptType;

	private Boolean recoveryUseDhcp;

	private String recoveryNetwork;

	private String serverId;

	private Long recoveryMemory;

	private Integer recoveryCpu;

	private String recoveryIpAddress;

	private String recoveryPostScriptContent;

	private String recoveryInstanceName;

	private Boolean recoveryUseSsd;

	private Boolean recoveryReserveIp;

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

	public String getRecoveryPostScriptType() {
		return this.recoveryPostScriptType;
	}

	public void setRecoveryPostScriptType(String recoveryPostScriptType) {
		this.recoveryPostScriptType = recoveryPostScriptType;
		if(recoveryPostScriptType != null){
			putQueryParameter("RecoveryPostScriptType", recoveryPostScriptType);
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

	public String getRecoveryPostScriptContent() {
		return this.recoveryPostScriptContent;
	}

	public void setRecoveryPostScriptContent(String recoveryPostScriptContent) {
		this.recoveryPostScriptContent = recoveryPostScriptContent;
		if(recoveryPostScriptContent != null){
			putQueryParameter("RecoveryPostScriptContent", recoveryPostScriptContent);
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
	public Class<ForcedFailoverResponse> getResponseClass() {
		return ForcedFailoverResponse.class;
	}

}
