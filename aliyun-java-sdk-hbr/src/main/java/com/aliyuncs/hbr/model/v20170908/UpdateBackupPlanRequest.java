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
public class UpdateBackupPlanRequest extends RpcAcsRequest<UpdateBackupPlanResponse> {
	   

	private String vaultId;

	private String prefix;

	private List<Rule> rules;

	private List<String> paths;

	private String planName;

	private String options;

	private String sourceType;

	private String exclude;

	private Long retention;

	private String include;

	private Long keepLatestSnapshots;

	private String schedule;

	@SerializedName("otsDetail")
	private OtsDetail otsDetail;

	private String speedLimit;

	private String planId;

	private String detail;

	private Boolean updatePaths;
	public UpdateBackupPlanRequest() {
		super("hbr", "2017-09-08", "UpdateBackupPlan", "hbr");
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

	public List<String> getPaths() {
		return this.paths;
	}

	public void setPaths(List<String> paths) {
		this.paths = paths;	
		if (paths != null) {
			for (int i = 0; i < paths.size(); i++) {
				putQueryParameter("Path." + (i + 1) , paths.get(i));
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

	public Long getRetention() {
		return this.retention;
	}

	public void setRetention(Long retention) {
		this.retention = retention;
		if(retention != null){
			putQueryParameter("Retention", retention.toString());
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

	public Long getKeepLatestSnapshots() {
		return this.keepLatestSnapshots;
	}

	public void setKeepLatestSnapshots(Long keepLatestSnapshots) {
		this.keepLatestSnapshots = keepLatestSnapshots;
		if(keepLatestSnapshots != null){
			putQueryParameter("KeepLatestSnapshots", keepLatestSnapshots.toString());
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

	public String getSpeedLimit() {
		return this.speedLimit;
	}

	public void setSpeedLimit(String speedLimit) {
		this.speedLimit = speedLimit;
		if(speedLimit != null){
			putQueryParameter("SpeedLimit", speedLimit);
		}
	}

	public String getPlanId() {
		return this.planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
		if(planId != null){
			putQueryParameter("PlanId", planId);
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

	public Boolean getUpdatePaths() {
		return this.updatePaths;
	}

	public void setUpdatePaths(Boolean updatePaths) {
		this.updatePaths = updatePaths;
		if(updatePaths != null){
			putQueryParameter("UpdatePaths", updatePaths.toString());
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
	public Class<UpdateBackupPlanResponse> getResponseClass() {
		return UpdateBackupPlanResponse.class;
	}

}
