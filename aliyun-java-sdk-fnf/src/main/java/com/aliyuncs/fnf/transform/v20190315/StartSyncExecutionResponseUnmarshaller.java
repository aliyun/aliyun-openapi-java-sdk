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

import com.aliyuncs.fnf.model.v20190315.StartSyncExecutionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartSyncExecutionResponseUnmarshaller {

	public static StartSyncExecutionResponse unmarshall(StartSyncExecutionResponse startSyncExecutionResponse, UnmarshallerContext _ctx) {
		
		startSyncExecutionResponse.setRequestId(_ctx.stringValue("StartSyncExecutionResponse.RequestId"));
		startSyncExecutionResponse.setFlowName(_ctx.stringValue("StartSyncExecutionResponse.FlowName"));
		startSyncExecutionResponse.setName(_ctx.stringValue("StartSyncExecutionResponse.Name"));
		startSyncExecutionResponse.setStatus(_ctx.stringValue("StartSyncExecutionResponse.Status"));
		startSyncExecutionResponse.setErrorCode(_ctx.stringValue("StartSyncExecutionResponse.ErrorCode"));
		startSyncExecutionResponse.setErrorMessage(_ctx.stringValue("StartSyncExecutionResponse.ErrorMessage"));
		startSyncExecutionResponse.setOutput(_ctx.stringValue("StartSyncExecutionResponse.Output"));
		startSyncExecutionResponse.setStartedTime(_ctx.stringValue("StartSyncExecutionResponse.StartedTime"));
		startSyncExecutionResponse.setStoppedTime(_ctx.stringValue("StartSyncExecutionResponse.StoppedTime"));
	 
	 	return startSyncExecutionResponse;
	}
}