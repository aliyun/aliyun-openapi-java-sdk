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

import com.aliyuncs.swas_open.model.v20200601.DescribeCloudAssistantAttributesResponse;
import com.aliyuncs.swas_open.model.v20200601.DescribeCloudAssistantAttributesResponse.Status;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCloudAssistantAttributesResponseUnmarshaller {

	public static DescribeCloudAssistantAttributesResponse unmarshall(DescribeCloudAssistantAttributesResponse describeCloudAssistantAttributesResponse, UnmarshallerContext _ctx) {
		
		describeCloudAssistantAttributesResponse.setRequestId(_ctx.stringValue("DescribeCloudAssistantAttributesResponse.RequestId"));
		describeCloudAssistantAttributesResponse.setTotalCount(_ctx.integerValue("DescribeCloudAssistantAttributesResponse.TotalCount"));
		describeCloudAssistantAttributesResponse.setPageSize(_ctx.integerValue("DescribeCloudAssistantAttributesResponse.PageSize"));
		describeCloudAssistantAttributesResponse.setPageNumber(_ctx.integerValue("DescribeCloudAssistantAttributesResponse.PageNumber"));

		List<Status> cloudAssistant = new ArrayList<Status>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCloudAssistantAttributesResponse.CloudAssistant.Length"); i++) {
			Status status = new Status();
			status.setInstanceId(_ctx.stringValue("DescribeCloudAssistantAttributesResponse.CloudAssistant["+ i +"].InstanceId"));
			status.setCloudAssistantStatus(_ctx.stringValue("DescribeCloudAssistantAttributesResponse.CloudAssistant["+ i +"].CloudAssistantStatus"));
			status.setLastInvokedTime(_ctx.stringValue("DescribeCloudAssistantAttributesResponse.CloudAssistant["+ i +"].LastInvokedTime"));
			status.setCloudAssistantVersion(_ctx.stringValue("DescribeCloudAssistantAttributesResponse.CloudAssistant["+ i +"].CloudAssistantVersion"));
			status.setActiveTaskCount(_ctx.longValue("DescribeCloudAssistantAttributesResponse.CloudAssistant["+ i +"].ActiveTaskCount"));
			status.setInvocationCount(_ctx.longValue("DescribeCloudAssistantAttributesResponse.CloudAssistant["+ i +"].InvocationCount"));
			status.setLastHeartbeatTime(_ctx.stringValue("DescribeCloudAssistantAttributesResponse.CloudAssistant["+ i +"].LastHeartbeatTime"));
			status.setOSType(_ctx.stringValue("DescribeCloudAssistantAttributesResponse.CloudAssistant["+ i +"].OSType"));
			status.setSupportSessionManager(_ctx.booleanValue("DescribeCloudAssistantAttributesResponse.CloudAssistant["+ i +"].SupportSessionManager"));

			cloudAssistant.add(status);
		}
		describeCloudAssistantAttributesResponse.setCloudAssistant(cloudAssistant);
	 
	 	return describeCloudAssistantAttributesResponse;
	}
}