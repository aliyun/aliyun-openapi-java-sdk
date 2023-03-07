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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.DescribeNetworkAclAttributesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeNetworkAclAttributesResponse extends AcsResponse {

	private String requestId;

	private NetworkAclAttribute networkAclAttribute;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public NetworkAclAttribute getNetworkAclAttribute() {
		return this.networkAclAttribute;
	}

	public void setNetworkAclAttribute(NetworkAclAttribute networkAclAttribute) {
		this.networkAclAttribute = networkAclAttribute;
	}

	public static class NetworkAclAttribute {

		private String status;

		private String vpcId;

		private String creationTime;

		private String description;

		private String networkAclName;

		private String networkAclId;

		private Long ownerId;

		private String regionId;

		private List<IngressAclEntry> ingressAclEntries;

		private List<EgressAclEntry> egressAclEntries;

		private List<Resource> resources;

		private List<Tag> tags;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
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

		public String getNetworkAclName() {
			return this.networkAclName;
		}

		public void setNetworkAclName(String networkAclName) {
			this.networkAclName = networkAclName;
		}

		public String getNetworkAclId() {
			return this.networkAclId;
		}

		public void setNetworkAclId(String networkAclId) {
			this.networkAclId = networkAclId;
		}

		public Long getOwnerId() {
			return this.ownerId;
		}

		public void setOwnerId(Long ownerId) {
			this.ownerId = ownerId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public List<IngressAclEntry> getIngressAclEntries() {
			return this.ingressAclEntries;
		}

		public void setIngressAclEntries(List<IngressAclEntry> ingressAclEntries) {
			this.ingressAclEntries = ingressAclEntries;
		}

		public List<EgressAclEntry> getEgressAclEntries() {
			return this.egressAclEntries;
		}

		public void setEgressAclEntries(List<EgressAclEntry> egressAclEntries) {
			this.egressAclEntries = egressAclEntries;
		}

		public List<Resource> getResources() {
			return this.resources;
		}

		public void setResources(List<Resource> resources) {
			this.resources = resources;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public static class IngressAclEntry {

			private String networkAclEntryId;

			private String entryType;

			private String networkAclEntryName;

			private String policy;

			private String description;

			private String sourceCidrIp;

			private String protocol;

			private String port;

			public String getNetworkAclEntryId() {
				return this.networkAclEntryId;
			}

			public void setNetworkAclEntryId(String networkAclEntryId) {
				this.networkAclEntryId = networkAclEntryId;
			}

			public String getEntryType() {
				return this.entryType;
			}

			public void setEntryType(String entryType) {
				this.entryType = entryType;
			}

			public String getNetworkAclEntryName() {
				return this.networkAclEntryName;
			}

			public void setNetworkAclEntryName(String networkAclEntryName) {
				this.networkAclEntryName = networkAclEntryName;
			}

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

			public String getSourceCidrIp() {
				return this.sourceCidrIp;
			}

			public void setSourceCidrIp(String sourceCidrIp) {
				this.sourceCidrIp = sourceCidrIp;
			}

			public String getBizProtocol() {
				return this.protocol;
			}

			public void setBizProtocol(String protocol) {
				this.protocol = protocol;
			}

			public String getPort() {
				return this.port;
			}

			public void setPort(String port) {
				this.port = port;
			}
		}

		public static class EgressAclEntry {

			private String networkAclEntryId;

			private String entryType;

			private String networkAclEntryName;

			private String policy;

			private String description;

			private String protocol;

			private String destinationCidrIp;

			private String port;

			public String getNetworkAclEntryId() {
				return this.networkAclEntryId;
			}

			public void setNetworkAclEntryId(String networkAclEntryId) {
				this.networkAclEntryId = networkAclEntryId;
			}

			public String getEntryType() {
				return this.entryType;
			}

			public void setEntryType(String entryType) {
				this.entryType = entryType;
			}

			public String getNetworkAclEntryName() {
				return this.networkAclEntryName;
			}

			public void setNetworkAclEntryName(String networkAclEntryName) {
				this.networkAclEntryName = networkAclEntryName;
			}

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

			public String getPort() {
				return this.port;
			}

			public void setPort(String port) {
				this.port = port;
			}
		}

		public static class Resource {

			private String status;

			private String resourceType;

			private String resourceId;

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
		}

		public static class Tag {

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

	@Override
	public DescribeNetworkAclAttributesResponse getInstance(UnmarshallerContext context) {
		return	DescribeNetworkAclAttributesResponseUnmarshaller.unmarshall(this, context);
	}
}
