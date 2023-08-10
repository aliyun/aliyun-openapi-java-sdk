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

package com.aliyuncs.adcp.model.v20220101;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.adcp.transform.v20220101.DescribePolicyGovernanceInClusterResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePolicyGovernanceInClusterResponse extends AcsResponse {

	private String requestId;

	private List<PolicyGovernance> policyGovernances;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<PolicyGovernance> getPolicyGovernances() {
		return this.policyGovernances;
	}

	public void setPolicyGovernances(List<PolicyGovernance> policyGovernances) {
		this.policyGovernances = policyGovernances;
	}

	public static class PolicyGovernance {

		private Cluster cluster;

		private PolicyGovernance1 policyGovernance1;

		public Cluster getCluster() {
			return this.cluster;
		}

		public void setCluster(Cluster cluster) {
			this.cluster = cluster;
		}

		public PolicyGovernance1 getPolicyGovernance1() {
			return this.policyGovernance1;
		}

		public void setPolicyGovernance1(PolicyGovernance1 policyGovernance1) {
			this.policyGovernance1 = policyGovernance1;
		}

		public static class Cluster {

			private String clusterId;

			private String name;

			private String regionId;

			private String state;

			private String clusterType;

			private String clusterSpec;

			private String profile;

			public String getClusterId() {
				return this.clusterId;
			}

			public void setClusterId(String clusterId) {
				this.clusterId = clusterId;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public String getClusterType() {
				return this.clusterType;
			}

			public void setClusterType(String clusterType) {
				this.clusterType = clusterType;
			}

			public String getClusterSpec() {
				return this.clusterSpec;
			}

			public void setClusterSpec(String clusterSpec) {
				this.clusterSpec = clusterSpec;
			}

			public String getProfile() {
				return this.profile;
			}

			public void setProfile(String profile) {
				this.profile = profile;
			}
		}

		public static class PolicyGovernance1 {

			private List<State> onState;

			private AdmitLog admitLog;

			private Violation violation;

			public List<State> getOnState() {
				return this.onState;
			}

			public void setOnState(List<State> onState) {
				this.onState = onState;
			}

			public AdmitLog getAdmitLog() {
				return this.admitLog;
			}

			public void setAdmitLog(AdmitLog admitLog) {
				this.admitLog = admitLog;
			}

			public Violation getViolation() {
				return this.violation;
			}

			public void setViolation(Violation violation) {
				this.violation = violation;
			}

			public static class State {

				private Long enabledCount;

				private Long totalCount;

				private String severity;

				public Long getEnabledCount() {
					return this.enabledCount;
				}

				public void setEnabledCount(Long enabledCount) {
					this.enabledCount = enabledCount;
				}

				public Long getTotalCount() {
					return this.totalCount;
				}

				public void setTotalCount(Long totalCount) {
					this.totalCount = totalCount;
				}

				public String getSeverity() {
					return this.severity;
				}

				public void setSeverity(String severity) {
					this.severity = severity;
				}
			}

			public static class AdmitLog {

				private String progress;

				private String count;

				private String logProject;

				private String logStore;

				private List<Map<Object,Object>> logs;

				public String getProgress() {
					return this.progress;
				}

				public void setProgress(String progress) {
					this.progress = progress;
				}

				public String getCount() {
					return this.count;
				}

				public void setCount(String count) {
					this.count = count;
				}

				public String getLogProject() {
					return this.logProject;
				}

				public void setLogProject(String logProject) {
					this.logProject = logProject;
				}

				public String getLogStore() {
					return this.logStore;
				}

				public void setLogStore(String logStore) {
					this.logStore = logStore;
				}

				public List<Map<Object,Object>> getLogs() {
					return this.logs;
				}

				public void setLogs(List<Map<Object,Object>> logs) {
					this.logs = logs;
				}
			}

			public static class Violation {

				private TotalViolations totalViolations;

				private Violations violations;

				public TotalViolations getTotalViolations() {
					return this.totalViolations;
				}

				public void setTotalViolations(TotalViolations totalViolations) {
					this.totalViolations = totalViolations;
				}

				public Violations getViolations() {
					return this.violations;
				}

				public void setViolations(Violations violations) {
					this.violations = violations;
				}

				public static class TotalViolations {

					private List<DenySeverity> deny;

					private List<WarnSeverity> warn;

					public List<DenySeverity> getDeny() {
						return this.deny;
					}

					public void setDeny(List<DenySeverity> deny) {
						this.deny = deny;
					}

					public List<WarnSeverity> getWarn() {
						return this.warn;
					}

					public void setWarn(List<WarnSeverity> warn) {
						this.warn = warn;
					}

					public static class DenySeverity {

						private String severity;

						private Long violations;

						public String getSeverity() {
							return this.severity;
						}

						public void setSeverity(String severity) {
							this.severity = severity;
						}

						public Long getViolations() {
							return this.violations;
						}

						public void setViolations(Long violations) {
							this.violations = violations;
						}
					}

					public static class WarnSeverity {

						private String severity;

						private String violations;

						public String getSeverity() {
							return this.severity;
						}

						public void setSeverity(String severity) {
							this.severity = severity;
						}

						public String getViolations() {
							return this.violations;
						}

						public void setViolations(String violations) {
							this.violations = violations;
						}
					}
				}

				public static class Violations {

					private List<DenyViolations> deny2;

					private List<WarnViolations> warn3;

					public List<DenyViolations> getDeny2() {
						return this.deny2;
					}

					public void setDeny2(List<DenyViolations> deny2) {
						this.deny2 = deny2;
					}

					public List<WarnViolations> getWarn3() {
						return this.warn3;
					}

					public void setWarn3(List<WarnViolations> warn3) {
						this.warn3 = warn3;
					}

					public static class DenyViolations {

						private String policyName;

						private String policyDescription;

						private String severity;

						private Long violations;

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

						public String getSeverity() {
							return this.severity;
						}

						public void setSeverity(String severity) {
							this.severity = severity;
						}

						public Long getViolations() {
							return this.violations;
						}

						public void setViolations(Long violations) {
							this.violations = violations;
						}
					}

					public static class WarnViolations {

						private String policyName;

						private String policyDescription;

						private String severity;

						private Long violations;

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

						public String getSeverity() {
							return this.severity;
						}

						public void setSeverity(String severity) {
							this.severity = severity;
						}

						public Long getViolations() {
							return this.violations;
						}

						public void setViolations(Long violations) {
							this.violations = violations;
						}
					}
				}
			}
		}
	}

	@Override
	public DescribePolicyGovernanceInClusterResponse getInstance(UnmarshallerContext context) {
		return	DescribePolicyGovernanceInClusterResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
