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

package com.aliyuncs.sae.transform.v20190506;

import com.aliyuncs.sae.model.v20190506.DeleteTimerRuleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteTimerRuleResponseUnmarshaller {

	public static DeleteTimerRuleResponse unmarshall(DeleteTimerRuleResponse deleteTimerRuleResponse, UnmarshallerContext _ctx) {
		
		deleteTimerRuleResponse.setRequestId(_ctx.stringValue("DeleteTimerRuleResponse.RequestId"));
		deleteTimerRuleResponse.setCode(_ctx.stringValue("DeleteTimerRuleResponse.Code"));
		deleteTimerRuleResponse.setErrorCode(_ctx.stringValue("DeleteTimerRuleResponse.ErrorCode"));
		deleteTimerRuleResponse.setMessage(_ctx.stringValue("DeleteTimerRuleResponse.Message"));
		deleteTimerRuleResponse.setSuccess(_ctx.booleanValue("DeleteTimerRuleResponse.Success"));
		deleteTimerRuleResponse.setTraceId(_ctx.stringValue("DeleteTimerRuleResponse.TraceId"));
	 
	 	return deleteTimerRuleResponse;
	}
}