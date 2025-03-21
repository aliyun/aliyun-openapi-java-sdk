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

package com.aliyuncs.eiam.model.v20211201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eiam.transform.v20211201.GetConditionalAccessPolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetConditionalAccessPolicyResponse extends AcsResponse {

	private String requestId;

	private ConditionalAccessPolicy conditionalAccessPolicy;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ConditionalAccessPolicy getConditionalAccessPolicy() {
		return this.conditionalAccessPolicy;
	}

	public void setConditionalAccessPolicy(ConditionalAccessPolicy conditionalAccessPolicy) {
		this.conditionalAccessPolicy = conditionalAccessPolicy;
	}

	public static class ConditionalAccessPolicy {

		private String instanceId;

		private String conditionalAccessPolicyId;

		private String conditionalAccessPolicyName;

		private String description;

		private String conditionalAccessPolicyType;

		private String status;

		private String decisionType;

		private String evaluateAt;

		private Integer priority;

		private Long createTime;

		private Long lastUpdatedTime;

		private DecisionConfig decisionConfig;

		private ConditionsConfig conditionsConfig;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getConditionalAccessPolicyId() {
			return this.conditionalAccessPolicyId;
		}

		public void setConditionalAccessPolicyId(String conditionalAccessPolicyId) {
			this.conditionalAccessPolicyId = conditionalAccessPolicyId;
		}

		public String getConditionalAccessPolicyName() {
			return this.conditionalAccessPolicyName;
		}

		public void setConditionalAccessPolicyName(String conditionalAccessPolicyName) {
			this.conditionalAccessPolicyName = conditionalAccessPolicyName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getConditionalAccessPolicyType() {
			return this.conditionalAccessPolicyType;
		}

		public void setConditionalAccessPolicyType(String conditionalAccessPolicyType) {
			this.conditionalAccessPolicyType = conditionalAccessPolicyType;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDecisionType() {
			return this.decisionType;
		}

		public void setDecisionType(String decisionType) {
			this.decisionType = decisionType;
		}

		public String getEvaluateAt() {
			return this.evaluateAt;
		}

		public void setEvaluateAt(String evaluateAt) {
			this.evaluateAt = evaluateAt;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getLastUpdatedTime() {
			return this.lastUpdatedTime;
		}

		public void setLastUpdatedTime(Long lastUpdatedTime) {
			this.lastUpdatedTime = lastUpdatedTime;
		}

		public DecisionConfig getDecisionConfig() {
			return this.decisionConfig;
		}

		public void setDecisionConfig(DecisionConfig decisionConfig) {
			this.decisionConfig = decisionConfig;
		}

		public ConditionsConfig getConditionsConfig() {
			return this.conditionsConfig;
		}

		public void setConditionsConfig(ConditionsConfig conditionsConfig) {
			this.conditionsConfig = conditionsConfig;
		}

		public static class DecisionConfig {

			private String effect;

			private String mfaType;

			private Long mfaAuthenticationIntervalSeconds;

			private String activeSessionReuseStatus;

			private List<String> mfaAuthenticationMethods;

			public String getEffect() {
				return this.effect;
			}

			public void setEffect(String effect) {
				this.effect = effect;
			}

			public String getMfaType() {
				return this.mfaType;
			}

			public void setMfaType(String mfaType) {
				this.mfaType = mfaType;
			}

			public Long getMfaAuthenticationIntervalSeconds() {
				return this.mfaAuthenticationIntervalSeconds;
			}

			public void setMfaAuthenticationIntervalSeconds(Long mfaAuthenticationIntervalSeconds) {
				this.mfaAuthenticationIntervalSeconds = mfaAuthenticationIntervalSeconds;
			}

			public String getActiveSessionReuseStatus() {
				return this.activeSessionReuseStatus;
			}

			public void setActiveSessionReuseStatus(String activeSessionReuseStatus) {
				this.activeSessionReuseStatus = activeSessionReuseStatus;
			}

			public List<String> getMfaAuthenticationMethods() {
				return this.mfaAuthenticationMethods;
			}

			public void setMfaAuthenticationMethods(List<String> mfaAuthenticationMethods) {
				this.mfaAuthenticationMethods = mfaAuthenticationMethods;
			}
		}

		public static class ConditionsConfig {

			private Applications applications;

			private Users users;

			private NetworkZones networkZones;

			public Applications getApplications() {
				return this.applications;
			}

			public void setApplications(Applications applications) {
				this.applications = applications;
			}

			public Users getUsers() {
				return this.users;
			}

			public void setUsers(Users users) {
				this.users = users;
			}

			public NetworkZones getNetworkZones() {
				return this.networkZones;
			}

			public void setNetworkZones(NetworkZones networkZones) {
				this.networkZones = networkZones;
			}

			public static class Applications {

				private List<String> includeApplications;

				private List<String> excludeApplications;

				public List<String> getIncludeApplications() {
					return this.includeApplications;
				}

				public void setIncludeApplications(List<String> includeApplications) {
					this.includeApplications = includeApplications;
				}

				public List<String> getExcludeApplications() {
					return this.excludeApplications;
				}

				public void setExcludeApplications(List<String> excludeApplications) {
					this.excludeApplications = excludeApplications;
				}
			}

			public static class Users {

				private List<String> includeUsers;

				private List<String> excludeUsers;

				private List<String> includeGroups;

				private List<String> excludeGroups;

				private List<String> includeOrganizationalUnits;

				private List<String> excludeOrganizationalUnits;

				public List<String> getIncludeUsers() {
					return this.includeUsers;
				}

				public void setIncludeUsers(List<String> includeUsers) {
					this.includeUsers = includeUsers;
				}

				public List<String> getExcludeUsers() {
					return this.excludeUsers;
				}

				public void setExcludeUsers(List<String> excludeUsers) {
					this.excludeUsers = excludeUsers;
				}

				public List<String> getIncludeGroups() {
					return this.includeGroups;
				}

				public void setIncludeGroups(List<String> includeGroups) {
					this.includeGroups = includeGroups;
				}

				public List<String> getExcludeGroups() {
					return this.excludeGroups;
				}

				public void setExcludeGroups(List<String> excludeGroups) {
					this.excludeGroups = excludeGroups;
				}

				public List<String> getIncludeOrganizationalUnits() {
					return this.includeOrganizationalUnits;
				}

				public void setIncludeOrganizationalUnits(List<String> includeOrganizationalUnits) {
					this.includeOrganizationalUnits = includeOrganizationalUnits;
				}

				public List<String> getExcludeOrganizationalUnits() {
					return this.excludeOrganizationalUnits;
				}

				public void setExcludeOrganizationalUnits(List<String> excludeOrganizationalUnits) {
					this.excludeOrganizationalUnits = excludeOrganizationalUnits;
				}
			}

			public static class NetworkZones {

				private List<String> includeNetworkZones;

				private List<String> excludeNetworkZones;

				public List<String> getIncludeNetworkZones() {
					return this.includeNetworkZones;
				}

				public void setIncludeNetworkZones(List<String> includeNetworkZones) {
					this.includeNetworkZones = includeNetworkZones;
				}

				public List<String> getExcludeNetworkZones() {
					return this.excludeNetworkZones;
				}

				public void setExcludeNetworkZones(List<String> excludeNetworkZones) {
					this.excludeNetworkZones = excludeNetworkZones;
				}
			}
		}
	}

	@Override
	public GetConditionalAccessPolicyResponse getInstance(UnmarshallerContext context) {
		return	GetConditionalAccessPolicyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
