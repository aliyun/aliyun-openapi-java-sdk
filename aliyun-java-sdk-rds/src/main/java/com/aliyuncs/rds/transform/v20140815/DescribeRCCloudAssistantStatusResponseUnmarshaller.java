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

import com.aliyuncs.rds.model.v20140815.DescribeRCCloudAssistantStatusResponse;
import com.aliyuncs.rds.model.v20140815.DescribeRCCloudAssistantStatusResponse.InstanceCloudAssistantStatusSetItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRCCloudAssistantStatusResponseUnmarshaller {

	public static DescribeRCCloudAssistantStatusResponse unmarshall(DescribeRCCloudAssistantStatusResponse describeRCCloudAssistantStatusResponse, UnmarshallerContext _ctx) {
		
		describeRCCloudAssistantStatusResponse.setRequestId(_ctx.stringValue("DescribeRCCloudAssistantStatusResponse.RequestId"));
		describeRCCloudAssistantStatusResponse.setTotalCount(_ctx.integerValue("DescribeRCCloudAssistantStatusResponse.TotalCount"));
		describeRCCloudAssistantStatusResponse.setNextToken(_ctx.stringValue("DescribeRCCloudAssistantStatusResponse.NextToken"));
		describeRCCloudAssistantStatusResponse.setPageNumber(_ctx.stringValue("DescribeRCCloudAssistantStatusResponse.PageNumber"));
		describeRCCloudAssistantStatusResponse.setPageSize(_ctx.stringValue("DescribeRCCloudAssistantStatusResponse.PageSize"));

		List<InstanceCloudAssistantStatusSetItem> instanceCloudAssistantStatusSet = new ArrayList<InstanceCloudAssistantStatusSetItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRCCloudAssistantStatusResponse.InstanceCloudAssistantStatusSet.Length"); i++) {
			InstanceCloudAssistantStatusSetItem instanceCloudAssistantStatusSetItem = new InstanceCloudAssistantStatusSetItem();
			instanceCloudAssistantStatusSetItem.setCloudAssistantVersion(_ctx.stringValue("DescribeRCCloudAssistantStatusResponse.InstanceCloudAssistantStatusSet["+ i +"].CloudAssistantVersion"));
			instanceCloudAssistantStatusSetItem.setSupportSessionManager(_ctx.booleanValue("DescribeRCCloudAssistantStatusResponse.InstanceCloudAssistantStatusSet["+ i +"].SupportSessionManager"));
			instanceCloudAssistantStatusSetItem.setInstanceId(_ctx.stringValue("DescribeRCCloudAssistantStatusResponse.InstanceCloudAssistantStatusSet["+ i +"].InstanceId"));
			instanceCloudAssistantStatusSetItem.setInvocationCount(_ctx.integerValue("DescribeRCCloudAssistantStatusResponse.InstanceCloudAssistantStatusSet["+ i +"].InvocationCount"));
			instanceCloudAssistantStatusSetItem.setOSType(_ctx.stringValue("DescribeRCCloudAssistantStatusResponse.InstanceCloudAssistantStatusSet["+ i +"].OSType"));
			instanceCloudAssistantStatusSetItem.setCloudAssistantStatus(_ctx.stringValue("DescribeRCCloudAssistantStatusResponse.InstanceCloudAssistantStatusSet["+ i +"].CloudAssistantStatus"));
			instanceCloudAssistantStatusSetItem.setLastHeartbeatTime(_ctx.stringValue("DescribeRCCloudAssistantStatusResponse.InstanceCloudAssistantStatusSet["+ i +"].LastHeartbeatTime"));
			instanceCloudAssistantStatusSetItem.setLastInvokedTime(_ctx.stringValue("DescribeRCCloudAssistantStatusResponse.InstanceCloudAssistantStatusSet["+ i +"].LastInvokedTime"));
			instanceCloudAssistantStatusSetItem.setActiveTaskCount(_ctx.integerValue("DescribeRCCloudAssistantStatusResponse.InstanceCloudAssistantStatusSet["+ i +"].ActiveTaskCount"));

			instanceCloudAssistantStatusSet.add(instanceCloudAssistantStatusSetItem);
		}
		describeRCCloudAssistantStatusResponse.setInstanceCloudAssistantStatusSet(instanceCloudAssistantStatusSet);
	 
	 	return describeRCCloudAssistantStatusResponse;
	}
}