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

import com.aliyuncs.ess.model.v20140828.DescribeScalingConfigurationsResponse;
import com.aliyuncs.ess.model.v20140828.DescribeScalingConfigurationsResponse.ScalingConfiguration;
import com.aliyuncs.ess.model.v20140828.DescribeScalingConfigurationsResponse.ScalingConfiguration.CpuOptions;
import com.aliyuncs.ess.model.v20140828.DescribeScalingConfigurationsResponse.ScalingConfiguration.CustomPriority;
import com.aliyuncs.ess.model.v20140828.DescribeScalingConfigurationsResponse.ScalingConfiguration.DataDisk;
import com.aliyuncs.ess.model.v20140828.DescribeScalingConfigurationsResponse.ScalingConfiguration.InstancePatternInfo;
import com.aliyuncs.ess.model.v20140828.DescribeScalingConfigurationsResponse.ScalingConfiguration.NetworkInterface;
import com.aliyuncs.ess.model.v20140828.DescribeScalingConfigurationsResponse.ScalingConfiguration.ResourcePoolOptions;
import com.aliyuncs.ess.model.v20140828.DescribeScalingConfigurationsResponse.ScalingConfiguration.ResourcePoolOptions.PrivatePoolTag;
import com.aliyuncs.ess.model.v20140828.DescribeScalingConfigurationsResponse.ScalingConfiguration.SchedulerOptions;
import com.aliyuncs.ess.model.v20140828.DescribeScalingConfigurationsResponse.ScalingConfiguration.SecurityOptions;
import com.aliyuncs.ess.model.v20140828.DescribeScalingConfigurationsResponse.ScalingConfiguration.SpotPriceModel;
import com.aliyuncs.ess.model.v20140828.DescribeScalingConfigurationsResponse.ScalingConfiguration.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScalingConfigurationsResponseUnmarshaller {

	public static DescribeScalingConfigurationsResponse unmarshall(DescribeScalingConfigurationsResponse describeScalingConfigurationsResponse, UnmarshallerContext _ctx) {
		
		describeScalingConfigurationsResponse.setRequestId(_ctx.stringValue("DescribeScalingConfigurationsResponse.RequestId"));
		describeScalingConfigurationsResponse.setTotalCount(_ctx.integerValue("DescribeScalingConfigurationsResponse.TotalCount"));
		describeScalingConfigurationsResponse.setPageSize(_ctx.integerValue("DescribeScalingConfigurationsResponse.PageSize"));
		describeScalingConfigurationsResponse.setPageNumber(_ctx.integerValue("DescribeScalingConfigurationsResponse.PageNumber"));

		List<ScalingConfiguration> scalingConfigurations = new ArrayList<ScalingConfiguration>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations.Length"); i++) {
			ScalingConfiguration scalingConfiguration = new ScalingConfiguration();
			scalingConfiguration.setScalingConfigurationName(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ScalingConfigurationName"));
			scalingConfiguration.setDedicatedHostId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DedicatedHostId"));
			scalingConfiguration.setResourceGroupId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ResourceGroupId"));
			scalingConfiguration.setSystemDiskDescription(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SystemDiskDescription"));
			scalingConfiguration.setMemory(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Memory"));
			scalingConfiguration.setSystemDiskBurstingEnabled(_ctx.booleanValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SystemDisk.BurstingEnabled"));
			scalingConfiguration.setCpu(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Cpu"));
			scalingConfiguration.setRamRoleName(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].RamRoleName"));
			scalingConfiguration.setSystemDiskProvisionedIops(_ctx.longValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SystemDisk.ProvisionedIops"));
			scalingConfiguration.setSystemDiskPerformanceLevel(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SystemDiskPerformanceLevel"));
			scalingConfiguration.setSystemDiskEncryptAlgorithm(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SystemDisk.EncryptAlgorithm"));
			scalingConfiguration.setImageId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ImageId"));
			scalingConfiguration.setSystemDiskEncrypted(_ctx.booleanValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SystemDisk.Encrypted"));
			scalingConfiguration.setStorageSetId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].StorageSetId"));
			scalingConfiguration.setHostName(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].HostName"));
			scalingConfiguration.setLoadBalancerWeight(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].LoadBalancerWeight"));
			scalingConfiguration.setScalingGroupId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ScalingGroupId"));
			scalingConfiguration.setImageFamily(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ImageFamily"));
			scalingConfiguration.setDeletionProtection(_ctx.booleanValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DeletionProtection"));
			scalingConfiguration.setHttpEndpoint(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].HttpEndpoint"));
			scalingConfiguration.setInternetChargeType(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InternetChargeType"));
			scalingConfiguration.setDeploymentSetId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DeploymentSetId"));
			scalingConfiguration.setInstanceName(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstanceName"));
			scalingConfiguration.setSpotInterruptionBehavior(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SpotInterruptionBehavior"));
			scalingConfiguration.setInternetMaxBandwidthOut(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InternetMaxBandwidthOut"));
			scalingConfiguration.setCreationTime(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].CreationTime"));
			scalingConfiguration.setAffinity(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Affinity"));
			scalingConfiguration.setPrivatePoolOptionsMatchCriteria(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].PrivatePoolOptions.MatchCriteria"));
			scalingConfiguration.setScalingConfigurationId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ScalingConfigurationId"));
			scalingConfiguration.setSecurityEnhancementStrategy(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SecurityEnhancementStrategy"));
			scalingConfiguration.setDedicatedHostClusterId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DedicatedHostClusterId"));
			scalingConfiguration.setTenancy(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Tenancy"));
			scalingConfiguration.setImageOwnerAlias(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ImageOwnerAlias"));
			scalingConfiguration.setSystemDiskSize(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SystemDiskSize"));
			scalingConfiguration.setUserData(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].UserData"));
			scalingConfiguration.setSpotDuration(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SpotDuration"));
			scalingConfiguration.setLifecycleState(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].LifecycleState"));
			scalingConfiguration.setStorageSetPartitionNumber(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].StorageSetPartitionNumber"));
			scalingConfiguration.setSystemDiskAutoSnapshotPolicyId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SystemDiskAutoSnapshotPolicyId"));
			scalingConfiguration.setSystemDiskName(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SystemDiskName"));
			scalingConfiguration.setIpv6AddressCount(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Ipv6AddressCount"));
			scalingConfiguration.setImageOptionsLoginAsNonRoot(_ctx.booleanValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ImageOptions.LoginAsNonRoot"));
			scalingConfiguration.setInstanceType(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstanceType"));
			scalingConfiguration.setSpotStrategy(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SpotStrategy"));
			scalingConfiguration.setPasswordInherit(_ctx.booleanValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].PasswordInherit"));
			scalingConfiguration.setSecondaryEniVSwitchConstraint(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SecondaryEniVSwitchConstraint"));
			scalingConfiguration.setKeyPairName(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].KeyPairName"));
			scalingConfiguration.setIoOptimized(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].IoOptimized"));
			scalingConfiguration.setSystemDiskKMSKeyId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SystemDisk.KMSKeyId"));
			scalingConfiguration.setZoneId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ZoneId"));
			scalingConfiguration.setHpcClusterId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].HpcClusterId"));
			scalingConfiguration.setPasswordSetted(_ctx.booleanValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].PasswordSetted"));
			scalingConfiguration.setSecurityGroupId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SecurityGroupId"));
			scalingConfiguration.setPrivatePoolOptionsId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].PrivatePoolOptions.Id"));
			scalingConfiguration.setSystemDiskCategory(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SystemDiskCategory"));
			scalingConfiguration.setImageName(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ImageName"));
			scalingConfiguration.setHttpTokens(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].HttpTokens"));
			scalingConfiguration.setInternetMaxBandwidthIn(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InternetMaxBandwidthIn"));
			scalingConfiguration.setInstanceGeneration(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstanceGeneration"));
			scalingConfiguration.setInstanceDescription(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstanceDescription"));
			scalingConfiguration.setCreditSpecification(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].CreditSpecification"));

			List<String> weightedCapacities = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].WeightedCapacities.Length"); j++) {
				weightedCapacities.add(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].WeightedCapacities["+ j +"]"));
			}
			scalingConfiguration.setWeightedCapacities(weightedCapacities);

			List<String> securityGroupIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SecurityGroupIds.Length"); j++) {
				securityGroupIds.add(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SecurityGroupIds["+ j +"]"));
			}
			scalingConfiguration.setSecurityGroupIds(securityGroupIds);

			List<String> systemDiskCategories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SystemDiskCategories.Length"); j++) {
				systemDiskCategories.add(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SystemDiskCategories["+ j +"]"));
			}
			scalingConfiguration.setSystemDiskCategories(systemDiskCategories);

			List<String> instanceTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstanceTypes.Length"); j++) {
				instanceTypes.add(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstanceTypes["+ j +"]"));
			}
			scalingConfiguration.setInstanceTypes(instanceTypes);

			CpuOptions cpuOptions = new CpuOptions();
			cpuOptions.setNestedVirtualization(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].CpuOptions.NestedVirtualization"));
			scalingConfiguration.setCpuOptions(cpuOptions);

			SecurityOptions securityOptions = new SecurityOptions();
			securityOptions.setConfidentialComputingMode(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SecurityOptions.ConfidentialComputingMode"));
			scalingConfiguration.setSecurityOptions(securityOptions);

			SchedulerOptions schedulerOptions = new SchedulerOptions();
			schedulerOptions.setManagedPrivateSpaceId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SchedulerOptions.ManagedPrivateSpaceId"));
			scalingConfiguration.setSchedulerOptions(schedulerOptions);

			ResourcePoolOptions resourcePoolOptions = new ResourcePoolOptions();
			resourcePoolOptions.setStrategy(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ResourcePoolOptions.Strategy"));

			List<String> privatePoolIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ResourcePoolOptions.PrivatePoolIds.Length"); j++) {
				privatePoolIds.add(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ResourcePoolOptions.PrivatePoolIds["+ j +"]"));
			}
			resourcePoolOptions.setPrivatePoolIds(privatePoolIds);

			List<PrivatePoolTag> privatePoolTags = new ArrayList<PrivatePoolTag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ResourcePoolOptions.PrivatePoolTags.Length"); j++) {
				PrivatePoolTag privatePoolTag = new PrivatePoolTag();
				privatePoolTag.setValue(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ResourcePoolOptions.PrivatePoolTags["+ j +"].Value"));
				privatePoolTag.setKey(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ResourcePoolOptions.PrivatePoolTags["+ j +"].Key"));

				privatePoolTags.add(privatePoolTag);
			}
			resourcePoolOptions.setPrivatePoolTags(privatePoolTags);
			scalingConfiguration.setResourcePoolOptions(resourcePoolOptions);

			List<DataDisk> dataDisks = new ArrayList<DataDisk>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks.Length"); j++) {
				DataDisk dataDisk = new DataDisk();
				dataDisk.setBurstingEnabled(_ctx.booleanValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].BurstingEnabled"));
				dataDisk.setDescription(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].Description"));
				dataDisk.setCategory(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].Category"));
				dataDisk.setKMSKeyId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].KMSKeyId"));
				dataDisk.setPerformanceLevel(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].PerformanceLevel"));
				dataDisk.setDevice(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].Device"));
				dataDisk.setSize(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].Size"));
				dataDisk.setEncrypted(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].Encrypted"));
				dataDisk.setDeleteWithInstance(_ctx.booleanValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].DeleteWithInstance"));
				dataDisk.setAutoSnapshotPolicyId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].AutoSnapshotPolicyId"));
				dataDisk.setDiskName(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].DiskName"));
				dataDisk.setProvisionedIops(_ctx.longValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].ProvisionedIops"));
				dataDisk.setSnapshotId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].SnapshotId"));

				List<String> categories = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].Categories.Length"); k++) {
					categories.add(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].Categories["+ k +"]"));
				}
				dataDisk.setCategories(categories);

				dataDisks.add(dataDisk);
			}
			scalingConfiguration.setDataDisks(dataDisks);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setValue(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Tags["+ j +"].Value"));
				tag.setKey(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Tags["+ j +"].Key"));

				tags.add(tag);
			}
			scalingConfiguration.setTags(tags);

			List<InstancePatternInfo> instancePatternInfos = new ArrayList<InstancePatternInfo>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos.Length"); j++) {
				InstancePatternInfo instancePatternInfo = new InstancePatternInfo();
				instancePatternInfo.setMemory(_ctx.floatValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].Memory"));
				instancePatternInfo.setMinimumEniQuantity(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].MinimumEniQuantity"));
				instancePatternInfo.setMinimumBaselineCredit(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].MinimumBaselineCredit"));
				instancePatternInfo.setMaximumMemorySize(_ctx.floatValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].MaximumMemorySize"));
				instancePatternInfo.setCores(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].Cores"));
				instancePatternInfo.setMinimumCpuCoreCount(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].MinimumCpuCoreCount"));
				instancePatternInfo.setMaximumCpuCoreCount(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].MaximumCpuCoreCount"));
				instancePatternInfo.setMinimumEniPrivateIpAddressQuantity(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].MinimumEniPrivateIpAddressQuantity"));
				instancePatternInfo.setInstanceFamilyLevel(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].InstanceFamilyLevel"));
				instancePatternInfo.setMaximumGpuAmount(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].MaximumGpuAmount"));
				instancePatternInfo.setMinimumMemorySize(_ctx.floatValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].MinimumMemorySize"));
				instancePatternInfo.setMinimumEniIpv6AddressQuantity(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].MinimumEniIpv6AddressQuantity"));
				instancePatternInfo.setMinimumGpuAmount(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].MinimumGpuAmount"));
				instancePatternInfo.setMaxPrice(_ctx.floatValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].MaxPrice"));
				instancePatternInfo.setBurstablePerformance(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].BurstablePerformance"));
				instancePatternInfo.setMinimumInitialCredit(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].MinimumInitialCredit"));

				List<String> physicalProcessorModels = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].PhysicalProcessorModels.Length"); k++) {
					physicalProcessorModels.add(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].PhysicalProcessorModels["+ k +"]"));
				}
				instancePatternInfo.setPhysicalProcessorModels(physicalProcessorModels);

				List<String> excludedInstanceTypes = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].ExcludedInstanceTypes.Length"); k++) {
					excludedInstanceTypes.add(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].ExcludedInstanceTypes["+ k +"]"));
				}
				instancePatternInfo.setExcludedInstanceTypes(excludedInstanceTypes);

				List<String> cpuArchitectures = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].CpuArchitectures.Length"); k++) {
					cpuArchitectures.add(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].CpuArchitectures["+ k +"]"));
				}
				instancePatternInfo.setCpuArchitectures(cpuArchitectures);

				List<String> gpuSpecs = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].GpuSpecs.Length"); k++) {
					gpuSpecs.add(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].GpuSpecs["+ k +"]"));
				}
				instancePatternInfo.setGpuSpecs(gpuSpecs);

				List<String> instanceCategories = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].InstanceCategories.Length"); k++) {
					instanceCategories.add(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].InstanceCategories["+ k +"]"));
				}
				instancePatternInfo.setInstanceCategories(instanceCategories);

				List<String> instanceTypeFamilies = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].InstanceTypeFamilies.Length"); k++) {
					instanceTypeFamilies.add(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].InstanceTypeFamilies["+ k +"]"));
				}
				instancePatternInfo.setInstanceTypeFamilies(instanceTypeFamilies);

				List<String> architectures = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].Architectures.Length"); k++) {
					architectures.add(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].Architectures["+ k +"]"));
				}
				instancePatternInfo.setArchitectures(architectures);

				instancePatternInfos.add(instancePatternInfo);
			}
			scalingConfiguration.setInstancePatternInfos(instancePatternInfos);

			List<CustomPriority> customPriorities = new ArrayList<CustomPriority>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].CustomPriorities.Length"); j++) {
				CustomPriority customPriority = new CustomPriority();
				customPriority.setInstanceType(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].CustomPriorities["+ j +"].InstanceType"));
				customPriority.setVswitchId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].CustomPriorities["+ j +"].VswitchId"));

				customPriorities.add(customPriority);
			}
			scalingConfiguration.setCustomPriorities(customPriorities);

			List<NetworkInterface> networkInterfaces = new ArrayList<NetworkInterface>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].NetworkInterfaces.Length"); j++) {
				NetworkInterface networkInterface = new NetworkInterface();
				networkInterface.setNetworkInterfaceTrafficMode(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].NetworkInterfaces["+ j +"].NetworkInterfaceTrafficMode"));
				networkInterface.setSecondaryPrivateIpAddressCount(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].NetworkInterfaces["+ j +"].SecondaryPrivateIpAddressCount"));
				networkInterface.setIpv6AddressCount(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].NetworkInterfaces["+ j +"].Ipv6AddressCount"));
				networkInterface.setInstanceType(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].NetworkInterfaces["+ j +"].InstanceType"));

				List<String> vSwitchIds = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].NetworkInterfaces["+ j +"].VSwitchIds.Length"); k++) {
					vSwitchIds.add(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].NetworkInterfaces["+ j +"].VSwitchIds["+ k +"]"));
				}
				networkInterface.setVSwitchIds(vSwitchIds);

				List<String> securityGroupIds1 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].NetworkInterfaces["+ j +"].SecurityGroupIds.Length"); k++) {
					securityGroupIds1.add(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].NetworkInterfaces["+ j +"].SecurityGroupIds["+ k +"]"));
				}
				networkInterface.setSecurityGroupIds1(securityGroupIds1);

				networkInterfaces.add(networkInterface);
			}
			scalingConfiguration.setNetworkInterfaces(networkInterfaces);

			List<SpotPriceModel> spotPriceLimit = new ArrayList<SpotPriceModel>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SpotPriceLimit.Length"); j++) {
				SpotPriceModel spotPriceModel = new SpotPriceModel();
				spotPriceModel.setPriceLimit(_ctx.floatValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SpotPriceLimit["+ j +"].PriceLimit"));
				spotPriceModel.setInstanceType(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SpotPriceLimit["+ j +"].InstanceType"));

				spotPriceLimit.add(spotPriceModel);
			}
			scalingConfiguration.setSpotPriceLimit(spotPriceLimit);

			scalingConfigurations.add(scalingConfiguration);
		}
		describeScalingConfigurationsResponse.setScalingConfigurations(scalingConfigurations);
	 
	 	return describeScalingConfigurationsResponse;
	}
}