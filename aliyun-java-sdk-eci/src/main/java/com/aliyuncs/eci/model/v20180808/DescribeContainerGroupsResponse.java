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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eci.transform.v20180808.DescribeContainerGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeContainerGroupsResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private Integer totalCount;

	private List<ContainerGroup> containerGroups;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<ContainerGroup> getContainerGroups() {
		return this.containerGroups;
	}

	public void setContainerGroups(List<ContainerGroup> containerGroups) {
		this.containerGroups = containerGroups;
	}

	public static class ContainerGroup {

		private String containerGroupId;

		private String containerGroupName;

		private String regionId;

		private String zoneId;

		private Float memory;

		private Float cpu;

		private String vSwitchId;

		private String securityGroupId;

		private String restartPolicy;

		private String intranetIp;

		private String status;

		private String internetIp;

		private String creationTime;

		private String succeededTime;

		private List<Label> tags;

		private List<Event> events;

		private List<Container> containers;

		private List<Volume> volumes;

		private List<Container> initContainers;

		public String getContainerGroupId() {
			return this.containerGroupId;
		}

		public void setContainerGroupId(String containerGroupId) {
			this.containerGroupId = containerGroupId;
		}

		public String getContainerGroupName() {
			return this.containerGroupName;
		}

		public void setContainerGroupName(String containerGroupName) {
			this.containerGroupName = containerGroupName;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

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

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
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

		public String getIntranetIp() {
			return this.intranetIp;
		}

		public void setIntranetIp(String intranetIp) {
			this.intranetIp = intranetIp;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getInternetIp() {
			return this.internetIp;
		}

		public void setInternetIp(String internetIp) {
			this.internetIp = internetIp;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getSucceededTime() {
			return this.succeededTime;
		}

		public void setSucceededTime(String succeededTime) {
			this.succeededTime = succeededTime;
		}

		public List<Label> getTags() {
			return this.tags;
		}

		public void setTags(List<Label> tags) {
			this.tags = tags;
		}

		public List<Event> getEvents() {
			return this.events;
		}

		public void setEvents(List<Event> events) {
			this.events = events;
		}

		public List<Container> getContainers() {
			return this.containers;
		}

		public void setContainers(List<Container> containers) {
			this.containers = containers;
		}

		public List<Volume> getVolumes() {
			return this.volumes;
		}

		public void setVolumes(List<Volume> volumes) {
			this.volumes = volumes;
		}

		public List<Container> getInitContainers() {
			return this.initContainers;
		}

		public void setInitContainers(List<Container> initContainers) {
			this.initContainers = initContainers;
		}

		public static class Label {

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

		public static class Event {

			private Integer count;

			private String type;

			private String name;

			private String message;

			private String firstTimestamp;

			private String lastTimestamp;

			public Integer getCount() {
				return this.count;
			}

			public void setCount(Integer count) {
				this.count = count;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getMessage() {
				return this.message;
			}

			public void setMessage(String message) {
				this.message = message;
			}

			public String getFirstTimestamp() {
				return this.firstTimestamp;
			}

			public void setFirstTimestamp(String firstTimestamp) {
				this.firstTimestamp = firstTimestamp;
			}

			public String getLastTimestamp() {
				return this.lastTimestamp;
			}

			public void setLastTimestamp(String lastTimestamp) {
				this.lastTimestamp = lastTimestamp;
			}
		}

		public static class Container {

			private String name;

			private String image;

			private Float memory;

			private Float cpu;

			private Integer restartCount;

			private String workingDir;

			private String imagePullPolicy;

			private List<VolumeMount> volumeMounts;

			private List<Port> ports;

			private List<EnvironmentVar> environmentVars;

			private List<String> commands;

			private List<String> args;

			private PreviousState previousState;

			private CurrentState currentState;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getImage() {
				return this.image;
			}

			public void setImage(String image) {
				this.image = image;
			}

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

			public Integer getRestartCount() {
				return this.restartCount;
			}

			public void setRestartCount(Integer restartCount) {
				this.restartCount = restartCount;
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

			public PreviousState getPreviousState() {
				return this.previousState;
			}

			public void setPreviousState(PreviousState previousState) {
				this.previousState = previousState;
			}

			public CurrentState getCurrentState() {
				return this.currentState;
			}

			public void setCurrentState(CurrentState currentState) {
				this.currentState = currentState;
			}

			public static class VolumeMount {

				private String name;

				private String mountPath;

				private Boolean readOnly;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

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

				public String getProtocol() {
					return this.protocol;
				}

				public void setProtocol(String protocol) {
					this.protocol = protocol;
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

			public static class PreviousState {

				private String state;

				private String detailStatus;

				private Integer exitCode;

				private String startTime;

				private String finishTime;

				public String getState() {
					return this.state;
				}

				public void setState(String state) {
					this.state = state;
				}

				public String getDetailStatus() {
					return this.detailStatus;
				}

				public void setDetailStatus(String detailStatus) {
					this.detailStatus = detailStatus;
				}

				public Integer getExitCode() {
					return this.exitCode;
				}

				public void setExitCode(Integer exitCode) {
					this.exitCode = exitCode;
				}

				public String getStartTime() {
					return this.startTime;
				}

				public void setStartTime(String startTime) {
					this.startTime = startTime;
				}

				public String getFinishTime() {
					return this.finishTime;
				}

				public void setFinishTime(String finishTime) {
					this.finishTime = finishTime;
				}
			}

			public static class CurrentState {

				private String state;

				private String detailStatus;

				private Integer exitCode;

				private String startTime;

				private String finishTime;

				public String getState() {
					return this.state;
				}

				public void setState(String state) {
					this.state = state;
				}

				public String getDetailStatus() {
					return this.detailStatus;
				}

				public void setDetailStatus(String detailStatus) {
					this.detailStatus = detailStatus;
				}

				public Integer getExitCode() {
					return this.exitCode;
				}

				public void setExitCode(Integer exitCode) {
					this.exitCode = exitCode;
				}

				public String getStartTime() {
					return this.startTime;
				}

				public void setStartTime(String startTime) {
					this.startTime = startTime;
				}

				public String getFinishTime() {
					return this.finishTime;
				}

				public void setFinishTime(String finishTime) {
					this.finishTime = finishTime;
				}
			}
		}

		public static class Volume {

			private String type;

			private String name;

			private String nFSVolumePath;

			private String nFSVolumeServer;

			private Boolean nFSVolumeReadOnly;

			private Boolean emptyDirVolumeEnable;

			private List<ConfigFileVolumeConfigFileToPath> configFileVolumeConfigFileToPaths;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getNFSVolumePath() {
				return this.nFSVolumePath;
			}

			public void setNFSVolumePath(String nFSVolumePath) {
				this.nFSVolumePath = nFSVolumePath;
			}

			public String getNFSVolumeServer() {
				return this.nFSVolumeServer;
			}

			public void setNFSVolumeServer(String nFSVolumeServer) {
				this.nFSVolumeServer = nFSVolumeServer;
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
	}

	@Override
	public DescribeContainerGroupsResponse getInstance(UnmarshallerContext context) {
		return	DescribeContainerGroupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
