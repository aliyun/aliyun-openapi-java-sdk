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
public class CreatePolicyV2Request extends RpcAcsRequest<CreatePolicyV2Response> {
	   

	private String policyType;

	@SerializedName("rules")
	private List<Rules> rules;

	private String policyName;

	private String policyDescription;
	public CreatePolicyV2Request() {
		super("hbr", "2017-09-08", "CreatePolicyV2", "hbr");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPolicyType() {
		return this.policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
		if(policyType != null){
			putBodyParameter("PolicyType", policyType);
		}
	}

	public List<Rules> getRules() {
		return this.rules;
	}

	public void setRules(List<Rules> rules) {
		this.rules = rules;	
		if (rules != null) {
			putBodyParameter("Rules" , new Gson().toJson(rules));
		}	
	}

	public String getPolicyName() {
		return this.policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
		if(policyName != null){
			putBodyParameter("PolicyName", policyName);
		}
	}

	public String getPolicyDescription() {
		return this.policyDescription;
	}

	public void setPolicyDescription(String policyDescription) {
		this.policyDescription = policyDescription;
		if(policyDescription != null){
			putBodyParameter("PolicyDescription", policyDescription);
		}
	}

	public static class Rules {

		@SerializedName("ArchiveVaultId")
		private String archiveVaultId;

		@SerializedName("VaultId")
		private String vaultId;

		@SerializedName("RuleType")
		private String ruleType;

		@SerializedName("DataSourceFilters")
		private List<DataSourceFiltersItem> dataSourceFilters;

		@SerializedName("ReplicationVaultId")
		private String replicationVaultId;

		@SerializedName("ReplicationRegionId")
		private String replicationRegionId;

		@SerializedName("ArchiveDays")
		private Long archiveDays;

		@SerializedName("KeepLatestSnapshots")
		private Long keepLatestSnapshots;

		@SerializedName("ColdArchiveDays")
		private Long coldArchiveDays;

		@SerializedName("Schedule")
		private String schedule;

		@SerializedName("Immutable")
		private Boolean immutable;

		@SerializedName("Continuous")
		private Boolean continuous;

		@SerializedName("RetentionRules")
		private List<RetentionRulesItem> retentionRules;

		@SerializedName("Selector")
		private Selector selector;

		@SerializedName("DoDetect")
		private Boolean doDetect;

		@SerializedName("BackupType")
		private String backupType;

		@SerializedName("Retention")
		private Long retention;

		@SerializedName("TagFilters")
		private List<TagFiltersItem> tagFilters;

		public String getArchiveVaultId() {
			return this.archiveVaultId;
		}

		public void setArchiveVaultId(String archiveVaultId) {
			this.archiveVaultId = archiveVaultId;
		}

		public String getVaultId() {
			return this.vaultId;
		}

		public void setVaultId(String vaultId) {
			this.vaultId = vaultId;
		}

		public String getRuleType() {
			return this.ruleType;
		}

		public void setRuleType(String ruleType) {
			this.ruleType = ruleType;
		}

		public List<DataSourceFiltersItem> getDataSourceFilters() {
			return this.dataSourceFilters;
		}

		public void setDataSourceFilters(List<DataSourceFiltersItem> dataSourceFilters) {
			this.dataSourceFilters = dataSourceFilters;
		}

		public String getReplicationVaultId() {
			return this.replicationVaultId;
		}

		public void setReplicationVaultId(String replicationVaultId) {
			this.replicationVaultId = replicationVaultId;
		}

		public String getReplicationRegionId() {
			return this.replicationRegionId;
		}

		public void setReplicationRegionId(String replicationRegionId) {
			this.replicationRegionId = replicationRegionId;
		}

		public Long getArchiveDays() {
			return this.archiveDays;
		}

		public void setArchiveDays(Long archiveDays) {
			this.archiveDays = archiveDays;
		}

		public Long getKeepLatestSnapshots() {
			return this.keepLatestSnapshots;
		}

		public void setKeepLatestSnapshots(Long keepLatestSnapshots) {
			this.keepLatestSnapshots = keepLatestSnapshots;
		}

		public Long getColdArchiveDays() {
			return this.coldArchiveDays;
		}

		public void setColdArchiveDays(Long coldArchiveDays) {
			this.coldArchiveDays = coldArchiveDays;
		}

		public String getSchedule() {
			return this.schedule;
		}

		public void setSchedule(String schedule) {
			this.schedule = schedule;
		}

		public Boolean getImmutable() {
			return this.immutable;
		}

		public void setImmutable(Boolean immutable) {
			this.immutable = immutable;
		}

		public Boolean getContinuous() {
			return this.continuous;
		}

		public void setContinuous(Boolean continuous) {
			this.continuous = continuous;
		}

		public List<RetentionRulesItem> getRetentionRules() {
			return this.retentionRules;
		}

		public void setRetentionRules(List<RetentionRulesItem> retentionRules) {
			this.retentionRules = retentionRules;
		}

		public Selector getSelector() {
			return this.selector;
		}

		public void setSelector(Selector selector) {
			this.selector = selector;
		}

		public Boolean getDoDetect() {
			return this.doDetect;
		}

		public void setDoDetect(Boolean doDetect) {
			this.doDetect = doDetect;
		}

		public String getBackupType() {
			return this.backupType;
		}

		public void setBackupType(String backupType) {
			this.backupType = backupType;
		}

		public Long getRetention() {
			return this.retention;
		}

		public void setRetention(Long retention) {
			this.retention = retention;
		}

		public List<TagFiltersItem> getTagFilters() {
			return this.tagFilters;
		}

		public void setTagFilters(List<TagFiltersItem> tagFilters) {
			this.tagFilters = tagFilters;
		}

		public static class DataSourceFiltersItem {

			@SerializedName("DataSourceIds")
			private List<String> dataSourceIds;

			@SerializedName("CrossAccountType")
			private String crossAccountType;

			@SerializedName("SourceType")
			private String sourceType;

			@SerializedName("CrossAccountRoleName")
			private String crossAccountRoleName;

			@SerializedName("CrossAccountUserId")
			private String crossAccountUserId;

			public List<String> getDataSourceIds() {
				return this.dataSourceIds;
			}

			public void setDataSourceIds(List<String> dataSourceIds) {
				this.dataSourceIds = dataSourceIds;
			}

			public String getCrossAccountType() {
				return this.crossAccountType;
			}

			public void setCrossAccountType(String crossAccountType) {
				this.crossAccountType = crossAccountType;
			}

			public String getSourceType() {
				return this.sourceType;
			}

			public void setSourceType(String sourceType) {
				this.sourceType = sourceType;
			}

			public String getCrossAccountRoleName() {
				return this.crossAccountRoleName;
			}

			public void setCrossAccountRoleName(String crossAccountRoleName) {
				this.crossAccountRoleName = crossAccountRoleName;
			}

			public String getCrossAccountUserId() {
				return this.crossAccountUserId;
			}

			public void setCrossAccountUserId(String crossAccountUserId) {
				this.crossAccountUserId = crossAccountUserId;
			}
		}

		public static class RetentionRulesItem {

			@SerializedName("AdvancedRetentionType")
			private String advancedRetentionType;

			@SerializedName("WhichSnapshot")
			private Long whichSnapshot;

			@SerializedName("Retention")
			private Long retention;

			public String getAdvancedRetentionType() {
				return this.advancedRetentionType;
			}

			public void setAdvancedRetentionType(String advancedRetentionType) {
				this.advancedRetentionType = advancedRetentionType;
			}

			public Long getWhichSnapshot() {
				return this.whichSnapshot;
			}

			public void setWhichSnapshot(Long whichSnapshot) {
				this.whichSnapshot = whichSnapshot;
			}

			public Long getRetention() {
				return this.retention;
			}

			public void setRetention(Long retention) {
				this.retention = retention;
			}
		}

		public static class Selector {

			@SerializedName("Value")
			private String value;

			@SerializedName("Key")
			private String key;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}
		}

		public static class TagFiltersItem {

			@SerializedName("Value")
			private String value;

			@SerializedName("Key")
			private String key;

			@SerializedName("Operator")
			private String operator;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getOperator() {
				return this.operator;
			}

			public void setOperator(String operator) {
				this.operator = operator;
			}
		}
	}

	@Override
	public Class<CreatePolicyV2Response> getResponseClass() {
		return CreatePolicyV2Response.class;
	}

}
