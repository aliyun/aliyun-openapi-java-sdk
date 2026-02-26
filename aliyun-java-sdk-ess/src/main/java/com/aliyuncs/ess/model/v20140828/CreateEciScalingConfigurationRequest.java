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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ess.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateEciScalingConfigurationRequest extends RpcAcsRequest<CreateEciScalingConfigurationResponse> {
	   

	private List<Container> containers;

	private List<String> ntpServers;

	private Float spotPriceLimit;

	private String resourceGroupId;

	private String hostName;

	private Long activeDeadlineSeconds;

	private Long egressBandwidth;

	private List<String> dnsConfigSearchs;

	private List<HostAliase> hostAliases;

	private String imageSnapshotId;

	private List<Tag> tags;

	private Integer cpuOptionsThreadsPerCore;

	private String dataCachePL;

	private Integer ipv6AddressCount;

	private Float cpu;

	private Long ownerId;

	private String scalingConfigurationName;

	private String spotStrategy;

	private List<Volume> volumes;

	private String instanceFamilyLevel;

	private List<DnsConfigOption> dnsConfigOptions;

	private Integer ephemeralStorage;

	private Integer dataCacheProvisionedIops;

	private Integer eipBandwidth;

	private String gpuDriverVersion;

	private Boolean costOptimization;

	private Boolean dataCacheBurstingEnabled;

	private Float memory;

	private String scalingGroupId;

	private String securityGroupId;

	private Long ingressBandwidth;

	private String dnsPolicy;

	private List<SecurityContextSysctl> securityContextSysctls;

	private String dataCacheBucket;

	private List<String> dnsConfigNameServers;

	private List<InitContainer> initContainers;

	private List<String> instanceTypes;

	private Long terminationGracePeriodSeconds;

	private List<ImageRegistryCredential> imageRegistryCredentials;

	private String resourceOwnerAccount;

	private String restartPolicy;

	private Integer cpuOptionsCore;

	private String ramRoleName;

	private List<AcrRegistryInfo> acrRegistryInfos;

	private Boolean autoMatchImageCache;

	private Integer loadBalancerWeight;

	private String containerGroupName;

	private Boolean autoCreateEip;
	public CreateEciScalingConfigurationRequest() {
		super("Ess", "2014-08-28", "CreateEciScalingConfiguration", "ess");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Container> getContainers() {
		return this.containers;
	}

	public void setContainers(List<Container> containers) {
		this.containers = containers;	
		if (containers != null) {
			for (int depth1 = 0; depth1 < containers.size(); depth1++) {
				putQueryParameter("Container." + (depth1 + 1) + ".Stdin" , containers.get(depth1).getStdin());
				if (containers.get(depth1).getLivenessProbeExecCommands() != null) {
					for (int i = 0; i < containers.get(depth1).getLivenessProbeExecCommands().size(); i++) {
						putQueryParameter("Container." + (depth1 + 1) + ".LivenessProbe.Exec.Command." + (i + 1) , containers.get(depth1).getLivenessProbeExecCommands().get(i));
					}
				}
				putQueryParameter("Container." + (depth1 + 1) + ".LifecyclePostStartHandlerHttpGetPort" , containers.get(depth1).getLifecyclePostStartHandlerHttpGetPort());
				putQueryParameter("Container." + (depth1 + 1) + ".WorkingDir" , containers.get(depth1).getWorkingDir());
				putQueryParameter("Container." + (depth1 + 1) + ".ReadinessProbe.HttpGet.Port" , containers.get(depth1).getReadinessProbeHttpGetPort());
				putQueryParameter("Container." + (depth1 + 1) + ".LivenessProbe.HttpGet.Port" , containers.get(depth1).getLivenessProbeHttpGetPort());
				putQueryParameter("Container." + (depth1 + 1) + ".LifecyclePreStopHandlerTcpSocketPort" , containers.get(depth1).getLifecyclePreStopHandlerTcpSocketPort());
				if (containers.get(depth1).getVolumeMounts() != null) {
					for (int depth2 = 0; depth2 < containers.get(depth1).getVolumeMounts().size(); depth2++) {
						putQueryParameter("Container." + (depth1 + 1) + ".VolumeMount." + (depth2 + 1) + ".MountPath" , containers.get(depth1).getVolumeMounts().get(depth2).getMountPath());
						putQueryParameter("Container." + (depth1 + 1) + ".VolumeMount." + (depth2 + 1) + ".ReadOnly" , containers.get(depth1).getVolumeMounts().get(depth2).getReadOnly());
						putQueryParameter("Container." + (depth1 + 1) + ".VolumeMount." + (depth2 + 1) + ".MountPropagation" , containers.get(depth1).getVolumeMounts().get(depth2).getMountPropagation());
						putQueryParameter("Container." + (depth1 + 1) + ".VolumeMount." + (depth2 + 1) + ".Name" , containers.get(depth1).getVolumeMounts().get(depth2).getName());
						putQueryParameter("Container." + (depth1 + 1) + ".VolumeMount." + (depth2 + 1) + ".SubPath" , containers.get(depth1).getVolumeMounts().get(depth2).getSubPath());
					}
				}
				putQueryParameter("Container." + (depth1 + 1) + ".Image" , containers.get(depth1).getImage());
				if (containers.get(depth1).getLifecyclePostStartHandlerExecs() != null) {
					for (int i = 0; i < containers.get(depth1).getLifecyclePostStartHandlerExecs().size(); i++) {
						putQueryParameter("Container." + (depth1 + 1) + ".LifecyclePostStartHandlerExec." + (i + 1) , containers.get(depth1).getLifecyclePostStartHandlerExecs().get(i));
					}
				}
				putQueryParameter("Container." + (depth1 + 1) + ".Cpu" , containers.get(depth1).getCpu());
				putQueryParameter("Container." + (depth1 + 1) + ".ReadinessProbe.HttpGet.Path" , containers.get(depth1).getReadinessProbeHttpGetPath());
				putQueryParameter("Container." + (depth1 + 1) + ".Gpu" , containers.get(depth1).getGpu());
				putQueryParameter("Container." + (depth1 + 1) + ".StdinOnce" , containers.get(depth1).getStdinOnce());
				putQueryParameter("Container." + (depth1 + 1) + ".LifecyclePostStartHandlerTcpSocketHost" , containers.get(depth1).getLifecyclePostStartHandlerTcpSocketHost());
				putQueryParameter("Container." + (depth1 + 1) + ".LivenessProbe.SuccessThreshold" , containers.get(depth1).getLivenessProbeSuccessThreshold());
				putQueryParameter("Container." + (depth1 + 1) + ".SecurityContext.RunAsUser" , containers.get(depth1).getSecurityContextRunAsUser());
				putQueryParameter("Container." + (depth1 + 1) + ".LivenessProbe.PeriodSeconds" , containers.get(depth1).getLivenessProbePeriodSeconds());
				putQueryParameter("Container." + (depth1 + 1) + ".LivenessProbe.InitialDelaySeconds" , containers.get(depth1).getLivenessProbeInitialDelaySeconds());
				if (containers.get(depth1).getPorts() != null) {
					for (int depth2 = 0; depth2 < containers.get(depth1).getPorts().size(); depth2++) {
						putQueryParameter("Container." + (depth1 + 1) + ".Port." + (depth2 + 1) + ".Protocol" , containers.get(depth1).getPorts().get(depth2).getBizProtocol());
						putQueryParameter("Container." + (depth1 + 1) + ".Port." + (depth2 + 1) + ".Port" , containers.get(depth1).getPorts().get(depth2).getPort());
					}
				}
				putQueryParameter("Container." + (depth1 + 1) + ".Name" , containers.get(depth1).getName());
				putQueryParameter("Container." + (depth1 + 1) + ".LifecyclePreStopHandlerTcpSocketHost" , containers.get(depth1).getLifecyclePreStopHandlerTcpSocketHost());
				putQueryParameter("Container." + (depth1 + 1) + ".SecurityContext.ReadOnlyRootFilesystem" , containers.get(depth1).getSecurityContextReadOnlyRootFilesystem());
				putQueryParameter("Container." + (depth1 + 1) + ".LifecyclePreStopHandlerHttpGetHost" , containers.get(depth1).getLifecyclePreStopHandlerHttpGetHost());
				putQueryParameter("Container." + (depth1 + 1) + ".Memory" , containers.get(depth1).getMemory());
				putQueryParameter("Container." + (depth1 + 1) + ".LifecyclePreStopHandlerHttpGetScheme" , containers.get(depth1).getLifecyclePreStopHandlerHttpGetScheme());
				putQueryParameter("Container." + (depth1 + 1) + ".LifecyclePostStartHandlerTcpSocketPort" , containers.get(depth1).getLifecyclePostStartHandlerTcpSocketPort());
				putQueryParameter("Container." + (depth1 + 1) + ".LifecyclePreStopHandlerHttpGetPath" , containers.get(depth1).getLifecyclePreStopHandlerHttpGetPath());
				putQueryParameter("Container." + (depth1 + 1) + ".LifecyclePostStartHandlerHttpGetHost" , containers.get(depth1).getLifecyclePostStartHandlerHttpGetHost());
				putQueryParameter("Container." + (depth1 + 1) + ".ReadinessProbe.FailureThreshold" , containers.get(depth1).getReadinessProbeFailureThreshold());
				if (containers.get(depth1).getArgs() != null) {
					for (int i = 0; i < containers.get(depth1).getArgs().size(); i++) {
						putQueryParameter("Container." + (depth1 + 1) + ".Arg." + (i + 1) , containers.get(depth1).getArgs().get(i));
					}
				}
				putQueryParameter("Container." + (depth1 + 1) + ".ReadinessProbe.SuccessThreshold" , containers.get(depth1).getReadinessProbeSuccessThreshold());
				putQueryParameter("Container." + (depth1 + 1) + ".LifecyclePostStartHandlerHttpGetPath" , containers.get(depth1).getLifecyclePostStartHandlerHttpGetPath());
				if (containers.get(depth1).getLifecyclePreStopHandlerExecs() != null) {
					for (int i = 0; i < containers.get(depth1).getLifecyclePreStopHandlerExecs().size(); i++) {
						putQueryParameter("Container." + (depth1 + 1) + ".LifecyclePreStopHandlerExec." + (i + 1) , containers.get(depth1).getLifecyclePreStopHandlerExecs().get(i));
					}
				}
				if (containers.get(depth1).getSecurityContextCapabilityAdds() != null) {
					for (int i = 0; i < containers.get(depth1).getSecurityContextCapabilityAdds().size(); i++) {
						putQueryParameter("Container." + (depth1 + 1) + ".SecurityContext.Capability.Add." + (i + 1) , containers.get(depth1).getSecurityContextCapabilityAdds().get(i));
					}
				}
				putQueryParameter("Container." + (depth1 + 1) + ".ReadinessProbe.InitialDelaySeconds" , containers.get(depth1).getReadinessProbeInitialDelaySeconds());
				if (containers.get(depth1).getReadinessProbeExecCommands() != null) {
					for (int i = 0; i < containers.get(depth1).getReadinessProbeExecCommands().size(); i++) {
						putQueryParameter("Container." + (depth1 + 1) + ".ReadinessProbe.Exec.Command." + (i + 1) , containers.get(depth1).getReadinessProbeExecCommands().get(i));
					}
				}
				putQueryParameter("Container." + (depth1 + 1) + ".ReadinessProbe.HttpGet.Scheme" , containers.get(depth1).getReadinessProbeHttpGetScheme());
				putQueryParameter("Container." + (depth1 + 1) + ".LifecyclePreStopHandlerHttpGetPort" , containers.get(depth1).getLifecyclePreStopHandlerHttpGetPort());
				putQueryParameter("Container." + (depth1 + 1) + ".ImagePullPolicy" , containers.get(depth1).getImagePullPolicy());
				if (containers.get(depth1).getCommands() != null) {
					for (int i = 0; i < containers.get(depth1).getCommands().size(); i++) {
						putQueryParameter("Container." + (depth1 + 1) + ".Command." + (i + 1) , containers.get(depth1).getCommands().get(i));
					}
				}
				putQueryParameter("Container." + (depth1 + 1) + ".LivenessProbe.HttpGet.Path" , containers.get(depth1).getLivenessProbeHttpGetPath());
				putQueryParameter("Container." + (depth1 + 1) + ".LifecyclePostStartHandlerHttpGetScheme" , containers.get(depth1).getLifecyclePostStartHandlerHttpGetScheme());
				putQueryParameter("Container." + (depth1 + 1) + ".LivenessProbe.TimeoutSeconds" , containers.get(depth1).getLivenessProbeTimeoutSeconds());
				putQueryParameter("Container." + (depth1 + 1) + ".LivenessProbe.TcpSocket.Port" , containers.get(depth1).getLivenessProbeTcpSocketPort());
				putQueryParameter("Container." + (depth1 + 1) + ".ReadinessProbe.PeriodSeconds" , containers.get(depth1).getReadinessProbePeriodSeconds());
				if (containers.get(depth1).getEnvironmentVars() != null) {
					for (int depth2 = 0; depth2 < containers.get(depth1).getEnvironmentVars().size(); depth2++) {
						putQueryParameter("Container." + (depth1 + 1) + ".EnvironmentVar." + (depth2 + 1) + ".FieldRefFieldPath" , containers.get(depth1).getEnvironmentVars().get(depth2).getFieldRefFieldPath());
						putQueryParameter("Container." + (depth1 + 1) + ".EnvironmentVar." + (depth2 + 1) + ".Value" , containers.get(depth1).getEnvironmentVars().get(depth2).getValue());
						putQueryParameter("Container." + (depth1 + 1) + ".EnvironmentVar." + (depth2 + 1) + ".Key" , containers.get(depth1).getEnvironmentVars().get(depth2).getKey());
					}
				}
				putQueryParameter("Container." + (depth1 + 1) + ".Tty" , containers.get(depth1).getTty());
				putQueryParameter("Container." + (depth1 + 1) + ".LivenessProbe.FailureThreshold" , containers.get(depth1).getLivenessProbeFailureThreshold());
				putQueryParameter("Container." + (depth1 + 1) + ".ReadinessProbe.TimeoutSeconds" , containers.get(depth1).getReadinessProbeTimeoutSeconds());
				putQueryParameter("Container." + (depth1 + 1) + ".ReadinessProbe.TcpSocket.Port" , containers.get(depth1).getReadinessProbeTcpSocketPort());
				putQueryParameter("Container." + (depth1 + 1) + ".LivenessProbe.HttpGet.Scheme" , containers.get(depth1).getLivenessProbeHttpGetScheme());
			}
		}	
	}

	public List<String> getNtpServers() {
		return this.ntpServers;
	}

	public void setNtpServers(List<String> ntpServers) {
		this.ntpServers = ntpServers;	
		if (ntpServers != null) {
			for (int i = 0; i < ntpServers.size(); i++) {
				putQueryParameter("NtpServer." + (i + 1) , ntpServers.get(i));
			}
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

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
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

	public Long getActiveDeadlineSeconds() {
		return this.activeDeadlineSeconds;
	}

	public void setActiveDeadlineSeconds(Long activeDeadlineSeconds) {
		this.activeDeadlineSeconds = activeDeadlineSeconds;
		if(activeDeadlineSeconds != null){
			putQueryParameter("ActiveDeadlineSeconds", activeDeadlineSeconds.toString());
		}
	}

	public Long getEgressBandwidth() {
		return this.egressBandwidth;
	}

	public void setEgressBandwidth(Long egressBandwidth) {
		this.egressBandwidth = egressBandwidth;
		if(egressBandwidth != null){
			putQueryParameter("EgressBandwidth", egressBandwidth.toString());
		}
	}

	public List<String> getDnsConfigSearchs() {
		return this.dnsConfigSearchs;
	}

	public void setDnsConfigSearchs(List<String> dnsConfigSearchs) {
		this.dnsConfigSearchs = dnsConfigSearchs;	
		if (dnsConfigSearchs != null) {
			for (int i = 0; i < dnsConfigSearchs.size(); i++) {
				putQueryParameter("DnsConfigSearch." + (i + 1) , dnsConfigSearchs.get(i));
			}
		}	
	}

	public List<HostAliase> getHostAliases() {
		return this.hostAliases;
	}

	public void setHostAliases(List<HostAliase> hostAliases) {
		this.hostAliases = hostAliases;	
		if (hostAliases != null) {
			for (int depth1 = 0; depth1 < hostAliases.size(); depth1++) {
				if (hostAliases.get(depth1).getHostnames() != null) {
					for (int i = 0; i < hostAliases.get(depth1).getHostnames().size(); i++) {
						putQueryParameter("HostAliase." + (depth1 + 1) + ".Hostname." + (i + 1) , hostAliases.get(depth1).getHostnames().get(i));
					}
				}
				putQueryParameter("HostAliase." + (depth1 + 1) + ".Ip" , hostAliases.get(depth1).getIp());
			}
		}	
	}

	public String getImageSnapshotId() {
		return this.imageSnapshotId;
	}

	public void setImageSnapshotId(String imageSnapshotId) {
		this.imageSnapshotId = imageSnapshotId;
		if(imageSnapshotId != null){
			putQueryParameter("ImageSnapshotId", imageSnapshotId);
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

	public Integer getCpuOptionsThreadsPerCore() {
		return this.cpuOptionsThreadsPerCore;
	}

	public void setCpuOptionsThreadsPerCore(Integer cpuOptionsThreadsPerCore) {
		this.cpuOptionsThreadsPerCore = cpuOptionsThreadsPerCore;
		if(cpuOptionsThreadsPerCore != null){
			putQueryParameter("CpuOptionsThreadsPerCore", cpuOptionsThreadsPerCore.toString());
		}
	}

	public String getDataCachePL() {
		return this.dataCachePL;
	}

	public void setDataCachePL(String dataCachePL) {
		this.dataCachePL = dataCachePL;
		if(dataCachePL != null){
			putQueryParameter("DataCachePL", dataCachePL);
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

	public Float getCpu() {
		return this.cpu;
	}

	public void setCpu(Float cpu) {
		this.cpu = cpu;
		if(cpu != null){
			putQueryParameter("Cpu", cpu.toString());
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

	public String getScalingConfigurationName() {
		return this.scalingConfigurationName;
	}

	public void setScalingConfigurationName(String scalingConfigurationName) {
		this.scalingConfigurationName = scalingConfigurationName;
		if(scalingConfigurationName != null){
			putQueryParameter("ScalingConfigurationName", scalingConfigurationName);
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

	public List<Volume> getVolumes() {
		return this.volumes;
	}

	public void setVolumes(List<Volume> volumes) {
		this.volumes = volumes;	
		if (volumes != null) {
			for (int depth1 = 0; depth1 < volumes.size(); depth1++) {
				putQueryParameter("Volume." + (depth1 + 1) + ".DiskVolume.FsType" , volumes.get(depth1).getDiskVolumeFsType());
				putQueryParameter("Volume." + (depth1 + 1) + ".EmptyDirVolume.SizeLimit" , volumes.get(depth1).getEmptyDirVolumeSizeLimit());
				putQueryParameter("Volume." + (depth1 + 1) + ".NFSVolume.Path" , volumes.get(depth1).getNFSVolumePath());
				putQueryParameter("Volume." + (depth1 + 1) + ".DiskVolume.DiskId" , volumes.get(depth1).getDiskVolumeDiskId());
				putQueryParameter("Volume." + (depth1 + 1) + ".FlexVolume.FsType" , volumes.get(depth1).getFlexVolumeFsType());
				putQueryParameter("Volume." + (depth1 + 1) + ".Type" , volumes.get(depth1).getType());
				putQueryParameter("Volume." + (depth1 + 1) + ".FlexVolume.Driver" , volumes.get(depth1).getFlexVolumeDriver());
				putQueryParameter("Volume." + (depth1 + 1) + ".FlexVolume.Options" , volumes.get(depth1).getFlexVolumeOptions());
				putQueryParameter("Volume." + (depth1 + 1) + ".NFSVolume.Server" , volumes.get(depth1).getNFSVolumeServer());
				putQueryParameter("Volume." + (depth1 + 1) + ".EmptyDirVolume.Medium" , volumes.get(depth1).getEmptyDirVolumeMedium());
				putQueryParameter("Volume." + (depth1 + 1) + ".HostPathVolume.Path" , volumes.get(depth1).getHostPathVolumePath());
				putQueryParameter("Volume." + (depth1 + 1) + ".Name" , volumes.get(depth1).getName());
				if (volumes.get(depth1).getConfigFileVolumeConfigFileToPaths() != null) {
					for (int depth2 = 0; depth2 < volumes.get(depth1).getConfigFileVolumeConfigFileToPaths().size(); depth2++) {
						putQueryParameter("Volume." + (depth1 + 1) + ".ConfigFileVolumeConfigFileToPath." + (depth2 + 1) + ".Mode" , volumes.get(depth1).getConfigFileVolumeConfigFileToPaths().get(depth2).getMode());
						putQueryParameter("Volume." + (depth1 + 1) + ".ConfigFileVolumeConfigFileToPath." + (depth2 + 1) + ".Path" , volumes.get(depth1).getConfigFileVolumeConfigFileToPaths().get(depth2).getPath());
						putQueryParameter("Volume." + (depth1 + 1) + ".ConfigFileVolumeConfigFileToPath." + (depth2 + 1) + ".Content" , volumes.get(depth1).getConfigFileVolumeConfigFileToPaths().get(depth2).getContent());
					}
				}
				putQueryParameter("Volume." + (depth1 + 1) + ".DiskVolume.DiskSize" , volumes.get(depth1).getDiskVolumeDiskSize());
				putQueryParameter("Volume." + (depth1 + 1) + ".ConfigFileVolumeDefaultMode" , volumes.get(depth1).getConfigFileVolumeDefaultMode());
				putQueryParameter("Volume." + (depth1 + 1) + ".HostPathVolume.Type" , volumes.get(depth1).getHostPathVolumeType());
				putQueryParameter("Volume." + (depth1 + 1) + ".NFSVolume.ReadOnly" , volumes.get(depth1).getNFSVolumeReadOnly());
			}
		}	
	}

	public String getInstanceFamilyLevel() {
		return this.instanceFamilyLevel;
	}

	public void setInstanceFamilyLevel(String instanceFamilyLevel) {
		this.instanceFamilyLevel = instanceFamilyLevel;
		if(instanceFamilyLevel != null){
			putQueryParameter("InstanceFamilyLevel", instanceFamilyLevel);
		}
	}

	public List<DnsConfigOption> getDnsConfigOptions() {
		return this.dnsConfigOptions;
	}

	public void setDnsConfigOptions(List<DnsConfigOption> dnsConfigOptions) {
		this.dnsConfigOptions = dnsConfigOptions;	
		if (dnsConfigOptions != null) {
			for (int depth1 = 0; depth1 < dnsConfigOptions.size(); depth1++) {
				putQueryParameter("DnsConfigOption." + (depth1 + 1) + ".Name" , dnsConfigOptions.get(depth1).getName());
				putQueryParameter("DnsConfigOption." + (depth1 + 1) + ".Value" , dnsConfigOptions.get(depth1).getValue());
			}
		}	
	}

	public Integer getEphemeralStorage() {
		return this.ephemeralStorage;
	}

	public void setEphemeralStorage(Integer ephemeralStorage) {
		this.ephemeralStorage = ephemeralStorage;
		if(ephemeralStorage != null){
			putQueryParameter("EphemeralStorage", ephemeralStorage.toString());
		}
	}

	public Integer getDataCacheProvisionedIops() {
		return this.dataCacheProvisionedIops;
	}

	public void setDataCacheProvisionedIops(Integer dataCacheProvisionedIops) {
		this.dataCacheProvisionedIops = dataCacheProvisionedIops;
		if(dataCacheProvisionedIops != null){
			putQueryParameter("DataCacheProvisionedIops", dataCacheProvisionedIops.toString());
		}
	}

	public Integer getEipBandwidth() {
		return this.eipBandwidth;
	}

	public void setEipBandwidth(Integer eipBandwidth) {
		this.eipBandwidth = eipBandwidth;
		if(eipBandwidth != null){
			putQueryParameter("EipBandwidth", eipBandwidth.toString());
		}
	}

	public String getGpuDriverVersion() {
		return this.gpuDriverVersion;
	}

	public void setGpuDriverVersion(String gpuDriverVersion) {
		this.gpuDriverVersion = gpuDriverVersion;
		if(gpuDriverVersion != null){
			putQueryParameter("GpuDriverVersion", gpuDriverVersion);
		}
	}

	public Boolean getCostOptimization() {
		return this.costOptimization;
	}

	public void setCostOptimization(Boolean costOptimization) {
		this.costOptimization = costOptimization;
		if(costOptimization != null){
			putQueryParameter("CostOptimization", costOptimization.toString());
		}
	}

	public Boolean getDataCacheBurstingEnabled() {
		return this.dataCacheBurstingEnabled;
	}

	public void setDataCacheBurstingEnabled(Boolean dataCacheBurstingEnabled) {
		this.dataCacheBurstingEnabled = dataCacheBurstingEnabled;
		if(dataCacheBurstingEnabled != null){
			putQueryParameter("DataCacheBurstingEnabled", dataCacheBurstingEnabled.toString());
		}
	}

	public Float getMemory() {
		return this.memory;
	}

	public void setMemory(Float memory) {
		this.memory = memory;
		if(memory != null){
			putQueryParameter("Memory", memory.toString());
		}
	}

	public String getScalingGroupId() {
		return this.scalingGroupId;
	}

	public void setScalingGroupId(String scalingGroupId) {
		this.scalingGroupId = scalingGroupId;
		if(scalingGroupId != null){
			putQueryParameter("ScalingGroupId", scalingGroupId);
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

	public Long getIngressBandwidth() {
		return this.ingressBandwidth;
	}

	public void setIngressBandwidth(Long ingressBandwidth) {
		this.ingressBandwidth = ingressBandwidth;
		if(ingressBandwidth != null){
			putQueryParameter("IngressBandwidth", ingressBandwidth.toString());
		}
	}

	public String getDnsPolicy() {
		return this.dnsPolicy;
	}

	public void setDnsPolicy(String dnsPolicy) {
		this.dnsPolicy = dnsPolicy;
		if(dnsPolicy != null){
			putQueryParameter("DnsPolicy", dnsPolicy);
		}
	}

	public List<SecurityContextSysctl> getSecurityContextSysctls() {
		return this.securityContextSysctls;
	}

	public void setSecurityContextSysctls(List<SecurityContextSysctl> securityContextSysctls) {
		this.securityContextSysctls = securityContextSysctls;	
		if (securityContextSysctls != null) {
			for (int depth1 = 0; depth1 < securityContextSysctls.size(); depth1++) {
				putQueryParameter("SecurityContextSysctl." + (depth1 + 1) + ".Name" , securityContextSysctls.get(depth1).getName());
				putQueryParameter("SecurityContextSysctl." + (depth1 + 1) + ".Value" , securityContextSysctls.get(depth1).getValue());
			}
		}	
	}

	public String getDataCacheBucket() {
		return this.dataCacheBucket;
	}

	public void setDataCacheBucket(String dataCacheBucket) {
		this.dataCacheBucket = dataCacheBucket;
		if(dataCacheBucket != null){
			putQueryParameter("DataCacheBucket", dataCacheBucket);
		}
	}

	public List<String> getDnsConfigNameServers() {
		return this.dnsConfigNameServers;
	}

	public void setDnsConfigNameServers(List<String> dnsConfigNameServers) {
		this.dnsConfigNameServers = dnsConfigNameServers;	
		if (dnsConfigNameServers != null) {
			for (int i = 0; i < dnsConfigNameServers.size(); i++) {
				putQueryParameter("DnsConfigNameServer." + (i + 1) , dnsConfigNameServers.get(i));
			}
		}	
	}

	public List<InitContainer> getInitContainers() {
		return this.initContainers;
	}

	public void setInitContainers(List<InitContainer> initContainers) {
		this.initContainers = initContainers;	
		if (initContainers != null) {
			for (int depth1 = 0; depth1 < initContainers.size(); depth1++) {
				putQueryParameter("InitContainer." + (depth1 + 1) + ".Image" , initContainers.get(depth1).getImage());
				if (initContainers.get(depth1).getInitContainerEnvironmentVars() != null) {
					for (int depth2 = 0; depth2 < initContainers.get(depth1).getInitContainerEnvironmentVars().size(); depth2++) {
						putQueryParameter("InitContainer." + (depth1 + 1) + ".InitContainerEnvironmentVar." + (depth2 + 1) + ".FieldRefFieldPath" , initContainers.get(depth1).getInitContainerEnvironmentVars().get(depth2).getFieldRefFieldPath());
						putQueryParameter("InitContainer." + (depth1 + 1) + ".InitContainerEnvironmentVar." + (depth2 + 1) + ".Value" , initContainers.get(depth1).getInitContainerEnvironmentVars().get(depth2).getValue());
						putQueryParameter("InitContainer." + (depth1 + 1) + ".InitContainerEnvironmentVar." + (depth2 + 1) + ".Key" , initContainers.get(depth1).getInitContainerEnvironmentVars().get(depth2).getKey());
					}
				}
				if (initContainers.get(depth1).getSecurityContextCapabilityAdds() != null) {
					for (int i = 0; i < initContainers.get(depth1).getSecurityContextCapabilityAdds().size(); i++) {
						putQueryParameter("InitContainer." + (depth1 + 1) + ".SecurityContext.Capability.Add." + (i + 1) , initContainers.get(depth1).getSecurityContextCapabilityAdds().get(i));
					}
				}
				putQueryParameter("InitContainer." + (depth1 + 1) + ".Memory" , initContainers.get(depth1).getMemory());
				putQueryParameter("InitContainer." + (depth1 + 1) + ".WorkingDir" , initContainers.get(depth1).getWorkingDir());
				putQueryParameter("InitContainer." + (depth1 + 1) + ".Cpu" , initContainers.get(depth1).getCpu());
				putQueryParameter("InitContainer." + (depth1 + 1) + ".Gpu" , initContainers.get(depth1).getGpu());
				putQueryParameter("InitContainer." + (depth1 + 1) + ".ImagePullPolicy" , initContainers.get(depth1).getImagePullPolicy());
				if (initContainers.get(depth1).getCommands() != null) {
					for (int i = 0; i < initContainers.get(depth1).getCommands().size(); i++) {
						putQueryParameter("InitContainer." + (depth1 + 1) + ".Command." + (i + 1) , initContainers.get(depth1).getCommands().get(i));
					}
				}
				putQueryParameter("InitContainer." + (depth1 + 1) + ".SecurityContext.RunAsUser" , initContainers.get(depth1).getSecurityContextRunAsUser());
				if (initContainers.get(depth1).getInitContainerPorts() != null) {
					for (int depth2 = 0; depth2 < initContainers.get(depth1).getInitContainerPorts().size(); depth2++) {
						putQueryParameter("InitContainer." + (depth1 + 1) + ".InitContainerPort." + (depth2 + 1) + ".Protocol" , initContainers.get(depth1).getInitContainerPorts().get(depth2).getBizProtocol());
						putQueryParameter("InitContainer." + (depth1 + 1) + ".InitContainerPort." + (depth2 + 1) + ".Port" , initContainers.get(depth1).getInitContainerPorts().get(depth2).getPort());
					}
				}
				if (initContainers.get(depth1).getArgs() != null) {
					for (int i = 0; i < initContainers.get(depth1).getArgs().size(); i++) {
						putQueryParameter("InitContainer." + (depth1 + 1) + ".Arg." + (i + 1) , initContainers.get(depth1).getArgs().get(i));
					}
				}
				putQueryParameter("InitContainer." + (depth1 + 1) + ".Name" , initContainers.get(depth1).getName());
				if (initContainers.get(depth1).getInitContainerVolumeMounts() != null) {
					for (int depth2 = 0; depth2 < initContainers.get(depth1).getInitContainerVolumeMounts().size(); depth2++) {
						putQueryParameter("InitContainer." + (depth1 + 1) + ".InitContainerVolumeMount." + (depth2 + 1) + ".MountPath" , initContainers.get(depth1).getInitContainerVolumeMounts().get(depth2).getMountPath());
						putQueryParameter("InitContainer." + (depth1 + 1) + ".InitContainerVolumeMount." + (depth2 + 1) + ".ReadOnly" , initContainers.get(depth1).getInitContainerVolumeMounts().get(depth2).getReadOnly());
						putQueryParameter("InitContainer." + (depth1 + 1) + ".InitContainerVolumeMount." + (depth2 + 1) + ".MountPropagation" , initContainers.get(depth1).getInitContainerVolumeMounts().get(depth2).getMountPropagation());
						putQueryParameter("InitContainer." + (depth1 + 1) + ".InitContainerVolumeMount." + (depth2 + 1) + ".Name" , initContainers.get(depth1).getInitContainerVolumeMounts().get(depth2).getName());
						putQueryParameter("InitContainer." + (depth1 + 1) + ".InitContainerVolumeMount." + (depth2 + 1) + ".SubPath" , initContainers.get(depth1).getInitContainerVolumeMounts().get(depth2).getSubPath());
					}
				}
				putQueryParameter("InitContainer." + (depth1 + 1) + ".SecurityContext.ReadOnlyRootFilesystem" , initContainers.get(depth1).getSecurityContextReadOnlyRootFilesystem());
			}
		}	
	}

	public List<String> getInstanceTypes() {
		return this.instanceTypes;
	}

	public void setInstanceTypes(List<String> instanceTypes) {
		this.instanceTypes = instanceTypes;	
		if (instanceTypes != null) {
			for (int i = 0; i < instanceTypes.size(); i++) {
				putQueryParameter("InstanceType." + (i + 1) , instanceTypes.get(i));
			}
		}	
	}

	public Long getTerminationGracePeriodSeconds() {
		return this.terminationGracePeriodSeconds;
	}

	public void setTerminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {
		this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
		if(terminationGracePeriodSeconds != null){
			putQueryParameter("TerminationGracePeriodSeconds", terminationGracePeriodSeconds.toString());
		}
	}

	public List<ImageRegistryCredential> getImageRegistryCredentials() {
		return this.imageRegistryCredentials;
	}

	public void setImageRegistryCredentials(List<ImageRegistryCredential> imageRegistryCredentials) {
		this.imageRegistryCredentials = imageRegistryCredentials;	
		if (imageRegistryCredentials != null) {
			for (int depth1 = 0; depth1 < imageRegistryCredentials.size(); depth1++) {
				putQueryParameter("ImageRegistryCredential." + (depth1 + 1) + ".Server" , imageRegistryCredentials.get(depth1).getServer());
				putQueryParameter("ImageRegistryCredential." + (depth1 + 1) + ".Password" , imageRegistryCredentials.get(depth1).getPassword());
				putQueryParameter("ImageRegistryCredential." + (depth1 + 1) + ".UserName" , imageRegistryCredentials.get(depth1).getUserName());
			}
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

	public String getRestartPolicy() {
		return this.restartPolicy;
	}

	public void setRestartPolicy(String restartPolicy) {
		this.restartPolicy = restartPolicy;
		if(restartPolicy != null){
			putQueryParameter("RestartPolicy", restartPolicy);
		}
	}

	public Integer getCpuOptionsCore() {
		return this.cpuOptionsCore;
	}

	public void setCpuOptionsCore(Integer cpuOptionsCore) {
		this.cpuOptionsCore = cpuOptionsCore;
		if(cpuOptionsCore != null){
			putQueryParameter("CpuOptionsCore", cpuOptionsCore.toString());
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

	public List<AcrRegistryInfo> getAcrRegistryInfos() {
		return this.acrRegistryInfos;
	}

	public void setAcrRegistryInfos(List<AcrRegistryInfo> acrRegistryInfos) {
		this.acrRegistryInfos = acrRegistryInfos;	
		if (acrRegistryInfos != null) {
			for (int depth1 = 0; depth1 < acrRegistryInfos.size(); depth1++) {
				putQueryParameter("AcrRegistryInfo." + (depth1 + 1) + ".InstanceName" , acrRegistryInfos.get(depth1).getInstanceName());
				putQueryParameter("AcrRegistryInfo." + (depth1 + 1) + ".InstanceId" , acrRegistryInfos.get(depth1).getInstanceId());
				putQueryParameter("AcrRegistryInfo." + (depth1 + 1) + ".RegionId" , acrRegistryInfos.get(depth1).getRegionId());
				if (acrRegistryInfos.get(depth1).getDomains() != null) {
					for (int i = 0; i < acrRegistryInfos.get(depth1).getDomains().size(); i++) {
						putQueryParameter("AcrRegistryInfo." + (depth1 + 1) + ".Domain." + (i + 1) , acrRegistryInfos.get(depth1).getDomains().get(i));
					}
				}
			}
		}	
	}

	public Boolean getAutoMatchImageCache() {
		return this.autoMatchImageCache;
	}

	public void setAutoMatchImageCache(Boolean autoMatchImageCache) {
		this.autoMatchImageCache = autoMatchImageCache;
		if(autoMatchImageCache != null){
			putQueryParameter("AutoMatchImageCache", autoMatchImageCache.toString());
		}
	}

	public Integer getLoadBalancerWeight() {
		return this.loadBalancerWeight;
	}

	public void setLoadBalancerWeight(Integer loadBalancerWeight) {
		this.loadBalancerWeight = loadBalancerWeight;
		if(loadBalancerWeight != null){
			putQueryParameter("LoadBalancerWeight", loadBalancerWeight.toString());
		}
	}

	public String getContainerGroupName() {
		return this.containerGroupName;
	}

	public void setContainerGroupName(String containerGroupName) {
		this.containerGroupName = containerGroupName;
		if(containerGroupName != null){
			putQueryParameter("ContainerGroupName", containerGroupName);
		}
	}

	public Boolean getAutoCreateEip() {
		return this.autoCreateEip;
	}

	public void setAutoCreateEip(Boolean autoCreateEip) {
		this.autoCreateEip = autoCreateEip;
		if(autoCreateEip != null){
			putQueryParameter("AutoCreateEip", autoCreateEip.toString());
		}
	}

	public static class Container {

		private Boolean stdin;

		private List<String> livenessProbeExecCommands;

		private Integer lifecyclePostStartHandlerHttpGetPort;

		private String workingDir;

		private Integer readinessProbeHttpGetPort;

		private Integer livenessProbeHttpGetPort;

		private Integer lifecyclePreStopHandlerTcpSocketPort;

		private List<VolumeMount> volumeMounts;

		private String image;

		private List<String> lifecyclePostStartHandlerExecs;

		private Float cpu;

		private String readinessProbeHttpGetPath;

		private Integer gpu;

		private Boolean stdinOnce;

		private String lifecyclePostStartHandlerTcpSocketHost;

		private Integer livenessProbeSuccessThreshold;

		private Long securityContextRunAsUser;

		private Integer livenessProbePeriodSeconds;

		private Integer livenessProbeInitialDelaySeconds;

		private List<Port> ports;

		private String name;

		private String lifecyclePreStopHandlerTcpSocketHost;

		private Boolean securityContextReadOnlyRootFilesystem;

		private String lifecyclePreStopHandlerHttpGetHost;

		private Float memory;

		private String lifecyclePreStopHandlerHttpGetScheme;

		private Integer lifecyclePostStartHandlerTcpSocketPort;

		private String lifecyclePreStopHandlerHttpGetPath;

		private String lifecyclePostStartHandlerHttpGetHost;

		private Integer readinessProbeFailureThreshold;

		private List<String> args;

		private Integer readinessProbeSuccessThreshold;

		private String lifecyclePostStartHandlerHttpGetPath;

		private List<String> lifecyclePreStopHandlerExecs;

		private List<String> securityContextCapabilityAdds;

		private Integer readinessProbeInitialDelaySeconds;

		private List<String> readinessProbeExecCommands;

		private String readinessProbeHttpGetScheme;

		private Integer lifecyclePreStopHandlerHttpGetPort;

		private String imagePullPolicy;

		private List<String> commands;

		private String livenessProbeHttpGetPath;

		private String lifecyclePostStartHandlerHttpGetScheme;

		private Integer livenessProbeTimeoutSeconds;

		private Integer livenessProbeTcpSocketPort;

		private Integer readinessProbePeriodSeconds;

		private List<EnvironmentVar> environmentVars;

		private Boolean tty;

		private Integer livenessProbeFailureThreshold;

		private Integer readinessProbeTimeoutSeconds;

		private Integer readinessProbeTcpSocketPort;

		private String livenessProbeHttpGetScheme;

		public Boolean getStdin() {
			return this.stdin;
		}

		public void setStdin(Boolean stdin) {
			this.stdin = stdin;
		}

		public List<String> getLivenessProbeExecCommands() {
			return this.livenessProbeExecCommands;
		}

		public void setLivenessProbeExecCommands(List<String> livenessProbeExecCommands) {
			this.livenessProbeExecCommands = livenessProbeExecCommands;
		}

		public Integer getLifecyclePostStartHandlerHttpGetPort() {
			return this.lifecyclePostStartHandlerHttpGetPort;
		}

		public void setLifecyclePostStartHandlerHttpGetPort(Integer lifecyclePostStartHandlerHttpGetPort) {
			this.lifecyclePostStartHandlerHttpGetPort = lifecyclePostStartHandlerHttpGetPort;
		}

		public String getWorkingDir() {
			return this.workingDir;
		}

		public void setWorkingDir(String workingDir) {
			this.workingDir = workingDir;
		}

		public Integer getReadinessProbeHttpGetPort() {
			return this.readinessProbeHttpGetPort;
		}

		public void setReadinessProbeHttpGetPort(Integer readinessProbeHttpGetPort) {
			this.readinessProbeHttpGetPort = readinessProbeHttpGetPort;
		}

		public Integer getLivenessProbeHttpGetPort() {
			return this.livenessProbeHttpGetPort;
		}

		public void setLivenessProbeHttpGetPort(Integer livenessProbeHttpGetPort) {
			this.livenessProbeHttpGetPort = livenessProbeHttpGetPort;
		}

		public Integer getLifecyclePreStopHandlerTcpSocketPort() {
			return this.lifecyclePreStopHandlerTcpSocketPort;
		}

		public void setLifecyclePreStopHandlerTcpSocketPort(Integer lifecyclePreStopHandlerTcpSocketPort) {
			this.lifecyclePreStopHandlerTcpSocketPort = lifecyclePreStopHandlerTcpSocketPort;
		}

		public List<VolumeMount> getVolumeMounts() {
			return this.volumeMounts;
		}

		public void setVolumeMounts(List<VolumeMount> volumeMounts) {
			this.volumeMounts = volumeMounts;
		}

		public String getImage() {
			return this.image;
		}

		public void setImage(String image) {
			this.image = image;
		}

		public List<String> getLifecyclePostStartHandlerExecs() {
			return this.lifecyclePostStartHandlerExecs;
		}

		public void setLifecyclePostStartHandlerExecs(List<String> lifecyclePostStartHandlerExecs) {
			this.lifecyclePostStartHandlerExecs = lifecyclePostStartHandlerExecs;
		}

		public Float getCpu() {
			return this.cpu;
		}

		public void setCpu(Float cpu) {
			this.cpu = cpu;
		}

		public String getReadinessProbeHttpGetPath() {
			return this.readinessProbeHttpGetPath;
		}

		public void setReadinessProbeHttpGetPath(String readinessProbeHttpGetPath) {
			this.readinessProbeHttpGetPath = readinessProbeHttpGetPath;
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

		public String getLifecyclePostStartHandlerTcpSocketHost() {
			return this.lifecyclePostStartHandlerTcpSocketHost;
		}

		public void setLifecyclePostStartHandlerTcpSocketHost(String lifecyclePostStartHandlerTcpSocketHost) {
			this.lifecyclePostStartHandlerTcpSocketHost = lifecyclePostStartHandlerTcpSocketHost;
		}

		public Integer getLivenessProbeSuccessThreshold() {
			return this.livenessProbeSuccessThreshold;
		}

		public void setLivenessProbeSuccessThreshold(Integer livenessProbeSuccessThreshold) {
			this.livenessProbeSuccessThreshold = livenessProbeSuccessThreshold;
		}

		public Long getSecurityContextRunAsUser() {
			return this.securityContextRunAsUser;
		}

		public void setSecurityContextRunAsUser(Long securityContextRunAsUser) {
			this.securityContextRunAsUser = securityContextRunAsUser;
		}

		public Integer getLivenessProbePeriodSeconds() {
			return this.livenessProbePeriodSeconds;
		}

		public void setLivenessProbePeriodSeconds(Integer livenessProbePeriodSeconds) {
			this.livenessProbePeriodSeconds = livenessProbePeriodSeconds;
		}

		public Integer getLivenessProbeInitialDelaySeconds() {
			return this.livenessProbeInitialDelaySeconds;
		}

		public void setLivenessProbeInitialDelaySeconds(Integer livenessProbeInitialDelaySeconds) {
			this.livenessProbeInitialDelaySeconds = livenessProbeInitialDelaySeconds;
		}

		public List<Port> getPorts() {
			return this.ports;
		}

		public void setPorts(List<Port> ports) {
			this.ports = ports;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLifecyclePreStopHandlerTcpSocketHost() {
			return this.lifecyclePreStopHandlerTcpSocketHost;
		}

		public void setLifecyclePreStopHandlerTcpSocketHost(String lifecyclePreStopHandlerTcpSocketHost) {
			this.lifecyclePreStopHandlerTcpSocketHost = lifecyclePreStopHandlerTcpSocketHost;
		}

		public Boolean getSecurityContextReadOnlyRootFilesystem() {
			return this.securityContextReadOnlyRootFilesystem;
		}

		public void setSecurityContextReadOnlyRootFilesystem(Boolean securityContextReadOnlyRootFilesystem) {
			this.securityContextReadOnlyRootFilesystem = securityContextReadOnlyRootFilesystem;
		}

		public String getLifecyclePreStopHandlerHttpGetHost() {
			return this.lifecyclePreStopHandlerHttpGetHost;
		}

		public void setLifecyclePreStopHandlerHttpGetHost(String lifecyclePreStopHandlerHttpGetHost) {
			this.lifecyclePreStopHandlerHttpGetHost = lifecyclePreStopHandlerHttpGetHost;
		}

		public Float getMemory() {
			return this.memory;
		}

		public void setMemory(Float memory) {
			this.memory = memory;
		}

		public String getLifecyclePreStopHandlerHttpGetScheme() {
			return this.lifecyclePreStopHandlerHttpGetScheme;
		}

		public void setLifecyclePreStopHandlerHttpGetScheme(String lifecyclePreStopHandlerHttpGetScheme) {
			this.lifecyclePreStopHandlerHttpGetScheme = lifecyclePreStopHandlerHttpGetScheme;
		}

		public Integer getLifecyclePostStartHandlerTcpSocketPort() {
			return this.lifecyclePostStartHandlerTcpSocketPort;
		}

		public void setLifecyclePostStartHandlerTcpSocketPort(Integer lifecyclePostStartHandlerTcpSocketPort) {
			this.lifecyclePostStartHandlerTcpSocketPort = lifecyclePostStartHandlerTcpSocketPort;
		}

		public String getLifecyclePreStopHandlerHttpGetPath() {
			return this.lifecyclePreStopHandlerHttpGetPath;
		}

		public void setLifecyclePreStopHandlerHttpGetPath(String lifecyclePreStopHandlerHttpGetPath) {
			this.lifecyclePreStopHandlerHttpGetPath = lifecyclePreStopHandlerHttpGetPath;
		}

		public String getLifecyclePostStartHandlerHttpGetHost() {
			return this.lifecyclePostStartHandlerHttpGetHost;
		}

		public void setLifecyclePostStartHandlerHttpGetHost(String lifecyclePostStartHandlerHttpGetHost) {
			this.lifecyclePostStartHandlerHttpGetHost = lifecyclePostStartHandlerHttpGetHost;
		}

		public Integer getReadinessProbeFailureThreshold() {
			return this.readinessProbeFailureThreshold;
		}

		public void setReadinessProbeFailureThreshold(Integer readinessProbeFailureThreshold) {
			this.readinessProbeFailureThreshold = readinessProbeFailureThreshold;
		}

		public List<String> getArgs() {
			return this.args;
		}

		public void setArgs(List<String> args) {
			this.args = args;
		}

		public Integer getReadinessProbeSuccessThreshold() {
			return this.readinessProbeSuccessThreshold;
		}

		public void setReadinessProbeSuccessThreshold(Integer readinessProbeSuccessThreshold) {
			this.readinessProbeSuccessThreshold = readinessProbeSuccessThreshold;
		}

		public String getLifecyclePostStartHandlerHttpGetPath() {
			return this.lifecyclePostStartHandlerHttpGetPath;
		}

		public void setLifecyclePostStartHandlerHttpGetPath(String lifecyclePostStartHandlerHttpGetPath) {
			this.lifecyclePostStartHandlerHttpGetPath = lifecyclePostStartHandlerHttpGetPath;
		}

		public List<String> getLifecyclePreStopHandlerExecs() {
			return this.lifecyclePreStopHandlerExecs;
		}

		public void setLifecyclePreStopHandlerExecs(List<String> lifecyclePreStopHandlerExecs) {
			this.lifecyclePreStopHandlerExecs = lifecyclePreStopHandlerExecs;
		}

		public List<String> getSecurityContextCapabilityAdds() {
			return this.securityContextCapabilityAdds;
		}

		public void setSecurityContextCapabilityAdds(List<String> securityContextCapabilityAdds) {
			this.securityContextCapabilityAdds = securityContextCapabilityAdds;
		}

		public Integer getReadinessProbeInitialDelaySeconds() {
			return this.readinessProbeInitialDelaySeconds;
		}

		public void setReadinessProbeInitialDelaySeconds(Integer readinessProbeInitialDelaySeconds) {
			this.readinessProbeInitialDelaySeconds = readinessProbeInitialDelaySeconds;
		}

		public List<String> getReadinessProbeExecCommands() {
			return this.readinessProbeExecCommands;
		}

		public void setReadinessProbeExecCommands(List<String> readinessProbeExecCommands) {
			this.readinessProbeExecCommands = readinessProbeExecCommands;
		}

		public String getReadinessProbeHttpGetScheme() {
			return this.readinessProbeHttpGetScheme;
		}

		public void setReadinessProbeHttpGetScheme(String readinessProbeHttpGetScheme) {
			this.readinessProbeHttpGetScheme = readinessProbeHttpGetScheme;
		}

		public Integer getLifecyclePreStopHandlerHttpGetPort() {
			return this.lifecyclePreStopHandlerHttpGetPort;
		}

		public void setLifecyclePreStopHandlerHttpGetPort(Integer lifecyclePreStopHandlerHttpGetPort) {
			this.lifecyclePreStopHandlerHttpGetPort = lifecyclePreStopHandlerHttpGetPort;
		}

		public String getImagePullPolicy() {
			return this.imagePullPolicy;
		}

		public void setImagePullPolicy(String imagePullPolicy) {
			this.imagePullPolicy = imagePullPolicy;
		}

		public List<String> getCommands() {
			return this.commands;
		}

		public void setCommands(List<String> commands) {
			this.commands = commands;
		}

		public String getLivenessProbeHttpGetPath() {
			return this.livenessProbeHttpGetPath;
		}

		public void setLivenessProbeHttpGetPath(String livenessProbeHttpGetPath) {
			this.livenessProbeHttpGetPath = livenessProbeHttpGetPath;
		}

		public String getLifecyclePostStartHandlerHttpGetScheme() {
			return this.lifecyclePostStartHandlerHttpGetScheme;
		}

		public void setLifecyclePostStartHandlerHttpGetScheme(String lifecyclePostStartHandlerHttpGetScheme) {
			this.lifecyclePostStartHandlerHttpGetScheme = lifecyclePostStartHandlerHttpGetScheme;
		}

		public Integer getLivenessProbeTimeoutSeconds() {
			return this.livenessProbeTimeoutSeconds;
		}

		public void setLivenessProbeTimeoutSeconds(Integer livenessProbeTimeoutSeconds) {
			this.livenessProbeTimeoutSeconds = livenessProbeTimeoutSeconds;
		}

		public Integer getLivenessProbeTcpSocketPort() {
			return this.livenessProbeTcpSocketPort;
		}

		public void setLivenessProbeTcpSocketPort(Integer livenessProbeTcpSocketPort) {
			this.livenessProbeTcpSocketPort = livenessProbeTcpSocketPort;
		}

		public Integer getReadinessProbePeriodSeconds() {
			return this.readinessProbePeriodSeconds;
		}

		public void setReadinessProbePeriodSeconds(Integer readinessProbePeriodSeconds) {
			this.readinessProbePeriodSeconds = readinessProbePeriodSeconds;
		}

		public List<EnvironmentVar> getEnvironmentVars() {
			return this.environmentVars;
		}

		public void setEnvironmentVars(List<EnvironmentVar> environmentVars) {
			this.environmentVars = environmentVars;
		}

		public Boolean getTty() {
			return this.tty;
		}

		public void setTty(Boolean tty) {
			this.tty = tty;
		}

		public Integer getLivenessProbeFailureThreshold() {
			return this.livenessProbeFailureThreshold;
		}

		public void setLivenessProbeFailureThreshold(Integer livenessProbeFailureThreshold) {
			this.livenessProbeFailureThreshold = livenessProbeFailureThreshold;
		}

		public Integer getReadinessProbeTimeoutSeconds() {
			return this.readinessProbeTimeoutSeconds;
		}

		public void setReadinessProbeTimeoutSeconds(Integer readinessProbeTimeoutSeconds) {
			this.readinessProbeTimeoutSeconds = readinessProbeTimeoutSeconds;
		}

		public Integer getReadinessProbeTcpSocketPort() {
			return this.readinessProbeTcpSocketPort;
		}

		public void setReadinessProbeTcpSocketPort(Integer readinessProbeTcpSocketPort) {
			this.readinessProbeTcpSocketPort = readinessProbeTcpSocketPort;
		}

		public String getLivenessProbeHttpGetScheme() {
			return this.livenessProbeHttpGetScheme;
		}

		public void setLivenessProbeHttpGetScheme(String livenessProbeHttpGetScheme) {
			this.livenessProbeHttpGetScheme = livenessProbeHttpGetScheme;
		}

		public static class VolumeMount {

			private String mountPath;

			private Boolean readOnly;

			private String mountPropagation;

			private String name;

			private String subPath;

			public String getMountPath() {
				return this.mountPath;
			}

			public void setMountPath(String mountPath) {
				this.mountPath = mountPath;
			}

			public Boolean getReadOnly() {
				return this.readOnly;
			}

			public void setReadOnly(Boolean readOnly) {
				this.readOnly = readOnly;
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

			public String getSubPath() {
				return this.subPath;
			}

			public void setSubPath(String subPath) {
				this.subPath = subPath;
			}
		}

		public static class Port {

			private String protocol;

			private Integer port;

			public String getBizProtocol() {
				return this.protocol;
			}

			public void setBizProtocol(String protocol) {
				this.protocol = protocol;
			}

			public Integer getPort() {
				return this.port;
			}

			public void setPort(Integer port) {
				this.port = port;
			}
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
	}

	public static class HostAliase {

		private List<String> hostnames;

		private String ip;

		public List<String> getHostnames() {
			return this.hostnames;
		}

		public void setHostnames(List<String> hostnames) {
			this.hostnames = hostnames;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
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

	public static class Volume {

		private String diskVolumeFsType;

		private String emptyDirVolumeSizeLimit;

		private String nFSVolumePath;

		private String diskVolumeDiskId;

		private String flexVolumeFsType;

		private String type;

		private String flexVolumeDriver;

		private String flexVolumeOptions;

		private String nFSVolumeServer;

		private String emptyDirVolumeMedium;

		private String hostPathVolumePath;

		private String name;

		private List<ConfigFileVolumeConfigFileToPath> configFileVolumeConfigFileToPaths;

		private Integer diskVolumeDiskSize;

		private Integer configFileVolumeDefaultMode;

		private String hostPathVolumeType;

		private Boolean nFSVolumeReadOnly;

		public String getDiskVolumeFsType() {
			return this.diskVolumeFsType;
		}

		public void setDiskVolumeFsType(String diskVolumeFsType) {
			this.diskVolumeFsType = diskVolumeFsType;
		}

		public String getEmptyDirVolumeSizeLimit() {
			return this.emptyDirVolumeSizeLimit;
		}

		public void setEmptyDirVolumeSizeLimit(String emptyDirVolumeSizeLimit) {
			this.emptyDirVolumeSizeLimit = emptyDirVolumeSizeLimit;
		}

		public String getNFSVolumePath() {
			return this.nFSVolumePath;
		}

		public void setNFSVolumePath(String nFSVolumePath) {
			this.nFSVolumePath = nFSVolumePath;
		}

		public String getDiskVolumeDiskId() {
			return this.diskVolumeDiskId;
		}

		public void setDiskVolumeDiskId(String diskVolumeDiskId) {
			this.diskVolumeDiskId = diskVolumeDiskId;
		}

		public String getFlexVolumeFsType() {
			return this.flexVolumeFsType;
		}

		public void setFlexVolumeFsType(String flexVolumeFsType) {
			this.flexVolumeFsType = flexVolumeFsType;
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

		public String getEmptyDirVolumeMedium() {
			return this.emptyDirVolumeMedium;
		}

		public void setEmptyDirVolumeMedium(String emptyDirVolumeMedium) {
			this.emptyDirVolumeMedium = emptyDirVolumeMedium;
		}

		public String getHostPathVolumePath() {
			return this.hostPathVolumePath;
		}

		public void setHostPathVolumePath(String hostPathVolumePath) {
			this.hostPathVolumePath = hostPathVolumePath;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<ConfigFileVolumeConfigFileToPath> getConfigFileVolumeConfigFileToPaths() {
			return this.configFileVolumeConfigFileToPaths;
		}

		public void setConfigFileVolumeConfigFileToPaths(List<ConfigFileVolumeConfigFileToPath> configFileVolumeConfigFileToPaths) {
			this.configFileVolumeConfigFileToPaths = configFileVolumeConfigFileToPaths;
		}

		public Integer getDiskVolumeDiskSize() {
			return this.diskVolumeDiskSize;
		}

		public void setDiskVolumeDiskSize(Integer diskVolumeDiskSize) {
			this.diskVolumeDiskSize = diskVolumeDiskSize;
		}

		public Integer getConfigFileVolumeDefaultMode() {
			return this.configFileVolumeDefaultMode;
		}

		public void setConfigFileVolumeDefaultMode(Integer configFileVolumeDefaultMode) {
			this.configFileVolumeDefaultMode = configFileVolumeDefaultMode;
		}

		public String getHostPathVolumeType() {
			return this.hostPathVolumeType;
		}

		public void setHostPathVolumeType(String hostPathVolumeType) {
			this.hostPathVolumeType = hostPathVolumeType;
		}

		public Boolean getNFSVolumeReadOnly() {
			return this.nFSVolumeReadOnly;
		}

		public void setNFSVolumeReadOnly(Boolean nFSVolumeReadOnly) {
			this.nFSVolumeReadOnly = nFSVolumeReadOnly;
		}

		public static class ConfigFileVolumeConfigFileToPath {

			private Integer mode;

			private String path;

			private String content;

			public Integer getMode() {
				return this.mode;
			}

			public void setMode(Integer mode) {
				this.mode = mode;
			}

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

	public static class SecurityContextSysctl {

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

	public static class InitContainer {

		private String image;

		private List<InitContainerEnvironmentVar> initContainerEnvironmentVars;

		private List<String> securityContextCapabilityAdds;

		private Float memory;

		private String workingDir;

		private Float cpu;

		private Integer gpu;

		private String imagePullPolicy;

		private List<String> commands;

		private Long securityContextRunAsUser;

		private List<InitContainerPort> initContainerPorts;

		private List<String> args;

		private String name;

		private List<InitContainerVolumeMount> initContainerVolumeMounts;

		private Boolean securityContextReadOnlyRootFilesystem;

		public String getImage() {
			return this.image;
		}

		public void setImage(String image) {
			this.image = image;
		}

		public List<InitContainerEnvironmentVar> getInitContainerEnvironmentVars() {
			return this.initContainerEnvironmentVars;
		}

		public void setInitContainerEnvironmentVars(List<InitContainerEnvironmentVar> initContainerEnvironmentVars) {
			this.initContainerEnvironmentVars = initContainerEnvironmentVars;
		}

		public List<String> getSecurityContextCapabilityAdds() {
			return this.securityContextCapabilityAdds;
		}

		public void setSecurityContextCapabilityAdds(List<String> securityContextCapabilityAdds) {
			this.securityContextCapabilityAdds = securityContextCapabilityAdds;
		}

		public Float getMemory() {
			return this.memory;
		}

		public void setMemory(Float memory) {
			this.memory = memory;
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

		public Integer getGpu() {
			return this.gpu;
		}

		public void setGpu(Integer gpu) {
			this.gpu = gpu;
		}

		public String getImagePullPolicy() {
			return this.imagePullPolicy;
		}

		public void setImagePullPolicy(String imagePullPolicy) {
			this.imagePullPolicy = imagePullPolicy;
		}

		public List<String> getCommands() {
			return this.commands;
		}

		public void setCommands(List<String> commands) {
			this.commands = commands;
		}

		public Long getSecurityContextRunAsUser() {
			return this.securityContextRunAsUser;
		}

		public void setSecurityContextRunAsUser(Long securityContextRunAsUser) {
			this.securityContextRunAsUser = securityContextRunAsUser;
		}

		public List<InitContainerPort> getInitContainerPorts() {
			return this.initContainerPorts;
		}

		public void setInitContainerPorts(List<InitContainerPort> initContainerPorts) {
			this.initContainerPorts = initContainerPorts;
		}

		public List<String> getArgs() {
			return this.args;
		}

		public void setArgs(List<String> args) {
			this.args = args;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<InitContainerVolumeMount> getInitContainerVolumeMounts() {
			return this.initContainerVolumeMounts;
		}

		public void setInitContainerVolumeMounts(List<InitContainerVolumeMount> initContainerVolumeMounts) {
			this.initContainerVolumeMounts = initContainerVolumeMounts;
		}

		public Boolean getSecurityContextReadOnlyRootFilesystem() {
			return this.securityContextReadOnlyRootFilesystem;
		}

		public void setSecurityContextReadOnlyRootFilesystem(Boolean securityContextReadOnlyRootFilesystem) {
			this.securityContextReadOnlyRootFilesystem = securityContextReadOnlyRootFilesystem;
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

		public static class InitContainerPort {

			private String protocol;

			private Integer port;

			public String getBizProtocol() {
				return this.protocol;
			}

			public void setBizProtocol(String protocol) {
				this.protocol = protocol;
			}

			public Integer getPort() {
				return this.port;
			}

			public void setPort(Integer port) {
				this.port = port;
			}
		}

		public static class InitContainerVolumeMount {

			private String mountPath;

			private Boolean readOnly;

			private String mountPropagation;

			private String name;

			private String subPath;

			public String getMountPath() {
				return this.mountPath;
			}

			public void setMountPath(String mountPath) {
				this.mountPath = mountPath;
			}

			public Boolean getReadOnly() {
				return this.readOnly;
			}

			public void setReadOnly(Boolean readOnly) {
				this.readOnly = readOnly;
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

			public String getSubPath() {
				return this.subPath;
			}

			public void setSubPath(String subPath) {
				this.subPath = subPath;
			}
		}
	}

	public static class ImageRegistryCredential {

		private String server;

		private String password;

		private String userName;

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

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
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

	@Override
	public Class<CreateEciScalingConfigurationResponse> getResponseClass() {
		return CreateEciScalingConfigurationResponse.class;
	}

}
