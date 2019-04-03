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

package com.aliyuncs.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.DescribeRdsSuperAccountInstancesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRdsSuperAccountInstancesResponseUnmarshaller {

	public static DescribeRdsSuperAccountInstancesResponse unmarshall(DescribeRdsSuperAccountInstancesResponse describeRdsSuperAccountInstancesResponse, UnmarshallerContext context) {
		
		describeRdsSuperAccountInstancesResponse.setRequestId(context.stringValue("DescribeRdsSuperAccountInstancesResponse.RequestId"));

		List<String> dbInstances = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeRdsSuperAccountInstancesResponse.DbInstances.Length"); i++) {
			dbInstances.add(context.stringValue("DescribeRdsSuperAccountInstancesResponse.DbInstances["+ i +"]"));
		}
		describeRdsSuperAccountInstancesResponse.setDbInstances(dbInstances);
	 
	 	return describeRdsSuperAccountInstancesResponse;
	}
}