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

package com.aliyuncs.ecs.model.v20160314;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RunInstancesRequest extends RpcAcsRequest<RunInstancesResponse> {
	   

	private Boolean uniqueSuffix;

	private String securityEnhancementStrategy;

	private String networkType;

	private Integer minAmount;

	private Boolean deletionProtection;

	private String resourceGroupId;

	private String privatePoolOptionsMatchCriteria;

	private String hostName;

	private String password;

	private SystemDisk systemDisk;

	private ImageOptions imageOptions;

	private String deploymentSetGroupNo;

	private String systemDiskAutoSnapshotPolicyId;

	private Boolean dryRun;

	private Long ownerId;

	private String spotStrategy;

	private String privateIpAddress;

	private String internetChargeType;

	private Integer internetMaxBandwidthIn;

	private Boolean systemDiskDeleteWithInstance;

	private String affinity;

	private String imageId;

	private String spotInterruptionBehavior;

	private String ioOptimized;

	private String securityGroupId;

	private Boolean hibernationOptionsConfigured;

	private String systemDiskPerformanceLevel;

	private Boolean passwordInherit;

	private String instanceType;

	private String resourceOwnerAccount;

	private String systemDiskDiskName;

	private String relationOrderId;

	private String dedicatedHostId;

	private Integer spotDuration;

	private List<String> securityGroupIdss;

	private NetworkOptions networkOptions;

	private String systemDiskSize;

	private String imageFamily;

	private String defaultVpc;

	private Long resourceOwnerId;

	private List<Instance> instances;

	private String hpcClusterId;

	private Integer httpPutResponseHopLimit;

	private String isp;

	private String keyPairName;

	private Float spotPriceLimit;

	private Integer storageSetPartitionNumber;

	private List<Tag> tags;

	private String businessInfo;

	private String privatePoolOptionsId;

	private String nodeControllerId;

	private String fromApp;

	private Integer ipv6AddressCount;

	private Integer maxAmount;

	private List<String> hostNamess;

	private String vSwitchId;

	private String recycleBinResourceId;

	private String instanceName;

	private String zoneId;

	private List<String> ipv6Addresss;

	private String securityOptionsConfidentialComputingMode;

	private String clientToken;

	private Integer internetMaxBandwidthOut;

	private String description;

	private String systemDiskCategory;

	private String securityOptionsTrustedSystemMode;

	private String userData;

	private String httpEndpoint;

	private String dedicatedHostClusterId;

	private String deploymentSetId;

	private List<NetworkInterface> networkInterfaces;

	private String ownerAccount;

	private String tenancy;

	private String autoReleaseTime;

	private String ramRoleName;

	private String clusterId;

	private String creditSpecification;

	private String schedulerOptionsManagedPrivateSpaceId;

	private List<DataDisk> dataDisks;

	private String storageSetId;

	private List<SecurityGroupRule> securityGroupRules;

	private String httpTokens;

	private String systemDiskDescription;
	public RunInstancesRequest() {
		super("Ecs", "2016-03-14", "RunInstances", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getUniqueSuffix() {
		return this.uniqueSuffix;
	}

	public void setUniqueSuffix(Boolean uniqueSuffix) {
		this.uniqueSuffix = uniqueSuffix;
		if(uniqueSuffix != null){
			putQueryParameter("UniqueSuffix", uniqueSuffix.toString());
		}
	}

	public String getSecurityEnhancementStrategy() {
		return this.securityEnhancementStrategy;
	}

	public void setSecurityEnhancementStrategy(String securityEnhancementStrategy) {
		this.securityEnhancementStrategy = securityEnhancementStrategy;
		if(securityEnhancementStrategy != null){
			putQueryParameter("SecurityEnhancementStrategy", securityEnhancementStrategy);
		}
	}

	public String getNetworkType() {
		return this.networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
		if(networkType != null){
			putQueryParameter("NetworkType", networkType);
		}
	}

	public Integer getMinAmount() {
		return this.minAmount;
	}

	public void setMinAmount(Integer minAmount) {
		this.minAmount = minAmount;
		if(minAmount != null){
			putQueryParameter("MinAmount", minAmount.toString());
		}
	}

	public Boolean getDeletionProtection() {
		return this.deletionProtection;
	}

	public void setDeletionProtection(Boolean deletionProtection) {
		this.deletionProtection = deletionProtection;
		if(deletionProtection != null){
			putQueryParameter("DeletionProtection", deletionProtection.toString());
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

	public String getPrivatePoolOptionsMatchCriteria() {
		return this.privatePoolOptionsMatchCriteria;
	}

	public void setPrivatePoolOptionsMatchCriteria(String privatePoolOptionsMatchCriteria) {
		this.privatePoolOptionsMatchCriteria = privatePoolOptionsMatchCriteria;
		if(privatePoolOptionsMatchCriteria != null){
			putQueryParameter("PrivatePoolOptions.MatchCriteria", privatePoolOptionsMatchCriteria);
		}
	}

	public String getHostName() {
		return this.hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
		if(hostName != null){
			putQueryParameter("HostName", hostName);
		}
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putQueryParameter("Password", password);
		}
	}

	public SystemDisk getSystemDisk() {
		return this.systemDisk;
	}

	public void setSystemDisk(SystemDisk systemDisk) {
		this.systemDisk = systemDisk;	
		if (systemDisk != null) {
			
				putQueryParameter("SystemDisk.ProvisionedIops" , systemDisk.getProvisionedIops());
				putQueryParameter("SystemDisk.Encrypted" , systemDisk.getEncrypted());
				putQueryParameter("SystemDisk.EncryptAlgorithm" , systemDisk.getEncryptAlgorithm());
				putQueryParameter("SystemDisk.StorageClusterId" , systemDisk.getStorageClusterId());
				putQueryParameter("SystemDisk.KMSKeyId" , systemDisk.getKMSKeyId());
				putQueryParameter("SystemDisk.BurstingEnabled" , systemDisk.getBurstingEnabled());
		}	
	}

	public ImageOptions getImageOptions() {
		return this.imageOptions;
	}

	public void setImageOptions(ImageOptions imageOptions) {
		this.imageOptions = imageOptions;	
		if (imageOptions != null) {
			
				putQueryParameter("ImageOptions.LoginAsNonRoot" , imageOptions.getLoginAsNonRoot());
		}	
	}

	public String getDeploymentSetGroupNo() {
		return this.deploymentSetGroupNo;
	}

	public void setDeploymentSetGroupNo(String deploymentSetGroupNo) {
		this.deploymentSetGroupNo = deploymentSetGroupNo;
		if(deploymentSetGroupNo != null){
			putQueryParameter("DeploymentSetGroupNo", deploymentSetGroupNo);
		}
	}

	public String getSystemDiskAutoSnapshotPolicyId() {
		return this.systemDiskAutoSnapshotPolicyId;
	}

	public void setSystemDiskAutoSnapshotPolicyId(String systemDiskAutoSnapshotPolicyId) {
		this.systemDiskAutoSnapshotPolicyId = systemDiskAutoSnapshotPolicyId;
		if(systemDiskAutoSnapshotPolicyId != null){
			putQueryParameter("SystemDisk.AutoSnapshotPolicyId", systemDiskAutoSnapshotPolicyId);
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getSpotStrategy() {
		return this.spotStrategy;
	}

	public void setSpotStrategy(String spotStrategy) {
		this.spotStrategy = spotStrategy;
		if(spotStrategy != null){
			putQueryParameter("SpotStrategy", spotStrategy);
		}
	}

	public String getPrivateIpAddress() {
		return this.privateIpAddress;
	}

	public void setPrivateIpAddress(String privateIpAddress) {
		this.privateIpAddress = privateIpAddress;
		if(privateIpAddress != null){
			putQueryParameter("PrivateIpAddress", privateIpAddress);
		}
	}

	public String getInternetChargeType() {
		return this.internetChargeType;
	}

	public void setInternetChargeType(String internetChargeType) {
		this.internetChargeType = internetChargeType;
		if(internetChargeType != null){
			putQueryParameter("InternetChargeType", internetChargeType);
		}
	}

	public Integer getInternetMaxBandwidthIn() {
		return this.internetMaxBandwidthIn;
	}

	public void setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
		this.internetMaxBandwidthIn = internetMaxBandwidthIn;
		if(internetMaxBandwidthIn != null){
			putQueryParameter("InternetMaxBandwidthIn", internetMaxBandwidthIn.toString());
		}
	}

	public Boolean getSystemDiskDeleteWithInstance() {
		return this.systemDiskDeleteWithInstance;
	}

	public void setSystemDiskDeleteWithInstance(Boolean systemDiskDeleteWithInstance) {
		this.systemDiskDeleteWithInstance = systemDiskDeleteWithInstance;
		if(systemDiskDeleteWithInstance != null){
			putQueryParameter("SystemDisk.DeleteWithInstance", systemDiskDeleteWithInstance.toString());
		}
	}

	public String getAffinity() {
		return this.affinity;
	}

	public void setAffinity(String affinity) {
		this.affinity = affinity;
		if(affinity != null){
			putQueryParameter("Affinity", affinity);
		}
	}

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
		if(imageId != null){
			putQueryParameter("ImageId", imageId);
		}
	}

	public String getSpotInterruptionBehavior() {
		return this.spotInterruptionBehavior;
	}

	public void setSpotInterruptionBehavior(String spotInterruptionBehavior) {
		this.spotInterruptionBehavior = spotInterruptionBehavior;
		if(spotInterruptionBehavior != null){
			putQueryParameter("SpotInterruptionBehavior", spotInterruptionBehavior);
		}
	}

	public String getIoOptimized() {
		return this.ioOptimized;
	}

	public void setIoOptimized(String ioOptimized) {
		this.ioOptimized = ioOptimized;
		if(ioOptimized != null){
			putQueryParameter("IoOptimized", ioOptimized);
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

	public Boolean getHibernationOptionsConfigured() {
		return this.hibernationOptionsConfigured;
	}

	public void setHibernationOptionsConfigured(Boolean hibernationOptionsConfigured) {
		this.hibernationOptionsConfigured = hibernationOptionsConfigured;
		if(hibernationOptionsConfigured != null){
			putQueryParameter("HibernationOptions.Configured", hibernationOptionsConfigured.toString());
		}
	}

	public String getSystemDiskPerformanceLevel() {
		return this.systemDiskPerformanceLevel;
	}

	public void setSystemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
		this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
		if(systemDiskPerformanceLevel != null){
			putQueryParameter("SystemDisk.PerformanceLevel", systemDiskPerformanceLevel);
		}
	}

	public Boolean getPasswordInherit() {
		return this.passwordInherit;
	}

	public void setPasswordInherit(Boolean passwordInherit) {
		this.passwordInherit = passwordInherit;
		if(passwordInherit != null){
			putQueryParameter("PasswordInherit", passwordInherit.toString());
		}
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putQueryParameter("InstanceType", instanceType);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getSystemDiskDiskName() {
		return this.systemDiskDiskName;
	}

	public void setSystemDiskDiskName(String systemDiskDiskName) {
		this.systemDiskDiskName = systemDiskDiskName;
		if(systemDiskDiskName != null){
			putQueryParameter("SystemDisk.DiskName", systemDiskDiskName);
		}
	}

	public String getRelationOrderId() {
		return this.relationOrderId;
	}

	public void setRelationOrderId(String relationOrderId) {
		this.relationOrderId = relationOrderId;
		if(relationOrderId != null){
			putQueryParameter("RelationOrderId", relationOrderId);
		}
	}

	public String getDedicatedHostId() {
		return this.dedicatedHostId;
	}

	public void setDedicatedHostId(String dedicatedHostId) {
		this.dedicatedHostId = dedicatedHostId;
		if(dedicatedHostId != null){
			putQueryParameter("DedicatedHostId", dedicatedHostId);
		}
	}

	public Integer getSpotDuration() {
		return this.spotDuration;
	}

	public void setSpotDuration(Integer spotDuration) {
		this.spotDuration = spotDuration;
		if(spotDuration != null){
			putQueryParameter("SpotDuration", spotDuration.toString());
		}
	}

	public List<String> getSecurityGroupIdss() {
		return this.securityGroupIdss;
	}

	public void setSecurityGroupIdss(List<String> securityGroupIdss) {
		this.securityGroupIdss = securityGroupIdss;	
		if (securityGroupIdss != null) {
			for (int i = 0; i < securityGroupIdss.size(); i++) {
				putQueryParameter("SecurityGroupIds." + (i + 1) , securityGroupIdss.get(i));
			}
		}	
	}

	public NetworkOptions getNetworkOptions() {
		return this.networkOptions;
	}

	public void setNetworkOptions(NetworkOptions networkOptions) {
		this.networkOptions = networkOptions;	
		if (networkOptions != null) {
			
				putQueryParameter("NetworkOptions.EnableJumboFrame" , networkOptions.getEnableJumboFrame());
		}	
	}

	public String getSystemDiskSize() {
		return this.systemDiskSize;
	}

	public void setSystemDiskSize(String systemDiskSize) {
		this.systemDiskSize = systemDiskSize;
		if(systemDiskSize != null){
			putQueryParameter("SystemDisk.Size", systemDiskSize);
		}
	}

	public String getImageFamily() {
		return this.imageFamily;
	}

	public void setImageFamily(String imageFamily) {
		this.imageFamily = imageFamily;
		if(imageFamily != null){
			putQueryParameter("ImageFamily", imageFamily);
		}
	}

	public String getDefaultVpc() {
		return this.defaultVpc;
	}

	public void setDefaultVpc(String defaultVpc) {
		this.defaultVpc = defaultVpc;
		if(defaultVpc != null){
			putQueryParameter("DefaultVpc", defaultVpc);
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

	public List<Instance> getInstances() {
		return this.instances;
	}

	public void setInstances(List<Instance> instances) {
		this.instances = instances;	
		if (instances != null) {
			for (int depth1 = 0; depth1 < instances.size(); depth1++) {
				putQueryParameter("Instance." + (depth1 + 1) + ".PrivateIpAddress" , instances.get(depth1).getPrivateIpAddress());
			}
		}	
	}

	public String getHpcClusterId() {
		return this.hpcClusterId;
	}

	public void setHpcClusterId(String hpcClusterId) {
		this.hpcClusterId = hpcClusterId;
		if(hpcClusterId != null){
			putQueryParameter("HpcClusterId", hpcClusterId);
		}
	}

	public Integer getHttpPutResponseHopLimit() {
		return this.httpPutResponseHopLimit;
	}

	public void setHttpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
		this.httpPutResponseHopLimit = httpPutResponseHopLimit;
		if(httpPutResponseHopLimit != null){
			putQueryParameter("HttpPutResponseHopLimit", httpPutResponseHopLimit.toString());
		}
	}

	public String getIsp() {
		return this.isp;
	}

	public void setIsp(String isp) {
		this.isp = isp;
		if(isp != null){
			putQueryParameter("Isp", isp);
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

	public Float getSpotPriceLimit() {
		return this.spotPriceLimit;
	}

	public void setSpotPriceLimit(Float spotPriceLimit) {
		this.spotPriceLimit = spotPriceLimit;
		if(spotPriceLimit != null){
			putQueryParameter("SpotPriceLimit", spotPriceLimit.toString());
		}
	}

	public Integer getStorageSetPartitionNumber() {
		return this.storageSetPartitionNumber;
	}

	public void setStorageSetPartitionNumber(Integer storageSetPartitionNumber) {
		this.storageSetPartitionNumber = storageSetPartitionNumber;
		if(storageSetPartitionNumber != null){
			putQueryParameter("StorageSetPartitionNumber", storageSetPartitionNumber.toString());
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

	public String getBusinessInfo() {
		return this.businessInfo;
	}

	public void setBusinessInfo(String businessInfo) {
		this.businessInfo = businessInfo;
		if(businessInfo != null){
			putQueryParameter("BusinessInfo", businessInfo);
		}
	}

	public String getPrivatePoolOptionsId() {
		return this.privatePoolOptionsId;
	}

	public void setPrivatePoolOptionsId(String privatePoolOptionsId) {
		this.privatePoolOptionsId = privatePoolOptionsId;
		if(privatePoolOptionsId != null){
			putQueryParameter("PrivatePoolOptions.Id", privatePoolOptionsId);
		}
	}

	public String getNodeControllerId() {
		return this.nodeControllerId;
	}

	public void setNodeControllerId(String nodeControllerId) {
		this.nodeControllerId = nodeControllerId;
		if(nodeControllerId != null){
			putQueryParameter("NodeControllerId", nodeControllerId);
		}
	}

	public String getFromApp() {
		return this.fromApp;
	}

	public void setFromApp(String fromApp) {
		this.fromApp = fromApp;
		if(fromApp != null){
			putQueryParameter("FromApp", fromApp);
		}
	}

	public Integer getIpv6AddressCount() {
		return this.ipv6AddressCount;
	}

	public void setIpv6AddressCount(Integer ipv6AddressCount) {
		this.ipv6AddressCount = ipv6AddressCount;
		if(ipv6AddressCount != null){
			putQueryParameter("Ipv6AddressCount", ipv6AddressCount.toString());
		}
	}

	public Integer getMaxAmount() {
		return this.maxAmount;
	}

	public void setMaxAmount(Integer maxAmount) {
		this.maxAmount = maxAmount;
		if(maxAmount != null){
			putQueryParameter("MaxAmount", maxAmount.toString());
		}
	}

	public List<String> getHostNamess() {
		return this.hostNamess;
	}

	public void setHostNamess(List<String> hostNamess) {
		this.hostNamess = hostNamess;	
		if (hostNamess != null) {
			for (int i = 0; i < hostNamess.size(); i++) {
				putQueryParameter("HostNames." + (i + 1) , hostNamess.get(i));
			}
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

	public String getRecycleBinResourceId() {
		return this.recycleBinResourceId;
	}

	public void setRecycleBinResourceId(String recycleBinResourceId) {
		this.recycleBinResourceId = recycleBinResourceId;
		if(recycleBinResourceId != null){
			putQueryParameter("RecycleBinResourceId", recycleBinResourceId);
		}
	}

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
		if(instanceName != null){
			putQueryParameter("InstanceName", instanceName);
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

	public List<String> getIpv6Addresss() {
		return this.ipv6Addresss;
	}

	public void setIpv6Addresss(List<String> ipv6Addresss) {
		this.ipv6Addresss = ipv6Addresss;	
		if (ipv6Addresss != null) {
			for (int i = 0; i < ipv6Addresss.size(); i++) {
				putQueryParameter("Ipv6Address." + (i + 1) , ipv6Addresss.get(i));
			}
		}	
	}

	public String getSecurityOptionsConfidentialComputingMode() {
		return this.securityOptionsConfidentialComputingMode;
	}

	public void setSecurityOptionsConfidentialComputingMode(String securityOptionsConfidentialComputingMode) {
		this.securityOptionsConfidentialComputingMode = securityOptionsConfidentialComputingMode;
		if(securityOptionsConfidentialComputingMode != null){
			putQueryParameter("SecurityOptions.ConfidentialComputingMode", securityOptionsConfidentialComputingMode);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public Integer getInternetMaxBandwidthOut() {
		return this.internetMaxBandwidthOut;
	}

	public void setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
		this.internetMaxBandwidthOut = internetMaxBandwidthOut;
		if(internetMaxBandwidthOut != null){
			putQueryParameter("InternetMaxBandwidthOut", internetMaxBandwidthOut.toString());
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getSystemDiskCategory() {
		return this.systemDiskCategory;
	}

	public void setSystemDiskCategory(String systemDiskCategory) {
		this.systemDiskCategory = systemDiskCategory;
		if(systemDiskCategory != null){
			putQueryParameter("SystemDisk.Category", systemDiskCategory);
		}
	}

	public String getSecurityOptionsTrustedSystemMode() {
		return this.securityOptionsTrustedSystemMode;
	}

	public void setSecurityOptionsTrustedSystemMode(String securityOptionsTrustedSystemMode) {
		this.securityOptionsTrustedSystemMode = securityOptionsTrustedSystemMode;
		if(securityOptionsTrustedSystemMode != null){
			putQueryParameter("SecurityOptions.TrustedSystemMode", securityOptionsTrustedSystemMode);
		}
	}

	public String getUserData() {
		return this.userData;
	}

	public void setUserData(String userData) {
		this.userData = userData;
		if(userData != null){
			putQueryParameter("UserData", userData);
		}
	}

	public String getHttpEndpoint() {
		return this.httpEndpoint;
	}

	public void setHttpEndpoint(String httpEndpoint) {
		this.httpEndpoint = httpEndpoint;
		if(httpEndpoint != null){
			putQueryParameter("HttpEndpoint", httpEndpoint);
		}
	}

	public String getDedicatedHostClusterId() {
		return this.dedicatedHostClusterId;
	}

	public void setDedicatedHostClusterId(String dedicatedHostClusterId) {
		this.dedicatedHostClusterId = dedicatedHostClusterId;
		if(dedicatedHostClusterId != null){
			putQueryParameter("DedicatedHostClusterId", dedicatedHostClusterId);
		}
	}

	public String getDeploymentSetId() {
		return this.deploymentSetId;
	}

	public void setDeploymentSetId(String deploymentSetId) {
		this.deploymentSetId = deploymentSetId;
		if(deploymentSetId != null){
			putQueryParameter("DeploymentSetId", deploymentSetId);
		}
	}

	public List<NetworkInterface> getNetworkInterfaces() {
		return this.networkInterfaces;
	}

	public void setNetworkInterfaces(List<NetworkInterface> networkInterfaces) {
		this.networkInterfaces = networkInterfaces;	
		if (networkInterfaces != null) {
			for (int depth1 = 0; depth1 < networkInterfaces.size(); depth1++) {
				putQueryParameter("NetworkInterface." + (depth1 + 1) + ".VSwitchId" , networkInterfaces.get(depth1).getVSwitchId());
				putQueryParameter("NetworkInterface." + (depth1 + 1) + ".NetworkCardIndex" , networkInterfaces.get(depth1).getNetworkCardIndex());
				putQueryParameter("NetworkInterface." + (depth1 + 1) + ".Ipv6AddressCount" , networkInterfaces.get(depth1).getIpv6AddressCount());
				putQueryParameter("NetworkInterface." + (depth1 + 1) + ".SecurityGroupId" , networkInterfaces.get(depth1).getSecurityGroupId());
				putQueryParameter("NetworkInterface." + (depth1 + 1) + ".Description" , networkInterfaces.get(depth1).getDescription());
				putQueryParameter("NetworkInterface." + (depth1 + 1) + ".PrimaryIpAddress" , networkInterfaces.get(depth1).getPrimaryIpAddress());
				putQueryParameter("NetworkInterface." + (depth1 + 1) + ".InstanceType" , networkInterfaces.get(depth1).getInstanceType());
				putQueryParameter("NetworkInterface." + (depth1 + 1) + ".QueuePairNumber" , networkInterfaces.get(depth1).getQueuePairNumber());
				if (networkInterfaces.get(depth1).getSecurityGroupIdss() != null) {
					for (int i = 0; i < networkInterfaces.get(depth1).getSecurityGroupIdss().size(); i++) {
						putQueryParameter("NetworkInterface." + (depth1 + 1) + ".SecurityGroupIds." + (i + 1) , networkInterfaces.get(depth1).getSecurityGroupIdss().get(i));
					}
				}
				if (networkInterfaces.get(depth1).getIpv6Addresss() != null) {
					for (int i = 0; i < networkInterfaces.get(depth1).getIpv6Addresss().size(); i++) {
						putQueryParameter("NetworkInterface." + (depth1 + 1) + ".Ipv6Address." + (i + 1) , networkInterfaces.get(depth1).getIpv6Addresss().get(i));
					}
				}
				putQueryParameter("NetworkInterface." + (depth1 + 1) + ".NetworkInterfaceTrafficMode" , networkInterfaces.get(depth1).getNetworkInterfaceTrafficMode());
				putQueryParameter("NetworkInterface." + (depth1 + 1) + ".NetworkInterfaceName" , networkInterfaces.get(depth1).getNetworkInterfaceName());
			}
		}	
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getTenancy() {
		return this.tenancy;
	}

	public void setTenancy(String tenancy) {
		this.tenancy = tenancy;
		if(tenancy != null){
			putQueryParameter("Tenancy", tenancy);
		}
	}

	public String getAutoReleaseTime() {
		return this.autoReleaseTime;
	}

	public void setAutoReleaseTime(String autoReleaseTime) {
		this.autoReleaseTime = autoReleaseTime;
		if(autoReleaseTime != null){
			putQueryParameter("AutoReleaseTime", autoReleaseTime);
		}
	}

	public String getRamRoleName() {
		return this.ramRoleName;
	}

	public void setRamRoleName(String ramRoleName) {
		this.ramRoleName = ramRoleName;
		if(ramRoleName != null){
			putQueryParameter("RamRoleName", ramRoleName);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getCreditSpecification() {
		return this.creditSpecification;
	}

	public void setCreditSpecification(String creditSpecification) {
		this.creditSpecification = creditSpecification;
		if(creditSpecification != null){
			putQueryParameter("CreditSpecification", creditSpecification);
		}
	}

	public String getSchedulerOptionsManagedPrivateSpaceId() {
		return this.schedulerOptionsManagedPrivateSpaceId;
	}

	public void setSchedulerOptionsManagedPrivateSpaceId(String schedulerOptionsManagedPrivateSpaceId) {
		this.schedulerOptionsManagedPrivateSpaceId = schedulerOptionsManagedPrivateSpaceId;
		if(schedulerOptionsManagedPrivateSpaceId != null){
			putQueryParameter("SchedulerOptions.ManagedPrivateSpaceId", schedulerOptionsManagedPrivateSpaceId);
		}
	}

	public List<DataDisk> getDataDisks() {
		return this.dataDisks;
	}

	public void setDataDisks(List<DataDisk> dataDisks) {
		this.dataDisks = dataDisks;	
		if (dataDisks != null) {
			for (int depth1 = 0; depth1 < dataDisks.size(); depth1++) {
				putQueryParameter("DataDisk." + (depth1 + 1) + ".SnapshotId" , dataDisks.get(depth1).getSnapshotId());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".PerformanceLevel" , dataDisks.get(depth1).getPerformanceLevel());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".EncryptAlgorithm" , dataDisks.get(depth1).getEncryptAlgorithm());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".AutoSnapshotPolicyId" , dataDisks.get(depth1).getAutoSnapshotPolicyId());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".Description" , dataDisks.get(depth1).getDescription());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".BurstingEnabled" , dataDisks.get(depth1).getBurstingEnabled());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".DiskName" , dataDisks.get(depth1).getDiskName());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".ProvisionedIops" , dataDisks.get(depth1).getProvisionedIops());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".Encrypted" , dataDisks.get(depth1).getEncrypted());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".Size" , dataDisks.get(depth1).getSize());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".StorageClusterId" , dataDisks.get(depth1).getStorageClusterId());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".Category" , dataDisks.get(depth1).getCategory());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".KMSKeyId" , dataDisks.get(depth1).getKMSKeyId());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".Device" , dataDisks.get(depth1).getDevice());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".DeleteWithInstance" , dataDisks.get(depth1).getDeleteWithInstance());
			}
		}	
	}

	public String getStorageSetId() {
		return this.storageSetId;
	}

	public void setStorageSetId(String storageSetId) {
		this.storageSetId = storageSetId;
		if(storageSetId != null){
			putQueryParameter("StorageSetId", storageSetId);
		}
	}

	public List<SecurityGroupRule> getSecurityGroupRules() {
		return this.securityGroupRules;
	}

	public void setSecurityGroupRules(List<SecurityGroupRule> securityGroupRules) {
		this.securityGroupRules = securityGroupRules;	
		if (securityGroupRules != null) {
			for (int depth1 = 0; depth1 < securityGroupRules.size(); depth1++) {
				putQueryParameter("SecurityGroupRule." + (depth1 + 1) + ".NicType" , securityGroupRules.get(depth1).getNicType());
				putQueryParameter("SecurityGroupRule." + (depth1 + 1) + ".PortRange" , securityGroupRules.get(depth1).getPortRange());
				putQueryParameter("SecurityGroupRule." + (depth1 + 1) + ".IpProtocol" , securityGroupRules.get(depth1).getIpProtocol());
				putQueryParameter("SecurityGroupRule." + (depth1 + 1) + ".Priority" , securityGroupRules.get(depth1).getPriority());
				putQueryParameter("SecurityGroupRule." + (depth1 + 1) + ".Policy" , securityGroupRules.get(depth1).getPolicy());
			}
		}	
	}

	public String getHttpTokens() {
		return this.httpTokens;
	}

	public void setHttpTokens(String httpTokens) {
		this.httpTokens = httpTokens;
		if(httpTokens != null){
			putQueryParameter("HttpTokens", httpTokens);
		}
	}

	public String getSystemDiskDescription() {
		return this.systemDiskDescription;
	}

	public void setSystemDiskDescription(String systemDiskDescription) {
		this.systemDiskDescription = systemDiskDescription;
		if(systemDiskDescription != null){
			putQueryParameter("SystemDisk.Description", systemDiskDescription);
		}
	}

	public static class SystemDisk {

		private Long provisionedIops;

		private Boolean encrypted;

		private String encryptAlgorithm;

		private String storageClusterId;

		private String kMSKeyId;

		private Boolean burstingEnabled;

		public Long getProvisionedIops() {
			return this.provisionedIops;
		}

		public void setProvisionedIops(Long provisionedIops) {
			this.provisionedIops = provisionedIops;
		}

		public Boolean getEncrypted() {
			return this.encrypted;
		}

		public void setEncrypted(Boolean encrypted) {
			this.encrypted = encrypted;
		}

		public String getEncryptAlgorithm() {
			return this.encryptAlgorithm;
		}

		public void setEncryptAlgorithm(String encryptAlgorithm) {
			this.encryptAlgorithm = encryptAlgorithm;
		}

		public String getStorageClusterId() {
			return this.storageClusterId;
		}

		public void setStorageClusterId(String storageClusterId) {
			this.storageClusterId = storageClusterId;
		}

		public String getKMSKeyId() {
			return this.kMSKeyId;
		}

		public void setKMSKeyId(String kMSKeyId) {
			this.kMSKeyId = kMSKeyId;
		}

		public Boolean getBurstingEnabled() {
			return this.burstingEnabled;
		}

		public void setBurstingEnabled(Boolean burstingEnabled) {
			this.burstingEnabled = burstingEnabled;
		}
	}

	public static class ImageOptions {

		private Boolean loginAsNonRoot;

		public Boolean getLoginAsNonRoot() {
			return this.loginAsNonRoot;
		}

		public void setLoginAsNonRoot(Boolean loginAsNonRoot) {
			this.loginAsNonRoot = loginAsNonRoot;
		}
	}

	public static class NetworkOptions {

		private Boolean enableJumboFrame;

		public Boolean getEnableJumboFrame() {
			return this.enableJumboFrame;
		}

		public void setEnableJumboFrame(Boolean enableJumboFrame) {
			this.enableJumboFrame = enableJumboFrame;
		}
	}

	public static class Instance {

		private String privateIpAddress;

		public String getPrivateIpAddress() {
			return this.privateIpAddress;
		}

		public void setPrivateIpAddress(String privateIpAddress) {
			this.privateIpAddress = privateIpAddress;
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

	public static class NetworkInterface {

		private String vSwitchId;

		private Integer networkCardIndex;

		private Long ipv6AddressCount;

		private String securityGroupId;

		private String description;

		private String primaryIpAddress;

		private String instanceType;

		private Long queuePairNumber;

		private List<String> securityGroupIdss;

		private List<String> ipv6Addresss;

		private String networkInterfaceTrafficMode;

		private String networkInterfaceName;

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public Integer getNetworkCardIndex() {
			return this.networkCardIndex;
		}

		public void setNetworkCardIndex(Integer networkCardIndex) {
			this.networkCardIndex = networkCardIndex;
		}

		public Long getIpv6AddressCount() {
			return this.ipv6AddressCount;
		}

		public void setIpv6AddressCount(Long ipv6AddressCount) {
			this.ipv6AddressCount = ipv6AddressCount;
		}

		public String getSecurityGroupId() {
			return this.securityGroupId;
		}

		public void setSecurityGroupId(String securityGroupId) {
			this.securityGroupId = securityGroupId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getPrimaryIpAddress() {
			return this.primaryIpAddress;
		}

		public void setPrimaryIpAddress(String primaryIpAddress) {
			this.primaryIpAddress = primaryIpAddress;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public Long getQueuePairNumber() {
			return this.queuePairNumber;
		}

		public void setQueuePairNumber(Long queuePairNumber) {
			this.queuePairNumber = queuePairNumber;
		}

		public List<String> getSecurityGroupIdss() {
			return this.securityGroupIdss;
		}

		public void setSecurityGroupIdss(List<String> securityGroupIdss) {
			this.securityGroupIdss = securityGroupIdss;
		}

		public List<String> getIpv6Addresss() {
			return this.ipv6Addresss;
		}

		public void setIpv6Addresss(List<String> ipv6Addresss) {
			this.ipv6Addresss = ipv6Addresss;
		}

		public String getNetworkInterfaceTrafficMode() {
			return this.networkInterfaceTrafficMode;
		}

		public void setNetworkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
			this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
		}

		public String getNetworkInterfaceName() {
			return this.networkInterfaceName;
		}

		public void setNetworkInterfaceName(String networkInterfaceName) {
			this.networkInterfaceName = networkInterfaceName;
		}
	}

	public static class DataDisk {

		private String snapshotId;

		private String performanceLevel;

		private String encryptAlgorithm;

		private String autoSnapshotPolicyId;

		private String description;

		private Boolean burstingEnabled;

		private String diskName;

		private Long provisionedIops;

		private Boolean encrypted;

		private Integer size;

		private String storageClusterId;

		private String category;

		private String kMSKeyId;

		private String device;

		private Boolean deleteWithInstance;

		public String getSnapshotId() {
			return this.snapshotId;
		}

		public void setSnapshotId(String snapshotId) {
			this.snapshotId = snapshotId;
		}

		public String getPerformanceLevel() {
			return this.performanceLevel;
		}

		public void setPerformanceLevel(String performanceLevel) {
			this.performanceLevel = performanceLevel;
		}

		public String getEncryptAlgorithm() {
			return this.encryptAlgorithm;
		}

		public void setEncryptAlgorithm(String encryptAlgorithm) {
			this.encryptAlgorithm = encryptAlgorithm;
		}

		public String getAutoSnapshotPolicyId() {
			return this.autoSnapshotPolicyId;
		}

		public void setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
			this.autoSnapshotPolicyId = autoSnapshotPolicyId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Boolean getBurstingEnabled() {
			return this.burstingEnabled;
		}

		public void setBurstingEnabled(Boolean burstingEnabled) {
			this.burstingEnabled = burstingEnabled;
		}

		public String getDiskName() {
			return this.diskName;
		}

		public void setDiskName(String diskName) {
			this.diskName = diskName;
		}

		public Long getProvisionedIops() {
			return this.provisionedIops;
		}

		public void setProvisionedIops(Long provisionedIops) {
			this.provisionedIops = provisionedIops;
		}

		public Boolean getEncrypted() {
			return this.encrypted;
		}

		public void setEncrypted(Boolean encrypted) {
			this.encrypted = encrypted;
		}

		public Integer getSize() {
			return this.size;
		}

		public void setSize(Integer size) {
			this.size = size;
		}

		public String getStorageClusterId() {
			return this.storageClusterId;
		}

		public void setStorageClusterId(String storageClusterId) {
			this.storageClusterId = storageClusterId;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getKMSKeyId() {
			return this.kMSKeyId;
		}

		public void setKMSKeyId(String kMSKeyId) {
			this.kMSKeyId = kMSKeyId;
		}

		public String getDevice() {
			return this.device;
		}

		public void setDevice(String device) {
			this.device = device;
		}

		public Boolean getDeleteWithInstance() {
			return this.deleteWithInstance;
		}

		public void setDeleteWithInstance(Boolean deleteWithInstance) {
			this.deleteWithInstance = deleteWithInstance;
		}
	}

	public static class SecurityGroupRule {

		private String nicType;

		private String portRange;

		private String ipProtocol;

		private String priority;

		private String policy;

		public String getNicType() {
			return this.nicType;
		}

		public void setNicType(String nicType) {
			this.nicType = nicType;
		}

		public String getPortRange() {
			return this.portRange;
		}

		public void setPortRange(String portRange) {
			this.portRange = portRange;
		}

		public String getIpProtocol() {
			return this.ipProtocol;
		}

		public void setIpProtocol(String ipProtocol) {
			this.ipProtocol = ipProtocol;
		}

		public String getPriority() {
			return this.priority;
		}

		public void setPriority(String priority) {
			this.priority = priority;
		}

		public String getPolicy() {
			return this.policy;
		}

		public void setPolicy(String policy) {
			this.policy = policy;
		}
	}

	@Override
	public Class<RunInstancesResponse> getResponseClass() {
		return RunInstancesResponse.class;
	}

}
