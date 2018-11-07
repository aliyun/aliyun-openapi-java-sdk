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

package com.aliyuncs.eci.transform.v20180808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eci.model.v20180808.DescribeContainerGroupsResponse;
import com.aliyuncs.eci.model.v20180808.DescribeContainerGroupsResponse.ContainerGroup;
import com.aliyuncs.eci.model.v20180808.DescribeContainerGroupsResponse.ContainerGroup.Container;
import com.aliyuncs.eci.model.v20180808.DescribeContainerGroupsResponse.ContainerGroup.Container.CurrentState;
import com.aliyuncs.eci.model.v20180808.DescribeContainerGroupsResponse.ContainerGroup.Container.EnvironmentVar;
import com.aliyuncs.eci.model.v20180808.DescribeContainerGroupsResponse.ContainerGroup.Container.Port;
import com.aliyuncs.eci.model.v20180808.DescribeContainerGroupsResponse.ContainerGroup.Container.PreviousState;
import com.aliyuncs.eci.model.v20180808.DescribeContainerGroupsResponse.ContainerGroup.Container.VolumeMount;
import com.aliyuncs.eci.model.v20180808.DescribeContainerGroupsResponse.ContainerGroup.Event;
import com.aliyuncs.eci.model.v20180808.DescribeContainerGroupsResponse.ContainerGroup.Label;
import com.aliyuncs.eci.model.v20180808.DescribeContainerGroupsResponse.ContainerGroup.Volume;
import com.aliyuncs.eci.model.v20180808.DescribeContainerGroupsResponse.ContainerGroup.Volume.ConfigFileVolumeConfigFileToPath;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeContainerGroupsResponseUnmarshaller {

	public static DescribeContainerGroupsResponse unmarshall(DescribeContainerGroupsResponse describeContainerGroupsResponse, UnmarshallerContext context) {
		
		describeContainerGroupsResponse.setRequestId(context.stringValue("DescribeContainerGroupsResponse.RequestId"));
		describeContainerGroupsResponse.setNextToken(context.stringValue("DescribeContainerGroupsResponse.NextToken"));
		describeContainerGroupsResponse.setTotalCount(context.integerValue("DescribeContainerGroupsResponse.TotalCount"));

		List<ContainerGroup> containerGroups = new ArrayList<ContainerGroup>();
		for (int i = 0; i < context.lengthValue("DescribeContainerGroupsResponse.ContainerGroups.Length"); i++) {
			ContainerGroup containerGroup = new ContainerGroup();
			containerGroup.setContainerGroupId(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].ContainerGroupId"));
			containerGroup.setContainerGroupName(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].ContainerGroupName"));
			containerGroup.setRegionId(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].RegionId"));
			containerGroup.setZoneId(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].ZoneId"));
			containerGroup.setMemory(context.floatValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Memory"));
			containerGroup.setCpu(context.floatValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Cpu"));
			containerGroup.setVSwitchId(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].VSwitchId"));
			containerGroup.setSecurityGroupId(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].SecurityGroupId"));
			containerGroup.setRestartPolicy(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].RestartPolicy"));
			containerGroup.setIntranetIp(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].IntranetIp"));
			containerGroup.setStatus(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Status"));
			containerGroup.setInternetIp(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InternetIp"));
			containerGroup.setCreationTime(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].CreationTime"));
			containerGroup.setSucceededTime(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].SucceededTime"));

			List<Label> tags = new ArrayList<Label>();
			for (int j = 0; j < context.lengthValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Tags.Length"); j++) {
				Label label = new Label();
				label.setKey(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Tags["+ j +"].Key"));
				label.setValue(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Tags["+ j +"].Value"));

				tags.add(label);
			}
			containerGroup.setTags(tags);

			List<Event> events = new ArrayList<Event>();
			for (int j = 0; j < context.lengthValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Events.Length"); j++) {
				Event event = new Event();
				event.setCount(context.integerValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Events["+ j +"].Count"));
				event.setType(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Events["+ j +"].Type"));
				event.setName(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Events["+ j +"].Name"));
				event.setMessage(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Events["+ j +"].Message"));
				event.setFirstTimestamp(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Events["+ j +"].FirstTimestamp"));
				event.setLastTimestamp(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Events["+ j +"].LastTimestamp"));

				events.add(event);
			}
			containerGroup.setEvents(events);

			List<Container> containers = new ArrayList<Container>();
			for (int j = 0; j < context.lengthValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers.Length"); j++) {
				Container container = new Container();
				container.setName(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].Name"));
				container.setImage(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].Image"));
				container.setMemory(context.floatValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].Memory"));
				container.setCpu(context.floatValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].Cpu"));
				container.setRestartCount(context.integerValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].RestartCount"));
				container.setWorkingDir(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].WorkingDir"));
				container.setImagePullPolicy(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].ImagePullPolicy"));

				List<String> commands = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].Commands.Length"); k++) {
					commands.add(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].Commands["+ k +"]"));
				}
				container.setCommands(commands);

				List<String> args = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].Args.Length"); k++) {
					args.add(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].Args["+ k +"]"));
				}
				container.setArgs(args);

				PreviousState previousState = new PreviousState();
				previousState.setState(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].PreviousState.State"));
				previousState.setDetailStatus(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].PreviousState.DetailStatus"));
				previousState.setExitCode(context.integerValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].PreviousState.ExitCode"));
				previousState.setStartTime(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].PreviousState.StartTime"));
				previousState.setFinishTime(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].PreviousState.FinishTime"));
				container.setPreviousState(previousState);

				CurrentState currentState = new CurrentState();
				currentState.setState(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].CurrentState.State"));
				currentState.setDetailStatus(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].CurrentState.DetailStatus"));
				currentState.setExitCode(context.integerValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].CurrentState.ExitCode"));
				currentState.setStartTime(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].CurrentState.StartTime"));
				currentState.setFinishTime(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].CurrentState.FinishTime"));
				container.setCurrentState(currentState);

				List<VolumeMount> volumeMounts = new ArrayList<VolumeMount>();
				for (int k = 0; k < context.lengthValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].VolumeMounts.Length"); k++) {
					VolumeMount volumeMount = new VolumeMount();
					volumeMount.setName(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].VolumeMounts["+ k +"].Name"));
					volumeMount.setMountPath(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].VolumeMounts["+ k +"].MountPath"));
					volumeMount.setReadOnly(context.booleanValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].VolumeMounts["+ k +"].ReadOnly"));

					volumeMounts.add(volumeMount);
				}
				container.setVolumeMounts(volumeMounts);

				List<Port> ports = new ArrayList<Port>();
				for (int k = 0; k < context.lengthValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].Ports.Length"); k++) {
					Port port = new Port();
					port.setPort(context.integerValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].Ports["+ k +"].Port"));
					port.setProtocol(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].Ports["+ k +"].Protocol"));

					ports.add(port);
				}
				container.setPorts(ports);

				List<EnvironmentVar> environmentVars = new ArrayList<EnvironmentVar>();
				for (int k = 0; k < context.lengthValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].EnvironmentVars.Length"); k++) {
					EnvironmentVar environmentVar = new EnvironmentVar();
					environmentVar.setKey(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].EnvironmentVars["+ k +"].Key"));
					environmentVar.setValue(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].EnvironmentVars["+ k +"].Value"));

					environmentVars.add(environmentVar);
				}
				container.setEnvironmentVars(environmentVars);

				containers.add(container);
			}
			containerGroup.setContainers(containers);

			List<Volume> volumes = new ArrayList<Volume>();
			for (int j = 0; j < context.lengthValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Volumes.Length"); j++) {
				Volume volume = new Volume();
				volume.setType(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Volumes["+ j +"].Type"));
				volume.setName(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Volumes["+ j +"].Name"));
				volume.setNFSVolumePath(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Volumes["+ j +"].NFSVolumePath"));
				volume.setNFSVolumeServer(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Volumes["+ j +"].NFSVolumeServer"));
				volume.setNFSVolumeReadOnly(context.booleanValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Volumes["+ j +"].NFSVolumeReadOnly"));
				volume.setEmptyDirVolumeEnable(context.booleanValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Volumes["+ j +"].EmptyDirVolumeEnable"));

				List<ConfigFileVolumeConfigFileToPath> configFileVolumeConfigFileToPaths = new ArrayList<ConfigFileVolumeConfigFileToPath>();
				for (int k = 0; k < context.lengthValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Volumes["+ j +"].ConfigFileVolumeConfigFileToPaths.Length"); k++) {
					ConfigFileVolumeConfigFileToPath configFileVolumeConfigFileToPath = new ConfigFileVolumeConfigFileToPath();
					configFileVolumeConfigFileToPath.setContent(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Volumes["+ j +"].ConfigFileVolumeConfigFileToPaths["+ k +"].Content"));
					configFileVolumeConfigFileToPath.setPath(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Volumes["+ j +"].ConfigFileVolumeConfigFileToPaths["+ k +"].Path"));

					configFileVolumeConfigFileToPaths.add(configFileVolumeConfigFileToPath);
				}
				volume.setConfigFileVolumeConfigFileToPaths(configFileVolumeConfigFileToPaths);

				volumes.add(volume);
			}
			containerGroup.setVolumes(volumes);

			List<Container> initContainers = new ArrayList<Container>();
			for (int j = 0; j < context.lengthValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers.Length"); j++) {
				Container container = new Container();
				container.setName(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].Name"));
				container.setImage(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].Image"));
				container.setCpu(context.floatValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].Cpu"));
				container.setMemory(context.floatValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].Memory"));
				container.setRestartCount(context.integerValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].RestartCount"));
				container.setWorkingDir(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].WorkingDir"));
				container.setImagePullPolicy(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].ImagePullPolicy"));

				List<String> command = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].Command.Length"); k++) {
					command.add(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].Command["+ k +"]"));
				}
				container.setCommands(command);

				List<String> args2 = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].Args.Length"); k++) {
					args2.add(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].Args["+ k +"]"));
				}
				container.setArgs(args2);

				PreviousState previousState = new PreviousState();
				previousState.setState(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].PreviousState.State"));
				previousState.setDetailStatus(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].PreviousState.DetailStatus"));
				previousState.setExitCode(context.integerValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].PreviousState.ExitCode"));
				previousState.setStartTime(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].PreviousState.StartTime"));
				previousState.setFinishTime(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].PreviousState.FinishTime"));
				container.setPreviousState(previousState);

				CurrentState currentState = new CurrentState();
				currentState.setState(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].CurrentState.State"));
				currentState.setDetailStatus(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].CurrentState.DetailStatus"));
				currentState.setExitCode(context.integerValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].CurrentState.ExitCode"));
				currentState.setStartTime(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].CurrentState.StartTime"));
				currentState.setFinishTime(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].CurrentState.FinishTime"));
				container.setCurrentState(currentState);

				List<VolumeMount> volumeMounts = new ArrayList<VolumeMount>();
				for (int k = 0; k < context.lengthValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].VolumeMounts.Length"); k++) {
					VolumeMount volumeMount = new VolumeMount();
					volumeMount.setName(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].VolumeMounts["+ k +"].Name"));
					volumeMount.setMountPath(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].VolumeMounts["+ k +"].MountPath"));
					volumeMount.setReadOnly(context.booleanValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].VolumeMounts["+ k +"].ReadOnly"));

					volumeMounts.add(volumeMount);
				}
				container.setVolumeMounts(volumeMounts);

				List<Port> ports6 = new ArrayList<Port>();
				for (int k = 0; k < context.lengthValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].Ports.Length"); k++) {
					Port port = new Port();
					port.setPort(context.integerValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].Ports["+ k +"].Port"));
					port.setProtocol(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].Ports["+ k +"].Protocol"));

					ports6.add(port);
				}
				container.setPorts(ports6);

				List<EnvironmentVar> environmentVars7 = new ArrayList<EnvironmentVar>();
				for (int k = 0; k < context.lengthValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].EnvironmentVars.Length"); k++) {
					EnvironmentVar environmentVar = new EnvironmentVar();
					environmentVar.setKey(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].EnvironmentVars["+ k +"].Key"));
					environmentVar.setValue(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].EnvironmentVars["+ k +"].Value"));

					environmentVars7.add(environmentVar);
				}
				container.setEnvironmentVars(environmentVars7);

				initContainers.add(container);
			}
			containerGroup.setInitContainers(initContainers);

			containerGroups.add(containerGroup);
		}
		describeContainerGroupsResponse.setContainerGroups(containerGroups);
	 
	 	return describeContainerGroupsResponse;
	}
}