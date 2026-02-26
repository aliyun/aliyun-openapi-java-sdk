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

import com.aliyuncs.swas_open.model.v20200601.DescribeInvocationResultResponse;
import com.aliyuncs.swas_open.model.v20200601.DescribeInvocationResultResponse.InvocationResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInvocationResultResponseUnmarshaller {

	public static DescribeInvocationResultResponse unmarshall(DescribeInvocationResultResponse describeInvocationResultResponse, UnmarshallerContext _ctx) {
		
		describeInvocationResultResponse.setRequestId(_ctx.stringValue("DescribeInvocationResultResponse.RequestId"));

		InvocationResult invocationResult = new InvocationResult();
		invocationResult.setStartTime(_ctx.stringValue("DescribeInvocationResultResponse.InvocationResult.StartTime"));
		invocationResult.setFinishedTime(_ctx.stringValue("DescribeInvocationResultResponse.InvocationResult.FinishedTime"));
		invocationResult.setInvocationStatus(_ctx.stringValue("DescribeInvocationResultResponse.InvocationResult.InvocationStatus"));
		invocationResult.setExitCode(_ctx.longValue("DescribeInvocationResultResponse.InvocationResult.ExitCode"));
		invocationResult.setErrorInfo(_ctx.stringValue("DescribeInvocationResultResponse.InvocationResult.ErrorInfo"));
		invocationResult.setErrorCode(_ctx.stringValue("DescribeInvocationResultResponse.InvocationResult.ErrorCode"));
		invocationResult.setInvokeId(_ctx.stringValue("DescribeInvocationResultResponse.InvocationResult.InvokeId"));
		invocationResult.setInvokeRecordStatus(_ctx.stringValue("DescribeInvocationResultResponse.InvocationResult.InvokeRecordStatus"));
		invocationResult.setInvokeUser(_ctx.stringValue("DescribeInvocationResultResponse.InvocationResult.InvokeUser"));
		invocationResult.setOutput(_ctx.stringValue("DescribeInvocationResultResponse.InvocationResult.Output"));
		invocationResult.setInstanceId(_ctx.stringValue("DescribeInvocationResultResponse.InvocationResult.InstanceId"));
		describeInvocationResultResponse.setInvocationResult(invocationResult);
	 
	 	return describeInvocationResultResponse;
	}
}