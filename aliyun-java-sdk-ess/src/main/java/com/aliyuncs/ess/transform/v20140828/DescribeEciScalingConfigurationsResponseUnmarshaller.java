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

package com.aliyuncs.ess.transform.v20140828;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ess.model.v20140828.DescribeEciScalingConfigurationsResponse;
import com.aliyuncs.ess.model.v20140828.DescribeEciScalingConfigurationsResponse.ScalingConfiguration;
import com.aliyuncs.ess.model.v20140828.DescribeEciScalingConfigurationsResponse.ScalingConfiguration.AcrRegistryInfo;
import com.aliyuncs.ess.model.v20140828.DescribeEciScalingConfigurationsResponse.ScalingConfiguration.Container;
import com.aliyuncs.ess.model.v20140828.DescribeEciScalingConfigurationsResponse.ScalingConfiguration.Container.EnvironmentVar;
import com.aliyuncs.ess.model.v20140828.DescribeEciScalingConfigurationsResponse.ScalingConfiguration.Container.Port;
import com.aliyuncs.ess.model.v20140828.DescribeEciScalingConfigurationsResponse.ScalingConfiguration.Container.VolumeMount;
import com.aliyuncs.ess.model.v20140828.DescribeEciScalingConfigurationsResponse.ScalingConfiguration.DnsConfigOption;
import com.aliyuncs.ess.model.v20140828.DescribeEciScalingConfigurationsResponse.ScalingConfiguration.HostAlias;
import com.aliyuncs.ess.model.v20140828.DescribeEciScalingConfigurationsResponse.ScalingConfiguration.ImageRegistryCredential;
import com.aliyuncs.ess.model.v20140828.DescribeEciScalingConfigurationsResponse.ScalingConfiguration.InitContainer;
import com.aliyuncs.ess.model.v20140828.DescribeEciScalingConfigurationsResponse.ScalingConfiguration.InitContainer.InitContainerEnvironmentVar;
import com.aliyuncs.ess.model.v20140828.DescribeEciScalingConfigurationsResponse.ScalingConfiguration.InitContainer.InitContainerPort;
import com.aliyuncs.ess.model.v20140828.DescribeEciScalingConfigurationsResponse.ScalingConfiguration.InitContainer.InitContainerVolumeMount;
import com.aliyuncs.ess.model.v20140828.DescribeEciScalingConfigurationsResponse.ScalingConfiguration.SecurityContextSysCtl;
import com.aliyuncs.ess.model.v20140828.DescribeEciScalingConfigurationsResponse.ScalingConfiguration.Tag;
import com.aliyuncs.ess.model.v20140828.DescribeEciScalingConfigurationsResponse.ScalingConfiguration.Volume;
import com.aliyuncs.ess.model.v20140828.DescribeEciScalingConfigurationsResponse.ScalingConfiguration.Volume.ConfigFileVolumeConfigFileToPath;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEciScalingConfigurationsResponseUnmarshaller {

	public static DescribeEciScalingConfigurationsResponse unmarshall(DescribeEciScalingConfigurationsResponse describeEciScalingConfigurationsResponse, UnmarshallerContext _ctx) {
		
		describeEciScalingConfigurationsResponse.setRequestId(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.RequestId"));
		describeEciScalingConfigurationsResponse.setTotalCount(_ctx.integerValue("DescribeEciScalingConfigurationsResponse.TotalCount"));
		describeEciScalingConfigurationsResponse.setPageSize(_ctx.integerValue("DescribeEciScalingConfigurationsResponse.PageSize"));
		describeEciScalingConfigurationsResponse.setPageNumber(_ctx.integerValue("DescribeEciScalingConfigurationsResponse.PageNumber"));

		List<ScalingConfiguration> scalingConfigurations = new ArrayList<ScalingConfiguration>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations.Length"); i++) {
			ScalingConfiguration scalingConfiguration = new ScalingConfiguration();
			scalingConfiguration.setScalingConfigurationName(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ScalingConfigurationName"));
			scalingConfiguration.setResourceGroupId(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ResourceGroupId"));
			scalingConfiguration.setMemory(_ctx.floatValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Memory"));
			scalingConfiguration.setDataCachePL(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataCachePL"));
			scalingConfiguration.setCpu(_ctx.floatValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Cpu"));
			scalingConfiguration.setIngressBandwidth(_ctx.longValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].IngressBandwidth"));
			scalingConfiguration.setDataCacheProvisionedIops(_ctx.integerValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataCacheProvisionedIops"));
			scalingConfiguration.setRamRoleName(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].RamRoleName"));
			scalingConfiguration.setHostName(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].HostName"));
			scalingConfiguration.setActiveDeadlineSeconds(_ctx.integerValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ActiveDeadlineSeconds"));
			scalingConfiguration.setLoadBalancerWeight(_ctx.integerValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].LoadBalancerWeight"));
			scalingConfiguration.setScalingGroupId(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ScalingGroupId"));
			scalingConfiguration.setSlsEnable(_ctx.booleanValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SlsEnable"));
			scalingConfiguration.setCpuOptionsCore(_ctx.integerValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].CpuOptionsCore"));
			scalingConfiguration.setAutoCreateEip(_ctx.booleanValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].AutoCreateEip"));
			scalingConfiguration.setGpuDriverVersion(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].GpuDriverVersion"));
			scalingConfiguration.setDnsPolicy(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DnsPolicy"));
			scalingConfiguration.setCreationTime(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].CreationTime"));
			scalingConfiguration.setInstanceFamilyLevel(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstanceFamilyLevel"));
			scalingConfiguration.setEphemeralStorage(_ctx.integerValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].EphemeralStorage"));
			scalingConfiguration.setScalingConfigurationId(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ScalingConfigurationId"));
			scalingConfiguration.setDescription(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Description"));
			scalingConfiguration.setLifecycleState(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].LifecycleState"));
			scalingConfiguration.setContainerGroupName(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ContainerGroupName"));
			scalingConfiguration.setImageSnapshotId(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ImageSnapshotId"));
			scalingConfiguration.setEgressBandwidth(_ctx.longValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].EgressBandwidth"));
			scalingConfiguration.setAutoMatchImageCache(_ctx.booleanValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].AutoMatchImageCache"));
			scalingConfiguration.setIpv6AddressCount(_ctx.integerValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Ipv6AddressCount"));
			scalingConfiguration.setDataCacheBucket(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataCacheBucket"));
			scalingConfiguration.setSpotPriceLimit(_ctx.floatValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SpotPriceLimit"));
			scalingConfiguration.setSpotStrategy(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SpotStrategy"));
			scalingConfiguration.setCpuOptionsThreadsPerCore(_ctx.integerValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].CpuOptionsThreadsPerCore"));
			scalingConfiguration.setDataCacheBurstingEnabled(_ctx.booleanValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataCacheBurstingEnabled"));
			scalingConfiguration.setTerminationGracePeriodSeconds(_ctx.integerValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].TerminationGracePeriodSeconds"));
			scalingConfiguration.setSecurityGroupId(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SecurityGroupId"));
			scalingConfiguration.setRestartPolicy(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].RestartPolicy"));
			scalingConfiguration.setCostOptimization(_ctx.booleanValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].CostOptimization"));
			scalingConfiguration.setEipBandwidth(_ctx.integerValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].EipBandwidth"));
			scalingConfiguration.setRegionId(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].RegionId"));

			List<String> ntpServers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].NtpServers.Length"); j++) {
				ntpServers.add(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].NtpServers["+ j +"]"));
			}
			scalingConfiguration.setNtpServers(ntpServers);

			List<String> dnsConfigSearches = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DnsConfigSearches.Length"); j++) {
				dnsConfigSearches.add(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DnsConfigSearches["+ j +"]"));
			}
			scalingConfiguration.setDnsConfigSearches(dnsConfigSearches);

			List<String> dnsConfigNameServers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DnsConfigNameServers.Length"); j++) {
				dnsConfigNameServers.add(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DnsConfigNameServers["+ j +"]"));
			}
			scalingConfiguration.setDnsConfigNameServers(dnsConfigNameServers);

			List<String> instanceTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstanceTypes.Length"); j++) {
				instanceTypes.add(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstanceTypes["+ j +"]"));
			}
			scalingConfiguration.setInstanceTypes(instanceTypes);

			List<Volume> volumes = new ArrayList<Volume>();
			for (int j = 0; j < _ctx.lengthValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Volumes.Length"); j++) {
				Volume volume = new Volume();
				volume.setHostPathVolumeType(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Volumes["+ j +"].HostPathVolumeType"));
				volume.setFlexVolumeFsType(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Volumes["+ j +"].FlexVolumeFsType"));
				volume.setEmptyDirVolumeSizeLimit(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Volumes["+ j +"].EmptyDirVolumeSizeLimit"));
				volume.setNFSVolumeServer(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Volumes["+ j +"].NFSVolumeServer"));
				volume.setDiskVolumeDiskSize(_ctx.integerValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Volumes["+ j +"].DiskVolumeDiskSize"));
				volume.setNFSVolumeReadOnly(_ctx.booleanValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Volumes["+ j +"].NFSVolumeReadOnly"));
				volume.setName(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Volumes["+ j +"].Name"));
				volume.setHostPathVolumePath(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Volumes["+ j +"].HostPathVolumePath"));
				volume.setNFSVolumePath(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Volumes["+ j +"].NFSVolumePath"));
				volume.setType(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Volumes["+ j +"].Type"));
				volume.setFlexVolumeDriver(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Volumes["+ j +"].FlexVolumeDriver"));
				volume.setDiskVolumeDiskId(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Volumes["+ j +"].DiskVolumeDiskId"));
				volume.setConfigFileVolumeDefaultMode(_ctx.integerValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Volumes["+ j +"].ConfigFileVolumeDefaultMode"));
				volume.setFlexVolumeOptions(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Volumes["+ j +"].FlexVolumeOptions"));
				volume.setEmptyDirVolumeMedium(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Volumes["+ j +"].EmptyDirVolumeMedium"));
				volume.setDiskVolumeFsType(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Volumes["+ j +"].DiskVolumeFsType"));

				List<ConfigFileVolumeConfigFileToPath> configFileVolumeConfigFileToPaths = new ArrayList<ConfigFileVolumeConfigFileToPath>();
				for (int k = 0; k < _ctx.lengthValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Volumes["+ j +"].ConfigFileVolumeConfigFileToPaths.Length"); k++) {
					ConfigFileVolumeConfigFileToPath configFileVolumeConfigFileToPath = new ConfigFileVolumeConfigFileToPath();
					configFileVolumeConfigFileToPath.setPath(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Volumes["+ j +"].ConfigFileVolumeConfigFileToPaths["+ k +"].Path"));
					configFileVolumeConfigFileToPath.setContent(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Volumes["+ j +"].ConfigFileVolumeConfigFileToPaths["+ k +"].Content"));
					configFileVolumeConfigFileToPath.setMode(_ctx.integerValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Volumes["+ j +"].ConfigFileVolumeConfigFileToPaths["+ k +"].Mode"));

					configFileVolumeConfigFileToPaths.add(configFileVolumeConfigFileToPath);
				}
				volume.setConfigFileVolumeConfigFileToPaths(configFileVolumeConfigFileToPaths);

				volumes.add(volume);
			}
			scalingConfiguration.setVolumes(volumes);

			List<DnsConfigOption> dnsConfigOptions = new ArrayList<DnsConfigOption>();
			for (int j = 0; j < _ctx.lengthValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DnsConfigOptions.Length"); j++) {
				DnsConfigOption dnsConfigOption = new DnsConfigOption();
				dnsConfigOption.setValue(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DnsConfigOptions["+ j +"].Value"));
				dnsConfigOption.setName(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DnsConfigOptions["+ j +"].Name"));

				dnsConfigOptions.add(dnsConfigOption);
			}
			scalingConfiguration.setDnsConfigOptions(dnsConfigOptions);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setValue(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Tags["+ j +"].Value"));
				tag.setKey(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Tags["+ j +"].Key"));

				tags.add(tag);
			}
			scalingConfiguration.setTags(tags);

			List<HostAlias> hostAliases = new ArrayList<HostAlias>();
			for (int j = 0; j < _ctx.lengthValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].HostAliases.Length"); j++) {
				HostAlias hostAlias = new HostAlias();
				hostAlias.setIp(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].HostAliases["+ j +"].Ip"));

				List<String> hostnames = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].HostAliases["+ j +"].Hostnames.Length"); k++) {
					hostnames.add(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].HostAliases["+ j +"].Hostnames["+ k +"]"));
				}
				hostAlias.setHostnames(hostnames);

				hostAliases.add(hostAlias);
			}
			scalingConfiguration.setHostAliases(hostAliases);

			List<ImageRegistryCredential> imageRegistryCredentials = new ArrayList<ImageRegistryCredential>();
			for (int j = 0; j < _ctx.lengthValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ImageRegistryCredentials.Length"); j++) {
				ImageRegistryCredential imageRegistryCredential = new ImageRegistryCredential();
				imageRegistryCredential.setUserName(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ImageRegistryCredentials["+ j +"].UserName"));
				imageRegistryCredential.setServer(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ImageRegistryCredentials["+ j +"].Server"));
				imageRegistryCredential.setPassword(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ImageRegistryCredentials["+ j +"].Password"));

				imageRegistryCredentials.add(imageRegistryCredential);
			}
			scalingConfiguration.setImageRegistryCredentials(imageRegistryCredentials);

			List<Container> containers = new ArrayList<Container>();
			for (int j = 0; j < _ctx.lengthValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers.Length"); j++) {
				Container container = new Container();
				container.setMemory(_ctx.floatValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].Memory"));
				container.setReadinessProbeTcpSocketPort(_ctx.integerValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].ReadinessProbeTcpSocketPort"));
				container.setReadinessProbeHttpGetPath(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].ReadinessProbeHttpGetPath"));
				container.setCpu(_ctx.floatValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].Cpu"));
				container.setImage(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].Image"));
				container.setReadinessProbeHttpGetScheme(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].ReadinessProbeHttpGetScheme"));
				container.setGpu(_ctx.integerValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].Gpu"));
				container.setStdinOnce(_ctx.booleanValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].StdinOnce"));
				container.setLifecyclePreStopHandlerTcpSocketHost(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].LifecyclePreStopHandlerTcpSocketHost"));
				container.setName(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].Name"));
				container.setLifecyclePostStartHandlerHttpGetHost(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].LifecyclePostStartHandlerHttpGetHost"));
				container.setSecurityContextReadOnlyRootFilesystem(_ctx.booleanValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].SecurityContextReadOnlyRootFilesystem"));
				container.setLifecyclePostStartHandlerHttpGetPath(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].LifecyclePostStartHandlerHttpGetPath"));
				container.setLivenessProbePeriodSeconds(_ctx.integerValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].LivenessProbePeriodSeconds"));
				container.setReadinessProbeSuccessThreshold(_ctx.integerValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].ReadinessProbeSuccessThreshold"));
				container.setReadinessProbeInitialDelaySeconds(_ctx.integerValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].ReadinessProbeInitialDelaySeconds"));
				container.setLifecyclePreStopHandlerHttpGetScheme(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].LifecyclePreStopHandlerHttpGetScheme"));
				container.setLifecyclePreStopHandlerHttpGetPort(_ctx.integerValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].LifecyclePreStopHandlerHttpGetPort"));
				container.setStdin(_ctx.booleanValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].Stdin"));
				container.setWorkingDir(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].WorkingDir"));
				container.setLifecyclePostStartHandlerHttpGetScheme(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].LifecyclePostStartHandlerHttpGetScheme"));
				container.setReadinessProbeTimeoutSeconds(_ctx.integerValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].ReadinessProbeTimeoutSeconds"));
				container.setLifecyclePreStopHandlerHttpGetHost(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].LifecyclePreStopHandlerHttpGetHost"));
				container.setLifecyclePostStartHandlerHttpGetPort(_ctx.integerValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].LifecyclePostStartHandlerHttpGetPort"));
				container.setLifecyclePreStopHandlerHttpGetPath(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].LifecyclePreStopHandlerHttpGetPath"));
				container.setLivenessProbeHttpGetScheme(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].LivenessProbeHttpGetScheme"));
				container.setLivenessProbeTimeoutSeconds(_ctx.integerValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].LivenessProbeTimeoutSeconds"));
				container.setLivenessProbeFailureThreshold(_ctx.integerValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].LivenessProbeFailureThreshold"));
				container.setLivenessProbeHttpGetPath(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].LivenessProbeHttpGetPath"));
				container.setLivenessProbeInitialDelaySeconds(_ctx.integerValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].LivenessProbeInitialDelaySeconds"));
				container.setLivenessProbeTcpSocketPort(_ctx.integerValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].LivenessProbeTcpSocketPort"));
				container.setTty(_ctx.booleanValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].Tty"));
				container.setSecurityContextRunAsUser(_ctx.longValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].SecurityContextRunAsUser"));
				container.setReadinessProbePeriodSeconds(_ctx.integerValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].ReadinessProbePeriodSeconds"));
				container.setLivenessProbeSuccessThreshold(_ctx.integerValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].LivenessProbeSuccessThreshold"));
				container.setLifecyclePostStartHandlerTcpSocketHost(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].LifecyclePostStartHandlerTcpSocketHost"));
				container.setLifecyclePreStopHandlerTcpSocketPort(_ctx.integerValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].LifecyclePreStopHandlerTcpSocketPort"));
				container.setReadinessProbeFailureThreshold(_ctx.integerValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].ReadinessProbeFailureThreshold"));
				container.setReadinessProbeHttpGetPort(_ctx.integerValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].ReadinessProbeHttpGetPort"));
				container.setImagePullPolicy(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].ImagePullPolicy"));
				container.setLivenessProbeHttpGetPort(_ctx.integerValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].LivenessProbeHttpGetPort"));
				container.setLifecyclePostStartHandlerTcpSocketPort(_ctx.integerValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].LifecyclePostStartHandlerTcpSocketPort"));

				List<String> readinessProbeExecCommands = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].ReadinessProbeExecCommands.Length"); k++) {
					readinessProbeExecCommands.add(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].ReadinessProbeExecCommands["+ k +"]"));
				}
				container.setReadinessProbeExecCommands(readinessProbeExecCommands);

				List<String> livenessProbeExecCommands = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].LivenessProbeExecCommands.Length"); k++) {
					livenessProbeExecCommands.add(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].LivenessProbeExecCommands["+ k +"]"));
				}
				container.setLivenessProbeExecCommands(livenessProbeExecCommands);

				List<String> securityContextCapabilityAdds = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].SecurityContextCapabilityAdds.Length"); k++) {
					securityContextCapabilityAdds.add(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].SecurityContextCapabilityAdds["+ k +"]"));
				}
				container.setSecurityContextCapabilityAdds(securityContextCapabilityAdds);

				List<String> lifecyclePostStartHandlerExecs = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].LifecyclePostStartHandlerExecs.Length"); k++) {
					lifecyclePostStartHandlerExecs.add(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].LifecyclePostStartHandlerExecs["+ k +"]"));
				}
				container.setLifecyclePostStartHandlerExecs(lifecyclePostStartHandlerExecs);

				List<String> commands = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].Commands.Length"); k++) {
					commands.add(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].Commands["+ k +"]"));
				}
				container.setCommands(commands);

				List<String> lifecyclePreStopHandlerExecs = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].LifecyclePreStopHandlerExecs.Length"); k++) {
					lifecyclePreStopHandlerExecs.add(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].LifecyclePreStopHandlerExecs["+ k +"]"));
				}
				container.setLifecyclePreStopHandlerExecs(lifecyclePreStopHandlerExecs);

				List<String> args = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].Args.Length"); k++) {
					args.add(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].Args["+ k +"]"));
				}
				container.setArgs(args);

				List<EnvironmentVar> environmentVars = new ArrayList<EnvironmentVar>();
				for (int k = 0; k < _ctx.lengthValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].EnvironmentVars.Length"); k++) {
					EnvironmentVar environmentVar = new EnvironmentVar();
					environmentVar.setFieldRefFieldPath(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].EnvironmentVars["+ k +"].FieldRefFieldPath"));
					environmentVar.setValue(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].EnvironmentVars["+ k +"].Value"));
					environmentVar.setKey(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].EnvironmentVars["+ k +"].Key"));

					environmentVars.add(environmentVar);
				}
				container.setEnvironmentVars(environmentVars);

				List<VolumeMount> volumeMounts = new ArrayList<VolumeMount>();
				for (int k = 0; k < _ctx.lengthValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].VolumeMounts.Length"); k++) {
					VolumeMount volumeMount = new VolumeMount();
					volumeMount.setReadOnly(_ctx.booleanValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].VolumeMounts["+ k +"].ReadOnly"));
					volumeMount.setMountPath(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].VolumeMounts["+ k +"].MountPath"));
					volumeMount.setSubPath(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].VolumeMounts["+ k +"].SubPath"));
					volumeMount.setMountPropagation(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].VolumeMounts["+ k +"].MountPropagation"));
					volumeMount.setName(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].VolumeMounts["+ k +"].Name"));

					volumeMounts.add(volumeMount);
				}
				container.setVolumeMounts(volumeMounts);

				List<Port> ports = new ArrayList<Port>();
				for (int k = 0; k < _ctx.lengthValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].Ports.Length"); k++) {
					Port port = new Port();
					port.setPort(_ctx.integerValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].Ports["+ k +"].Port"));
					port.setBizProtocol(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Containers["+ j +"].Ports["+ k +"].Protocol"));

					ports.add(port);
				}
				container.setPorts(ports);

				containers.add(container);
			}
			scalingConfiguration.setContainers(containers);

			List<AcrRegistryInfo> acrRegistryInfos = new ArrayList<AcrRegistryInfo>();
			for (int j = 0; j < _ctx.lengthValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].AcrRegistryInfos.Length"); j++) {
				AcrRegistryInfo acrRegistryInfo = new AcrRegistryInfo();
				acrRegistryInfo.setInstanceName(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].AcrRegistryInfos["+ j +"].InstanceName"));
				acrRegistryInfo.setInstanceId(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].AcrRegistryInfos["+ j +"].InstanceId"));
				acrRegistryInfo.setRegionId(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].AcrRegistryInfos["+ j +"].RegionId"));

				List<String> domains = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].AcrRegistryInfos["+ j +"].Domains.Length"); k++) {
					domains.add(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].AcrRegistryInfos["+ j +"].Domains["+ k +"]"));
				}
				acrRegistryInfo.setDomains(domains);

				acrRegistryInfos.add(acrRegistryInfo);
			}
			scalingConfiguration.setAcrRegistryInfos(acrRegistryInfos);

			List<InitContainer> initContainers = new ArrayList<InitContainer>();
			for (int j = 0; j < _ctx.lengthValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InitContainers.Length"); j++) {
				InitContainer initContainer = new InitContainer();
				initContainer.setMemory(_ctx.floatValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InitContainers["+ j +"].Memory"));
				initContainer.setCpu(_ctx.floatValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InitContainers["+ j +"].Cpu"));
				initContainer.setImage(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InitContainers["+ j +"].Image"));
				initContainer.setGpu(_ctx.integerValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InitContainers["+ j +"].Gpu"));
				initContainer.setName(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InitContainers["+ j +"].Name"));
				initContainer.setWorkingDir(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InitContainers["+ j +"].WorkingDir"));
				initContainer.setImagePullPolicy(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InitContainers["+ j +"].ImagePullPolicy"));
				initContainer.setSecurityContextReadOnlyRootFilesystem(_ctx.booleanValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InitContainers["+ j +"].SecurityContextReadOnlyRootFilesystem"));
				initContainer.setSecurityContextRunAsUser(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InitContainers["+ j +"].SecurityContextRunAsUser"));

				List<String> initContainerArgs = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InitContainers["+ j +"].InitContainerArgs.Length"); k++) {
					initContainerArgs.add(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InitContainers["+ j +"].InitContainerArgs["+ k +"]"));
				}
				initContainer.setInitContainerArgs(initContainerArgs);

				List<String> securityContextCapabilityAdds1 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InitContainers["+ j +"].SecurityContextCapabilityAdds.Length"); k++) {
					securityContextCapabilityAdds1.add(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InitContainers["+ j +"].SecurityContextCapabilityAdds["+ k +"]"));
				}
				initContainer.setSecurityContextCapabilityAdds1(securityContextCapabilityAdds1);

				List<String> initContainerCommands = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InitContainers["+ j +"].InitContainerCommands.Length"); k++) {
					initContainerCommands.add(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InitContainers["+ j +"].InitContainerCommands["+ k +"]"));
				}
				initContainer.setInitContainerCommands(initContainerCommands);

				List<InitContainerPort> initContainerPorts = new ArrayList<InitContainerPort>();
				for (int k = 0; k < _ctx.lengthValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InitContainers["+ j +"].InitContainerPorts.Length"); k++) {
					InitContainerPort initContainerPort = new InitContainerPort();
					initContainerPort.setPort(_ctx.integerValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InitContainers["+ j +"].InitContainerPorts["+ k +"].Port"));
					initContainerPort.setBizProtocol(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InitContainers["+ j +"].InitContainerPorts["+ k +"].Protocol"));

					initContainerPorts.add(initContainerPort);
				}
				initContainer.setInitContainerPorts(initContainerPorts);

				List<InitContainerEnvironmentVar> initContainerEnvironmentVars = new ArrayList<InitContainerEnvironmentVar>();
				for (int k = 0; k < _ctx.lengthValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InitContainers["+ j +"].InitContainerEnvironmentVars.Length"); k++) {
					InitContainerEnvironmentVar initContainerEnvironmentVar = new InitContainerEnvironmentVar();
					initContainerEnvironmentVar.setFieldRefFieldPath(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InitContainers["+ j +"].InitContainerEnvironmentVars["+ k +"].FieldRefFieldPath"));
					initContainerEnvironmentVar.setValue(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InitContainers["+ j +"].InitContainerEnvironmentVars["+ k +"].Value"));
					initContainerEnvironmentVar.setKey(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InitContainers["+ j +"].InitContainerEnvironmentVars["+ k +"].Key"));

					initContainerEnvironmentVars.add(initContainerEnvironmentVar);
				}
				initContainer.setInitContainerEnvironmentVars(initContainerEnvironmentVars);

				List<InitContainerVolumeMount> initContainerVolumeMounts = new ArrayList<InitContainerVolumeMount>();
				for (int k = 0; k < _ctx.lengthValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InitContainers["+ j +"].InitContainerVolumeMounts.Length"); k++) {
					InitContainerVolumeMount initContainerVolumeMount = new InitContainerVolumeMount();
					initContainerVolumeMount.setReadOnly(_ctx.booleanValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InitContainers["+ j +"].InitContainerVolumeMounts["+ k +"].ReadOnly"));
					initContainerVolumeMount.setMountPath(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InitContainers["+ j +"].InitContainerVolumeMounts["+ k +"].MountPath"));
					initContainerVolumeMount.setSubPath(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InitContainers["+ j +"].InitContainerVolumeMounts["+ k +"].SubPath"));
					initContainerVolumeMount.setMountPropagation(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InitContainers["+ j +"].InitContainerVolumeMounts["+ k +"].MountPropagation"));
					initContainerVolumeMount.setName(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InitContainers["+ j +"].InitContainerVolumeMounts["+ k +"].Name"));

					initContainerVolumeMounts.add(initContainerVolumeMount);
				}
				initContainer.setInitContainerVolumeMounts(initContainerVolumeMounts);

				initContainers.add(initContainer);
			}
			scalingConfiguration.setInitContainers(initContainers);

			List<SecurityContextSysCtl> securityContextSysCtls = new ArrayList<SecurityContextSysCtl>();
			for (int j = 0; j < _ctx.lengthValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SecurityContextSysCtls.Length"); j++) {
				SecurityContextSysCtl securityContextSysCtl = new SecurityContextSysCtl();
				securityContextSysCtl.setValue(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SecurityContextSysCtls["+ j +"].Value"));
				securityContextSysCtl.setName(_ctx.stringValue("DescribeEciScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SecurityContextSysCtls["+ j +"].Name"));

				securityContextSysCtls.add(securityContextSysCtl);
			}
			scalingConfiguration.setSecurityContextSysCtls(securityContextSysCtls);

			scalingConfigurations.add(scalingConfiguration);
		}
		describeEciScalingConfigurationsResponse.setScalingConfigurations(scalingConfigurations);
	 
	 	return describeEciScalingConfigurationsResponse;
	}
}