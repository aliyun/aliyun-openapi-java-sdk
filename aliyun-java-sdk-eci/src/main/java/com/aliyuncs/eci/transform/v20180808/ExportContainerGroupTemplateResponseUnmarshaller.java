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

import com.aliyuncs.eci.model.v20180808.ExportContainerGroupTemplateResponse;
import com.aliyuncs.eci.model.v20180808.ExportContainerGroupTemplateResponse.Template;
import com.aliyuncs.eci.model.v20180808.ExportContainerGroupTemplateResponse.Template.Resources;
import com.aliyuncs.eci.model.v20180808.ExportContainerGroupTemplateResponse.Template.Spec;
import com.aliyuncs.eci.model.v20180808.ExportContainerGroupTemplateResponse.Template.Spec.ContainersItem;
import com.aliyuncs.eci.model.v20180808.ExportContainerGroupTemplateResponse.Template.Spec.ContainersItem.EnvItem9;
import com.aliyuncs.eci.model.v20180808.ExportContainerGroupTemplateResponse.Template.Spec.ContainersItem.LivenessProbe;
import com.aliyuncs.eci.model.v20180808.ExportContainerGroupTemplateResponse.Template.Spec.ContainersItem.LivenessProbe.Exec15;
import com.aliyuncs.eci.model.v20180808.ExportContainerGroupTemplateResponse.Template.Spec.ContainersItem.LivenessProbe.HttpGet17;
import com.aliyuncs.eci.model.v20180808.ExportContainerGroupTemplateResponse.Template.Spec.ContainersItem.LivenessProbe.TcpSocket16;
import com.aliyuncs.eci.model.v20180808.ExportContainerGroupTemplateResponse.Template.Spec.ContainersItem.Port10;
import com.aliyuncs.eci.model.v20180808.ExportContainerGroupTemplateResponse.Template.Spec.ContainersItem.ReadinessProbe;
import com.aliyuncs.eci.model.v20180808.ExportContainerGroupTemplateResponse.Template.Spec.ContainersItem.ReadinessProbe.Exec;
import com.aliyuncs.eci.model.v20180808.ExportContainerGroupTemplateResponse.Template.Spec.ContainersItem.ReadinessProbe.HttpGet;
import com.aliyuncs.eci.model.v20180808.ExportContainerGroupTemplateResponse.Template.Spec.ContainersItem.ReadinessProbe.TcpSocket;
import com.aliyuncs.eci.model.v20180808.ExportContainerGroupTemplateResponse.Template.Spec.ContainersItem.Resources5;
import com.aliyuncs.eci.model.v20180808.ExportContainerGroupTemplateResponse.Template.Spec.ContainersItem.SecurityContext4;
import com.aliyuncs.eci.model.v20180808.ExportContainerGroupTemplateResponse.Template.Spec.ContainersItem.SecurityContext4.Capabilities12;
import com.aliyuncs.eci.model.v20180808.ExportContainerGroupTemplateResponse.Template.Spec.ContainersItem.VolumeMount11;
import com.aliyuncs.eci.model.v20180808.ExportContainerGroupTemplateResponse.Template.Spec.DnsConfig;
import com.aliyuncs.eci.model.v20180808.ExportContainerGroupTemplateResponse.Template.Spec.DnsConfig.Option;
import com.aliyuncs.eci.model.v20180808.ExportContainerGroupTemplateResponse.Template.Spec.InitContainer;
import com.aliyuncs.eci.model.v20180808.ExportContainerGroupTemplateResponse.Template.Spec.InitContainer.EnvItem;
import com.aliyuncs.eci.model.v20180808.ExportContainerGroupTemplateResponse.Template.Spec.InitContainer.Port;
import com.aliyuncs.eci.model.v20180808.ExportContainerGroupTemplateResponse.Template.Spec.InitContainer.Resources1;
import com.aliyuncs.eci.model.v20180808.ExportContainerGroupTemplateResponse.Template.Spec.InitContainer.SecurityContext;
import com.aliyuncs.eci.model.v20180808.ExportContainerGroupTemplateResponse.Template.Spec.InitContainer.SecurityContext.Capabilities;
import com.aliyuncs.eci.model.v20180808.ExportContainerGroupTemplateResponse.Template.Spec.InitContainer.VolumeMount;
import com.aliyuncs.eci.model.v20180808.ExportContainerGroupTemplateResponse.Template.Spec.Volume;
import com.aliyuncs.eci.model.v20180808.ExportContainerGroupTemplateResponse.Template.Spec.Volume.ConfigFile;
import com.aliyuncs.eci.model.v20180808.ExportContainerGroupTemplateResponse.Template.Spec.Volume.ConfigFile.Item;
import com.aliyuncs.eci.model.v20180808.ExportContainerGroupTemplateResponse.Template.Spec.Volume.EmptyDir;
import com.aliyuncs.eci.model.v20180808.ExportContainerGroupTemplateResponse.Template.Spec.Volume.Nfs;
import com.aliyuncs.eci.model.v20180808.ExportContainerGroupTemplateResponse.Template.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExportContainerGroupTemplateResponseUnmarshaller {

	public static ExportContainerGroupTemplateResponse unmarshall(ExportContainerGroupTemplateResponse exportContainerGroupTemplateResponse, UnmarshallerContext context) {
		
		exportContainerGroupTemplateResponse.setRequestId(context.stringValue("ExportContainerGroupTemplateResponse.RequestId"));

		Template template = new Template();
		template.setRegionId(context.stringValue("ExportContainerGroupTemplateResponse.Template.RegionId"));
		template.setZoneId(context.stringValue("ExportContainerGroupTemplateResponse.Template.ZoneId"));
		template.setSecurityGroupId(context.stringValue("ExportContainerGroupTemplateResponse.Template.SecurityGroupId"));
		template.setVSwitchId(context.stringValue("ExportContainerGroupTemplateResponse.Template.VSwitchId"));
		template.setResourceGroupId(context.stringValue("ExportContainerGroupTemplateResponse.Template.ResourceGroupId"));
		template.setEipInstanceId(context.stringValue("ExportContainerGroupTemplateResponse.Template.EipInstanceId"));
		template.setContainerGroupName(context.stringValue("ExportContainerGroupTemplateResponse.Template.ContainerGroupName"));

		Resources resources = new Resources();
		resources.setCpu(context.floatValue("ExportContainerGroupTemplateResponse.Template.Resources.Cpu"));
		resources.setMemory(context.floatValue("ExportContainerGroupTemplateResponse.Template.Resources.Memory"));
		template.setResources(resources);

		Spec spec = new Spec();
		spec.setRestartPolicy(context.stringValue("ExportContainerGroupTemplateResponse.Template.Spec.RestartPolicy"));
		spec.setDnsPolicy(context.stringValue("ExportContainerGroupTemplateResponse.Template.Spec.DnsPolicy"));

		DnsConfig dnsConfig = new DnsConfig();

		List<String> nameServers = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("ExportContainerGroupTemplateResponse.Template.Spec.DnsConfig.NameServers.Length"); i++) {
			nameServers.add(context.stringValue("ExportContainerGroupTemplateResponse.Template.Spec.DnsConfig.NameServers["+ i +"]"));
		}
		dnsConfig.setNameServers(nameServers);

		List<String> searches = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("ExportContainerGroupTemplateResponse.Template.Spec.DnsConfig.Searches.Length"); i++) {
			searches.add(context.stringValue("ExportContainerGroupTemplateResponse.Template.Spec.DnsConfig.Searches["+ i +"]"));
		}
		dnsConfig.setSearches(searches);

		List<Option> options = new ArrayList<Option>();
		for (int i = 0; i < context.lengthValue("ExportContainerGroupTemplateResponse.Template.Spec.DnsConfig.Options.Length"); i++) {
			Option option = new Option();
			option.setName(context.stringValue("ExportContainerGroupTemplateResponse.Template.Spec.DnsConfig.Options["+ i +"].Name"));
			option.setValue(context.stringValue("ExportContainerGroupTemplateResponse.Template.Spec.DnsConfig.Options["+ i +"].Value"));

			options.add(option);
		}
		dnsConfig.setOptions(options);
		spec.setDnsConfig(dnsConfig);

		List<Volume> volumes = new ArrayList<Volume>();
		for (int i = 0; i < context.lengthValue("ExportContainerGroupTemplateResponse.Template.Spec.Volumes.Length"); i++) {
			Volume volume = new Volume();
			volume.setName(context.stringValue("ExportContainerGroupTemplateResponse.Template.Spec.Volumes["+ i +"].Name"));

			ConfigFile configFile = new ConfigFile();
			configFile.setDefaultMode(context.integerValue("ExportContainerGroupTemplateResponse.Template.Spec.Volumes["+ i +"].ConfigFile.DefaultMode"));

			List<Item> items = new ArrayList<Item>();
			for (int j = 0; j < context.lengthValue("ExportContainerGroupTemplateResponse.Template.Spec.Volumes["+ i +"].ConfigFile.Items.Length"); j++) {
				Item item = new Item();
				item.setMode(context.integerValue("ExportContainerGroupTemplateResponse.Template.Spec.Volumes["+ i +"].ConfigFile.Items["+ j +"].Mode"));
				item.setPath(context.stringValue("ExportContainerGroupTemplateResponse.Template.Spec.Volumes["+ i +"].ConfigFile.Items["+ j +"].Path"));
				item.setContent(context.stringValue("ExportContainerGroupTemplateResponse.Template.Spec.Volumes["+ i +"].ConfigFile.Items["+ j +"].Content"));

				items.add(item);
			}
			configFile.setItems(items);
			volume.setConfigFile(configFile);

			EmptyDir emptyDir = new EmptyDir();
			emptyDir.setSizeLimit(context.stringValue("ExportContainerGroupTemplateResponse.Template.Spec.Volumes["+ i +"].EmptyDir.SizeLimit"));
			volume.setEmptyDir(emptyDir);

			Nfs nfs = new Nfs();
			nfs.setServer(context.stringValue("ExportContainerGroupTemplateResponse.Template.Spec.Volumes["+ i +"].Nfs.Server"));
			nfs.setPath(context.stringValue("ExportContainerGroupTemplateResponse.Template.Spec.Volumes["+ i +"].Nfs.Path"));
			nfs.setReadOnly(context.booleanValue("ExportContainerGroupTemplateResponse.Template.Spec.Volumes["+ i +"].Nfs.ReadOnly"));
			volume.setNfs(nfs);

			volumes.add(volume);
		}
		spec.setVolumes(volumes);

		List<InitContainer> initContainers = new ArrayList<InitContainer>();
		for (int i = 0; i < context.lengthValue("ExportContainerGroupTemplateResponse.Template.Spec.InitContainers.Length"); i++) {
			InitContainer initContainer = new InitContainer();
			initContainer.setName(context.stringValue("ExportContainerGroupTemplateResponse.Template.Spec.InitContainers["+ i +"].Name"));
			initContainer.setImage(context.stringValue("ExportContainerGroupTemplateResponse.Template.Spec.InitContainers["+ i +"].Image"));
			initContainer.setImagePullPolicy(context.stringValue("ExportContainerGroupTemplateResponse.Template.Spec.InitContainers["+ i +"].ImagePullPolicy"));
			initContainer.setStdin(context.booleanValue("ExportContainerGroupTemplateResponse.Template.Spec.InitContainers["+ i +"].Stdin"));
			initContainer.setStdinOnce(context.booleanValue("ExportContainerGroupTemplateResponse.Template.Spec.InitContainers["+ i +"].StdinOnce"));
			initContainer.setTty(context.booleanValue("ExportContainerGroupTemplateResponse.Template.Spec.InitContainers["+ i +"].Tty"));
			initContainer.setWorkingDir(context.stringValue("ExportContainerGroupTemplateResponse.Template.Spec.InitContainers["+ i +"].WorkingDir"));

			List<String> command = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ExportContainerGroupTemplateResponse.Template.Spec.InitContainers["+ i +"].Command.Length"); j++) {
				command.add(context.stringValue("ExportContainerGroupTemplateResponse.Template.Spec.InitContainers["+ i +"].Command["+ j +"]"));
			}
			initContainer.setCommand(command);

			List<String> args = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ExportContainerGroupTemplateResponse.Template.Spec.InitContainers["+ i +"].Args.Length"); j++) {
				args.add(context.stringValue("ExportContainerGroupTemplateResponse.Template.Spec.InitContainers["+ i +"].Args["+ j +"]"));
			}
			initContainer.setArgs(args);

			SecurityContext securityContext = new SecurityContext();
			securityContext.setReadOnlyRootFilesystem(context.booleanValue("ExportContainerGroupTemplateResponse.Template.Spec.InitContainers["+ i +"].SecurityContext.ReadOnlyRootFilesystem"));
			securityContext.setRunAsUser(context.longValue("ExportContainerGroupTemplateResponse.Template.Spec.InitContainers["+ i +"].SecurityContext.RunAsUser"));

			Capabilities capabilities = new Capabilities();

			List<String> add = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ExportContainerGroupTemplateResponse.Template.Spec.InitContainers["+ i +"].SecurityContext.Capabilities.Add.Length"); j++) {
				add.add(context.stringValue("ExportContainerGroupTemplateResponse.Template.Spec.InitContainers["+ i +"].SecurityContext.Capabilities.Add["+ j +"]"));
			}
			capabilities.setAdd(add);
			securityContext.setCapabilities(capabilities);
			initContainer.setSecurityContext(securityContext);

			Resources1 resources1 = new Resources1();
			resources1.setCpu(context.floatValue("ExportContainerGroupTemplateResponse.Template.Spec.InitContainers["+ i +"].Resources.Cpu"));
			resources1.setMemory(context.floatValue("ExportContainerGroupTemplateResponse.Template.Spec.InitContainers["+ i +"].Resources.Memory"));
			initContainer.setResources1(resources1);

			List<EnvItem> env = new ArrayList<EnvItem>();
			for (int j = 0; j < context.lengthValue("ExportContainerGroupTemplateResponse.Template.Spec.InitContainers["+ i +"].Env.Length"); j++) {
				EnvItem envItem = new EnvItem();
				envItem.setName(context.stringValue("ExportContainerGroupTemplateResponse.Template.Spec.InitContainers["+ i +"].Env["+ j +"].Name"));
				envItem.setValue(context.stringValue("ExportContainerGroupTemplateResponse.Template.Spec.InitContainers["+ i +"].Env["+ j +"].Value"));

				env.add(envItem);
			}
			initContainer.setEnv(env);

			List<Port> ports = new ArrayList<Port>();
			for (int j = 0; j < context.lengthValue("ExportContainerGroupTemplateResponse.Template.Spec.InitContainers["+ i +"].Ports.Length"); j++) {
				Port port = new Port();
				port.setName(context.stringValue("ExportContainerGroupTemplateResponse.Template.Spec.InitContainers["+ i +"].Ports["+ j +"].Name"));
				port.setProtocol(context.stringValue("ExportContainerGroupTemplateResponse.Template.Spec.InitContainers["+ i +"].Ports["+ j +"].Protocol"));
				port.setContainerPort(context.integerValue("ExportContainerGroupTemplateResponse.Template.Spec.InitContainers["+ i +"].Ports["+ j +"].ContainerPort"));

				ports.add(port);
			}
			initContainer.setPorts(ports);

			List<VolumeMount> volumeMounts = new ArrayList<VolumeMount>();
			for (int j = 0; j < context.lengthValue("ExportContainerGroupTemplateResponse.Template.Spec.InitContainers["+ i +"].VolumeMounts.Length"); j++) {
				VolumeMount volumeMount = new VolumeMount();
				volumeMount.setName(context.stringValue("ExportContainerGroupTemplateResponse.Template.Spec.InitContainers["+ i +"].VolumeMounts["+ j +"].Name"));
				volumeMount.setSubPath(context.stringValue("ExportContainerGroupTemplateResponse.Template.Spec.InitContainers["+ i +"].VolumeMounts["+ j +"].SubPath"));
				volumeMount.setMountPath(context.stringValue("ExportContainerGroupTemplateResponse.Template.Spec.InitContainers["+ i +"].VolumeMounts["+ j +"].MountPath"));
				volumeMount.setReadOnly(context.booleanValue("ExportContainerGroupTemplateResponse.Template.Spec.InitContainers["+ i +"].VolumeMounts["+ j +"].ReadOnly"));

				volumeMounts.add(volumeMount);
			}
			initContainer.setVolumeMounts(volumeMounts);

			initContainers.add(initContainer);
		}
		spec.setInitContainers(initContainers);

		List<ContainersItem> containers = new ArrayList<ContainersItem>();
		for (int i = 0; i < context.lengthValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers.Length"); i++) {
			ContainersItem containersItem = new ContainersItem();
			containersItem.setName(context.stringValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].Name"));
			containersItem.setImage(context.stringValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].Image"));
			containersItem.setImagePullPolicy(context.stringValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].ImagePullPolicy"));
			containersItem.setStdin(context.booleanValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].Stdin"));
			containersItem.setStdinOnce(context.booleanValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].StdinOnce"));
			containersItem.setTty(context.booleanValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].Tty"));
			containersItem.setWorkingDir(context.stringValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].WorkingDir"));

			List<String> command2 = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].Command.Length"); j++) {
				command2.add(context.stringValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].Command["+ j +"]"));
			}
			containersItem.setCommand2(command2);

			List<String> args3 = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].Args.Length"); j++) {
				args3.add(context.stringValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].Args["+ j +"]"));
			}
			containersItem.setArgs3(args3);

			SecurityContext4 securityContext4 = new SecurityContext4();
			securityContext4.setReadOnlyRootFilesystem(context.booleanValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].SecurityContext.ReadOnlyRootFilesystem"));
			securityContext4.setRunAsUser(context.longValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].SecurityContext.RunAsUser"));

			Capabilities12 capabilities12 = new Capabilities12();

			List<String> add13 = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].SecurityContext.Capabilities.Add.Length"); j++) {
				add13.add(context.stringValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].SecurityContext.Capabilities.Add["+ j +"]"));
			}
			capabilities12.setAdd13(add13);
			securityContext4.setCapabilities12(capabilities12);
			containersItem.setSecurityContext4(securityContext4);

			Resources5 resources5 = new Resources5();
			resources5.setCpu(context.floatValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].Resources.Cpu"));
			resources5.setMemory(context.floatValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].Resources.Memory"));
			containersItem.setResources5(resources5);

			ReadinessProbe readinessProbe = new ReadinessProbe();
			readinessProbe.setInitialDelaySeconds(context.integerValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].ReadinessProbe.InitialDelaySeconds"));
			readinessProbe.setPeriodSeconds(context.integerValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].ReadinessProbe.PeriodSeconds"));
			readinessProbe.setSuccessThreshold(context.integerValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].ReadinessProbe.SuccessThreshold"));
			readinessProbe.setFailureThreshold(context.integerValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].ReadinessProbe.FailureThreshold"));
			readinessProbe.setTimeoutSeconds(context.integerValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].ReadinessProbe.TimeoutSeconds"));

			Exec exec = new Exec();

			List<String> command14 = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].ReadinessProbe.Exec.Command.Length"); j++) {
				command14.add(context.stringValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].ReadinessProbe.Exec.Command["+ j +"]"));
			}
			exec.setCommand14(command14);
			readinessProbe.setExec(exec);

			TcpSocket tcpSocket = new TcpSocket();
			tcpSocket.setPort(context.integerValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].ReadinessProbe.TcpSocket.Port"));
			readinessProbe.setTcpSocket(tcpSocket);

			HttpGet httpGet = new HttpGet();
			httpGet.setScheme(context.stringValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].ReadinessProbe.HttpGet.Scheme"));
			httpGet.setPath(context.stringValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].ReadinessProbe.HttpGet.Path"));
			httpGet.setPort(context.integerValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].ReadinessProbe.HttpGet.Port"));
			readinessProbe.setHttpGet(httpGet);
			containersItem.setReadinessProbe(readinessProbe);

			LivenessProbe livenessProbe = new LivenessProbe();
			livenessProbe.setInitialDelaySeconds(context.integerValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].LivenessProbe.InitialDelaySeconds"));
			livenessProbe.setPeriodSeconds(context.integerValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].LivenessProbe.PeriodSeconds"));
			livenessProbe.setSuccessThreshold(context.integerValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].LivenessProbe.SuccessThreshold"));
			livenessProbe.setFailureThreshold(context.integerValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].LivenessProbe.FailureThreshold"));
			livenessProbe.setTimeoutSeconds(context.integerValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].LivenessProbe.TimeoutSeconds"));

			Exec15 exec15 = new Exec15();

			List<String> command18 = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].LivenessProbe.Exec.Command.Length"); j++) {
				command18.add(context.stringValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].LivenessProbe.Exec.Command["+ j +"]"));
			}
			exec15.setCommand18(command18);
			livenessProbe.setExec15(exec15);

			TcpSocket16 tcpSocket16 = new TcpSocket16();
			tcpSocket16.setPort(context.integerValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].LivenessProbe.TcpSocket.Port"));
			livenessProbe.setTcpSocket16(tcpSocket16);

			HttpGet17 httpGet17 = new HttpGet17();
			httpGet17.setScheme(context.stringValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].LivenessProbe.HttpGet.Scheme"));
			httpGet17.setPath(context.stringValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].LivenessProbe.HttpGet.Path"));
			httpGet17.setPort(context.integerValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].LivenessProbe.HttpGet.Port"));
			livenessProbe.setHttpGet17(httpGet17);
			containersItem.setLivenessProbe(livenessProbe);

			List<EnvItem9> env6 = new ArrayList<EnvItem9>();
			for (int j = 0; j < context.lengthValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].Env.Length"); j++) {
				EnvItem9 envItem9 = new EnvItem9();
				envItem9.setName(context.stringValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].Env["+ j +"].Name"));
				envItem9.setValue(context.stringValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].Env["+ j +"].Value"));

				env6.add(envItem9);
			}
			containersItem.setEnv6(env6);

			List<Port10> ports7 = new ArrayList<Port10>();
			for (int j = 0; j < context.lengthValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].Ports.Length"); j++) {
				Port10 port10 = new Port10();
				port10.setName(context.stringValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].Ports["+ j +"].Name"));
				port10.setProtocol(context.stringValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].Ports["+ j +"].Protocol"));
				port10.setContainerPort(context.integerValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].Ports["+ j +"].ContainerPort"));

				ports7.add(port10);
			}
			containersItem.setPorts7(ports7);

			List<VolumeMount11> volumeMounts8 = new ArrayList<VolumeMount11>();
			for (int j = 0; j < context.lengthValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].VolumeMounts.Length"); j++) {
				VolumeMount11 volumeMount11 = new VolumeMount11();
				volumeMount11.setName(context.stringValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].VolumeMounts["+ j +"].Name"));
				volumeMount11.setSubPath(context.stringValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].VolumeMounts["+ j +"].SubPath"));
				volumeMount11.setMountPath(context.stringValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].VolumeMounts["+ j +"].MountPath"));
				volumeMount11.setReadOnly(context.booleanValue("ExportContainerGroupTemplateResponse.Template.Spec.Containers["+ i +"].VolumeMounts["+ j +"].ReadOnly"));

				volumeMounts8.add(volumeMount11);
			}
			containersItem.setVolumeMounts8(volumeMounts8);

			containers.add(containersItem);
		}
		spec.setContainers(containers);
		template.setSpec(spec);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < context.lengthValue("ExportContainerGroupTemplateResponse.Template.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setKey(context.stringValue("ExportContainerGroupTemplateResponse.Template.Tags["+ i +"].Key"));
			tag.setValue(context.stringValue("ExportContainerGroupTemplateResponse.Template.Tags["+ i +"].Value"));

			tags.add(tag);
		}
		template.setTags(tags);
		exportContainerGroupTemplateResponse.setTemplate(template);
	 
	 	return exportContainerGroupTemplateResponse;
	}
}