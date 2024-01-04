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

package com.aliyuncs.devops.transform.v20210625;

import com.aliyuncs.devops.model.v20210625.StartPipelineRunResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartPipelineRunResponseUnmarshaller {

	public static StartPipelineRunResponse unmarshall(StartPipelineRunResponse startPipelineRunResponse, UnmarshallerContext _ctx) {
		
		startPipelineRunResponse.setRequestId(_ctx.stringValue("StartPipelineRunResponse.requestId"));
		startPipelineRunResponse.setErrorMessage(_ctx.stringValue("StartPipelineRunResponse.errorMessage"));
		startPipelineRunResponse.setPipelineRunId(_ctx.longValue("StartPipelineRunResponse.pipelineRunId"));
		startPipelineRunResponse.setSuccess(_ctx.booleanValue("StartPipelineRunResponse.success"));
		startPipelineRunResponse.setErrorCode(_ctx.stringValue("StartPipelineRunResponse.errorCode"));
	 
	 	return startPipelineRunResponse;
	}
}