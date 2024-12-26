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

import com.aliyuncs.schedulerx3.model.v20240624.OperateRetryJobExecutionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OperateRetryJobExecutionResponseUnmarshaller {

	public static OperateRetryJobExecutionResponse unmarshall(OperateRetryJobExecutionResponse operateRetryJobExecutionResponse, UnmarshallerContext _ctx) {
		
		operateRetryJobExecutionResponse.setRequestId(_ctx.stringValue("OperateRetryJobExecutionResponse.RequestId"));
		operateRetryJobExecutionResponse.setCode(_ctx.integerValue("OperateRetryJobExecutionResponse.Code"));
		operateRetryJobExecutionResponse.setSuccess(_ctx.booleanValue("OperateRetryJobExecutionResponse.Success"));
		operateRetryJobExecutionResponse.setMessage(_ctx.stringValue("OperateRetryJobExecutionResponse.Message"));
	 
	 	return operateRetryJobExecutionResponse;
	}
}