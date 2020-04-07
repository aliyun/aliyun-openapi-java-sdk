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

package com.aliyuncs.hbr.model.v20170908;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateHanaRestoreRequest extends RpcAcsRequest<UpdateHanaRestoreResponse> {
	   

	private Long sysEndTime;

	private String vaultId;

	private Long sysStartTime;

	private Long databaseRestoreId;

	private Long maxProgress;

	private Integer currentPhase;

	private Long utcStartTime;

	private String serviceName;

	private String state;

	private String phase;

	private Long utcReachedTime;

	private String restoreId;

	private Integer maxPhase;

	private String clusterId;

	private String message;

	private Long currentProgress;

	private Long utcEndTime;

	private String token;

	private Long sysReachedTime;

	private String status;
	public UpdateHanaRestoreRequest() {
		super("hbr", "2017-09-08", "UpdateHanaRestore", "hbr");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getSysEndTime() {
		return this.sysEndTime;
	}

	public void setSysEndTime(Long sysEndTime) {
		this.sysEndTime = sysEndTime;
		if(sysEndTime != null){
			putQueryParameter("SysEndTime", sysEndTime.toString());
		}
	}

	public String getVaultId() {
		return this.vaultId;
	}

	public void setVaultId(String vaultId) {
		this.vaultId = vaultId;
		if(vaultId != null){
			putQueryParameter("VaultId", vaultId);
		}
	}

	public Long getSysStartTime() {
		return this.sysStartTime;
	}

	public void setSysStartTime(Long sysStartTime) {
		this.sysStartTime = sysStartTime;
		if(sysStartTime != null){
			putQueryParameter("SysStartTime", sysStartTime.toString());
		}
	}

	public Long getDatabaseRestoreId() {
		return this.databaseRestoreId;
	}

	public void setDatabaseRestoreId(Long databaseRestoreId) {
		this.databaseRestoreId = databaseRestoreId;
		if(databaseRestoreId != null){
			putQueryParameter("DatabaseRestoreId", databaseRestoreId.toString());
		}
	}

	public Long getMaxProgress() {
		return this.maxProgress;
	}

	public void setMaxProgress(Long maxProgress) {
		this.maxProgress = maxProgress;
		if(maxProgress != null){
			putQueryParameter("MaxProgress", maxProgress.toString());
		}
	}

	public Integer getCurrentPhase() {
		return this.currentPhase;
	}

	public void setCurrentPhase(Integer currentPhase) {
		this.currentPhase = currentPhase;
		if(currentPhase != null){
			putQueryParameter("CurrentPhase", currentPhase.toString());
		}
	}

	public Long getUtcStartTime() {
		return this.utcStartTime;
	}

	public void setUtcStartTime(Long utcStartTime) {
		this.utcStartTime = utcStartTime;
		if(utcStartTime != null){
			putQueryParameter("UtcStartTime", utcStartTime.toString());
		}
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
		if(serviceName != null){
			putQueryParameter("ServiceName", serviceName);
		}
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
		if(state != null){
			putQueryParameter("State", state);
		}
	}

	public String getPhase() {
		return this.phase;
	}

	public void setPhase(String phase) {
		this.phase = phase;
		if(phase != null){
			putQueryParameter("Phase", phase);
		}
	}

	public Long getUtcReachedTime() {
		return this.utcReachedTime;
	}

	public void setUtcReachedTime(Long utcReachedTime) {
		this.utcReachedTime = utcReachedTime;
		if(utcReachedTime != null){
			putQueryParameter("UtcReachedTime", utcReachedTime.toString());
		}
	}

	public String getRestoreId() {
		return this.restoreId;
	}

	public void setRestoreId(String restoreId) {
		this.restoreId = restoreId;
		if(restoreId != null){
			putQueryParameter("RestoreId", restoreId);
		}
	}

	public Integer getMaxPhase() {
		return this.maxPhase;
	}

	public void setMaxPhase(Integer maxPhase) {
		this.maxPhase = maxPhase;
		if(maxPhase != null){
			putQueryParameter("MaxPhase", maxPhase.toString());
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
		if(message != null){
			putQueryParameter("Message", message);
		}
	}

	public Long getCurrentProgress() {
		return this.currentProgress;
	}

	public void setCurrentProgress(Long currentProgress) {
		this.currentProgress = currentProgress;
		if(currentProgress != null){
			putQueryParameter("CurrentProgress", currentProgress.toString());
		}
	}

	public Long getUtcEndTime() {
		return this.utcEndTime;
	}

	public void setUtcEndTime(Long utcEndTime) {
		this.utcEndTime = utcEndTime;
		if(utcEndTime != null){
			putQueryParameter("UtcEndTime", utcEndTime.toString());
		}
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putQueryParameter("Token", token);
		}
	}

	public Long getSysReachedTime() {
		return this.sysReachedTime;
	}

	public void setSysReachedTime(Long sysReachedTime) {
		this.sysReachedTime = sysReachedTime;
		if(sysReachedTime != null){
			putQueryParameter("SysReachedTime", sysReachedTime.toString());
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	@Override
	public Class<UpdateHanaRestoreResponse> getResponseClass() {
		return UpdateHanaRestoreResponse.class;
	}

}
