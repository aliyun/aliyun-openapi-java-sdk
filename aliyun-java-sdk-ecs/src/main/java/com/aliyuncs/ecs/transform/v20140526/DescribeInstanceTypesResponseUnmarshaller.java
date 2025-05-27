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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceTypesResponseUnmarshaller {

	public static DescribeInstanceTypesResponse unmarshall(DescribeInstanceTypesResponse describeInstanceTypesResponse, UnmarshallerContext _ctx) {
		
		describeInstanceTypesResponse.setRequestId(_ctx.stringValue("DescribeInstanceTypesResponse.RequestId"));
		describeInstanceTypesResponse.setNextToken(_ctx.stringValue("DescribeInstanceTypesResponse.NextToken"));

		List<InstanceType> instanceTypes = new ArrayList<InstanceType>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceTypesResponse.InstanceTypes.Length"); i++) {
			InstanceType instanceType = new InstanceType();
			instanceType.setEniTotalQuantity(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].EniTotalQuantity"));
			instanceType.setLocalStorageCategory(_ctx.stringValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].LocalStorageCategory"));
			instanceType.setPrimaryEniQueueNumber(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].PrimaryEniQueueNumber"));
			instanceType.setMemorySize(_ctx.floatValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].MemorySize"));
			instanceType.setLocalStorageCapacity(_ctx.longValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].LocalStorageCapacity"));
			instanceType.setInstanceFamilyLevel(_ctx.stringValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].InstanceFamilyLevel"));
			instanceType.setInstancePpsRx(_ctx.longValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].InstancePpsRx"));
			instanceType.setEniIpv6AddressQuantity(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].EniIpv6AddressQuantity"));
			instanceType.setMaximumQueueNumberPerEni(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].MaximumQueueNumberPerEni"));
			instanceType.setInstanceTypeId(_ctx.stringValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].InstanceTypeId"));
			instanceType.setInstanceBandwidthRx(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].InstanceBandwidthRx"));
			instanceType.setSecondaryEniQueueNumber(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].SecondaryEniQueueNumber"));
			instanceType.setGPUSpec(_ctx.stringValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].GPUSpec"));
			instanceType.setInstanceBandwidthTx(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].InstanceBandwidthTx"));
			instanceType.setQueuePairNumber(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].QueuePairNumber"));
			instanceType.setEriQuantity(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].EriQuantity"));
			instanceType.setGPUAmount(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].GPUAmount"));
			instanceType.setTotalEniQueueQuantity(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].TotalEniQueueQuantity"));
			instanceType.setNvmeSupport(_ctx.stringValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].NvmeSupport"));
			instanceType.setDiskQuantity(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].DiskQuantity"));
			instanceType.setInitialCredit(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].InitialCredit"));
			instanceType.setLocalStorageAmount(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].LocalStorageAmount"));
			instanceType.setBaselineCredit(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].BaselineCredit"));
			instanceType.setInstancePpsTx(_ctx.longValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].InstancePpsTx"));
			instanceType.setEniPrivateIpAddressQuantity(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].EniPrivateIpAddressQuantity"));
			instanceType.setCpuCoreCount(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].CpuCoreCount"));
			instanceType.setInstanceTypeFamily(_ctx.stringValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].InstanceTypeFamily"));
			instanceType.setEniQuantity(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].EniQuantity"));
			instanceType.setEniTrunkSupported(_ctx.booleanValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].EniTrunkSupported"));
			instanceType.setCpuSpeedFrequency(_ctx.floatValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].CpuSpeedFrequency"));
			instanceType.setCpuTurboFrequency(_ctx.floatValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].CpuTurboFrequency"));
			instanceType.setPhysicalProcessorModel(_ctx.stringValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].PhysicalProcessorModel"));
			instanceType.setNetworkEncryptionSupport(_ctx.booleanValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].NetworkEncryptionSupport"));
			instanceType.setInstanceCategory(_ctx.stringValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].InstanceCategory"));
			instanceType.setCpuArchitecture(_ctx.stringValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].CpuArchitecture"));
			instanceType.setGPUMemorySize(_ctx.floatValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].GPUMemorySize"));
			instanceType.setNetworkCardQuantity(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].NetworkCardQuantity"));
			instanceType.setJumboFrameSupport(_ctx.booleanValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].JumboFrameSupport"));

			List<String> supportedBootModes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].SupportedBootModes.Length"); j++) {
				supportedBootModes.add(_ctx.stringValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].SupportedBootModes["+ j +"]"));
			}
			instanceType.setSupportedBootModes(supportedBootModes);

			EnhancedNetwork enhancedNetwork = new EnhancedNetwork();
			enhancedNetwork.setSriovSupport(_ctx.booleanValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].EnhancedNetwork.SriovSupport"));
			enhancedNetwork.setVfQueueNumberPerEni(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].EnhancedNetwork.VfQueueNumberPerEni"));
			enhancedNetwork.setRssSupport(_ctx.booleanValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].EnhancedNetwork.RssSupport"));
			instanceType.setEnhancedNetwork(enhancedNetwork);

			CpuOptions cpuOptions = new CpuOptions();
			cpuOptions.setThreadsPerCore(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].CpuOptions.ThreadsPerCore"));
			cpuOptions.setCore(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].CpuOptions.Core"));
			cpuOptions.setCoreFactor(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].CpuOptions.CoreFactor"));
			cpuOptions.setHyperThreadingAdjustable(_ctx.booleanValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].CpuOptions.HyperThreadingAdjustable"));

			List<String> supportedTopologyTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].CpuOptions.SupportedTopologyTypes.Length"); j++) {
				supportedTopologyTypes.add(_ctx.stringValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].CpuOptions.SupportedTopologyTypes["+ j +"]"));
			}
			cpuOptions.setSupportedTopologyTypes(supportedTopologyTypes);
			instanceType.setCpuOptions(cpuOptions);

			Clock clock = new Clock();
			clock.setPtpSupport(_ctx.stringValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].Clock.PtpSupport"));
			instanceType.setClock(clock);

			List<NetworkCardInfo> networkCards = new ArrayList<NetworkCardInfo>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].NetworkCards.Length"); j++) {
				NetworkCardInfo networkCardInfo = new NetworkCardInfo();
				networkCardInfo.setNetworkCardIndex(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].NetworkCards["+ j +"].NetworkCardIndex"));

				networkCards.add(networkCardInfo);
			}
			instanceType.setNetworkCards(networkCards);

			List<Attribute> attributes = new ArrayList<Attribute>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].Attributes.Length"); j++) {
				Attribute attribute = new Attribute();
				attribute.setName(_ctx.stringValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].Attributes["+ j +"].Name"));
				attribute.setValue(_ctx.stringValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].Attributes["+ j +"].Value"));

				attributes.add(attribute);
			}
			instanceType.setAttributes(attributes);

			instanceTypes.add(instanceType);
		}
		describeInstanceTypesResponse.setInstanceTypes(instanceTypes);
	 
	 	return describeInstanceTypesResponse;
	}
}