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

	private Integer pageNumber;

	private Integer pageSize;

	private String requestId;

	private Integer totalCount;

	private List<ScalingConfiguration> scalingConfigurations;

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<ScalingConfiguration> getScalingConfigurations() {
		return this.scalingConfigurations;
	}

	public void setScalingConfigurations(List<ScalingConfiguration> scalingConfigurations) {
		this.scalingConfigurations = scalingConfigurations;
	}

	public static class ScalingConfiguration {

		private String creationTime;

		private String scalingConfigurationName;

		private String securityGroupId;

		private Integer activeDeadlineSeconds;

		private String spotStrategy;

		private Boolean autoCreateEip;

		private String scalingGroupId;

		private Integer ephemeralStorage;

		private Integer ipv6AddressCount;

		private String description;

		private Integer eipBandwidth;

		private String imageSnapshotId;

		private Float memory;

		private String restartPolicy;

		private Float spotPriceLimit;

		private Long ingressBandwidth;

		private Integer cpuOptionsThreadsPerCore;

		private Integer terminationGracePeriodSeconds;

		private Integer loadBalancerWeight;

		private String dnsPolicy;

		private String hostName;

		private Long egressBandwidth;

		private String regionId;

		private String ramRoleName;

		private Float cpu;

		private Boolean autoMatchImageCache;

		private String resourceGroupId;

		private String containerGroupName;

		private String scalingConfigurationId;

		private Integer cpuOptionsCore;

		private Boolean slsEnable;

		private String lifecycleState;

		private Boolean costOptimization;

		private String instanceFamilyLevel;

		private String dataCacheBucket;

		private String dataCachePL;

		private Integer dataCacheProvisionedIops;

		private Boolean dataCacheBurstingEnabled;

		private String gpuDriverVersion;

		private List<Container> containers;

		private List<InitContainer> initContainers;

		private List<Tag> tags;

		private List<Volume> volumes;

		private List<ImageRegistryCredential> imageRegistryCredentials;

		private List<DnsConfigOption> dnsConfigOptions;

		private List<HostAlias> hostAliases;

		private List<SecurityContextSysCtl> securityContextSysCtls;

		private List<AcrRegistryInfo> acrRegistryInfos;

		private List<String> dnsConfigNameServers;

		private List<String> dnsConfigSearches;

		private List<String> ntpServers;

		private List<String> instanceTypes;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getScalingConfigurationName() {
			return this.scalingConfigurationName;
		}

		public void setScalingConfigurationName(String scalingConfigurationName) {
			this.scalingConfigurationName = scalingConfigurationName;
		}

		public String getSecurityGroupId() {
			return this.securityGroupId;
		}

		public void setSecurityGroupId(String securityGroupId) {
			this.securityGroupId = securityGroupId;
		}

		public Integer getActiveDeadlineSeconds() {
			return this.activeDeadlineSeconds;
		}

		public void setActiveDeadlineSeconds(Integer activeDeadlineSeconds) {
			this.activeDeadlineSeconds = activeDeadlineSeconds;
		}

		public String getSpotStrategy() {
			return this.spotStrategy;
		}

		public void setSpotStrategy(String spotStrategy) {
			this.spotStrategy = spotStrategy;
		}

		public Boolean getAutoCreateEip() {
			return this.autoCreateEip;
		}

		public void setAutoCreateEip(Boolean autoCreateEip) {
			this.autoCreateEip = autoCreateEip;
		}

		public String getScalingGroupId() {
			return this.scalingGroupId;
		}

		public void setScalingGroupId(String scalingGroupId) {
			this.scalingGroupId = scalingGroupId;
		}

		public Integer getEphemeralStorage() {
			return this.ephemeralStorage;
		}

		public void setEphemeralStorage(Integer ephemeralStorage) {
			this.ephemeralStorage = ephemeralStorage;
		}

		public Integer getIpv6AddressCount() {
			return this.ipv6AddressCount;
		}

		public void setIpv6AddressCount(Integer ipv6AddressCount) {
			this.ipv6AddressCount = ipv6AddressCount;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getEipBandwidth() {
			return this.eipBandwidth;
		}

		public void setEipBandwidth(Integer eipBandwidth) {
			this.eipBandwidth = eipBandwidth;
		}

		public String getImageSnapshotId() {
			return this.imageSnapshotId;
		}

		public void setImageSnapshotId(String imageSnapshotId) {
			this.imageSnapshotId = imageSnapshotId;
		}

		public Float getMemory() {
			return this.memory;
		}

		public void setMemory(Float memory) {
			this.memory = memory;
		}

		public String getRestartPolicy() {
			return this.restartPolicy;
		}

		public void setRestartPolicy(String restartPolicy) {
			this.restartPolicy = restartPolicy;
		}

		public Float getSpotPriceLimit() {
			return this.spotPriceLimit;
		}

		public void setSpotPriceLimit(Float spotPriceLimit) {
			this.spotPriceLimit = spotPriceLimit;
		}

		public Long getIngressBandwidth() {
			return this.ingressBandwidth;
		}

		public void setIngressBandwidth(Long ingressBandwidth) {
			this.ingressBandwidth = ingressBandwidth;
		}

		public Integer getCpuOptionsThreadsPerCore() {
			return this.cpuOptionsThreadsPerCore;
		}

		public void setCpuOptionsThreadsPerCore(Integer cpuOptionsThreadsPerCore) {
			this.cpuOptionsThreadsPerCore = cpuOptionsThreadsPerCore;
		}

		public Integer getTerminationGracePeriodSeconds() {
			return this.terminationGracePeriodSeconds;
		}

		public void setTerminationGracePeriodSeconds(Integer terminationGracePeriodSeconds) {
			this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
		}

		public Integer getLoadBalancerWeight() {
			return this.loadBalancerWeight;
		}

		public void setLoadBalancerWeight(Integer loadBalancerWeight) {
			this.loadBalancerWeight = loadBalancerWeight;
		}

		public String getDnsPolicy() {
			return this.dnsPolicy;
		}

		public void setDnsPolicy(String dnsPolicy) {
			this.dnsPolicy = dnsPolicy;
		}

		public String getHostName() {
			return this.hostName;
		}

		public void setHostName(String hostName) {
			this.hostName = hostName;
		}

		public Long getEgressBandwidth() {
			return this.egressBandwidth;
		}

		public void setEgressBandwidth(Long egressBandwidth) {
			this.egressBandwidth = egressBandwidth;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getRamRoleName() {
			return this.ramRoleName;
		}

		public void setRamRoleName(String ramRoleName) {
			this.ramRoleName = ramRoleName;
		}

		public Float getCpu() {
			return this.cpu;
		}

		public void setCpu(Float cpu) {
			this.cpu = cpu;
		}

		public Boolean getAutoMatchImageCache() {
			return this.autoMatchImageCache;
		}

		public void setAutoMatchImageCache(Boolean autoMatchImageCache) {
			this.autoMatchImageCache = autoMatchImageCache;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getContainerGroupName() {
			return this.containerGroupName;
		}

		public void setContainerGroupName(String containerGroupName) {
			this.containerGroupName = containerGroupName;
		}

		public String getScalingConfigurationId() {
			return this.scalingConfigurationId;
		}

		public void setScalingConfigurationId(String scalingConfigurationId) {
			this.scalingConfigurationId = scalingConfigurationId;
		}

		public Integer getCpuOptionsCore() {
			return this.cpuOptionsCore;
		}

		public void setCpuOptionsCore(Integer cpuOptionsCore) {
			this.cpuOptionsCore = cpuOptionsCore;
		}

		public Boolean getSlsEnable() {
			return this.slsEnable;
		}

		public void setSlsEnable(Boolean slsEnable) {
			this.slsEnable = slsEnable;
		}

		public String getLifecycleState() {
			return this.lifecycleState;
		}

		public void setLifecycleState(String lifecycleState) {
			this.lifecycleState = lifecycleState;
		}

		public Boolean getCostOptimization() {
			return this.costOptimization;
		}

		public void setCostOptimization(Boolean costOptimization) {
			this.costOptimization = costOptimization;
		}

		public String getInstanceFamilyLevel() {
			return this.instanceFamilyLevel;
		}

		public void setInstanceFamilyLevel(String instanceFamilyLevel) {
			this.instanceFamilyLevel = instanceFamilyLevel;
		}

		public String getDataCacheBucket() {
			return this.dataCacheBucket;
		}

		public void setDataCacheBucket(String dataCacheBucket) {
			this.dataCacheBucket = dataCacheBucket;
		}

		public String getDataCachePL() {
			return this.dataCachePL;
		}

		public void setDataCachePL(String dataCachePL) {
			this.dataCachePL = dataCachePL;
		}

		public Integer getDataCacheProvisionedIops() {
			return this.dataCacheProvisionedIops;
		}

		public void setDataCacheProvisionedIops(Integer dataCacheProvisionedIops) {
			this.dataCacheProvisionedIops = dataCacheProvisionedIops;
		}

		public Boolean getDataCacheBurstingEnabled() {
			return this.dataCacheBurstingEnabled;
		}

		public void setDataCacheBurstingEnabled(Boolean dataCacheBurstingEnabled) {
			this.dataCacheBurstingEnabled = dataCacheBurstingEnabled;
		}

		public String getGpuDriverVersion() {
			return this.gpuDriverVersion;
		}

		public void setGpuDriverVersion(String gpuDriverVersion) {
			this.gpuDriverVersion = gpuDriverVersion;
		}

		public List<Container> getContainers() {
			return this.containers;
		}

		public void setContainers(List<Container> containers) {
			this.containers = containers;
		}

		public List<InitContainer> getInitContainers() {
			return this.initContainers;
		}

		public void setInitContainers(List<InitContainer> initContainers) {
			this.initContainers = initContainers;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<Volume> getVolumes() {
			return this.volumes;
		}

		public void setVolumes(List<Volume> volumes) {
			this.volumes = volumes;
		}

		public List<ImageRegistryCredential> getImageRegistryCredentials() {
			return this.imageRegistryCredentials;
		}

		public void setImageRegistryCredentials(List<ImageRegistryCredential> imageRegistryCredentials) {
			this.imageRegistryCredentials = imageRegistryCredentials;
		}

		public List<DnsConfigOption> getDnsConfigOptions() {
			return this.dnsConfigOptions;
		}

		public void setDnsConfigOptions(List<DnsConfigOption> dnsConfigOptions) {
			this.dnsConfigOptions = dnsConfigOptions;
		}

		public List<HostAlias> getHostAliases() {
			return this.hostAliases;
		}

		public void setHostAliases(List<HostAlias> hostAliases) {
			this.hostAliases = hostAliases;
		}

		public List<SecurityContextSysCtl> getSecurityContextSysCtls() {
			return this.securityContextSysCtls;
		}

		public void setSecurityContextSysCtls(List<SecurityContextSysCtl> securityContextSysCtls) {
			this.securityContextSysCtls = securityContextSysCtls;
		}

		public List<AcrRegistryInfo> getAcrRegistryInfos() {
			return this.acrRegistryInfos;
		}

		public void setAcrRegistryInfos(List<AcrRegistryInfo> acrRegistryInfos) {
			this.acrRegistryInfos = acrRegistryInfos;
		}

		public List<String> getDnsConfigNameServers() {
			return this.dnsConfigNameServers;
		}

		public void setDnsConfigNameServers(List<String> dnsConfigNameServers) {
			this.dnsConfigNameServers = dnsConfigNameServers;
		}

		public List<String> getDnsConfigSearches() {
			return this.dnsConfigSearches;
		}

		public void setDnsConfigSearches(List<String> dnsConfigSearches) {
			this.dnsConfigSearches = dnsConfigSearches;
		}

		public List<String> getNtpServers() {
			return this.ntpServers;
		}

		public void setNtpServers(List<String> ntpServers) {
			this.ntpServers = ntpServers;
		}

		public List<String> getInstanceTypes() {
			return this.instanceTypes;
		}

		public void setInstanceTypes(List<String> instanceTypes) {
			this.instanceTypes = instanceTypes;
		}

		public static class Container {

			private String readinessProbeHttpGetPath;

			private Integer readinessProbeSuccessThreshold;

			private Integer livenessProbePeriodSeconds;

			private Integer livenessProbeTcpSocketPort;

			private String livenessProbeHttpGetScheme;

			private String workingDir;

			private Boolean tty;

			private Integer livenessProbeHttpGetPort;

			private Integer gpu;

			private Integer readinessProbeInitialDelaySeconds;

			private Boolean stdin;

			private Float memory;

			private String name;

			private Boolean securityContextReadOnlyRootFilesystem;

			private String livenessProbeHttpGetPath;

			private String image;

			private Integer readinessProbeTcpSocketPort;

			private String readinessProbeHttpGetScheme;

			private Integer readinessProbeHttpGetPort;

			private Integer livenessProbeSuccessThreshold;

			private Integer readinessProbeTimeoutSeconds;

			private Long securityContextRunAsUser;

			private Integer livenessProbeInitialDelaySeconds;

			private Integer readinessProbePeriodSeconds;

			private String imagePullPolicy;

			private Boolean stdinOnce;

			private Float cpu;

			private Integer livenessProbeTimeoutSeconds;

			private Integer readinessProbeFailureThreshold;

			private Integer livenessProbeFailureThreshold;

			private String lifecyclePostStartHandlerHttpGetHost;

			private Integer lifecyclePostStartHandlerHttpGetPort;

			private String lifecyclePostStartHandlerHttpGetPath;

			private String lifecyclePostStartHandlerHttpGetScheme;

			private String lifecyclePostStartHandlerTcpSocketHost;

			private Integer lifecyclePostStartHandlerTcpSocketPort;

			private String lifecyclePreStopHandlerHttpGetHost;

			private Integer lifecyclePreStopHandlerHttpGetPort;

			private String lifecyclePreStopHandlerHttpGetPath;

			private String lifecyclePreStopHandlerHttpGetScheme;

			private String lifecyclePreStopHandlerTcpSocketHost;

			private Integer lifecyclePreStopHandlerTcpSocketPort;

			private List<Port> ports;

			private List<VolumeMount> volumeMounts;

			private List<EnvironmentVar> environmentVars;

			private List<String> commands;

			private List<String> livenessProbeExecCommands;

			private List<String> args;

			private List<String> readinessProbeExecCommands;

			private List<String> securityContextCapabilityAdds;

			private List<String> lifecyclePostStartHandlerExecs;

			private List<String> lifecyclePreStopHandlerExecs;

			public String getReadinessProbeHttpGetPath() {
				return this.readinessProbeHttpGetPath;
			}

			public void setReadinessProbeHttpGetPath(String readinessProbeHttpGetPath) {
				this.readinessProbeHttpGetPath = readinessProbeHttpGetPath;
			}

			public Integer getReadinessProbeSuccessThreshold() {
				return this.readinessProbeSuccessThreshold;
			}

			public void setReadinessProbeSuccessThreshold(Integer readinessProbeSuccessThreshold) {
				this.readinessProbeSuccessThreshold = readinessProbeSuccessThreshold;
			}

			public Integer getLivenessProbePeriodSeconds() {
				return this.livenessProbePeriodSeconds;
			}

			public void setLivenessProbePeriodSeconds(Integer livenessProbePeriodSeconds) {
				this.livenessProbePeriodSeconds = livenessProbePeriodSeconds;
			}

			public Integer getLivenessProbeTcpSocketPort() {
				return this.livenessProbeTcpSocketPort;
			}

			public void setLivenessProbeTcpSocketPort(Integer livenessProbeTcpSocketPort) {
				this.livenessProbeTcpSocketPort = livenessProbeTcpSocketPort;
			}

			public String getLivenessProbeHttpGetScheme() {
				return this.livenessProbeHttpGetScheme;
			}

			public void setLivenessProbeHttpGetScheme(String livenessProbeHttpGetScheme) {
				this.livenessProbeHttpGetScheme = livenessProbeHttpGetScheme;
			}

			public String getWorkingDir() {
				return this.workingDir;
			}

			public void setWorkingDir(String workingDir) {
				this.workingDir = workingDir;
			}

			public Boolean getTty() {
				return this.tty;
			}

			public void setTty(Boolean tty) {
				this.tty = tty;
			}

			public Integer getLivenessProbeHttpGetPort() {
				return this.livenessProbeHttpGetPort;
			}

			public void setLivenessProbeHttpGetPort(Integer livenessProbeHttpGetPort) {
				this.livenessProbeHttpGetPort = livenessProbeHttpGetPort;
			}

			public Integer getGpu() {
				return this.gpu;
			}

			public void setGpu(Integer gpu) {
				this.gpu = gpu;
			}

			public Integer getReadinessProbeInitialDelaySeconds() {
				return this.readinessProbeInitialDelaySeconds;
			}

			public void setReadinessProbeInitialDelaySeconds(Integer readinessProbeInitialDelaySeconds) {
				this.readinessProbeInitialDelaySeconds = readinessProbeInitialDelaySeconds;
			}

			public Boolean getStdin() {
				return this.stdin;
			}

			public void setStdin(Boolean stdin) {
				this.stdin = stdin;
			}

			public Float getMemory() {
				return this.memory;
			}

			public void setMemory(Float memory) {
				this.memory = memory;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Boolean getSecurityContextReadOnlyRootFilesystem() {
				return this.securityContextReadOnlyRootFilesystem;
			}

			public void setSecurityContextReadOnlyRootFilesystem(Boolean securityContextReadOnlyRootFilesystem) {
				this.securityContextReadOnlyRootFilesystem = securityContextReadOnlyRootFilesystem;
			}

			public String getLivenessProbeHttpGetPath() {
				return this.livenessProbeHttpGetPath;
			}

			public void setLivenessProbeHttpGetPath(String livenessProbeHttpGetPath) {
				this.livenessProbeHttpGetPath = livenessProbeHttpGetPath;
			}

			public String getImage() {
				return this.image;
			}

			public void setImage(String image) {
				this.image = image;
			}

			public Integer getReadinessProbeTcpSocketPort() {
				return this.readinessProbeTcpSocketPort;
			}

			public void setReadinessProbeTcpSocketPort(Integer readinessProbeTcpSocketPort) {
				this.readinessProbeTcpSocketPort = readinessProbeTcpSocketPort;
			}

			public String getReadinessProbeHttpGetScheme() {
				return this.readinessProbeHttpGetScheme;
			}

			public void setReadinessProbeHttpGetScheme(String readinessProbeHttpGetScheme) {
				this.readinessProbeHttpGetScheme = readinessProbeHttpGetScheme;
			}

			public Integer getReadinessProbeHttpGetPort() {
				return this.readinessProbeHttpGetPort;
			}

			public void setReadinessProbeHttpGetPort(Integer readinessProbeHttpGetPort) {
				this.readinessProbeHttpGetPort = readinessProbeHttpGetPort;
			}

			public Integer getLivenessProbeSuccessThreshold() {
				return this.livenessProbeSuccessThreshold;
			}

			public void setLivenessProbeSuccessThreshold(Integer livenessProbeSuccessThreshold) {
				this.livenessProbeSuccessThreshold = livenessProbeSuccessThreshold;
			}

			public Integer getReadinessProbeTimeoutSeconds() {
				return this.readinessProbeTimeoutSeconds;
			}

			public void setReadinessProbeTimeoutSeconds(Integer readinessProbeTimeoutSeconds) {
				this.readinessProbeTimeoutSeconds = readinessProbeTimeoutSeconds;
			}

			public Long getSecurityContextRunAsUser() {
				return this.securityContextRunAsUser;
			}

			public void setSecurityContextRunAsUser(Long securityContextRunAsUser) {
				this.securityContextRunAsUser = securityContextRunAsUser;
			}

			public Integer getLivenessProbeInitialDelaySeconds() {
				return this.livenessProbeInitialDelaySeconds;
			}

			public void setLivenessProbeInitialDelaySeconds(Integer livenessProbeInitialDelaySeconds) {
				this.livenessProbeInitialDelaySeconds = livenessProbeInitialDelaySeconds;
			}

			public Integer getReadinessProbePeriodSeconds() {
				return this.readinessProbePeriodSeconds;
			}

			public void setReadinessProbePeriodSeconds(Integer readinessProbePeriodSeconds) {
				this.readinessProbePeriodSeconds = readinessProbePeriodSeconds;
			}

			public String getImagePullPolicy() {
				return this.imagePullPolicy;
			}

			public void setImagePullPolicy(String imagePullPolicy) {
				this.imagePullPolicy = imagePullPolicy;
			}

			public Boolean getStdinOnce() {
				return this.stdinOnce;
			}

			public void setStdinOnce(Boolean stdinOnce) {
				this.stdinOnce = stdinOnce;
			}

			public Float getCpu() {
				return this.cpu;
			}

			public void setCpu(Float cpu) {
				this.cpu = cpu;
			}

			public Integer getLivenessProbeTimeoutSeconds() {
				return this.livenessProbeTimeoutSeconds;
			}

			public void setLivenessProbeTimeoutSeconds(Integer livenessProbeTimeoutSeconds) {
				this.livenessProbeTimeoutSeconds = livenessProbeTimeoutSeconds;
			}

			public Integer getReadinessProbeFailureThreshold() {
				return this.readinessProbeFailureThreshold;
			}

			public void setReadinessProbeFailureThreshold(Integer readinessProbeFailureThreshold) {
				this.readinessProbeFailureThreshold = readinessProbeFailureThreshold;
			}

			public Integer getLivenessProbeFailureThreshold() {
				return this.livenessProbeFailureThreshold;
			}

			public void setLivenessProbeFailureThreshold(Integer livenessProbeFailureThreshold) {
				this.livenessProbeFailureThreshold = livenessProbeFailureThreshold;
			}

			public String getLifecyclePostStartHandlerHttpGetHost() {
				return this.lifecyclePostStartHandlerHttpGetHost;
			}

			public void setLifecyclePostStartHandlerHttpGetHost(String lifecyclePostStartHandlerHttpGetHost) {
				this.lifecyclePostStartHandlerHttpGetHost = lifecyclePostStartHandlerHttpGetHost;
			}

			public Integer getLifecyclePostStartHandlerHttpGetPort() {
				return this.lifecyclePostStartHandlerHttpGetPort;
			}

			public void setLifecyclePostStartHandlerHttpGetPort(Integer lifecyclePostStartHandlerHttpGetPort) {
				this.lifecyclePostStartHandlerHttpGetPort = lifecyclePostStartHandlerHttpGetPort;
			}

			public String getLifecyclePostStartHandlerHttpGetPath() {
				return this.lifecyclePostStartHandlerHttpGetPath;
			}

			public void setLifecyclePostStartHandlerHttpGetPath(String lifecyclePostStartHandlerHttpGetPath) {
				this.lifecyclePostStartHandlerHttpGetPath = lifecyclePostStartHandlerHttpGetPath;
			}

			public String getLifecyclePostStartHandlerHttpGetScheme() {
				return this.lifecyclePostStartHandlerHttpGetScheme;
			}

			public void setLifecyclePostStartHandlerHttpGetScheme(String lifecyclePostStartHandlerHttpGetScheme) {
				this.lifecyclePostStartHandlerHttpGetScheme = lifecyclePostStartHandlerHttpGetScheme;
			}

			public String getLifecyclePostStartHandlerTcpSocketHost() {
				return this.lifecyclePostStartHandlerTcpSocketHost;
			}

			public void setLifecyclePostStartHandlerTcpSocketHost(String lifecyclePostStartHandlerTcpSocketHost) {
				this.lifecyclePostStartHandlerTcpSocketHost = lifecyclePostStartHandlerTcpSocketHost;
			}

			public Integer getLifecyclePostStartHandlerTcpSocketPort() {
				return this.lifecyclePostStartHandlerTcpSocketPort;
			}

			public void setLifecyclePostStartHandlerTcpSocketPort(Integer lifecyclePostStartHandlerTcpSocketPort) {
				this.lifecyclePostStartHandlerTcpSocketPort = lifecyclePostStartHandlerTcpSocketPort;
			}

			public String getLifecyclePreStopHandlerHttpGetHost() {
				return this.lifecyclePreStopHandlerHttpGetHost;
			}

			public void setLifecyclePreStopHandlerHttpGetHost(String lifecyclePreStopHandlerHttpGetHost) {
				this.lifecyclePreStopHandlerHttpGetHost = lifecyclePreStopHandlerHttpGetHost;
			}

			public Integer getLifecyclePreStopHandlerHttpGetPort() {
				return this.lifecyclePreStopHandlerHttpGetPort;
			}

			public void setLifecyclePreStopHandlerHttpGetPort(Integer lifecyclePreStopHandlerHttpGetPort) {
				this.lifecyclePreStopHandlerHttpGetPort = lifecyclePreStopHandlerHttpGetPort;
			}

			public String getLifecyclePreStopHandlerHttpGetPath() {
				return this.lifecyclePreStopHandlerHttpGetPath;
			}

			public void setLifecyclePreStopHandlerHttpGetPath(String lifecyclePreStopHandlerHttpGetPath) {
				this.lifecyclePreStopHandlerHttpGetPath = lifecyclePreStopHandlerHttpGetPath;
			}

			public String getLifecyclePreStopHandlerHttpGetScheme() {
				return this.lifecyclePreStopHandlerHttpGetScheme;
			}

			public void setLifecyclePreStopHandlerHttpGetScheme(String lifecyclePreStopHandlerHttpGetScheme) {
				this.lifecyclePreStopHandlerHttpGetScheme = lifecyclePreStopHandlerHttpGetScheme;
			}

			public String getLifecyclePreStopHandlerTcpSocketHost() {
				return this.lifecyclePreStopHandlerTcpSocketHost;
			}

			public void setLifecyclePreStopHandlerTcpSocketHost(String lifecyclePreStopHandlerTcpSocketHost) {
				this.lifecyclePreStopHandlerTcpSocketHost = lifecyclePreStopHandlerTcpSocketHost;
			}

			public Integer getLifecyclePreStopHandlerTcpSocketPort() {
				return this.lifecyclePreStopHandlerTcpSocketPort;
			}

			public void setLifecyclePreStopHandlerTcpSocketPort(Integer lifecyclePreStopHandlerTcpSocketPort) {
				this.lifecyclePreStopHandlerTcpSocketPort = lifecyclePreStopHandlerTcpSocketPort;
			}

			public List<Port> getPorts() {
				return this.ports;
			}

			public void setPorts(List<Port> ports) {
				this.ports = ports;
			}

			public List<VolumeMount> getVolumeMounts() {
				return this.volumeMounts;
			}

			public void setVolumeMounts(List<VolumeMount> volumeMounts) {
				this.volumeMounts = volumeMounts;
			}

			public List<EnvironmentVar> getEnvironmentVars() {
				return this.environmentVars;
			}

			public void setEnvironmentVars(List<EnvironmentVar> environmentVars) {
				this.environmentVars = environmentVars;
			}

			public List<String> getCommands() {
				return this.commands;
			}

			public void setCommands(List<String> commands) {
				this.commands = commands;
			}

			public List<String> getLivenessProbeExecCommands() {
				return this.livenessProbeExecCommands;
			}

			public void setLivenessProbeExecCommands(List<String> livenessProbeExecCommands) {
				this.livenessProbeExecCommands = livenessProbeExecCommands;
			}

			public List<String> getArgs() {
				return this.args;
			}

			public void setArgs(List<String> args) {
				this.args = args;
			}

			public List<String> getReadinessProbeExecCommands() {
				return this.readinessProbeExecCommands;
			}

			public void setReadinessProbeExecCommands(List<String> readinessProbeExecCommands) {
				this.readinessProbeExecCommands = readinessProbeExecCommands;
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

			public List<String> getLifecyclePreStopHandlerExecs() {
				return this.lifecyclePreStopHandlerExecs;
			}

			public void setLifecyclePreStopHandlerExecs(List<String> lifecyclePreStopHandlerExecs) {
				this.lifecyclePreStopHandlerExecs = lifecyclePreStopHandlerExecs;
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

			public static class VolumeMount {

				private Boolean readOnly;

				private String subPath;

				private String name;

				private String mountPropagation;

				private String mountPath;

				public Boolean getReadOnly() {
					return this.readOnly;
				}

				public void setReadOnly(Boolean readOnly) {
					this.readOnly = readOnly;
				}

				public String getSubPath() {
					return this.subPath;
				}

				public void setSubPath(String subPath) {
					this.subPath = subPath;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getMountPropagation() {
					return this.mountPropagation;
				}

				public void setMountPropagation(String mountPropagation) {
					this.mountPropagation = mountPropagation;
				}

				public String getMountPath() {
					return this.mountPath;
				}

				public void setMountPath(String mountPath) {
					this.mountPath = mountPath;
				}
			}

			public static class EnvironmentVar {

				private String key;

				private String value;

				private String fieldRefFieldPath;

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

				public String getFieldRefFieldPath() {
					return this.fieldRefFieldPath;
				}

				public void setFieldRefFieldPath(String fieldRefFieldPath) {
					this.fieldRefFieldPath = fieldRefFieldPath;
				}
			}
		}

		public static class InitContainer {

			private Boolean securityContextReadOnlyRootFilesystem;

			private String imagePullPolicy;

			private String workingDir;

			private Float cpu;

			private String image;

			private Integer gpu;

			private String securityContextRunAsUser;

			private Float memory;

			private String name;

			private List<InitContainerEnvironmentVar> initContainerEnvironmentVars;

			private List<InitContainerPort> initContainerPorts;

			private List<InitContainerVolumeMount> initContainerVolumeMounts;

			private List<String> securityContextCapabilityAdds1;

			private List<String> initContainerCommands;

			private List<String> initContainerArgs;

			public Boolean getSecurityContextReadOnlyRootFilesystem() {
				return this.securityContextReadOnlyRootFilesystem;
			}

			public void setSecurityContextReadOnlyRootFilesystem(Boolean securityContextReadOnlyRootFilesystem) {
				this.securityContextReadOnlyRootFilesystem = securityContextReadOnlyRootFilesystem;
			}

			public String getImagePullPolicy() {
				return this.imagePullPolicy;
			}

			public void setImagePullPolicy(String imagePullPolicy) {
				this.imagePullPolicy = imagePullPolicy;
			}

			public String getWorkingDir() {
				return this.workingDir;
			}

			public void setWorkingDir(String workingDir) {
				this.workingDir = workingDir;
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

			public String getSecurityContextRunAsUser() {
				return this.securityContextRunAsUser;
			}

			public void setSecurityContextRunAsUser(String securityContextRunAsUser) {
				this.securityContextRunAsUser = securityContextRunAsUser;
			}

			public Float getMemory() {
				return this.memory;
			}

			public void setMemory(Float memory) {
				this.memory = memory;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public List<InitContainerEnvironmentVar> getInitContainerEnvironmentVars() {
				return this.initContainerEnvironmentVars;
			}

			public void setInitContainerEnvironmentVars(List<InitContainerEnvironmentVar> initContainerEnvironmentVars) {
				this.initContainerEnvironmentVars = initContainerEnvironmentVars;
			}

			public List<InitContainerPort> getInitContainerPorts() {
				return this.initContainerPorts;
			}

			public void setInitContainerPorts(List<InitContainerPort> initContainerPorts) {
				this.initContainerPorts = initContainerPorts;
			}

			public List<InitContainerVolumeMount> getInitContainerVolumeMounts() {
				return this.initContainerVolumeMounts;
			}

			public void setInitContainerVolumeMounts(List<InitContainerVolumeMount> initContainerVolumeMounts) {
				this.initContainerVolumeMounts = initContainerVolumeMounts;
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

			public List<String> getInitContainerArgs() {
				return this.initContainerArgs;
			}

			public void setInitContainerArgs(List<String> initContainerArgs) {
				this.initContainerArgs = initContainerArgs;
			}

			public static class InitContainerEnvironmentVar {

				private String key;

				private String value;

				private String fieldRefFieldPath;

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

				public String getFieldRefFieldPath() {
					return this.fieldRefFieldPath;
				}

				public void setFieldRefFieldPath(String fieldRefFieldPath) {
					this.fieldRefFieldPath = fieldRefFieldPath;
				}
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

			public static class InitContainerVolumeMount {

				private Boolean readOnly;

				private String subPath;

				private String name;

				private String mountPropagation;

				private String mountPath;

				public Boolean getReadOnly() {
					return this.readOnly;
				}

				public void setReadOnly(Boolean readOnly) {
					this.readOnly = readOnly;
				}

				public String getSubPath() {
					return this.subPath;
				}

				public void setSubPath(String subPath) {
					this.subPath = subPath;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getMountPropagation() {
					return this.mountPropagation;
				}

				public void setMountPropagation(String mountPropagation) {
					this.mountPropagation = mountPropagation;
				}

				public String getMountPath() {
					return this.mountPath;
				}

				public void setMountPath(String mountPath) {
					this.mountPath = mountPath;
				}
			}
		}

		public static class Tag {

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

		public static class Volume {

			private String type;

			private String diskVolumeDiskId;

			private String diskVolumeFsType;

			private String emptyDirVolumeMedium;

			private String nFSVolumePath;

			private Integer diskVolumeDiskSize;

			private Boolean nFSVolumeReadOnly;

			private String flexVolumeFsType;

			private Integer configFileVolumeDefaultMode;

			private String flexVolumeDriver;

			private String flexVolumeOptions;

			private String nFSVolumeServer;

			private String name;

			private String emptyDirVolumeSizeLimit;

			private String hostPathVolumeType;

			private String hostPathVolumePath;

			private List<ConfigFileVolumeConfigFileToPath> configFileVolumeConfigFileToPaths;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getDiskVolumeDiskId() {
				return this.diskVolumeDiskId;
			}

			public void setDiskVolumeDiskId(String diskVolumeDiskId) {
				this.diskVolumeDiskId = diskVolumeDiskId;
			}

			public String getDiskVolumeFsType() {
				return this.diskVolumeFsType;
			}

			public void setDiskVolumeFsType(String diskVolumeFsType) {
				this.diskVolumeFsType = diskVolumeFsType;
			}

			public String getEmptyDirVolumeMedium() {
				return this.emptyDirVolumeMedium;
			}

			public void setEmptyDirVolumeMedium(String emptyDirVolumeMedium) {
				this.emptyDirVolumeMedium = emptyDirVolumeMedium;
			}

			public String getNFSVolumePath() {
				return this.nFSVolumePath;
			}

			public void setNFSVolumePath(String nFSVolumePath) {
				this.nFSVolumePath = nFSVolumePath;
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

			public String getFlexVolumeFsType() {
				return this.flexVolumeFsType;
			}

			public void setFlexVolumeFsType(String flexVolumeFsType) {
				this.flexVolumeFsType = flexVolumeFsType;
			}

			public Integer getConfigFileVolumeDefaultMode() {
				return this.configFileVolumeDefaultMode;
			}

			public void setConfigFileVolumeDefaultMode(Integer configFileVolumeDefaultMode) {
				this.configFileVolumeDefaultMode = configFileVolumeDefaultMode;
			}

			public String getFlexVolumeDriver() {
				return this.flexVolumeDriver;
			}

			public void setFlexVolumeDriver(String flexVolumeDriver) {
				this.flexVolumeDriver = flexVolumeDriver;
			}

			public String getFlexVolumeOptions() {
				return this.flexVolumeOptions;
			}

			public void setFlexVolumeOptions(String flexVolumeOptions) {
				this.flexVolumeOptions = flexVolumeOptions;
			}

			public String getNFSVolumeServer() {
				return this.nFSVolumeServer;
			}

			public void setNFSVolumeServer(String nFSVolumeServer) {
				this.nFSVolumeServer = nFSVolumeServer;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getEmptyDirVolumeSizeLimit() {
				return this.emptyDirVolumeSizeLimit;
			}

			public void setEmptyDirVolumeSizeLimit(String emptyDirVolumeSizeLimit) {
				this.emptyDirVolumeSizeLimit = emptyDirVolumeSizeLimit;
			}

			public String getHostPathVolumeType() {
				return this.hostPathVolumeType;
			}

			public void setHostPathVolumeType(String hostPathVolumeType) {
				this.hostPathVolumeType = hostPathVolumeType;
			}

			public String getHostPathVolumePath() {
				return this.hostPathVolumePath;
			}

			public void setHostPathVolumePath(String hostPathVolumePath) {
				this.hostPathVolumePath = hostPathVolumePath;
			}

			public List<ConfigFileVolumeConfigFileToPath> getConfigFileVolumeConfigFileToPaths() {
				return this.configFileVolumeConfigFileToPaths;
			}

			public void setConfigFileVolumeConfigFileToPaths(List<ConfigFileVolumeConfigFileToPath> configFileVolumeConfigFileToPaths) {
				this.configFileVolumeConfigFileToPaths = configFileVolumeConfigFileToPaths;
			}

			public static class ConfigFileVolumeConfigFileToPath {

				private String path;

				private Integer mode;

				private String content;

				public String getPath() {
					return this.path;
				}

				public void setPath(String path) {
					this.path = path;
				}

				public Integer getMode() {
					return this.mode;
				}

				public void setMode(Integer mode) {
					this.mode = mode;
				}

				public String getContent() {
					return this.content;
				}

				public void setContent(String content) {
					this.content = content;
				}
			}
		}

		public static class ImageRegistryCredential {

			private String password;

			private String server;

			private String userName;

			public String getPassword() {
				return this.password;
			}

			public void setPassword(String password) {
				this.password = password;
			}

			public String getServer() {
				return this.server;
			}

			public void setServer(String server) {
				this.server = server;
			}

			public String getUserName() {
				return this.userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
			}
		}

		public static class DnsConfigOption {

			private String name;

			private String value;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
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

		public static class SecurityContextSysCtl {

			private String name;

			private String value;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}

		public static class AcrRegistryInfo {

			private String instanceId;

			private String instanceName;

			private String regionId;

			private List<String> domains;

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getInstanceName() {
				return this.instanceName;
			}

			public void setInstanceName(String instanceName) {
				this.instanceName = instanceName;
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
