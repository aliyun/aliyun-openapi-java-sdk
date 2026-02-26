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

import com.aliyuncs.swas_open.model.v20200601.DescribeCommandInvocationsResponse;
import com.aliyuncs.swas_open.model.v20200601.DescribeCommandInvocationsResponse.Command;
import com.aliyuncs.swas_open.model.v20200601.DescribeCommandInvocationsResponse.Command.InvokeInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCommandInvocationsResponseUnmarshaller {

	public static DescribeCommandInvocationsResponse unmarshall(DescribeCommandInvocationsResponse describeCommandInvocationsResponse, UnmarshallerContext _ctx) {
		
		describeCommandInvocationsResponse.setRequestId(_ctx.stringValue("DescribeCommandInvocationsResponse.RequestId"));
		describeCommandInvocationsResponse.setTotalCount(_ctx.integerValue("DescribeCommandInvocationsResponse.TotalCount"));
		describeCommandInvocationsResponse.setPageNumber(_ctx.integerValue("DescribeCommandInvocationsResponse.PageNumber"));
		describeCommandInvocationsResponse.setPageSize(_ctx.integerValue("DescribeCommandInvocationsResponse.PageSize"));

		List<Command> commandInvocations = new ArrayList<Command>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCommandInvocationsResponse.CommandInvocations.Length"); i++) {
			Command command = new Command();
			command.setInvokeId(_ctx.stringValue("DescribeCommandInvocationsResponse.CommandInvocations["+ i +"].InvokeId"));
			command.setCreationTime(_ctx.stringValue("DescribeCommandInvocationsResponse.CommandInvocations["+ i +"].CreationTime"));
			command.setCommandId(_ctx.stringValue("DescribeCommandInvocationsResponse.CommandInvocations["+ i +"].CommandId"));
			command.setInvocationStatus(_ctx.stringValue("DescribeCommandInvocationsResponse.CommandInvocations["+ i +"].InvocationStatus"));
			command.setCommandName(_ctx.stringValue("DescribeCommandInvocationsResponse.CommandInvocations["+ i +"].CommandName"));
			command.setCommandType(_ctx.stringValue("DescribeCommandInvocationsResponse.CommandInvocations["+ i +"].CommandType"));
			command.setCommandDescription(_ctx.stringValue("DescribeCommandInvocationsResponse.CommandInvocations["+ i +"].CommandDescription"));
			command.setUsername(_ctx.stringValue("DescribeCommandInvocationsResponse.CommandInvocations["+ i +"].Username"));
			command.setWorkingDir(_ctx.stringValue("DescribeCommandInvocationsResponse.CommandInvocations["+ i +"].WorkingDir"));
			command.setTimeout(_ctx.longValue("DescribeCommandInvocationsResponse.CommandInvocations["+ i +"].Timeout"));
			command.setCommandContent(_ctx.stringValue("DescribeCommandInvocationsResponse.CommandInvocations["+ i +"].CommandContent"));
			command.setParameters(_ctx.stringValue("DescribeCommandInvocationsResponse.CommandInvocations["+ i +"].Parameters"));

			List<InvokeInstance> invokeInstances = new ArrayList<InvokeInstance>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCommandInvocationsResponse.CommandInvocations["+ i +"].InvokeInstances.Length"); j++) {
				InvokeInstance invokeInstance = new InvokeInstance();
				invokeInstance.setInstanceId(_ctx.stringValue("DescribeCommandInvocationsResponse.CommandInvocations["+ i +"].InvokeInstances["+ j +"].InstanceId"));
				invokeInstance.setStartTime(_ctx.stringValue("DescribeCommandInvocationsResponse.CommandInvocations["+ i +"].InvokeInstances["+ j +"].StartTime"));
				invokeInstance.setFinishTime(_ctx.stringValue("DescribeCommandInvocationsResponse.CommandInvocations["+ i +"].InvokeInstances["+ j +"].FinishTime"));
				invokeInstance.setInvocationStatus(_ctx.stringValue("DescribeCommandInvocationsResponse.CommandInvocations["+ i +"].InvokeInstances["+ j +"].InvocationStatus"));
				invokeInstance.setOutput(_ctx.stringValue("DescribeCommandInvocationsResponse.CommandInvocations["+ i +"].InvokeInstances["+ j +"].Output"));
				invokeInstance.setExitCode(_ctx.longValue("DescribeCommandInvocationsResponse.CommandInvocations["+ i +"].InvokeInstances["+ j +"].ExitCode"));
				invokeInstance.setErrorInfo(_ctx.stringValue("DescribeCommandInvocationsResponse.CommandInvocations["+ i +"].InvokeInstances["+ j +"].ErrorInfo"));
				invokeInstance.setErrorCode(_ctx.stringValue("DescribeCommandInvocationsResponse.CommandInvocations["+ i +"].InvokeInstances["+ j +"].ErrorCode"));

				invokeInstances.add(invokeInstance);
			}
			command.setInvokeInstances(invokeInstances);

			commandInvocations.add(command);
		}
		describeCommandInvocationsResponse.setCommandInvocations(commandInvocations);
	 
	 	return describeCommandInvocationsResponse;
	}
}