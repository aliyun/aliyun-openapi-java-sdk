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
import com.aliyuncs.elasticsearch.transform.v20170613.GetRegionConfigurationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRegionConfigurationResponse extends AcsResponse {

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

		private String env;

		private String regionId;

		private String createUrl;

		private List<DataDiskListItem> dataDiskList;

		private List<EsVersionsLatestListItem> esVersionsLatestList;

		private List<NodeSpecListItem> nodeSpecList;

		private List<Disk> clientNodeDiskList;

		private List<Disk> masterDiskList;

		private List<String> zones;

		private List<String> esVersions;

		private List<String> masterSpec;

		private List<String> clientNodeSpec;

		private Node node;

		private JvmConfine jvmConfine;

		private ClientNodeAmountRange clientNodeAmountRange;

		private WarmNodeProperties warmNodeProperties;

		private KibanaNodeProperties kibanaNodeProperties;

		public String getEnv() {
			return this.env;
		}

		public void setEnv(String env) {
			this.env = env;
		}

		public String getBizRegionId() {
			return this.regionId;
		}

		public void setBizRegionId(String regionId) {
			this.regionId = regionId;
		}

		/**
		 * @deprecated use getBizRegionId instead of this.
		 */
		@Deprecated
		public String getRegionId() {
			return this.regionId;
		}

		/**
		 * @deprecated use setBizRegionId instead of this.
		 */
		@Deprecated
		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getCreateUrl() {
			return this.createUrl;
		}

		public void setCreateUrl(String createUrl) {
			this.createUrl = createUrl;
		}

		public List<DataDiskListItem> getDataDiskList() {
			return this.dataDiskList;
		}

		public void setDataDiskList(List<DataDiskListItem> dataDiskList) {
			this.dataDiskList = dataDiskList;
		}

		public List<EsVersionsLatestListItem> getEsVersionsLatestList() {
			return this.esVersionsLatestList;
		}

		public void setEsVersionsLatestList(List<EsVersionsLatestListItem> esVersionsLatestList) {
			this.esVersionsLatestList = esVersionsLatestList;
		}

		public List<NodeSpecListItem> getNodeSpecList() {
			return this.nodeSpecList;
		}

		public void setNodeSpecList(List<NodeSpecListItem> nodeSpecList) {
			this.nodeSpecList = nodeSpecList;
		}

		public List<Disk> getClientNodeDiskList() {
			return this.clientNodeDiskList;
		}

		public void setClientNodeDiskList(List<Disk> clientNodeDiskList) {
			this.clientNodeDiskList = clientNodeDiskList;
		}

		public List<Disk> getMasterDiskList() {
			return this.masterDiskList;
		}

		public void setMasterDiskList(List<Disk> masterDiskList) {
			this.masterDiskList = masterDiskList;
		}

		public List<String> getZones() {
			return this.zones;
		}

		public void setZones(List<String> zones) {
			this.zones = zones;
		}

		public List<String> getEsVersions() {
			return this.esVersions;
		}

		public void setEsVersions(List<String> esVersions) {
			this.esVersions = esVersions;
		}

		public List<String> getMasterSpec() {
			return this.masterSpec;
		}

		public void setMasterSpec(List<String> masterSpec) {
			this.masterSpec = masterSpec;
		}

		public List<String> getClientNodeSpec() {
			return this.clientNodeSpec;
		}

		public void setClientNodeSpec(List<String> clientNodeSpec) {
			this.clientNodeSpec = clientNodeSpec;
		}

		public Node getNode() {
			return this.node;
		}

		public void setNode(Node node) {
			this.node = node;
		}

		public JvmConfine getJvmConfine() {
			return this.jvmConfine;
		}

		public void setJvmConfine(JvmConfine jvmConfine) {
			this.jvmConfine = jvmConfine;
		}

		public ClientNodeAmountRange getClientNodeAmountRange() {
			return this.clientNodeAmountRange;
		}

		public void setClientNodeAmountRange(ClientNodeAmountRange clientNodeAmountRange) {
			this.clientNodeAmountRange = clientNodeAmountRange;
		}

		public WarmNodeProperties getWarmNodeProperties() {
			return this.warmNodeProperties;
		}

		public void setWarmNodeProperties(WarmNodeProperties warmNodeProperties) {
			this.warmNodeProperties = warmNodeProperties;
		}

		public KibanaNodeProperties getKibanaNodeProperties() {
			return this.kibanaNodeProperties;
		}

		public void setKibanaNodeProperties(KibanaNodeProperties kibanaNodeProperties) {
			this.kibanaNodeProperties = kibanaNodeProperties;
		}

		public static class DataDiskListItem {

			private String diskType;

			private Integer minSize;

			private Integer maxSize;

			private Integer scaleLimit;

			private List<String> valueLimitSet;

			public String getDiskType() {
				return this.diskType;
			}

			public void setDiskType(String diskType) {
				this.diskType = diskType;
			}

			public Integer getMinSize() {
				return this.minSize;
			}

			public void setMinSize(Integer minSize) {
				this.minSize = minSize;
			}

			public Integer getMaxSize() {
				return this.maxSize;
			}

			public void setMaxSize(Integer maxSize) {
				this.maxSize = maxSize;
			}

			public Integer getScaleLimit() {
				return this.scaleLimit;
			}

			public void setScaleLimit(Integer scaleLimit) {
				this.scaleLimit = scaleLimit;
			}

			public List<String> getValueLimitSet() {
				return this.valueLimitSet;
			}

			public void setValueLimitSet(List<String> valueLimitSet) {
				this.valueLimitSet = valueLimitSet;
			}
		}

		public static class EsVersionsLatestListItem {

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

		public static class NodeSpecListItem {

			private Integer cpuCount;

			private Integer memorySize;

			private Boolean enable;

			private String spec;

			private String diskType;

			private Integer disk;

			private String specGroupType;

			public Integer getCpuCount() {
				return this.cpuCount;
			}

			public void setCpuCount(Integer cpuCount) {
				this.cpuCount = cpuCount;
			}

			public Integer getMemorySize() {
				return this.memorySize;
			}

			public void setMemorySize(Integer memorySize) {
				this.memorySize = memorySize;
			}

			public Boolean getEnable() {
				return this.enable;
			}

			public void setEnable(Boolean enable) {
				this.enable = enable;
			}

			public String getSpec() {
				return this.spec;
			}

			public void setSpec(String spec) {
				this.spec = spec;
			}

			public String getDiskType() {
				return this.diskType;
			}

			public void setDiskType(String diskType) {
				this.diskType = diskType;
			}

			public Integer getDisk() {
				return this.disk;
			}

			public void setDisk(Integer disk) {
				this.disk = disk;
			}

			public String getSpecGroupType() {
				return this.specGroupType;
			}

			public void setSpecGroupType(String specGroupType) {
				this.specGroupType = specGroupType;
			}
		}

		public static class Disk {

			private String diskType;

			private Integer minSize;

			private Integer maxSize;

			private Integer scaleLimit;

			public String getDiskType() {
				return this.diskType;
			}

			public void setDiskType(String diskType) {
				this.diskType = diskType;
			}

			public Integer getMinSize() {
				return this.minSize;
			}

			public void setMinSize(Integer minSize) {
				this.minSize = minSize;
			}

			public Integer getMaxSize() {
				return this.maxSize;
			}

			public void setMaxSize(Integer maxSize) {
				this.maxSize = maxSize;
			}

			public Integer getScaleLimit() {
				return this.scaleLimit;
			}

			public void setScaleLimit(Integer scaleLimit) {
				this.scaleLimit = scaleLimit;
			}
		}

		public static class Node {

			private Integer minAmount;

			private Integer maxAmount;

			public Integer getMinAmount() {
				return this.minAmount;
			}

			public void setMinAmount(Integer minAmount) {
				this.minAmount = minAmount;
			}

			public Integer getMaxAmount() {
				return this.maxAmount;
			}

			public void setMaxAmount(Integer maxAmount) {
				this.maxAmount = maxAmount;
			}
		}

		public static class JvmConfine {

			private Integer memory;

			private List<String> supportGcs;

			private List<String> supportEsVersions;

			public Integer getMemory() {
				return this.memory;
			}

			public void setMemory(Integer memory) {
				this.memory = memory;
			}

			public List<String> getSupportGcs() {
				return this.supportGcs;
			}

			public void setSupportGcs(List<String> supportGcs) {
				this.supportGcs = supportGcs;
			}

			public List<String> getSupportEsVersions() {
				return this.supportEsVersions;
			}

			public void setSupportEsVersions(List<String> supportEsVersions) {
				this.supportEsVersions = supportEsVersions;
			}
		}

		public static class ClientNodeAmountRange {

			private Integer minAmount;

			private Integer maxAmount;

			public Integer getMinAmount() {
				return this.minAmount;
			}

			public void setMinAmount(Integer minAmount) {
				this.minAmount = minAmount;
			}

			public Integer getMaxAmount() {
				return this.maxAmount;
			}

			public void setMaxAmount(Integer maxAmount) {
				this.maxAmount = maxAmount;
			}
		}

		public static class WarmNodeProperties {

			private List<Disk1> diskList;

			private List<String> spec;

			private AmountRange amountRange;

			public List<Disk1> getDiskList() {
				return this.diskList;
			}

			public void setDiskList(List<Disk1> diskList) {
				this.diskList = diskList;
			}

			public List<String> getSpec() {
				return this.spec;
			}

			public void setSpec(List<String> spec) {
				this.spec = spec;
			}

			public AmountRange getAmountRange() {
				return this.amountRange;
			}

			public void setAmountRange(AmountRange amountRange) {
				this.amountRange = amountRange;
			}

			public static class Disk1 {

				private String diskType;

				private Integer minSize;

				private Integer maxSize;

				private Integer scaleLimit;

				private List<String> valueLimitSet2;

				public String getDiskType() {
					return this.diskType;
				}

				public void setDiskType(String diskType) {
					this.diskType = diskType;
				}

				public Integer getMinSize() {
					return this.minSize;
				}

				public void setMinSize(Integer minSize) {
					this.minSize = minSize;
				}

				public Integer getMaxSize() {
					return this.maxSize;
				}

				public void setMaxSize(Integer maxSize) {
					this.maxSize = maxSize;
				}

				public Integer getScaleLimit() {
					return this.scaleLimit;
				}

				public void setScaleLimit(Integer scaleLimit) {
					this.scaleLimit = scaleLimit;
				}

				public List<String> getValueLimitSet2() {
					return this.valueLimitSet2;
				}

				public void setValueLimitSet2(List<String> valueLimitSet2) {
					this.valueLimitSet2 = valueLimitSet2;
				}
			}

			public static class AmountRange {

				private Integer minAmount;

				private Integer maxAmount;

				public Integer getMinAmount() {
					return this.minAmount;
				}

				public void setMinAmount(Integer minAmount) {
					this.minAmount = minAmount;
				}

				public Integer getMaxAmount() {
					return this.maxAmount;
				}

				public void setMaxAmount(Integer maxAmount) {
					this.maxAmount = maxAmount;
				}
			}
		}

		public static class KibanaNodeProperties {

			private List<String> spec3;

			private AmountRange4 amountRange4;

			public List<String> getSpec3() {
				return this.spec3;
			}

			public void setSpec3(List<String> spec3) {
				this.spec3 = spec3;
			}

			public AmountRange4 getAmountRange4() {
				return this.amountRange4;
			}

			public void setAmountRange4(AmountRange4 amountRange4) {
				this.amountRange4 = amountRange4;
			}

			public static class AmountRange4 {

				private Integer minAmount;

				private Integer maxAmount;

				public Integer getMinAmount() {
					return this.minAmount;
				}

				public void setMinAmount(Integer minAmount) {
					this.minAmount = minAmount;
				}

				public Integer getMaxAmount() {
					return this.maxAmount;
				}

				public void setMaxAmount(Integer maxAmount) {
					this.maxAmount = maxAmount;
				}
			}
		}
	}

	@Override
	public GetRegionConfigurationResponse getInstance(UnmarshallerContext context) {
		return	GetRegionConfigurationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
