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

import com.aliyuncs.cms.model.v20190101.DescribeMonitoringAgentStatusesResponse;
import com.aliyuncs.cms.model.v20190101.DescribeMonitoringAgentStatusesResponse.NodeStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMonitoringAgentStatusesResponseUnmarshaller {

	public static DescribeMonitoringAgentStatusesResponse unmarshall(DescribeMonitoringAgentStatusesResponse describeMonitoringAgentStatusesResponse, UnmarshallerContext context) {
		
		describeMonitoringAgentStatusesResponse.setRequestId(context.stringValue("DescribeMonitoringAgentStatusesResponse.RequestId"));
		describeMonitoringAgentStatusesResponse.setCode(context.stringValue("DescribeMonitoringAgentStatusesResponse.Code"));
		describeMonitoringAgentStatusesResponse.setMessage(context.stringValue("DescribeMonitoringAgentStatusesResponse.Message"));
		describeMonitoringAgentStatusesResponse.setSuccess(context.booleanValue("DescribeMonitoringAgentStatusesResponse.Success"));

		List<NodeStatus> nodeStatusList = new ArrayList<NodeStatus>();
		for (int i = 0; i < context.lengthValue("DescribeMonitoringAgentStatusesResponse.NodeStatusList.Length"); i++) {
			NodeStatus nodeStatus = new NodeStatus();
			nodeStatus.setInstanceId(context.stringValue("DescribeMonitoringAgentStatusesResponse.NodeStatusList["+ i +"].InstanceId"));
			nodeStatus.setAutoInstall(context.booleanValue("DescribeMonitoringAgentStatusesResponse.NodeStatusList["+ i +"].AutoInstall"));
			nodeStatus.setStatus(context.stringValue("DescribeMonitoringAgentStatusesResponse.NodeStatusList["+ i +"].Status"));

			nodeStatusList.add(nodeStatus);
		}
		describeMonitoringAgentStatusesResponse.setNodeStatusList(nodeStatusList);
	 
	 	return describeMonitoringAgentStatusesResponse;
	}
}