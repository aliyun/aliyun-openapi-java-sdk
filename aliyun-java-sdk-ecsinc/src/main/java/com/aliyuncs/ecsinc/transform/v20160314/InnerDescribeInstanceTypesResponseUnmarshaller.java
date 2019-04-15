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

package com.aliyuncs.ecsinc.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsinc.model.v20160314.InnerDescribeInstanceTypesResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerDescribeInstanceTypesResponse.InstanceType;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerDescribeInstanceTypesResponseUnmarshaller {

	public static InnerDescribeInstanceTypesResponse unmarshall(InnerDescribeInstanceTypesResponse innerDescribeInstanceTypesResponse, UnmarshallerContext context) {
		
		innerDescribeInstanceTypesResponse.setRequestId(context.stringValue("InnerDescribeInstanceTypesResponse.RequestId"));

		List<InstanceType> instanceTypes = new ArrayList<InstanceType>();
		for (int i = 0; i < context.lengthValue("InnerDescribeInstanceTypesResponse.InstanceTypes.Length"); i++) {
			InstanceType instanceType = new InstanceType();
			instanceType.setInstanceTypeId(context.stringValue("InnerDescribeInstanceTypesResponse.InstanceTypes["+ i +"].InstanceTypeId"));
			instanceType.setCpuCoreCount(context.integerValue("InnerDescribeInstanceTypesResponse.InstanceTypes["+ i +"].CpuCoreCount"));
			instanceType.setMemorySize(context.floatValue("InnerDescribeInstanceTypesResponse.InstanceTypes["+ i +"].MemorySize"));
			instanceType.setInstanceTypeFamily(context.stringValue("InnerDescribeInstanceTypesResponse.InstanceTypes["+ i +"].InstanceTypeFamily"));
			instanceType.setLocalStorageCapacity(context.longValue("InnerDescribeInstanceTypesResponse.InstanceTypes["+ i +"].LocalStorageCapacity"));
			instanceType.setLocalStorageAmount(context.integerValue("InnerDescribeInstanceTypesResponse.InstanceTypes["+ i +"].LocalStorageAmount"));
			instanceType.setLocalStorageCategory(context.stringValue("InnerDescribeInstanceTypesResponse.InstanceTypes["+ i +"].LocalStorageCategory"));
			instanceType.setGPUAmount(context.integerValue("InnerDescribeInstanceTypesResponse.InstanceTypes["+ i +"].GPUAmount"));
			instanceType.setGPUSpec(context.stringValue("InnerDescribeInstanceTypesResponse.InstanceTypes["+ i +"].GPUSpec"));
			instanceType.setVmPpsTx(context.longValue("InnerDescribeInstanceTypesResponse.InstanceTypes["+ i +"].VmPpsTx"));
			instanceType.setVmPpsRx(context.longValue("InnerDescribeInstanceTypesResponse.InstanceTypes["+ i +"].VmPpsRx"));
			instanceType.setVmBandwidthTx(context.integerValue("InnerDescribeInstanceTypesResponse.InstanceTypes["+ i +"].VmBandwidthTx"));
			instanceType.setVmBandwidthRx(context.integerValue("InnerDescribeInstanceTypesResponse.InstanceTypes["+ i +"].VmBandwidthRx"));
			instanceType.setPrivateRxPps(context.longValue("InnerDescribeInstanceTypesResponse.InstanceTypes["+ i +"].PrivateRxPps"));
			instanceType.setPrivateTxPps(context.longValue("InnerDescribeInstanceTypesResponse.InstanceTypes["+ i +"].PrivateTxPps"));
			instanceType.setPublicRxPps(context.longValue("InnerDescribeInstanceTypesResponse.InstanceTypes["+ i +"].PublicRxPps"));
			instanceType.setPublicTxPps(context.longValue("InnerDescribeInstanceTypesResponse.InstanceTypes["+ i +"].PublicTxPps"));
			instanceType.setFlag(context.integerValue("InnerDescribeInstanceTypesResponse.InstanceTypes["+ i +"].Flag"));
			instanceType.setBaselineCredit(context.integerValue("InnerDescribeInstanceTypesResponse.InstanceTypes["+ i +"].BaselineCredit"));
			instanceType.setVmIOPS(context.longValue("InnerDescribeInstanceTypesResponse.InstanceTypes["+ i +"].VmIOPS"));
			instanceType.setVmBPS(context.longValue("InnerDescribeInstanceTypesResponse.InstanceTypes["+ i +"].VmBPS"));
			instanceType.setEniQuantity(context.integerValue("InnerDescribeInstanceTypesResponse.InstanceTypes["+ i +"].EniQuantity"));
			instanceType.setEniPrivateIpAddressQuantity(context.integerValue("InnerDescribeInstanceTypesResponse.InstanceTypes["+ i +"].EniPrivateIpAddressQuantity"));
			instanceType.setEniIpv6AddressQuantity(context.integerValue("InnerDescribeInstanceTypesResponse.InstanceTypes["+ i +"].EniIpv6AddressQuantity"));
			instanceType.setFactor(context.floatValue("InnerDescribeInstanceTypesResponse.InstanceTypes["+ i +"].Factor"));

			instanceTypes.add(instanceType);
		}
		innerDescribeInstanceTypesResponse.setInstanceTypes(instanceTypes);
	 
	 	return innerDescribeInstanceTypesResponse;
	}
}