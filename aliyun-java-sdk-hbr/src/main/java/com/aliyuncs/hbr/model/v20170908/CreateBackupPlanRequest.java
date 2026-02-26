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
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateBackupPlanRequest extends RpcAcsRequest<CreateBackupPlanResponse> {
	   

	private String vaultId;

	private String prefix;

	private String crossAccountType;

	private String crossAccountRoleName;

	private List<String> paths;

	private String changeListPath;

	private String options;

	private String sourceType;

	private String exclude;

	private String backupType;

	private String destDataSourceId;

	private String bucket;

	private String instanceId;

	private String instanceName;

	private String speedLimit;

	private String detail;

	private List<Rule> rules;

	private String planName;

	private Long retention;

	private String fileSystemId;

	private String include;

	private Long createTime;

	private String destSourceType;

	private Long keepLatestSnapshots;

	private String destDataSourceDetail;

	private String schedule;

	@SerializedName("otsDetail")
	private OtsDetail otsDetail;

	private Long crossAccountUserId;

	private String udmRegionId;
	public CreateBackupPlanRequest() {
		super("hbr", "2017-09-08", "CreateBackupPlan", "hbr");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getChangeListPath() {
		return this.changeListPath;
	}

	public void setChangeListPath(String changeListPath) {
		this.changeListPath = changeListPath;
		if(changeListPath != null){
			putQueryParameter("ChangeListPath", changeListPath);
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

	public String getDestDataSourceId() {
		return this.destDataSourceId;
	}

	public void setDestDataSourceId(String destDataSourceId) {
		this.destDataSourceId = destDataSourceId;
		if(destDataSourceId != null){
			putQueryParameter("DestDataSourceId", destDataSourceId);
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

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
		if(instanceName != null){
			putBodyParameter("InstanceName", instanceName);
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

	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
		if(detail != null){
			putQueryParameter("Detail", detail);
		}
	}

	public List<Rule> getRules() {
		return this.rules;
	}

	public void setRules(List<Rule> rules) {
		this.rules = rules;	
		if (rules != null) {
			for (int depth1 = 0; depth1 < rules.size(); depth1++) {
				putBodyParameter("Rule." + (depth1 + 1) + ".Schedule" , rules.get(depth1).getSchedule());
				putBodyParameter("Rule." + (depth1 + 1) + ".DestinationRegionId" , rules.get(depth1).getDestinationRegionId());
				putBodyParameter("Rule." + (depth1 + 1) + ".Disabled" , rules.get(depth1).getDisabled());
				putBodyParameter("Rule." + (depth1 + 1) + ".RuleName" , rules.get(depth1).getRuleName());
				putBodyParameter("Rule." + (depth1 + 1) + ".DestinationRetention" , rules.get(depth1).getDestinationRetention());
				putBodyParameter("Rule." + (depth1 + 1) + ".Retention" , rules.get(depth1).getRetention());
				putBodyParameter("Rule." + (depth1 + 1) + ".BackupType" , rules.get(depth1).getBackupType());
				putBodyParameter("Rule." + (depth1 + 1) + ".DoCopy" , rules.get(depth1).getDoCopy());
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

	public String getDestSourceType() {
		return this.destSourceType;
	}

	public void setDestSourceType(String destSourceType) {
		this.destSourceType = destSourceType;
		if(destSourceType != null){
			putQueryParameter("DestSourceType", destSourceType);
		}
	}

	public Long getKeepLatestSnapshots() {
		return this.keepLatestSnapshots;
	}

	public void setKeepLatestSnapshots(Long keepLatestSnapshots) {
		this.keepLatestSnapshots = keepLatestSnapshots;
		if(keepLatestSnapshots != null){
			putQueryParameter("KeepLatestSnapshots", keepLatestSnapshots.toString());
		}
	}

	public String getDestDataSourceDetail() {
		return this.destDataSourceDetail;
	}

	public void setDestDataSourceDetail(String destDataSourceDetail) {
		this.destDataSourceDetail = destDataSourceDetail;
		if(destDataSourceDetail != null){
			putQueryParameter("DestDataSourceDetail", destDataSourceDetail);
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

	public OtsDetail getOtsDetail() {
		return this.otsDetail;
	}

	public void setOtsDetail(OtsDetail otsDetail) {
		this.otsDetail = otsDetail;	
		if (otsDetail != null) {
			putBodyParameter("OtsDetail" , new Gson().toJson(otsDetail));
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

	public String getUdmRegionId() {
		return this.udmRegionId;
	}

	public void setUdmRegionId(String udmRegionId) {
		this.udmRegionId = udmRegionId;
		if(udmRegionId != null){
			putQueryParameter("UdmRegionId", udmRegionId);
		}
	}

	public static class Rule {

		private String schedule;

		private String destinationRegionId;

		private Boolean disabled;

		private String ruleName;

		private Long destinationRetention;

		private Long retention;

		private String backupType;

		private Boolean doCopy;

		public String getSchedule() {
			return this.schedule;
		}

		public void setSchedule(String schedule) {
			this.schedule = schedule;
		}

		public String getDestinationRegionId() {
			return this.destinationRegionId;
		}

		public void setDestinationRegionId(String destinationRegionId) {
			this.destinationRegionId = destinationRegionId;
		}

		public Boolean getDisabled() {
			return this.disabled;
		}

		public void setDisabled(Boolean disabled) {
			this.disabled = disabled;
		}

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}

		public Long getDestinationRetention() {
			return this.destinationRetention;
		}

		public void setDestinationRetention(Long destinationRetention) {
			this.destinationRetention = destinationRetention;
		}

		public Long getRetention() {
			return this.retention;
		}

		public void setRetention(Long retention) {
			this.retention = retention;
		}

		public String getBackupType() {
			return this.backupType;
		}

		public void setBackupType(String backupType) {
			this.backupType = backupType;
		}

		public Boolean getDoCopy() {
			return this.doCopy;
		}

		public void setDoCopy(Boolean doCopy) {
			this.doCopy = doCopy;
		}
	}

	public static class OtsDetail {

		@SerializedName("TableNames")
		private List<String> tableNames;

		public List<String> getTableNames() {
			return this.tableNames;
		}

		public void setTableNames(List<String> tableNames) {
			this.tableNames = tableNames;
		}
	}

	@Override
	public Class<CreateBackupPlanResponse> getResponseClass() {
		return CreateBackupPlanResponse.class;
	}

}
