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
import com.aliyuncs.elasticsearch.transform.v20170613.MoveResourceGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class MoveResourceGroupResponse extends AcsResponse {

	private String requestId;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Integer nodeAmount;

		private String publicDomain;

		private String createdAt;

		private String status;

		private Integer publicPort;

		private Integer kibanaPort;

		private String paymentType;

		private String domain;

		private String description;

		private String esVersion;

		private String kibanaDomain;

		private String updatedAt;

		private String instanceId;

		private List<DictListItem> dictList;

		private List<SynonymsDictsItem> synonymsDicts;

		private NodeSpec nodeSpec;

		private NetworkConfig networkConfig;

		private KibanaConfiguration kibanaConfiguration;

		private MasterConfiguration masterConfiguration;

		public Integer getNodeAmount() {
			return this.nodeAmount;
		}

		public void setNodeAmount(Integer nodeAmount) {
			this.nodeAmount = nodeAmount;
		}

		public String getPublicDomain() {
			return this.publicDomain;
		}

		public void setPublicDomain(String publicDomain) {
			this.publicDomain = publicDomain;
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

		public Integer getPublicPort() {
			return this.publicPort;
		}

		public void setPublicPort(Integer publicPort) {
			this.publicPort = publicPort;
		}

		public Integer getKibanaPort() {
			return this.kibanaPort;
		}

		public void setKibanaPort(Integer kibanaPort) {
			this.kibanaPort = kibanaPort;
		}

		public String getPaymentType() {
			return this.paymentType;
		}

		public void setPaymentType(String paymentType) {
			this.paymentType = paymentType;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
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

		public String getKibanaDomain() {
			return this.kibanaDomain;
		}

		public void setKibanaDomain(String kibanaDomain) {
			this.kibanaDomain = kibanaDomain;
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

		public List<DictListItem> getDictList() {
			return this.dictList;
		}

		public void setDictList(List<DictListItem> dictList) {
			this.dictList = dictList;
		}

		public List<SynonymsDictsItem> getSynonymsDicts() {
			return this.synonymsDicts;
		}

		public void setSynonymsDicts(List<SynonymsDictsItem> synonymsDicts) {
			this.synonymsDicts = synonymsDicts;
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

		public static class DictListItem {

			private Long fileSize;

			private String sourceType;

			private String name;

			private String type;

			public Long getFileSize() {
				return this.fileSize;
			}

			public void setFileSize(Long fileSize) {
				this.fileSize = fileSize;
			}

			public String getSourceType() {
				return this.sourceType;
			}

			public void setSourceType(String sourceType) {
				this.sourceType = sourceType;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}
		}

		public static class SynonymsDictsItem {

			private Long fileSize;

			private String sourceType;

			private String name;

			private String type;

			public Long getFileSize() {
				return this.fileSize;
			}

			public void setFileSize(Long fileSize) {
				this.fileSize = fileSize;
			}

			public String getSourceType() {
				return this.sourceType;
			}

			public void setSourceType(String sourceType) {
				this.sourceType = sourceType;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}
		}

		public static class NodeSpec {

			private String spec;

			private Integer disk;

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

		public static class KibanaConfiguration {

			private String spec;

			private Integer amount;

			private Integer disk;

			private String diskType;

			public String getSpec() {
				return this.spec;
			}

			public void setSpec(String spec) {
				this.spec = spec;
			}

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
		}

		public static class MasterConfiguration {

			private String spec;

			private Integer amount;

			private Integer disk;

			private String diskType;

			public String getSpec() {
				return this.spec;
			}

			public void setSpec(String spec) {
				this.spec = spec;
			}

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
		}
	}

	@Override
	public MoveResourceGroupResponse getInstance(UnmarshallerContext context) {
		return	MoveResourceGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
