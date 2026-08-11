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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeInstanceTypesResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceTypesResponse.InstanceType;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceTypesResponse.InstanceType.Attribute;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceTypesResponse.InstanceType.Clock;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceTypesResponse.InstanceType.CpuOptions;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceTypesResponse.InstanceType.EnhancedNetwork;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceTypesResponse.InstanceType.NetworkCardInfo;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceTypesResponse.InstanceType.NetworkInfo;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceTypesResponse.InstanceType.NetworkInfo.BandwidthWeighting;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceTypesResponse.InstanceType.NetworkInfo.BandwidthWeighting.WeightingInfo;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceTypesResponse.InstanceType.SecurityOptions;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceTypesResponseUnmarshaller {

	public static DescribeInstanceTypesResponse unmarshall(DescribeInstanceTypesResponse describeInstanceTypesResponse, UnmarshallerContext _ctx) {
		
		describeInstanceTypesResponse.setRequestId(_ctx.stringValue("DescribeInstanceTypesResponse.RequestId"));
		describeInstanceTypesResponse.setNextToken(_ctx.stringValue("DescribeInstanceTypesResponse.NextToken"));

		List<InstanceType> instanceTypes = new ArrayList<InstanceType>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceTypesResponse.InstanceTypes.Length"); i++) {
			InstanceType instanceType = new InstanceType();
			instanceType.setInstancePpsTx(_ctx.longValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].InstancePpsTx"));
			instanceType.setNvmeSupport(_ctx.stringValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].NvmeSupport"));
			instanceType.setPrimaryEniQueueNumber(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].PrimaryEniQueueNumber"));
			instanceType.setLocalStorageCapacity(_ctx.longValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].LocalStorageCapacity"));
			instanceType.setTotalEniQueueQuantity(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].TotalEniQueueQuantity"));
			instanceType.setEniTrunkSupported(_ctx.booleanValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].EniTrunkSupported"));
			instanceType.setInstanceTypeFamily(_ctx.stringValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].InstanceTypeFamily"));
			instanceType.setInstancePpsRx(_ctx.longValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].InstancePpsRx"));
			instanceType.setNetworkEncryptionSupport(_ctx.booleanValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].NetworkEncryptionSupport"));
			instanceType.setEriQuantity(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].EriQuantity"));
			instanceType.setInstanceBandwidthRx(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].InstanceBandwidthRx"));
			instanceType.setInstanceBandwidthTx(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].InstanceBandwidthTx"));
			instanceType.setLocalStorageAmount(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].LocalStorageAmount"));
			instanceType.setSecondaryEniQueueNumber(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].SecondaryEniQueueNumber"));
			instanceType.setPhysicalProcessorModel(_ctx.stringValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].PhysicalProcessorModel"));
			instanceType.setLocalStorageCategory(_ctx.stringValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].LocalStorageCategory"));
			instanceType.setGPUSpec(_ctx.stringValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].GPUSpec"));
			instanceType.setCpuArchitecture(_ctx.stringValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].CpuArchitecture"));
			instanceType.setInstanceTypeId(_ctx.stringValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].InstanceTypeId"));
			instanceType.setMemorySize(_ctx.floatValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].MemorySize"));
			instanceType.setMaximumQueueNumberPerEni(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].MaximumQueueNumberPerEni"));
			instanceType.setEniIpv6AddressQuantity(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].EniIpv6AddressQuantity"));
			instanceType.setGPUMemorySize(_ctx.floatValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].GPUMemorySize"));
			instanceType.setEniTotalQuantity(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].EniTotalQuantity"));
			instanceType.setCpuCoreCount(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].CpuCoreCount"));
			instanceType.setInitialCredit(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].InitialCredit"));
			instanceType.setNetworkCardQuantity(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].NetworkCardQuantity"));
			instanceType.setInstanceCategory(_ctx.stringValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].InstanceCategory"));
			instanceType.setEniQuantity(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].EniQuantity"));
			instanceType.setGPUAmount(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].GPUAmount"));
			instanceType.setDiskQuantity(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].DiskQuantity"));
			instanceType.setCpuSpeedFrequency(_ctx.floatValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].CpuSpeedFrequency"));
			instanceType.setQueuePairNumber(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].QueuePairNumber"));
			instanceType.setBaselineCredit(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].BaselineCredit"));
			instanceType.setInstanceFamilyLevel(_ctx.stringValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].InstanceFamilyLevel"));
			instanceType.setJumboFrameSupport(_ctx.booleanValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].JumboFrameSupport"));
			instanceType.setCpuTurboFrequency(_ctx.floatValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].CpuTurboFrequency"));
			instanceType.setEniPrivateIpAddressQuantity(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].EniPrivateIpAddressQuantity"));

			List<String> supportedBootModes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].SupportedBootModes.Length"); j++) {
				supportedBootModes.add(_ctx.stringValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].SupportedBootModes["+ j +"]"));
			}
			instanceType.setSupportedBootModes(supportedBootModes);

			Clock clock = new Clock();
			clock.setPtpSupport(_ctx.stringValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].Clock.PtpSupport"));
			instanceType.setClock(clock);

			EnhancedNetwork enhancedNetwork = new EnhancedNetwork();
			enhancedNetwork.setExpressSupport(_ctx.booleanValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].EnhancedNetwork.ExpressSupport"));
			enhancedNetwork.setVfQueueNumberPerEni(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].EnhancedNetwork.VfQueueNumberPerEni"));
			enhancedNetwork.setRssSupport(_ctx.booleanValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].EnhancedNetwork.RssSupport"));
			enhancedNetwork.setSriovSupport(_ctx.booleanValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].EnhancedNetwork.SriovSupport"));
			instanceType.setEnhancedNetwork(enhancedNetwork);

			NetworkInfo networkInfo = new NetworkInfo();

			BandwidthWeighting bandwidthWeighting = new BandwidthWeighting();

			List<WeightingInfo> weightingInfos = new ArrayList<WeightingInfo>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].NetworkInfo.BandwidthWeighting.WeightingInfos.Length"); j++) {
				WeightingInfo weightingInfo = new WeightingInfo();
				weightingInfo.setVpcBandwidth(_ctx.longValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].NetworkInfo.BandwidthWeighting.WeightingInfos["+ j +"].VpcBandwidth"));
				weightingInfo.setEbsBurstBandwidth(_ctx.longValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].NetworkInfo.BandwidthWeighting.WeightingInfos["+ j +"].EbsBurstBandwidth"));
				weightingInfo.setEbsBandwidth(_ctx.longValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].NetworkInfo.BandwidthWeighting.WeightingInfos["+ j +"].EbsBandwidth"));
				weightingInfo.setVpcBurstBandwidth(_ctx.longValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].NetworkInfo.BandwidthWeighting.WeightingInfos["+ j +"].VpcBurstBandwidth"));
				weightingInfo.setName(_ctx.stringValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].NetworkInfo.BandwidthWeighting.WeightingInfos["+ j +"].Name"));

				weightingInfos.add(weightingInfo);
			}
			bandwidthWeighting.setWeightingInfos(weightingInfos);
			networkInfo.setBandwidthWeighting(bandwidthWeighting);
			instanceType.setNetworkInfo(networkInfo);

			CpuOptions cpuOptions = new CpuOptions();
			cpuOptions.setNestedVirtualizationSupport(_ctx.stringValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].CpuOptions.NestedVirtualizationSupport"));
			cpuOptions.setCoreFactor(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].CpuOptions.CoreFactor"));
			cpuOptions.setThreadsPerCore(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].CpuOptions.ThreadsPerCore"));
			cpuOptions.setHyperThreadingAdjustable(_ctx.booleanValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].CpuOptions.HyperThreadingAdjustable"));
			cpuOptions.setCore(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].CpuOptions.Core"));

			List<String> supportedTopologyTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].CpuOptions.SupportedTopologyTypes.Length"); j++) {
				supportedTopologyTypes.add(_ctx.stringValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].CpuOptions.SupportedTopologyTypes["+ j +"]"));
			}
			cpuOptions.setSupportedTopologyTypes(supportedTopologyTypes);
			instanceType.setCpuOptions(cpuOptions);

			SecurityOptions securityOptions = new SecurityOptions();
			securityOptions.setSecureBootSupport(_ctx.stringValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].SecurityOptions.SecureBootSupport"));
			instanceType.setSecurityOptions(securityOptions);

			List<Attribute> attributes = new ArrayList<Attribute>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].Attributes.Length"); j++) {
				Attribute attribute = new Attribute();
				attribute.setValue(_ctx.stringValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].Attributes["+ j +"].Value"));
				attribute.setName(_ctx.stringValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].Attributes["+ j +"].Name"));

				attributes.add(attribute);
			}
			instanceType.setAttributes(attributes);

			List<NetworkCardInfo> networkCards = new ArrayList<NetworkCardInfo>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].NetworkCards.Length"); j++) {
				NetworkCardInfo networkCardInfo = new NetworkCardInfo();
				networkCardInfo.setNetworkCardIndex(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].NetworkCards["+ j +"].NetworkCardIndex"));

				networkCards.add(networkCardInfo);
			}
			instanceType.setNetworkCards(networkCards);

			instanceTypes.add(instanceType);
		}
		describeInstanceTypesResponse.setInstanceTypes(instanceTypes);
	 
	 	return describeInstanceTypesResponse;
	}
}