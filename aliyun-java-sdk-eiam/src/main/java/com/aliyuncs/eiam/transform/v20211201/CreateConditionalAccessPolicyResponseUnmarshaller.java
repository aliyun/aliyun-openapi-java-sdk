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

import com.aliyuncs.eiam.model.v20211201.CreateConditionalAccessPolicyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateConditionalAccessPolicyResponseUnmarshaller {

	public static CreateConditionalAccessPolicyResponse unmarshall(CreateConditionalAccessPolicyResponse createConditionalAccessPolicyResponse, UnmarshallerContext _ctx) {
		
		createConditionalAccessPolicyResponse.setRequestId(_ctx.stringValue("CreateConditionalAccessPolicyResponse.RequestId"));
		createConditionalAccessPolicyResponse.setConditionalAccessPolicyId(_ctx.stringValue("CreateConditionalAccessPolicyResponse.ConditionalAccessPolicyId"));
	 
	 	return createConditionalAccessPolicyResponse;
	}
}