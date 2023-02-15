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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hbr.transform.v20170908.DescribePoliciesV2ResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePoliciesV2Response extends AcsResponse {

	private String nextToken;

	private Integer maxResults;

	private Long totalCount;

	private Boolean success;

	private String code;

	private String message;

	private String requestId;

	private List<Policy> policies;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Policy> getPolicies() {
		return this.policies;
	}

	public void setPolicies(List<Policy> policies) {
		this.policies = policies;
	}

	public static class Policy {

		private Long createdTime;

		private Long updatedTime;

		private String policyId;

		private String policyName;

		private String policyDescription;

		private Long policyBindingCount;

		private Integer recommendVersion;

		private List<Rule> rules;

		public Long getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(Long createdTime) {
			this.createdTime = createdTime;
		}

		public Long getUpdatedTime() {
			return this.updatedTime;
		}

		public void setUpdatedTime(Long updatedTime) {
			this.updatedTime = updatedTime;
		}

		public String getPolicyId() {
			return this.policyId;
		}

		public void setPolicyId(String policyId) {
			this.policyId = policyId;
		}

		public String getPolicyName() {
			return this.policyName;
		}

		public void setPolicyName(String policyName) {
			this.policyName = policyName;
		}

		public String getPolicyDescription() {
			return this.policyDescription;
		}

		public void setPolicyDescription(String policyDescription) {
			this.policyDescription = policyDescription;
		}

		public Long getPolicyBindingCount() {
			return this.policyBindingCount;
		}

		public void setPolicyBindingCount(Long policyBindingCount) {
			this.policyBindingCount = policyBindingCount;
		}

		public Integer getRecommendVersion() {
			return this.recommendVersion;
		}

		public void setRecommendVersion(Integer recommendVersion) {
			this.recommendVersion = recommendVersion;
		}

		public List<Rule> getRules() {
			return this.rules;
		}

		public void setRules(List<Rule> rules) {
			this.rules = rules;
		}

		public static class Rule {

			private String ruleId;

			private String ruleType;

			private String schedule;

			private String backupType;

			private Boolean continuous;

			private String vaultId;

			private String replicationRegionId;

			private String replicationVaultId;

			private Long retention;

			private String archiveVaultId;

			private Long archiveDays;

			private Long coldArchiveDays;

			private List<RetentionRule> retentionRules;

			private Selector selector;

			public String getRuleId() {
				return this.ruleId;
			}

			public void setRuleId(String ruleId) {
				this.ruleId = ruleId;
			}

			public String getRuleType() {
				return this.ruleType;
			}

			public void setRuleType(String ruleType) {
				this.ruleType = ruleType;
			}

			public String getSchedule() {
				return this.schedule;
			}

			public void setSchedule(String schedule) {
				this.schedule = schedule;
			}

			public String getBackupType() {
				return this.backupType;
			}

			public void setBackupType(String backupType) {
				this.backupType = backupType;
			}

			public Boolean getContinuous() {
				return this.continuous;
			}

			public void setContinuous(Boolean continuous) {
				this.continuous = continuous;
			}

			public String getVaultId() {
				return this.vaultId;
			}

			public void setVaultId(String vaultId) {
				this.vaultId = vaultId;
			}

			public String getReplicationRegionId() {
				return this.replicationRegionId;
			}

			public void setReplicationRegionId(String replicationRegionId) {
				this.replicationRegionId = replicationRegionId;
			}

			public String getReplicationVaultId() {
				return this.replicationVaultId;
			}

			public void setReplicationVaultId(String replicationVaultId) {
				this.replicationVaultId = replicationVaultId;
			}

			public Long getRetention() {
				return this.retention;
			}

			public void setRetention(Long retention) {
				this.retention = retention;
			}

			public String getArchiveVaultId() {
				return this.archiveVaultId;
			}

			public void setArchiveVaultId(String archiveVaultId) {
				this.archiveVaultId = archiveVaultId;
			}

			public Long getArchiveDays() {
				return this.archiveDays;
			}

			public void setArchiveDays(Long archiveDays) {
				this.archiveDays = archiveDays;
			}

			public Long getColdArchiveDays() {
				return this.coldArchiveDays;
			}

			public void setColdArchiveDays(Long coldArchiveDays) {
				this.coldArchiveDays = coldArchiveDays;
			}

			public List<RetentionRule> getRetentionRules() {
				return this.retentionRules;
			}

			public void setRetentionRules(List<RetentionRule> retentionRules) {
				this.retentionRules = retentionRules;
			}

			public Selector getSelector() {
				return this.selector;
			}

			public void setSelector(Selector selector) {
				this.selector = selector;
			}

			public static class RetentionRule {

				private String advancedRetentionType;

				private Long whichSnapshot;

				private Long retention;

				private Long activeTime;

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

				public Long getActiveTime() {
					return this.activeTime;
				}

				public void setActiveTime(Long activeTime) {
					this.activeTime = activeTime;
				}
			}

			public static class Selector {

				private String key;

				private String value;

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}
	}

	@Override
	public DescribePoliciesV2Response getInstance(UnmarshallerContext context) {
		return	DescribePoliciesV2ResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
