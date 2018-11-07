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
 * @author auto create
 * @version 
 */
public class CreateContainerGroupRequest extends RpcAcsRequest<CreateContainerGroupResponse> {
	
	public CreateContainerGroupRequest() {
		super("Eci", "2018-08-08", "CreateContainerGroup", "eci");
	}

	private List<Container> containers;

	private Long resourceOwnerId;

	private String securityGroupId;

	private List<Container> initContainers;

	private List<ImageRegistryCredential> imageRegistryCredentials;

	private List<Tag> tags;

	private String eipInstanceId;

	private String resourceOwnerAccount;

	private String restartPolicy;

	private String ownerAccount;

	private Long ownerId;

	private String vSwitchId;

	private List<Volume> volumes;

	private String containerGroupName;

	private String zoneId;

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
					}
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

	public String getSecurityGroupId() {
		return this.securityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		this.securityGroupId = securityGroupId;
		if(securityGroupId != null){
			putQueryParameter("SecurityGroupId", securityGroupId);
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

	public String getEipInstanceId() {
		return this.eipInstanceId;
	}

	public void setEipInstanceId(String eipInstanceId) {
		this.eipInstanceId = eipInstanceId;
		if(eipInstanceId != null){
			putQueryParameter("EipInstanceId", eipInstanceId);
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

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putQueryParameter("VSwitchId", vSwitchId);
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
				putQueryParameter("Volume." + (depth1 + 1) + ".EmptyDirVolume.Enable" , volumes.get(depth1).getEmptyDirVolumeEnable());
				if (volumes.get(depth1).getConfigFileVolumeConfigFileToPaths() != null) {
					for (int depth2 = 0; depth2 < volumes.get(depth1).getConfigFileVolumeConfigFileToPaths().size(); depth2++) {
						putQueryParameter("Volume." + (depth1 + 1) + ".ConfigFileVolume.ConfigFileToPath." + (depth2 + 1) + ".Content" , volumes.get(depth1).getConfigFileVolumeConfigFileToPaths().get(depth2).getContent());
						putQueryParameter("Volume." + (depth1 + 1) + ".ConfigFileVolume.ConfigFileToPath." + (depth2 + 1) + ".Path" , volumes.get(depth1).getConfigFileVolumeConfigFileToPaths().get(depth2).getPath());
					}
				}
				putQueryParameter("Volume." + (depth1 + 1) + ".Type" , volumes.get(depth1).getType());
			}
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

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
		}
	}

	public static class Container {

		private String image;

		private String name;

		private Float cpu;

		private Float memory;

		private String workingDir;

		private String imagePullPolicy;

		private List<String> commands;

		private List<String> args;

		private List<VolumeMount> volumeMounts;

		private List<Port> ports;

		private List<EnvironmentVar> environmentVars;

		public String getImage() {
			return this.image;
		}

		public void setImage(String image) {
			this.image = image;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Float getCpu() {
			return this.cpu;
		}

		public void setCpu(Float cpu) {
			this.cpu = cpu;
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

		public List<String> getArgs() {
			return this.args;
		}

		public void setArgs(List<String> args) {
			this.args = args;
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

		public List<EnvironmentVar> getEnvironmentVars() {
			return this.environmentVars;
		}

		public void setEnvironmentVars(List<EnvironmentVar> environmentVars) {
			this.environmentVars = environmentVars;
		}

		public static class VolumeMount {

			private String mountPath;

			private Boolean readOnly;

			private String name;

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

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		public static class Port {

			private String protocol;

			private Integer port;

			public String getProtocol() {
				return this.protocol;
			}

			public void setProtocol(String protocol) {
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
	}

	public static class ImageRegistryCredential {

		private String server;

		private String userName;

		private String password;

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

		public String getPassword() {
			return this.password;
		}

		public void setPassword(String password) {
			this.password = password;
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

		private String name;

		private String nFSVolumeServer;

		private String nFSVolumePath;

		private Boolean nFSVolumeReadOnly;

		private Boolean emptyDirVolumeEnable;

		private List<ConfigFileVolumeConfigFileToPath> configFileVolumeConfigFileToPaths;

		private String type;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getNFSVolumeServer() {
			return this.nFSVolumeServer;
		}

		public void setNFSVolumeServer(String nFSVolumeServer) {
			this.nFSVolumeServer = nFSVolumeServer;
		}

		public String getNFSVolumePath() {
			return this.nFSVolumePath;
		}

		public void setNFSVolumePath(String nFSVolumePath) {
			this.nFSVolumePath = nFSVolumePath;
		}

		public Boolean getNFSVolumeReadOnly() {
			return this.nFSVolumeReadOnly;
		}

		public void setNFSVolumeReadOnly(Boolean nFSVolumeReadOnly) {
			this.nFSVolumeReadOnly = nFSVolumeReadOnly;
		}

		public Boolean getEmptyDirVolumeEnable() {
			return this.emptyDirVolumeEnable;
		}

		public void setEmptyDirVolumeEnable(Boolean emptyDirVolumeEnable) {
			this.emptyDirVolumeEnable = emptyDirVolumeEnable;
		}

		public List<ConfigFileVolumeConfigFileToPath> getConfigFileVolumeConfigFileToPaths() {
			return this.configFileVolumeConfigFileToPaths;
		}

		public void setConfigFileVolumeConfigFileToPaths(List<ConfigFileVolumeConfigFileToPath> configFileVolumeConfigFileToPaths) {
			this.configFileVolumeConfigFileToPaths = configFileVolumeConfigFileToPaths;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public static class ConfigFileVolumeConfigFileToPath {

			private String content;

			private String path;

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}

			public String getPath() {
				return this.path;
			}

			public void setPath(String path) {
				this.path = path;
			}
		}
	}

	@Override
	public Class<CreateContainerGroupResponse> getResponseClass() {
		return CreateContainerGroupResponse.class;
	}

}
