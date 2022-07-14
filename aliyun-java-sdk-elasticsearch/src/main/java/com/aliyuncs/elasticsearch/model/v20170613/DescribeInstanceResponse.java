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
import com.aliyuncs.elasticsearch.transform.v20170613.DescribeInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceResponse extends AcsResponse {

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

		private Boolean advancedDedicateMaster;

		private String protocol;

		private Boolean enableKibanaPublicNetwork;

		private Integer nodeAmount;

		private String createdAt;

		private Boolean enableKibanaPrivateNetwork;

		private String vpcInstanceId;

		private Integer port;

		private Boolean enablePublic;

		private Boolean dedicateMaster;

		private Integer kibanaPort;

		private Map<Object,Object> esConfig;

		private String resourceGroupId;

		private String paymentType;

		private String postpaidServiceStatus;

		private String esVersion;

		private Boolean haveKibana;

		private Boolean isNewDeployment;

		private Boolean warmNode;

		private String updatedAt;

		private String instanceId;

		private Integer zoneCount;

		private String publicDomain;

		private String status;

		private Boolean serviceVpc;

		private Integer publicPort;

		private Boolean haveClientNode;

		private String domain;

		private String description;

		private String kibanaDomain;

		private List<DictListItem> dictList;

		private List<SynonymsDictsItem> synonymsDicts;

		private List<ZoneInfo> zoneInfos;

		private List<Dict> aliwsDicts;

		private List<Tag> tags;

		private List<String> esIPWhitelist;

		private List<Map<Object,Object>> extendConfigs;

		private List<String> privateNetworkIpWhiteList;

		private List<String> publicIpWhitelist;

		private List<String> kibanaPrivateIPWhitelist;

		private List<String> esIPBlacklist;

		private List<String> kibanaIPWhitelist;

		private NodeSpec nodeSpec;

		private NetworkConfig networkConfig;

		private KibanaConfiguration kibanaConfiguration;

		private MasterConfiguration masterConfiguration;

		private ClientNodeConfiguration clientNodeConfiguration;

		private WarmNodeConfiguration warmNodeConfiguration;

		private AdvancedSetting advancedSetting;

		private ElasticDataNodeConfiguration elasticDataNodeConfiguration;

		public Boolean getAdvancedDedicateMaster() {
			return this.advancedDedicateMaster;
		}

		public void setAdvancedDedicateMaster(Boolean advancedDedicateMaster) {
			this.advancedDedicateMaster = advancedDedicateMaster;
		}

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		public Boolean getEnableKibanaPublicNetwork() {
			return this.enableKibanaPublicNetwork;
		}

		public void setEnableKibanaPublicNetwork(Boolean enableKibanaPublicNetwork) {
			this.enableKibanaPublicNetwork = enableKibanaPublicNetwork;
		}

		public Integer getNodeAmount() {
			return this.nodeAmount;
		}

		public void setNodeAmount(Integer nodeAmount) {
			this.nodeAmount = nodeAmount;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public Boolean getEnableKibanaPrivateNetwork() {
			return this.enableKibanaPrivateNetwork;
		}

		public void setEnableKibanaPrivateNetwork(Boolean enableKibanaPrivateNetwork) {
			this.enableKibanaPrivateNetwork = enableKibanaPrivateNetwork;
		}

		public String getVpcInstanceId() {
			return this.vpcInstanceId;
		}

		public void setVpcInstanceId(String vpcInstanceId) {
			this.vpcInstanceId = vpcInstanceId;
		}

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public Boolean getEnablePublic() {
			return this.enablePublic;
		}

		public void setEnablePublic(Boolean enablePublic) {
			this.enablePublic = enablePublic;
		}

		public Boolean getDedicateMaster() {
			return this.dedicateMaster;
		}

		public void setDedicateMaster(Boolean dedicateMaster) {
			this.dedicateMaster = dedicateMaster;
		}

		public Integer getKibanaPort() {
			return this.kibanaPort;
		}

		public void setKibanaPort(Integer kibanaPort) {
			this.kibanaPort = kibanaPort;
		}

		public Map<Object,Object> getEsConfig() {
			return this.esConfig;
		}

		public void setEsConfig(Map<Object,Object> esConfig) {
			this.esConfig = esConfig;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getPaymentType() {
			return this.paymentType;
		}

		public void setPaymentType(String paymentType) {
			this.paymentType = paymentType;
		}

		public String getPostpaidServiceStatus() {
			return this.postpaidServiceStatus;
		}

		public void setPostpaidServiceStatus(String postpaidServiceStatus) {
			this.postpaidServiceStatus = postpaidServiceStatus;
		}

		public String getEsVersion() {
			return this.esVersion;
		}

		public void setEsVersion(String esVersion) {
			this.esVersion = esVersion;
		}

		public Boolean getHaveKibana() {
			return this.haveKibana;
		}

		public void setHaveKibana(Boolean haveKibana) {
			this.haveKibana = haveKibana;
		}

		public Boolean getIsNewDeployment() {
			return this.isNewDeployment;
		}

		public void setIsNewDeployment(Boolean isNewDeployment) {
			this.isNewDeployment = isNewDeployment;
		}

		public Boolean getWarmNode() {
			return this.warmNode;
		}

		public void setWarmNode(Boolean warmNode) {
			this.warmNode = warmNode;
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

		public Integer getZoneCount() {
			return this.zoneCount;
		}

		public void setZoneCount(Integer zoneCount) {
			this.zoneCount = zoneCount;
		}

		public String getPublicDomain() {
			return this.publicDomain;
		}

		public void setPublicDomain(String publicDomain) {
			this.publicDomain = publicDomain;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Boolean getServiceVpc() {
			return this.serviceVpc;
		}

		public void setServiceVpc(Boolean serviceVpc) {
			this.serviceVpc = serviceVpc;
		}

		public Integer getPublicPort() {
			return this.publicPort;
		}

		public void setPublicPort(Integer publicPort) {
			this.publicPort = publicPort;
		}

		public Boolean getHaveClientNode() {
			return this.haveClientNode;
		}

		public void setHaveClientNode(Boolean haveClientNode) {
			this.haveClientNode = haveClientNode;
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

		public String getKibanaDomain() {
			return this.kibanaDomain;
		}

		public void setKibanaDomain(String kibanaDomain) {
			this.kibanaDomain = kibanaDomain;
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

		public List<ZoneInfo> getZoneInfos() {
			return this.zoneInfos;
		}

		public void setZoneInfos(List<ZoneInfo> zoneInfos) {
			this.zoneInfos = zoneInfos;
		}

		public List<Dict> getAliwsDicts() {
			return this.aliwsDicts;
		}

		public void setAliwsDicts(List<Dict> aliwsDicts) {
			this.aliwsDicts = aliwsDicts;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<String> getEsIPWhitelist() {
			return this.esIPWhitelist;
		}

		public void setEsIPWhitelist(List<String> esIPWhitelist) {
			this.esIPWhitelist = esIPWhitelist;
		}

		public List<Map<Object,Object>> getExtendConfigs() {
			return this.extendConfigs;
		}

		public void setExtendConfigs(List<Map<Object,Object>> extendConfigs) {
			this.extendConfigs = extendConfigs;
		}

		public List<String> getPrivateNetworkIpWhiteList() {
			return this.privateNetworkIpWhiteList;
		}

		public void setPrivateNetworkIpWhiteList(List<String> privateNetworkIpWhiteList) {
			this.privateNetworkIpWhiteList = privateNetworkIpWhiteList;
		}

		public List<String> getPublicIpWhitelist() {
			return this.publicIpWhitelist;
		}

		public void setPublicIpWhitelist(List<String> publicIpWhitelist) {
			this.publicIpWhitelist = publicIpWhitelist;
		}

		public List<String> getKibanaPrivateIPWhitelist() {
			return this.kibanaPrivateIPWhitelist;
		}

		public void setKibanaPrivateIPWhitelist(List<String> kibanaPrivateIPWhitelist) {
			this.kibanaPrivateIPWhitelist = kibanaPrivateIPWhitelist;
		}

		public List<String> getEsIPBlacklist() {
			return this.esIPBlacklist;
		}

		public void setEsIPBlacklist(List<String> esIPBlacklist) {
			this.esIPBlacklist = esIPBlacklist;
		}

		public List<String> getKibanaIPWhitelist() {
			return this.kibanaIPWhitelist;
		}

		public void setKibanaIPWhitelist(List<String> kibanaIPWhitelist) {
			this.kibanaIPWhitelist = kibanaIPWhitelist;
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

		public ClientNodeConfiguration getClientNodeConfiguration() {
			return this.clientNodeConfiguration;
		}

		public void setClientNodeConfiguration(ClientNodeConfiguration clientNodeConfiguration) {
			this.clientNodeConfiguration = clientNodeConfiguration;
		}

		public WarmNodeConfiguration getWarmNodeConfiguration() {
			return this.warmNodeConfiguration;
		}

		public void setWarmNodeConfiguration(WarmNodeConfiguration warmNodeConfiguration) {
			this.warmNodeConfiguration = warmNodeConfiguration;
		}

		public AdvancedSetting getAdvancedSetting() {
			return this.advancedSetting;
		}

		public void setAdvancedSetting(AdvancedSetting advancedSetting) {
			this.advancedSetting = advancedSetting;
		}

		public ElasticDataNodeConfiguration getElasticDataNodeConfiguration() {
			return this.elasticDataNodeConfiguration;
		}

		public void setElasticDataNodeConfiguration(ElasticDataNodeConfiguration elasticDataNodeConfiguration) {
			this.elasticDataNodeConfiguration = elasticDataNodeConfiguration;
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

		public static class ZoneInfo {

			private String status;

			private String zoneId;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}
		}

		public static class Dict {

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

			private List<WhiteIpGroupListItem> whiteIpGroupList;

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

			public List<WhiteIpGroupListItem> getWhiteIpGroupList() {
				return this.whiteIpGroupList;
			}

			public void setWhiteIpGroupList(List<WhiteIpGroupListItem> whiteIpGroupList) {
				this.whiteIpGroupList = whiteIpGroupList;
			}

			public static class WhiteIpGroupListItem {

				private String whiteIpType;

				private String groupName;

				private List<String> ips;

				public String getWhiteIpType() {
					return this.whiteIpType;
				}

				public void setWhiteIpType(String whiteIpType) {
					this.whiteIpType = whiteIpType;
				}

				public String getGroupName() {
					return this.groupName;
				}

				public void setGroupName(String groupName) {
					this.groupName = groupName;
				}

				public List<String> getIps() {
					return this.ips;
				}

				public void setIps(List<String> ips) {
					this.ips = ips;
				}
			}
		}

		public static class KibanaConfiguration {

			private Integer amount;

			private String spec;

			public Integer getAmount() {
				return this.amount;
			}

			public void setAmount(Integer amount) {
				this.amount = amount;
			}

			public String getSpec() {
				return this.spec;
			}

			public void setSpec(String spec) {
				this.spec = spec;
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

		public static class ClientNodeConfiguration {

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

		public static class WarmNodeConfiguration {

			private Integer amount;

			private String spec;

			private Integer disk;

			private Boolean diskEncryption;

			private String diskType;

			public Integer getAmount() {
				return this.amount;
			}

			public void setAmount(Integer amount) {
				this.amount = amount;
			}

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

		public static class AdvancedSetting {

			private String gcName;

			public String getGcName() {
				return this.gcName;
			}

			public void setGcName(String gcName) {
				this.gcName = gcName;
			}
		}

		public static class ElasticDataNodeConfiguration {

			private Integer amount;

			private String spec;

			private Integer disk;

			private Boolean diskEncryption;

			private String diskType;

			public Integer getAmount() {
				return this.amount;
			}

			public void setAmount(Integer amount) {
				this.amount = amount;
			}

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
	}

	@Override
	public DescribeInstanceResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
