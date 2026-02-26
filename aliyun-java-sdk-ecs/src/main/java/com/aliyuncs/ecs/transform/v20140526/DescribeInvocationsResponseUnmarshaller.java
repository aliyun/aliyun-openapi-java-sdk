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
import com.aliyuncs.ecs.model.v20140526.DescribeInvocationsResponse.Invocation.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInvocationsResponseUnmarshaller {

	public static DescribeInvocationsResponse unmarshall(DescribeInvocationsResponse describeInvocationsResponse, UnmarshallerContext _ctx) {
		
		describeInvocationsResponse.setRequestId(_ctx.stringValue("DescribeInvocationsResponse.RequestId"));
		describeInvocationsResponse.setPageSize(_ctx.longValue("DescribeInvocationsResponse.PageSize"));
		describeInvocationsResponse.setPageNumber(_ctx.longValue("DescribeInvocationsResponse.PageNumber"));
		describeInvocationsResponse.setTotalCount(_ctx.longValue("DescribeInvocationsResponse.TotalCount"));
		describeInvocationsResponse.setNextToken(_ctx.stringValue("DescribeInvocationsResponse.NextToken"));

		List<Invocation> invocations = new ArrayList<Invocation>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInvocationsResponse.Invocations.Length"); i++) {
			Invocation invocation = new Invocation();
			invocation.setOssOutputDelivery(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].OssOutputDelivery"));
			invocation.setInvocationStatus(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvocationStatus"));
			invocation.setParameters(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].Parameters"));
			invocation.setTimed(_ctx.booleanValue("DescribeInvocationsResponse.Invocations["+ i +"].Timed"));
			invocation.setCommandDescription(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].CommandDescription"));
			invocation.setTimeout(_ctx.longValue("DescribeInvocationsResponse.Invocations["+ i +"].Timeout"));
			invocation.setCommandContent(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].CommandContent"));
			invocation.setWorkingDir(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].WorkingDir"));
			invocation.setRepeatMode(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].RepeatMode"));
			invocation.setInvokeStatus(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeStatus"));
			invocation.setCommandType(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].CommandType"));
			invocation.setUsername(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].Username"));
			invocation.setContainerId(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].ContainerId"));
			invocation.setContainerName(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].ContainerName"));
			invocation.setCreationTime(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].CreationTime"));
			invocation.setFrequency(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].Frequency"));
			invocation.setLauncher(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].Launcher"));
			invocation.setCommandId(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].CommandId"));
			invocation.setCommandName(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].CommandName"));
			invocation.setInvokeId(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeId"));
			invocation.setTerminationMode(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].TerminationMode"));

			List<InvokeInstance> invokeInstances = new ArrayList<InvokeInstance>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeInstances.Length"); j++) {
				InvokeInstance invokeInstance = new InvokeInstance();
				invokeInstance.setDropped(_ctx.integerValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].Dropped"));
				invokeInstance.setInvocationStatus(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].InvocationStatus"));
				invokeInstance.setInstanceId(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].InstanceId"));
				invokeInstance.setTimed(_ctx.booleanValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].Timed"));
				invokeInstance.setInstanceInvokeStatus(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].InstanceInvokeStatus"));
				invokeInstance.setExitCode(_ctx.longValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].ExitCode"));
				invokeInstance.setErrorInfo(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].ErrorInfo"));
				invokeInstance.setStartTime(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].StartTime"));
				invokeInstance.setRepeats(_ctx.integerValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].Repeats"));
				invokeInstance.setOssOutputUri(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].OssOutputUri"));
				invokeInstance.setOssOutputStatus(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].OssOutputStatus"));
				invokeInstance.setFinishTime(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].FinishTime"));
				invokeInstance.setOutput(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].Output"));
				invokeInstance.setCreationTime(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].CreationTime"));
				invokeInstance.setUpdateTime(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].UpdateTime"));
				invokeInstance.setErrorCode(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].ErrorCode"));
				invokeInstance.setStopTime(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].StopTime"));

				invokeInstances.add(invokeInstance);
			}
			invocation.setInvokeInstances(invokeInstances);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInvocationsResponse.Invocations["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			invocation.setTags(tags);

			invocations.add(invocation);
		}
		describeInvocationsResponse.setInvocations(invocations);
	 
	 	return describeInvocationsResponse;
	}
}