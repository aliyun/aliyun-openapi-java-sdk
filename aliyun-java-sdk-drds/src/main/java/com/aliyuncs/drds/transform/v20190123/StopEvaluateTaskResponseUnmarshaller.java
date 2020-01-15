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

package com.aliyuncs.drds.transform.v20190123;

import com.aliyuncs.drds.model.v20190123.StopEvaluateTaskResponse;
import com.aliyuncs.drds.model.v20190123.StopEvaluateTaskResponse.TaskManageResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class StopEvaluateTaskResponseUnmarshaller {

	public static StopEvaluateTaskResponse unmarshall(StopEvaluateTaskResponse stopEvaluateTaskResponse, UnmarshallerContext _ctx) {
		
		stopEvaluateTaskResponse.setRequestId(_ctx.stringValue("StopEvaluateTaskResponse.RequestId"));
		stopEvaluateTaskResponse.setSuccess(_ctx.booleanValue("StopEvaluateTaskResponse.Success"));

		TaskManageResult taskManageResult = new TaskManageResult();
		taskManageResult.setSuccess(_ctx.booleanValue("StopEvaluateTaskResponse.TaskManageResult.Success"));
		taskManageResult.setMessage(_ctx.stringValue("StopEvaluateTaskResponse.TaskManageResult.Message"));
		stopEvaluateTaskResponse.setTaskManageResult(taskManageResult);
	 
	 	return stopEvaluateTaskResponse;
	}
}