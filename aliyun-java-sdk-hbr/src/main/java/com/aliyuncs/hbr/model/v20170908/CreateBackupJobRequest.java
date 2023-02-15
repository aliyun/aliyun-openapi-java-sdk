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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateBackupJobRequest extends RpcAcsRequest<CreateBackupJobResponse> {
	   

	private String containerClusterId;

	private String vaultId;

	private String containerResources;

	private String crossAccountType;

	private String crossAccountRoleName;

	private String options;

	private String sourceType;

	private String exclude;

	private String jobName;

	private Long retention;

	private String backupType;

	private String include;

	private Boolean initiatedByAck;

	private String clusterId;

	private String instanceId;

	private String speedLimit;

	private Long crossAccountUserId;
	public CreateBackupJobRequest() {
		super("hbr", "2017-09-08", "CreateBackupJob", "hbr");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getContainerClusterId() {
		return this.containerClusterId;
	}

	public void setContainerClusterId(String containerClusterId) {
		this.containerClusterId = containerClusterId;
		if(containerClusterId != null){
			putQueryParameter("ContainerClusterId", containerClusterId);
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

	public String getContainerResources() {
		return this.containerResources;
	}

	public void setContainerResources(String containerResources) {
		this.containerResources = containerResources;
		if(containerResources != null){
			putQueryParameter("ContainerResources", containerResources);
		}
	}

	public String getCrossAccountType() {
		return this.crossAccountType;
	}

	public void setCrossAccountType(String crossAccountType) {
		this.crossAccountType = crossAccountType;
		if(crossAccountType != null){
			putQueryParameter("CrossAccountType", crossAccountType);
		}
	}

	public String getCrossAccountRoleName() {
		return this.crossAccountRoleName;
	}

	public void setCrossAccountRoleName(String crossAccountRoleName) {
		this.crossAccountRoleName = crossAccountRoleName;
		if(crossAccountRoleName != null){
			putQueryParameter("CrossAccountRoleName", crossAccountRoleName);
		}
	}

	public String getOptions() {
		return this.options;
	}

	public void setOptions(String options) {
		this.options = options;
		if(options != null){
			putQueryParameter("Options", options);
		}
	}

	public String getSourceType() {
		return this.sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
		if(sourceType != null){
			putQueryParameter("SourceType", sourceType);
		}
	}

	public String getExclude() {
		return this.exclude;
	}

	public void setExclude(String exclude) {
		this.exclude = exclude;
		if(exclude != null){
			putQueryParameter("Exclude", exclude);
		}
	}

	public String getJobName() {
		return this.jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
		if(jobName != null){
			putQueryParameter("JobName", jobName);
		}
	}

	public Long getRetention() {
		return this.retention;
	}

	public void setRetention(Long retention) {
		this.retention = retention;
		if(retention != null){
			putQueryParameter("Retention", retention.toString());
		}
	}

	public String getBackupType() {
		return this.backupType;
	}

	public void setBackupType(String backupType) {
		this.backupType = backupType;
		if(backupType != null){
			putQueryParameter("BackupType", backupType);
		}
	}

	public String getInclude() {
		return this.include;
	}

	public void setInclude(String include) {
		this.include = include;
		if(include != null){
			putQueryParameter("Include", include);
		}
	}

	public Boolean getInitiatedByAck() {
		return this.initiatedByAck;
	}

	public void setInitiatedByAck(Boolean initiatedByAck) {
		this.initiatedByAck = initiatedByAck;
		if(initiatedByAck != null){
			putQueryParameter("InitiatedByAck", initiatedByAck.toString());
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

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getSpeedLimit() {
		return this.speedLimit;
	}

	public void setSpeedLimit(String speedLimit) {
		this.speedLimit = speedLimit;
		if(speedLimit != null){
			putQueryParameter("SpeedLimit", speedLimit);
		}
	}

	public Long getCrossAccountUserId() {
		return this.crossAccountUserId;
	}

	public void setCrossAccountUserId(Long crossAccountUserId) {
		this.crossAccountUserId = crossAccountUserId;
		if(crossAccountUserId != null){
			putQueryParameter("CrossAccountUserId", crossAccountUserId.toString());
		}
	}

	@Override
	public Class<CreateBackupJobResponse> getResponseClass() {
		return CreateBackupJobResponse.class;
	}

}
