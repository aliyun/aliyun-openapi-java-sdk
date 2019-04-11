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

package com.aliyuncs.cms.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20190101.DescribeUnhealthyHostAvailabilityResponse;
import com.aliyuncs.cms.model.v20190101.DescribeUnhealthyHostAvailabilityResponse.NodeTaskInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUnhealthyHostAvailabilityResponseUnmarshaller {

	public static DescribeUnhealthyHostAvailabilityResponse unmarshall(DescribeUnhealthyHostAvailabilityResponse describeUnhealthyHostAvailabilityResponse, UnmarshallerContext context) {
		
		describeUnhealthyHostAvailabilityResponse.setRequestId(context.stringValue("DescribeUnhealthyHostAvailabilityResponse.RequestId"));
		describeUnhealthyHostAvailabilityResponse.setCode(context.stringValue("DescribeUnhealthyHostAvailabilityResponse.Code"));
		describeUnhealthyHostAvailabilityResponse.setMessage(context.stringValue("DescribeUnhealthyHostAvailabilityResponse.Message"));
		describeUnhealthyHostAvailabilityResponse.setSuccess(context.booleanValue("DescribeUnhealthyHostAvailabilityResponse.Success"));

		List<NodeTaskInstance> unhealthyList = new ArrayList<NodeTaskInstance>();
		for (int i = 0; i < context.lengthValue("DescribeUnhealthyHostAvailabilityResponse.UnhealthyList.Length"); i++) {
			NodeTaskInstance nodeTaskInstance = new NodeTaskInstance();
			nodeTaskInstance.setId(context.longValue("DescribeUnhealthyHostAvailabilityResponse.UnhealthyList["+ i +"].Id"));

			List<String> instanceList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeUnhealthyHostAvailabilityResponse.UnhealthyList["+ i +"].InstanceList.Length"); j++) {
				instanceList.add(context.stringValue("DescribeUnhealthyHostAvailabilityResponse.UnhealthyList["+ i +"].InstanceList["+ j +"]"));
			}
			nodeTaskInstance.setInstanceList(instanceList);

			unhealthyList.add(nodeTaskInstance);
		}
		describeUnhealthyHostAvailabilityResponse.setUnhealthyList(unhealthyList);
	 
	 	return describeUnhealthyHostAvailabilityResponse;
	}
}