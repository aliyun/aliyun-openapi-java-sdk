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

import com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostTypesResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostTypesResponse.DedicatedHostType;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDedicatedHostTypesResponseUnmarshaller {

	public static DescribeDedicatedHostTypesResponse unmarshall(DescribeDedicatedHostTypesResponse describeDedicatedHostTypesResponse, UnmarshallerContext context) {
		
		describeDedicatedHostTypesResponse.setRequestId(context.stringValue("DescribeDedicatedHostTypesResponse.RequestId"));

		List<DedicatedHostType> dedicatedHostTypes = new ArrayList<DedicatedHostType>();
		for (int i = 0; i < context.lengthValue("DescribeDedicatedHostTypesResponse.DedicatedHostTypes.Length"); i++) {
			DedicatedHostType dedicatedHostType = new DedicatedHostType();
			dedicatedHostType.setDedicatedHostType(context.stringValue("DescribeDedicatedHostTypesResponse.DedicatedHostTypes["+ i +"].DedicatedHostType"));
			dedicatedHostType.setSockets(context.integerValue("DescribeDedicatedHostTypesResponse.DedicatedHostTypes["+ i +"].Sockets"));
			dedicatedHostType.setTotalVcpus(context.integerValue("DescribeDedicatedHostTypesResponse.DedicatedHostTypes["+ i +"].TotalVcpus"));
			dedicatedHostType.setTotalVgpus(context.integerValue("DescribeDedicatedHostTypesResponse.DedicatedHostTypes["+ i +"].TotalVgpus"));
			dedicatedHostType.setCores(context.integerValue("DescribeDedicatedHostTypesResponse.DedicatedHostTypes["+ i +"].Cores"));
			dedicatedHostType.setPhysicalGpus(context.integerValue("DescribeDedicatedHostTypesResponse.DedicatedHostTypes["+ i +"].PhysicalGpus"));
			dedicatedHostType.setMemorySize(context.floatValue("DescribeDedicatedHostTypesResponse.DedicatedHostTypes["+ i +"].MemorySize"));
			dedicatedHostType.setLocalStorageCapacity(context.longValue("DescribeDedicatedHostTypesResponse.DedicatedHostTypes["+ i +"].LocalStorageCapacity"));
			dedicatedHostType.setLocalStorageAmount(context.integerValue("DescribeDedicatedHostTypesResponse.DedicatedHostTypes["+ i +"].LocalStorageAmount"));
			dedicatedHostType.setLocalStorageCategory(context.stringValue("DescribeDedicatedHostTypesResponse.DedicatedHostTypes["+ i +"].LocalStorageCategory"));
			dedicatedHostType.setGPUSpec(context.stringValue("DescribeDedicatedHostTypesResponse.DedicatedHostTypes["+ i +"].GPUSpec"));

			List<String> supportedInstanceTypeFamilies = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeDedicatedHostTypesResponse.DedicatedHostTypes["+ i +"].SupportedInstanceTypeFamilies.Length"); j++) {
				supportedInstanceTypeFamilies.add(context.stringValue("DescribeDedicatedHostTypesResponse.DedicatedHostTypes["+ i +"].SupportedInstanceTypeFamilies["+ j +"]"));
			}
			dedicatedHostType.setSupportedInstanceTypeFamilies(supportedInstanceTypeFamilies);

			List<String> supportedInstanceTypesList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeDedicatedHostTypesResponse.DedicatedHostTypes["+ i +"].SupportedInstanceTypesList.Length"); j++) {
				supportedInstanceTypesList.add(context.stringValue("DescribeDedicatedHostTypesResponse.DedicatedHostTypes["+ i +"].SupportedInstanceTypesList["+ j +"]"));
			}
			dedicatedHostType.setSupportedInstanceTypesList(supportedInstanceTypesList);

			dedicatedHostTypes.add(dedicatedHostType);
		}
		describeDedicatedHostTypesResponse.setDedicatedHostTypes(dedicatedHostTypes);
	 
	 	return describeDedicatedHostTypesResponse;
	}
}