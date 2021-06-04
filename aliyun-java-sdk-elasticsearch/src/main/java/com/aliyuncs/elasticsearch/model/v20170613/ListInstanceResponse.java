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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.elasticsearch.transform.v20170613.ListInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListInstanceResponse extends AcsResponse {

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

		private Boolean advancedDedicateMaster;

		private String createdAt;

		private Boolean dedicateMaster;

		private String description;

		private String esVersion;

		private String instanceId;

		private Integer nodeAmount;

		private String paymentType;

		private String resourceGroupId;

		private String status;

		private String updatedAt;

		private String postpaidServiceStatus;

		private List<Tag> tags;

		private List<Map<Object,Object>> extendConfigs;

		private ClientNodeConfiguration clientNodeConfiguration;

		private ElasticDataNodeConfiguration elasticDataNodeConfiguration;

		private KibanaConfiguration kibanaConfiguration;

		private MasterConfiguration masterConfiguration;

		private NetworkConfig networkConfig;

		private NodeSpec nodeSpec;

		public Boolean getAdvancedDedicateMaster() {
			return this.advancedDedicateMaster;
		}

		public void setAdvancedDedicateMaster(Boolean advancedDedicateMaster) {
			this.advancedDedicateMaster = advancedDedicateMaster;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public Boolean getDedicateMaster() {
			return this.dedicateMaster;
		}

		public void setDedicateMaster(Boolean dedicateMaster) {
			this.dedicateMaster = dedicateMaster;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getEsVersion() {
			return this.esVersion;
		}

		public void setEsVersion(String esVersion) {
			this.esVersion = esVersion;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Integer getNodeAmount() {
			return this.nodeAmount;
		}

		public void setNodeAmount(Integer nodeAmount) {
			this.nodeAmount = nodeAmount;
		}

		public String getPaymentType() {
			return this.paymentType;
		}

		public void setPaymentType(String paymentType) {
			this.paymentType = paymentType;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
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

		public String getPostpaidServiceStatus() {
			return this.postpaidServiceStatus;
		}

		public void setPostpaidServiceStatus(String postpaidServiceStatus) {
			this.postpaidServiceStatus = postpaidServiceStatus;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<Map<Object,Object>> getExtendConfigs() {
			return this.extendConfigs;
		}

		public void setExtendConfigs(List<Map<Object,Object>> extendConfigs) {
			this.extendConfigs = extendConfigs;
		}

		public ClientNodeConfiguration getClientNodeConfiguration() {
			return this.clientNodeConfiguration;
		}

		public void setClientNodeConfiguration(ClientNodeConfiguration clientNodeConfiguration) {
			this.clientNodeConfiguration = clientNodeConfiguration;
		}

		public ElasticDataNodeConfiguration getElasticDataNodeConfiguration() {
			return this.elasticDataNodeConfiguration;
		}

		public void setElasticDataNodeConfiguration(ElasticDataNodeConfiguration elasticDataNodeConfiguration) {
			this.elasticDataNodeConfiguration = elasticDataNodeConfiguration;
		}

		public KibanaConfiguration getKibanaConfiguration() {
			return this.kibanaConfiguration;
		}

		public void setKibanaConfiguration(KibanaConfiguration kibanaConfiguration) {
			this.kibanaConfiguration = kibanaConfiguration;
		}

		public MasterConfiguration getMasterConfiguration() {
			return this.masterConfiguration;
		}

		public void setMasterConfiguration(MasterConfiguration masterConfiguration) {
			this.masterConfiguration = masterConfiguration;
		}

		public NetworkConfig getNetworkConfig() {
			return this.networkConfig;
		}

		public void setNetworkConfig(NetworkConfig networkConfig) {
			this.networkConfig = networkConfig;
		}

		public NodeSpec getNodeSpec() {
			return this.nodeSpec;
		}

		public void setNodeSpec(NodeSpec nodeSpec) {
			this.nodeSpec = nodeSpec;
		}

		public static class Tag {

			private String tagKey;

			private String tagValue;

			public String getTagKey() {
				return this.tagKey;
			}

			public void setTagKey(String tagKey) {
				this.tagKey = tagKey;
			}

			public String getTagValue() {
				return this.tagValue;
			}

			public void setTagValue(String tagValue) {
				this.tagValue = tagValue;
			}
		}

		public static class ClientNodeConfiguration {

			private Integer amount;

			private Integer disk;

			private String diskType;

			private String spec;

			public Integer getAmount() {
				return this.amount;
			}

			public void setAmount(Integer amount) {
				this.amount = amount;
			}

			public Integer getDisk() {
				return this.disk;
			}

			public void setDisk(Integer disk) {
				this.disk = disk;
			}

			public String getDiskType() {
				return this.diskType;
			}

			public void setDiskType(String diskType) {
				this.diskType = diskType;
			}

			public String getSpec() {
				return this.spec;
			}

			public void setSpec(String spec) {
				this.spec = spec;
			}
		}

		public static class ElasticDataNodeConfiguration {

			private Integer amount;

			private Integer disk;

			private Boolean diskEncryption;

			private String diskType;

			private String spec;

			public Integer getAmount() {
				return this.amount;
			}

			public void setAmount(Integer amount) {
				this.amount = amount;
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

			public String getSpec() {
				return this.spec;
			}

			public void setSpec(String spec) {
				this.spec = spec;
			}
		}

		public static class KibanaConfiguration {

			private Integer amount;

			private Integer disk;

			private String diskType;

			private String spec;

			public Integer getAmount() {
				return this.amount;
			}

			public void setAmount(Integer amount) {
				this.amount = amount;
			}

			public Integer getDisk() {
				return this.disk;
			}

			public void setDisk(Integer disk) {
				this.disk = disk;
			}

			public String getDiskType() {
				return this.diskType;
			}

			public void setDiskType(String diskType) {
				this.diskType = diskType;
			}

			public String getSpec() {
				return this.spec;
			}

			public void setSpec(String spec) {
				this.spec = spec;
			}
		}

		public static class MasterConfiguration {

			private Integer amount;

			private Integer disk;

			private String diskType;

			private String spec;

			public Integer getAmount() {
				return this.amount;
			}

			public void setAmount(Integer amount) {
				this.amount = amount;
			}

			public Integer getDisk() {
				return this.disk;
			}

			public void setDisk(Integer disk) {
				this.disk = disk;
			}

			public String getDiskType() {
				return this.diskType;
			}

			public void setDiskType(String diskType) {
				this.diskType = diskType;
			}

			public String getSpec() {
				return this.spec;
			}

			public void setSpec(String spec) {
				this.spec = spec;
			}
		}

		public static class NetworkConfig {

			private String type;

			private String vpcId;

			private String vsArea;

			private String vswitchId;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

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

			public String getVswitchId() {
				return this.vswitchId;
			}

			public void setVswitchId(String vswitchId) {
				this.vswitchId = vswitchId;
			}
		}

		public static class NodeSpec {

			private Integer disk;

			private Boolean diskEncryption;

			private String diskType;

			private String spec;

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

			public String getSpec() {
				return this.spec;
			}

			public void setSpec(String spec) {
				this.spec = spec;
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
	public ListInstanceResponse getInstance(UnmarshallerContext context) {
		return	ListInstanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
