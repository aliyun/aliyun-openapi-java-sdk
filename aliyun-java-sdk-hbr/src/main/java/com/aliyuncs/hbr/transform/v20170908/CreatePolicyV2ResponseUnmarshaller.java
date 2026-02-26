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

package com.aliyuncs.hbr.transform.v20170908;

import com.aliyuncs.hbr.model.v20170908.CreatePolicyV2Response;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreatePolicyV2ResponseUnmarshaller {

	public static CreatePolicyV2Response unmarshall(CreatePolicyV2Response createPolicyV2Response, UnmarshallerContext _ctx) {
		
		createPolicyV2Response.setRequestId(_ctx.stringValue("CreatePolicyV2Response.RequestId"));
		createPolicyV2Response.setSuccess(_ctx.booleanValue("CreatePolicyV2Response.Success"));
		createPolicyV2Response.setCode(_ctx.stringValue("CreatePolicyV2Response.Code"));
		createPolicyV2Response.setMessage(_ctx.stringValue("CreatePolicyV2Response.Message"));
		createPolicyV2Response.setPolicyId(_ctx.stringValue("CreatePolicyV2Response.PolicyId"));
	 
	 	return createPolicyV2Response;
	}
}