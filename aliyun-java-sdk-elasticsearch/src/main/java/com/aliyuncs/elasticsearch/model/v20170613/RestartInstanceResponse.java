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
import com.aliyuncs.elasticsearch.transform.v20170613.RestartInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RestartInstanceResponse extends AcsResponse {

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

		private String createdAt;

		private String description;

		private String domain;

		private String esVersion;

		private String instanceId;

		private String kibanaDomain;

		private Integer kibanaPort;

		private Integer nodeAmount;

		private String paymentType;

		private String publicDomain;

		private Integer publicPort;

		private String status;

		private String updatedAt;

		private List<DictListItem> dictList;

		private List<SynonymsDictsItem> synonymsDicts;

		private KibanaConfiguration kibanaConfiguration;

		private MasterConfiguration masterConfiguration;

		private NetworkConfig networkConfig;

		private NodeSpec nodeSpec;

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
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

		public String getKibanaDomain() {
			return this.kibanaDomain;
		}

		public void setKibanaDomain(String kibanaDomain) {
			this.kibanaDomain = kibanaDomain;
		}

		public Integer getKibanaPort() {
			return this.kibanaPort;
		}

		public void setKibanaPort(Integer kibanaPort) {
			this.kibanaPort = kibanaPort;
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

		public String getPublicDomain() {
			return this.publicDomain;
		}

		public void setPublicDomain(String publicDomain) {
			this.publicDomain = publicDomain;
		}

		public Integer getPublicPort() {
			return this.publicPort;
		}

		public void setPublicPort(Integer publicPort) {
			this.publicPort = publicPort;
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

		public static class DictListItem {

			private Long fileSize;

			private String name;

			private String sourceType;

			private String type;

			public Long getFileSize() {
				return this.fileSize;
			}

			public void setFileSize(Long fileSize) {
				this.fileSize = fileSize;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getSourceType() {
				return this.sourceType;
			}

			public void setSourceType(String sourceType) {
				this.sourceType = sourceType;
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

			private String name;

			private String sourceType;

			private String type;

			public Long getFileSize() {
				return this.fileSize;
			}

			public void setFileSize(Long fileSize) {
				this.fileSize = fileSize;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getSourceType() {
				return this.sourceType;
			}

			public void setSourceType(String sourceType) {
				this.sourceType = sourceType;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
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

			private String diskType;

			private String spec;

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
	}

	@Override
	public RestartInstanceResponse getInstance(UnmarshallerContext context) {
		return	RestartInstanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
