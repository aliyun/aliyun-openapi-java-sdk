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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.DescribeClusterTemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeClusterTemplateResponse extends AcsResponse {

	private String requestId;

	private TemplateInfo templateInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public TemplateInfo getTemplateInfo() {
		return this.templateInfo;
	}

	public void setTemplateInfo(TemplateInfo templateInfo) {
		this.templateInfo = templateInfo;
	}

	public static class TemplateInfo {

		private String id;

		private String templateName;

		private String emrVer;

		private Boolean logEnable;

		private String logPath;

		private String userId;

		private String userDefinedEmrEcsRole;

		private Integer masterNodeTotal;

		private String vpcId;

		private String vSwitchId;

		private String netType;

		private Boolean ioOptimized;

		private String instanceGeneration;

		private Boolean highAvailabilityEnable;

		private Boolean easEnable;

		private Long gmtCreate;

		private Long gmtModified;

		private String zoneId;

		private String clusterType;

		private String securityGroupId;

		private String securityGroupName;

		private String configurations;

		private Boolean allowNotebook;

		private String createSource;

		private Boolean useLocalMetaDb;

		private Boolean sshEnable;

		private Boolean isOpenPublicIp;

		private String depositType;

		private String machineType;

		private Boolean useCustomHiveMetaDb;

		private Boolean initCustomHiveMetaDb;

		private String keyPairName;

		private String masterPwd;

		private String metaStoreType;

		private String metaStoreConf;

		private List<BootstrapAction> bootstrapActionList;

		private List<HostGroup> hostGroupList;

		private List<Config> configList;

		private List<String> softwareInfoList;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getTemplateName() {
			return this.templateName;
		}

		public void setTemplateName(String templateName) {
			this.templateName = templateName;
		}

		public String getEmrVer() {
			return this.emrVer;
		}

		public void setEmrVer(String emrVer) {
			this.emrVer = emrVer;
		}

		public Boolean getLogEnable() {
			return this.logEnable;
		}

		public void setLogEnable(Boolean logEnable) {
			this.logEnable = logEnable;
		}

		public String getLogPath() {
			return this.logPath;
		}

		public void setLogPath(String logPath) {
			this.logPath = logPath;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getUserDefinedEmrEcsRole() {
			return this.userDefinedEmrEcsRole;
		}

		public void setUserDefinedEmrEcsRole(String userDefinedEmrEcsRole) {
			this.userDefinedEmrEcsRole = userDefinedEmrEcsRole;
		}

		public Integer getMasterNodeTotal() {
			return this.masterNodeTotal;
		}

		public void setMasterNodeTotal(Integer masterNodeTotal) {
			this.masterNodeTotal = masterNodeTotal;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getNetType() {
			return this.netType;
		}

		public void setNetType(String netType) {
			this.netType = netType;
		}

		public Boolean getIoOptimized() {
			return this.ioOptimized;
		}

		public void setIoOptimized(Boolean ioOptimized) {
			this.ioOptimized = ioOptimized;
		}

		public String getInstanceGeneration() {
			return this.instanceGeneration;
		}

		public void setInstanceGeneration(String instanceGeneration) {
			this.instanceGeneration = instanceGeneration;
		}

		public Boolean getHighAvailabilityEnable() {
			return this.highAvailabilityEnable;
		}

		public void setHighAvailabilityEnable(Boolean highAvailabilityEnable) {
			this.highAvailabilityEnable = highAvailabilityEnable;
		}

		public Boolean getEasEnable() {
			return this.easEnable;
		}

		public void setEasEnable(Boolean easEnable) {
			this.easEnable = easEnable;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getClusterType() {
			return this.clusterType;
		}

		public void setClusterType(String clusterType) {
			this.clusterType = clusterType;
		}

		public String getSecurityGroupId() {
			return this.securityGroupId;
		}

		public void setSecurityGroupId(String securityGroupId) {
			this.securityGroupId = securityGroupId;
		}

		public String getSecurityGroupName() {
			return this.securityGroupName;
		}

		public void setSecurityGroupName(String securityGroupName) {
			this.securityGroupName = securityGroupName;
		}

		public String getConfigurations() {
			return this.configurations;
		}

		public void setConfigurations(String configurations) {
			this.configurations = configurations;
		}

		public Boolean getAllowNotebook() {
			return this.allowNotebook;
		}

		public void setAllowNotebook(Boolean allowNotebook) {
			this.allowNotebook = allowNotebook;
		}

		public String getCreateSource() {
			return this.createSource;
		}

		public void setCreateSource(String createSource) {
			this.createSource = createSource;
		}

		public Boolean getUseLocalMetaDb() {
			return this.useLocalMetaDb;
		}

		public void setUseLocalMetaDb(Boolean useLocalMetaDb) {
			this.useLocalMetaDb = useLocalMetaDb;
		}

		public Boolean getSshEnable() {
			return this.sshEnable;
		}

		public void setSshEnable(Boolean sshEnable) {
			this.sshEnable = sshEnable;
		}

		public Boolean getIsOpenPublicIp() {
			return this.isOpenPublicIp;
		}

		public void setIsOpenPublicIp(Boolean isOpenPublicIp) {
			this.isOpenPublicIp = isOpenPublicIp;
		}

		public String getDepositType() {
			return this.depositType;
		}

		public void setDepositType(String depositType) {
			this.depositType = depositType;
		}

		public String getMachineType() {
			return this.machineType;
		}

		public void setMachineType(String machineType) {
			this.machineType = machineType;
		}

		public Boolean getUseCustomHiveMetaDb() {
			return this.useCustomHiveMetaDb;
		}

		public void setUseCustomHiveMetaDb(Boolean useCustomHiveMetaDb) {
			this.useCustomHiveMetaDb = useCustomHiveMetaDb;
		}

		public Boolean getInitCustomHiveMetaDb() {
			return this.initCustomHiveMetaDb;
		}

		public void setInitCustomHiveMetaDb(Boolean initCustomHiveMetaDb) {
			this.initCustomHiveMetaDb = initCustomHiveMetaDb;
		}

		public String getKeyPairName() {
			return this.keyPairName;
		}

		public void setKeyPairName(String keyPairName) {
			this.keyPairName = keyPairName;
		}

		public String getMasterPwd() {
			return this.masterPwd;
		}

		public void setMasterPwd(String masterPwd) {
			this.masterPwd = masterPwd;
		}

		public String getMetaStoreType() {
			return this.metaStoreType;
		}

		public void setMetaStoreType(String metaStoreType) {
			this.metaStoreType = metaStoreType;
		}

		public String getMetaStoreConf() {
			return this.metaStoreConf;
		}

		public void setMetaStoreConf(String metaStoreConf) {
			this.metaStoreConf = metaStoreConf;
		}

		public List<BootstrapAction> getBootstrapActionList() {
			return this.bootstrapActionList;
		}

		public void setBootstrapActionList(List<BootstrapAction> bootstrapActionList) {
			this.bootstrapActionList = bootstrapActionList;
		}

		public List<HostGroup> getHostGroupList() {
			return this.hostGroupList;
		}

		public void setHostGroupList(List<HostGroup> hostGroupList) {
			this.hostGroupList = hostGroupList;
		}

		public List<Config> getConfigList() {
			return this.configList;
		}

		public void setConfigList(List<Config> configList) {
			this.configList = configList;
		}

		public List<String> getSoftwareInfoList() {
			return this.softwareInfoList;
		}

		public void setSoftwareInfoList(List<String> softwareInfoList) {
			this.softwareInfoList = softwareInfoList;
		}

		public static class BootstrapAction {

			private String name;

			private String path;

			private String arg;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getPath() {
				return this.path;
			}

			public void setPath(String path) {
				this.path = path;
			}

			public String getArg() {
				return this.arg;
			}

			public void setArg(String arg) {
				this.arg = arg;
			}
		}

		public static class HostGroup {

			private String hostGroupId;

			private String hostGroupName;

			private String hostGroupType;

			private String chargeType;

			private String period;

			private Integer nodeCount;

			private String instanceType;

			private String diskType;

			private Integer diskCapacity;

			private Integer diskCount;

			private String sysDiskType;

			private Integer sysDiskCapacity;

			private String multiInstanceTypes;

			public String getHostGroupId() {
				return this.hostGroupId;
			}

			public void setHostGroupId(String hostGroupId) {
				this.hostGroupId = hostGroupId;
			}

			public String getHostGroupName() {
				return this.hostGroupName;
			}

			public void setHostGroupName(String hostGroupName) {
				this.hostGroupName = hostGroupName;
			}

			public String getHostGroupType() {
				return this.hostGroupType;
			}

			public void setHostGroupType(String hostGroupType) {
				this.hostGroupType = hostGroupType;
			}

			public String getChargeType() {
				return this.chargeType;
			}

			public void setChargeType(String chargeType) {
				this.chargeType = chargeType;
			}

			public String getPeriod() {
				return this.period;
			}

			public void setPeriod(String period) {
				this.period = period;
			}

			public Integer getNodeCount() {
				return this.nodeCount;
			}

			public void setNodeCount(Integer nodeCount) {
				this.nodeCount = nodeCount;
			}

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}

			public String getDiskType() {
				return this.diskType;
			}

			public void setDiskType(String diskType) {
				this.diskType = diskType;
			}

			public Integer getDiskCapacity() {
				return this.diskCapacity;
			}

			public void setDiskCapacity(Integer diskCapacity) {
				this.diskCapacity = diskCapacity;
			}

			public Integer getDiskCount() {
				return this.diskCount;
			}

			public void setDiskCount(Integer diskCount) {
				this.diskCount = diskCount;
			}

			public String getSysDiskType() {
				return this.sysDiskType;
			}

			public void setSysDiskType(String sysDiskType) {
				this.sysDiskType = sysDiskType;
			}

			public Integer getSysDiskCapacity() {
				return this.sysDiskCapacity;
			}

			public void setSysDiskCapacity(Integer sysDiskCapacity) {
				this.sysDiskCapacity = sysDiskCapacity;
			}

			public String getMultiInstanceTypes() {
				return this.multiInstanceTypes;
			}

			public void setMultiInstanceTypes(String multiInstanceTypes) {
				this.multiInstanceTypes = multiInstanceTypes;
			}
		}

		public static class Config {

			private String serviceName;

			private String fileName;

			private String configKey;

			private String configValue;

			private String encrypt;

			private String replace;

			public String getServiceName() {
				return this.serviceName;
			}

			public void setServiceName(String serviceName) {
				this.serviceName = serviceName;
			}

			public String getFileName() {
				return this.fileName;
			}

			public void setFileName(String fileName) {
				this.fileName = fileName;
			}

			public String getConfigKey() {
				return this.configKey;
			}

			public void setConfigKey(String configKey) {
				this.configKey = configKey;
			}

			public String getConfigValue() {
				return this.configValue;
			}

			public void setConfigValue(String configValue) {
				this.configValue = configValue;
			}

			public String getEncrypt() {
				return this.encrypt;
			}

			public void setEncrypt(String encrypt) {
				this.encrypt = encrypt;
			}

			public String getReplace() {
				return this.replace;
			}

			public void setReplace(String replace) {
				this.replace = replace;
			}
		}
	}

	@Override
	public DescribeClusterTemplateResponse getInstance(UnmarshallerContext context) {
		return	DescribeClusterTemplateResponseUnmarshaller.unmarshall(this, context);
	}
}
