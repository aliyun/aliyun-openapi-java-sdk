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

package com.aliyuncs.ens.model.v20171110;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.DescribeNetworkAclsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeNetworkAclsResponse extends AcsResponse {

	private String requestId;

	private String totalCount;

	private String pageSize;

	private String pageNumber;

	private List<NetworkAcl> networkAcls;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<NetworkAcl> getNetworkAcls() {
		return this.networkAcls;
	}

	public void setNetworkAcls(List<NetworkAcl> networkAcls) {
		this.networkAcls = networkAcls;
	}

	public static class NetworkAcl {

		private String status;

		private String creationTime;

		private String description;

		private String networkAclId;

		private String networkAclName;

		private List<IngressAclRule> ingressAclEntries;

		private List<EgressAclRule> egressAclEntries;

		private List<Resource> resources;

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

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
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

		public List<IngressAclRule> getIngressAclEntries() {
			return this.ingressAclEntries;
		}

		public void setIngressAclEntries(List<IngressAclRule> ingressAclEntries) {
			this.ingressAclEntries = ingressAclEntries;
		}

		public List<EgressAclRule> getEgressAclEntries() {
			return this.egressAclEntries;
		}

		public void setEgressAclEntries(List<EgressAclRule> egressAclEntries) {
			this.egressAclEntries = egressAclEntries;
		}

		public List<Resource> getResources() {
			return this.resources;
		}

		public void setResources(List<Resource> resources) {
			this.resources = resources;
		}

		public static class IngressAclRule {

			private String policy;

			private String networkAclEntryId;

			private String networkAclEntryName;

			private String cidrBlock;

			private String protocol;

			private String portRange;

			private Integer priority;

			private String type;

			private String description;

			public String getPolicy() {
				return this.policy;
			}

			public void setPolicy(String policy) {
				this.policy = policy;
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

			public String getCidrBlock() {
				return this.cidrBlock;
			}

			public void setCidrBlock(String cidrBlock) {
				this.cidrBlock = cidrBlock;
			}

			public String getBizProtocol() {
				return this.protocol;
			}

			public void setBizProtocol(String protocol) {
				this.protocol = protocol;
			}

			public String getPortRange() {
				return this.portRange;
			}

			public void setPortRange(String portRange) {
				this.portRange = portRange;
			}

			public Integer getPriority() {
				return this.priority;
			}

			public void setPriority(Integer priority) {
				this.priority = priority;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}
		}

		public static class EgressAclRule {

			private String policy;

			private String networkAclEntryId;

			private String networkAclEntryName;

			private String cidrBlock;

			private String protocol;

			private String portRange;

			private Integer priority;

			private String type;

			private String description;

			public String getPolicy() {
				return this.policy;
			}

			public void setPolicy(String policy) {
				this.policy = policy;
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

			public String getCidrBlock() {
				return this.cidrBlock;
			}

			public void setCidrBlock(String cidrBlock) {
				this.cidrBlock = cidrBlock;
			}

			public String getBizProtocol() {
				return this.protocol;
			}

			public void setBizProtocol(String protocol) {
				this.protocol = protocol;
			}

			public String getPortRange() {
				return this.portRange;
			}

			public void setPortRange(String portRange) {
				this.portRange = portRange;
			}

			public Integer getPriority() {
				return this.priority;
			}

			public void setPriority(Integer priority) {
				this.priority = priority;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}
		}

		public static class Resource {

			private String status;

			private String resourceType;

			private String resourceId;

			private String ensRegionId;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getResourceType() {
				return this.resourceType;
			}

			public void setResourceType(String resourceType) {
				this.resourceType = resourceType;
			}

			public String getResourceId() {
				return this.resourceId;
			}

			public void setResourceId(String resourceId) {
				this.resourceId = resourceId;
			}

			public String getEnsRegionId() {
				return this.ensRegionId;
			}

			public void setEnsRegionId(String ensRegionId) {
				this.ensRegionId = ensRegionId;
			}
		}
	}

	@Override
	public DescribeNetworkAclsResponse getInstance(UnmarshallerContext context) {
		return	DescribeNetworkAclsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
