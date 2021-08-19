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

package com.aliyuncs.eci.model.v20180808;

import com.aliyuncs.RpcAcsRequest;

import java.util.List;

/**
 * @author xiaohui
 * @version 1.2.7
 */

public class BatchCreateContainerGroupsRequest extends RpcAcsRequest<BatchCreateContainerGroupsResponse> {

    public BatchCreateContainerGroupsRequest() {
        super("Eci", "2018-08-08", "BatchCreateContainerGroups", "eci");
    }

    private Long resourceOwnerId;

    private String resourceOwnerAccount;

    private String ownerAccount;

    private Long ownerId;

    private String securityGroupId;

    private String containerGroupName;

    private String restartPolicy;

    private Float cpu;

    private Float memory;

    private String resourceGroupId;

    private String dnsPolicy;

    private String clientToken;

    private Boolean slsEnable;

    private String imageSnapshotId;

    private String ramRoleName;

    private Long terminationGracePeriodSeconds;

    private Boolean autoMatchImageCache;

    private Integer ipv6AddressCount;

    private Integer activeDeadlineSeconds;

    private String spotStrategy;

    private Float spotPriceLimit;

    private String scheduleStrategy;

    private String corePattern;

    private Boolean shareProcessNamespace;

    private Boolean autoCreateEip;

    private Integer eipBandwidth;

    private String eipCommonBandwidthPackage;

    private String hostName;

    private Integer ingressBandwidth;

    private Integer egressBandwidth;

    private Integer cpuOptionsCore;

    private Integer cpuOptionsThreadsPerCore;

    private Integer ephemeralStorage;

    private Integer amount;

    private String launchTemplateId;

    private List<CreateContainerGroupRequest.Tag> tags;

    private List<CreateContainerGroupRequest.ImageRegistryCredential> imageRegistryCredentials;

    private List<CreateContainerGroupRequest.Container> containers;

    private List<CreateContainerGroupRequest.Volume> volumes;

    private List<CreateContainerGroupRequest.Container> initContainers;

    private CreateContainerGroupRequest.DnsConfig dnsConfig;

    private List<CreateContainerGroupRequest.HostAliase> hostAliases;

    private List<CreateContainerGroupRequest.Arn> arns;

    private List<CreateContainerGroupRequest.SecurityContextSysctl> securityContextSysctls;

    private List<String> ntpServers;

    private List<CreateContainerGroupRequest.AcrRegistryInfo> acrRegistryInfos;

    private List<String> vSwitchIds;

    private List<String> instanceTypes;

    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public void setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        if (resourceOwnerId != null) {
            putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
        }
    }

    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public void setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        if (resourceOwnerAccount != null) {
            putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
        }
    }

    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        if (ownerAccount != null) {
            putQueryParameter("OwnerAccount", ownerAccount);
        }
    }

    public Long getOwnerId() {
        return this.ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        if (ownerId != null) {
            putQueryParameter("OwnerId", ownerId.toString());
        }
    }

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        if (securityGroupId != null) {
            putQueryParameter("SecurityGroupId", securityGroupId);
        }
    }

    public String getContainerGroupName() {
        return this.containerGroupName;
    }

    public void setContainerGroupName(String containerGroupName) {
        this.containerGroupName = containerGroupName;
        if (containerGroupName != null) {
            putQueryParameter("ContainerGroupName", containerGroupName);
        }
    }

    public String getRestartPolicy() {
        return this.restartPolicy;
    }

    public void setRestartPolicy(String restartPolicy) {
        this.restartPolicy = restartPolicy;
        if (restartPolicy != null) {
            putQueryParameter("RestartPolicy", restartPolicy);
        }
    }

    public Float getCpu() {
        return this.cpu;
    }

    public void setCpu(Float cpu) {
        this.cpu = cpu;
        if (cpu != null) {
            putQueryParameter("Cpu", cpu);
        }
    }

    public Float getMemory() {
        return this.memory;
    }

    public void setMemory(Float memory) {
        this.memory = memory;
        if (memory != null) {
            putQueryParameter("Memory", memory);
        }
    }

    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        if (resourceGroupId != null) {
            putQueryParameter("ResourceGroupId", resourceGroupId);
        }
    }

    public String getDnsPolicy() {
        return this.dnsPolicy;
    }

    public void setDnsPolicy(String dnsPolicy) {
        this.dnsPolicy = dnsPolicy;
        if (dnsPolicy != null) {
            putQueryParameter("DnsPolicy", dnsPolicy);
        }
    }

    public String getClientToken() {
        return this.clientToken;
    }

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
        if (clientToken != null) {
            putQueryParameter("ClientToken", clientToken);
        }
    }

    public Boolean getSlsEnable() {
        return this.slsEnable;
    }

    public void setSlsEnable(Boolean slsEnable) {
        this.slsEnable = slsEnable;
        if (slsEnable != null) {
            putQueryParameter("SlsEnable", slsEnable.toString());
        }
    }

    public String getImageSnapshotId() {
        return this.imageSnapshotId;
    }

    public void setImageSnapshotId(String imageSnapshotId) {
        this.imageSnapshotId = imageSnapshotId;
        if (imageSnapshotId != null) {
            putQueryParameter("ImageSnapshotId", imageSnapshotId);
        }
    }

    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public void setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        if (ramRoleName != null) {
            putQueryParameter("RamRoleName", ramRoleName);
        }
    }

    public Long getTerminationGracePeriodSeconds() {
        return this.terminationGracePeriodSeconds;
    }

    public void setTerminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
        if (terminationGracePeriodSeconds != null) {
            putQueryParameter("TerminationGracePeriodSeconds", terminationGracePeriodSeconds.toString());
        }
    }

    public Boolean getAutoMatchImageCache() {
        return this.autoMatchImageCache;
    }

    public void setAutoMatchImageCache(Boolean autoMatchImageCache) {
        this.autoMatchImageCache = autoMatchImageCache;
        if (autoMatchImageCache != null) {
            putQueryParameter("AutoMatchImageCache", autoMatchImageCache.toString());
        }
    }

    public Integer getIpv6AddressCount() {
        return this.ipv6AddressCount;
    }

    public void setIpv6AddressCount(Integer ipv6AddressCount) {
        this.ipv6AddressCount = ipv6AddressCount;
        if (ipv6AddressCount != null) {
            putQueryParameter("Ipv6AddressCount", ipv6AddressCount.toString());
        }
    }

    public Integer getActiveDeadlineSeconds() {
        return this.activeDeadlineSeconds;
    }

    public void setActiveDeadlineSeconds(Integer activeDeadlineSeconds) {
        this.activeDeadlineSeconds = activeDeadlineSeconds;
        if (activeDeadlineSeconds != null) {
            putQueryParameter("ActiveDeadlineSeconds", activeDeadlineSeconds.toString());
        }
    }

    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public void setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        if (spotStrategy != null) {
            putQueryParameter("SpotStrategy", spotStrategy);
        }
    }

    public Float getSpotPriceLimit() {
        return this.spotPriceLimit;
    }

    public void setSpotPriceLimit(Float spotPriceLimit) {
        this.spotPriceLimit = spotPriceLimit;
        if (spotPriceLimit != null) {
            putQueryParameter("SpotPriceLimit", spotPriceLimit);
        }
    }

    public String getScheduleStrategy() {
        return this.scheduleStrategy;
    }

    public void setScheduleStrategy(String scheduleStrategy) {
        this.scheduleStrategy = scheduleStrategy;
        if (scheduleStrategy != null) {
            putQueryParameter("ScheduleStrategy", scheduleStrategy);
        }
    }

    public String getCorePattern() {
        return this.corePattern;
    }

    public void setCorePattern(String corePattern) {
        this.corePattern = corePattern;
        if (corePattern != null) {
            putQueryParameter("CorePattern", corePattern);
        }
    }

    public Boolean getShareProcessNamespace() {
        return this.shareProcessNamespace;
    }

    public void setShareProcessNamespace(Boolean shareProcessNamespace) {
        this.shareProcessNamespace = shareProcessNamespace;
        if (shareProcessNamespace != null) {
            putQueryParameter("ShareProcessNamespace", shareProcessNamespace.toString());
        }
    }

    public Boolean getAutoCreateEip() {
        return this.autoCreateEip;
    }

    public void setAutoCreateEip(Boolean autoCreateEip) {
        this.autoCreateEip = autoCreateEip;
        if (autoCreateEip != null) {
            putQueryParameter("AutoCreateEip", autoCreateEip.toString());
        }
    }

    public Integer getEipBandwidth() {
        return this.eipBandwidth;
    }

    public void setEipBandwidth(Integer eipBandwidth) {
        this.eipBandwidth = eipBandwidth;
        if (eipBandwidth != null) {
            putQueryParameter("EipBandwidth", eipBandwidth.toString());
        }
    }

    public String getEipCommonBandwidthPackage() {
        return this.eipCommonBandwidthPackage;
    }

    public void setEipCommonBandwidthPackage(String eipCommonBandwidthPackage) {
        this.eipCommonBandwidthPackage = eipCommonBandwidthPackage;
        if (eipCommonBandwidthPackage != null) {
            putQueryParameter("EipCommonBandwidthPackage", eipCommonBandwidthPackage);
        }
    }

    public String getHostName() {
        return this.hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
        if (hostName != null) {
            putQueryParameter("HostName", hostName);
        }
    }

    public Integer getIngressBandwidth() {
        return this.ingressBandwidth;
    }

    public void setIngressBandwidth(Integer ingressBandwidth) {
        this.ingressBandwidth = ingressBandwidth;
        if (ingressBandwidth != null) {
            putQueryParameter("IngressBandwidth", ingressBandwidth.toString());
        }
    }

    public Integer getEgressBandwidth() {
        return this.egressBandwidth;
    }

    public void setEgressBandwidth(Integer egressBandwidth) {
        this.egressBandwidth = egressBandwidth;
        if (egressBandwidth != null) {
            putQueryParameter("EgressBandwidth", egressBandwidth.toString());
        }
    }

    public Integer getCpuOptionsCore() {
        return this.cpuOptionsCore;
    }

    public void setCpuOptionsCore(Integer cpuOptionsCore) {
        this.cpuOptionsCore = cpuOptionsCore;
        if (cpuOptionsCore != null) {
            putQueryParameter("CpuOptionsCore", cpuOptionsCore.toString());
        }
    }

    public Integer getCpuOptionsThreadsPerCore() {
        return this.cpuOptionsThreadsPerCore;
    }

    public void setCpuOptionsThreadsPerCore(Integer cpuOptionsThreadsPerCore) {
        this.cpuOptionsThreadsPerCore = cpuOptionsThreadsPerCore;
        if (cpuOptionsThreadsPerCore != null) {
            putQueryParameter("CpuOptionsThreadsPerCore", cpuOptionsThreadsPerCore.toString());
        }
    }

    public Integer getEphemeralStorage() {
        return this.ephemeralStorage;
    }

    public void setEphemeralStorage(Integer ephemeralStorage) {
        this.ephemeralStorage = ephemeralStorage;
        if (ephemeralStorage != null) {
            putQueryParameter("EphemeralStorage", ephemeralStorage.toString());
        }
    }

    public Integer getAmount() {
        return this.amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
        if (amount != null) {
            putQueryParameter("Amount", amount.toString());
        }
    }

    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    public void setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
        if (launchTemplateId != null) {
            putQueryParameter("LaunchTemplateId", launchTemplateId);
        }
    }

    public List<CreateContainerGroupRequest.Tag> getTags() {
        return this.tags;
    }

    public void setTags(List<CreateContainerGroupRequest.Tag> tags) {
        this.tags = tags;
        if (tags != null) {
            for (int depth = 0; depth < tags.size(); depth++) {
                putQueryParameter("Tag." + (depth + 1) + ".Key", tags.get(depth).getKey());
                putQueryParameter("Tag." + (depth + 1) + ".Value", tags.get(depth).getValue());
            }
        }
    }

    public List<CreateContainerGroupRequest.ImageRegistryCredential> getImageRegistryCredentials() {
        return this.imageRegistryCredentials;
    }

    public void setImageRegistryCredentials(List<CreateContainerGroupRequest.ImageRegistryCredential> imageRegistryCredentials) {
        this.imageRegistryCredentials = imageRegistryCredentials;
        if (imageRegistryCredentials != null) {
            for (int depth1 = 0; depth1 < imageRegistryCredentials.size(); depth1++) {
                putQueryParameter("ImageRegistryCredential." + (depth1 + 1) + ".Server", imageRegistryCredentials.get(depth1).getServer());
                putQueryParameter("ImageRegistryCredential." + (depth1 + 1) + ".UserName", imageRegistryCredentials.get(depth1).getUserName());
                putQueryParameter("ImageRegistryCredential." + (depth1 + 1) + ".Password", imageRegistryCredentials.get(depth1).getPassword());
            }
        }
    }

    public List<CreateContainerGroupRequest.Container> getContainers() {
        return this.containers;
    }

    public void setContainers(List<CreateContainerGroupRequest.Container> containers) {
        this.containers = containers;
        if (containers != null) {
            for (int depth1 = 0; depth1 < containers.size(); depth1++) {
                putQueryParameter("Container." + (depth1 + 1) + ".Image", containers.get(depth1).getImage());
                putQueryParameter("Container." + (depth1 + 1) + ".Name", containers.get(depth1).getName());
                putQueryParameter("Container." + (depth1 + 1) + ".Cpu", containers.get(depth1).getCpu());
                putQueryParameter("Container." + (depth1 + 1) + ".Memory", containers.get(depth1).getMemory());
                putQueryParameter("Container." + (depth1 + 1) + ".WorkingDir", containers.get(depth1).getWorkingDir());
                putQueryParameter("Container." + (depth1 + 1) + ".ImagePullPolicy", containers.get(depth1).getImagePullPolicy());
                putQueryParameter("Container." + (depth1 + 1) + ".Stdin", containers.get(depth1).getStdin());
                putQueryParameter("Container." + (depth1 + 1) + ".StdinOnce", containers.get(depth1).getStdinOnce());
                putQueryParameter("Container." + (depth1 + 1) + ".Tty", containers.get(depth1).getTty());
                putQueryParameter("Container." + (depth1 + 1) + ".Gpu", containers.get(depth1).getGpu());

                if (containers.get(depth1).getCommands() != null) {
                    for (int i = 0; i < containers.get(depth1).getCommands().size(); i++) {
                        putQueryParameter("Container." + (depth1 + 1) + ".Command." + (i + 1), containers.get(depth1).getCommands().get(i));
                    }
                }
                if (containers.get(depth1).getArgs() != null) {
                    for (int i = 0; i < containers.get(depth1).getArgs().size(); i++) {
                        putQueryParameter("Container." + (depth1 + 1) + ".Arg." + (i + 1), containers.get(depth1).getArgs().get(i));
                    }
                }
                if (containers.get(depth1).getVolumeMounts() != null) {
                    for (int depth2 = 0; depth2 < containers.get(depth1).getVolumeMounts().size(); depth2++) {
                        putQueryParameter("Container." + (depth1 + 1) + ".VolumeMount." + (depth2 + 1) + ".MountPath", containers.get(depth1).getVolumeMounts().get(depth2).getMountPath());
                        putQueryParameter("Container." + (depth1 + 1) + ".VolumeMount." + (depth2 + 1) + ".ReadOnly", containers.get(depth1).getVolumeMounts().get(depth2).getReadOnly());
                        putQueryParameter("Container." + (depth1 + 1) + ".VolumeMount." + (depth2 + 1) + ".Name", containers.get(depth1).getVolumeMounts().get(depth2).getName());
                    }
                }
                if (containers.get(depth1).getPorts() != null) {
                    for (int depth2 = 0; depth2 < containers.get(depth1).getPorts().size(); depth2++) {
                        putQueryParameter("Container." + (depth1 + 1) + ".Port." + (depth2 + 1) + ".Protocol", containers.get(depth1).getPorts().get(depth2).getProtocol());
                        putQueryParameter("Container." + (depth1 + 1) + ".Port." + (depth2 + 1) + ".Port", containers.get(depth1).getPorts().get(depth2).getPort());
                    }
                }
                if (containers.get(depth1).getEnvironmentVars() != null) {
                    for (int depth2 = 0; depth2 < containers.get(depth1).getEnvironmentVars().size(); depth2++) {
                        putQueryParameter("Container." + (depth1 + 1) + ".EnvironmentVar." + (depth2 + 1) + ".Key", containers.get(depth1).getEnvironmentVars().get(depth2).getKey());
                        putQueryParameter("Container." + (depth1 + 1) + ".EnvironmentVar." + (depth2 + 1) + ".Value", containers.get(depth1).getEnvironmentVars().get(depth2).getValue());
                        putQueryParameter("Container." + (depth1 + 1) + ".EnvironmentVar." + (depth2 + 1) + ".FieldRef.FieldPath", containers.get(depth1).getEnvironmentVars().get(depth2).getFieldRefFieldPath());
                    }
                }

                if (containers.get(depth1).getReadinessProbe() != null) {
                    if (containers.get(depth1).getReadinessProbe().getExec() != null) {
                        for (int i = 0; i < containers.get(depth1).getReadinessProbe().getExec().size(); i++) {
                            putQueryParameter("Container." + (depth1 + 1) + ".ReadinessProbe.Exec.Command." + (i + 1), containers.get(depth1).getReadinessProbe().getExec().get(i));
                        }
                    }
                    if (containers.get(depth1).getReadinessProbe().getHttpGet() != null) {
                        putQueryParameter("Container." + (depth1 + 1) + ".ReadinessProbe.HttpGet.Path", containers.get(depth1).getReadinessProbe().getHttpGet().getPath());
                        putQueryParameter("Container." + (depth1 + 1) + ".ReadinessProbe.HttpGet.Port", containers.get(depth1).getReadinessProbe().getHttpGet().getPort());
                        putQueryParameter("Container." + (depth1 + 1) + ".ReadinessProbe.HttpGet.Scheme", containers.get(depth1).getReadinessProbe().getHttpGet().getScheme());
                    }
                    if (containers.get(depth1).getReadinessProbe().getTcpSocketPort() != null) {
                        putQueryParameter("Container." + (depth1 + 1) + ".ReadinessProbe.TcpSocket.Port", containers.get(depth1).getReadinessProbe().getTcpSocketPort());
                    }

                    putQueryParameter("Container." + (depth1 + 1) + ".ReadinessProbe.InitialDelaySeconds", containers.get(depth1).getReadinessProbe().getInitialDelaySeconds());
                    putQueryParameter("Container." + (depth1 + 1) + ".ReadinessProbe.PeriodSeconds", containers.get(depth1).getReadinessProbe().getPeriodSeconds());
                    putQueryParameter("Container." + (depth1 + 1) + ".ReadinessProbe.SuccessThreshold", containers.get(depth1).getReadinessProbe().getSuccessThreshold());
                    putQueryParameter("Container." + (depth1 + 1) + ".ReadinessProbe.FailureThreshold", containers.get(depth1).getReadinessProbe().getFailureThreshold());
                    putQueryParameter("Container." + (depth1 + 1) + ".ReadinessProbe.TimeoutSeconds", containers.get(depth1).getReadinessProbe().getTimeoutSeconds());
                }

                if (containers.get(depth1).getLivenessProbe() != null) {
                    if (containers.get(depth1).getLivenessProbe().getExec() != null) {
                        for (int i = 0; i < containers.get(depth1).getLivenessProbe().getExec().size(); i++) {
                            putQueryParameter("Container." + (depth1 + 1) + ".LivenessProbe.Exec.Command." + (i + 1), containers.get(depth1).getLivenessProbe().getExec().get(i));
                        }
                    }
                    if (containers.get(depth1).getLivenessProbe().getHttpGet() != null) {
                        putQueryParameter("Container." + (depth1 + 1) + ".LivenessProbe.HttpGet.Path", containers.get(depth1).getLivenessProbe().getHttpGet().getPath());
                        putQueryParameter("Container." + (depth1 + 1) + ".LivenessProbe.HttpGet.Port", containers.get(depth1).getLivenessProbe().getHttpGet().getPort());
                        putQueryParameter("Container." + (depth1 + 1) + ".LivenessProbe.HttpGet.Scheme", containers.get(depth1).getLivenessProbe().getHttpGet().getScheme());
                    }
                    if (containers.get(depth1).getLivenessProbe().getTcpSocketPort() != null) {
                        putQueryParameter("Container." + (depth1 + 1) + ".LivenessProbe.TcpSocket.Port", containers.get(depth1).getLivenessProbe().getTcpSocketPort());
                    }

                    putQueryParameter("Container." + (depth1 + 1) + ".LivenessProbe.InitialDelaySeconds", containers.get(depth1).getLivenessProbe().getInitialDelaySeconds());
                    putQueryParameter("Container." + (depth1 + 1) + ".LivenessProbe.PeriodSeconds", containers.get(depth1).getLivenessProbe().getPeriodSeconds());
                    putQueryParameter("Container." + (depth1 + 1) + ".LivenessProbe.SuccessThreshold", containers.get(depth1).getLivenessProbe().getSuccessThreshold());
                    putQueryParameter("Container." + (depth1 + 1) + ".LivenessProbe.FailureThreshold", containers.get(depth1).getLivenessProbe().getFailureThreshold());
                    putQueryParameter("Container." + (depth1 + 1) + ".LivenessProbe.TimeoutSeconds", containers.get(depth1).getLivenessProbe().getTimeoutSeconds());
                }

                if (containers.get(depth1).getSecurityContext() != null) {
                    if (containers.get(depth1).getSecurityContext().getCapability() != null) {
                        if (containers.get(depth1).getSecurityContext().getCapability().getAdds() != null) {
                            for (int i = 0; i < containers.get(depth1).getSecurityContext().getCapability().getAdds().size(); i++) {
                                putQueryParameter("Container." + (depth1 + 1) + ".SecurityContext.Capability.Add." + (i + 1), containers.get(depth1).getSecurityContext().getCapability().getAdds().get(i));
                            }
                        }

                    }
                    putQueryParameter("Container." + (depth1 + 1) + ".SecurityContext.ReadOnlyRootFilesystem", containers.get(depth1).getSecurityContext().getReadOnlyRootFilesystem());
                    putQueryParameter("Container." + (depth1 + 1) + ".SecurityContext.RunAsUser", containers.get(depth1).getSecurityContext().getRunAsUser());
                }


                if (containers.get(depth1).getLifecyclePostStartHandlerHttpGetHost() != null) {
                    putQueryParameter("Container." + (depth1 + 1) + ".LifecyclePostStartHandlerHttpGetHost", containers.get(depth1).getLifecyclePostStartHandlerHttpGetHost());
                }
                if (containers.get(depth1).getLifecyclePostStartHandlerHttpGetPort() != null) {
                    putQueryParameter("Container." + (depth1 + 1) + ".LifecyclePostStartHandlerHttpGetPort", containers.get(depth1).getLifecyclePostStartHandlerHttpGetPort());
                }
                if (containers.get(depth1).getLifecyclePostStartHandlerHttpGetPath() != null) {
                    putQueryParameter("Container." + (depth1 + 1) + ".LifecyclePostStartHandlerHttpGetPath", containers.get(depth1).getLifecyclePostStartHandlerHttpGetPath());
                }
                if (containers.get(depth1).getLifecyclePostStartHandlerHttpGetScheme() != null) {
                    putQueryParameter("Container." + (depth1 + 1) + ".LifecyclePostStartHandlerHttpGetScheme", containers.get(depth1).getLifecyclePostStartHandlerHttpGetScheme());
                }
                if (containers.get(depth1).getLifecyclePostStartHandlerTcpSocketHost() != null) {
                    putQueryParameter("Container." + (depth1 + 1) + ".LifecyclePostStartHandlerTcpSocketHost", containers.get(depth1).getLifecyclePostStartHandlerTcpSocketHost());
                }
                if (containers.get(depth1).getLifecyclePostStartHandlerTcpSocketPort() != null) {
                    putQueryParameter("Container." + (depth1 + 1) + ".LifecyclePostStartHandlerTcpSocketPort", containers.get(depth1).getLifecyclePostStartHandlerTcpSocketPort());
                }
                if (containers.get(depth1).getLifecyclePreStopHandlerHttpGetHost() != null) {
                    putQueryParameter("Container." + (depth1 + 1) + ".LifecyclePreStopHandlerHttpGetHost", containers.get(depth1).getLifecyclePreStopHandlerHttpGetHost());
                }
                if (containers.get(depth1).getLifecyclePreStopHandlerHttpGetPort() != null) {
                    putQueryParameter("Container." + (depth1 + 1) + ".LifecyclePreStopHandlerHttpGetPort", containers.get(depth1).getLifecyclePreStopHandlerHttpGetPort());
                }
                if (containers.get(depth1).getLifecyclePreStopHandlerHttpGetPath() != null) {
                    putQueryParameter("Container." + (depth1 + 1) + ".LifecyclePreStopHandlerHttpGetPath", containers.get(depth1).getLifecyclePreStopHandlerHttpGetPath());
                }
                if (containers.get(depth1).getLifecyclePreStopHandlerHttpGetScheme() != null) {
                    putQueryParameter("Container." + (depth1 + 1) + ".LifecyclePreStopHandlerHttpGetScheme", containers.get(depth1).getLifecyclePreStopHandlerHttpGetScheme());
                }
                if (containers.get(depth1).getLifecyclePreStopHandlerTcpSocketHost() != null) {
                    putQueryParameter("Container." + (depth1 + 1) + ".LifecyclePreStopHandlerTcpSocketHost", containers.get(depth1).getLifecyclePreStopHandlerTcpSocketHost());
                }
                if (containers.get(depth1).getLifecyclePreStopHandlerTcpSocketPort() != null) {
                    putQueryParameter("Container." + (depth1 + 1) + ".LifecyclePreStopHandlerTcpSocketPort", containers.get(depth1).getLifecyclePreStopHandlerTcpSocketPort());
                }
                if (containers.get(depth1).getLifecyclePreStopHandlerExecs() != null) {
                    for (int i = 0; i < containers.get(depth1).getLifecyclePreStopHandlerExecs().size(); i++) {
                        putQueryParameter("Container." + (depth1 + 1) + ".LifecyclePreStopHandlerExec." + (i + 1), containers.get(depth1).getLifecyclePreStopHandlerExecs().get(i));
                    }
                }
                if (containers.get(depth1).getLifecyclePostStartHandlerExecs() != null) {
                    for (int i = 0; i < containers.get(depth1).getLifecyclePostStartHandlerExecs().size(); i++) {
                        putQueryParameter("Container." + (depth1 + 1) + ".LifecyclePostStartHandlerExec." + (i + 1), containers.get(depth1).getLifecyclePostStartHandlerExecs().get(i));
                    }
                    if (containers.get(depth1).getLifecyclePostStartHandlerHttpGetHttpHeaders() != null) {
                        for (int i = 0; i < containers.get(depth1).getLifecyclePostStartHandlerHttpGetHttpHeaders().size(); i++) {
                            putQueryParameter("Container." + (depth1 + 1) + ".LifecyclepostStartHandlerHttpGetHttpHead." + (i + 1) + ".Name", containers.get(depth1).getLifecyclePostStartHandlerHttpGetHttpHeaders().get(i).getName());
                            putQueryParameter("Container." + (depth1 + 1) + ".LifecyclepostStartHandlerHttpGetHttpHead." + (i + 1) + ".Value", containers.get(depth1).getLifecyclePostStartHandlerHttpGetHttpHeaders().get(i).getValue());

                        }
                    }
                    if (containers.get(depth1).getLifecyclePreStopHandlerHttpGetHttpHeaders() != null) {
                        for (int i = 0; i < containers.get(depth1).getLifecyclePreStopHandlerHttpGetHttpHeaders().size(); i++) {
                            putQueryParameter("Container." + (depth1 + 1) + ".LifecyclePreStopHandlerHttpGetHttpHeader." + (i + 1) + ".Name", containers.get(depth1).getLifecyclePreStopHandlerHttpGetHttpHeaders().get(i).getName());
                            putQueryParameter("Container." + (depth1 + 1) + ".LifecyclePreStopHandlerHttpGetHttpHeader." + (i + 1) + ".Value", containers.get(depth1).getLifecyclePreStopHandlerHttpGetHttpHeaders().get(i).getValue());

                        }
                    }
                }
            }
        }
    }

    public List<CreateContainerGroupRequest.Volume> getVolumes() {
        return this.volumes;
    }

    public void setVolumes(List<CreateContainerGroupRequest.Volume> volumes) {
        this.volumes = volumes;
        if (volumes != null) {
            for (int depth1 = 0; depth1 < volumes.size(); depth1++) {
                putQueryParameter("Volume." + (depth1 + 1) + ".Name", volumes.get(depth1).getName());
                putQueryParameter("Volume." + (depth1 + 1) + ".NFSVolume.Server", volumes.get(depth1).getNFSVolumeServer());
                putQueryParameter("Volume." + (depth1 + 1) + ".NFSVolume.Path", volumes.get(depth1).getNFSVolumePath());
                putQueryParameter("Volume." + (depth1 + 1) + ".NFSVolume.ReadOnly", volumes.get(depth1).getNFSVolumeReadOnly());

                putQueryParameter("Volume." + (depth1 + 1) + ".EmptyDirVolume.Medium", volumes.get(depth1).getEmptyDirVolumeMedium());

                if (volumes.get(depth1).getConfigFileVolumeConfigFileToPaths() != null) {
                    for (int depth2 = 0; depth2 < volumes.get(depth1).getConfigFileVolumeConfigFileToPaths().size(); depth2++) {
                        putQueryParameter("Volume." + (depth1 + 1) + ".ConfigFileVolume.ConfigFileToPath." + (depth2 + 1) + ".Content", volumes.get(depth1).getConfigFileVolumeConfigFileToPaths().get(depth2).getContent());
                        putQueryParameter("Volume." + (depth1 + 1) + ".ConfigFileVolume.ConfigFileToPath." + (depth2 + 1) + ".Path", volumes.get(depth1).getConfigFileVolumeConfigFileToPaths().get(depth2).getPath());
                        putQueryParameter("Volume." + (depth1 + 1) + ".ConfigFileVolume.ConfigFileToPath." + (depth2 + 1) + ".Mode", volumes.get(depth1).getConfigFileVolumeConfigFileToPaths().get(depth2).getMode());
                    }
                }
                putQueryParameter("Volume." + (depth1 + 1) + ".ConfigFileVolume.DefaultModel", volumes.get(depth1).getConfigFileVolumeDefaultModel());
                putQueryParameter("Volume." + (depth1 + 1) + ".Type", volumes.get(depth1).getType());
                putQueryParameter("Volume." + (depth1 + 1) + ".DiskVolume.DiskId", volumes.get(depth1).getDiskVolumeDiskId());
                putQueryParameter("Volume." + (depth1 + 1) + ".DiskVolume.FsType", volumes.get(depth1).getDiskVolumeFsType());
                putQueryParameter("Volume." + (depth1 + 1) + ".DiskVolume.DiskSize", volumes.get(depth1).getDiskVolumeDiskSize());
                putQueryParameter("Volume." + (depth1 + 1) + ".FlexVolume.FsType", volumes.get(depth1).getFlexVolumeFsType());
                putQueryParameter("Volume." + (depth1 + 1) + ".FlexVolume.Options", volumes.get(depth1).getFlexVolumeOptions());
                putQueryParameter("Volume." + (depth1 + 1) + ".FlexVolume.Driver", volumes.get(depth1).getFlexVolumeDriver());
            }
        }
    }

    public List<CreateContainerGroupRequest.Container> getInitContainers() {
        return this.initContainers;
    }

    public void setInitContainers(List<CreateContainerGroupRequest.Container> initContainers) {
        this.initContainers = initContainers;
        if (initContainers != null) {
            for (int depth1 = 0; depth1 < initContainers.size(); depth1++) {
                putQueryParameter("InitContainer." + (depth1 + 1) + ".Name", initContainers.get(depth1).getName());
                putQueryParameter("InitContainer." + (depth1 + 1) + ".Image", initContainers.get(depth1).getImage());
                putQueryParameter("InitContainer." + (depth1 + 1) + ".Cpu", initContainers.get(depth1).getCpu());
                putQueryParameter("InitContainer." + (depth1 + 1) + ".Memory", initContainers.get(depth1).getMemory());
                putQueryParameter("InitContainer." + (depth1 + 1) + ".WorkingDir", initContainers.get(depth1).getWorkingDir());
                putQueryParameter("InitContainer." + (depth1 + 1) + ".ImagePullPolicy", initContainers.get(depth1).getImagePullPolicy());
                if (initContainers.get(depth1).getCommands() != null) {
                    for (int i = 0; i < initContainers.get(depth1).getCommands().size(); i++) {
                        putQueryParameter("InitContainer." + (depth1 + 1) + ".Command." + (i + 1), initContainers.get(depth1).getCommands().get(i));
                    }
                }
                if (initContainers.get(depth1).getArgs() != null) {
                    for (int i = 0; i < initContainers.get(depth1).getArgs().size(); i++) {
                        putQueryParameter("InitContainer." + (depth1 + 1) + ".Arg." + (i + 1), initContainers.get(depth1).getArgs().get(i));
                    }
                }
                if (initContainers.get(depth1).getVolumeMounts() != null) {
                    for (int depth2 = 0; depth2 < initContainers.get(depth1).getVolumeMounts().size(); depth2++) {
                        putQueryParameter("InitContainer." + (depth1 + 1) + ".VolumeMount." + (depth2 + 1) + ".MountPath", initContainers.get(depth1).getVolumeMounts().get(depth2).getMountPath());
                        putQueryParameter("InitContainer." + (depth1 + 1) + ".VolumeMount." + (depth2 + 1) + ".ReadOnly", initContainers.get(depth1).getVolumeMounts().get(depth2).getReadOnly());
                        putQueryParameter("InitContainer." + (depth1 + 1) + ".VolumeMount." + (depth2 + 1) + ".Name", initContainers.get(depth1).getVolumeMounts().get(depth2).getName());
                    }
                }
                if (initContainers.get(depth1).getPorts() != null) {
                    for (int depth2 = 0; depth2 < initContainers.get(depth1).getPorts().size(); depth2++) {
                        putQueryParameter("InitContainer." + (depth1 + 1) + ".Port." + (depth2 + 1) + ".Protocol", initContainers.get(depth1).getPorts().get(depth2).getProtocol());
                        putQueryParameter("InitContainer." + (depth1 + 1) + ".Port." + (depth2 + 1) + ".Port", initContainers.get(depth1).getPorts().get(depth2).getPort());
                    }
                }
                if (initContainers.get(depth1).getEnvironmentVars() != null) {
                    for (int depth2 = 0; depth2 < initContainers.get(depth1).getEnvironmentVars().size(); depth2++) {
                        putQueryParameter("InitContainer." + (depth1 + 1) + ".EnvironmentVar." + (depth2 + 1) + ".Key", initContainers.get(depth1).getEnvironmentVars().get(depth2).getKey());
                        putQueryParameter("InitContainer." + (depth1 + 1) + ".EnvironmentVar." + (depth2 + 1) + ".Value", initContainers.get(depth1).getEnvironmentVars().get(depth2).getValue());
                    }
                }

                if (initContainers.get(depth1).getSecurityContext() != null) {
                    if (initContainers.get(depth1).getSecurityContext().getCapability() != null) {
                        if (initContainers.get(depth1).getSecurityContext().getCapability().getAdds() != null) {
                            for (int i = 0; i < initContainers.get(depth1).getSecurityContext().getCapability().getAdds().size(); i++) {
                                putQueryParameter("InitContainer." + (depth1 + 1) + ".SecurityContext.Capability.Add." + (i + 1), initContainers.get(depth1).getSecurityContext().getCapability().getAdds().get(i));
                            }
                        }

                    }
                    putQueryParameter("InitContainer." + (depth1 + 1) + ".SecurityContext.ReadOnlyRootFilesystem", initContainers.get(depth1).getSecurityContext().getReadOnlyRootFilesystem());
                    putQueryParameter("InitContainer." + (depth1 + 1) + ".SecurityContext.RunAsUser", initContainers.get(depth1).getSecurityContext().getRunAsUser());
                }
            }
        }
    }

    public CreateContainerGroupRequest.DnsConfig getDnsConfig() {
        return this.dnsConfig;
    }

    public void setDnsConfig(CreateContainerGroupRequest.DnsConfig dnsConfig) {
        this.dnsConfig = dnsConfig;
        if (dnsConfig.getSearches() != null) {
            for (int i = 0; i < dnsConfig.getSearches().size(); i++) {
                putQueryParameter("DnsConfig.Search." + (i + 1), dnsConfig.getSearches().get(i));
            }
        }
        if (dnsConfig.getNameServers() != null) {
            for (int i = 0; i < dnsConfig.getNameServers().size(); i++) {
                putQueryParameter("DnsConfig.NameServer." + (i + 1), dnsConfig.getNameServers().get(i));
            }
        }
        if (dnsConfig.getOptions() != null) {
            for (int depth1 = 0; depth1 < dnsConfig.getOptions().size(); depth1++) {
                putQueryParameter("DnsConfig.Option." + (depth1 + 1) + ".Name", dnsConfig.getOptions().get(depth1).getName());
                putQueryParameter("DnsConfig.Option." + (depth1 + 1) + ".Value", dnsConfig.getOptions().get(depth1).getValue());
            }
        }
    }

    public List<CreateContainerGroupRequest.HostAliase> getHostAliases() {
        return this.hostAliases;
    }

    public void setHostAliases(List<CreateContainerGroupRequest.HostAliase> hostAliases) {
        this.hostAliases = hostAliases;
        if (hostAliases != null) {
            for (int depth1 = 0; depth1 < hostAliases.size(); depth1++) {
                putQueryParameter("HostAliase." + (depth1 + 1) + ".Ip", hostAliases.get(depth1).getIp());
                if (hostAliases.get(depth1).getHostnames() != null) {
                    for (int i = 0; i < hostAliases.get(depth1).getHostnames().size(); i++) {
                        putQueryParameter("HostAliase." + (depth1 + 1) + ".Hostname." + (i + 1), hostAliases.get(depth1).getHostnames().get(i));
                    }
                }
            }
        }
    }

    public List<CreateContainerGroupRequest.Arn> getArns() {
        return this.arns;
    }

    public void setArns(List<CreateContainerGroupRequest.Arn> arns) {
        this.arns = arns;
        if (arns != null) {
            for (int depth1 = 0; depth1 < arns.size(); depth1++) {
                putQueryParameter("Arn." + (depth1 + 1) + ".RoleArn", arns.get(depth1).getRoleArn());
                putQueryParameter("Arn." + (depth1 + 1) + ".RoleType", arns.get(depth1).getRoleType());
                putQueryParameter("Arn." + (depth1 + 1) + ".AssumeRoleFor", arns.get(depth1).getAssumeRoleFor());
            }
        }
    }

    public List<CreateContainerGroupRequest.SecurityContextSysctl> getSecurityContextSysctls() {
        return this.securityContextSysctls;
    }

    public void setSecurityContextSysctls(List<CreateContainerGroupRequest.SecurityContextSysctl> securityContextSysctls) {
        this.securityContextSysctls = securityContextSysctls;
        if (securityContextSysctls != null) {
            for (int depth1 = 0; depth1 < securityContextSysctls.size(); depth1++) {
                putQueryParameter("SecurityContext.Sysctl." + (depth1 + 1) + ".Key", tags.get(depth1).getKey());
                putQueryParameter("SecurityContext.Sysctl." + (depth1 + 1) + ".Value", tags.get(depth1).getValue());
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
                putQueryParameter("NtpServer." + (i + 1), ntpServers.get(i));
            }
        }
    }

    public List<CreateContainerGroupRequest.AcrRegistryInfo> getAcrRegistryInfos() {
        return this.acrRegistryInfos;
    }

    public void setAcrRegistryInfos(List<CreateContainerGroupRequest.AcrRegistryInfo> acrRegistryInfos) {
        this.acrRegistryInfos = acrRegistryInfos;
        if (acrRegistryInfos != null) {
            for (int depth1 = 0; depth1 < acrRegistryInfos.size(); depth1++) {
                if (acrRegistryInfos.get(depth1).getDomains() != null) {
                    for (int i = 0; i < acrRegistryInfos.get(depth1).getDomains().size(); i++) {
                        putQueryParameter("AcrRegistryInfo." + (depth1 + 1) + ".Domain." + (i + 1), acrRegistryInfos.get(depth1).getDomains().get(i));
                    }
                }
                putQueryParameter("AcrRegistryInfo." + (depth1 + 1) + ".InstanceId", acrRegistryInfos.get(depth1).getInstanceId());
                putQueryParameter("AcrRegistryInfo." + (depth1 + 1) + ".InstanceName", acrRegistryInfos.get(depth1).getInstanceName());
                putQueryParameter("AcrRegistryInfo." + (depth1 + 1) + ".RegionId", acrRegistryInfos.get(depth1).getRegionId());
            }
        }
    }

    public List<String> getVSwitchIds() {
        return this.vSwitchIds;
    }

    public void setVSwitchIds(List<String> vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        if (vSwitchIds != null) {
            for (int depth1 = 0; depth1 < vSwitchIds.size(); depth1++) {
                putQueryParameter("VSwitchId." + (depth1 + 1), vSwitchIds.get(depth1));
            }
        }
    }

    public List<String> getInstanceTypes() {
        return this.instanceTypes;
    }

    public void setInstanceTypes(List<String> instanceTypes) {
        this.instanceTypes = instanceTypes;
        if (instanceTypes != null) {
            for (int depth1 = 0; depth1 < instanceTypes.size(); depth1++) {
                putQueryParameter("InstanceType." + (depth1 + 1), instanceTypes.get(depth1));
            }
        }
    }

    @Override
    public Class<BatchCreateContainerGroupsResponse> getResponseClass() {
        return BatchCreateContainerGroupsResponse.class;
    }

}
