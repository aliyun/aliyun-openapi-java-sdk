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

package com.aliyuncs.schedulerx3.transform.v20240624;

import com.aliyuncs.schedulerx3.model.v20240624.OperateStopJobExecutionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OperateStopJobExecutionResponseUnmarshaller {

	public static OperateStopJobExecutionResponse unmarshall(OperateStopJobExecutionResponse operateStopJobExecutionResponse, UnmarshallerContext _ctx) {
		
		operateStopJobExecutionResponse.setRequestId(_ctx.stringValue("OperateStopJobExecutionResponse.RequestId"));
		operateStopJobExecutionResponse.setCode(_ctx.integerValue("OperateStopJobExecutionResponse.Code"));
		operateStopJobExecutionResponse.setMessage(_ctx.stringValue("OperateStopJobExecutionResponse.Message"));
		operateStopJobExecutionResponse.setSuccess(_ctx.booleanValue("OperateStopJobExecutionResponse.Success"));
	 
	 	return operateStopJobExecutionResponse;
	}
}