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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateBackupPlanRequest extends RpcAcsRequest<CreateBackupPlanResponse> {
	   

	private String clientId;

	private String vaultId;

	private String prefix;

	private List<String> paths;

	private String planName;

	private String options;

	private String sourceType;

	private String exclude;

	private String backupType;

	private Long retention;

	private String fileSystemId;

	private String include;

	private Long createTime;

	private String clusterId;

	private String bucket;

	private String schedule;

	private String instanceId;

	private String speedLimit;

	private String dataSourceId;

	private String detail;

	private String backupSourceGroupId;

	private String udmRegionId;
	public CreateBackupPlanRequest() {
		super("hbr", "2017-09-08", "CreateBackupPlan", "hbr");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientId() {
		return this.clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
		if(clientId != null){
			putBodyParameter("ClientId", clientId);
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

	public String getPrefix() {
		return this.prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
		if(prefix != null){
			putQueryParameter("Prefix", prefix);
		}
	}

	public List<String> getPaths() {
		return this.paths;
	}

	public void setPaths(List<String> paths) {
		this.paths = paths;	
		if (paths != null) {
			for (int i = 0; i < paths.size(); i++) {
				putBodyParameter("Path." + (i + 1) , paths.get(i));
			}
		}	
	}

	public String getPlanName() {
		return this.planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
		if(planName != null){
			putQueryParameter("PlanName", planName);
		}
	}

	public String getOptions() {
		return this.options;
	}

	public void setOptions(String options) {
		this.options = options;
		if(options != null){
			putBodyParameter("Options", options);
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
			putBodyParameter("Exclude", exclude);
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

	public Long getRetention() {
		return this.retention;
	}

	public void setRetention(Long retention) {
		this.retention = retention;
		if(retention != null){
			putQueryParameter("Retention", retention.toString());
		}
	}

	public String getFileSystemId() {
		return this.fileSystemId;
	}

	public void setFileSystemId(String fileSystemId) {
		this.fileSystemId = fileSystemId;
		if(fileSystemId != null){
			putQueryParameter("FileSystemId", fileSystemId);
		}
	}

	public String getInclude() {
		return this.include;
	}

	public void setInclude(String include) {
		this.include = include;
		if(include != null){
			putBodyParameter("Include", include);
		}
	}

	public Long getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
		if(createTime != null){
			putQueryParameter("CreateTime", createTime.toString());
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

	public String getBucket() {
		return this.bucket;
	}

	public void setBucket(String bucket) {
		this.bucket = bucket;
		if(bucket != null){
			putQueryParameter("Bucket", bucket);
		}
	}

	public String getSchedule() {
		return this.schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
		if(schedule != null){
			putQueryParameter("Schedule", schedule);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public String getSpeedLimit() {
		return this.speedLimit;
	}

	public void setSpeedLimit(String speedLimit) {
		this.speedLimit = speedLimit;
		if(speedLimit != null){
			putBodyParameter("SpeedLimit", speedLimit);
		}
	}

	public String getDataSourceId() {
		return this.dataSourceId;
	}

	public void setDataSourceId(String dataSourceId) {
		this.dataSourceId = dataSourceId;
		if(dataSourceId != null){
			putBodyParameter("DataSourceId", dataSourceId);
		}
	}

	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
		if(detail != null){
			putQueryParameter("Detail", detail);
		}
	}

	public String getBackupSourceGroupId() {
		return this.backupSourceGroupId;
	}

	public void setBackupSourceGroupId(String backupSourceGroupId) {
		this.backupSourceGroupId = backupSourceGroupId;
		if(backupSourceGroupId != null){
			putQueryParameter("BackupSourceGroupId", backupSourceGroupId);
		}
	}

	public String getUdmRegionId() {
		return this.udmRegionId;
	}

	public void setUdmRegionId(String udmRegionId) {
		this.udmRegionId = udmRegionId;
		if(udmRegionId != null){
			putQueryParameter("UdmRegionId", udmRegionId);
		}
	}

	@Override
	public Class<CreateBackupPlanResponse> getResponseClass() {
		return CreateBackupPlanResponse.class;
	}

}
