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

import com.aliyuncs.fnf.model.v20190315.StopExecutionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StopExecutionResponseUnmarshaller {

	public static StopExecutionResponse unmarshall(StopExecutionResponse stopExecutionResponse, UnmarshallerContext _ctx) {
		
		stopExecutionResponse.setRequestId(_ctx.stringValue("StopExecutionResponse.RequestId"));
		stopExecutionResponse.setName(_ctx.stringValue("StopExecutionResponse.Name"));
		stopExecutionResponse.setFlowName(_ctx.stringValue("StopExecutionResponse.FlowName"));
		stopExecutionResponse.setFlowDefinition(_ctx.stringValue("StopExecutionResponse.FlowDefinition"));
		stopExecutionResponse.setInput(_ctx.stringValue("StopExecutionResponse.Input"));
		stopExecutionResponse.setOutput(_ctx.stringValue("StopExecutionResponse.Output"));
		stopExecutionResponse.setStatus(_ctx.stringValue("StopExecutionResponse.Status"));
		stopExecutionResponse.setStartedTime(_ctx.stringValue("StopExecutionResponse.StartedTime"));
		stopExecutionResponse.setStoppedTime(_ctx.stringValue("StopExecutionResponse.StoppedTime"));
		stopExecutionResponse.setExternalInputUri(_ctx.stringValue("StopExecutionResponse.ExternalInputUri"));
		stopExecutionResponse.setExternalOutputUri(_ctx.stringValue("StopExecutionResponse.ExternalOutputUri"));
	 
	 	return stopExecutionResponse;
	}
}