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

package com.aliyuncs.eiam.transform.v20211201;

import com.aliyuncs.eiam.model.v20211201.CreateCustomPrivacyPolicyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateCustomPrivacyPolicyResponseUnmarshaller {

	public static CreateCustomPrivacyPolicyResponse unmarshall(CreateCustomPrivacyPolicyResponse createCustomPrivacyPolicyResponse, UnmarshallerContext _ctx) {
		
		createCustomPrivacyPolicyResponse.setRequestId(_ctx.stringValue("CreateCustomPrivacyPolicyResponse.RequestId"));
		createCustomPrivacyPolicyResponse.setCustomPrivacyPolicyId(_ctx.stringValue("CreateCustomPrivacyPolicyResponse.CustomPrivacyPolicyId"));
	 
	 	return createCustomPrivacyPolicyResponse;
	}
}