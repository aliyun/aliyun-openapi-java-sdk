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

import com.aliyuncs.ecs.model.v20140526.DescribeInvocationsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeInvocationsResponse.Invocation;
import com.aliyuncs.ecs.model.v20140526.DescribeInvocationsResponse.Invocation.InvokeInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInvocationsResponseUnmarshaller {

	public static DescribeInvocationsResponse unmarshall(DescribeInvocationsResponse describeInvocationsResponse, UnmarshallerContext _ctx) {
		
		describeInvocationsResponse.setRequestId(_ctx.stringValue("DescribeInvocationsResponse.RequestId"));
		describeInvocationsResponse.setTotalCount(_ctx.longValue("DescribeInvocationsResponse.TotalCount"));
		describeInvocationsResponse.setPageNumber(_ctx.longValue("DescribeInvocationsResponse.PageNumber"));
		describeInvocationsResponse.setPageSize(_ctx.longValue("DescribeInvocationsResponse.PageSize"));

		List<Invocation> invocations = new ArrayList<Invocation>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInvocationsResponse.Invocations.Length"); i++) {
			Invocation invocation = new Invocation();
			invocation.setInvokeId(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeId"));
			invocation.setCreationTime(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].CreationTime"));
			invocation.setCommandId(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].CommandId"));
			invocation.setCommandType(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].CommandType"));
			invocation.setCommandName(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].CommandName"));
			invocation.setCommandContent(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].CommandContent"));
			invocation.setFrequency(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].Frequency"));
			invocation.setTimed(_ctx.booleanValue("DescribeInvocationsResponse.Invocations["+ i +"].Timed"));
			invocation.setRepeatMode(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].RepeatMode"));
			invocation.setInvokeStatus(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeStatus"));
			invocation.setInvocationStatus(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvocationStatus"));
			invocation.setParameters(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].Parameters"));
			invocation.setUsername(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].Username"));

			List<InvokeInstance> invokeInstances = new ArrayList<InvokeInstance>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeInstances.Length"); j++) {
				InvokeInstance invokeInstance = new InvokeInstance();
				invokeInstance.setInstanceId(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].InstanceId"));
				invokeInstance.setRepeats(_ctx.integerValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].Repeats"));
				invokeInstance.setTimed(_ctx.booleanValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].Timed"));
				invokeInstance.setInstanceInvokeStatus(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].InstanceInvokeStatus"));
				invokeInstance.setInvocationStatus(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].InvocationStatus"));
				invokeInstance.setOutput(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].Output"));
				invokeInstance.setExitCode(_ctx.longValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].ExitCode"));
				invokeInstance.setDropped(_ctx.integerValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].Dropped"));
				invokeInstance.setErrorCode(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].ErrorCode"));
				invokeInstance.setErrorInfo(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].ErrorInfo"));
				invokeInstance.setCreationTime(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].CreationTime"));
				invokeInstance.setStartTime(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].StartTime"));
				invokeInstance.setStopTime(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].StopTime"));
				invokeInstance.setFinishTime(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].FinishTime"));
				invokeInstance.setUpdateTime(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].UpdateTime"));

				invokeInstances.add(invokeInstance);
			}
			invocation.setInvokeInstances(invokeInstances);

			invocations.add(invocation);
		}
		describeInvocationsResponse.setInvocations(invocations);
	 
	 	return describeInvocationsResponse;
	}
}