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
import com.aliyuncs.ess.model.v20140828.DescribeScalingConfigurationsResponse.ScalingConfiguration.CustomPriority;
import com.aliyuncs.ess.model.v20140828.DescribeScalingConfigurationsResponse.ScalingConfiguration.DataDisk;
import com.aliyuncs.ess.model.v20140828.DescribeScalingConfigurationsResponse.ScalingConfiguration.InstancePatternInfo;
import com.aliyuncs.ess.model.v20140828.DescribeScalingConfigurationsResponse.ScalingConfiguration.NetworkInterface;
import com.aliyuncs.ess.model.v20140828.DescribeScalingConfigurationsResponse.ScalingConfiguration.ResourcePoolOptions;
import com.aliyuncs.ess.model.v20140828.DescribeScalingConfigurationsResponse.ScalingConfiguration.SchedulerOptions;
import com.aliyuncs.ess.model.v20140828.DescribeScalingConfigurationsResponse.ScalingConfiguration.SecurityOptions;
import com.aliyuncs.ess.model.v20140828.DescribeScalingConfigurationsResponse.ScalingConfiguration.SpotPriceModel;
import com.aliyuncs.ess.model.v20140828.DescribeScalingConfigurationsResponse.ScalingConfiguration.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScalingConfigurationsResponseUnmarshaller {

	public static DescribeScalingConfigurationsResponse unmarshall(DescribeScalingConfigurationsResponse describeScalingConfigurationsResponse, UnmarshallerContext _ctx) {
		
		describeScalingConfigurationsResponse.setRequestId(_ctx.stringValue("DescribeScalingConfigurationsResponse.RequestId"));
		describeScalingConfigurationsResponse.setPageNumber(_ctx.integerValue("DescribeScalingConfigurationsResponse.PageNumber"));
		describeScalingConfigurationsResponse.setPageSize(_ctx.integerValue("DescribeScalingConfigurationsResponse.PageSize"));
		describeScalingConfigurationsResponse.setTotalCount(_ctx.integerValue("DescribeScalingConfigurationsResponse.TotalCount"));

		List<ScalingConfiguration> scalingConfigurations = new ArrayList<ScalingConfiguration>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations.Length"); i++) {
			ScalingConfiguration scalingConfiguration = new ScalingConfiguration();
			scalingConfiguration.setDeploymentSetId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DeploymentSetId"));
			scalingConfiguration.setCreationTime(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].CreationTime"));
			scalingConfiguration.setScalingConfigurationName(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ScalingConfigurationName"));
			scalingConfiguration.setSystemDiskDescription(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SystemDiskDescription"));
			scalingConfiguration.setKeyPairName(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].KeyPairName"));
			scalingConfiguration.setSecurityGroupId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SecurityGroupId"));
			scalingConfiguration.setPrivatePoolOptionsId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].PrivatePoolOptions.Id"));
			scalingConfiguration.setSystemDiskAutoSnapshotPolicyId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SystemDiskAutoSnapshotPolicyId"));
			scalingConfiguration.setSpotStrategy(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SpotStrategy"));
			scalingConfiguration.setScalingGroupId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ScalingGroupId"));
			scalingConfiguration.setAffinity(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Affinity"));
			scalingConfiguration.setTenancy(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Tenancy"));
			scalingConfiguration.setSystemDiskSize(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SystemDiskSize"));
			scalingConfiguration.setIpv6AddressCount(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Ipv6AddressCount"));
			scalingConfiguration.setSpotDuration(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SpotDuration"));
			scalingConfiguration.setLifecycleState(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].LifecycleState"));
			scalingConfiguration.setInstanceName(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstanceName"));
			scalingConfiguration.setSecurityEnhancementStrategy(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SecurityEnhancementStrategy"));
			scalingConfiguration.setUserData(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].UserData"));
			scalingConfiguration.setPrivatePoolOptionsMatchCriteria(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].PrivatePoolOptions.MatchCriteria"));
			scalingConfiguration.setDedicatedHostId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DedicatedHostId"));
			scalingConfiguration.setInstanceGeneration(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstanceGeneration"));
			scalingConfiguration.setHpcClusterId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].HpcClusterId"));
			scalingConfiguration.setPasswordInherit(_ctx.booleanValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].PasswordInherit"));
			scalingConfiguration.setMemory(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Memory"));
			scalingConfiguration.setImageId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ImageId"));
			scalingConfiguration.setImageFamily(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ImageFamily"));
			scalingConfiguration.setImageOwnerAlias(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ImageOwnerAlias"));
			scalingConfiguration.setLoadBalancerWeight(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].LoadBalancerWeight"));
			scalingConfiguration.setSystemDiskCategory(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SystemDiskCategory"));
			scalingConfiguration.setHostName(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].HostName"));
			scalingConfiguration.setSystemDiskName(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SystemDiskName"));
			scalingConfiguration.setInternetMaxBandwidthOut(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InternetMaxBandwidthOut"));
			scalingConfiguration.setInternetMaxBandwidthIn(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InternetMaxBandwidthIn"));
			scalingConfiguration.setInstanceType(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstanceType"));
			scalingConfiguration.setInstanceDescription(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstanceDescription"));
			scalingConfiguration.setIoOptimized(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].IoOptimized"));
			scalingConfiguration.setRamRoleName(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].RamRoleName"));
			scalingConfiguration.setSystemDiskPerformanceLevel(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SystemDiskPerformanceLevel"));
			scalingConfiguration.setCpu(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Cpu"));
			scalingConfiguration.setResourceGroupId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ResourceGroupId"));
			scalingConfiguration.setZoneId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ZoneId"));
			scalingConfiguration.setInternetChargeType(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InternetChargeType"));
			scalingConfiguration.setImageName(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ImageName"));
			scalingConfiguration.setScalingConfigurationId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ScalingConfigurationId"));
			scalingConfiguration.setCreditSpecification(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].CreditSpecification"));
			scalingConfiguration.setSpotInterruptionBehavior(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SpotInterruptionBehavior"));
			scalingConfiguration.setSystemDiskEncrypted(_ctx.booleanValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SystemDisk.Encrypted"));
			scalingConfiguration.setSystemDiskKMSKeyId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SystemDisk.KMSKeyId"));
			scalingConfiguration.setSystemDiskEncryptAlgorithm(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SystemDisk.EncryptAlgorithm"));
			scalingConfiguration.setSystemDiskProvisionedIops(_ctx.longValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SystemDisk.ProvisionedIops"));
			scalingConfiguration.setSystemDiskBurstingEnabled(_ctx.booleanValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SystemDisk.BurstingEnabled"));
			scalingConfiguration.setImageOptionsLoginAsNonRoot(_ctx.booleanValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ImageOptions.LoginAsNonRoot"));
			scalingConfiguration.setDeletionProtection(_ctx.booleanValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DeletionProtection"));
			scalingConfiguration.setStorageSetId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].StorageSetId"));
			scalingConfiguration.setStorageSetPartitionNumber(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].StorageSetPartitionNumber"));
			scalingConfiguration.setDedicatedHostClusterId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DedicatedHostClusterId"));
			scalingConfiguration.setPasswordSetted(_ctx.booleanValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].PasswordSetted"));
			scalingConfiguration.setHttpEndpoint(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].HttpEndpoint"));
			scalingConfiguration.setHttpTokens(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].HttpTokens"));

			List<String> systemDiskCategories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SystemDiskCategories.Length"); j++) {
				systemDiskCategories.add(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SystemDiskCategories["+ j +"]"));
			}
			scalingConfiguration.setSystemDiskCategories(systemDiskCategories);

			List<String> weightedCapacities = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].WeightedCapacities.Length"); j++) {
				weightedCapacities.add(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].WeightedCapacities["+ j +"]"));
			}
			scalingConfiguration.setWeightedCapacities(weightedCapacities);

			List<String> instanceTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstanceTypes.Length"); j++) {
				instanceTypes.add(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstanceTypes["+ j +"]"));
			}
			scalingConfiguration.setInstanceTypes(instanceTypes);

			List<String> securityGroupIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SecurityGroupIds.Length"); j++) {
				securityGroupIds.add(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SecurityGroupIds["+ j +"]"));
			}
			scalingConfiguration.setSecurityGroupIds(securityGroupIds);

			SchedulerOptions schedulerOptions = new SchedulerOptions();
			schedulerOptions.setManagedPrivateSpaceId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SchedulerOptions.ManagedPrivateSpaceId"));
			scalingConfiguration.setSchedulerOptions(schedulerOptions);

			SecurityOptions securityOptions = new SecurityOptions();
			securityOptions.setConfidentialComputingMode(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SecurityOptions.ConfidentialComputingMode"));
			scalingConfiguration.setSecurityOptions(securityOptions);

			ResourcePoolOptions resourcePoolOptions = new ResourcePoolOptions();
			resourcePoolOptions.setStrategy(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ResourcePoolOptions.Strategy"));

			List<String> privatePoolIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ResourcePoolOptions.PrivatePoolIds.Length"); j++) {
				privatePoolIds.add(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].ResourcePoolOptions.PrivatePoolIds["+ j +"]"));
			}
			resourcePoolOptions.setPrivatePoolIds(privatePoolIds);
			scalingConfiguration.setResourcePoolOptions(resourcePoolOptions);

			List<DataDisk> dataDisks = new ArrayList<DataDisk>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks.Length"); j++) {
				DataDisk dataDisk = new DataDisk();
				dataDisk.setPerformanceLevel(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].PerformanceLevel"));
				dataDisk.setDescription(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].Description"));
				dataDisk.setSnapshotId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].SnapshotId"));
				dataDisk.setDevice(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].Device"));
				dataDisk.setSize(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].Size"));
				dataDisk.setDiskName(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].DiskName"));
				dataDisk.setAutoSnapshotPolicyId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].AutoSnapshotPolicyId"));
				dataDisk.setCategory(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].Category"));
				dataDisk.setKMSKeyId(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].KMSKeyId"));
				dataDisk.setDeleteWithInstance(_ctx.booleanValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].DeleteWithInstance"));
				dataDisk.setEncrypted(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].Encrypted"));
				dataDisk.setProvisionedIops(_ctx.longValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].ProvisionedIops"));
				dataDisk.setBurstingEnabled(_ctx.booleanValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].DataDisks["+ j +"].BurstingEnabled"));

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
				tag.setKey(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			scalingConfiguration.setTags(tags);

			List<SpotPriceModel> spotPriceLimit = new ArrayList<SpotPriceModel>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SpotPriceLimit.Length"); j++) {
				SpotPriceModel spotPriceModel = new SpotPriceModel();
				spotPriceModel.setInstanceType(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SpotPriceLimit["+ j +"].InstanceType"));
				spotPriceModel.setPriceLimit(_ctx.floatValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].SpotPriceLimit["+ j +"].PriceLimit"));

				spotPriceLimit.add(spotPriceModel);
			}
			scalingConfiguration.setSpotPriceLimit(spotPriceLimit);

			List<InstancePatternInfo> instancePatternInfos = new ArrayList<InstancePatternInfo>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos.Length"); j++) {
				InstancePatternInfo instancePatternInfo = new InstancePatternInfo();
				instancePatternInfo.setMaxPrice(_ctx.floatValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].MaxPrice"));
				instancePatternInfo.setCores(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].Cores"));
				instancePatternInfo.setMemory(_ctx.floatValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].Memory"));
				instancePatternInfo.setInstanceFamilyLevel(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].InstanceFamilyLevel"));
				instancePatternInfo.setBurstablePerformance(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].BurstablePerformance"));
				instancePatternInfo.setMinimumCpuCoreCount(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].MinimumCpuCoreCount"));
				instancePatternInfo.setMaximumCpuCoreCount(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].MaximumCpuCoreCount"));
				instancePatternInfo.setMinimumEniQuantity(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].MinimumEniQuantity"));
				instancePatternInfo.setMinimumEniPrivateIpAddressQuantity(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].MinimumEniPrivateIpAddressQuantity"));
				instancePatternInfo.setMinimumEniIpv6AddressQuantity(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].MinimumEniIpv6AddressQuantity"));
				instancePatternInfo.setMinimumInitialCredit(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].MinimumInitialCredit"));
				instancePatternInfo.setMinimumBaselineCredit(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].MinimumBaselineCredit"));
				instancePatternInfo.setMinimumMemorySize(_ctx.floatValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].MinimumMemorySize"));
				instancePatternInfo.setMaximumMemorySize(_ctx.floatValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].MaximumMemorySize"));
				instancePatternInfo.setMinimumGpuAmount(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].MinimumGpuAmount"));
				instancePatternInfo.setMaximumGpuAmount(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].MaximumGpuAmount"));

				List<String> architectures = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].Architectures.Length"); k++) {
					architectures.add(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].Architectures["+ k +"]"));
				}
				instancePatternInfo.setArchitectures(architectures);

				List<String> excludedInstanceTypes = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].ExcludedInstanceTypes.Length"); k++) {
					excludedInstanceTypes.add(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].ExcludedInstanceTypes["+ k +"]"));
				}
				instancePatternInfo.setExcludedInstanceTypes(excludedInstanceTypes);

				List<String> instanceTypeFamilies = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].InstanceTypeFamilies.Length"); k++) {
					instanceTypeFamilies.add(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].InstanceTypeFamilies["+ k +"]"));
				}
				instancePatternInfo.setInstanceTypeFamilies(instanceTypeFamilies);

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

				List<String> cpuArchitectures = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].CpuArchitectures.Length"); k++) {
					cpuArchitectures.add(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].CpuArchitectures["+ k +"]"));
				}
				instancePatternInfo.setCpuArchitectures(cpuArchitectures);

				List<String> physicalProcessorModels = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].PhysicalProcessorModels.Length"); k++) {
					physicalProcessorModels.add(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].InstancePatternInfos["+ j +"].PhysicalProcessorModels["+ k +"]"));
				}
				instancePatternInfo.setPhysicalProcessorModels(physicalProcessorModels);

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
				networkInterface.setInstanceType(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].NetworkInterfaces["+ j +"].InstanceType"));
				networkInterface.setNetworkInterfaceTrafficMode(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].NetworkInterfaces["+ j +"].NetworkInterfaceTrafficMode"));
				networkInterface.setIpv6AddressCount(_ctx.integerValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].NetworkInterfaces["+ j +"].Ipv6AddressCount"));

				List<String> securityGroupIds1 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].NetworkInterfaces["+ j +"].SecurityGroupIds.Length"); k++) {
					securityGroupIds1.add(_ctx.stringValue("DescribeScalingConfigurationsResponse.ScalingConfigurations["+ i +"].NetworkInterfaces["+ j +"].SecurityGroupIds["+ k +"]"));
				}
				networkInterface.setSecurityGroupIds1(securityGroupIds1);

				networkInterfaces.add(networkInterface);
			}
			scalingConfiguration.setNetworkInterfaces(networkInterfaces);

			scalingConfigurations.add(scalingConfiguration);
		}
		describeScalingConfigurationsResponse.setScalingConfigurations(scalingConfigurations);
	 
	 	return describeScalingConfigurationsResponse;
	}
}