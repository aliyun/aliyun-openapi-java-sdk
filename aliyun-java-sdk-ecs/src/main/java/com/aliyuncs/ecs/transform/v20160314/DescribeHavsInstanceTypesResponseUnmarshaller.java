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

package com.aliyuncs.ecs.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20160314.DescribeHavsInstanceTypesResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeHavsInstanceTypesResponse.DescribeHavsInstanceTypesResponse1;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHavsInstanceTypesResponseUnmarshaller {

	public static DescribeHavsInstanceTypesResponse unmarshall(DescribeHavsInstanceTypesResponse describeHavsInstanceTypesResponse, UnmarshallerContext _ctx) {
		
		describeHavsInstanceTypesResponse.setRequestId(_ctx.stringValue("DescribeHavsInstanceTypesResponse.RequestId"));

		DescribeHavsInstanceTypesResponse1 describeHavsInstanceTypesResponse1 = new DescribeHavsInstanceTypesResponse1();

		List<String> havsInstanceTypes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHavsInstanceTypesResponse.DescribeHavsInstanceTypesResponse.HavsInstanceTypes.Length"); i++) {
			havsInstanceTypes.add(_ctx.stringValue("DescribeHavsInstanceTypesResponse.DescribeHavsInstanceTypesResponse.HavsInstanceTypes["+ i +"]"));
		}
		describeHavsInstanceTypesResponse1.setHavsInstanceTypes(havsInstanceTypes);
		describeHavsInstanceTypesResponse.setDescribeHavsInstanceTypesResponse1(describeHavsInstanceTypesResponse1);
	 
	 	return describeHavsInstanceTypesResponse;
	}
}