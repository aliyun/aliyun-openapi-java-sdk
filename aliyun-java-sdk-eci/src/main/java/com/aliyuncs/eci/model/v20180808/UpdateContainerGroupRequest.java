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
import com.aliyuncs.eci.model.v20180808.CreateContainerGroupRequest.Container;
import com.aliyuncs.eci.model.v20180808.CreateContainerGroupRequest.DnsConfig;
import com.aliyuncs.eci.model.v20180808.CreateContainerGroupRequest.ImageRegistryCredential;
import com.aliyuncs.eci.model.v20180808.CreateContainerGroupRequest.Tag;
import com.aliyuncs.eci.model.v20180808.CreateContainerGroupRequest.Volume;

import java.util.List;

/**
 * @author lm
 * @version 1.0.8
 */
public class UpdateContainerGroupRequest extends RpcAcsRequest<UpdateContainerGroupResponse> {
	
	public UpdateContainerGroupRequest() {
		super("Eci", "2018-08-08", "UpdateContainerGroup", "eci");
	}

	private String containerGroupId;

	private List<Container> containers;

	private Long resourceOwnerId;

	private List<Container> initContainers;

	private List<ImageRegistryCredential> imageRegistryCredentials;

	private List<Tag> tags;

	private List<Volume> volumes;

	private DnsConfig dnsConfig;

	private String restartPolicy;

	private String ownerAccount;

	private String resourceOwnerAccount;

	private Long ownerId;

	public List<Container> getContainers() {
		return this.containers;
	}

	public void setContainers(List<Container> containers) {
		this.containers = containers;
		if (containers != null) {
			for (int depth1 = 0; depth1 < containers.size(); depth1++) {
				putQueryParameter("Container." + (depth1 + 1) + ".Image" , containers.get(depth1).getImage());
				putQueryParameter("Container." + (depth1 + 1) + ".Name" , containers.get(depth1).getName());
				putQueryParameter("Container." + (depth1 + 1) + ".Cpu" , containers.get(depth1).getCpu());
				putQueryParameter("Container." + (depth1 + 1) + ".Memory" , containers.get(depth1).getMemory());
				putQueryParameter("Container." + (depth1 + 1) + ".WorkingDir" , containers.get(depth1).getWorkingDir());
				putQueryParameter("Container." + (depth1 + 1) + ".ImagePullPolicy" , containers.get(depth1).getImagePullPolicy());
				putQueryParameter("Container." + (depth1 + 1) + ".Stdin", containers.get(depth1).getStdin());
				putQueryParameter("Container." + (depth1 + 1) + ".StdinOnce" , containers.get(depth1).getStdinOnce());
				putQueryParameter("Container." + (depth1 + 1) + ".Tty" , containers.get(depth1).getTty());
				putQueryParameter("Container." + (depth1 + 1) + ".Gpu" , containers.get(depth1).getGpu());

				if (containers.get(depth1).getCommands() != null) {
					for (int i = 0; i < containers.get(depth1).getCommands().size(); i++) {
						putQueryParameter("Container." + (depth1 + 1) + ".Command." + (i + 1) , containers.get(depth1).getCommands().get(i));
					}
				}
				if (containers.get(depth1).getArgs() != null) {
					for (int i = 0; i < containers.get(depth1).getArgs().size(); i++) {
						putQueryParameter("Container." + (depth1 + 1) + ".Arg." + (i + 1) , containers.get(depth1).getArgs().get(i));
					}
				}
				if (containers.get(depth1).getVolumeMounts() != null) {
					for (int depth2 = 0; depth2 < containers.get(depth1).getVolumeMounts().size(); depth2++) {
						putQueryParameter("Container." + (depth1 + 1) + ".VolumeMount." + (depth2 + 1) + ".MountPath" , containers.get(depth1).getVolumeMounts().get(depth2).getMountPath());
						putQueryParameter("Container." + (depth1 + 1) + ".VolumeMount." + (depth2 + 1) + ".ReadOnly" , containers.get(depth1).getVolumeMounts().get(depth2).getReadOnly());
						putQueryParameter("Container." + (depth1 + 1) + ".VolumeMount." + (depth2 + 1) + ".Name" , containers.get(depth1).getVolumeMounts().get(depth2).getName());
					}
				}
				if (containers.get(depth1).getPorts() != null) {
					for (int depth2 = 0; depth2 < containers.get(depth1).getPorts().size(); depth2++) {
						putQueryParameter("Container." + (depth1 + 1) + ".Port." + (depth2 + 1) + ".Protocol" , containers.get(depth1).getPorts().get(depth2).getProtocol());
						putQueryParameter("Container." + (depth1 + 1) + ".Port." + (depth2 + 1) + ".Port" , containers.get(depth1).getPorts().get(depth2).getPort());
					}
				}
				if (containers.get(depth1).getEnvironmentVars() != null) {
					for (int depth2 = 0; depth2 < containers.get(depth1).getEnvironmentVars().size(); depth2++) {
						putQueryParameter("Container." + (depth1 + 1) + ".EnvironmentVar." + (depth2 + 1) + ".Key" , containers.get(depth1).getEnvironmentVars().get(depth2).getKey());
						putQueryParameter("Container." + (depth1 + 1) + ".EnvironmentVar." + (depth2 + 1) + ".Value" , containers.get(depth1).getEnvironmentVars().get(depth2).getValue());
						putQueryParameter("Container." + (depth1 + 1) + ".EnvironmentVar." + (depth2 + 1) + ".FieldRef.FieldPath" , containers.get(depth1).getEnvironmentVars().get(depth2).getFieldRefFieldPath());
					}
				}

				if(containers.get(depth1).getReadinessProbe() != null){
					if(containers.get(depth1).getReadinessProbe().getExec() != null){
						for (int i = 0; i < containers.get(depth1).getReadinessProbe().getExec().size(); i++) {
							putQueryParameter("Container." + (depth1 + 1) + ".ReadinessProbe.Exec.Command." + (i + 1) , containers.get(depth1).getReadinessProbe().getExec().get(i));
						}
					}
					if(containers.get(depth1).getReadinessProbe().getHttpGet() != null){
						putQueryParameter("Container." + (depth1 + 1) + ".ReadinessProbe.HttpGet.Path" , containers.get(depth1).getReadinessProbe().getHttpGet().getPath());
						putQueryParameter("Container." + (depth1 + 1) + ".ReadinessProbe.HttpGet.Port" , containers.get(depth1).getReadinessProbe().getHttpGet().getPort());
						putQueryParameter("Container." + (depth1 + 1) + ".ReadinessProbe.HttpGet.Scheme" , containers.get(depth1).getReadinessProbe().getHttpGet().getScheme());
					}
					if(containers.get(depth1).getReadinessProbe().getTcpSocketPort() != null){
						putQueryParameter("Container." + (depth1 + 1) + ".ReadinessProbe.TcpSocket.Port" , containers.get(depth1).getReadinessProbe().getTcpSocketPort());
					}

					putQueryParameter("Container." + (depth1 + 1) + ".ReadinessProbe.InitialDelaySeconds" , containers.get(depth1).getReadinessProbe().getInitialDelaySeconds());
					putQueryParameter("Container." + (depth1 + 1) + ".ReadinessProbe.PeriodSeconds" , containers.get(depth1).getReadinessProbe().getPeriodSeconds());
					putQueryParameter("Container." + (depth1 + 1) + ".ReadinessProbe.SuccessThreshold" , containers.get(depth1).getReadinessProbe().getSuccessThreshold());
					putQueryParameter("Container." + (depth1 + 1) + ".ReadinessProbe.FailureThreshold" , containers.get(depth1).getReadinessProbe().getFailureThreshold());
					putQueryParameter("Container." + (depth1 + 1) + ".ReadinessProbe.TimeoutSeconds" , containers.get(depth1).getReadinessProbe().getTimeoutSeconds());
				}

				if(containers.get(depth1).getLivenessProbe() != null){
					if(containers.get(depth1).getLivenessProbe().getExec() != null){
						for (int i = 0; i < containers.get(depth1).getLivenessProbe().getExec().size(); i++) {
							putQueryParameter("Container." + (depth1 + 1) + ".LivenessProbe.Exec.Command." + (i + 1) , containers.get(depth1).getLivenessProbe().getExec().get(i));
						}
					}
					if(containers.get(depth1).getLivenessProbe().getHttpGet() != null){
						putQueryParameter("Container." + (depth1 + 1) + ".LivenessProbe.HttpGet.Path" , containers.get(depth1).getLivenessProbe().getHttpGet().getPath());
						putQueryParameter("Container." + (depth1 + 1) + ".LivenessProbe.HttpGet.Port" , containers.get(depth1).getLivenessProbe().getHttpGet().getPort());
						putQueryParameter("Container." + (depth1 + 1) + ".LivenessProbe.HttpGet.Scheme" , containers.get(depth1).getLivenessProbe().getHttpGet().getScheme());
					}
					if(containers.get(depth1).getLivenessProbe().getTcpSocketPort() != null){
						putQueryParameter("Container." + (depth1 + 1) + ".LivenessProbe.TcpSocket.Port" , containers.get(depth1).getLivenessProbe().getTcpSocketPort());
					}

					putQueryParameter("Container." + (depth1 + 1) + ".LivenessProbe.InitialDelaySeconds" , containers.get(depth1).getLivenessProbe().getInitialDelaySeconds());
					putQueryParameter("Container." + (depth1 + 1) + ".LivenessProbe.PeriodSeconds" , containers.get(depth1).getLivenessProbe().getPeriodSeconds());
					putQueryParameter("Container." + (depth1 + 1) + ".LivenessProbe.SuccessThreshold" , containers.get(depth1).getLivenessProbe().getSuccessThreshold());
					putQueryParameter("Container." + (depth1 + 1) + ".LivenessProbe.FailureThreshold" , containers.get(depth1).getLivenessProbe().getFailureThreshold());
					putQueryParameter("Container." + (depth1 + 1) + ".LivenessProbe.TimeoutSeconds" , containers.get(depth1).getLivenessProbe().getTimeoutSeconds());
				}

				if(containers.get(depth1).getSecurityContext() != null){
					if (containers.get(depth1).getSecurityContext().getCapability() != null) {
						if(containers.get(depth1).getSecurityContext().getCapability().getAdds() != null){
							for (int i = 0; i < containers.get(depth1).getSecurityContext().getCapability().getAdds().size(); i++) {
								putQueryParameter("Container." + (depth1 + 1) + ".SecurityContext.Capability.Add." + (i + 1) , containers.get(depth1).getSecurityContext().getCapability().getAdds().get(i));
							}
						}

					}
					putQueryParameter("Container." + (depth1 + 1) + ".SecurityContext.ReadOnlyRootFilesystem" , containers.get(depth1).getSecurityContext().getReadOnlyRootFilesystem());
					putQueryParameter("Container." + (depth1 + 1) + ".SecurityContext.RunAsUser" , containers.get(depth1).getSecurityContext().getRunAsUser());
				}
			}
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

	public List<Container> getInitContainers() {
		return this.initContainers;
	}

	public void setInitContainers(List<Container> initContainers) {
		this.initContainers = initContainers;
		if (initContainers != null) {
			for (int depth1 = 0; depth1 < initContainers.size(); depth1++) {
				putQueryParameter("InitContainer." + (depth1 + 1) + ".Name" , initContainers.get(depth1).getName());
				putQueryParameter("InitContainer." + (depth1 + 1) + ".Image" , initContainers.get(depth1).getImage());
				putQueryParameter("InitContainer." + (depth1 + 1) + ".Cpu" , initContainers.get(depth1).getCpu());
				putQueryParameter("InitContainer." + (depth1 + 1) + ".Memory" , initContainers.get(depth1).getMemory());
				putQueryParameter("InitContainer." + (depth1 + 1) + ".WorkingDir" , initContainers.get(depth1).getWorkingDir());
				putQueryParameter("InitContainer." + (depth1 + 1) + ".ImagePullPolicy" , initContainers.get(depth1).getImagePullPolicy());
				if (initContainers.get(depth1).getCommands() != null) {
					for (int i = 0; i < initContainers.get(depth1).getCommands().size(); i++) {
						putQueryParameter("InitContainer." + (depth1 + 1) + ".Command." + (i + 1) , initContainers.get(depth1).getCommands().get(i));
					}
				}
				if (initContainers.get(depth1).getArgs() != null) {
					for (int i = 0; i < initContainers.get(depth1).getArgs().size(); i++) {
						putQueryParameter("InitContainer." + (depth1 + 1) + ".Arg." + (i + 1) , initContainers.get(depth1).getArgs().get(i));
					}
				}
				if (initContainers.get(depth1).getVolumeMounts() != null) {
					for (int depth2 = 0; depth2 < initContainers.get(depth1).getVolumeMounts().size(); depth2++) {
						putQueryParameter("InitContainer." + (depth1 + 1) + ".VolumeMount." + (depth2 + 1) + ".MountPath" , initContainers.get(depth1).getVolumeMounts().get(depth2).getMountPath());
						putQueryParameter("InitContainer." + (depth1 + 1) + ".VolumeMount." + (depth2 + 1) + ".ReadOnly" , initContainers.get(depth1).getVolumeMounts().get(depth2).getReadOnly());
						putQueryParameter("InitContainer." + (depth1 + 1) + ".VolumeMount." + (depth2 + 1) + ".Name" , initContainers.get(depth1).getVolumeMounts().get(depth2).getName());
					}
				}
				if (initContainers.get(depth1).getPorts() != null) {
					for (int depth2 = 0; depth2 < initContainers.get(depth1).getPorts().size(); depth2++) {
						putQueryParameter("InitContainer." + (depth1 + 1) + ".Port." + (depth2 + 1) + ".Protocol" , initContainers.get(depth1).getPorts().get(depth2).getProtocol());
						putQueryParameter("InitContainer." + (depth1 + 1) + ".Port." + (depth2 + 1) + ".Port" , initContainers.get(depth1).getPorts().get(depth2).getPort());
					}
				}
				if (initContainers.get(depth1).getEnvironmentVars() != null) {
					for (int depth2 = 0; depth2 < initContainers.get(depth1).getEnvironmentVars().size(); depth2++) {
						putQueryParameter("InitContainer." + (depth1 + 1) + ".EnvironmentVar." + (depth2 + 1) + ".Key" , initContainers.get(depth1).getEnvironmentVars().get(depth2).getKey());
						putQueryParameter("InitContainer." + (depth1 + 1) + ".EnvironmentVar." + (depth2 + 1) + ".Value" , initContainers.get(depth1).getEnvironmentVars().get(depth2).getValue());
					}
				}

				if(initContainers.get(depth1).getSecurityContext() != null){
					if (initContainers.get(depth1).getSecurityContext().getCapability() != null) {
						if(initContainers.get(depth1).getSecurityContext().getCapability().getAdds() != null){
							for (int i = 0; i < initContainers.get(depth1).getSecurityContext().getCapability().getAdds().size(); i++) {
								putQueryParameter("InitContainer." + (depth1 + 1) + ".SecurityContext.Capability.Add." + (i + 1) , initContainers.get(depth1).getSecurityContext().getCapability().getAdds().get(i));
							}
						}

					}
					putQueryParameter("InitContainer." + (depth1 + 1) + ".SecurityContext.ReadOnlyRootFilesystem" , initContainers.get(depth1).getSecurityContext().getReadOnlyRootFilesystem());
					putQueryParameter("InitContainer." + (depth1 + 1) + ".SecurityContext.RunAsUser" , initContainers.get(depth1).getSecurityContext().getRunAsUser());
				}
			}
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
				putQueryParameter("ImageRegistryCredential." + (depth1 + 1) + ".UserName" , imageRegistryCredentials.get(depth1).getUserName());
				putQueryParameter("ImageRegistryCredential." + (depth1 + 1) + ".Password" , imageRegistryCredentials.get(depth1).getPassword());
			}
		}
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
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

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
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

	public List<Volume> getVolumes() {
		return this.volumes;
	}

	public void setVolumes(List<Volume> volumes) {
		this.volumes = volumes;
		if (volumes != null) {
			for (int depth1 = 0; depth1 < volumes.size(); depth1++) {
				putQueryParameter("Volume." + (depth1 + 1) + ".Name" , volumes.get(depth1).getName());
				putQueryParameter("Volume." + (depth1 + 1) + ".NFSVolume.Server" , volumes.get(depth1).getNFSVolumeServer());
				putQueryParameter("Volume." + (depth1 + 1) + ".NFSVolume.Path" , volumes.get(depth1).getNFSVolumePath());
				putQueryParameter("Volume." + (depth1 + 1) + ".NFSVolume.ReadOnly" , volumes.get(depth1).getNFSVolumeReadOnly());

				putQueryParameter("Volume." + (depth1 + 1) + ".EmptyDirVolume.Medium" , volumes.get(depth1).getEmptyDirVolumeMedium());

				if (volumes.get(depth1).getConfigFileVolumeConfigFileToPaths() != null) {
					for (int depth2 = 0; depth2 < volumes.get(depth1).getConfigFileVolumeConfigFileToPaths().size(); depth2++) {
						putQueryParameter("Volume." + (depth1 + 1) + ".ConfigFileVolume.ConfigFileToPath." + (depth2 + 1) + ".Content" , volumes.get(depth1).getConfigFileVolumeConfigFileToPaths().get(depth2).getContent());
						putQueryParameter("Volume." + (depth1 + 1) + ".ConfigFileVolume.ConfigFileToPath." + (depth2 + 1) + ".Path" , volumes.get(depth1).getConfigFileVolumeConfigFileToPaths().get(depth2).getPath());
						putQueryParameter("Volume." + (depth1 + 1) + ".ConfigFileVolume.ConfigFileToPath." + (depth2 + 1) + ".Mode" , volumes.get(depth1).getConfigFileVolumeConfigFileToPaths().get(depth2).getMode());
					}
				}
				putQueryParameter("Volume." + (depth1 + 1) + ".ConfigFileVolume.DefaultModel" , volumes.get(depth1).getConfigFileVolumeDefaultModel());
				putQueryParameter("Volume." + (depth1 + 1) + ".Type" , volumes.get(depth1).getType());
			}
		}
	}

	public String getContainerGroupId() {
		return this.containerGroupId;
	}

	public void setContainerGroupId(String containerGroupId) {
		this.containerGroupId = containerGroupId;
		if(containerGroupId != null){
			putQueryParameter("ContainerGroupId", containerGroupId);
		}
	}


	public DnsConfig getDnsConfig(){
		return this.dnsConfig;
	}

	public void setDnsConfig(DnsConfig dnsConfig) {
		this.dnsConfig = dnsConfig;
		if(dnsConfig.getSearches() != null){
			for (int i = 0; i < dnsConfig.getSearches().size(); i++) {
				putQueryParameter("DnsConfig.Search." + (i + 1) , dnsConfig.getSearches().get(i));
			}
		}
		if(dnsConfig.getNameServers() != null){
			for (int i = 0; i < dnsConfig.getNameServers().size(); i++) {
				putQueryParameter("DnsConfig.NameServer." + (i + 1) , dnsConfig.getNameServers().get(i));
			}
		}
		if (dnsConfig.getOptions() != null) {
			for (int depth1 = 0; depth1 < dnsConfig.getOptions().size(); depth1++) {
				putQueryParameter("DnsConfig.Option." + (depth1 + 1) + ".Name" , dnsConfig.getOptions().get(depth1).getName());
				putQueryParameter("DnsConfig.Option." + (depth1 + 1) + ".Value" , dnsConfig.getOptions().get(depth1).getValue());
			}
		}
	}

	@Override
	public Class<UpdateContainerGroupResponse> getResponseClass() {
		return UpdateContainerGroupResponse.class;
	}

}
