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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeInstanceTypesResponse;
import com.aliyuncs.ens.model.v20171110.DescribeInstanceTypesResponse.InstanceType;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceTypesResponseUnmarshaller {

	public static DescribeInstanceTypesResponse unmarshall(DescribeInstanceTypesResponse describeInstanceTypesResponse, UnmarshallerContext _ctx) {
		
		describeInstanceTypesResponse.setRequestId(_ctx.stringValue("DescribeInstanceTypesResponse.RequestId"));
		describeInstanceTypesResponse.setCode(_ctx.integerValue("DescribeInstanceTypesResponse.Code"));

		List<InstanceType> instanceTypes = new ArrayList<InstanceType>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceTypesResponse.InstanceTypes.Length"); i++) {
			InstanceType instanceType = new InstanceType();
			instanceType.setCpuCoreCount(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].CpuCoreCount"));
			instanceType.setInstanceTypeId(_ctx.stringValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].InstanceTypeId"));
			instanceType.setInstanceTypeName(_ctx.stringValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].InstanceTypeName"));
			instanceType.setMemorySize(_ctx.integerValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].MemorySize"));

			instanceTypes.add(instanceType);
		}
		describeInstanceTypesResponse.setInstanceTypes(instanceTypes);
	 
	 	return describeInstanceTypesResponse;
	}
}