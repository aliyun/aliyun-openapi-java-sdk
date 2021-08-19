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

			instanceTypes.add(instanceType);
		}
		describeInstanceTypesResponse.setInstanceTypes(instanceTypes);
	 
	 	return describeInstanceTypesResponse;
	}
}