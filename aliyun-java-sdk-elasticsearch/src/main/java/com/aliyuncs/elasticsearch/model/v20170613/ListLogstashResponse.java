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

package com.aliyuncs.elasticsearch.model.v20170613;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.elasticsearch.transform.v20170613.ListLogstashResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListLogstashResponse extends AcsResponse {

	private String requestId;

	private List<Instance> result;

	private Headers headers;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Instance> getResult() {
		return this.result;
	}

	public void setResult(List<Instance> result) {
		this.result = result;
	}

	public Headers getHeaders() {
		return this.headers;
	}

	public void setHeaders(Headers headers) {
		this.headers = headers;
	}

	public static class Instance {

		private String paymentType;

		private Integer nodeAmount;

		private String description;

		private String createdAt;

		private String status;

		private String updatedAt;

		private String instanceId;

		private String version;

		private String resourceGroupId;

		private List<TagsItem> tags;

		private NodeSpec nodeSpec;

		private NetworkConfig networkConfig;

		public String getPaymentType() {
			return this.paymentType;
		}

		public void setPaymentType(String paymentType) {
			this.paymentType = paymentType;
		}

		public Integer getNodeAmount() {
			return this.nodeAmount;
		}

		public void setNodeAmount(Integer nodeAmount) {
			this.nodeAmount = nodeAmount;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getUpdatedAt() {
			return this.updatedAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public List<TagsItem> getTags() {
			return this.tags;
		}

		public void setTags(List<TagsItem> tags) {
			this.tags = tags;
		}

		public NodeSpec getNodeSpec() {
			return this.nodeSpec;
		}

		public void setNodeSpec(NodeSpec nodeSpec) {
			this.nodeSpec = nodeSpec;
		}

		public NetworkConfig getNetworkConfig() {
			return this.networkConfig;
		}

		public void setNetworkConfig(NetworkConfig networkConfig) {
			this.networkConfig = networkConfig;
		}

		public static class TagsItem {

			private String tagValue;

			private String tagKey;

			public String getTagValue() {
				return this.tagValue;
			}

			public void setTagValue(String tagValue) {
				this.tagValue = tagValue;
			}

			public String getTagKey() {
				return this.tagKey;
			}

			public void setTagKey(String tagKey) {
				this.tagKey = tagKey;
			}
		}

		public static class NodeSpec {

			private String spec;

			private Integer disk;

			private Boolean diskEncryption;

			private String diskType;

			public String getSpec() {
				return this.spec;
			}

			public void setSpec(String spec) {
				this.spec = spec;
			}

			public Integer getDisk() {
				return this.disk;
			}

			public void setDisk(Integer disk) {
				this.disk = disk;
			}

			public Boolean getDiskEncryption() {
				return this.diskEncryption;
			}

			public void setDiskEncryption(Boolean diskEncryption) {
				this.diskEncryption = diskEncryption;
			}

			public String getDiskType() {
				return this.diskType;
			}

			public void setDiskType(String diskType) {
				this.diskType = diskType;
			}
		}

		public static class NetworkConfig {

			private String vpcId;

			private String vsArea;

			private String type;

			private String vswitchId;

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}

			public String getVsArea() {
				return this.vsArea;
			}

			public void setVsArea(String vsArea) {
				this.vsArea = vsArea;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getVswitchId() {
				return this.vswitchId;
			}

			public void setVswitchId(String vswitchId) {
				this.vswitchId = vswitchId;
			}
		}
	}

	public static class Headers {

		private Integer xTotalCount;

		public Integer getXTotalCount() {
			return this.xTotalCount;
		}

		public void setXTotalCount(Integer xTotalCount) {
			this.xTotalCount = xTotalCount;
		}
	}

	@Override
	public ListLogstashResponse getInstance(UnmarshallerContext context) {
		return	ListLogstashResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
