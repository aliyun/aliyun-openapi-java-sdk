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

import com.aliyuncs.ecs.model.v20140526.DescribeInstanceTypeFamiliesResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceTypeFamiliesResponse.InstanceTypeFamily;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceTypeFamiliesResponseUnmarshaller {

	public static DescribeInstanceTypeFamiliesResponse unmarshall(DescribeInstanceTypeFamiliesResponse describeInstanceTypeFamiliesResponse, UnmarshallerContext _ctx) {
		
		describeInstanceTypeFamiliesResponse.setRequestId(_ctx.stringValue("DescribeInstanceTypeFamiliesResponse.RequestId"));

		List<InstanceTypeFamily> instanceTypeFamilies = new ArrayList<InstanceTypeFamily>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceTypeFamiliesResponse.InstanceTypeFamilies.Length"); i++) {
			InstanceTypeFamily instanceTypeFamily = new InstanceTypeFamily();
			instanceTypeFamily.setInstanceTypeFamilyId(_ctx.stringValue("DescribeInstanceTypeFamiliesResponse.InstanceTypeFamilies["+ i +"].InstanceTypeFamilyId"));
			instanceTypeFamily.setGeneration(_ctx.stringValue("DescribeInstanceTypeFamiliesResponse.InstanceTypeFamilies["+ i +"].Generation"));

			instanceTypeFamilies.add(instanceTypeFamily);
		}
		describeInstanceTypeFamiliesResponse.setInstanceTypeFamilies(instanceTypeFamilies);
	 
	 	return describeInstanceTypeFamiliesResponse;
	}
}