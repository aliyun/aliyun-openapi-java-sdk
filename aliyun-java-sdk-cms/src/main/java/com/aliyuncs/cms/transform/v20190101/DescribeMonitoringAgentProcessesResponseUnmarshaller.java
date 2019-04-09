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

import com.aliyuncs.cms.model.v20190101.DescribeMonitoringAgentProcessesResponse;
import com.aliyuncs.cms.model.v20190101.DescribeMonitoringAgentProcessesResponse.NodeProcess;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMonitoringAgentProcessesResponseUnmarshaller {

	public static DescribeMonitoringAgentProcessesResponse unmarshall(DescribeMonitoringAgentProcessesResponse describeMonitoringAgentProcessesResponse, UnmarshallerContext context) {
		
		describeMonitoringAgentProcessesResponse.setRequestId(context.stringValue("DescribeMonitoringAgentProcessesResponse.RequestId"));
		describeMonitoringAgentProcessesResponse.setCode(context.stringValue("DescribeMonitoringAgentProcessesResponse.Code"));
		describeMonitoringAgentProcessesResponse.setMessage(context.stringValue("DescribeMonitoringAgentProcessesResponse.Message"));
		describeMonitoringAgentProcessesResponse.setSuccess(context.booleanValue("DescribeMonitoringAgentProcessesResponse.Success"));

		List<NodeProcess> nodeProcesses = new ArrayList<NodeProcess>();
		for (int i = 0; i < context.lengthValue("DescribeMonitoringAgentProcessesResponse.NodeProcesses.Length"); i++) {
			NodeProcess nodeProcess = new NodeProcess();
			nodeProcess.setProcessId(context.longValue("DescribeMonitoringAgentProcessesResponse.NodeProcesses["+ i +"].ProcessId"));
			nodeProcess.setInstanceId(context.stringValue("DescribeMonitoringAgentProcessesResponse.NodeProcesses["+ i +"].InstanceId"));
			nodeProcess.setProcessName(context.stringValue("DescribeMonitoringAgentProcessesResponse.NodeProcesses["+ i +"].ProcessName"));
			nodeProcess.setProcessUser(context.stringValue("DescribeMonitoringAgentProcessesResponse.NodeProcesses["+ i +"].ProcessUser"));
			nodeProcess.setCommand(context.stringValue("DescribeMonitoringAgentProcessesResponse.NodeProcesses["+ i +"].Command"));

			nodeProcesses.add(nodeProcess);
		}
		describeMonitoringAgentProcessesResponse.setNodeProcesses(nodeProcesses);
	 
	 	return describeMonitoringAgentProcessesResponse;
	}
}