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

package com.aliyuncs.fnf.transform.v20190315;

import com.aliyuncs.fnf.model.v20190315.DescribeExecutionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeExecutionResponseUnmarshaller {

	public static DescribeExecutionResponse unmarshall(DescribeExecutionResponse describeExecutionResponse, UnmarshallerContext _ctx) {
		
		describeExecutionResponse.setRequestId(_ctx.stringValue("DescribeExecutionResponse.RequestId"));
		describeExecutionResponse.setStatus(_ctx.stringValue("DescribeExecutionResponse.Status"));
		describeExecutionResponse.setStoppedTime(_ctx.stringValue("DescribeExecutionResponse.StoppedTime"));
		describeExecutionResponse.setStartedTime(_ctx.stringValue("DescribeExecutionResponse.StartedTime"));
		describeExecutionResponse.setFlowDefinition(_ctx.stringValue("DescribeExecutionResponse.FlowDefinition"));
		describeExecutionResponse.setExternalInputUri(_ctx.stringValue("DescribeExecutionResponse.ExternalInputUri"));
		describeExecutionResponse.setOutput(_ctx.stringValue("DescribeExecutionResponse.Output"));
		describeExecutionResponse.setFlowName(_ctx.stringValue("DescribeExecutionResponse.FlowName"));
		describeExecutionResponse.setExternalOutputUri(_ctx.stringValue("DescribeExecutionResponse.ExternalOutputUri"));
		describeExecutionResponse.setName(_ctx.stringValue("DescribeExecutionResponse.Name"));
		describeExecutionResponse.setInput(_ctx.stringValue("DescribeExecutionResponse.Input"));
	 
	 	return describeExecutionResponse;
	}
}