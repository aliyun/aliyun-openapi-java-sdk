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

	public static DescribeMonitoringAgentProcessesResponse unmarshall(DescribeMonitoringAgentProcessesResponse describeMonitoringAgentProcessesResponse, UnmarshallerContext _ctx) {
		
		describeMonitoringAgentProcessesResponse.setRequestId(_ctx.stringValue("DescribeMonitoringAgentProcessesResponse.RequestId"));
		describeMonitoringAgentProcessesResponse.setCode(_ctx.stringValue("DescribeMonitoringAgentProcessesResponse.Code"));
		describeMonitoringAgentProcessesResponse.setMessage(_ctx.stringValue("DescribeMonitoringAgentProcessesResponse.Message"));
		describeMonitoringAgentProcessesResponse.setSuccess(_ctx.booleanValue("DescribeMonitoringAgentProcessesResponse.Success"));

		List<NodeProcess> nodeProcesses = new ArrayList<NodeProcess>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMonitoringAgentProcessesResponse.NodeProcesses.Length"); i++) {
			NodeProcess nodeProcess = new NodeProcess();
			nodeProcess.setProcessId(_ctx.longValue("DescribeMonitoringAgentProcessesResponse.NodeProcesses["+ i +"].ProcessId"));
			nodeProcess.setInstanceId(_ctx.stringValue("DescribeMonitoringAgentProcessesResponse.NodeProcesses["+ i +"].InstanceId"));
			nodeProcess.setProcessName(_ctx.stringValue("DescribeMonitoringAgentProcessesResponse.NodeProcesses["+ i +"].ProcessName"));
			nodeProcess.setProcessUser(_ctx.stringValue("DescribeMonitoringAgentProcessesResponse.NodeProcesses["+ i +"].ProcessUser"));
			nodeProcess.setCommand(_ctx.stringValue("DescribeMonitoringAgentProcessesResponse.NodeProcesses["+ i +"].Command"));
			nodeProcess.setGroupId(_ctx.stringValue("DescribeMonitoringAgentProcessesResponse.NodeProcesses["+ i +"].GroupId"));

			nodeProcesses.add(nodeProcess);
		}
		describeMonitoringAgentProcessesResponse.setNodeProcesses(nodeProcesses);
	 
	 	return describeMonitoringAgentProcessesResponse;
	}
}