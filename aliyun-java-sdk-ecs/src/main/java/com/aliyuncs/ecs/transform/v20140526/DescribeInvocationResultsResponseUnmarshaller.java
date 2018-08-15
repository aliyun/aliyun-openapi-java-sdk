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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInvocationResultsResponseUnmarshaller {

	public static DescribeInvocationResultsResponse unmarshall(DescribeInvocationResultsResponse describeInvocationResultsResponse, UnmarshallerContext context) {
		
		describeInvocationResultsResponse.setRequestId(context.stringValue("DescribeInvocationResultsResponse.RequestId"));

		Invocation invocation = new Invocation();
		invocation.setPageSize(context.longValue("DescribeInvocationResultsResponse.Invocation.PageSize"));
		invocation.setPageNumber(context.longValue("DescribeInvocationResultsResponse.Invocation.PageNumber"));
		invocation.setTotalCount(context.longValue("DescribeInvocationResultsResponse.Invocation.TotalCount"));

		List<InvocationResult> invocationResults = new ArrayList<InvocationResult>();
		for (int i = 0; i < context.lengthValue("DescribeInvocationResultsResponse.Invocation.InvocationResults.Length"); i++) {
			InvocationResult invocationResult = new InvocationResult();
			invocationResult.setCommandId(context.stringValue("DescribeInvocationResultsResponse.Invocation.InvocationResults["+ i +"].CommandId"));
			invocationResult.setInvokeId(context.stringValue("DescribeInvocationResultsResponse.Invocation.InvocationResults["+ i +"].InvokeId"));
			invocationResult.setInstanceId(context.stringValue("DescribeInvocationResultsResponse.Invocation.InvocationResults["+ i +"].InstanceId"));
			invocationResult.setFinishedTime(context.stringValue("DescribeInvocationResultsResponse.Invocation.InvocationResults["+ i +"].FinishedTime"));
			invocationResult.setOutput(context.stringValue("DescribeInvocationResultsResponse.Invocation.InvocationResults["+ i +"].Output"));
			invocationResult.setInvokeRecordStatus(context.stringValue("DescribeInvocationResultsResponse.Invocation.InvocationResults["+ i +"].InvokeRecordStatus"));
			invocationResult.setExitCode(context.longValue("DescribeInvocationResultsResponse.Invocation.InvocationResults["+ i +"].ExitCode"));

			invocationResults.add(invocationResult);
		}
		invocation.setInvocationResults(invocationResults);
		describeInvocationResultsResponse.setInvocation(invocation);
	 
	 	return describeInvocationResultsResponse;
	}
}