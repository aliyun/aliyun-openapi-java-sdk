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

import com.aliyuncs.ecs.model.v20140526.DescribeInstanceStatusResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceStatusResponse.InstanceStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceStatusResponseUnmarshaller {

	public static DescribeInstanceStatusResponse unmarshall(DescribeInstanceStatusResponse describeInstanceStatusResponse, UnmarshallerContext context) {
		
		describeInstanceStatusResponse.setRequestId(context.stringValue("DescribeInstanceStatusResponse.RequestId"));
		describeInstanceStatusResponse.setTotalCount(context.integerValue("DescribeInstanceStatusResponse.TotalCount"));
		describeInstanceStatusResponse.setPageNumber(context.integerValue("DescribeInstanceStatusResponse.PageNumber"));
		describeInstanceStatusResponse.setPageSize(context.integerValue("DescribeInstanceStatusResponse.PageSize"));

		List<InstanceStatus> instanceStatuses = new ArrayList<InstanceStatus>();
		for (int i = 0; i < context.lengthValue("DescribeInstanceStatusResponse.InstanceStatuses.Length"); i++) {
			InstanceStatus instanceStatus = new InstanceStatus();
			instanceStatus.setInstanceId(context.stringValue("DescribeInstanceStatusResponse.InstanceStatuses["+ i +"].InstanceId"));
			instanceStatus.setStatus(context.stringValue("DescribeInstanceStatusResponse.InstanceStatuses["+ i +"].Status"));

			instanceStatuses.add(instanceStatus);
		}
		describeInstanceStatusResponse.setInstanceStatuses(instanceStatuses);
	 
	 	return describeInstanceStatusResponse;
	}
}