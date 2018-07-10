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

package com.aliyuncs.cms.transform.v20180308;

import com.aliyuncs.cms.model.v20180308.DisableEventRuleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DisableEventRuleResponseUnmarshaller {

	public static DisableEventRuleResponse unmarshall(DisableEventRuleResponse disableEventRuleResponse, UnmarshallerContext context) {
		
		disableEventRuleResponse.setRequestId(context.stringValue("DisableEventRuleResponse.RequestId"));
		disableEventRuleResponse.setSuccess(context.booleanValue("DisableEventRuleResponse.Success"));
		disableEventRuleResponse.setCode(context.stringValue("DisableEventRuleResponse.Code"));
		disableEventRuleResponse.setMessage(context.stringValue("DisableEventRuleResponse.Message"));
	 
	 	return disableEventRuleResponse;
	}
}