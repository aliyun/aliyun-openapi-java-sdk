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

package com.aliyuncs.tag.transform.v20180828;

import com.aliyuncs.tag.model.v20180828.CreatePolicyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreatePolicyResponseUnmarshaller {

	public static CreatePolicyResponse unmarshall(CreatePolicyResponse createPolicyResponse, UnmarshallerContext _ctx) {
		
		createPolicyResponse.setRequestId(_ctx.stringValue("CreatePolicyResponse.RequestId"));
		createPolicyResponse.setPolicyId(_ctx.stringValue("CreatePolicyResponse.PolicyId"));
	 
	 	return createPolicyResponse;
	}
}