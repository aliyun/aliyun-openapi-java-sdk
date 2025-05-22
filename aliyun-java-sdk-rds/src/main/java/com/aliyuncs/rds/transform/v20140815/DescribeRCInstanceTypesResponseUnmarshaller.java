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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeRCInstanceTypesResponse;
import com.aliyuncs.rds.model.v20140815.DescribeRCInstanceTypesResponse.InstanceTypes;
import com.aliyuncs.rds.model.v20140815.DescribeRCInstanceTypesResponse.InstanceTypes.InstanceTypeItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRCInstanceTypesResponseUnmarshaller {

	public static DescribeRCInstanceTypesResponse unmarshall(DescribeRCInstanceTypesResponse describeRCInstanceTypesResponse, UnmarshallerContext _ctx) {
		
		describeRCInstanceTypesResponse.setRequestId(_ctx.stringValue("DescribeRCInstanceTypesResponse.RequestId"));

		InstanceTypes instanceTypes = new InstanceTypes();

		List<InstanceTypeItem> instanceType = new ArrayList<InstanceTypeItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRCInstanceTypesResponse.InstanceTypes.InstanceType.Length"); i++) {
			InstanceTypeItem instanceTypeItem = new InstanceTypeItem();
			instanceTypeItem.setCpuCoreCount(_ctx.integerValue("DescribeRCInstanceTypesResponse.InstanceTypes.InstanceType["+ i +"].CpuCoreCount"));
			instanceTypeItem.setInstanceTypeFamily(_ctx.stringValue("DescribeRCInstanceTypesResponse.InstanceTypes.InstanceType["+ i +"].InstanceTypeFamily"));
			instanceTypeItem.setInstanceTypeId(_ctx.stringValue("DescribeRCInstanceTypesResponse.InstanceTypes.InstanceType["+ i +"].InstanceTypeId"));
			instanceTypeItem.setMemorySize(_ctx.integerValue("DescribeRCInstanceTypesResponse.InstanceTypes.InstanceType["+ i +"].MemorySize"));

			instanceType.add(instanceTypeItem);
		}
		instanceTypes.setInstanceType(instanceType);
		describeRCInstanceTypesResponse.setInstanceTypes(instanceTypes);
	 
	 	return describeRCInstanceTypesResponse;
	}
}