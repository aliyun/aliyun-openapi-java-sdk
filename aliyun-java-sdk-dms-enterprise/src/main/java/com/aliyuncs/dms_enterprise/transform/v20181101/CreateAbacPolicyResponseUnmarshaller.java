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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import com.aliyuncs.dms_enterprise.model.v20181101.CreateAbacPolicyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAbacPolicyResponseUnmarshaller {

	public static CreateAbacPolicyResponse unmarshall(CreateAbacPolicyResponse createAbacPolicyResponse, UnmarshallerContext _ctx) {
		
		createAbacPolicyResponse.setRequestId(_ctx.stringValue("CreateAbacPolicyResponse.RequestId"));
		createAbacPolicyResponse.setSuccess(_ctx.booleanValue("CreateAbacPolicyResponse.Success"));
		createAbacPolicyResponse.setErrorCode(_ctx.stringValue("CreateAbacPolicyResponse.ErrorCode"));
		createAbacPolicyResponse.setErrorMessage(_ctx.stringValue("CreateAbacPolicyResponse.ErrorMessage"));
		createAbacPolicyResponse.setCreatePolicyResult(_ctx.longValue("CreateAbacPolicyResponse.CreatePolicyResult"));
	 
	 	return createAbacPolicyResponse;
	}
}