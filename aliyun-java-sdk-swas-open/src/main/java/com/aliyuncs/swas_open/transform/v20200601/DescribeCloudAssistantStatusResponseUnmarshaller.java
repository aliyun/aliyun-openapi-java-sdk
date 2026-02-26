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

package com.aliyuncs.swas_open.transform.v20200601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.swas_open.model.v20200601.DescribeCloudAssistantStatusResponse;
import com.aliyuncs.swas_open.model.v20200601.DescribeCloudAssistantStatusResponse.Status;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCloudAssistantStatusResponseUnmarshaller {

	public static DescribeCloudAssistantStatusResponse unmarshall(DescribeCloudAssistantStatusResponse describeCloudAssistantStatusResponse, UnmarshallerContext _ctx) {
		
		describeCloudAssistantStatusResponse.setRequestId(_ctx.stringValue("DescribeCloudAssistantStatusResponse.RequestId"));
		describeCloudAssistantStatusResponse.setTotalCount(_ctx.integerValue("DescribeCloudAssistantStatusResponse.TotalCount"));
		describeCloudAssistantStatusResponse.setPageSize(_ctx.integerValue("DescribeCloudAssistantStatusResponse.PageSize"));
		describeCloudAssistantStatusResponse.setPageNumber(_ctx.integerValue("DescribeCloudAssistantStatusResponse.PageNumber"));

		List<Status> cloudAssistantStatus = new ArrayList<Status>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCloudAssistantStatusResponse.CloudAssistantStatus.Length"); i++) {
			Status status = new Status();
			status.setInstanceId(_ctx.stringValue("DescribeCloudAssistantStatusResponse.CloudAssistantStatus["+ i +"].InstanceId"));
			status.setStatus(_ctx.booleanValue("DescribeCloudAssistantStatusResponse.CloudAssistantStatus["+ i +"].Status"));

			cloudAssistantStatus.add(status);
		}
		describeCloudAssistantStatusResponse.setCloudAssistantStatus(cloudAssistantStatus);
	 
	 	return describeCloudAssistantStatusResponse;
	}
}