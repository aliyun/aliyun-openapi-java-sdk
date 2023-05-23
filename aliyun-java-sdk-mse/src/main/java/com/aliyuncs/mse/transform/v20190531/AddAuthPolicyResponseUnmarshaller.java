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

package com.aliyuncs.mse.transform.v20190531;

import com.aliyuncs.mse.model.v20190531.AddAuthPolicyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddAuthPolicyResponseUnmarshaller {

	public static AddAuthPolicyResponse unmarshall(AddAuthPolicyResponse addAuthPolicyResponse, UnmarshallerContext _ctx) {
		
		addAuthPolicyResponse.setRequestId(_ctx.stringValue("AddAuthPolicyResponse.RequestId"));
		addAuthPolicyResponse.setHttpStatusCode(_ctx.integerValue("AddAuthPolicyResponse.HttpStatusCode"));
		addAuthPolicyResponse.setMessage(_ctx.stringValue("AddAuthPolicyResponse.Message"));
		addAuthPolicyResponse.setData(_ctx.stringValue("AddAuthPolicyResponse.Data"));
		addAuthPolicyResponse.setCode(_ctx.integerValue("AddAuthPolicyResponse.Code"));
		addAuthPolicyResponse.setSuccess(_ctx.booleanValue("AddAuthPolicyResponse.Success"));
	 
	 	return addAuthPolicyResponse;
	}
}