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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceTypesResponseUnmarshaller {

	public static DescribeInstanceTypesResponse unmarshall(DescribeInstanceTypesResponse describeInstanceTypesResponse, UnmarshallerContext _ctx) {
		
		describeInstanceTypesResponse.setRequestId(_ctx.stringValue("DescribeInstanceTypesResponse.RequestId"));

		List<InstanceType> instanceTypes = new ArrayList<InstanceType>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceTypesResponse.InstanceTypes.Length"); i++) {
			InstanceType instanceType = new InstanceType();
			instanceType.setInstanceTypeId(_ctx.stringValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].InstanceTypeId"));
			instanceType.setCpuCoreCount(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].CpuCoreCount"));
			instanceType.setMemorySize(_ctx.floatValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].MemorySize"));
			instanceType.setInstanceTypeFamily(_ctx.stringValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].InstanceTypeFamily"));
			instanceType.setLocalStorageCapacity(_ctx.longValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].LocalStorageCapacity"));
			instanceType.setLocalStorageAmount(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].LocalStorageAmount"));
			instanceType.setLocalStorageCategory(_ctx.stringValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].LocalStorageCategory"));
			instanceType.setGPUAmount(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].GPUAmount"));
			instanceType.setGPUSpec(_ctx.stringValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].GPUSpec"));
			instanceType.setInitialCredit(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].InitialCredit"));
			instanceType.setBaselineCredit(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].BaselineCredit"));
			instanceType.setEniQuantity(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].EniQuantity"));
			instanceType.setEniPrivateIpAddressQuantity(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].EniPrivateIpAddressQuantity"));
			instanceType.setEniIpv6AddressQuantity(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].EniIpv6AddressQuantity"));
			instanceType.setInstanceBandwidthRx(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].InstanceBandwidthRx"));
			instanceType.setInstanceBandwidthTx(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].InstanceBandwidthTx"));
			instanceType.setInstancePpsRx(_ctx.longValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].InstancePpsRx"));
			instanceType.setInstancePpsTx(_ctx.longValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].InstancePpsTx"));
			instanceType.setInstanceFamilyLevel(_ctx.stringValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].InstanceFamilyLevel"));
			instanceType.setTotalEniQueueQuantity(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].TotalEniQueueQuantity"));
			instanceType.setEniTrunkSupported(_ctx.booleanValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].EniTrunkSupported"));
			instanceType.setEniTotalQuantity(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].EniTotalQuantity"));
			instanceType.setMaximumQueueNumberPerEni(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].MaximumQueueNumberPerEni"));
			instanceType.setPrimaryEniQueueNumber(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].PrimaryEniQueueNumber"));
			instanceType.setSecondaryEniQueueNumber(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].SecondaryEniQueueNumber"));
			instanceType.setDiskQuantity(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].DiskQuantity"));
			instanceType.setEriQuantity(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].EriQuantity"));
			instanceType.setQueuePairNumber(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].QueuePairNumber"));
			instanceType.setNvmeSupport(_ctx.stringValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].NvmeSupport"));

			instanceTypes.add(instanceType);
		}
		describeInstanceTypesResponse.setInstanceTypes(instanceTypes);
	 
	 	return describeInstanceTypesResponse;
	}
}