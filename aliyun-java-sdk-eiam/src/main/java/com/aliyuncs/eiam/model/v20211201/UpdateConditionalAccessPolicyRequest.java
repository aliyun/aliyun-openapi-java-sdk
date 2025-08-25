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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateConditionalAccessPolicyRequest extends RpcAcsRequest<UpdateConditionalAccessPolicyResponse> {
	   

	private String clientToken;

	private ConditionsConfig conditionsConfig;

	private String decisionType;

	private String conditionalAccessPolicyId;

	private Integer priority;

	private DecisionConfig decisionConfig;

	private String conditionalAccessPolicyName;

	private String instanceId;
	public UpdateConditionalAccessPolicyRequest() {
		super("Eiam", "2021-12-01", "UpdateConditionalAccessPolicy", "eiam");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public ConditionsConfig getConditionsConfig() {
		return this.conditionsConfig;
	}

	public void setConditionsConfig(ConditionsConfig conditionsConfig) {
		this.conditionsConfig = conditionsConfig;	
		if (conditionsConfig != null) {
			
				if (conditionsConfig.getNetworkZones() != null) {
					
						if (conditionsConfig.getNetworkZones().getExcludeNetworkZones() != null) {
							for (int depth1 = 0; depth1 < conditionsConfig.getNetworkZones().getExcludeNetworkZones().size(); depth1++) {
								putQueryParameter("ConditionsConfig.NetworkZones.ExcludeNetworkZones." + (depth1 + 1) , conditionsConfig.getNetworkZones().getExcludeNetworkZones().get(depth1));
							}
						}
						if (conditionsConfig.getNetworkZones().getIncludeNetworkZones() != null) {
							for (int depth1 = 0; depth1 < conditionsConfig.getNetworkZones().getIncludeNetworkZones().size(); depth1++) {
								putQueryParameter("ConditionsConfig.NetworkZones.IncludeNetworkZones." + (depth1 + 1) , conditionsConfig.getNetworkZones().getIncludeNetworkZones().get(depth1));
							}
						}
				}
				if (conditionsConfig.getUsers() != null) {
					
						if (conditionsConfig.getUsers().getIncludeGroups() != null) {
							for (int depth1 = 0; depth1 < conditionsConfig.getUsers().getIncludeGroups().size(); depth1++) {
								putQueryParameter("ConditionsConfig.Users.IncludeGroups." + (depth1 + 1) , conditionsConfig.getUsers().getIncludeGroups().get(depth1));
							}
						}
						if (conditionsConfig.getUsers().getExcludeUsers() != null) {
							for (int depth1 = 0; depth1 < conditionsConfig.getUsers().getExcludeUsers().size(); depth1++) {
								putQueryParameter("ConditionsConfig.Users.ExcludeUsers." + (depth1 + 1) , conditionsConfig.getUsers().getExcludeUsers().get(depth1));
							}
						}
						if (conditionsConfig.getUsers().getIncludeOrganizationalUnits() != null) {
							for (int depth1 = 0; depth1 < conditionsConfig.getUsers().getIncludeOrganizationalUnits().size(); depth1++) {
								putQueryParameter("ConditionsConfig.Users.IncludeOrganizationalUnits." + (depth1 + 1) , conditionsConfig.getUsers().getIncludeOrganizationalUnits().get(depth1));
							}
						}
						if (conditionsConfig.getUsers().getExcludeOrganizationalUnits() != null) {
							for (int depth1 = 0; depth1 < conditionsConfig.getUsers().getExcludeOrganizationalUnits().size(); depth1++) {
								putQueryParameter("ConditionsConfig.Users.ExcludeOrganizationalUnits." + (depth1 + 1) , conditionsConfig.getUsers().getExcludeOrganizationalUnits().get(depth1));
							}
						}
						if (conditionsConfig.getUsers().getExcludeGroups() != null) {
							for (int depth1 = 0; depth1 < conditionsConfig.getUsers().getExcludeGroups().size(); depth1++) {
								putQueryParameter("ConditionsConfig.Users.ExcludeGroups." + (depth1 + 1) , conditionsConfig.getUsers().getExcludeGroups().get(depth1));
							}
						}
						if (conditionsConfig.getUsers().getIncludeUsers() != null) {
							for (int depth1 = 0; depth1 < conditionsConfig.getUsers().getIncludeUsers().size(); depth1++) {
								putQueryParameter("ConditionsConfig.Users.IncludeUsers." + (depth1 + 1) , conditionsConfig.getUsers().getIncludeUsers().get(depth1));
							}
						}
				}
				if (conditionsConfig.getApplications() != null) {
					
						if (conditionsConfig.getApplications().getExcludeApplications() != null) {
							for (int depth1 = 0; depth1 < conditionsConfig.getApplications().getExcludeApplications().size(); depth1++) {
								putQueryParameter("ConditionsConfig.Applications.ExcludeApplications." + (depth1 + 1) , conditionsConfig.getApplications().getExcludeApplications().get(depth1));
							}
						}
						if (conditionsConfig.getApplications().getIncludeApplications() != null) {
							for (int depth1 = 0; depth1 < conditionsConfig.getApplications().getIncludeApplications().size(); depth1++) {
								putQueryParameter("ConditionsConfig.Applications.IncludeApplications." + (depth1 + 1) , conditionsConfig.getApplications().getIncludeApplications().get(depth1));
							}
						}
				}
		}	
	}

	public String getDecisionType() {
		return this.decisionType;
	}

	public void setDecisionType(String decisionType) {
		this.decisionType = decisionType;
		if(decisionType != null){
			putQueryParameter("DecisionType", decisionType);
		}
	}

	public String getConditionalAccessPolicyId() {
		return this.conditionalAccessPolicyId;
	}

	public void setConditionalAccessPolicyId(String conditionalAccessPolicyId) {
		this.conditionalAccessPolicyId = conditionalAccessPolicyId;
		if(conditionalAccessPolicyId != null){
			putQueryParameter("ConditionalAccessPolicyId", conditionalAccessPolicyId);
		}
	}

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
		if(priority != null){
			putQueryParameter("Priority", priority.toString());
		}
	}

	public DecisionConfig getDecisionConfig() {
		return this.decisionConfig;
	}

	public void setDecisionConfig(DecisionConfig decisionConfig) {
		this.decisionConfig = decisionConfig;	
		if (decisionConfig != null) {
			
				putQueryParameter("DecisionConfig.MfaType" , decisionConfig.getMfaType());
				putQueryParameter("DecisionConfig.MfaAuthenticationIntervalSeconds" , decisionConfig.getMfaAuthenticationIntervalSeconds());
				putQueryParameter("DecisionConfig.Effect" , decisionConfig.getEffect());
				putQueryParameter("DecisionConfig.ActiveSessionReuseStatus" , decisionConfig.getActiveSessionReuseStatus());
				if (decisionConfig.getMfaAuthenticationMethods() != null) {
					for (int depth1 = 0; depth1 < decisionConfig.getMfaAuthenticationMethods().size(); depth1++) {
						putQueryParameter("DecisionConfig.MfaAuthenticationMethods." + (depth1 + 1) , decisionConfig.getMfaAuthenticationMethods().get(depth1));
					}
				}
		}	
	}

	public String getConditionalAccessPolicyName() {
		return this.conditionalAccessPolicyName;
	}

	public void setConditionalAccessPolicyName(String conditionalAccessPolicyName) {
		this.conditionalAccessPolicyName = conditionalAccessPolicyName;
		if(conditionalAccessPolicyName != null){
			putQueryParameter("ConditionalAccessPolicyName", conditionalAccessPolicyName);
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

	public static class ConditionsConfig {

		private NetworkZones networkZones;

		private Users users;

		private Applications applications;

		public NetworkZones getNetworkZones() {
			return this.networkZones;
		}

		public void setNetworkZones(NetworkZones networkZones) {
			this.networkZones = networkZones;
		}

		public Users getUsers() {
			return this.users;
		}

		public void setUsers(Users users) {
			this.users = users;
		}

		public Applications getApplications() {
			return this.applications;
		}

		public void setApplications(Applications applications) {
			this.applications = applications;
		}

		public static class NetworkZones {

			private List<String> excludeNetworkZones;

			private List<String> includeNetworkZones;

			public List<String> getExcludeNetworkZones() {
				return this.excludeNetworkZones;
			}

			public void setExcludeNetworkZones(List<String> excludeNetworkZones) {
				this.excludeNetworkZones = excludeNetworkZones;
			}

			public List<String> getIncludeNetworkZones() {
				return this.includeNetworkZones;
			}

			public void setIncludeNetworkZones(List<String> includeNetworkZones) {
				this.includeNetworkZones = includeNetworkZones;
			}
		}

		public static class Users {

			private List<String> includeGroups;

			private List<String> excludeUsers;

			private List<String> includeOrganizationalUnits;

			private List<String> excludeOrganizationalUnits;

			private List<String> excludeGroups;

			private List<String> includeUsers;

			public List<String> getIncludeGroups() {
				return this.includeGroups;
			}

			public void setIncludeGroups(List<String> includeGroups) {
				this.includeGroups = includeGroups;
			}

			public List<String> getExcludeUsers() {
				return this.excludeUsers;
			}

			public void setExcludeUsers(List<String> excludeUsers) {
				this.excludeUsers = excludeUsers;
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

			public List<String> getExcludeGroups() {
				return this.excludeGroups;
			}

			public void setExcludeGroups(List<String> excludeGroups) {
				this.excludeGroups = excludeGroups;
			}

			public List<String> getIncludeUsers() {
				return this.includeUsers;
			}

			public void setIncludeUsers(List<String> includeUsers) {
				this.includeUsers = includeUsers;
			}
		}

		public static class Applications {

			private List<String> excludeApplications;

			private List<String> includeApplications;

			public List<String> getExcludeApplications() {
				return this.excludeApplications;
			}

			public void setExcludeApplications(List<String> excludeApplications) {
				this.excludeApplications = excludeApplications;
			}

			public List<String> getIncludeApplications() {
				return this.includeApplications;
			}

			public void setIncludeApplications(List<String> includeApplications) {
				this.includeApplications = includeApplications;
			}
		}
	}

	public static class DecisionConfig {

		private String mfaType;

		private Long mfaAuthenticationIntervalSeconds;

		private String effect;

		private String activeSessionReuseStatus;

		private List<String> mfaAuthenticationMethods;

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

		public String getEffect() {
			return this.effect;
		}

		public void setEffect(String effect) {
			this.effect = effect;
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

	@Override
	public Class<UpdateConditionalAccessPolicyResponse> getResponseClass() {
		return UpdateConditionalAccessPolicyResponse.class;
	}

}
