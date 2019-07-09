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

	public static DescribeInstanceStatusResponse unmarshall(DescribeInstanceStatusResponse describeInstanceStatusResponse, UnmarshallerContext _ctx) {
		
		describeInstanceStatusResponse.setRequestId(_ctx.stringValue("DescribeInstanceStatusResponse.RequestId"));
		describeInstanceStatusResponse.setTotalCount(_ctx.integerValue("DescribeInstanceStatusResponse.TotalCount"));
		describeInstanceStatusResponse.setPageNumber(_ctx.integerValue("DescribeInstanceStatusResponse.PageNumber"));
		describeInstanceStatusResponse.setPageSize(_ctx.integerValue("DescribeInstanceStatusResponse.PageSize"));

		List<InstanceStatus> instanceStatuses = new ArrayList<InstanceStatus>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceStatusResponse.InstanceStatuses.Length"); i++) {
			InstanceStatus instanceStatus = new InstanceStatus();
			instanceStatus.setInstanceId(_ctx.stringValue("DescribeInstanceStatusResponse.InstanceStatuses["+ i +"].InstanceId"));
			instanceStatus.setStatus(_ctx.stringValue("DescribeInstanceStatusResponse.InstanceStatuses["+ i +"].Status"));

			instanceStatuses.add(instanceStatus);
		}
		describeInstanceStatusResponse.setInstanceStatuses(instanceStatuses);
	 
	 	return describeInstanceStatusResponse;
	}
}