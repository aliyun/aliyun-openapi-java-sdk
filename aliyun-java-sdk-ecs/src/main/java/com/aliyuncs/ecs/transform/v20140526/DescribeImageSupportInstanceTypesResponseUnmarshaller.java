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

import com.aliyuncs.ecs.model.v20140526.DescribeImageSupportInstanceTypesResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeImageSupportInstanceTypesResponse.InstanceType;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImageSupportInstanceTypesResponseUnmarshaller {

	public static DescribeImageSupportInstanceTypesResponse unmarshall(DescribeImageSupportInstanceTypesResponse describeImageSupportInstanceTypesResponse, UnmarshallerContext _ctx) {
		
		describeImageSupportInstanceTypesResponse.setRequestId(_ctx.stringValue("DescribeImageSupportInstanceTypesResponse.RequestId"));
		describeImageSupportInstanceTypesResponse.setRegionId(_ctx.stringValue("DescribeImageSupportInstanceTypesResponse.RegionId"));
		describeImageSupportInstanceTypesResponse.setImageId(_ctx.stringValue("DescribeImageSupportInstanceTypesResponse.ImageId"));

		List<InstanceType> instanceTypes = new ArrayList<InstanceType>();
		for (int i = 0; i < _ctx.lengthValue("DescribeImageSupportInstanceTypesResponse.InstanceTypes.Length"); i++) {
			InstanceType instanceType = new InstanceType();
			instanceType.setInstanceTypeId(_ctx.stringValue("DescribeImageSupportInstanceTypesResponse.InstanceTypes["+ i +"].InstanceTypeId"));
			instanceType.setCpuCoreCount(_ctx.integerValue("DescribeImageSupportInstanceTypesResponse.InstanceTypes["+ i +"].CpuCoreCount"));
			instanceType.setMemorySize(_ctx.floatValue("DescribeImageSupportInstanceTypesResponse.InstanceTypes["+ i +"].MemorySize"));
			instanceType.setInstanceTypeFamily(_ctx.stringValue("DescribeImageSupportInstanceTypesResponse.InstanceTypes["+ i +"].InstanceTypeFamily"));

			instanceTypes.add(instanceType);
		}
		describeImageSupportInstanceTypesResponse.setInstanceTypes(instanceTypes);
	 
	 	return describeImageSupportInstanceTypesResponse;
	}
}