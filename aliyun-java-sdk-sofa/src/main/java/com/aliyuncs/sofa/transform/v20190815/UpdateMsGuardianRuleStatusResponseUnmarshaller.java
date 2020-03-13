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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.UpdateMsGuardianRuleStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateMsGuardianRuleStatusResponseUnmarshaller {

	public static UpdateMsGuardianRuleStatusResponse unmarshall(UpdateMsGuardianRuleStatusResponse updateMsGuardianRuleStatusResponse, UnmarshallerContext _ctx) {
		
		updateMsGuardianRuleStatusResponse.setRequestId(_ctx.stringValue("UpdateMsGuardianRuleStatusResponse.RequestId"));
		updateMsGuardianRuleStatusResponse.setResultCode(_ctx.stringValue("UpdateMsGuardianRuleStatusResponse.ResultCode"));
		updateMsGuardianRuleStatusResponse.setResultMessage(_ctx.stringValue("UpdateMsGuardianRuleStatusResponse.ResultMessage"));
		updateMsGuardianRuleStatusResponse.setResult(_ctx.longValue("UpdateMsGuardianRuleStatusResponse.Result"));
	 
	 	return updateMsGuardianRuleStatusResponse;
	}
}