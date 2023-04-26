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

package com.aliyuncs.ecs.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20160314.DescribeNetworkInsightsAnalysisResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeNetworkInsightsAnalysisResultResponse extends AcsResponse {

	private String requestId;

	private String networkInsightsPathId;

	private String networkInsightsAnalysisId;

	private String networkPathFound;

	private String status;

	private String creationTime;

	private String source;

	private String sourceType;

	private String sourceIp;

	private String destination;

	private String destinationType;

	private String destinationIp;

	private String destinationPort;

	private String protocol;

	private String severity;

	private Integer aPIVersion;

	private List<NetworkInsightsAnalysisComponent> networkInsightsAnalysisComponents;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNetworkInsightsPathId() {
		return this.networkInsightsPathId;
	}

	public void setNetworkInsightsPathId(String networkInsightsPathId) {
		this.networkInsightsPathId = networkInsightsPathId;
	}

	public String getNetworkInsightsAnalysisId() {
		return this.networkInsightsAnalysisId;
	}

	public void setNetworkInsightsAnalysisId(String networkInsightsAnalysisId) {
		this.networkInsightsAnalysisId = networkInsightsAnalysisId;
	}

	public String getNetworkPathFound() {
		return this.networkPathFound;
	}

	public void setNetworkPathFound(String networkPathFound) {
		this.networkPathFound = networkPathFound;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreationTime() {
		return this.creationTime;
	}

	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getSourceType() {
		return this.sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
	}

	public String getDestination() {
		return this.destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDestinationType() {
		return this.destinationType;
	}

	public void setDestinationType(String destinationType) {
		this.destinationType = destinationType;
	}

	public String getDestinationIp() {
		return this.destinationIp;
	}

	public void setDestinationIp(String destinationIp) {
		this.destinationIp = destinationIp;
	}

	public String getDestinationPort() {
		return this.destinationPort;
	}

	public void setDestinationPort(String destinationPort) {
		this.destinationPort = destinationPort;
	}

	public String getBizProtocol() {
		return this.protocol;
	}

	public void setBizProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getSeverity() {
		return this.severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public Integer getAPIVersion() {
		return this.aPIVersion;
	}

	public void setAPIVersion(Integer aPIVersion) {
		this.aPIVersion = aPIVersion;
	}

	public List<NetworkInsightsAnalysisComponent> getNetworkInsightsAnalysisComponents() {
		return this.networkInsightsAnalysisComponents;
	}

	public void setNetworkInsightsAnalysisComponents(List<NetworkInsightsAnalysisComponent> networkInsightsAnalysisComponents) {
		this.networkInsightsAnalysisComponents = networkInsightsAnalysisComponents;
	}

	public static class NetworkInsightsAnalysisComponent {

		private String resourceId;

		private String resourceType;

		private String reachable;

		private String code;

		private String message;

		private Integer sequence;

		private String severity;

		private List<DiagnoseCategory> diagnoseCategories;

		private List<MetricResult> metricResults;

		private List<String> relativeGroupIds;

		private NetworkAclEntry networkAclEntry;

		private SecurityGroupAcl securityGroupAcl;

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getReachable() {
			return this.reachable;
		}

		public void setReachable(String reachable) {
			this.reachable = reachable;
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

		public Integer getSequence() {
			return this.sequence;
		}

		public void setSequence(Integer sequence) {
			this.sequence = sequence;
		}

		public String getSeverity() {
			return this.severity;
		}

		public void setSeverity(String severity) {
			this.severity = severity;
		}

		public List<DiagnoseCategory> getDiagnoseCategories() {
			return this.diagnoseCategories;
		}

		public void setDiagnoseCategories(List<DiagnoseCategory> diagnoseCategories) {
			this.diagnoseCategories = diagnoseCategories;
		}

		public List<MetricResult> getMetricResults() {
			return this.metricResults;
		}

		public void setMetricResults(List<MetricResult> metricResults) {
			this.metricResults = metricResults;
		}

		public List<String> getRelativeGroupIds() {
			return this.relativeGroupIds;
		}

		public void setRelativeGroupIds(List<String> relativeGroupIds) {
			this.relativeGroupIds = relativeGroupIds;
		}

		public NetworkAclEntry getNetworkAclEntry() {
			return this.networkAclEntry;
		}

		public void setNetworkAclEntry(NetworkAclEntry networkAclEntry) {
			this.networkAclEntry = networkAclEntry;
		}

		public SecurityGroupAcl getSecurityGroupAcl() {
			return this.securityGroupAcl;
		}

		public void setSecurityGroupAcl(SecurityGroupAcl securityGroupAcl) {
			this.securityGroupAcl = securityGroupAcl;
		}

		public static class DiagnoseCategory {

			private String categoryName;

			private String reachable;

			private List<CategoryItem> categoryItems;

			public String getCategoryName() {
				return this.categoryName;
			}

			public void setCategoryName(String categoryName) {
				this.categoryName = categoryName;
			}

			public String getReachable() {
				return this.reachable;
			}

			public void setReachable(String reachable) {
				this.reachable = reachable;
			}

			public List<CategoryItem> getCategoryItems() {
				return this.categoryItems;
			}

			public void setCategoryItems(List<CategoryItem> categoryItems) {
				this.categoryItems = categoryItems;
			}

			public static class CategoryItem {

				private String itemName;

				private String reachable;

				private String code;

				private Explanations explanations;

				public String getItemName() {
					return this.itemName;
				}

				public void setItemName(String itemName) {
					this.itemName = itemName;
				}

				public String getReachable() {
					return this.reachable;
				}

				public void setReachable(String reachable) {
					this.reachable = reachable;
				}

				public String getCode() {
					return this.code;
				}

				public void setCode(String code) {
					this.code = code;
				}

				public Explanations getExplanations() {
					return this.explanations;
				}

				public void setExplanations(Explanations explanations) {
					this.explanations = explanations;
				}

				public static class Explanations {

					private String missingFiles;

					private Long actualPort;

					private Long expectPort;

					private String networkInterfaceName;

					private String netmask;

					private String expectIP;

					private String actualIP;

					private String ip;

					private String header;

					private String rule;

					private String usePercent;

					private Long port;

					private String expireDate;

					private String processName;

					private String groupId;

					private List<String> topProcesses;

					private List<String> relativeGroupIds1;

					private SecurityGroupAcl2 securityGroupAcl2;

					private NetworkAclEntry3 networkAclEntry3;

					public String getMissingFiles() {
						return this.missingFiles;
					}

					public void setMissingFiles(String missingFiles) {
						this.missingFiles = missingFiles;
					}

					public Long getActualPort() {
						return this.actualPort;
					}

					public void setActualPort(Long actualPort) {
						this.actualPort = actualPort;
					}

					public Long getExpectPort() {
						return this.expectPort;
					}

					public void setExpectPort(Long expectPort) {
						this.expectPort = expectPort;
					}

					public String getNetworkInterfaceName() {
						return this.networkInterfaceName;
					}

					public void setNetworkInterfaceName(String networkInterfaceName) {
						this.networkInterfaceName = networkInterfaceName;
					}

					public String getNetmask() {
						return this.netmask;
					}

					public void setNetmask(String netmask) {
						this.netmask = netmask;
					}

					public String getExpectIP() {
						return this.expectIP;
					}

					public void setExpectIP(String expectIP) {
						this.expectIP = expectIP;
					}

					public String getActualIP() {
						return this.actualIP;
					}

					public void setActualIP(String actualIP) {
						this.actualIP = actualIP;
					}

					public String getIp() {
						return this.ip;
					}

					public void setIp(String ip) {
						this.ip = ip;
					}

					public String getHeader() {
						return this.header;
					}

					public void setHeader(String header) {
						this.header = header;
					}

					public String getRule() {
						return this.rule;
					}

					public void setRule(String rule) {
						this.rule = rule;
					}

					public String getUsePercent() {
						return this.usePercent;
					}

					public void setUsePercent(String usePercent) {
						this.usePercent = usePercent;
					}

					public Long getPort() {
						return this.port;
					}

					public void setPort(Long port) {
						this.port = port;
					}

					public String getExpireDate() {
						return this.expireDate;
					}

					public void setExpireDate(String expireDate) {
						this.expireDate = expireDate;
					}

					public String getProcessName() {
						return this.processName;
					}

					public void setProcessName(String processName) {
						this.processName = processName;
					}

					public String getGroupId() {
						return this.groupId;
					}

					public void setGroupId(String groupId) {
						this.groupId = groupId;
					}

					public List<String> getTopProcesses() {
						return this.topProcesses;
					}

					public void setTopProcesses(List<String> topProcesses) {
						this.topProcesses = topProcesses;
					}

					public List<String> getRelativeGroupIds1() {
						return this.relativeGroupIds1;
					}

					public void setRelativeGroupIds1(List<String> relativeGroupIds1) {
						this.relativeGroupIds1 = relativeGroupIds1;
					}

					public SecurityGroupAcl2 getSecurityGroupAcl2() {
						return this.securityGroupAcl2;
					}

					public void setSecurityGroupAcl2(SecurityGroupAcl2 securityGroupAcl2) {
						this.securityGroupAcl2 = securityGroupAcl2;
					}

					public NetworkAclEntry3 getNetworkAclEntry3() {
						return this.networkAclEntry3;
					}

					public void setNetworkAclEntry3(NetworkAclEntry3 networkAclEntry3) {
						this.networkAclEntry3 = networkAclEntry3;
					}

					public static class SecurityGroupAcl2 {

						private String policy;

						private String description;

						private String sourcePortRange;

						private String createTime;

						private String sourceCidrIp;

						private String destCidrIp;

						private String innerAccessPolicy;

						private String nicType;

						private String destPortRange;

						private String destGroupId;

						public String getPolicy() {
							return this.policy;
						}

						public void setPolicy(String policy) {
							this.policy = policy;
						}

						public String getDescription() {
							return this.description;
						}

						public void setDescription(String description) {
							this.description = description;
						}

						public String getSourcePortRange() {
							return this.sourcePortRange;
						}

						public void setSourcePortRange(String sourcePortRange) {
							this.sourcePortRange = sourcePortRange;
						}

						public String getCreateTime() {
							return this.createTime;
						}

						public void setCreateTime(String createTime) {
							this.createTime = createTime;
						}

						public String getSourceCidrIp() {
							return this.sourceCidrIp;
						}

						public void setSourceCidrIp(String sourceCidrIp) {
							this.sourceCidrIp = sourceCidrIp;
						}

						public String getDestCidrIp() {
							return this.destCidrIp;
						}

						public void setDestCidrIp(String destCidrIp) {
							this.destCidrIp = destCidrIp;
						}

						public String getInnerAccessPolicy() {
							return this.innerAccessPolicy;
						}

						public void setInnerAccessPolicy(String innerAccessPolicy) {
							this.innerAccessPolicy = innerAccessPolicy;
						}

						public String getNicType() {
							return this.nicType;
						}

						public void setNicType(String nicType) {
							this.nicType = nicType;
						}

						public String getDestPortRange() {
							return this.destPortRange;
						}

						public void setDestPortRange(String destPortRange) {
							this.destPortRange = destPortRange;
						}

						public String getDestGroupId() {
							return this.destGroupId;
						}

						public void setDestGroupId(String destGroupId) {
							this.destGroupId = destGroupId;
						}
					}

					public static class NetworkAclEntry3 {

						private String policy;

						private String networkAclId;

						private String vpcId;

						private String port;

						private String sourceCidrIp;

						private String networkAclName;

						private String protocol;

						private String networkAclEntryId;

						private String direction;

						public String getPolicy() {
							return this.policy;
						}

						public void setPolicy(String policy) {
							this.policy = policy;
						}

						public String getNetworkAclId() {
							return this.networkAclId;
						}

						public void setNetworkAclId(String networkAclId) {
							this.networkAclId = networkAclId;
						}

						public String getVpcId() {
							return this.vpcId;
						}

						public void setVpcId(String vpcId) {
							this.vpcId = vpcId;
						}

						public String getPort() {
							return this.port;
						}

						public void setPort(String port) {
							this.port = port;
						}

						public String getSourceCidrIp() {
							return this.sourceCidrIp;
						}

						public void setSourceCidrIp(String sourceCidrIp) {
							this.sourceCidrIp = sourceCidrIp;
						}

						public String getNetworkAclName() {
							return this.networkAclName;
						}

						public void setNetworkAclName(String networkAclName) {
							this.networkAclName = networkAclName;
						}

						public String getBizProtocol() {
							return this.protocol;
						}

						public void setBizProtocol(String protocol) {
							this.protocol = protocol;
						}

						public String getNetworkAclEntryId() {
							return this.networkAclEntryId;
						}

						public void setNetworkAclEntryId(String networkAclEntryId) {
							this.networkAclEntryId = networkAclEntryId;
						}

						public String getDirection() {
							return this.direction;
						}

						public void setDirection(String direction) {
							this.direction = direction;
						}
					}
				}
			}
		}

		public static class MetricResult {

			private String metricId;

			private String metricCategory;

			private String severity;

			private String status;

			private List<Issue> issues;

			public String getMetricId() {
				return this.metricId;
			}

			public void setMetricId(String metricId) {
				this.metricId = metricId;
			}

			public String getMetricCategory() {
				return this.metricCategory;
			}

			public void setMetricCategory(String metricCategory) {
				this.metricCategory = metricCategory;
			}

			public String getSeverity() {
				return this.severity;
			}

			public void setSeverity(String severity) {
				this.severity = severity;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public List<Issue> getIssues() {
				return this.issues;
			}

			public void setIssues(List<Issue> issues) {
				this.issues = issues;
			}

			public static class Issue {

				private String issueId;

				private String severity;

				private String additional;

				private String occurrenceTime;

				public String getIssueId() {
					return this.issueId;
				}

				public void setIssueId(String issueId) {
					this.issueId = issueId;
				}

				public String getSeverity() {
					return this.severity;
				}

				public void setSeverity(String severity) {
					this.severity = severity;
				}

				public String getAdditional() {
					return this.additional;
				}

				public void setAdditional(String additional) {
					this.additional = additional;
				}

				public String getOccurrenceTime() {
					return this.occurrenceTime;
				}

				public void setOccurrenceTime(String occurrenceTime) {
					this.occurrenceTime = occurrenceTime;
				}
			}
		}

		public static class NetworkAclEntry {

			private String creationTime;

			private String networkAclId;

			private String networkAclName;

			private String networkAclEntryId;

			private String networkAclEntryName;

			private String vpcId;

			private String direction;

			private String policy;

			private String port;

			private String protocol;

			private String destinationCidrIp;

			private String sourceCidrIp;

			public String getCreationTime() {
				return this.creationTime;
			}

			public void setCreationTime(String creationTime) {
				this.creationTime = creationTime;
			}

			public String getNetworkAclId() {
				return this.networkAclId;
			}

			public void setNetworkAclId(String networkAclId) {
				this.networkAclId = networkAclId;
			}

			public String getNetworkAclName() {
				return this.networkAclName;
			}

			public void setNetworkAclName(String networkAclName) {
				this.networkAclName = networkAclName;
			}

			public String getNetworkAclEntryId() {
				return this.networkAclEntryId;
			}

			public void setNetworkAclEntryId(String networkAclEntryId) {
				this.networkAclEntryId = networkAclEntryId;
			}

			public String getNetworkAclEntryName() {
				return this.networkAclEntryName;
			}

			public void setNetworkAclEntryName(String networkAclEntryName) {
				this.networkAclEntryName = networkAclEntryName;
			}

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}

			public String getDirection() {
				return this.direction;
			}

			public void setDirection(String direction) {
				this.direction = direction;
			}

			public String getPolicy() {
				return this.policy;
			}

			public void setPolicy(String policy) {
				this.policy = policy;
			}

			public String getPort() {
				return this.port;
			}

			public void setPort(String port) {
				this.port = port;
			}

			public String getBizProtocol() {
				return this.protocol;
			}

			public void setBizProtocol(String protocol) {
				this.protocol = protocol;
			}

			public String getDestinationCidrIp() {
				return this.destinationCidrIp;
			}

			public void setDestinationCidrIp(String destinationCidrIp) {
				this.destinationCidrIp = destinationCidrIp;
			}

			public String getSourceCidrIp() {
				return this.sourceCidrIp;
			}

			public void setSourceCidrIp(String sourceCidrIp) {
				this.sourceCidrIp = sourceCidrIp;
			}
		}

		public static class SecurityGroupAcl {

			private String securityGroupId;

			private String description;

			private String innerAccessPolicy;

			private String createTime;

			private String permissionDescription;

			private String priority;

			private String sourceCidrIp;

			private String sourceGroupId;

			private String sourceGroupName;

			private String sourcePortRange;

			private String policy;

			private String nicType;

			private String direction;

			private String ipProtocol;

			private String destCidrIp;

			private String destGroupId;

			private String destGroupName;

			private String ipv6DestCidrIp;

			private String ipv6SourceCidrIp;

			private String destPortRange;

			public String getSecurityGroupId() {
				return this.securityGroupId;
			}

			public void setSecurityGroupId(String securityGroupId) {
				this.securityGroupId = securityGroupId;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getInnerAccessPolicy() {
				return this.innerAccessPolicy;
			}

			public void setInnerAccessPolicy(String innerAccessPolicy) {
				this.innerAccessPolicy = innerAccessPolicy;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getPermissionDescription() {
				return this.permissionDescription;
			}

			public void setPermissionDescription(String permissionDescription) {
				this.permissionDescription = permissionDescription;
			}

			public String getPriority() {
				return this.priority;
			}

			public void setPriority(String priority) {
				this.priority = priority;
			}

			public String getSourceCidrIp() {
				return this.sourceCidrIp;
			}

			public void setSourceCidrIp(String sourceCidrIp) {
				this.sourceCidrIp = sourceCidrIp;
			}

			public String getSourceGroupId() {
				return this.sourceGroupId;
			}

			public void setSourceGroupId(String sourceGroupId) {
				this.sourceGroupId = sourceGroupId;
			}

			public String getSourceGroupName() {
				return this.sourceGroupName;
			}

			public void setSourceGroupName(String sourceGroupName) {
				this.sourceGroupName = sourceGroupName;
			}

			public String getSourcePortRange() {
				return this.sourcePortRange;
			}

			public void setSourcePortRange(String sourcePortRange) {
				this.sourcePortRange = sourcePortRange;
			}

			public String getPolicy() {
				return this.policy;
			}

			public void setPolicy(String policy) {
				this.policy = policy;
			}

			public String getNicType() {
				return this.nicType;
			}

			public void setNicType(String nicType) {
				this.nicType = nicType;
			}

			public String getDirection() {
				return this.direction;
			}

			public void setDirection(String direction) {
				this.direction = direction;
			}

			public String getIpProtocol() {
				return this.ipProtocol;
			}

			public void setIpProtocol(String ipProtocol) {
				this.ipProtocol = ipProtocol;
			}

			public String getDestCidrIp() {
				return this.destCidrIp;
			}

			public void setDestCidrIp(String destCidrIp) {
				this.destCidrIp = destCidrIp;
			}

			public String getDestGroupId() {
				return this.destGroupId;
			}

			public void setDestGroupId(String destGroupId) {
				this.destGroupId = destGroupId;
			}

			public String getDestGroupName() {
				return this.destGroupName;
			}

			public void setDestGroupName(String destGroupName) {
				this.destGroupName = destGroupName;
			}

			public String getIpv6DestCidrIp() {
				return this.ipv6DestCidrIp;
			}

			public void setIpv6DestCidrIp(String ipv6DestCidrIp) {
				this.ipv6DestCidrIp = ipv6DestCidrIp;
			}

			public String getIpv6SourceCidrIp() {
				return this.ipv6SourceCidrIp;
			}

			public void setIpv6SourceCidrIp(String ipv6SourceCidrIp) {
				this.ipv6SourceCidrIp = ipv6SourceCidrIp;
			}

			public String getDestPortRange() {
				return this.destPortRange;
			}

			public void setDestPortRange(String destPortRange) {
				this.destPortRange = destPortRange;
			}
		}
	}

	@Override
	public DescribeNetworkInsightsAnalysisResultResponse getInstance(UnmarshallerContext context) {
		return	DescribeNetworkInsightsAnalysisResultResponseUnmarshaller.unmarshall(this, context);
	}
}
