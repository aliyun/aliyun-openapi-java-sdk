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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.emr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateClusterV2Request extends RpcAcsRequest<CreateClusterV2Response> {
	   

	private Boolean autoPayOrder;

	private Long resourceOwnerId;

	private String logPath;

	private String masterPwd;

	private String configurations;

	private Boolean sshEnable;

	private String keyPairName;

	private String metaStoreType;

	private String securityGroupName;

	private String machineType;

	private String resourceGroupId;

	private List<HostComponentInfo> hostComponentInfos;

	private String clickHouseConf;

	private List<BootstrapAction> bootstrapActions;

	private String metaStoreConf;

	private String emrVer;

	private List<Tag> tags;

	private String authorizeContent;

	private Boolean isOpenPublicIp;

	private Integer period;

	private String instanceGeneration;

	private String vSwitchId;

	private String clusterType;

	private String extraAttributes;

	private Boolean autoRenew;

	private List<String> optionSoftWareLists;

	private String netType;

	private String name;

	private String zoneId;

	private Boolean useCustomHiveMetaDB;

	private Boolean initCustomHiveMetaDB;

	private Boolean ioOptimized;

	private String securityGroupId;

	private Boolean easEnable;

	private String depositType;

	private Boolean useLocalMetaDb;

	private List<UserInfo> userInfos;

	private String userDefinedEmrEcsRole;

	private String whiteListType;

	private String relatedClusterId;

	private String vpcId;

	private List<PromotionInfo> promotionInfos;

	private List<HostGroup> hostGroups;

	private String chargeType;

	private List<ServiceInfo> serviceInfos;

	private List<Config> configs;

	private Boolean highAvailabilityEnable;
	public CreateClusterV2Request() {
		super("Emr", "2016-04-08", "CreateClusterV2");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getAutoPayOrder() {
		return this.autoPayOrder;
	}

	public void setAutoPayOrder(Boolean autoPayOrder) {
		this.autoPayOrder = autoPayOrder;
		if(autoPayOrder != null){
			putQueryParameter("AutoPayOrder", autoPayOrder.toString());
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getLogPath() {
		return this.logPath;
	}

	public void setLogPath(String logPath) {
		this.logPath = logPath;
		if(logPath != null){
			putQueryParameter("LogPath", logPath);
		}
	}

	public String getMasterPwd() {
		return this.masterPwd;
	}

	public void setMasterPwd(String masterPwd) {
		this.masterPwd = masterPwd;
		if(masterPwd != null){
			putQueryParameter("MasterPwd", masterPwd);
		}
	}

	public String getConfigurations() {
		return this.configurations;
	}

	public void setConfigurations(String configurations) {
		this.configurations = configurations;
		if(configurations != null){
			putQueryParameter("Configurations", configurations);
		}
	}

	public Boolean getSshEnable() {
		return this.sshEnable;
	}

	public void setSshEnable(Boolean sshEnable) {
		this.sshEnable = sshEnable;
		if(sshEnable != null){
			putQueryParameter("SshEnable", sshEnable.toString());
		}
	}

	public String getKeyPairName() {
		return this.keyPairName;
	}

	public void setKeyPairName(String keyPairName) {
		this.keyPairName = keyPairName;
		if(keyPairName != null){
			putQueryParameter("KeyPairName", keyPairName);
		}
	}

	public String getMetaStoreType() {
		return this.metaStoreType;
	}

	public void setMetaStoreType(String metaStoreType) {
		this.metaStoreType = metaStoreType;
		if(metaStoreType != null){
			putQueryParameter("MetaStoreType", metaStoreType);
		}
	}

	public String getSecurityGroupName() {
		return this.securityGroupName;
	}

	public void setSecurityGroupName(String securityGroupName) {
		this.securityGroupName = securityGroupName;
		if(securityGroupName != null){
			putQueryParameter("SecurityGroupName", securityGroupName);
		}
	}

	public String getMachineType() {
		return this.machineType;
	}

	public void setMachineType(String machineType) {
		this.machineType = machineType;
		if(machineType != null){
			putQueryParameter("MachineType", machineType);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public List<HostComponentInfo> getHostComponentInfos() {
		return this.hostComponentInfos;
	}

	public void setHostComponentInfos(List<HostComponentInfo> hostComponentInfos) {
		this.hostComponentInfos = hostComponentInfos;	
		if (hostComponentInfos != null) {
			for (int depth1 = 0; depth1 < hostComponentInfos.size(); depth1++) {
				putQueryParameter("HostComponentInfo." + (depth1 + 1) + ".HostName" , hostComponentInfos.get(depth1).getHostName());
				if (hostComponentInfos.get(depth1).getComponentNameLists() != null) {
					for (int i = 0; i < hostComponentInfos.get(depth1).getComponentNameLists().size(); i++) {
						putQueryParameter("HostComponentInfo." + (depth1 + 1) + ".ComponentNameList." + (i + 1) , hostComponentInfos.get(depth1).getComponentNameLists().get(i));
					}
				}
				putQueryParameter("HostComponentInfo." + (depth1 + 1) + ".ServiceName" , hostComponentInfos.get(depth1).getServiceName());
			}
		}	
	}

	public String getClickHouseConf() {
		return this.clickHouseConf;
	}

	public void setClickHouseConf(String clickHouseConf) {
		this.clickHouseConf = clickHouseConf;
		if(clickHouseConf != null){
			putQueryParameter("ClickHouseConf", clickHouseConf);
		}
	}

	public List<BootstrapAction> getBootstrapActions() {
		return this.bootstrapActions;
	}

	public void setBootstrapActions(List<BootstrapAction> bootstrapActions) {
		this.bootstrapActions = bootstrapActions;	
		if (bootstrapActions != null) {
			for (int depth1 = 0; depth1 < bootstrapActions.size(); depth1++) {
				putQueryParameter("BootstrapAction." + (depth1 + 1) + ".Path" , bootstrapActions.get(depth1).getPath());
				putQueryParameter("BootstrapAction." + (depth1 + 1) + ".Arg" , bootstrapActions.get(depth1).getArg());
				putQueryParameter("BootstrapAction." + (depth1 + 1) + ".Name" , bootstrapActions.get(depth1).getName());
			}
		}	
	}

	public String getMetaStoreConf() {
		return this.metaStoreConf;
	}

	public void setMetaStoreConf(String metaStoreConf) {
		this.metaStoreConf = metaStoreConf;
		if(metaStoreConf != null){
			putQueryParameter("MetaStoreConf", metaStoreConf);
		}
	}

	public String getEmrVer() {
		return this.emrVer;
	}

	public void setEmrVer(String emrVer) {
		this.emrVer = emrVer;
		if(emrVer != null){
			putQueryParameter("EmrVer", emrVer);
		}
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
			}
		}	
	}

	public String getAuthorizeContent() {
		return this.authorizeContent;
	}

	public void setAuthorizeContent(String authorizeContent) {
		this.authorizeContent = authorizeContent;
		if(authorizeContent != null){
			putQueryParameter("AuthorizeContent", authorizeContent);
		}
	}

	public Boolean getIsOpenPublicIp() {
		return this.isOpenPublicIp;
	}

	public void setIsOpenPublicIp(Boolean isOpenPublicIp) {
		this.isOpenPublicIp = isOpenPublicIp;
		if(isOpenPublicIp != null){
			putQueryParameter("IsOpenPublicIp", isOpenPublicIp.toString());
		}
	}

	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period.toString());
		}
	}

	public String getInstanceGeneration() {
		return this.instanceGeneration;
	}

	public void setInstanceGeneration(String instanceGeneration) {
		this.instanceGeneration = instanceGeneration;
		if(instanceGeneration != null){
			putQueryParameter("InstanceGeneration", instanceGeneration);
		}
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putQueryParameter("VSwitchId", vSwitchId);
		}
	}

	public String getClusterType() {
		return this.clusterType;
	}

	public void setClusterType(String clusterType) {
		this.clusterType = clusterType;
		if(clusterType != null){
			putQueryParameter("ClusterType", clusterType);
		}
	}

	public String getExtraAttributes() {
		return this.extraAttributes;
	}

	public void setExtraAttributes(String extraAttributes) {
		this.extraAttributes = extraAttributes;
		if(extraAttributes != null){
			putQueryParameter("ExtraAttributes", extraAttributes);
		}
	}

	public Boolean getAutoRenew() {
		return this.autoRenew;
	}

	public void setAutoRenew(Boolean autoRenew) {
		this.autoRenew = autoRenew;
		if(autoRenew != null){
			putQueryParameter("AutoRenew", autoRenew.toString());
		}
	}

	public List<String> getOptionSoftWareLists() {
		return this.optionSoftWareLists;
	}

	public void setOptionSoftWareLists(List<String> optionSoftWareLists) {
		this.optionSoftWareLists = optionSoftWareLists;	
		if (optionSoftWareLists != null) {
			for (int i = 0; i < optionSoftWareLists.size(); i++) {
				putQueryParameter("OptionSoftWareList." + (i + 1) , optionSoftWareLists.get(i));
			}
		}	
	}

	public String getNetType() {
		return this.netType;
	}

	public void setNetType(String netType) {
		this.netType = netType;
		if(netType != null){
			putQueryParameter("NetType", netType);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
		}
	}

	public Boolean getUseCustomHiveMetaDB() {
		return this.useCustomHiveMetaDB;
	}

	public void setUseCustomHiveMetaDB(Boolean useCustomHiveMetaDB) {
		this.useCustomHiveMetaDB = useCustomHiveMetaDB;
		if(useCustomHiveMetaDB != null){
			putQueryParameter("UseCustomHiveMetaDB", useCustomHiveMetaDB.toString());
		}
	}

	public Boolean getInitCustomHiveMetaDB() {
		return this.initCustomHiveMetaDB;
	}

	public void setInitCustomHiveMetaDB(Boolean initCustomHiveMetaDB) {
		this.initCustomHiveMetaDB = initCustomHiveMetaDB;
		if(initCustomHiveMetaDB != null){
			putQueryParameter("InitCustomHiveMetaDB", initCustomHiveMetaDB.toString());
		}
	}

	public Boolean getIoOptimized() {
		return this.ioOptimized;
	}

	public void setIoOptimized(Boolean ioOptimized) {
		this.ioOptimized = ioOptimized;
		if(ioOptimized != null){
			putQueryParameter("IoOptimized", ioOptimized.toString());
		}
	}

	public String getSecurityGroupId() {
		return this.securityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		this.securityGroupId = securityGroupId;
		if(securityGroupId != null){
			putQueryParameter("SecurityGroupId", securityGroupId);
		}
	}

	public Boolean getEasEnable() {
		return this.easEnable;
	}

	public void setEasEnable(Boolean easEnable) {
		this.easEnable = easEnable;
		if(easEnable != null){
			putQueryParameter("EasEnable", easEnable.toString());
		}
	}

	public String getDepositType() {
		return this.depositType;
	}

	public void setDepositType(String depositType) {
		this.depositType = depositType;
		if(depositType != null){
			putQueryParameter("DepositType", depositType);
		}
	}

	public Boolean getUseLocalMetaDb() {
		return this.useLocalMetaDb;
	}

	public void setUseLocalMetaDb(Boolean useLocalMetaDb) {
		this.useLocalMetaDb = useLocalMetaDb;
		if(useLocalMetaDb != null){
			putQueryParameter("UseLocalMetaDb", useLocalMetaDb.toString());
		}
	}

	public List<UserInfo> getUserInfos() {
		return this.userInfos;
	}

	public void setUserInfos(List<UserInfo> userInfos) {
		this.userInfos = userInfos;	
		if (userInfos != null) {
			for (int depth1 = 0; depth1 < userInfos.size(); depth1++) {
				putQueryParameter("UserInfo." + (depth1 + 1) + ".Password" , userInfos.get(depth1).getPassword());
				putQueryParameter("UserInfo." + (depth1 + 1) + ".UserId" , userInfos.get(depth1).getUserId());
				putQueryParameter("UserInfo." + (depth1 + 1) + ".UserName" , userInfos.get(depth1).getUserName());
			}
		}	
	}

	public String getUserDefinedEmrEcsRole() {
		return this.userDefinedEmrEcsRole;
	}

	public void setUserDefinedEmrEcsRole(String userDefinedEmrEcsRole) {
		this.userDefinedEmrEcsRole = userDefinedEmrEcsRole;
		if(userDefinedEmrEcsRole != null){
			putQueryParameter("UserDefinedEmrEcsRole", userDefinedEmrEcsRole);
		}
	}

	public String getWhiteListType() {
		return this.whiteListType;
	}

	public void setWhiteListType(String whiteListType) {
		this.whiteListType = whiteListType;
		if(whiteListType != null){
			putQueryParameter("WhiteListType", whiteListType);
		}
	}

	public String getRelatedClusterId() {
		return this.relatedClusterId;
	}

	public void setRelatedClusterId(String relatedClusterId) {
		this.relatedClusterId = relatedClusterId;
		if(relatedClusterId != null){
			putQueryParameter("RelatedClusterId", relatedClusterId);
		}
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
		}
	}

	public List<PromotionInfo> getPromotionInfos() {
		return this.promotionInfos;
	}

	public void setPromotionInfos(List<PromotionInfo> promotionInfos) {
		this.promotionInfos = promotionInfos;	
		if (promotionInfos != null) {
			for (int depth1 = 0; depth1 < promotionInfos.size(); depth1++) {
				putQueryParameter("PromotionInfo." + (depth1 + 1) + ".PromotionOptionCode" , promotionInfos.get(depth1).getPromotionOptionCode());
				putQueryParameter("PromotionInfo." + (depth1 + 1) + ".ProductCode" , promotionInfos.get(depth1).getProductCode());
				putQueryParameter("PromotionInfo." + (depth1 + 1) + ".PromotionOptionNo" , promotionInfos.get(depth1).getPromotionOptionNo());
			}
		}	
	}

	public List<HostGroup> getHostGroups() {
		return this.hostGroups;
	}

	public void setHostGroups(List<HostGroup> hostGroups) {
		this.hostGroups = hostGroups;	
		if (hostGroups != null) {
			for (int depth1 = 0; depth1 < hostGroups.size(); depth1++) {
				putQueryParameter("HostGroup." + (depth1 + 1) + ".Period" , hostGroups.get(depth1).getPeriod());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".SysDiskCapacity" , hostGroups.get(depth1).getSysDiskCapacity());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".DiskCapacity" , hostGroups.get(depth1).getDiskCapacity());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".SysDiskType" , hostGroups.get(depth1).getSysDiskType());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".ClusterId" , hostGroups.get(depth1).getClusterId());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".DiskType" , hostGroups.get(depth1).getDiskType());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".HostGroupName" , hostGroups.get(depth1).getHostGroupName());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".VSwitchId" , hostGroups.get(depth1).getVSwitchId());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".DiskCount" , hostGroups.get(depth1).getDiskCount());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".AutoRenew" , hostGroups.get(depth1).getAutoRenew());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".GpuDriver" , hostGroups.get(depth1).getGpuDriver());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".HostGroupId" , hostGroups.get(depth1).getHostGroupId());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".NodeCount" , hostGroups.get(depth1).getNodeCount());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".InstanceType" , hostGroups.get(depth1).getInstanceType());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".Comment" , hostGroups.get(depth1).getComment());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".ChargeType" , hostGroups.get(depth1).getChargeType());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".CreateType" , hostGroups.get(depth1).getCreateType());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".HostGroupType" , hostGroups.get(depth1).getHostGroupType());
			}
		}	
	}

	public String getChargeType() {
		return this.chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
		if(chargeType != null){
			putQueryParameter("ChargeType", chargeType);
		}
	}

	public List<ServiceInfo> getServiceInfos() {
		return this.serviceInfos;
	}

	public void setServiceInfos(List<ServiceInfo> serviceInfos) {
		this.serviceInfos = serviceInfos;	
		if (serviceInfos != null) {
			for (int depth1 = 0; depth1 < serviceInfos.size(); depth1++) {
				putQueryParameter("ServiceInfo." + (depth1 + 1) + ".ServiceVersion" , serviceInfos.get(depth1).getServiceVersion());
				putQueryParameter("ServiceInfo." + (depth1 + 1) + ".ServiceName" , serviceInfos.get(depth1).getServiceName());
			}
		}	
	}

	public List<Config> getConfigs() {
		return this.configs;
	}

	public void setConfigs(List<Config> configs) {
		this.configs = configs;	
		if (configs != null) {
			for (int depth1 = 0; depth1 < configs.size(); depth1++) {
				putQueryParameter("Config." + (depth1 + 1) + ".ConfigKey" , configs.get(depth1).getConfigKey());
				putQueryParameter("Config." + (depth1 + 1) + ".FileName" , configs.get(depth1).getFileName());
				putQueryParameter("Config." + (depth1 + 1) + ".Encrypt" , configs.get(depth1).getEncrypt());
				putQueryParameter("Config." + (depth1 + 1) + ".Replace" , configs.get(depth1).getReplace());
				putQueryParameter("Config." + (depth1 + 1) + ".ConfigValue" , configs.get(depth1).getConfigValue());
				putQueryParameter("Config." + (depth1 + 1) + ".ServiceName" , configs.get(depth1).getServiceName());
			}
		}	
	}

	public Boolean getHighAvailabilityEnable() {
		return this.highAvailabilityEnable;
	}

	public void setHighAvailabilityEnable(Boolean highAvailabilityEnable) {
		this.highAvailabilityEnable = highAvailabilityEnable;
		if(highAvailabilityEnable != null){
			putQueryParameter("HighAvailabilityEnable", highAvailabilityEnable.toString());
		}
	}

	public static class HostComponentInfo {

		private String hostName;

		private List<String> componentNameLists;

		private String serviceName;

		public String getHostName() {
			return this.hostName;
		}

		public void setHostName(String hostName) {
			this.hostName = hostName;
		}

		public List<String> getComponentNameLists() {
			return this.componentNameLists;
		}

		public void setComponentNameLists(List<String> componentNameLists) {
			this.componentNameLists = componentNameLists;
		}

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}
	}

	public static class BootstrapAction {

		private String path;

		private String arg;

		private String name;

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

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	public static class Tag {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	public static class UserInfo {

		private String password;

		private String userId;

		private String userName;

		public String getPassword() {
			return this.password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}
	}

	public static class PromotionInfo {

		private String promotionOptionCode;

		private String productCode;

		private String promotionOptionNo;

		public String getPromotionOptionCode() {
			return this.promotionOptionCode;
		}

		public void setPromotionOptionCode(String promotionOptionCode) {
			this.promotionOptionCode = promotionOptionCode;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public String getPromotionOptionNo() {
			return this.promotionOptionNo;
		}

		public void setPromotionOptionNo(String promotionOptionNo) {
			this.promotionOptionNo = promotionOptionNo;
		}
	}

	public static class HostGroup {

		private Integer period;

		private Integer sysDiskCapacity;

		private Integer diskCapacity;

		private String sysDiskType;

		private String clusterId;

		private String diskType;

		private String hostGroupName;

		private String vSwitchId;

		private Integer diskCount;

		private Boolean autoRenew;

		private String gpuDriver;

		private String hostGroupId;

		private Integer nodeCount;

		private String instanceType;

		private String comment;

		private String chargeType;

		private String createType;

		private String hostGroupType;

		public Integer getPeriod() {
			return this.period;
		}

		public void setPeriod(Integer period) {
			this.period = period;
		}

		public Integer getSysDiskCapacity() {
			return this.sysDiskCapacity;
		}

		public void setSysDiskCapacity(Integer sysDiskCapacity) {
			this.sysDiskCapacity = sysDiskCapacity;
		}

		public Integer getDiskCapacity() {
			return this.diskCapacity;
		}

		public void setDiskCapacity(Integer diskCapacity) {
			this.diskCapacity = diskCapacity;
		}

		public String getSysDiskType() {
			return this.sysDiskType;
		}

		public void setSysDiskType(String sysDiskType) {
			this.sysDiskType = sysDiskType;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getDiskType() {
			return this.diskType;
		}

		public void setDiskType(String diskType) {
			this.diskType = diskType;
		}

		public String getHostGroupName() {
			return this.hostGroupName;
		}

		public void setHostGroupName(String hostGroupName) {
			this.hostGroupName = hostGroupName;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public Integer getDiskCount() {
			return this.diskCount;
		}

		public void setDiskCount(Integer diskCount) {
			this.diskCount = diskCount;
		}

		public Boolean getAutoRenew() {
			return this.autoRenew;
		}

		public void setAutoRenew(Boolean autoRenew) {
			this.autoRenew = autoRenew;
		}

		public String getGpuDriver() {
			return this.gpuDriver;
		}

		public void setGpuDriver(String gpuDriver) {
			this.gpuDriver = gpuDriver;
		}

		public String getHostGroupId() {
			return this.hostGroupId;
		}

		public void setHostGroupId(String hostGroupId) {
			this.hostGroupId = hostGroupId;
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

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getCreateType() {
			return this.createType;
		}

		public void setCreateType(String createType) {
			this.createType = createType;
		}

		public String getHostGroupType() {
			return this.hostGroupType;
		}

		public void setHostGroupType(String hostGroupType) {
			this.hostGroupType = hostGroupType;
		}
	}

	public static class ServiceInfo {

		private String serviceVersion;

		private String serviceName;

		public String getServiceVersion() {
			return this.serviceVersion;
		}

		public void setServiceVersion(String serviceVersion) {
			this.serviceVersion = serviceVersion;
		}

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}
	}

	public static class Config {

		private String configKey;

		private String fileName;

		private String encrypt;

		private String replace;

		private String configValue;

		private String serviceName;

		public String getConfigKey() {
			return this.configKey;
		}

		public void setConfigKey(String configKey) {
			this.configKey = configKey;
		}

		public String getFileName() {
			return this.fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
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

		public String getConfigValue() {
			return this.configValue;
		}

		public void setConfigValue(String configValue) {
			this.configValue = configValue;
		}

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}
	}

	@Override
	public Class<CreateClusterV2Response> getResponseClass() {
		return CreateClusterV2Response.class;
	}

}
