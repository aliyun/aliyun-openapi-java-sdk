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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nlb.model.v20220430.ListSystemSecurityPolicyResponse;
import com.aliyuncs.nlb.model.v20220430.ListSystemSecurityPolicyResponse.SecurityPolicie;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSystemSecurityPolicyResponseUnmarshaller {

	public static ListSystemSecurityPolicyResponse unmarshall(ListSystemSecurityPolicyResponse listSystemSecurityPolicyResponse, UnmarshallerContext _ctx) {
		
		listSystemSecurityPolicyResponse.setRequestId(_ctx.stringValue("ListSystemSecurityPolicyResponse.RequestId"));
		listSystemSecurityPolicyResponse.setSuccess(_ctx.booleanValue("ListSystemSecurityPolicyResponse.Success"));
		listSystemSecurityPolicyResponse.setCode(_ctx.stringValue("ListSystemSecurityPolicyResponse.Code"));
		listSystemSecurityPolicyResponse.setMessage(_ctx.stringValue("ListSystemSecurityPolicyResponse.Message"));
		listSystemSecurityPolicyResponse.setHttpStatusCode(_ctx.integerValue("ListSystemSecurityPolicyResponse.HttpStatusCode"));
		listSystemSecurityPolicyResponse.setDynamicCode(_ctx.stringValue("ListSystemSecurityPolicyResponse.DynamicCode"));
		listSystemSecurityPolicyResponse.setDynamicMessage(_ctx.stringValue("ListSystemSecurityPolicyResponse.DynamicMessage"));

		List<SecurityPolicie> securityPolicies = new ArrayList<SecurityPolicie>();
		for (int i = 0; i < _ctx.lengthValue("ListSystemSecurityPolicyResponse.SecurityPolicies.Length"); i++) {
			SecurityPolicie securityPolicie = new SecurityPolicie();
			securityPolicie.setSecurityPolicyId(_ctx.stringValue("ListSystemSecurityPolicyResponse.SecurityPolicies["+ i +"].SecurityPolicyId"));
			securityPolicie.setSecurityPolicyName(_ctx.stringValue("ListSystemSecurityPolicyResponse.SecurityPolicies["+ i +"].SecurityPolicyName"));
			securityPolicie.setTlsVersion(_ctx.stringValue("ListSystemSecurityPolicyResponse.SecurityPolicies["+ i +"].TlsVersion"));
			securityPolicie.setCiphers(_ctx.stringValue("ListSystemSecurityPolicyResponse.SecurityPolicies["+ i +"].Ciphers"));

			securityPolicies.add(securityPolicie);
		}
		listSystemSecurityPolicyResponse.setSecurityPolicies(securityPolicies);
	 
	 	return listSystemSecurityPolicyResponse;
	}
}