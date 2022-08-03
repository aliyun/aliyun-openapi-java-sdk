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

package com.aliyuncs.iotcc.transform.v20210513;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iotcc.model.v20210513.CreateAuthorizationRulesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAuthorizationRulesResponseUnmarshaller {

	public static CreateAuthorizationRulesResponse unmarshall(CreateAuthorizationRulesResponse createAuthorizationRulesResponse, UnmarshallerContext _ctx) {
		
		createAuthorizationRulesResponse.setRequestId(_ctx.stringValue("CreateAuthorizationRulesResponse.RequestId"));

		List<String> authorizationRuleIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateAuthorizationRulesResponse.AuthorizationRuleIds.Length"); i++) {
			authorizationRuleIds.add(_ctx.stringValue("CreateAuthorizationRulesResponse.AuthorizationRuleIds["+ i +"]"));
		}
		createAuthorizationRulesResponse.setAuthorizationRuleIds(authorizationRuleIds);
	 
	 	return createAuthorizationRulesResponse;
	}
}