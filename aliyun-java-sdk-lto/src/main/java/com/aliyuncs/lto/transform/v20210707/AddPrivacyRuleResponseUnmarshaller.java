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

package com.aliyuncs.lto.transform.v20210707;

import com.aliyuncs.lto.model.v20210707.AddPrivacyRuleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddPrivacyRuleResponseUnmarshaller {

	public static AddPrivacyRuleResponse unmarshall(AddPrivacyRuleResponse addPrivacyRuleResponse, UnmarshallerContext _ctx) {
		
		addPrivacyRuleResponse.setRequestId(_ctx.stringValue("AddPrivacyRuleResponse.RequestId"));
		addPrivacyRuleResponse.setCode(_ctx.stringValue("AddPrivacyRuleResponse.Code"));
		addPrivacyRuleResponse.setHttpStatusCode(_ctx.integerValue("AddPrivacyRuleResponse.HttpStatusCode"));
		addPrivacyRuleResponse.setMessage(_ctx.stringValue("AddPrivacyRuleResponse.Message"));
		addPrivacyRuleResponse.setSuccess(_ctx.booleanValue("AddPrivacyRuleResponse.Success"));
	 
	 	return addPrivacyRuleResponse;
	}
}