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

package com.aliyuncs.ram.transform.v20150501;

import com.aliyuncs.ram.model.v20150501.GetPasswordPolicyResponse;
import com.aliyuncs.ram.model.v20150501.GetPasswordPolicyResponse.PasswordPolicy;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPasswordPolicyResponseUnmarshaller {

	public static GetPasswordPolicyResponse unmarshall(GetPasswordPolicyResponse getPasswordPolicyResponse, UnmarshallerContext _ctx) {
		
		getPasswordPolicyResponse.setRequestId(_ctx.stringValue("GetPasswordPolicyResponse.RequestId"));

		PasswordPolicy passwordPolicy = new PasswordPolicy();
		passwordPolicy.setRequireNumbers(_ctx.booleanValue("GetPasswordPolicyResponse.PasswordPolicy.RequireNumbers"));
		passwordPolicy.setRequireLowercaseCharacters(_ctx.booleanValue("GetPasswordPolicyResponse.PasswordPolicy.RequireLowercaseCharacters"));
		passwordPolicy.setHardExpiry(_ctx.booleanValue("GetPasswordPolicyResponse.PasswordPolicy.HardExpiry"));
		passwordPolicy.setPasswordReusePrevention(_ctx.integerValue("GetPasswordPolicyResponse.PasswordPolicy.PasswordReusePrevention"));
		passwordPolicy.setRequireSymbols(_ctx.booleanValue("GetPasswordPolicyResponse.PasswordPolicy.RequireSymbols"));
		passwordPolicy.setMaxPasswordAge(_ctx.integerValue("GetPasswordPolicyResponse.PasswordPolicy.MaxPasswordAge"));
		passwordPolicy.setMinimumPasswordLength(_ctx.integerValue("GetPasswordPolicyResponse.PasswordPolicy.MinimumPasswordLength"));
		passwordPolicy.setRequireUppercaseCharacters(_ctx.booleanValue("GetPasswordPolicyResponse.PasswordPolicy.RequireUppercaseCharacters"));
		passwordPolicy.setMaxLoginAttemps(_ctx.integerValue("GetPasswordPolicyResponse.PasswordPolicy.MaxLoginAttemps"));
		getPasswordPolicyResponse.setPasswordPolicy(passwordPolicy);
	 
	 	return getPasswordPolicyResponse;
	}
}