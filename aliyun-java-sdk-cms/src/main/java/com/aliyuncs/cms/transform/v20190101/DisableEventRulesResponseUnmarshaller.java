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

package com.aliyuncs.cms.transform.v20190101;

import com.aliyuncs.cms.model.v20190101.DisableEventRulesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DisableEventRulesResponseUnmarshaller {

	public static DisableEventRulesResponse unmarshall(DisableEventRulesResponse disableEventRulesResponse, UnmarshallerContext context) {
		
		disableEventRulesResponse.setRequestId(context.stringValue("DisableEventRulesResponse.RequestId"));
		disableEventRulesResponse.setSuccess(context.booleanValue("DisableEventRulesResponse.Success"));
		disableEventRulesResponse.setCode(context.stringValue("DisableEventRulesResponse.Code"));
		disableEventRulesResponse.setMessage(context.stringValue("DisableEventRulesResponse.Message"));
	 
	 	return disableEventRulesResponse;
	}
}