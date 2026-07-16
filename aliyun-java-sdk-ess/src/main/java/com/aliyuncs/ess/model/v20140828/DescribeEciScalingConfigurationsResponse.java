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

package com.aliyuncs.ess.model.v20140828;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ess.transform.v20140828.DescribeEciScalingConfigurationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEciScalingConfigurationsResponse extends AcsResponse {

	private Integer totalCount;

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private List<ScalingConfiguration> scalingConfigurations;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<ScalingConfiguration> getScalingConfigurations() {
		return this.scalingConfigurations;
	}

	public void setScalingConfigurations(List<ScalingConfiguration> scalingConfigurations) {
		this.scalingConfigurations = scalingConfigurations;
	}

	public static class ScalingConfiguration {

		private String scalingConfigurationName;

		private String resourceGroupId;

		private Float memory;

		private String dataCachePL;

		private Float cpu;

		private Long ingressBandwidth;

		private Integer dataCacheProvisionedIops;

		private String ramRoleName;

		private String hostName;

		private Integer activeDeadlineSeconds;

		private Integer loadBalancerWeight;

		private String scalingGroupId;

		private Boolean slsEnable;

		private Integer cpuOptionsCore;

		private Boolean autoCreateEip;

		private String gpuDriverVersion;

		private String dnsPolicy;

		private String creationTime;

		private String instanceFamilyLevel;

		private Integer ephemeralStorage;

		private String scalingConfigurationId;

		private String description;

		private String lifecycleState;

		private String containerGroupName;

		private String imageSnapshotId;

		private Long egressBandwidth;

		private Boolean autoMatchImageCache;

		private Integer ipv6AddressCount;

		private String dataCacheBucket;

		private Float spotPriceLimit;

		private String spotStrategy;

		private Integer cpuOptionsThreadsPerCore;

		private Boolean dataCacheBurstingEnabled;

		private Integer terminationGracePeriodSeconds;

		private String securityGroupId;

		private String restartPolicy;

		private Boolean costOptimization;

		private Integer eipBandwidth;

		private String regionId;

		private List<Volume> volumes;

		private List<DnsConfigOption> dnsConfigOptions;

		private List<Tag> tags;

		private List<HostAlias> hostAliases;

		private List<ImageRegistryCredential> imageRegistryCredentials;

		private List<Container> containers;

		private List<AcrRegistryInfo> acrRegistryInfos;

		private List<InitContainer> initContainers;

		private List<SecurityContextSysCtl> securityContextSysCtls;

		private List<String> ntpServers;

		private List<String> dnsConfigSearches;

		private List<String> dnsConfigNameServers;

		private List<String> instanceTypes;

		public String getScalingConfigurationName() {
			return this.scalingConfigurationName;
		}

		public void setScalingConfigurationName(String scalingConfigurationName) {
			this.scalingConfigurationName = scalingConfigurationName;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public Float getMemory() {
			return this.memory;
		}

		public void setMemory(Float memory) {
			this.memory = memory;
		}

		public String getDataCachePL() {
			return this.dataCachePL;
		}

		public void setDataCachePL(String dataCachePL) {
			this.dataCachePL = dataCachePL;
		}

		public Float getCpu() {
			return this.cpu;
		}

		public void setCpu(Float cpu) {
			this.cpu = cpu;
		}

		public Long getIngressBandwidth() {
			return this.ingressBandwidth;
		}

		public void setIngressBandwidth(Long ingressBandwidth) {
			this.ingressBandwidth = ingressBandwidth;
		}

		public Integer getDataCacheProvisionedIops() {
			return this.dataCacheProvisionedIops;
		}

		public void setDataCacheProvisionedIops(Integer dataCacheProvisionedIops) {
			this.dataCacheProvisionedIops = dataCacheProvisionedIops;
		}

		public String getRamRoleName() {
			return this.ramRoleName;
		}

		public void setRamRoleName(String ramRoleName) {
			this.ramRoleName = ramRoleName;
		}

		public String getHostName() {
			return this.hostName;
		}

		public void setHostName(String hostName) {
			this.hostName = hostName;
		}

		public Integer getActiveDeadlineSeconds() {
			return this.activeDeadlineSeconds;
		}

		public void setActiveDeadlineSeconds(Integer activeDeadlineSeconds) {
			this.activeDeadlineSeconds = activeDeadlineSeconds;
		}

		public Integer getLoadBalancerWeight() {
			return this.loadBalancerWeight;
		}

		public void setLoadBalancerWeight(Integer loadBalancerWeight) {
			this.loadBalancerWeight = loadBalancerWeight;
		}

		public String getScalingGroupId() {
			return this.scalingGroupId;
		}

		public void setScalingGroupId(String scalingGroupId) {
			this.scalingGroupId = scalingGroupId;
		}

		public Boolean getSlsEnable() {
			return this.slsEnable;
		}

		public void setSlsEnable(Boolean slsEnable) {
			this.slsEnable = slsEnable;
		}

		public Integer getCpuOptionsCore() {
			return this.cpuOptionsCore;
		}

		public void setCpuOptionsCore(Integer cpuOptionsCore) {
			this.cpuOptionsCore = cpuOptionsCore;
		}

		public Boolean getAutoCreateEip() {
			return this.autoCreateEip;
		}

		public void setAutoCreateEip(Boolean autoCreateEip) {
			this.autoCreateEip = autoCreateEip;
		}

		public String getGpuDriverVersion() {
			return this.gpuDriverVersion;
		}

		public void setGpuDriverVersion(String gpuDriverVersion) {
			this.gpuDriverVersion = gpuDriverVersion;
		}

		public String getDnsPolicy() {
			return this.dnsPolicy;
		}

		public void setDnsPolicy(String dnsPolicy) {
			this.dnsPolicy = dnsPolicy;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getInstanceFamilyLevel() {
			return this.instanceFamilyLevel;
		}

		public void setInstanceFamilyLevel(String instanceFamilyLevel) {
			this.instanceFamilyLevel = instanceFamilyLevel;
		}

		public Integer getEphemeralStorage() {
			return this.ephemeralStorage;
		}

		public void setEphemeralStorage(Integer ephemeralStorage) {
			this.ephemeralStorage = ephemeralStorage;
		}

		public String getScalingConfigurationId() {
			return this.scalingConfigurationId;
		}

		public void setScalingConfigurationId(String scalingConfigurationId) {
			this.scalingConfigurationId = scalingConfigurationId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getLifecycleState() {
			return this.lifecycleState;
		}

		public void setLifecycleState(String lifecycleState) {
			this.lifecycleState = lifecycleState;
		}

		public String getContainerGroupName() {
			return this.containerGroupName;
		}

		public void setContainerGroupName(String containerGroupName) {
			this.containerGroupName = containerGroupName;
		}

		public String getImageSnapshotId() {
			return this.imageSnapshotId;
		}

		public void setImageSnapshotId(String imageSnapshotId) {
			this.imageSnapshotId = imageSnapshotId;
		}

		public Long getEgressBandwidth() {
			return this.egressBandwidth;
		}

		public void setEgressBandwidth(Long egressBandwidth) {
			this.egressBandwidth = egressBandwidth;
		}

		public Boolean getAutoMatchImageCache() {
			return this.autoMatchImageCache;
		}

		public void setAutoMatchImageCache(Boolean autoMatchImageCache) {
			this.autoMatchImageCache = autoMatchImageCache;
		}

		public Integer getIpv6AddressCount() {
			return this.ipv6AddressCount;
		}

		public void setIpv6AddressCount(Integer ipv6AddressCount) {
			this.ipv6AddressCount = ipv6AddressCount;
		}

		public String getDataCacheBucket() {
			return this.dataCacheBucket;
		}

		public void setDataCacheBucket(String dataCacheBucket) {
			this.dataCacheBucket = dataCacheBucket;
		}

		public Float getSpotPriceLimit() {
			return this.spotPriceLimit;
		}

		public void setSpotPriceLimit(Float spotPriceLimit) {
			this.spotPriceLimit = spotPriceLimit;
		}

		public String getSpotStrategy() {
			return this.spotStrategy;
		}

		public void setSpotStrategy(String spotStrategy) {
			this.spotStrategy = spotStrategy;
		}

		public Integer getCpuOptionsThreadsPerCore() {
			return this.cpuOptionsThreadsPerCore;
		}

		public void setCpuOptionsThreadsPerCore(Integer cpuOptionsThreadsPerCore) {
			this.cpuOptionsThreadsPerCore = cpuOptionsThreadsPerCore;
		}

		public Boolean getDataCacheBurstingEnabled() {
			return this.dataCacheBurstingEnabled;
		}

		public void setDataCacheBurstingEnabled(Boolean dataCacheBurstingEnabled) {
			this.dataCacheBurstingEnabled = dataCacheBurstingEnabled;
		}

		public Integer getTerminationGracePeriodSeconds() {
			return this.terminationGracePeriodSeconds;
		}

		public void setTerminationGracePeriodSeconds(Integer terminationGracePeriodSeconds) {
			this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
		}

		public String getSecurityGroupId() {
			return this.securityGroupId;
		}

		public void setSecurityGroupId(String securityGroupId) {
			this.securityGroupId = securityGroupId;
		}

		public String getRestartPolicy() {
			return this.restartPolicy;
		}

		public void setRestartPolicy(String restartPolicy) {
			this.restartPolicy = restartPolicy;
		}

		public Boolean getCostOptimization() {
			return this.costOptimization;
		}

		public void setCostOptimization(Boolean costOptimization) {
			this.costOptimization = costOptimization;
		}

		public Integer getEipBandwidth() {
			return this.eipBandwidth;
		}

		public void setEipBandwidth(Integer eipBandwidth) {
			this.eipBandwidth = eipBandwidth;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public List<Volume> getVolumes() {
			return this.volumes;
		}

		public void setVolumes(List<Volume> volumes) {
			this.volumes = volumes;
		}

		public List<DnsConfigOption> getDnsConfigOptions() {
			return this.dnsConfigOptions;
		}

		public void setDnsConfigOptions(List<DnsConfigOption> dnsConfigOptions) {
			this.dnsConfigOptions = dnsConfigOptions;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<HostAlias> getHostAliases() {
			return this.hostAliases;
		}

		public void setHostAliases(List<HostAlias> hostAliases) {
			this.hostAliases = hostAliases;
		}

		public List<ImageRegistryCredential> getImageRegistryCredentials() {
			return this.imageRegistryCredentials;
		}

		public void setImageRegistryCredentials(List<ImageRegistryCredential> imageRegistryCredentials) {
			this.imageRegistryCredentials = imageRegistryCredentials;
		}

		public List<Container> getContainers() {
			return this.containers;
		}

		public void setContainers(List<Container> containers) {
			this.containers = containers;
		}

		public List<AcrRegistryInfo> getAcrRegistryInfos() {
			return this.acrRegistryInfos;
		}

		public void setAcrRegistryInfos(List<AcrRegistryInfo> acrRegistryInfos) {
			this.acrRegistryInfos = acrRegistryInfos;
		}

		public List<InitContainer> getInitContainers() {
			return this.initContainers;
		}

		public void setInitContainers(List<InitContainer> initContainers) {
			this.initContainers = initContainers;
		}

		public List<SecurityContextSysCtl> getSecurityContextSysCtls() {
			return this.securityContextSysCtls;
		}

		public void setSecurityContextSysCtls(List<SecurityContextSysCtl> securityContextSysCtls) {
			this.securityContextSysCtls = securityContextSysCtls;
		}

		public List<String> getNtpServers() {
			return this.ntpServers;
		}

		public void setNtpServers(List<String> ntpServers) {
			this.ntpServers = ntpServers;
		}

		public List<String> getDnsConfigSearches() {
			return this.dnsConfigSearches;
		}

		public void setDnsConfigSearches(List<String> dnsConfigSearches) {
			this.dnsConfigSearches = dnsConfigSearches;
		}

		public List<String> getDnsConfigNameServers() {
			return this.dnsConfigNameServers;
		}

		public void setDnsConfigNameServers(List<String> dnsConfigNameServers) {
			this.dnsConfigNameServers = dnsConfigNameServers;
		}

		public List<String> getInstanceTypes() {
			return this.instanceTypes;
		}

		public void setInstanceTypes(List<String> instanceTypes) {
			this.instanceTypes = instanceTypes;
		}

		public static class Volume {

			private String hostPathVolumeType;

			private String flexVolumeFsType;

			private String emptyDirVolumeSizeLimit;

			private String nFSVolumeServer;

			private Integer diskVolumeDiskSize;

			private Boolean nFSVolumeReadOnly;

			private String name;

			private String hostPathVolumePath;

			private String nFSVolumePath;

			private String type;

			private String flexVolumeDriver;

			private String diskVolumeDiskId;

			private Integer configFileVolumeDefaultMode;

			private String flexVolumeOptions;

			private String emptyDirVolumeMedium;

			private String diskVolumeFsType;

			private List<ConfigFileVolumeConfigFileToPath> configFileVolumeConfigFileToPaths;

			public String getHostPathVolumeType() {
				return this.hostPathVolumeType;
			}

			public void setHostPathVolumeType(String hostPathVolumeType) {
				this.hostPathVolumeType = hostPathVolumeType;
			}

			public String getFlexVolumeFsType() {
				return this.flexVolumeFsType;
			}

			public void setFlexVolumeFsType(String flexVolumeFsType) {
				this.flexVolumeFsType = flexVolumeFsType;
			}

			public String getEmptyDirVolumeSizeLimit() {
				return this.emptyDirVolumeSizeLimit;
			}

			public void setEmptyDirVolumeSizeLimit(String emptyDirVolumeSizeLimit) {
				this.emptyDirVolumeSizeLimit = emptyDirVolumeSizeLimit;
			}

			public String getNFSVolumeServer() {
				return this.nFSVolumeServer;
			}

			public void setNFSVolumeServer(String nFSVolumeServer) {
				this.nFSVolumeServer = nFSVolumeServer;
			}

			public Integer getDiskVolumeDiskSize() {
				return this.diskVolumeDiskSize;
			}

			public void setDiskVolumeDiskSize(Integer diskVolumeDiskSize) {
				this.diskVolumeDiskSize = diskVolumeDiskSize;
			}

			public Boolean getNFSVolumeReadOnly() {
				return this.nFSVolumeReadOnly;
			}

			public void setNFSVolumeReadOnly(Boolean nFSVolumeReadOnly) {
				this.nFSVolumeReadOnly = nFSVolumeReadOnly;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getHostPathVolumePath() {
				return this.hostPathVolumePath;
			}

			public void setHostPathVolumePath(String hostPathVolumePath) {
				this.hostPathVolumePath = hostPathVolumePath;
			}

			public String getNFSVolumePath() {
				return this.nFSVolumePath;
			}

			public void setNFSVolumePath(String nFSVolumePath) {
				this.nFSVolumePath = nFSVolumePath;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getFlexVolumeDriver() {
				return this.flexVolumeDriver;
			}

			public void setFlexVolumeDriver(String flexVolumeDriver) {
				this.flexVolumeDriver = flexVolumeDriver;
			}

			public String getDiskVolumeDiskId() {
				return this.diskVolumeDiskId;
			}

			public void setDiskVolumeDiskId(String diskVolumeDiskId) {
				this.diskVolumeDiskId = diskVolumeDiskId;
			}

			public Integer getConfigFileVolumeDefaultMode() {
				return this.configFileVolumeDefaultMode;
			}

			public void setConfigFileVolumeDefaultMode(Integer configFileVolumeDefaultMode) {
				this.configFileVolumeDefaultMode = configFileVolumeDefaultMode;
			}

			public String getFlexVolumeOptions() {
				return this.flexVolumeOptions;
			}

			public void setFlexVolumeOptions(String flexVolumeOptions) {
				this.flexVolumeOptions = flexVolumeOptions;
			}

			public String getEmptyDirVolumeMedium() {
				return this.emptyDirVolumeMedium;
			}

			public void setEmptyDirVolumeMedium(String emptyDirVolumeMedium) {
				this.emptyDirVolumeMedium = emptyDirVolumeMedium;
			}

			public String getDiskVolumeFsType() {
				return this.diskVolumeFsType;
			}

			public void setDiskVolumeFsType(String diskVolumeFsType) {
				this.diskVolumeFsType = diskVolumeFsType;
			}

			public List<ConfigFileVolumeConfigFileToPath> getConfigFileVolumeConfigFileToPaths() {
				return this.configFileVolumeConfigFileToPaths;
			}

			public void setConfigFileVolumeConfigFileToPaths(List<ConfigFileVolumeConfigFileToPath> configFileVolumeConfigFileToPaths) {
				this.configFileVolumeConfigFileToPaths = configFileVolumeConfigFileToPaths;
			}

			public static class ConfigFileVolumeConfigFileToPath {

				private String path;

				private String content;

				private Integer mode;

				public String getPath() {
					return this.path;
				}

				public void setPath(String path) {
					this.path = path;
				}

				public String getContent() {
					return this.content;
				}

				public void setContent(String content) {
					this.content = content;
				}

				public Integer getMode() {
					return this.mode;
				}

				public void setMode(Integer mode) {
					this.mode = mode;
				}
			}
		}

		public static class DnsConfigOption {

			private String value;

			private String name;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
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

		public static class HostAlias {

			private String ip;

			private List<String> hostnames;

			public String getIp() {
				return this.ip;
			}

			public void setIp(String ip) {
				this.ip = ip;
			}

			public List<String> getHostnames() {
				return this.hostnames;
			}

			public void setHostnames(List<String> hostnames) {
				this.hostnames = hostnames;
			}
		}

		public static class ImageRegistryCredential {

			private String userName;

			private String server;

			private String password;

			public String getUserName() {
				return this.userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
			}

			public String getServer() {
				return this.server;
			}

			public void setServer(String server) {
				this.server = server;
			}

			public String getPassword() {
				return this.password;
			}

			public void setPassword(String password) {
				this.password = password;
			}
		}

		public static class Container {

			private Float memory;

			private Integer readinessProbeTcpSocketPort;

			private String readinessProbeHttpGetPath;

			private Float cpu;

			private String image;

			private String readinessProbeHttpGetScheme;

			private Integer gpu;

			private Boolean stdinOnce;

			private String lifecyclePreStopHandlerTcpSocketHost;

			private String name;

			private String lifecyclePostStartHandlerHttpGetHost;

			private Boolean securityContextReadOnlyRootFilesystem;

			private String lifecyclePostStartHandlerHttpGetPath;

			private Integer livenessProbePeriodSeconds;

			private Integer readinessProbeSuccessThreshold;

			private Integer readinessProbeInitialDelaySeconds;

			private String lifecyclePreStopHandlerHttpGetScheme;

			private Integer lifecyclePreStopHandlerHttpGetPort;

			private Boolean stdin;

			private String workingDir;

			private String lifecyclePostStartHandlerHttpGetScheme;

			private Integer readinessProbeTimeoutSeconds;

			private String lifecyclePreStopHandlerHttpGetHost;

			private Integer lifecyclePostStartHandlerHttpGetPort;

			private String lifecyclePreStopHandlerHttpGetPath;

			private String livenessProbeHttpGetScheme;

			private Integer livenessProbeTimeoutSeconds;

			private Integer livenessProbeFailureThreshold;

			private String livenessProbeHttpGetPath;

			private Integer livenessProbeInitialDelaySeconds;

			private Integer livenessProbeTcpSocketPort;

			private Boolean tty;

			private Long securityContextRunAsUser;

			private Integer readinessProbePeriodSeconds;

			private Integer livenessProbeSuccessThreshold;

			private String lifecyclePostStartHandlerTcpSocketHost;

			private Integer lifecyclePreStopHandlerTcpSocketPort;

			private Integer readinessProbeFailureThreshold;

			private Integer readinessProbeHttpGetPort;

			private String imagePullPolicy;

			private Integer livenessProbeHttpGetPort;

			private Integer lifecyclePostStartHandlerTcpSocketPort;

			private List<EnvironmentVar> environmentVars;

			private List<VolumeMount> volumeMounts;

			private List<Port> ports;

			private List<String> readinessProbeExecCommands;

			private List<String> livenessProbeExecCommands;

			private List<String> securityContextCapabilityAdds;

			private List<String> lifecyclePostStartHandlerExecs;

			private List<String> commands;

			private List<String> lifecyclePreStopHandlerExecs;

			private List<String> args;

			public Float getMemory() {
				return this.memory;
			}

			public void setMemory(Float memory) {
				this.memory = memory;
			}

			public Integer getReadinessProbeTcpSocketPort() {
				return this.readinessProbeTcpSocketPort;
			}

			public void setReadinessProbeTcpSocketPort(Integer readinessProbeTcpSocketPort) {
				this.readinessProbeTcpSocketPort = readinessProbeTcpSocketPort;
			}

			public String getReadinessProbeHttpGetPath() {
				return this.readinessProbeHttpGetPath;
			}

			public void setReadinessProbeHttpGetPath(String readinessProbeHttpGetPath) {
				this.readinessProbeHttpGetPath = readinessProbeHttpGetPath;
			}

			public Float getCpu() {
				return this.cpu;
			}

			public void setCpu(Float cpu) {
				this.cpu = cpu;
			}

			public String getImage() {
				return this.image;
			}

			public void setImage(String image) {
				this.image = image;
			}

			public String getReadinessProbeHttpGetScheme() {
				return this.readinessProbeHttpGetScheme;
			}

			public void setReadinessProbeHttpGetScheme(String readinessProbeHttpGetScheme) {
				this.readinessProbeHttpGetScheme = readinessProbeHttpGetScheme;
			}

			public Integer getGpu() {
				return this.gpu;
			}

			public void setGpu(Integer gpu) {
				this.gpu = gpu;
			}

			public Boolean getStdinOnce() {
				return this.stdinOnce;
			}

			public void setStdinOnce(Boolean stdinOnce) {
				this.stdinOnce = stdinOnce;
			}

			public String getLifecyclePreStopHandlerTcpSocketHost() {
				return this.lifecyclePreStopHandlerTcpSocketHost;
			}

			public void setLifecyclePreStopHandlerTcpSocketHost(String lifecyclePreStopHandlerTcpSocketHost) {
				this.lifecyclePreStopHandlerTcpSocketHost = lifecyclePreStopHandlerTcpSocketHost;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getLifecyclePostStartHandlerHttpGetHost() {
				return this.lifecyclePostStartHandlerHttpGetHost;
			}

			public void setLifecyclePostStartHandlerHttpGetHost(String lifecyclePostStartHandlerHttpGetHost) {
				this.lifecyclePostStartHandlerHttpGetHost = lifecyclePostStartHandlerHttpGetHost;
			}

			public Boolean getSecurityContextReadOnlyRootFilesystem() {
				return this.securityContextReadOnlyRootFilesystem;
			}

			public void setSecurityContextReadOnlyRootFilesystem(Boolean securityContextReadOnlyRootFilesystem) {
				this.securityContextReadOnlyRootFilesystem = securityContextReadOnlyRootFilesystem;
			}

			public String getLifecyclePostStartHandlerHttpGetPath() {
				return this.lifecyclePostStartHandlerHttpGetPath;
			}

			public void setLifecyclePostStartHandlerHttpGetPath(String lifecyclePostStartHandlerHttpGetPath) {
				this.lifecyclePostStartHandlerHttpGetPath = lifecyclePostStartHandlerHttpGetPath;
			}

			public Integer getLivenessProbePeriodSeconds() {
				return this.livenessProbePeriodSeconds;
			}

			public void setLivenessProbePeriodSeconds(Integer livenessProbePeriodSeconds) {
				this.livenessProbePeriodSeconds = livenessProbePeriodSeconds;
			}

			public Integer getReadinessProbeSuccessThreshold() {
				return this.readinessProbeSuccessThreshold;
			}

			public void setReadinessProbeSuccessThreshold(Integer readinessProbeSuccessThreshold) {
				this.readinessProbeSuccessThreshold = readinessProbeSuccessThreshold;
			}

			public Integer getReadinessProbeInitialDelaySeconds() {
				return this.readinessProbeInitialDelaySeconds;
			}

			public void setReadinessProbeInitialDelaySeconds(Integer readinessProbeInitialDelaySeconds) {
				this.readinessProbeInitialDelaySeconds = readinessProbeInitialDelaySeconds;
			}

			public String getLifecyclePreStopHandlerHttpGetScheme() {
				return this.lifecyclePreStopHandlerHttpGetScheme;
			}

			public void setLifecyclePreStopHandlerHttpGetScheme(String lifecyclePreStopHandlerHttpGetScheme) {
				this.lifecyclePreStopHandlerHttpGetScheme = lifecyclePreStopHandlerHttpGetScheme;
			}

			public Integer getLifecyclePreStopHandlerHttpGetPort() {
				return this.lifecyclePreStopHandlerHttpGetPort;
			}

			public void setLifecyclePreStopHandlerHttpGetPort(Integer lifecyclePreStopHandlerHttpGetPort) {
				this.lifecyclePreStopHandlerHttpGetPort = lifecyclePreStopHandlerHttpGetPort;
			}

			public Boolean getStdin() {
				return this.stdin;
			}

			public void setStdin(Boolean stdin) {
				this.stdin = stdin;
			}

			public String getWorkingDir() {
				return this.workingDir;
			}

			public void setWorkingDir(String workingDir) {
				this.workingDir = workingDir;
			}

			public String getLifecyclePostStartHandlerHttpGetScheme() {
				return this.lifecyclePostStartHandlerHttpGetScheme;
			}

			public void setLifecyclePostStartHandlerHttpGetScheme(String lifecyclePostStartHandlerHttpGetScheme) {
				this.lifecyclePostStartHandlerHttpGetScheme = lifecyclePostStartHandlerHttpGetScheme;
			}

			public Integer getReadinessProbeTimeoutSeconds() {
				return this.readinessProbeTimeoutSeconds;
			}

			public void setReadinessProbeTimeoutSeconds(Integer readinessProbeTimeoutSeconds) {
				this.readinessProbeTimeoutSeconds = readinessProbeTimeoutSeconds;
			}

			public String getLifecyclePreStopHandlerHttpGetHost() {
				return this.lifecyclePreStopHandlerHttpGetHost;
			}

			public void setLifecyclePreStopHandlerHttpGetHost(String lifecyclePreStopHandlerHttpGetHost) {
				this.lifecyclePreStopHandlerHttpGetHost = lifecyclePreStopHandlerHttpGetHost;
			}

			public Integer getLifecyclePostStartHandlerHttpGetPort() {
				return this.lifecyclePostStartHandlerHttpGetPort;
			}

			public void setLifecyclePostStartHandlerHttpGetPort(Integer lifecyclePostStartHandlerHttpGetPort) {
				this.lifecyclePostStartHandlerHttpGetPort = lifecyclePostStartHandlerHttpGetPort;
			}

			public String getLifecyclePreStopHandlerHttpGetPath() {
				return this.lifecyclePreStopHandlerHttpGetPath;
			}

			public void setLifecyclePreStopHandlerHttpGetPath(String lifecyclePreStopHandlerHttpGetPath) {
				this.lifecyclePreStopHandlerHttpGetPath = lifecyclePreStopHandlerHttpGetPath;
			}

			public String getLivenessProbeHttpGetScheme() {
				return this.livenessProbeHttpGetScheme;
			}

			public void setLivenessProbeHttpGetScheme(String livenessProbeHttpGetScheme) {
				this.livenessProbeHttpGetScheme = livenessProbeHttpGetScheme;
			}

			public Integer getLivenessProbeTimeoutSeconds() {
				return this.livenessProbeTimeoutSeconds;
			}

			public void setLivenessProbeTimeoutSeconds(Integer livenessProbeTimeoutSeconds) {
				this.livenessProbeTimeoutSeconds = livenessProbeTimeoutSeconds;
			}

			public Integer getLivenessProbeFailureThreshold() {
				return this.livenessProbeFailureThreshold;
			}

			public void setLivenessProbeFailureThreshold(Integer livenessProbeFailureThreshold) {
				this.livenessProbeFailureThreshold = livenessProbeFailureThreshold;
			}

			public String getLivenessProbeHttpGetPath() {
				return this.livenessProbeHttpGetPath;
			}

			public void setLivenessProbeHttpGetPath(String livenessProbeHttpGetPath) {
				this.livenessProbeHttpGetPath = livenessProbeHttpGetPath;
			}

			public Integer getLivenessProbeInitialDelaySeconds() {
				return this.livenessProbeInitialDelaySeconds;
			}

			public void setLivenessProbeInitialDelaySeconds(Integer livenessProbeInitialDelaySeconds) {
				this.livenessProbeInitialDelaySeconds = livenessProbeInitialDelaySeconds;
			}

			public Integer getLivenessProbeTcpSocketPort() {
				return this.livenessProbeTcpSocketPort;
			}

			public void setLivenessProbeTcpSocketPort(Integer livenessProbeTcpSocketPort) {
				this.livenessProbeTcpSocketPort = livenessProbeTcpSocketPort;
			}

			public Boolean getTty() {
				return this.tty;
			}

			public void setTty(Boolean tty) {
				this.tty = tty;
			}

			public Long getSecurityContextRunAsUser() {
				return this.securityContextRunAsUser;
			}

			public void setSecurityContextRunAsUser(Long securityContextRunAsUser) {
				this.securityContextRunAsUser = securityContextRunAsUser;
			}

			public Integer getReadinessProbePeriodSeconds() {
				return this.readinessProbePeriodSeconds;
			}

			public void setReadinessProbePeriodSeconds(Integer readinessProbePeriodSeconds) {
				this.readinessProbePeriodSeconds = readinessProbePeriodSeconds;
			}

			public Integer getLivenessProbeSuccessThreshold() {
				return this.livenessProbeSuccessThreshold;
			}

			public void setLivenessProbeSuccessThreshold(Integer livenessProbeSuccessThreshold) {
				this.livenessProbeSuccessThreshold = livenessProbeSuccessThreshold;
			}

			public String getLifecyclePostStartHandlerTcpSocketHost() {
				return this.lifecyclePostStartHandlerTcpSocketHost;
			}

			public void setLifecyclePostStartHandlerTcpSocketHost(String lifecyclePostStartHandlerTcpSocketHost) {
				this.lifecyclePostStartHandlerTcpSocketHost = lifecyclePostStartHandlerTcpSocketHost;
			}

			public Integer getLifecyclePreStopHandlerTcpSocketPort() {
				return this.lifecyclePreStopHandlerTcpSocketPort;
			}

			public void setLifecyclePreStopHandlerTcpSocketPort(Integer lifecyclePreStopHandlerTcpSocketPort) {
				this.lifecyclePreStopHandlerTcpSocketPort = lifecyclePreStopHandlerTcpSocketPort;
			}

			public Integer getReadinessProbeFailureThreshold() {
				return this.readinessProbeFailureThreshold;
			}

			public void setReadinessProbeFailureThreshold(Integer readinessProbeFailureThreshold) {
				this.readinessProbeFailureThreshold = readinessProbeFailureThreshold;
			}

			public Integer getReadinessProbeHttpGetPort() {
				return this.readinessProbeHttpGetPort;
			}

			public void setReadinessProbeHttpGetPort(Integer readinessProbeHttpGetPort) {
				this.readinessProbeHttpGetPort = readinessProbeHttpGetPort;
			}

			public String getImagePullPolicy() {
				return this.imagePullPolicy;
			}

			public void setImagePullPolicy(String imagePullPolicy) {
				this.imagePullPolicy = imagePullPolicy;
			}

			public Integer getLivenessProbeHttpGetPort() {
				return this.livenessProbeHttpGetPort;
			}

			public void setLivenessProbeHttpGetPort(Integer livenessProbeHttpGetPort) {
				this.livenessProbeHttpGetPort = livenessProbeHttpGetPort;
			}

			public Integer getLifecyclePostStartHandlerTcpSocketPort() {
				return this.lifecyclePostStartHandlerTcpSocketPort;
			}

			public void setLifecyclePostStartHandlerTcpSocketPort(Integer lifecyclePostStartHandlerTcpSocketPort) {
				this.lifecyclePostStartHandlerTcpSocketPort = lifecyclePostStartHandlerTcpSocketPort;
			}

			public List<EnvironmentVar> getEnvironmentVars() {
				return this.environmentVars;
			}

			public void setEnvironmentVars(List<EnvironmentVar> environmentVars) {
				this.environmentVars = environmentVars;
			}

			public List<VolumeMount> getVolumeMounts() {
				return this.volumeMounts;
			}

			public void setVolumeMounts(List<VolumeMount> volumeMounts) {
				this.volumeMounts = volumeMounts;
			}

			public List<Port> getPorts() {
				return this.ports;
			}

			public void setPorts(List<Port> ports) {
				this.ports = ports;
			}

			public List<String> getReadinessProbeExecCommands() {
				return this.readinessProbeExecCommands;
			}

			public void setReadinessProbeExecCommands(List<String> readinessProbeExecCommands) {
				this.readinessProbeExecCommands = readinessProbeExecCommands;
			}

			public List<String> getLivenessProbeExecCommands() {
				return this.livenessProbeExecCommands;
			}

			public void setLivenessProbeExecCommands(List<String> livenessProbeExecCommands) {
				this.livenessProbeExecCommands = livenessProbeExecCommands;
			}

			public List<String> getSecurityContextCapabilityAdds() {
				return this.securityContextCapabilityAdds;
			}

			public void setSecurityContextCapabilityAdds(List<String> securityContextCapabilityAdds) {
				this.securityContextCapabilityAdds = securityContextCapabilityAdds;
			}

			public List<String> getLifecyclePostStartHandlerExecs() {
				return this.lifecyclePostStartHandlerExecs;
			}

			public void setLifecyclePostStartHandlerExecs(List<String> lifecyclePostStartHandlerExecs) {
				this.lifecyclePostStartHandlerExecs = lifecyclePostStartHandlerExecs;
			}

			public List<String> getCommands() {
				return this.commands;
			}

			public void setCommands(List<String> commands) {
				this.commands = commands;
			}

			public List<String> getLifecyclePreStopHandlerExecs() {
				return this.lifecyclePreStopHandlerExecs;
			}

			public void setLifecyclePreStopHandlerExecs(List<String> lifecyclePreStopHandlerExecs) {
				this.lifecyclePreStopHandlerExecs = lifecyclePreStopHandlerExecs;
			}

			public List<String> getArgs() {
				return this.args;
			}

			public void setArgs(List<String> args) {
				this.args = args;
			}

			public static class EnvironmentVar {

				private String fieldRefFieldPath;

				private String value;

				private String key;

				public String getFieldRefFieldPath() {
					return this.fieldRefFieldPath;
				}

				public void setFieldRefFieldPath(String fieldRefFieldPath) {
					this.fieldRefFieldPath = fieldRefFieldPath;
				}

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

			public static class VolumeMount {

				private Boolean readOnly;

				private String mountPath;

				private String subPath;

				private String mountPropagation;

				private String name;

				public Boolean getReadOnly() {
					return this.readOnly;
				}

				public void setReadOnly(Boolean readOnly) {
					this.readOnly = readOnly;
				}

				public String getMountPath() {
					return this.mountPath;
				}

				public void setMountPath(String mountPath) {
					this.mountPath = mountPath;
				}

				public String getSubPath() {
					return this.subPath;
				}

				public void setSubPath(String subPath) {
					this.subPath = subPath;
				}

				public String getMountPropagation() {
					return this.mountPropagation;
				}

				public void setMountPropagation(String mountPropagation) {
					this.mountPropagation = mountPropagation;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}

			public static class Port {

				private Integer port;

				private String protocol;

				public Integer getPort() {
					return this.port;
				}

				public void setPort(Integer port) {
					this.port = port;
				}

				public String getBizProtocol() {
					return this.protocol;
				}

				public void setBizProtocol(String protocol) {
					this.protocol = protocol;
				}
			}
		}

		public static class AcrRegistryInfo {

			private String instanceName;

			private String instanceId;

			private String regionId;

			private List<String> domains;

			public String getInstanceName() {
				return this.instanceName;
			}

			public void setInstanceName(String instanceName) {
				this.instanceName = instanceName;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public List<String> getDomains() {
				return this.domains;
			}

			public void setDomains(List<String> domains) {
				this.domains = domains;
			}
		}

		public static class InitContainer {

			private Float memory;

			private Float cpu;

			private String image;

			private Integer gpu;

			private String name;

			private String workingDir;

			private String imagePullPolicy;

			private Boolean securityContextReadOnlyRootFilesystem;

			private String securityContextRunAsUser;

			private List<InitContainerPort> initContainerPorts;

			private List<InitContainerEnvironmentVar> initContainerEnvironmentVars;

			private List<InitContainerVolumeMount> initContainerVolumeMounts;

			private List<String> initContainerArgs;

			private List<String> securityContextCapabilityAdds1;

			private List<String> initContainerCommands;

			public Float getMemory() {
				return this.memory;
			}

			public void setMemory(Float memory) {
				this.memory = memory;
			}

			public Float getCpu() {
				return this.cpu;
			}

			public void setCpu(Float cpu) {
				this.cpu = cpu;
			}

			public String getImage() {
				return this.image;
			}

			public void setImage(String image) {
				this.image = image;
			}

			public Integer getGpu() {
				return this.gpu;
			}

			public void setGpu(Integer gpu) {
				this.gpu = gpu;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getWorkingDir() {
				return this.workingDir;
			}

			public void setWorkingDir(String workingDir) {
				this.workingDir = workingDir;
			}

			public String getImagePullPolicy() {
				return this.imagePullPolicy;
			}

			public void setImagePullPolicy(String imagePullPolicy) {
				this.imagePullPolicy = imagePullPolicy;
			}

			public Boolean getSecurityContextReadOnlyRootFilesystem() {
				return this.securityContextReadOnlyRootFilesystem;
			}

			public void setSecurityContextReadOnlyRootFilesystem(Boolean securityContextReadOnlyRootFilesystem) {
				this.securityContextReadOnlyRootFilesystem = securityContextReadOnlyRootFilesystem;
			}

			public String getSecurityContextRunAsUser() {
				return this.securityContextRunAsUser;
			}

			public void setSecurityContextRunAsUser(String securityContextRunAsUser) {
				this.securityContextRunAsUser = securityContextRunAsUser;
			}

			public List<InitContainerPort> getInitContainerPorts() {
				return this.initContainerPorts;
			}

			public void setInitContainerPorts(List<InitContainerPort> initContainerPorts) {
				this.initContainerPorts = initContainerPorts;
			}

			public List<InitContainerEnvironmentVar> getInitContainerEnvironmentVars() {
				return this.initContainerEnvironmentVars;
			}

			public void setInitContainerEnvironmentVars(List<InitContainerEnvironmentVar> initContainerEnvironmentVars) {
				this.initContainerEnvironmentVars = initContainerEnvironmentVars;
			}

			public List<InitContainerVolumeMount> getInitContainerVolumeMounts() {
				return this.initContainerVolumeMounts;
			}

			public void setInitContainerVolumeMounts(List<InitContainerVolumeMount> initContainerVolumeMounts) {
				this.initContainerVolumeMounts = initContainerVolumeMounts;
			}

			public List<String> getInitContainerArgs() {
				return this.initContainerArgs;
			}

			public void setInitContainerArgs(List<String> initContainerArgs) {
				this.initContainerArgs = initContainerArgs;
			}

			public List<String> getSecurityContextCapabilityAdds1() {
				return this.securityContextCapabilityAdds1;
			}

			public void setSecurityContextCapabilityAdds1(List<String> securityContextCapabilityAdds1) {
				this.securityContextCapabilityAdds1 = securityContextCapabilityAdds1;
			}

			public List<String> getInitContainerCommands() {
				return this.initContainerCommands;
			}

			public void setInitContainerCommands(List<String> initContainerCommands) {
				this.initContainerCommands = initContainerCommands;
			}

			public static class InitContainerPort {

				private Integer port;

				private String protocol;

				public Integer getPort() {
					return this.port;
				}

				public void setPort(Integer port) {
					this.port = port;
				}

				public String getBizProtocol() {
					return this.protocol;
				}

				public void setBizProtocol(String protocol) {
					this.protocol = protocol;
				}
			}

			public static class InitContainerEnvironmentVar {

				private String fieldRefFieldPath;

				private String value;

				private String key;

				public String getFieldRefFieldPath() {
					return this.fieldRefFieldPath;
				}

				public void setFieldRefFieldPath(String fieldRefFieldPath) {
					this.fieldRefFieldPath = fieldRefFieldPath;
				}

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

			public static class InitContainerVolumeMount {

				private Boolean readOnly;

				private String mountPath;

				private String subPath;

				private String mountPropagation;

				private String name;

				public Boolean getReadOnly() {
					return this.readOnly;
				}

				public void setReadOnly(Boolean readOnly) {
					this.readOnly = readOnly;
				}

				public String getMountPath() {
					return this.mountPath;
				}

				public void setMountPath(String mountPath) {
					this.mountPath = mountPath;
				}

				public String getSubPath() {
					return this.subPath;
				}

				public void setSubPath(String subPath) {
					this.subPath = subPath;
				}

				public String getMountPropagation() {
					return this.mountPropagation;
				}

				public void setMountPropagation(String mountPropagation) {
					this.mountPropagation = mountPropagation;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}
		}

		public static class SecurityContextSysCtl {

			private String value;

			private String name;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}
	}

	@Override
	public DescribeEciScalingConfigurationsResponse getInstance(UnmarshallerContext context) {
		return	DescribeEciScalingConfigurationsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
