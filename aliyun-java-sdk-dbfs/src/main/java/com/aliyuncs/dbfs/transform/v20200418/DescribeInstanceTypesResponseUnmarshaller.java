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

package com.aliyuncs.dbfs.transform.v20200418;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dbfs.model.v20200418.DescribeInstanceTypesResponse;
import com.aliyuncs.dbfs.model.v20200418.DescribeInstanceTypesResponse.InstanceTypesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceTypesResponseUnmarshaller {

	public static DescribeInstanceTypesResponse unmarshall(DescribeInstanceTypesResponse describeInstanceTypesResponse, UnmarshallerContext _ctx) {
		
		describeInstanceTypesResponse.setRequestId(_ctx.stringValue("DescribeInstanceTypesResponse.RequestId"));

		List<InstanceTypesItem> instanceTypes = new ArrayList<InstanceTypesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceTypesResponse.InstanceTypes.Length"); i++) {
			InstanceTypesItem instanceTypesItem = new InstanceTypesItem();
			instanceTypesItem.setInstanceTypeId(_ctx.stringValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].InstanceTypeId"));
			instanceTypesItem.setCpuCoreCount(_ctx.floatValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].CpuCoreCount"));
			instanceTypesItem.setMemorySize(_ctx.floatValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].MemorySize"));
			instanceTypesItem.setInstanceTypeDescription(_ctx.stringValue("DescribeInstanceTypesResponse.InstanceTypes["+ i +"].InstanceTypeDescription"));

			instanceTypes.add(instanceTypesItem);
		}
		describeInstanceTypesResponse.setInstanceTypes(instanceTypes);
	 
	 	return describeInstanceTypesResponse;
	}
}