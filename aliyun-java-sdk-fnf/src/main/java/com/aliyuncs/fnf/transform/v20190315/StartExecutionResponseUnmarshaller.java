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

import com.aliyuncs.fnf.model.v20190315.StartExecutionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartExecutionResponseUnmarshaller {

	public static StartExecutionResponse unmarshall(StartExecutionResponse startExecutionResponse, UnmarshallerContext _ctx) {
		
		startExecutionResponse.setRequestId(_ctx.stringValue("StartExecutionResponse.RequestId"));
		startExecutionResponse.setName(_ctx.stringValue("StartExecutionResponse.Name"));
		startExecutionResponse.setFlowName(_ctx.stringValue("StartExecutionResponse.FlowName"));
		startExecutionResponse.setFlowDefinition(_ctx.stringValue("StartExecutionResponse.FlowDefinition"));
		startExecutionResponse.setInput(_ctx.stringValue("StartExecutionResponse.Input"));
		startExecutionResponse.setOutput(_ctx.stringValue("StartExecutionResponse.Output"));
		startExecutionResponse.setStatus(_ctx.stringValue("StartExecutionResponse.Status"));
		startExecutionResponse.setStartedTime(_ctx.stringValue("StartExecutionResponse.StartedTime"));
		startExecutionResponse.setStoppedTime(_ctx.stringValue("StartExecutionResponse.StoppedTime"));
	 
	 	return startExecutionResponse;
	}
}