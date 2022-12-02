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

package com.aliyuncs.airec.transform.v20201126;

import com.aliyuncs.airec.model.v20201126.CreateFlowControlTaskResponse;
import com.aliyuncs.airec.model.v20201126.CreateFlowControlTaskResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateFlowControlTaskResponseUnmarshaller {

	public static CreateFlowControlTaskResponse unmarshall(CreateFlowControlTaskResponse createFlowControlTaskResponse, UnmarshallerContext _ctx) {
		
		createFlowControlTaskResponse.setCode(_ctx.stringValue("CreateFlowControlTaskResponse.code"));
		createFlowControlTaskResponse.setRequestId(_ctx.stringValue("CreateFlowControlTaskResponse.requestId"));
		createFlowControlTaskResponse.setMessage(_ctx.stringValue("CreateFlowControlTaskResponse.message"));

		Result result = new Result();
		result.setTaskId(_ctx.stringValue("CreateFlowControlTaskResponse.result.taskId"));
		result.setGmtModified(_ctx.stringValue("CreateFlowControlTaskResponse.result.gmtModified"));
		result.setStatus(_ctx.stringValue("CreateFlowControlTaskResponse.result.status"));
		result.setGmtCreate(_ctx.stringValue("CreateFlowControlTaskResponse.result.gmtCreate"));
		createFlowControlTaskResponse.setResult(result);
	 
	 	return createFlowControlTaskResponse;
	}
}