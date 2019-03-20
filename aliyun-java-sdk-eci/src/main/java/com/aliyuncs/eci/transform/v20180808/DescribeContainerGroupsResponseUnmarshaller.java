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
import com.aliyuncs.eci.model.v20180808.DescribeContainerGroupsResponse.ContainerGroup.Container.*;
import com.aliyuncs.eci.model.v20180808.DescribeContainerGroupsResponse.ContainerGroup.Container.ContainerProbe;
import com.aliyuncs.eci.model.v20180808.DescribeContainerGroupsResponse.ContainerGroup.Container.ContainerProbe.*;
import com.aliyuncs.eci.model.v20180808.DescribeContainerGroupsResponse.ContainerGroup.Container.EnvironmentVar;
import com.aliyuncs.eci.model.v20180808.DescribeContainerGroupsResponse.ContainerGroup.Container.Port;
import com.aliyuncs.eci.model.v20180808.DescribeContainerGroupsResponse.ContainerGroup.Container.SecurityContext;
import com.aliyuncs.eci.model.v20180808.DescribeContainerGroupsResponse.ContainerGroup.Container.SecurityContext.Capability;
import com.aliyuncs.eci.model.v20180808.DescribeContainerGroupsResponse.ContainerGroup.Container.VolumeMount;
import com.aliyuncs.eci.model.v20180808.DescribeContainerGroupsResponse.ContainerGroup.DnsConfig;
import com.aliyuncs.eci.model.v20180808.DescribeContainerGroupsResponse.ContainerGroup.DnsConfig.Option;
import com.aliyuncs.eci.model.v20180808.DescribeContainerGroupsResponse.ContainerGroup.Event;
import com.aliyuncs.eci.model.v20180808.DescribeContainerGroupsResponse.ContainerGroup.Label;
import com.aliyuncs.eci.model.v20180808.DescribeContainerGroupsResponse.ContainerGroup.Volume;
import com.aliyuncs.eci.model.v20180808.DescribeContainerGroupsResponse.ContainerGroup.Volume.ConfigFileVolumeConfigFileToPath;
import com.aliyuncs.eci.model.v20180808.DescribeContainerGroupsResponse.ContainerGroup.HostAliase;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * 2018/12/29
 * @author liumi
 * @version 1.0.5
 */
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
			containerGroup.setEniInstanceId(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].EniInstanceId"));

			DnsConfig dnsConfig = new DnsConfig();

			List<String> nameServers = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].DnsConfig.NameServers.Length"); j++) {
				nameServers.add(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].DnsConfig.NameServers["+ j +"]"));
			}
			dnsConfig.setNameServers(nameServers);

			List<String> searches = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].DnsConfig.Searches.Length"); j++) {
				searches.add(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].DnsConfig.Searches["+ j +"]"));
			}
			dnsConfig.setSearches(searches);

			List<Option> options = new ArrayList<Option>();
			for (int j = 0; j < context.lengthValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].DnsConfig.Options.Length"); j++) {
				Option option = new Option();
				option.setName(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].DnsConfig.Options["+ j +"].Name"));
				option.setValue(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].DnsConfig.Options["+ j +"].Value"));

				options.add(option);
			}
			dnsConfig.setOptions(options);
			containerGroup.setDnsConfig(dnsConfig);

			List<Label> tags = new ArrayList<Label>();
			for (int j = 0; j < context.lengthValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Tags.Length"); j++) {
				Label label = new Label();
				label.setKey(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Tags["+ j +"].Key"));
				label.setValue(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Tags["+ j +"].Value"));

				tags.add(label);
			}
			containerGroup.setTags(tags);

			List<HostAliase> hostAliases = new ArrayList<HostAliase>();
			for (int j = 0; j < context.lengthValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].HostAliases.Length"); j++) {
				HostAliase hostAliase = new HostAliase();
				hostAliase.setHostnames(new ArrayList<String>());
				hostAliase.setIp(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].HostAliases["+ j +"].Ip"));
				for(int k = 0; k < context.lengthValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].HostAliases["+ j +"].Hostnames.Length"); k++){
					hostAliase.getHostnames().add(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].HostAliases["+ j +"].Hostnames[" + k + "]"));
				}

				hostAliases.add(hostAliase);
			}
			containerGroup.setHostAliases(hostAliases);



			List<Event> events = new ArrayList<Event>();
			for (int j = 0; j < context.lengthValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Events.Length"); j++) {
				Event event = new Event();
				event.setCount(context.integerValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Events["+ j +"].Count"));
				event.setType(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Events["+ j +"].Type"));
				event.setName(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Events["+ j +"].Name"));
				event.setMessage(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Events["+ j +"].Message"));
				event.setFirstTimestamp(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Events["+ j +"].FirstTimestamp"));
				event.setLastTimestamp(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Events["+ j +"].LastTimestamp"));
				event.setReason(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Events["+ j +"].Reason"));

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

				ContainerState previousState = new ContainerState();
				previousState.setState(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].PreviousState.State"));
				previousState.setDetailStatus(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].PreviousState.DetailStatus"));
				previousState.setExitCode(context.integerValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].PreviousState.ExitCode"));
				previousState.setStartTime(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].PreviousState.StartTime"));
				previousState.setFinishTime(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].PreviousState.FinishTime"));
				container.setPreviousState(previousState);

				ContainerState currentState = new ContainerState();
				currentState.setState(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].CurrentState.State"));
				currentState.setDetailStatus(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].CurrentState.DetailStatus"));
				currentState.setExitCode(context.integerValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].CurrentState.ExitCode"));
				currentState.setStartTime(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].CurrentState.StartTime"));
				currentState.setFinishTime(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].CurrentState.FinishTime"));
				container.setCurrentState(currentState);

				ContainerProbe readinessProbe = new ContainerProbe();
				readinessProbe.setInitialDelaySeconds(context.integerValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].ReadinessProbe.InitialDelaySeconds"));
				readinessProbe.setPeriodSeconds(context.integerValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].ReadinessProbe.PeriodSeconds"));
				readinessProbe.setTimeoutSeconds(context.integerValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].ReadinessProbe.TimeoutSeconds"));
				readinessProbe.setSuccessThreshold(context.integerValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].ReadinessProbe.SuccessThreshold"));
				readinessProbe.setFailureThreshold(context.integerValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].ReadinessProbe.FailureThreshold"));

				List<String> execs = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].ReadinessProbe.Execs.Length"); k++) {
					execs.add(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].ReadinessProbe.Execs["+ k +"]"));
				}
				readinessProbe.setExecs(execs);

				HttpGet httpGet = new HttpGet();
				httpGet.setPath(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].ReadinessProbe.HttpGet.Path"));
				httpGet.setPort(context.integerValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].ReadinessProbe.HttpGet.Port"));
				httpGet.setScheme(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].ReadinessProbe.HttpGet.Scheme"));
				readinessProbe.setHttpGet(httpGet);

				TcpSocket tcpSocket = new TcpSocket();
				tcpSocket.setHost(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].ReadinessProbe.TcpSocket.Host"));
				tcpSocket.setPort(context.integerValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].ReadinessProbe.TcpSocket.Port"));
				readinessProbe.setTcpSocket(tcpSocket);

				container.setReadinessProbe(readinessProbe);

				ContainerProbe livenessProbe = new ContainerProbe();
				livenessProbe.setInitialDelaySeconds(context.integerValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].LivenessProbe.InitialDelaySeconds"));
				livenessProbe.setPeriodSeconds(context.integerValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].LivenessProbe.PeriodSeconds"));
				livenessProbe.setTimeoutSeconds(context.integerValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].LivenessProbe.TimeoutSeconds"));
				livenessProbe.setSuccessThreshold(context.integerValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].LivenessProbe.SuccessThreshold"));
				livenessProbe.setFailureThreshold(context.integerValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].LivenessProbe.FailureThreshold"));

				List<String> execs2 = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].LivenessProbe.Execs.Length"); k++) {
					execs2.add(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].LivenessProbe.Execs["+ k +"]"));
				}
				livenessProbe.setExecs(execs2);

				HttpGet httpGet2 = new HttpGet();
				httpGet2.setPath(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].LivenessProbe.HttpGet.Path"));
				httpGet2.setPort(context.integerValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].LivenessProbe.HttpGet.Port"));
				httpGet2.setScheme(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].LivenessProbe.HttpGet.Scheme"));
				livenessProbe.setHttpGet(httpGet2);

				TcpSocket tcpSocket2 = new TcpSocket();
				tcpSocket2.setHost(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].LivenessProbe.TcpSocket.Host"));
				tcpSocket2.setPort(context.integerValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].LivenessProbe.TcpSocket.Port"));
				livenessProbe.setTcpSocket(tcpSocket2);

				container.setLivenessProbe(livenessProbe);

				SecurityContext securityContext = new SecurityContext();
				securityContext.setReadOnlyRootFilesystem(context.booleanValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].SecurityContext.ReadOnlyRootFilesystem"));
				securityContext.setRunAsUser(context.longValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].SecurityContext.RunAsUser"));

				Capability capability = new Capability();

				List<String> adds = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].SecurityContext.Capability.Adds.Length"); k++) {
					adds.add(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].SecurityContext.Capability.Adds["+ k +"]"));
				}
				capability.setAdds(adds);
				securityContext.setCapability(capability);
				container.setSecurityContext(securityContext);

				List<VolumeMount> volumeMounts = new ArrayList<VolumeMount>();
				for (int k = 0; k < context.lengthValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].VolumeMounts.Length"); k++) {
					VolumeMount volumeMount = new VolumeMount();
					volumeMount.setName(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].VolumeMounts["+ k +"].Name"));
					volumeMount.setSubPath(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].Containers["+ j +"].VolumeMounts["+ k +"].SubPath"));
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

				List<String> args = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].Args.Length"); k++) {
					args.add(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].Args["+ k +"]"));
				}
				container.setArgs(args);

				ContainerState previousState = new ContainerState();
				previousState.setState(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].PreviousState.State"));
				previousState.setDetailStatus(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].PreviousState.DetailStatus"));
				previousState.setExitCode(context.integerValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].PreviousState.ExitCode"));
				previousState.setStartTime(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].PreviousState.StartTime"));
				previousState.setFinishTime(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].PreviousState.FinishTime"));
				container.setPreviousState(previousState);

				ContainerState currentState = new ContainerState();
				currentState.setState(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].CurrentState.State"));
				currentState.setDetailStatus(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].CurrentState.DetailStatus"));
				currentState.setExitCode(context.integerValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].CurrentState.ExitCode"));
				currentState.setStartTime(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].CurrentState.StartTime"));
				currentState.setFinishTime(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].CurrentState.FinishTime"));
				container.setCurrentState(currentState);

				SecurityContext securityContext = new SecurityContext();
				securityContext.setReadOnlyRootFilesystem(context.booleanValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].SecurityContext.ReadOnlyRootFilesystem"));
				securityContext.setRunAsUser(context.longValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].SecurityContext.RunAsUser"));

				Capability capability = new Capability();

				List<String> adds = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].SecurityContext.Capability.Adds.Length"); k++) {
					adds.add(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].SecurityContext.Capability.Adds["+ k +"]"));
				}
				capability.setAdds(adds);
				securityContext.setCapability(capability);
				container.setSecurityContext(securityContext);

				List<VolumeMount> volumeMounts = new ArrayList<VolumeMount>();
				for (int k = 0; k < context.lengthValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].VolumeMounts.Length"); k++) {
					VolumeMount volumeMount = new VolumeMount();
					volumeMount.setName(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].VolumeMounts["+ k +"].Name"));
					volumeMount.setMountPath(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].VolumeMounts["+ k +"].MountPath"));
					volumeMount.setReadOnly(context.booleanValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].VolumeMounts["+ k +"].ReadOnly"));

					volumeMounts.add(volumeMount);
				}
				container.setVolumeMounts(volumeMounts);

				List<Port> ports = new ArrayList<Port>();
				for (int k = 0; k < context.lengthValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].Ports.Length"); k++) {
					Port port = new Port();
					port.setPort(context.integerValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].Ports["+ k +"].Port"));
					port.setProtocol(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].Ports["+ k +"].Protocol"));

					ports.add(port);
				}
				container.setPorts(ports);

				List<EnvironmentVar> environmentVars = new ArrayList<EnvironmentVar>();
				for (int k = 0; k < context.lengthValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].EnvironmentVars.Length"); k++) {
					EnvironmentVar environmentVar = new EnvironmentVar();
					environmentVar.setKey(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].EnvironmentVars["+ k +"].Key"));
					environmentVar.setValue(context.stringValue("DescribeContainerGroupsResponse.ContainerGroups["+ i +"].InitContainers["+ j +"].EnvironmentVars["+ k +"].Value"));

					environmentVars.add(environmentVar);
				}
				container.setEnvironmentVars(environmentVars);

				initContainers.add(container);
			}
			containerGroup.setInitContainers(initContainers);

			containerGroups.add(containerGroup);
		}
		describeContainerGroupsResponse.setContainerGroups(containerGroups);

		return describeContainerGroupsResponse;
	}
}