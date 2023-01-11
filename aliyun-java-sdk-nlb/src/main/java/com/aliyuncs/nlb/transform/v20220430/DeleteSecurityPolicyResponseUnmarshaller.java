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

package com.aliyuncs.nlb.transform.v20220430;

import com.aliyuncs.nlb.model.v20220430.DeleteSecurityPolicyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteSecurityPolicyResponseUnmarshaller {

	public static DeleteSecurityPolicyResponse unmarshall(DeleteSecurityPolicyResponse deleteSecurityPolicyResponse, UnmarshallerContext _ctx) {
		
		deleteSecurityPolicyResponse.setRequestId(_ctx.stringValue("DeleteSecurityPolicyResponse.RequestId"));
		deleteSecurityPolicyResponse.setSuccess(_ctx.booleanValue("DeleteSecurityPolicyResponse.Success"));
		deleteSecurityPolicyResponse.setCode(_ctx.stringValue("DeleteSecurityPolicyResponse.Code"));
		deleteSecurityPolicyResponse.setMessage(_ctx.stringValue("DeleteSecurityPolicyResponse.Message"));
		deleteSecurityPolicyResponse.setHttpStatusCode(_ctx.integerValue("DeleteSecurityPolicyResponse.HttpStatusCode"));
		deleteSecurityPolicyResponse.setDynamicCode(_ctx.stringValue("DeleteSecurityPolicyResponse.DynamicCode"));
		deleteSecurityPolicyResponse.setDynamicMessage(_ctx.stringValue("DeleteSecurityPolicyResponse.DynamicMessage"));
		deleteSecurityPolicyResponse.setJobId(_ctx.stringValue("DeleteSecurityPolicyResponse.JobId"));
	 
	 	return deleteSecurityPolicyResponse;
	}
}