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

import com.aliyuncs.swas_open.model.v20200601.DescribeCloudMonitorAgentStatusesResponse;
import com.aliyuncs.swas_open.model.v20200601.DescribeCloudMonitorAgentStatusesResponse.InstanceStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCloudMonitorAgentStatusesResponseUnmarshaller {

	public static DescribeCloudMonitorAgentStatusesResponse unmarshall(DescribeCloudMonitorAgentStatusesResponse describeCloudMonitorAgentStatusesResponse, UnmarshallerContext _ctx) {
		
		describeCloudMonitorAgentStatusesResponse.setRequestId(_ctx.stringValue("DescribeCloudMonitorAgentStatusesResponse.RequestId"));

		List<InstanceStatus> instanceStatusList = new ArrayList<InstanceStatus>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCloudMonitorAgentStatusesResponse.InstanceStatusList.Length"); i++) {
			InstanceStatus instanceStatus = new InstanceStatus();
			instanceStatus.setStatus(_ctx.stringValue("DescribeCloudMonitorAgentStatusesResponse.InstanceStatusList["+ i +"].Status"));
			instanceStatus.setInstanceId(_ctx.stringValue("DescribeCloudMonitorAgentStatusesResponse.InstanceStatusList["+ i +"].InstanceId"));
			instanceStatus.setAutoInstall(_ctx.booleanValue("DescribeCloudMonitorAgentStatusesResponse.InstanceStatusList["+ i +"].AutoInstall"));

			instanceStatusList.add(instanceStatus);
		}
		describeCloudMonitorAgentStatusesResponse.setInstanceStatusList(instanceStatusList);
	 
	 	return describeCloudMonitorAgentStatusesResponse;
	}
}