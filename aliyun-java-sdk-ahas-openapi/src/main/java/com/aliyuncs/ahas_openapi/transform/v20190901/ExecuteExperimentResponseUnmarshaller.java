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

package com.aliyuncs.ahas_openapi.transform.v20190901;

import com.aliyuncs.ahas_openapi.model.v20190901.ExecuteExperimentResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecuteExperimentResponseUnmarshaller {

	public static ExecuteExperimentResponse unmarshall(ExecuteExperimentResponse executeExperimentResponse, UnmarshallerContext _ctx) {
		
		executeExperimentResponse.setRequestId(_ctx.stringValue("ExecuteExperimentResponse.RequestId"));
		executeExperimentResponse.setCode(_ctx.stringValue("ExecuteExperimentResponse.Code"));
		executeExperimentResponse.setMessage(_ctx.stringValue("ExecuteExperimentResponse.Message"));
		executeExperimentResponse.setSuccess(_ctx.booleanValue("ExecuteExperimentResponse.Success"));
		executeExperimentResponse.setTaskId(_ctx.stringValue("ExecuteExperimentResponse.TaskId"));
	 
	 	return executeExperimentResponse;
	}
}