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

import com.aliyuncs.mse.model.v20190531.RemoveAuthPolicyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveAuthPolicyResponseUnmarshaller {

	public static RemoveAuthPolicyResponse unmarshall(RemoveAuthPolicyResponse removeAuthPolicyResponse, UnmarshallerContext _ctx) {
		
		removeAuthPolicyResponse.setRequestId(_ctx.stringValue("RemoveAuthPolicyResponse.RequestId"));
		removeAuthPolicyResponse.setHttpStatusCode(_ctx.integerValue("RemoveAuthPolicyResponse.HttpStatusCode"));
		removeAuthPolicyResponse.setMessage(_ctx.stringValue("RemoveAuthPolicyResponse.Message"));
		removeAuthPolicyResponse.setData(_ctx.stringValue("RemoveAuthPolicyResponse.Data"));
		removeAuthPolicyResponse.setCode(_ctx.integerValue("RemoveAuthPolicyResponse.Code"));
		removeAuthPolicyResponse.setSuccess(_ctx.booleanValue("RemoveAuthPolicyResponse.Success"));
	 
	 	return removeAuthPolicyResponse;
	}
}