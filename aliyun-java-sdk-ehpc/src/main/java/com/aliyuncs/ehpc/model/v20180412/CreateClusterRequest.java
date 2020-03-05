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

package com.aliyuncs.ehpc.model.v20180412;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ehpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateClusterRequest extends RpcAcsRequest<CreateClusterResponse> {
	   

	private List<AdditionalVolumes> additionalVolumess;

	private String ecsOrderManagerInstanceType;

	private String keyPairName;

	private String securityGroupName;

	private String imageOwnerAlias;

	private String deployMode;

	private Integer ecsOrderManagerCount;

	private String resourceGroupId;

	private String password;

	private Integer ecsOrderLoginCount;

	private String remoteVisEnable;

	private Integer systemDiskSize;

	private String computeSpotPriceLimit;

	private Integer autoRenewPeriod;

	private Integer period;

	private String remoteDirectory;

	private Integer ecsOrderComputeCount;

	private String computeSpotStrategy;

	private List<PostInstallScript> postInstallScripts;

	private String vSwitchId;

	private String periodUnit;

	private Boolean computeEnableHt;

	private String autoRenew;

	private String name;

	private String volumeId;

	private String zoneId;

	private String sccClusterId;

	private String imageId;

	private String ehpcVersion;

	private String accountType;

	private String securityGroupId;

	private String description;

	private String ecsOrderComputeInstanceType;

	private String jobQueue;

	private String volumeType;

	private String systemDiskType;

	private String volumeProtocol;

	private String clientVersion;

	private String osTag;

	private List<Application> applications;

	private String ecsChargeType;

	private String inputFileUrl;

	private String vpcId;

	private Boolean haEnable;

	private String schedulerType;

	private String volumeMountpoint;

	private String ecsOrderLoginInstanceType;
	public CreateClusterRequest() {
		super("EHPC", "2018-04-12", "CreateCluster", "ehs");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<AdditionalVolumes> getAdditionalVolumess() {
		return this.additionalVolumess;
	}

	public void setAdditionalVolumess(List<AdditionalVolumes> additionalVolumess) {
		this.additionalVolumess = additionalVolumess;	
		if (additionalVolumess != null) {
			for (int depth1 = 0; depth1 < additionalVolumess.size(); depth1++) {
				putQueryParameter("AdditionalVolumes." + (depth1 + 1) + ".VolumeType" , additionalVolumess.get(depth1).getVolumeType());
				putQueryParameter("AdditionalVolumes." + (depth1 + 1) + ".VolumeProtocol" , additionalVolumess.get(depth1).getVolumeProtocol());
				putQueryParameter("AdditionalVolumes." + (depth1 + 1) + ".LocalDirectory" , additionalVolumess.get(depth1).getLocalDirectory());
				putQueryParameter("AdditionalVolumes." + (depth1 + 1) + ".RemoteDirectory" , additionalVolumess.get(depth1).getRemoteDirectory());
				if (additionalVolumess.get(depth1).getRoless() != null) {
					for (int depth2 = 0; depth2 < additionalVolumess.get(depth1).getRoless().size(); depth2++) {
						putQueryParameter("AdditionalVolumes." + (depth1 + 1) + ".Roles." + (depth2 + 1) + ".Name" , additionalVolumess.get(depth1).getRoless().get(depth2).getName());
					}
				}
				putQueryParameter("AdditionalVolumes." + (depth1 + 1) + ".VolumeId" , additionalVolumess.get(depth1).getVolumeId());
				putQueryParameter("AdditionalVolumes." + (depth1 + 1) + ".VolumeMountpoint" , additionalVolumess.get(depth1).getVolumeMountpoint());
				putQueryParameter("AdditionalVolumes." + (depth1 + 1) + ".Location" , additionalVolumess.get(depth1).getLocation());
				putQueryParameter("AdditionalVolumes." + (depth1 + 1) + ".JobQueue" , additionalVolumess.get(depth1).getJobQueue());
			}
		}	
	}

	public String getEcsOrderManagerInstanceType() {
		return this.ecsOrderManagerInstanceType;
	}

	public void setEcsOrderManagerInstanceType(String ecsOrderManagerInstanceType) {
		this.ecsOrderManagerInstanceType = ecsOrderManagerInstanceType;
		if(ecsOrderManagerInstanceType != null){
			putQueryParameter("EcsOrder.Manager.InstanceType", ecsOrderManagerInstanceType);
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

	public String getSecurityGroupName() {
		return this.securityGroupName;
	}

	public void setSecurityGroupName(String securityGroupName) {
		this.securityGroupName = securityGroupName;
		if(securityGroupName != null){
			putQueryParameter("SecurityGroupName", securityGroupName);
		}
	}

	public String getImageOwnerAlias() {
		return this.imageOwnerAlias;
	}

	public void setImageOwnerAlias(String imageOwnerAlias) {
		this.imageOwnerAlias = imageOwnerAlias;
		if(imageOwnerAlias != null){
			putQueryParameter("ImageOwnerAlias", imageOwnerAlias);
		}
	}

	public String getDeployMode() {
		return this.deployMode;
	}

	public void setDeployMode(String deployMode) {
		this.deployMode = deployMode;
		if(deployMode != null){
			putQueryParameter("DeployMode", deployMode);
		}
	}

	public Integer getEcsOrderManagerCount() {
		return this.ecsOrderManagerCount;
	}

	public void setEcsOrderManagerCount(Integer ecsOrderManagerCount) {
		this.ecsOrderManagerCount = ecsOrderManagerCount;
		if(ecsOrderManagerCount != null){
			putQueryParameter("EcsOrder.Manager.Count", ecsOrderManagerCount.toString());
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

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putQueryParameter("Password", password);
		}
	}

	public Integer getEcsOrderLoginCount() {
		return this.ecsOrderLoginCount;
	}

	public void setEcsOrderLoginCount(Integer ecsOrderLoginCount) {
		this.ecsOrderLoginCount = ecsOrderLoginCount;
		if(ecsOrderLoginCount != null){
			putQueryParameter("EcsOrder.Login.Count", ecsOrderLoginCount.toString());
		}
	}

	public String getRemoteVisEnable() {
		return this.remoteVisEnable;
	}

	public void setRemoteVisEnable(String remoteVisEnable) {
		this.remoteVisEnable = remoteVisEnable;
		if(remoteVisEnable != null){
			putQueryParameter("RemoteVisEnable", remoteVisEnable);
		}
	}

	public Integer getSystemDiskSize() {
		return this.systemDiskSize;
	}

	public void setSystemDiskSize(Integer systemDiskSize) {
		this.systemDiskSize = systemDiskSize;
		if(systemDiskSize != null){
			putQueryParameter("SystemDiskSize", systemDiskSize.toString());
		}
	}

	public String getComputeSpotPriceLimit() {
		return this.computeSpotPriceLimit;
	}

	public void setComputeSpotPriceLimit(String computeSpotPriceLimit) {
		this.computeSpotPriceLimit = computeSpotPriceLimit;
		if(computeSpotPriceLimit != null){
			putQueryParameter("ComputeSpotPriceLimit", computeSpotPriceLimit);
		}
	}

	public Integer getAutoRenewPeriod() {
		return this.autoRenewPeriod;
	}

	public void setAutoRenewPeriod(Integer autoRenewPeriod) {
		this.autoRenewPeriod = autoRenewPeriod;
		if(autoRenewPeriod != null){
			putQueryParameter("AutoRenewPeriod", autoRenewPeriod.toString());
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

	public String getRemoteDirectory() {
		return this.remoteDirectory;
	}

	public void setRemoteDirectory(String remoteDirectory) {
		this.remoteDirectory = remoteDirectory;
		if(remoteDirectory != null){
			putQueryParameter("RemoteDirectory", remoteDirectory);
		}
	}

	public Integer getEcsOrderComputeCount() {
		return this.ecsOrderComputeCount;
	}

	public void setEcsOrderComputeCount(Integer ecsOrderComputeCount) {
		this.ecsOrderComputeCount = ecsOrderComputeCount;
		if(ecsOrderComputeCount != null){
			putQueryParameter("EcsOrder.Compute.Count", ecsOrderComputeCount.toString());
		}
	}

	public String getComputeSpotStrategy() {
		return this.computeSpotStrategy;
	}

	public void setComputeSpotStrategy(String computeSpotStrategy) {
		this.computeSpotStrategy = computeSpotStrategy;
		if(computeSpotStrategy != null){
			putQueryParameter("ComputeSpotStrategy", computeSpotStrategy);
		}
	}

	public List<PostInstallScript> getPostInstallScripts() {
		return this.postInstallScripts;
	}

	public void setPostInstallScripts(List<PostInstallScript> postInstallScripts) {
		this.postInstallScripts = postInstallScripts;	
		if (postInstallScripts != null) {
			for (int depth1 = 0; depth1 < postInstallScripts.size(); depth1++) {
				putQueryParameter("PostInstallScript." + (depth1 + 1) + ".Args" , postInstallScripts.get(depth1).getArgs());
				putQueryParameter("PostInstallScript." + (depth1 + 1) + ".Url" , postInstallScripts.get(depth1).getUrl());
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

	public String getPeriodUnit() {
		return this.periodUnit;
	}

	public void setPeriodUnit(String periodUnit) {
		this.periodUnit = periodUnit;
		if(periodUnit != null){
			putQueryParameter("PeriodUnit", periodUnit);
		}
	}

	public Boolean getComputeEnableHt() {
		return this.computeEnableHt;
	}

	public void setComputeEnableHt(Boolean computeEnableHt) {
		this.computeEnableHt = computeEnableHt;
		if(computeEnableHt != null){
			putQueryParameter("ComputeEnableHt", computeEnableHt.toString());
		}
	}

	public String getAutoRenew() {
		return this.autoRenew;
	}

	public void setAutoRenew(String autoRenew) {
		this.autoRenew = autoRenew;
		if(autoRenew != null){
			putQueryParameter("AutoRenew", autoRenew);
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

	public String getVolumeId() {
		return this.volumeId;
	}

	public void setVolumeId(String volumeId) {
		this.volumeId = volumeId;
		if(volumeId != null){
			putQueryParameter("VolumeId", volumeId);
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

	public String getSccClusterId() {
		return this.sccClusterId;
	}

	public void setSccClusterId(String sccClusterId) {
		this.sccClusterId = sccClusterId;
		if(sccClusterId != null){
			putQueryParameter("SccClusterId", sccClusterId);
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

	public String getEhpcVersion() {
		return this.ehpcVersion;
	}

	public void setEhpcVersion(String ehpcVersion) {
		this.ehpcVersion = ehpcVersion;
		if(ehpcVersion != null){
			putQueryParameter("EhpcVersion", ehpcVersion);
		}
	}

	public String getAccountType() {
		return this.accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
		if(accountType != null){
			putQueryParameter("AccountType", accountType);
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getEcsOrderComputeInstanceType() {
		return this.ecsOrderComputeInstanceType;
	}

	public void setEcsOrderComputeInstanceType(String ecsOrderComputeInstanceType) {
		this.ecsOrderComputeInstanceType = ecsOrderComputeInstanceType;
		if(ecsOrderComputeInstanceType != null){
			putQueryParameter("EcsOrder.Compute.InstanceType", ecsOrderComputeInstanceType);
		}
	}

	public String getJobQueue() {
		return this.jobQueue;
	}

	public void setJobQueue(String jobQueue) {
		this.jobQueue = jobQueue;
		if(jobQueue != null){
			putQueryParameter("JobQueue", jobQueue);
		}
	}

	public String getVolumeType() {
		return this.volumeType;
	}

	public void setVolumeType(String volumeType) {
		this.volumeType = volumeType;
		if(volumeType != null){
			putQueryParameter("VolumeType", volumeType);
		}
	}

	public String getSystemDiskType() {
		return this.systemDiskType;
	}

	public void setSystemDiskType(String systemDiskType) {
		this.systemDiskType = systemDiskType;
		if(systemDiskType != null){
			putQueryParameter("SystemDiskType", systemDiskType);
		}
	}

	public String getVolumeProtocol() {
		return this.volumeProtocol;
	}

	public void setVolumeProtocol(String volumeProtocol) {
		this.volumeProtocol = volumeProtocol;
		if(volumeProtocol != null){
			putQueryParameter("VolumeProtocol", volumeProtocol);
		}
	}

	public String getClientVersion() {
		return this.clientVersion;
	}

	public void setClientVersion(String clientVersion) {
		this.clientVersion = clientVersion;
		if(clientVersion != null){
			putQueryParameter("ClientVersion", clientVersion);
		}
	}

	public String getOsTag() {
		return this.osTag;
	}

	public void setOsTag(String osTag) {
		this.osTag = osTag;
		if(osTag != null){
			putQueryParameter("OsTag", osTag);
		}
	}

	public List<Application> getApplications() {
		return this.applications;
	}

	public void setApplications(List<Application> applications) {
		this.applications = applications;	
		if (applications != null) {
			for (int depth1 = 0; depth1 < applications.size(); depth1++) {
				putQueryParameter("Application." + (depth1 + 1) + ".Tag" , applications.get(depth1).getTag());
			}
		}	
	}

	public String getEcsChargeType() {
		return this.ecsChargeType;
	}

	public void setEcsChargeType(String ecsChargeType) {
		this.ecsChargeType = ecsChargeType;
		if(ecsChargeType != null){
			putQueryParameter("EcsChargeType", ecsChargeType);
		}
	}

	public String getInputFileUrl() {
		return this.inputFileUrl;
	}

	public void setInputFileUrl(String inputFileUrl) {
		this.inputFileUrl = inputFileUrl;
		if(inputFileUrl != null){
			putQueryParameter("InputFileUrl", inputFileUrl);
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

	public Boolean getHaEnable() {
		return this.haEnable;
	}

	public void setHaEnable(Boolean haEnable) {
		this.haEnable = haEnable;
		if(haEnable != null){
			putQueryParameter("HaEnable", haEnable.toString());
		}
	}

	public String getSchedulerType() {
		return this.schedulerType;
	}

	public void setSchedulerType(String schedulerType) {
		this.schedulerType = schedulerType;
		if(schedulerType != null){
			putQueryParameter("SchedulerType", schedulerType);
		}
	}

	public String getVolumeMountpoint() {
		return this.volumeMountpoint;
	}

	public void setVolumeMountpoint(String volumeMountpoint) {
		this.volumeMountpoint = volumeMountpoint;
		if(volumeMountpoint != null){
			putQueryParameter("VolumeMountpoint", volumeMountpoint);
		}
	}

	public String getEcsOrderLoginInstanceType() {
		return this.ecsOrderLoginInstanceType;
	}

	public void setEcsOrderLoginInstanceType(String ecsOrderLoginInstanceType) {
		this.ecsOrderLoginInstanceType = ecsOrderLoginInstanceType;
		if(ecsOrderLoginInstanceType != null){
			putQueryParameter("EcsOrder.Login.InstanceType", ecsOrderLoginInstanceType);
		}
	}

	public static class AdditionalVolumes {

		private String volumeType;

		private String volumeProtocol;

		private String localDirectory;

		private String remoteDirectory;

		private List<Roles> roless;

		private String volumeId;

		private String volumeMountpoint;

		private String location;

		private String jobQueue;

		public String getVolumeType() {
			return this.volumeType;
		}

		public void setVolumeType(String volumeType) {
			this.volumeType = volumeType;
		}

		public String getVolumeProtocol() {
			return this.volumeProtocol;
		}

		public void setVolumeProtocol(String volumeProtocol) {
			this.volumeProtocol = volumeProtocol;
		}

		public String getLocalDirectory() {
			return this.localDirectory;
		}

		public void setLocalDirectory(String localDirectory) {
			this.localDirectory = localDirectory;
		}

		public String getRemoteDirectory() {
			return this.remoteDirectory;
		}

		public void setRemoteDirectory(String remoteDirectory) {
			this.remoteDirectory = remoteDirectory;
		}

		public List<Roles> getRoless() {
			return this.roless;
		}

		public void setRoless(List<Roles> roless) {
			this.roless = roless;
		}

		public String getVolumeId() {
			return this.volumeId;
		}

		public void setVolumeId(String volumeId) {
			this.volumeId = volumeId;
		}

		public String getVolumeMountpoint() {
			return this.volumeMountpoint;
		}

		public void setVolumeMountpoint(String volumeMountpoint) {
			this.volumeMountpoint = volumeMountpoint;
		}

		public String getLocation() {
			return this.location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getJobQueue() {
			return this.jobQueue;
		}

		public void setJobQueue(String jobQueue) {
			this.jobQueue = jobQueue;
		}

		public static class Roles {

			private String name;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}
	}

	public static class PostInstallScript {

		private String args;

		private String url;

		public String getArgs() {
			return this.args;
		}

		public void setArgs(String args) {
			this.args = args;
		}

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}
	}

	public static class Application {

		private String tag;

		public String getTag() {
			return this.tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}
	}

	@Override
	public Class<CreateClusterResponse> getResponseClass() {
		return CreateClusterResponse.class;
	}

}
