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

import com.aliyuncs.ecs.model.v20140526.DescribeInvocationResultsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeInvocationResultsResponse.Invocation;
import com.aliyuncs.ecs.model.v20140526.DescribeInvocationResultsResponse.Invocation.InvocationResult;
import com.aliyuncs.ecs.model.v20140526.DescribeInvocationResultsResponse.Invocation.InvocationResult.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInvocationResultsResponseUnmarshaller {

	public static DescribeInvocationResultsResponse unmarshall(DescribeInvocationResultsResponse describeInvocationResultsResponse, UnmarshallerContext _ctx) {
		
		describeInvocationResultsResponse.setRequestId(_ctx.stringValue("DescribeInvocationResultsResponse.RequestId"));

		Invocation invocation = new Invocation();
		invocation.setPageSize(_ctx.longValue("DescribeInvocationResultsResponse.Invocation.PageSize"));
		invocation.setPageNumber(_ctx.longValue("DescribeInvocationResultsResponse.Invocation.PageNumber"));
		invocation.setTotalCount(_ctx.longValue("DescribeInvocationResultsResponse.Invocation.TotalCount"));
		invocation.setNextToken(_ctx.stringValue("DescribeInvocationResultsResponse.Invocation.NextToken"));

		List<InvocationResult> invocationResults = new ArrayList<InvocationResult>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInvocationResultsResponse.Invocation.InvocationResults.Length"); i++) {
			InvocationResult invocationResult = new InvocationResult();
			invocationResult.setInvocationStatus(_ctx.stringValue("DescribeInvocationResultsResponse.Invocation.InvocationResults["+ i +"].InvocationStatus"));
			invocationResult.setRepeats(_ctx.integerValue("DescribeInvocationResultsResponse.Invocation.InvocationResults["+ i +"].Repeats"));
			invocationResult.setCommandId(_ctx.stringValue("DescribeInvocationResultsResponse.Invocation.InvocationResults["+ i +"].CommandId"));
			invocationResult.setInstanceId(_ctx.stringValue("DescribeInvocationResultsResponse.Invocation.InvocationResults["+ i +"].InstanceId"));
			invocationResult.setOutput(_ctx.stringValue("DescribeInvocationResultsResponse.Invocation.InvocationResults["+ i +"].Output"));
			invocationResult.setDropped(_ctx.integerValue("DescribeInvocationResultsResponse.Invocation.InvocationResults["+ i +"].Dropped"));
			invocationResult.setStopTime(_ctx.stringValue("DescribeInvocationResultsResponse.Invocation.InvocationResults["+ i +"].StopTime"));
			invocationResult.setExitCode(_ctx.longValue("DescribeInvocationResultsResponse.Invocation.InvocationResults["+ i +"].ExitCode"));
			invocationResult.setStartTime(_ctx.stringValue("DescribeInvocationResultsResponse.Invocation.InvocationResults["+ i +"].StartTime"));
			invocationResult.setErrorInfo(_ctx.stringValue("DescribeInvocationResultsResponse.Invocation.InvocationResults["+ i +"].ErrorInfo"));
			invocationResult.setErrorCode(_ctx.stringValue("DescribeInvocationResultsResponse.Invocation.InvocationResults["+ i +"].ErrorCode"));
			invocationResult.setFinishedTime(_ctx.stringValue("DescribeInvocationResultsResponse.Invocation.InvocationResults["+ i +"].FinishedTime"));
			invocationResult.setInvokeId(_ctx.stringValue("DescribeInvocationResultsResponse.Invocation.InvocationResults["+ i +"].InvokeId"));
			invocationResult.setInvokeRecordStatus(_ctx.stringValue("DescribeInvocationResultsResponse.Invocation.InvocationResults["+ i +"].InvokeRecordStatus"));
			invocationResult.setUsername(_ctx.stringValue("DescribeInvocationResultsResponse.Invocation.InvocationResults["+ i +"].Username"));
			invocationResult.setContainerId(_ctx.stringValue("DescribeInvocationResultsResponse.Invocation.InvocationResults["+ i +"].ContainerId"));
			invocationResult.setContainerName(_ctx.stringValue("DescribeInvocationResultsResponse.Invocation.InvocationResults["+ i +"].ContainerName"));
			invocationResult.setTerminationMode(_ctx.stringValue("DescribeInvocationResultsResponse.Invocation.InvocationResults["+ i +"].TerminationMode"));
			invocationResult.setLauncher(_ctx.stringValue("DescribeInvocationResultsResponse.Invocation.InvocationResults["+ i +"].Launcher"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInvocationResultsResponse.Invocation.InvocationResults["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("DescribeInvocationResultsResponse.Invocation.InvocationResults["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("DescribeInvocationResultsResponse.Invocation.InvocationResults["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			invocationResult.setTags(tags);

			invocationResults.add(invocationResult);
		}
		invocation.setInvocationResults(invocationResults);
		describeInvocationResultsResponse.setInvocation(invocation);
	 
	 	return describeInvocationResultsResponse;
	}
}