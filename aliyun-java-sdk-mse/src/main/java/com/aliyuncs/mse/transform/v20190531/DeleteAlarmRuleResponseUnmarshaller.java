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

package com.aliyuncs.mse.transform.v20190531;

import com.aliyuncs.mse.model.v20190531.DeleteAlarmRuleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteAlarmRuleResponseUnmarshaller {

	public static DeleteAlarmRuleResponse unmarshall(DeleteAlarmRuleResponse deleteAlarmRuleResponse, UnmarshallerContext _ctx) {
		
		deleteAlarmRuleResponse.setRequestId(_ctx.stringValue("DeleteAlarmRuleResponse.RequestId"));
		deleteAlarmRuleResponse.setSuccess(_ctx.booleanValue("DeleteAlarmRuleResponse.Success"));
		deleteAlarmRuleResponse.setMessage(_ctx.stringValue("DeleteAlarmRuleResponse.Message"));
		deleteAlarmRuleResponse.setErrorCode(_ctx.stringValue("DeleteAlarmRuleResponse.ErrorCode"));
		deleteAlarmRuleResponse.setHttpCode(_ctx.stringValue("DeleteAlarmRuleResponse.HttpCode"));
	 
	 	return deleteAlarmRuleResponse;
	}
}