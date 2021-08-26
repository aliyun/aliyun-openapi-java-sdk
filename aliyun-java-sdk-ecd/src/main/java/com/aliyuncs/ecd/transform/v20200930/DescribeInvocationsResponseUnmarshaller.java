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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.DescribeInvocationsResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeInvocationsResponse.Invocation;
import com.aliyuncs.ecd.model.v20200930.DescribeInvocationsResponse.Invocation.InvokeDesktop;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInvocationsResponseUnmarshaller {

	public static DescribeInvocationsResponse unmarshall(DescribeInvocationsResponse describeInvocationsResponse, UnmarshallerContext _ctx) {
		
		describeInvocationsResponse.setRequestId(_ctx.stringValue("DescribeInvocationsResponse.RequestId"));
		describeInvocationsResponse.setNextToken(_ctx.stringValue("DescribeInvocationsResponse.NextToken"));

		List<Invocation> invocations = new ArrayList<Invocation>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInvocationsResponse.Invocations.Length"); i++) {
			Invocation invocation = new Invocation();
			invocation.setCreationTime(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].CreationTime"));
			invocation.setInvocationStatus(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvocationStatus"));
			invocation.setInvokeId(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeId"));
			invocation.setCommandType(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].CommandType"));
			invocation.setCommandContent(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].CommandContent"));

			List<InvokeDesktop> invokeDesktops = new ArrayList<InvokeDesktop>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeDesktops.Length"); j++) {
				InvokeDesktop invokeDesktop = new InvokeDesktop();
				invokeDesktop.setCreationTime(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeDesktops["+ j +"].CreationTime"));
				invokeDesktop.setInvocationStatus(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeDesktops["+ j +"].InvocationStatus"));
				invokeDesktop.setFinishTime(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeDesktops["+ j +"].FinishTime"));
				invokeDesktop.setUpdateTime(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeDesktops["+ j +"].UpdateTime"));
				invokeDesktop.setRepeats(_ctx.integerValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeDesktops["+ j +"].Repeats"));
				invokeDesktop.setDesktopId(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeDesktops["+ j +"].DesktopId"));
				invokeDesktop.setOutput(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeDesktops["+ j +"].Output"));
				invokeDesktop.setDropped(_ctx.integerValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeDesktops["+ j +"].Dropped"));
				invokeDesktop.setStopTime(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeDesktops["+ j +"].StopTime"));
				invokeDesktop.setExitCode(_ctx.longValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeDesktops["+ j +"].ExitCode"));
				invokeDesktop.setStartTime(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeDesktops["+ j +"].StartTime"));
				invokeDesktop.setErrorInfo(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeDesktops["+ j +"].ErrorInfo"));
				invokeDesktop.setErrorCode(_ctx.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeDesktops["+ j +"].ErrorCode"));

				invokeDesktops.add(invokeDesktop);
			}
			invocation.setInvokeDesktops(invokeDesktops);

			invocations.add(invocation);
		}
		describeInvocationsResponse.setInvocations(invocations);
	 
	 	return describeInvocationsResponse;
	}
}